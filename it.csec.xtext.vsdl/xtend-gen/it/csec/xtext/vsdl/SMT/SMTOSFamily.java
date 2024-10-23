package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.vsdl.OSFamily;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTOSFamily extends SMTObj<OSFamily> {
  /**
   * def override public setFunName() {
   * funName = "node.osfamily"
   * }
   * 
   * def override public setFunParams() {
   * funParams = #["Int", "Int", "Int"]
   * }
   */
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final OSFamily os, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
    int k = 0;
    String _family = os.getFamily();
    int _length = os.getFamily().length();
    int _minus = (_length - 1);
    List<Integer> fl = VsdlResources.getOssFamilyIds(_family.substring(1, _minus));
    int _size = fl.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          exprArr.add(k, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTOS().funName), context.getEfactory().numeral(i), context.getEfactory().symbol(name)), 
            context.getEfactory().numeral((fl.get(0)).intValue())));
          k++;
        }
        int _i = i;
        int _ttuStep_1 = context.getTtuStep();
        i = (_i + _ttuStep_1);
        int _ttu_2 = context.getTtu();
        boolean _lessEqualsThan_1 = (i <= _ttu_2);
        _while = _lessEqualsThan_1;
      }
    } else {
      int _size_1 = fl.size();
      ArrayList<IExpr.IFcnExpr> orExpr = new ArrayList<IExpr.IFcnExpr>(_size_1);
      {
        int i_1 = 0;
        int _ttu_2 = context.getTtu();
        boolean _lessEqualsThan_1 = (i_1 <= _ttu_2);
        boolean _while_1 = _lessEqualsThan_1;
        while (_while_1) {
          {
            int h = 0;
            for (final int f : fl) {
              {
                orExpr.add(h, context.getEfactory().fcn(
                  context.getEfactory().symbol("="), 
                  context.getEfactory().fcn(context.getEfactory().symbol(new SMTOS().funName), context.getEfactory().numeral(i_1), 
                    context.getEfactory().symbol(name)), 
                  context.getEfactory().numeral(f)));
                h++;
              }
            }
            final ArrayList<IExpr.IFcnExpr> _converted_orExpr = (ArrayList<IExpr.IFcnExpr>)orExpr;
            exprArr.add(k, context.getEfactory().fcn(context.getEfactory().symbol("or"), ((IExpr[])Conversions.unwrapArray(_converted_orExpr, IExpr.class))));
            orExpr.clear();
            k++;
          }
          int _i = i_1;
          int _ttuStep_1 = context.getTtuStep();
          i_1 = (_i + _ttuStep_1);
          int _ttu_3 = context.getTtu();
          boolean _lessEqualsThan_2 = (i_1 <= _ttu_3);
          _while_1 = _lessEqualsThan_2;
        }
      }
    }
    return exprArr;
  }
}
