package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("resource \"openstack_networking_network_v2\" \"");
    String _name = this.getName();
    String _plus = (_builder.toString() + _name);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\" {");
    _builder_1.newLine();
    _builder_1.append("\t  ");
    _builder_1.append("name = \"");
    String _plus_1 = (_plus + _builder_1);
    String _name_1 = this.getName();
    String _plus_2 = (_plus_1 + _name_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\"");
    _builder_2.newLine();
    _builder_2.append("\t  ");
    _builder_2.append("admin_state_up = \"true\"");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("resource \"openstack_networking_subnet_v2\" \"subnet_");
    String _plus_3 = (_plus_2 + _builder_2);
    String _name_2 = this.getName();
    String _plus_4 = (_plus_3 + _name_2);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\" {");
    _builder_3.newLine();
    _builder_3.append("\t  ");
    _builder_3.append("name = \"subnet_");
    String _plus_5 = (_plus_4 + _builder_3);
    String _name_3 = this.getName();
    String _plus_6 = (_plus_5 + _name_3);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("\"");
    _builder_4.newLine();
    _builder_4.append("\t  ");
    _builder_4.append("network_id = \"${openstack_networking_network_v2. ");
    String _plus_7 = (_plus_6 + _builder_4);
    String _name_4 = this.getName();
    String _plus_8 = (_plus_7 + _name_4);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(".id}\"");
    _builder_5.newLine();
    _builder_5.append("\t  ");
    _builder_5.append("cidr = \"");
    String _plus_9 = (_plus_8 + _builder_5);
    String _plus_10 = (_plus_9 + this.address);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append("/");
    String _plus_11 = (_plus_10 + _builder_6);
    String _plus_12 = (_plus_11 + Integer.valueOf(this.netmask));
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append("\"");
    _builder_7.newLine();
    _builder_7.append("\t  ");
    _builder_7.append("ip_version = 4");
    _builder_7.newLine();
    _builder_7.append("\t  ");
    _builder_7.append("dns_nameservers = [\"8.8.8.8\", \"8.8.4.4\"]");
    _builder_7.newLine();
    _builder_7.append("\t  ");
    _builder_7.append("# enable_dhcp = \"true\"");
    _builder_7.newLine();
    _builder_7.append("\t  ");
    _builder_7.append("gateway_ip = \"");
    String _plus_13 = (_plus_12 + _builder_7);
    String _plus_14 = (_plus_13 + this.gwaddress);
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append("\"\t ");
    _builder_8.newLine();
    _builder_8.append("\t");
    _builder_8.append("} ");
    _builder_8.newLine();
    return (_plus_14 + _builder_8);
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
