package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.vsdl.OS;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTOS extends SMTObjFun<OS> {
  @Override
  public void setFunName() {
    this.funName = "node.os";
  }

  @Override
  public void setFunParams() {
    this.funParams = new String[] { "Int", "Int", "Int" };
  }

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final OS os, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
    int k = 0;
    int id = 0;
    try {
      String _version = os.getVersion();
      int _length = os.getVersion().length();
      int _minus = (_length - 1);
      id = VsdlResources.getOsId(_version.substring(1, _minus));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        id = 0;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          IExpr _xifexpression = null;
          if ((id < 0)) {
            _xifexpression = context.getEfactory().fcn(context.getEfactory().symbol("-"), context.getEfactory().numeral((-id)));
          } else {
            _xifexpression = context.getEfactory().numeral(id);
          }
          final IExpr valueExpr = _xifexpression;
          exprArr.add(k, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(context.getEfactory().symbol(this.funName), context.getEfactory().numeral(i), context.getEfactory().symbol(name)), valueExpr));
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
