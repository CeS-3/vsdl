package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.UpdateTriggerConstraint;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.smtlib.IExpr;

@SuppressWarnings("all")
public class SMTUpdateTriggerConstraint extends SMTObj<UpdateTriggerConstraint> {
  @Override
  public ArrayList<IExpr.IFcnExpr> compile(final UpdateTriggerConstraint constraint, final String name, final SMTContext context) {
    return new SMTObjFactory(((EObject) constraint)).compile(name, context);
  }
}
