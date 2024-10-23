package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Model;
import it.csec.xtext.vsdl.ScenElem;
import it.csec.xtext.vsdl.impl.NodeImpl;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.smtlib.ICommand;
import org.smtlib.IExpr;
import org.smtlib.SMT;
import org.smtlib.command.C_assert;
import org.smtlib.command.C_check_sat;
import org.smtlib.command.C_declare_fun;
import org.smtlib.command.C_exit;
import org.smtlib.command.C_get_value;
import org.smtlib.command.C_set_logic;
import org.smtlib.ext.C_get_model;
import org.smtlib.impl.Script;

@SuppressWarnings("all")
public class SMTModel extends SMTObj<Model> {
  private Model model;

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Model model, final String name, final SMTContext context) {
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>();
    EList<ScenElem> _elements = model.getElements();
    for (final ScenElem element : _elements) {
      exprArr.addAll(new SMTObjFactory(element).compile(element.getName(), context));
    }
    return exprArr;
  }

  public SMTModel() {
  }

  public SMTModel(final Model model) {
    this.model = model;
  }

  public Script compileScript(final SMTContext context) {
    IExpr.IFactory efactory = new SMT().smtConfig.exprFactory;
    ArrayList<C_get_value> getvalues = new ArrayList<C_get_value>();
    Script script = new Script();
    if ((this.model == null)) {
      return null;
    }
    List<ICommand> _commands = script.commands();
    IExpr.ISymbol _symbol = efactory.symbol(context.getLogic());
    C_set_logic _c_set_logic = new C_set_logic(_symbol);
    _commands.add(_c_set_logic);
    EList<ScenElem> _elements = this.model.getElements();
    for (final ScenElem element : _elements) {
      {
        context.getScenelems().add(element.getName());
        if ((element instanceof NodeImpl)) {
          context.getNodes().add(((NodeImpl)element).getName());
        } else {
          context.getNetworks().add(element.getName());
        }
        script.commands().add(SMTObjUtils.generateFun(element.getName(), "Int"));
        getvalues.addAll(SMTObjUtils.generateGetValues(element, context.getTtu(), context.getTtuStep()));
      }
    }
    script.commands().add(SMTObjUtils.generateFun("network.address", "Int", "Int", "Int"));
    script.commands().add(SMTObjUtils.generateFun("network.netmask", "Int", "Int", "Int"));
    ArrayList<String> _networks = context.getNetworks();
    for (final String n : _networks) {
      ArrayList<String> _scenelems = context.getScenelems();
      for (final String e : _scenelems) {
        {
          int i = 0;
          int _ttu = context.getTtu();
          boolean _lessEqualsThan = (i <= _ttu);
          boolean _while = _lessEqualsThan;
          while (_while) {
            getvalues.add(SMTObjUtils.generateGetValue(new SMTIP().funName, i, n, e));
            int _i = i;
            int _ttuStep = context.getTtuStep();
            i = (_i + _ttuStep);
            int _ttu_1 = context.getTtu();
            boolean _lessEqualsThan_1 = (i <= _ttu_1);
            _while = _lessEqualsThan_1;
          }
        }
      }
    }
    ArrayList<C_declare_fun> _generateElementsFun = SMTObjUtils.generateElementsFun();
    for (final C_declare_fun fun : _generateElementsFun) {
      script.commands().add(fun);
    }
    ArrayList<IExpr.IFcnExpr> exprArr = new SMTObjFactory(this.model).compile(this.model.getName(), context);
    ArrayList<C_declare_fun> _functions = context.getFunctions();
    for (final C_declare_fun fun_1 : _functions) {
      script.commands().add(fun_1);
    }
    for (final IExpr.IFcnExpr expr : exprArr) {
      List<ICommand> _commands_1 = script.commands();
      C_assert _c_assert = new C_assert(expr);
      _commands_1.add(_c_assert);
    }
    ArrayList<C_assert> _iassertions = context.getIassertions();
    for (final C_assert a : _iassertions) {
      script.commands().add(a);
    }
    List<ICommand> _commands_2 = script.commands();
    C_check_sat _c_check_sat = new C_check_sat();
    _commands_2.add(_c_check_sat);
    List<ICommand> _commands_3 = script.commands();
    C_get_model _c_get_model = new C_get_model();
    _commands_3.add(_c_get_model);
    for (final C_get_value getvalue : getvalues) {
      script.commands().add(getvalue);
    }
    List<ICommand> _commands_4 = script.commands();
    C_exit _c_exit = new C_exit();
    _commands_4.add(_c_exit);
    return script;
  }
}
