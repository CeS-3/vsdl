package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Route {
  @Accessors
  private String address;

  @Accessors
  private int netmask;

  @Accessors
  private String gateway;

  @Accessors
  private String name;

  public Route(final String name, final String address, final int netmask, final String gateway) {
    this.name = name;
    this.address = address;
    this.netmask = netmask;
    this.gateway = gateway;
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
  public String getGateway() {
    return this.gateway;
  }

  public void setGateway(final String gateway) {
    this.gateway = gateway;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }
}
