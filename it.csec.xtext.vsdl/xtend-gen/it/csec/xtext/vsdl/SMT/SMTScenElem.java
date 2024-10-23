package it.csec.xtext.vsdl.SMT;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public abstract class SMTScenElem<S extends Object, T extends Object> extends SMTObj<T> {
  public abstract EList<S> getConstraints(final T elem);

  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final T elem, final String name, final SMTContext context) {
    ArrayList<IExpr.IFcnExpr> exprArrList = new ArrayList<IExpr.IFcnExpr>();
    EList<S> _constraints = this.getConstraints(elem);
    for (final S constraint : _constraints) {
      exprArrList.addAll(new SMTObjFactory(((EObject) constraint)).compile(name, context));
    }
    return exprArrList;
  }
}
