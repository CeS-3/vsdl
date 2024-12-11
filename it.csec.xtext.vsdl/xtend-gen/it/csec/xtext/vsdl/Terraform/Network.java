package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Network extends ScenElem {
  @Accessors
  private String address;

  @Accessors
  private int netmask;

  @Accessors
  private String gwaddress;

  @Accessors
  private boolean internet;

  @Accessors
  private Router router;

  public Network(final String name) {
    this.setName(name);
    this.address = "";
    this.gwaddress = "";
    this.netmask = 0;
    this.internet = false;
    Router _router = new Router(("rt_" + name));
    this.router = _router;
    Interface _interface = new Interface(name, "");
    this.router.getInterfaces().add(0, _interface);
  }

  public static String long2ip(final long ip) {
    String o4 = Long.toString((ip & 0xff));
    String o3 = Long.toString(((ip >> 8) & 0xff));
    String o2 = Long.toString(((ip >> 16) & 0xff));
    String o1 = Long.toString(((ip >> 24) & 0xff));
    return ((((((o1 + ".") + o2) + ".") + o3) + ".") + o4);
  }

  public String toTerraformString() {
    final StringBuilder builder = new StringBuilder();
    String _name = this.getName();
    String _plus = ("resource \"openstack_networking_network_v2\" \"" + _name);
    String _plus_1 = (_plus + "\" {");
    builder.append(_plus_1);
    String _name_1 = this.getName();
    String _plus_2 = ("\n  name = \"" + _name_1);
    String _plus_3 = (_plus_2 + "\"");
    builder.append(_plus_3);
    builder.append("\n  admin_state_up = \"true\"");
    builder.append("\n}\n\n");
    String _name_2 = this.getName();
    String _plus_4 = ("resource \"openstack_networking_subnet_v2\" \"subnet_" + _name_2);
    String _plus_5 = (_plus_4 + "\" {");
    builder.append(_plus_5);
    String _name_3 = this.getName();
    String _plus_6 = ("\n  name = \"subnet_" + _name_3);
    String _plus_7 = (_plus_6 + "\"");
    builder.append(_plus_7);
    String _name_4 = this.getName();
    String _plus_8 = ("\n  network_id = \"${openstack_networking_network_v2." + _name_4);
    String _plus_9 = (_plus_8 + ".id}\"");
    builder.append(_plus_9);
    builder.append((((("\n  cidr = \"" + this.address) + "/") + Integer.valueOf(this.netmask)) + "\""));
    builder.append("\n  ip_version = 4");
    builder.append("\n  dns_nameservers = [\"8.8.8.8\", \"8.8.4.4\"]");
    if ((this.gwaddress != "")) {
      builder.append((("\n  gateway_ip = \"" + this.gwaddress) + "\""));
    }
    builder.append("\n}\n\n");
    builder.append(this.router.toTerraformString());
    return builder.toString();
  }

  @Pure
  public String getAddress() {
    return this.address;
  }

  public void setAddress(final String address) {
    this.address = address;
  }

  @Pure
  public int getNetmask() {
    return this.netmask;
  }

  public void setNetmask(final int netmask) {
    this.netmask = netmask;
  }

  @Pure
  public String getGwaddress() {
    return this.gwaddress;
  }

  public void setGwaddress(final String gwaddress) {
    this.gwaddress = gwaddress;
  }

  @Pure
  public boolean isInternet() {
    return this.internet;
  }

  public void setInternet(final boolean internet) {
    this.internet = internet;
  }

  @Pure
  public Router getRouter() {
    return this.router;
  }

  public void setRouter(final Router router) {
    this.router = router;
  }
}
