package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.NodeConstraint;
import it.csec.xtext.vsdl.UpdateTriggerConstraint;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SMTNodeConstraint extends SMTConstraint<NodeConstraint> {
  @Override
  public boolean hasTriggerConstraint(final NodeConstraint constraint) {
    UpdateTriggerConstraint _triggerconstraint = constraint.getTriggerconstraint();
    return (_triggerconstraint != null);
  }

  @Override
  public EObject getTriggerConstraint(final NodeConstraint constraint) {
    return constraint.getTriggerconstraint();
  }

  @Override
  public EObject getConstraint(final NodeConstraint constraint) {
    return constraint.getNodeconstraint();
  }
}
