package it.csec.xtext.vsdl.Terraform;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Flavor {
  @Accessors
  private int vcpu;

  @Accessors
  private int ram;

  @Accessors
  private int disk;

  @Pure
  public int getVcpu() {
    return this.vcpu;
  }

  public void setVcpu(final int vcpu) {
    this.vcpu = vcpu;
  }

  @Pure
  public int getRam() {
    return this.ram;
  }

  public void setRam(final int ram) {
    this.ram = ram;
  }

  @Pure
  public int getDisk() {
    return this.disk;
  }

  public void setDisk(final int disk) {
    this.disk = disk;
  }
}
