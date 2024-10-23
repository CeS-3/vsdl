package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Gateway;
import java.util.ArrayList;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTGateway extends SMTObjFun<Gateway> {
  @Override
  public void setFunName() {
    this.funName = "network.gateway.internet";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Bool" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Gateway gw, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
    int k = 0;
    boolean _isInternet = gw.isInternet();
    if (_isInternet) {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          exprArr.add(k, 
            context.getEfactory().fcn(
              context.getEfactory().symbol("="), 
              context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), 
                context.getEfactory().symbol(name)), 
              context.getEfactory().symbol("true")));
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
