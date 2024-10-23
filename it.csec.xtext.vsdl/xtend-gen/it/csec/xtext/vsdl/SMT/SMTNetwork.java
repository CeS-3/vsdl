package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Network;
import it.csec.xtext.vsdl.NetworkConstraint;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.smtlib.IExpr;
import org.smtlib.command.C_assert;

@SuppressWarnings("all")
public class SMTNetwork extends SMTScenElem<NetworkConstraint, Network> {
  public static Object getIAssertions(final String name, final SMTContext context) {
    for (int i = 0; (i < context.getScenelems().size()); i++) {
      for (int k = i; (k < context.getScenelems().size()); k++) {
        String _get = context.getScenelems().get(i);
        String _get_1 = context.getScenelems().get(k);
        boolean _notEquals = (!Objects.equals(_get, _get_1));
        if (_notEquals) {
          int h = 0;
          int _ttu = context.getTtu();
          boolean _lessEqualsThan = (h <= _ttu);
          boolean _while = _lessEqualsThan;
          while (_while) {
            {
              IExpr.IFcnExpr n1 = context.getEfactory().fcn(
                context.getEfactory().symbol("network.node.address"), 
                context.getEfactory().numeral(h), 
                context.getEfactory().symbol(name), 
                context.getEfactory().symbol(context.getScenelems().get(i)));
              IExpr.IFcnExpr n2 = context.getEfactory().fcn(
                context.getEfactory().symbol("network.node.address"), 
                context.getEfactory().numeral(h), 
                context.getEfactory().symbol(name), 
                context.getEfactory().symbol(context.getScenelems().get(k)));
              IExpr.IFcnExpr _fcn = context.getEfactory().fcn(
                context.getEfactory().symbol("=>"), 
                context.getEfactory().fcn(
                  context.getEfactory().symbol("="), n1, n2), 
                context.getEfactory().fcn(
                  context.getEfactory().symbol("="), n1, 
                  context.getEfactory().numeral(0)));
              C_assert _c_assert = new C_assert(_fcn);
              context.getIassertions().add(_c_assert);
            }
            int _h = h;
            int _ttuStep = context.getTtuStep();
            h = (_h + _ttuStep);
            int _ttu_1 = context.getTtu();
            boolean _lessEqualsThan_1 = (h <= _ttu_1);
            _while = _lessEqualsThan_1;
          }
        }
      }
    }
    return null;
  }

  @Override
  public EList<NetworkConstraint> getConstraints(final Network elem) {
    return elem.getConstraints();
  }
}
