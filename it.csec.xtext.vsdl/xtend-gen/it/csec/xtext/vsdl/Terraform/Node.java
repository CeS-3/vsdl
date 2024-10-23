package it.csec.xtext.vsdl.Terraform;

import it.csec.xtext.VsdlResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.openstack4j.api.compute.ComputeService;
import org.openstack4j.api.compute.FlavorService;
import org.openstack4j.model.compute.Image;

@SuppressWarnings("all")
public class Node extends ScenElem {
  @Accessors
  private Flavor flavor;

  @Accessors
  private String flavorId;

  @Accessors
  private int OS;

  @Accessors
  private String OSid;

  @Accessors
  private ArrayList<Interface> interfaces;

  public Node(final String name) {
    this.setName(name);
    Flavor _flavor = new Flavor();
    this.flavor = _flavor;
    this.OS = 0;
    this.OSid = "";
    ArrayList<Interface> _arrayList = new ArrayList<Interface>();
    this.interfaces = _arrayList;
  }

  public CharSequence toTerraformString() {
    try {
      CharSequence _xblockexpression = null;
      {
        boolean flag = false;
        int i = 0;
        ComputeService cf = VsdlResources.getOSClient().compute();
        List<? extends org.openstack4j.model.compute.Flavor> fl = cf.flavors().list();
        while (((!flag) && (i < fl.size()))) {
          {
            org.openstack4j.model.compute.Flavor f = fl.get(i);
            if ((((f.getDisk() == (this.flavor.getDisk() / 1024)) && 
              (f.getRam() == this.flavor.getRam())) && 
              (f.getVcpus() == this.flavor.getVcpu()))) {
              flag = true;
              this.flavorId = f.getId();
            }
            i++;
          }
        }
        if ((!flag)) {
          String _scenario = this.getScenario();
          String _plus = (_scenario + "_");
          String _name = this.getName();
          String _plus_1 = (_plus + _name);
          String _plus_2 = (_plus_1 + "_");
          int _ttuStep = this.getTtuStep();
          String fname = (_plus_2 + Integer.valueOf(_ttuStep));
          i = 0;
          while (((!flag) && (i < fl.size()))) {
            {
              String _name_1 = fl.get(i).getName();
              boolean _equals = Objects.equals(_name_1, fname);
              if (_equals) {
                cf.flavors().delete(fl.get(i).getId());
                flag = true;
              }
              i++;
            }
          }
          FlavorService _flavors = cf.flavors();
          int _disk = this.flavor.getDisk();
          int _divide = (_disk / 1024);
          org.openstack4j.model.compute.Flavor nf = _flavors.create(fname, this.flavor.getRam(), this.flavor.getVcpu(), _divide, 0, 0, 1.0f, true);
          this.flavorId = nf.getId();
        }
        String OSname = VsdlResources.getOsImage(this.OS);
        List<? extends Image> il = cf.images().list();
        i = 0;
        flag = false;
        while (((!flag) && (i < il.size()))) {
          {
            String _name_1 = il.get(i).getName();
            boolean _equals = Objects.equals(_name_1, OSname);
            if (_equals) {
              this.OSid = il.get(i).getId();
              flag = true;
            }
            i++;
          }
        }
        boolean _equals = Objects.equals(this.OSid, "");
        if (_equals) {
          String _name_1 = this.getName();
          String _plus_3 = ("Invalid OS for node " + _name_1);
          throw new Exception(_plus_3);
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("resource \"openstack_compute_instance_v2\" \"hyhyhh\" {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("name = \"�name�\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("image_id = \"�OSid�\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("flavor_id = \"�flavorId�\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("# admin_pass = \"Enrico\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("�IF interfaces !== null�");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("�FOR  n : interfaces�");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("network {");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("uuid = \"${openstack_networking_network_v2.�n.networkid�.id}\"");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("�IF n.address !== \"\"�");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("fixed_ip_v4 = \"�n.address�\"");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("�ENDIF�");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("�ENDFOR�");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("�ENDIF�");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("�IF interfaces !== null && interfaces.empty�");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("network {");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("uuid = \"${openstack_networking_network_v2.bogus.id}\"");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("�ENDIF�");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _xblockexpression = _builder;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Pure
  public Flavor getFlavor() {
    return this.flavor;
  }

  public void setFlavor(final Flavor flavor) {
    this.flavor = flavor;
  }

  @Pure
  public String getFlavorId() {
    return this.flavorId;
  }

  public void setFlavorId(final String flavorId) {
    this.flavorId = flavorId;
  }

  @Pure
  public int getOS() {
    return this.OS;
  }

  public void setOS(final int OS) {
    this.OS = OS;
  }

  @Pure
  public String getOSid() {
    return this.OSid;
  }

  public void setOSid(final String OSid) {
    this.OSid = OSid;
  }

  @Pure
  public ArrayList<Interface> getInterfaces() {
    return this.interfaces;
  }

  public void setInterfaces(final ArrayList<Interface> interfaces) {
    this.interfaces = interfaces;
  }
}
