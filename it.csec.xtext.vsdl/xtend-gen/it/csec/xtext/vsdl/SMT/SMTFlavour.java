package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.VsdlResources;
import it.csec.xtext.vsdl.Flavour;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.openstack4j.model.compute.Flavor;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTFlavour extends SMTObj<Flavour> {
  /**
   * def override public setFunName() {
   * funName = "node.flavour"
   * }
   * 
   * def override public setFunParams() {
   * funParams = #["Int", "Int", "Int"]
   * }
   */
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final Flavour flavour, final String name, final SMTContext context) {
    int _ttu = context.getTtu();
    int _ttuStep = context.getTtuStep();
    int _divide = (_ttu / _ttuStep);
    int _plus = (_divide + 1);
    ArrayList<IExpr.IFcnExpr> exprArr = new ArrayList<IExpr.IFcnExpr>(_plus);
    int k = 0;
    Flavor f = VsdlResources.getFlavor(flavour.getProfile());
    ArrayList<IExpr.IFcnExpr> flExpr = new ArrayList<IExpr.IFcnExpr>(3);
    if ((f != null)) {
      int i = 0;
      int _ttu_1 = context.getTtu();
      boolean _lessEqualsThan = (i <= _ttu_1);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          flExpr.add(0, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTCPU().funName), context.getEfactory().numeral(i), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(f.getVcpus())));
          int _disk = f.getDisk();
          int _multiply = (_disk * 1024);
          flExpr.add(1, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTDisk().funName), context.getEfactory().numeral(i), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(_multiply)));
          flExpr.add(1, context.getEfactory().fcn(
            context.getEfactory().symbol("="), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTRam().funName), context.getEfactory().numeral(i), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(f.getRam())));
          final ArrayList<IExpr.IFcnExpr> _converted_flExpr = (ArrayList<IExpr.IFcnExpr>)flExpr;
          exprArr.add(k, context.getEfactory().fcn(context.getEfactory().symbol("and"), ((IExpr[])Conversions.unwrapArray(_converted_flExpr, IExpr.class))));
          flExpr.clear();
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
      int i_1 = 0;
      int _ttu_2 = context.getTtu();
      boolean _lessEqualsThan_1 = (i_1 <= _ttu_2);
      boolean _while_1 = _lessEqualsThan_1;
      while (_while_1) {
        {
          flExpr.add(0, context.getEfactory().fcn(
            context.getEfactory().symbol(">"), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTCPU().funName), context.getEfactory().numeral(i_1), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(0)));
          flExpr.add(1, context.getEfactory().fcn(
            context.getEfactory().symbol(">"), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTDisk().funName), context.getEfactory().numeral(i_1), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(0)));
          flExpr.add(1, context.getEfactory().fcn(
            context.getEfactory().symbol(">"), 
            context.getEfactory().fcn(context.getEfactory().symbol(new SMTRam().funName), context.getEfactory().numeral(i_1), 
              context.getEfactory().symbol(name)), 
            context.getEfactory().numeral(0)));
          final ArrayList<IExpr.IFcnExpr> _converted_flExpr = (ArrayList<IExpr.IFcnExpr>)flExpr;
          exprArr.add(k, context.getEfactory().fcn(context.getEfactory().symbol("and"), ((IExpr[])Conversions.unwrapArray(_converted_flExpr, IExpr.class))));
          flExpr.clear();
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
    return exprArr;
  }
}
