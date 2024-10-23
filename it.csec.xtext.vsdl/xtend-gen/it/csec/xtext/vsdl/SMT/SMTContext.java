package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.generator.VsdlConsole;
import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.smtlib.IExpr;
import org.smtlib.SMT;
import org.smtlib.command.C_assert;
import org.smtlib.command.C_declare_fun;
import org.smtlib.impl.Script;

@SuppressWarnings("all")
public class SMTContext {
  @Accessors
  private SMT smt;

  @Accessors
  private IExpr.IFactory efactory;

  @Accessors
  private Script script;

  @Accessors
  private int ttu;

  @Accessors
  private int ttuStep;

  @Accessors
  private ArrayList<String> scenelems;

  @Accessors
  private ArrayList<String> nodes;

  @Accessors
  private ArrayList<String> networks;

  @Accessors
  private ArrayList<C_declare_fun> functions;

  @Accessors
  private ArrayList<C_assert> iassertions;

  @Accessors
  private VsdlConsole console;

  @Accessors
  private String logic = "QF_AUFLIA";

  public SMTContext(final String name, final int ttu, final int ttuStep, final VsdlConsole console) {
    SMT _sMT = new SMT();
    this.smt = _sMT;
    this.efactory = this.smt.smtConfig.exprFactory;
    Script _script = new Script();
    this.script = _script;
    this.ttu = ttu;
    this.ttuStep = ttuStep;
    ArrayList<C_declare_fun> _arrayList = new ArrayList<C_declare_fun>();
    this.functions = _arrayList;
    ArrayList<C_assert> _arrayList_1 = new ArrayList<C_assert>();
    this.iassertions = _arrayList_1;
    ArrayList<String> _arrayList_2 = new ArrayList<String>();
    this.scenelems = _arrayList_2;
    ArrayList<String> _arrayList_3 = new ArrayList<String>();
    this.nodes = _arrayList_3;
    ArrayList<String> _arrayList_4 = new ArrayList<String>();
    this.networks = _arrayList_4;
    if ((console != null)) {
      this.console = console;
    } else {
      VsdlConsole _vsdlConsole = new VsdlConsole(name);
      this.console = _vsdlConsole;
    }
  }

  public boolean addFunction(final C_declare_fun f) {
    boolean _xblockexpression = false;
    {
      int i = 0;
      boolean flag = false;
      while (((!flag) && (i < this.functions.size()))) {
        {
          flag = f.symbol().toString().equals(this.functions.get(i).symbol().toString());
          i++;
        }
      }
      boolean _xifexpression = false;
      if ((!flag)) {
        _xifexpression = this.functions.add(f);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  @Pure
  public SMT getSmt() {
    return this.smt;
  }

  public void setSmt(final SMT smt) {
    this.smt = smt;
  }

  @Pure
  public IExpr.IFactory getEfactory() {
    return this.efactory;
  }

  public void setEfactory(final IExpr.IFactory efactory) {
    this.efactory = efactory;
  }

  @Pure
  public Script getScript() {
    return this.script;
  }

  public void setScript(final Script script) {
    this.script = script;
  }

  @Pure
  public int getTtu() {
    return this.ttu;
  }

  public void setTtu(final int ttu) {
    this.ttu = ttu;
  }

  @Pure
  public int getTtuStep() {
    return this.ttuStep;
  }

  public void setTtuStep(final int ttuStep) {
    this.ttuStep = ttuStep;
  }

  @Pure
  public ArrayList<String> getScenelems() {
    return this.scenelems;
  }

  public void setScenelems(final ArrayList<String> scenelems) {
    this.scenelems = scenelems;
  }

  @Pure
  public ArrayList<String> getNodes() {
    return this.nodes;
  }

  public void setNodes(final ArrayList<String> nodes) {
    this.nodes = nodes;
  }

  @Pure
  public ArrayList<String> getNetworks() {
    return this.networks;
  }

  public void setNetworks(final ArrayList<String> networks) {
    this.networks = networks;
  }

  @Pure
  public ArrayList<C_declare_fun> getFunctions() {
    return this.functions;
  }

  public void setFunctions(final ArrayList<C_declare_fun> functions) {
    this.functions = functions;
  }

  @Pure
  public ArrayList<C_assert> getIassertions() {
    return this.iassertions;
  }

  public void setIassertions(final ArrayList<C_assert> iassertions) {
    this.iassertions = iassertions;
  }

  @Pure
  public VsdlConsole getConsole() {
    return this.console;
  }

  public void setConsole(final VsdlConsole console) {
    this.console = console;
  }

  @Pure
  public String getLogic() {
    return this.logic;
  }

  public void setLogic(final String logic) {
    this.logic = logic;
  }
}
