package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Network;
import it.csec.xtext.vsdl.Node;
import it.csec.xtext.vsdl.ScenElem;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.smtlib.IExpr;
import org.smtlib.ISort;
import org.smtlib.SMT;
import org.smtlib.command.C_declare_fun;
import org.smtlib.command.C_get_value;

@SuppressWarnings("all")
public class SMTObjUtils {
  public static C_declare_fun generateFun(final String name, final String... args) {
    SMT smt = new SMT();
    IExpr.IFactory efactory = smt.smtConfig.exprFactory;
    LinkedList<ISort> inputParam = new LinkedList<ISort>();
    for (int i = 0; (i < (((List<String>)Conversions.doWrapArray(args)).size() - 1)); i++) {
      inputParam.add(smt.smtConfig.sortFactory.createSortExpression(efactory.symbol(args[i])));
    }
    IExpr.ISymbol _symbol = efactory.symbol(name);
    int _size = ((List<String>)Conversions.doWrapArray(args)).size();
    int _minus = (_size - 1);
    ISort.IApplication _createSortExpression = smt.smtConfig.sortFactory.createSortExpression(efactory.symbol(args[_minus]));
    return new C_declare_fun(_symbol, inputParam, _createSortExpression);
  }

  public static ArrayList<C_declare_fun> generateElementsFun() {
    ArrayList<C_declare_fun> functions = new ArrayList<C_declare_fun>();
    functions.add(new SMTCPU().getFun());
    functions.add(new SMTDisk().getFun());
    functions.add(new SMTOS().getFun());
    functions.add(new SMTRam().getFun());
    functions.add(new SMTGateway().getFun());
    functions.add(new SMTIP().getFun());
    return functions;
  }

  public static C_get_value generateGetValue(final String objFunName, final int time, final String... args) {
    IExpr.IFactory efactory = new SMT().smtConfig.exprFactory;
    LinkedList<IExpr> param = new LinkedList<IExpr>();
    ArrayList<IExpr> e = new ArrayList<IExpr>();
    e.add(efactory.numeral(time));
    int i = 0;
    for (final String a : args) {
      {
        e.add(efactory.symbol(args[i]));
        i++;
      }
    }
    IExpr.IFcnExpr f = efactory.fcn(efactory.symbol(objFunName), e);
    param.add(f);
    return new C_get_value(param);
  }

  public static ArrayList<C_get_value> generateGetValues(final ScenElem elem, final int ttu, final int ttuStep) {
    ArrayList<C_get_value> getvalues = new ArrayList<C_get_value>();
    {
      int i = 0;
      boolean _while = (i <= ttu);
      while (_while) {
        if ((elem instanceof Node)) {
          getvalues.add(SMTObjUtils.generateGetValue(new SMTCPU().funName, i, ((Node)elem).getName()));
          getvalues.add(SMTObjUtils.generateGetValue(new SMTDisk().funName, i, ((Node)elem).getName()));
          getvalues.add(SMTObjUtils.generateGetValue(new SMTOS().funName, i, ((Node)elem).getName()));
          getvalues.add(SMTObjUtils.generateGetValue(new SMTRam().funName, i, ((Node)elem).getName()));
        }
        int _i = i;
        i = (_i + ttuStep);
        _while = (i <= ttu);
      }
    }
    {
      int i = 0;
      boolean _while = (i <= ttu);
      while (_while) {
        if ((elem instanceof Network)) {
          getvalues.add(SMTObjUtils.generateGetValue(new SMTGateway().funName, i, ((Network)elem).getName()));
          getvalues.add(SMTObjUtils.generateGetValue("network.address", i, ((Network)elem).getName()));
          getvalues.add(SMTObjUtils.generateGetValue("network.netmask", i, ((Network)elem).getName()));
        }
        int _i = i;
        i = (_i + ttuStep);
        _while = (i <= ttu);
      }
    }
    return getvalues;
  }
}
