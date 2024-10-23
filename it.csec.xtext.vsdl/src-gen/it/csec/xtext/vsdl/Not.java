/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.Not#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends NodeConstraint, NetworkConstraint, UpdateTriggerConstraint
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(EObject)
   * @see it.csec.xtext.vsdl.VsdlPackage#getNot_Constraint()
   * @model containment="true"
   * @generated
   */
  EObject getConstraint();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.Not#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(EObject value);

} // Not