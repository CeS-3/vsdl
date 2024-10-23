package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.impl.SwitchImpl;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public abstract class SMTConstraint<T extends Object> extends SMTObj<T> {
  public abstract boolean hasTriggerConstraint(final T constraint);

  public abstract EObject getTriggerConstraint(final T constraint);

  public abstract EObject getConstraint(final T constraint);

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final T constraint, final String name, final SMTContext context) {
    boolean _hasTriggerConstraint = this.hasTriggerConstraint(constraint);
    boolean _not = (!_hasTriggerConstraint);
    if (_not) {
      return new SMTObjFactory(((EObject) constraint)).compile(name, context);
    } else {
      int k = 1;
      EObject _triggerConstraint = this.getTriggerConstraint(constraint);
      ArrayList<IExpr.IFcnExpr> constrArr = new SMTObjFactory(_triggerConstraint).compile(name, context);
      EObject _constraint = this.getConstraint(constraint);
      ArrayList<IExpr.IFcnExpr> exprArr = new SMTObjFactory(_constraint).compile(name, context);
      String symbol = "=>";
      EObject _triggerConstraint_1 = this.getTriggerConstraint(constraint);
      if ((_triggerConstraint_1 instanceof SwitchImpl)) {
        symbol = "=";
      }
      {
        int i = 0;
        int _ttu = context.getTtu();
        boolean _lessEqualsThan = (i <= _ttu);
        boolean _while = _lessEqualsThan;
        while (_while) {
          {
            constrArr.set(k, 
              context.getEfactory().fcn(
                context.getEfactory().symbol(symbol), 
                constrArr.get(k), 
                exprArr.get((k - 1))));
            k++;
          }
          int _i = i;
          int _ttuStep = context.getTtuStep();
          i = (_i + _ttuStep);
          int _ttu_1 = context.getTtu();
          boolean _lessEqualsThan_1 = (i <= _ttu_1);
          _while = _lessEqualsThan_1;
        }
      }
      return constrArr;
    }
  }
}
