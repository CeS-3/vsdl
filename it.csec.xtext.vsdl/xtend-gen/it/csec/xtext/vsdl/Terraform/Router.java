package it.csec.xtext.vsdl.Terraform;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

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

  public String toTerraformString() {
    final StringBuilder builder = new StringBuilder();
    builder.append((("resource \"openstack_networking_router_v2\" \"router_" + this.name) + "\" {"));
    builder.append((("\n  name = \"router_" + this.name) + "\""));
    if (this.internet) {
      builder.append("\n  external_gateway = \"e041461b-0fba-4153-b186-3f5e9e140b3d\"");
    }
    builder.append("\n}\n\n");
    if (((this.interfaces != null) && (!this.interfaces.isEmpty()))) {
      for (final Interface n : this.interfaces) {
        {
          String _networkid = n.getNetworkid();
          String _plus = ((("resource \"openstack_networking_router_interface_v2\" \"router_" + this.name) + "_interface_") + _networkid);
          String _plus_1 = (_plus + "\" {");
          builder.append(_plus_1);
          builder.append((("\n  router_id = \"${openstack_networking_router_v2.router_" + this.name) + ".id}\""));
          String _networkid_1 = n.getNetworkid();
          String _plus_2 = ("\n  subnet_id = \"${openstack_networking_subnet_v2.subnet_" + _networkid_1);
          String _plus_3 = (_plus_2 + ".id}\"");
          builder.append(_plus_3);
          builder.append("\n}\n\n");
        }
      }
    }
    if (((this.ports != null) && (!this.ports.isEmpty()))) {
      for (final Port p : this.ports) {
        {
          String _networkid = p.getNetworkid();
          String _plus = ("resource \"openstack_networking_port_v2\" \"port_" + _networkid);
          String _plus_1 = (_plus + " {");
          builder.append(_plus_1);
          String _networkid_1 = p.getNetworkid();
          String _plus_2 = ("\n  name = \"port_" + _networkid_1);
          String _plus_3 = (_plus_2 + "\"");
          builder.append(_plus_3);
          String _networkid_2 = this.interfaces.get(0).getNetworkid();
          String _plus_4 = ("\n  network_id = \"${openstack_networking_network_v2. + " + _networkid_2);
          String _plus_5 = (_plus_4 + ".id} \"");
          builder.append(_plus_5);
          builder.append("\n  admin_state_up = \"true\"");
          builder.append("\n  fixed_ip {");
          String _networkid_3 = this.interfaces.get(0).getNetworkid();
          String _plus_6 = ("\n    subnet_id = \"${openstack_networking_subnet_v2.subnet_" + _networkid_3);
          String _plus_7 = (_plus_6 + ".id}\"");
          builder.append(_plus_7);
          String _address = p.getAddress();
          String _plus_8 = ("\n    ip_address = \" " + _address);
          String _plus_9 = (_plus_8 + "\"");
          builder.append(_plus_9);
          builder.append("\n  }\n}\n\n");
        }
      }
    }
    if (((this.routes != null) && (!this.routes.isEmpty()))) {
      for (final Route r : this.routes) {
        {
          String _name = r.getName();
          String _plus = ("resource \"openstack_networking_router_route_v2\" \"router_route_" + _name);
          String _plus_1 = (_plus + " {");
          builder.append(_plus_1);
          String _name_1 = r.getName();
          String _plus_2 = ("\n  depends_on = [\"openstack_networking_port_v2.port_" + _name_1);
          String _plus_3 = (_plus_2 + "\"]");
          builder.append(_plus_3);
          builder.append((("\n  router_id = \"${openstack_networking_router_v2.router_" + this.name) + ".id}\""));
          String _address = r.getAddress();
          String _plus_4 = ("\n  destination_cidr = \"" + _address);
          String _plus_5 = (_plus_4 + "/");
          int _netmask = r.getNetmask();
          String _plus_6 = (_plus_5 + Integer.valueOf(_netmask));
          String _plus_7 = (_plus_6 + "\"");
          builder.append(_plus_7);
          String _gateway = r.getGateway();
          String _plus_8 = ("\n  next_hop = \"" + _gateway);
          String _plus_9 = (_plus_8 + "\"");
          builder.append(_plus_9);
          builder.append("\n}\n\n");
        }
      }
    }
    return builder.toString();
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
