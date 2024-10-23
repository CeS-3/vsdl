package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlToken;
import it.csec.xtext.vsdl.At;
import it.csec.xtext.vsdl.TimeExpr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTAt extends SMTObj<At> {
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final At at, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 2);
    List<IExpr.IFcnExpr> _nCopies = Collections.<IExpr.IFcnExpr>nCopies(_plus, null);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_nCopies);
    int k = 1;
    String symbol = ">=";
    String _op = at.getOp();
    boolean _equals = Objects.equals(_op, VsdlToken.ATMOST);
    if (_equals) {
      symbol = "<=";
    }
    context.addFunction(SMTObjUtils.generateFun(at.getVariable(), "Int"));
    TimeExpr _texp = at.getTexp();
    exprArr.set(
      0, 
      context.getEfactory().fcn(
        context.getEfactory().symbol(symbol), 
        context.getEfactory().symbol(at.getVariable()), 
        new SMTTimeExpr(_texp).compile()));
    {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          exprArr.set(k, 
            context.getEfactory().fcn(
              context.getEfactory().symbol("<="), 
              context.getEfactory().symbol(at.getVariable()), 
              context.getEfactory().numeral(i)));
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
