package it.csec.xtext.vsdl.Terraform;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.generator.VsdlConsole;
import java.io.ByteArrayInputStream;
import java.util.Hashtable;
import java.util.Objects;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Scenario {
  @Accessors
  private Hashtable<String, Hashtable<Integer, Node>> nodes;

  @Accessors
  private Hashtable<String, Hashtable<Integer, Network>> networks;

  @Accessors
  private VsdlConsole console;

  @Accessors
  private String name;

  @Accessors
  private int ttu;

  public Scenario(final String name) {
    Hashtable<String, Hashtable<Integer, Node>> _hashtable = new Hashtable<String, Hashtable<Integer, Node>>();
    this.nodes = _hashtable;
    Hashtable<String, Hashtable<Integer, Network>> _hashtable_1 = new Hashtable<String, Hashtable<Integer, Network>>();
    this.networks = _hashtable_1;
    this.name = name;
    VsdlConsole _vsdlConsole = new VsdlConsole((name + " Terraform Script"));
    this.console = _vsdlConsole;
    this.ttu = 0;
  }

  public void createResource(final String name, final int ttuStep, final String content) {
    try {
      IProject project = ResourcesPlugin.getWorkspace().getRoot().getProjects()[0];
      IFolder folder = project.getFolder(((("src-gen/" + this.name) + "_") + Integer.valueOf(ttuStep)));
      boolean _exists = folder.exists();
      boolean _not = (!_exists);
      if (_not) {
        folder.create(true, true, null);
      }
      IFile file = folder.getFile(name);
      byte[] _bytes = content.toString().getBytes();
      ByteArrayInputStream bis = new ByteArrayInputStream(_bytes);
      boolean _exists_1 = file.exists();
      if (_exists_1) {
        file.delete(true, true, null);
      }
      file.create(bis, IResource.NONE, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String doTerraformProvider() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("provider \"openstack\" {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("user_name  = \"");
    String _oSuser = VsdlResources.getOSuser();
    String _plus = (_builder.toString() + _oSuser);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\"");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("tenant_name = \"");
    String _plus_1 = (_plus + _builder_1);
    String _oStenant = VsdlResources.getOStenant();
    String _plus_2 = (_plus_1 + _oStenant);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\"");
    _builder_2.newLine();
    _builder_2.append("        ");
    _builder_2.append("password  = \"");
    String _plus_3 = (_plus_2 + _builder_2);
    String _oSpassword = VsdlResources.getOSpassword();
    String _plus_4 = (_plus_3 + _oSpassword);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\"");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("auth_url  = \"");
    String _plus_5 = (_plus_4 + _builder_3);
    String _oSurl = VsdlResources.getOSurl();
    String _plus_6 = (_plus_5 + _oSurl);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("\"");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("}");
    _builder_4.newLine();
    return (_plus_6 + _builder_4);
  }

  public CharSequence doTerraformBogusNet() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("resource \"openstack_networking_network_v2\" \"bogus\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("name = \"bogus\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("admin_state_up = \"true\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("resource \"openstack_networking_subnet_v2\" \"subnet_bogus\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("name = \"subnet_bogus\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("network_id = \"${openstack_networking_network_v2.bogus.id}\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("cidr = \"240.0.0.0/16\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ip_version = 4");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public Boolean setElementFromValue(final String value) {
    try {
      Boolean _xblockexpression = null;
      {
        if (((!Objects.equals(value.substring(0, 3), "(((")) && (!Objects.equals(value.substring((value.length() - 2)), "))")))) {
          throw new Exception("Invalid value format");
        }
        String fname = value.substring(3, value.indexOf(" "));
        int _length = fname.length();
        int _plus = (_length + 4);
        int _length_1 = fname.length();
        int _plus_1 = (_length_1 + 4);
        String ttuStep = value.substring(_plus, value.indexOf(" ", _plus_1));
        int _length_2 = fname.length();
        int _length_3 = ttuStep.length();
        int _plus_2 = (_length_2 + _length_3);
        int _plus_3 = (_plus_2 + 5);
        int _length_4 = fname.length();
        int _length_5 = ttuStep.length();
        int _plus_4 = (_length_4 + _length_5);
        int _plus_5 = (_plus_4 + 5);
        String params = value.substring(_plus_3, 
          value.indexOf(")", _plus_5));
        int _indexOf = value.indexOf(")");
        int _plus_6 = (_indexOf + 2);
        int _length_6 = value.length();
        int _minus = (_length_6 - 2);
        String retvalue = value.substring(_plus_6, _minus);
        int _parseInt = Integer.parseInt(ttuStep);
        boolean _greaterThan = (_parseInt > this.ttu);
        if (_greaterThan) {
          this.ttu = Integer.parseInt(ttuStep);
        }
        Boolean _xifexpression = null;
        String _substring = fname.substring(0, fname.indexOf("."));
        boolean _equals = Objects.equals(_substring, "node");
        if (_equals) {
          boolean _equalsIgnoreCase = retvalue.equalsIgnoreCase("false");
          if (_equalsIgnoreCase) {
            retvalue = "0";
          }
          boolean _equalsIgnoreCase_1 = retvalue.equalsIgnoreCase("true");
          if (_equalsIgnoreCase_1) {
            retvalue = "1";
          }
          int _indexOf_1 = fname.indexOf(".");
          int _plus_7 = (_indexOf_1 + 1);
          this.NodeValuesFactory(fname.substring(_plus_7), Integer.parseInt(ttuStep), Integer.parseInt(retvalue), params.split(" "));
        } else {
          Boolean _xblockexpression_1 = null;
          {
            boolean _equalsIgnoreCase_2 = retvalue.equalsIgnoreCase("false");
            if (_equalsIgnoreCase_2) {
              retvalue = "0";
            }
            boolean _equalsIgnoreCase_3 = retvalue.equalsIgnoreCase("true");
            if (_equalsIgnoreCase_3) {
              retvalue = "1";
            }
            int _indexOf_2 = fname.indexOf(".");
            int _plus_8 = (_indexOf_2 + 1);
            _xblockexpression_1 = this.NetworkValuesFactory(fname.substring(_plus_8), Integer.parseInt(ttuStep), Long.parseUnsignedLong(retvalue), params.split(" "));
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public void addNode(final String name, final String scenario, final int ttuStep) {
    boolean _containsKey = this.nodes.containsKey(name);
    boolean _not = (!_containsKey);
    if (_not) {
      Hashtable<Integer, Node> _hashtable = new Hashtable<Integer, Node>();
      this.nodes.put(name, _hashtable);
    }
    boolean _containsKey_1 = this.nodes.get(name).containsKey(Integer.valueOf(ttuStep));
    boolean _not_1 = (!_containsKey_1);
    if (_not_1) {
      Hashtable<Integer, Node> _get = this.nodes.get(name);
      Node _node = new Node(name);
      _get.put(Integer.valueOf(ttuStep), _node);
      Node _get_1 = this.nodes.get(name).get(Integer.valueOf(ttuStep));
      _get_1.setScenario(scenario);
      Node _get_2 = this.nodes.get(name).get(Integer.valueOf(ttuStep));
      _get_2.setTtuStep(ttuStep);
    }
  }

  public void addNetwork(final String name, final String scenario, final int ttuStep) {
    boolean _containsKey = this.networks.containsKey(name);
    boolean _not = (!_containsKey);
    if (_not) {
      Hashtable<Integer, Network> _hashtable = new Hashtable<Integer, Network>();
      this.networks.put(name, _hashtable);
    }
    boolean _containsKey_1 = this.networks.get(name).containsKey(Integer.valueOf(ttuStep));
    boolean _not_1 = (!_containsKey_1);
    if (_not_1) {
      Hashtable<Integer, Network> _get = this.networks.get(name);
      Network _network = new Network(name);
      _get.put(Integer.valueOf(ttuStep), _network);
      Network _get_1 = this.networks.get(name).get(Integer.valueOf(ttuStep));
      _get_1.setScenario(scenario);
      Network _get_2 = this.networks.get(name).get(Integer.valueOf(ttuStep));
      _get_2.setTtuStep(ttuStep);
    }
  }

  public void NodeValuesFactory(final String fname, final int ttuStep, final int retvalue, final String... params) {
    this.addNode(params[0], this.name, ttuStep);
    if (fname != null) {
      switch (fname) {
        case "vcpu":
          Flavor _flavor = this.nodes.get(params[0]).get(Integer.valueOf(ttuStep)).getFlavor();
          _flavor.setVcpu(retvalue);
          break;
        case "disk":
          Flavor _flavor_1 = this.nodes.get(params[0]).get(Integer.valueOf(ttuStep)).getFlavor();
          _flavor_1.setDisk(retvalue);
          break;
        case "ram":
          Flavor _flavor_2 = this.nodes.get(params[0]).get(Integer.valueOf(ttuStep)).getFlavor();
          _flavor_2.setRam(retvalue);
          break;
        case "os":
          Node _get = this.nodes.get(params[0]).get(Integer.valueOf(ttuStep));
          _get.setOS(retvalue);
          break;
      }
    }
  }

  public Boolean NetworkValuesFactory(final String fname, final int ttuStep, final long retvalue, final String... params) {
    Boolean _xblockexpression = null;
    {
      this.addNetwork(params[0], this.name, ttuStep);
      Boolean _switchResult = null;
      if (fname != null) {
        switch (fname) {
          case "address":
            Network _get = this.networks.get(params[0]).get(Integer.valueOf(ttuStep));
            _get.setAddress(Network.long2ip(retvalue));
            break;
          case "netmask":
            Network _get_1 = this.networks.get(params[0]).get(Integer.valueOf(ttuStep));
            _get_1.setNetmask(((int) retvalue));
            break;
          case "node.address":
            Boolean _xifexpression = null;
            if ((retvalue != 0)) {
              Boolean _xifexpression_1 = null;
              String _get_2 = params[0];
              Object _get_3 = params[1];
              boolean _equals = Objects.equals(_get_2, _get_3);
              if (_equals) {
                Network _get_4 = this.networks.get(params[0]).get(Integer.valueOf(ttuStep));
                _get_4.setGwaddress(Network.long2ip(retvalue));
              } else {
                Boolean _xifexpression_2 = null;
                boolean _containsKey = this.nodes.containsKey(params[1]);
                if (_containsKey) {
                  boolean _xblockexpression_1 = false;
                  {
                    MessageConsoleStream _stream = this.console.getStream();
                    String _get_5 = params[0];
                    String _plus = ("NETWORK: " + _get_5);
                    String _plus_1 = (_plus + ",");
                    String _plus_2 = (_plus_1 + Integer.valueOf(ttuStep));
                    String _plus_3 = (_plus_2 + ",");
                    String _get_6 = params[1];
                    String _plus_4 = (_plus_3 + _get_6);
                    String _plus_5 = (_plus_4 + ",");
                    String _plus_6 = (_plus_5 + Long.valueOf(retvalue));
                    _stream.println(_plus_6);
                    String _get_7 = params[0];
                    String _long2ip = Network.long2ip(retvalue);
                    Interface _interface = new Interface(_get_7, _long2ip);
                    _xblockexpression_1 = this.nodes.get(params[1]).get(Integer.valueOf(ttuStep)).getInterfaces().add(_interface);
                  }
                  _xifexpression_2 = Boolean.valueOf(_xblockexpression_1);
                } else {
                  Boolean _xifexpression_3 = null;
                  boolean _containsKey_1 = this.networks.containsKey(params[1]);
                  if (_containsKey_1) {
                    boolean _xblockexpression_2 = false;
                    {
                      String _get_5 = params[1];
                      String _long2ip = Network.long2ip(retvalue);
                      Port _port = new Port(_get_5, _long2ip);
                      this.networks.get(params[0]).get(Integer.valueOf(ttuStep)).getRouter().getPorts().add(_port);
                      String _name = this.networks.get(params[1]).get(Integer.valueOf(ttuStep)).getName();
                      String _address = this.networks.get(params[1]).get(Integer.valueOf(ttuStep)).getAddress();
                      int _netmask = this.networks.get(params[1]).get(Integer.valueOf(ttuStep)).getNetmask();
                      String _long2ip_1 = Network.long2ip(retvalue);
                      Route _route = new Route(_name, _address, _netmask, _long2ip_1);
                      this.networks.get(params[0]).get(Integer.valueOf(ttuStep)).getRouter().getRoutes().add(_route);
                      String _get_6 = params[0];
                      String _long2ip_2 = Network.long2ip(retvalue);
                      Interface _interface = new Interface(_get_6, _long2ip_2);
                      _xblockexpression_2 = this.networks.get(params[1]).get(Integer.valueOf(ttuStep)).getRouter().getInterfaces().add(_interface);
                    }
                    _xifexpression_3 = Boolean.valueOf(_xblockexpression_2);
                  } else {
                    _xifexpression_3 = null;
                  }
                  _xifexpression_2 = _xifexpression_3;
                }
                _xifexpression_1 = _xifexpression_2;
              }
              _xifexpression = _xifexpression_1;
            }
            _switchResult = _xifexpression;
            break;
          case "gateway.internet":
            Router _router = this.networks.get(params[0]).get(Integer.valueOf(ttuStep)).getRouter();
            _router.setInternet((retvalue > 0));
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }

  @Pure
  public Hashtable<String, Hashtable<Integer, Node>> getNodes() {
    return this.nodes;
  }

  public void setNodes(final Hashtable<String, Hashtable<Integer, Node>> nodes) {
    this.nodes = nodes;
  }

  @Pure
  public Hashtable<String, Hashtable<Integer, Network>> getNetworks() {
    return this.networks;
  }

  public void setNetworks(final Hashtable<String, Hashtable<Integer, Network>> networks) {
    this.networks = networks;
  }

  @Pure
  public VsdlConsole getConsole() {
    return this.console;
  }

  public void setConsole(final VsdlConsole console) {
    this.console = console;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public int getTtu() {
    return this.ttu;
  }

  public void setTtu(final int ttu) {
    this.ttu = ttu;
  }
}
