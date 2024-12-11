package it.csec.xtext.vsdl.Terraform

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

class Router {	
	@Accessors
	private String name
	@Accessors
	private boolean internet
	@Accessors
	private ArrayList<Interface> interfaces
	@Accessors
	private ArrayList<Route> routes	
	@Accessors
	private ArrayList<Port> ports	
	
	new(String name) {
		this.name = name
		interfaces = new ArrayList<Interface>()
		routes = new ArrayList<Route>()
		ports = new ArrayList<Port>()
		internet = false
	}
	
	def toTerraformString() {
		val builder = new StringBuilder()
		
		// Router resource
		builder.append("resource \"openstack_networking_router_v2\" \"router_" + name +"\" {")
		builder.append("\n  name = \"router_" + name + "\"")
		if (internet) {
			builder.append("\n  external_gateway = \"e041461b-0fba-4153-b186-3f5e9e140b3d\"")
		}
		builder.append("\n}\n\n")
		
		// Router interfaces
		if (interfaces !== null && !interfaces.isEmpty()) {
			for (n : interfaces) {
				builder.append("resource \"openstack_networking_router_interface_v2\" \"router_" + name + "_interface_" + n.networkid +"\" {")
				builder.append("\n  router_id = \"${openstack_networking_router_v2.router_" + name +".id}\"")
				builder.append("\n  subnet_id = \"${openstack_networking_subnet_v2.subnet_" + n.networkid + ".id}\"")
				builder.append("\n}\n\n")
			}
		}
		
		// Ports
		if (ports !== null && !ports.isEmpty()) {
			for (p : ports) {
				builder.append("resource \"openstack_networking_port_v2\" \"port_" + p.networkid + " {")
				builder.append("\n  name = \"port_" + p.networkid + "\"")
				builder.append("\n  network_id = \"${openstack_networking_network_v2. + " + interfaces.get(0).networkid + ".id} \"")
				builder.append("\n  admin_state_up = \"true\"")
				builder.append("\n  fixed_ip {")
				builder.append("\n    subnet_id = \"${openstack_networking_subnet_v2.subnet_" + interfaces.get(0).networkid + ".id}\"")
				builder.append("\n    ip_address = \" "+ p.address + "\"")
				builder.append("\n  }\n}\n\n")
			}
		}
		
		// Routes
		if (routes !== null && !routes.isEmpty()) {
			for (r : routes) {
				builder.append("resource \"openstack_networking_router_route_v2\" \"router_route_" + r.name + " {")
				builder.append("\n  depends_on = [\"openstack_networking_port_v2.port_" + r.name + "\"]")
				builder.append("\n  router_id = \"${openstack_networking_router_v2.router_" + name + ".id}\"")
				builder.append("\n  destination_cidr = \"" + r.address + "/" + r.netmask + "\"")
				builder.append("\n  next_hop = \"" + r.gateway + "\"")
				builder.append("\n}\n\n")
			}
		}
		
		return builder.toString()
	}
}
