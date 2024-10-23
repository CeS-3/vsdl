package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Switch;
import it.csec.xtext.vsdl.TimeExpr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTSwitch extends SMTObj<Switch> {
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Switch sw, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 2);
    List<IExpr.IFcnExpr> _nCopies = Collections.<IExpr.IFcnExpr>nCopies(_plus, null);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_nCopies);
    int k = 1;
    context.getFunctions().add(SMTObjUtils.generateFun(sw.getVariable(), "Int"));
    TimeExpr _texp = sw.getTexp();
    exprArr.set(
      0, 
      context.getEfactory().fcn(
        context.getEfactory().symbol("="), 
        context.getEfactory().symbol(sw.getVariable()), 
        new SMTTimeExpr(_texp).compile()));
    {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          exprArr.set(k, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(
              context.getEfactory().symbol("mod"), 
              context.getEfactory().fcn(
                context.getEfactory().symbol("div"), 
                context.getEfactory().numeral(i), 
                context.getEfactory().symbol(sw.getVariable())), 
              context.getEfactory().numeral(2)), 
            context.getEfactory().numeral(0)));
          k++;
        }
        int _i = i;
        int _ttuStep_1 = context.getTtuStep();
        i = (_i + _ttuStep_1);
        int _ttu_2 = context.getTtu();
        boolean _lessEqualsThan_1 = (i <= _ttu_2);
        _while = _lessEqualsThan_1;
      }
    }
    return exprArr;
  }
}
