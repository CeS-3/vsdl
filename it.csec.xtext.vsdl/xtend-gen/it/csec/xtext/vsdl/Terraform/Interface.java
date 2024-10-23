package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Interface {
  @Accessors
  private String networkid;

  @Accessors
  private String address;

  public Interface(final String id, final String address) {
    this.networkid = id;
    this.address = address;
  }

  @Pure
  public String getNetworkid() {
    return this.networkid;
  }

  public void setNetworkid(final String networkid) {
    this.networkid = networkid;
  }

  @Pure
  public String getAddress() {
    return this.address;
  }

  public void setAddress(final String address) {
    this.address = address;
  }
}
