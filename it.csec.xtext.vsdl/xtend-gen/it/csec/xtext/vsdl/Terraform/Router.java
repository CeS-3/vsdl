package it.csec.xtext.vsdl.Terraform;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * per ogni rete creo un router
 * 
 * resource "openstack_networking_router_v2" "router_netX" {
 * name = "router_netX"
 * // se gateway.internet � true:
 * external_gateway = "f67f0d72-0ddf-11e4-9d95-e1f29f417e2f"
 * // il valore � "cablato" preso da "neutron net-show FLOATING_IP_POOL", valore id
 * }
 * 
 * ci vuole una interfaccia fissa sulla rete (default gw della rete)
 * spero questa prenda SEMPRE gateway settato nella rete di default
 * resource "openstack_networking_router_interface_v2" "router_interface_1" {
 * router_id = "${openstack_networking_router_v2.[questo router].id}"
 * subnet_id = "${openstack_networking_subnet_v2.[questa sottorete].id}"
 * }
 * 
 * se dichiaro che "node.address" in cui il nodo � una rete (rete collegata ad una rete) ho come parametro l'ip
 * dichiaro una porta sulla rete
 * 
 * resource "openstack_networking_port_v2" "port_[questarete]_[nomealtrarete]" {
 * name = "port_[questarete]_[nomealtrarete]"
 * network_id = "${openstack_networking_network_v2.[questarete].id}"
 * admin_state_up = "true"
 * fixed_ip {
 * subnet_id = "${openstack_networking_network_v2.[questasottorete].id}"
 * ip_address = "parametro ip"
 * }
 * 
 * interfaccia sul router dell'altra rete
 * 
 * resource "openstack_networking_router_interface_v2" "router_interface_[questarete]" {
 * router_id = "${openstack_networking_router_v2.router_[altrarete].id}"
 * subnet_id = "${openstack_networking_subnet_v2.subnet_[questarete].id}"
 * port_id = "${port_[questarete]_[nomealtrarete]}"
 * }
 * 
 * una route [altrarete] -> "parametro ip" sul router dell'altra rete
 * resource "openstack_networking_router_route_v2" "router_route_altrarete_questarete" {
 * depends_on = ["openstack_networking_router_interface_v2."]
 * router_id = "${openstack_networking_router_v2.router_1.id}"
 * destination_cidr = "10.0.1.0/24"
 * next_hop = "192.168.199.254"
 * }
 * 
 * }
 */
@SuppressWarnings("all")
public class Router {
  @Accessors
  private String name;

  @Accessors
  private boolean internet;

  @Accessors
  private ArrayList<Interface> interfaces;

  @Accessors
  private ArrayList<Route> routes;

  @Accessors
  private ArrayList<Port> ports;

  public Router(final String name) {
    this.name = name;
    ArrayList<Interface> _arrayList = new ArrayList<Interface>();
    this.interfaces = _arrayList;
    ArrayList<Route> _arrayList_1 = new ArrayList<Route>();
    this.routes = _arrayList_1;
    ArrayList<Port> _arrayList_2 = new ArrayList<Port>();
    this.ports = _arrayList_2;
    this.internet = false;
  }

  public CharSequence toTerraformString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("resource \"openstack_networking_router_v2\" \"router_�name�\" {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name = \"router_�name�\"");
    _builder.newLine();
    _builder.append("�IF internet�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("external_gateway = \"e041461b-0fba-4153-b186-3f5e9e140b3d\"");
    _builder.newLine();
    _builder.append("�ENDIF� ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("�IF interfaces !== null�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("resource \"openstack_networking_router_interface_v2\" \"router_�name�_interface_�interfaces.get(0).networkid�\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("router_id = \"${openstack_networking_router_v2.router_�name�.id}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("subnet_id = \"${openstack_networking_subnet_v2.subnet_�interfaces.get(0).networkid�.id}\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("�FOR n : interfaces�");
    _builder.newLine();
    _builder.append("�IF n.networkid != interfaces.get(0).networkid�");
    _builder.newLine();
    _builder.append("resource \"openstack_networking_router_interface_v2\" \"router_�name�_interface_�n.networkid�\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("router_id = \"${openstack_networking_router_v2.router_�name�.id}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("# subnet_id = \"${openstack_networking_subnet_v2.subnet_�n.networkid�.id}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("port_id = \"${openstack_networking_port_v2.port_�interfaces.get(0).networkid�.id}\"");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("�IF ports !== null�");
    _builder.newLine();
    _builder.append("�FOR p : ports�");
    _builder.newLine();
    _builder.append("resource \"openstack_networking_port_v2\" \"port_�p.networkid�\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("name = \"port_�p.networkid�\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("network_id = \"${openstack_networking_network_v2.�interfaces.get(0).networkid�.id}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("admin_state_up = \"true\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fixed_ip {");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("subnet_id = \"${openstack_networking_subnet_v2.subnet_�interfaces.get(0).networkid�.id}\"");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("ip_address = \"�p.address�\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("�IF routes !== null�\t\t  ");
    _builder.newLine();
    _builder.append("�FOR r : routes�");
    _builder.newLine();
    _builder.append("resource \"openstack_networking_router_route_v2\" \"router_route_�r.name�\" {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# depends_on = interfaccia? ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("depends_on = [\"openstack_networking_port_v2.port_�r.name�\"]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("router_id = \"${openstack_networking_router_v2.router_�name�.id}\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("destination_cidr = \"�r.address�/�r.netmask�\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("next_hop = \"�r.gateway�\"");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("�ENDFOR�\t\t");
    _builder.newLine();
    _builder.append("�ENDIF�");
    _builder.newLine();
    return _builder;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public boolean isInternet() {
    return this.internet;
  }

  public void setInternet(final boolean internet) {
    this.internet = internet;
  }

  @Pure
  public ArrayList<Interface> getInterfaces() {
    return this.interfaces;
  }

  public void setInterfaces(final ArrayList<Interface> interfaces) {
    this.interfaces = interfaces;
  }

  @Pure
  public ArrayList<Route> getRoutes() {
    return this.routes;
  }

  public void setRoutes(final ArrayList<Route> routes) {
    this.routes = routes;
  }

  @Pure
  public ArrayList<Port> getPorts() {
    return this.ports;
  }

  public void setPorts(final ArrayList<Port> ports) {
    this.ports = ports;
  }
}
