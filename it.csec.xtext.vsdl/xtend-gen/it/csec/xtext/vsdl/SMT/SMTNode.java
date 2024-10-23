package it.csec.xtext.vsdl.SMT;

import it.csec.xtext.vsdl.Node;
import it.csec.xtext.vsdl.NodeConstraint;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class SMTNode extends SMTScenElem<NodeConstraint, Node> {
  @Override
  public EList<NodeConstraint> getConstraints(final Node elem) {
    return elem.getConstraints();
  }
}
