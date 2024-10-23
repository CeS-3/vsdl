package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.NetworkConstraint;
import it.csec.xtext.vsdl.UpdateTriggerConstraint;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class SMTNetworkConstraint extends SMTConstraint<NetworkConstraint> {
  @Override
  public boolean hasTriggerConstraint(final NetworkConstraint constraint) {
    UpdateTriggerConstraint _networktriggerconstraint = constraint.getNetworktriggerconstraint();
    return (_networktriggerconstraint != null);
  }

  @Override
  public EObject getTriggerConstraint(final NetworkConstraint constraint) {
    return constraint.getNetworktriggerconstraint();
  }

  @Override
  public EObject getConstraint(final NetworkConstraint constraint) {
    return constraint.getNetworkconstraint();
  }
}
