/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.NodeConstraint#getTriggerconstraint <em>Triggerconstraint</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.NodeConstraint#getNodeconstraint <em>Nodeconstraint</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.NodeConstraint#getSoftware <em>Software</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.NodeConstraint#getVulnID <em>Vuln ID</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getNodeConstraint()
 * @model
 * @generated
 */
public interface NodeConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggerconstraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggerconstraint</em>' containment reference.
   * @see #setTriggerconstraint(UpdateTriggerConstraint)
   * @see it.csec.xtext.vsdl.VsdlPackage#getNodeConstraint_Triggerconstraint()
   * @model containment="true"
   * @generated
   */
  UpdateTriggerConstraint getTriggerconstraint();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.NodeConstraint#getTriggerconstraint <em>Triggerconstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggerconstraint</em>' containment reference.
   * @see #getTriggerconstraint()
   * @generated
   */
  void setTriggerconstraint(UpdateTriggerConstraint value);

  /**
   * Returns the value of the '<em><b>Nodeconstraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodeconstraint</em>' containment reference.
   * @see #setNodeconstraint(NodeConstraint)
   * @see it.csec.xtext.vsdl.VsdlPackage#getNodeConstraint_Nodeconstraint()
   * @model containment="true"
   * @generated
   */
  NodeConstraint getNodeconstraint();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.NodeConstraint#getNodeconstraint <em>Nodeconstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nodeconstraint</em>' containment reference.
   * @see #getNodeconstraint()
   * @generated
   */
  void setNodeconstraint(NodeConstraint value);

  /**
   * Returns the value of the '<em><b>Software</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Software</em>' containment reference.
   * @see #setSoftware(SoftwareInstallation)
   * @see it.csec.xtext.vsdl.VsdlPackage#getNodeConstraint_Software()
   * @model containment="true"
   * @generated
   */
  SoftwareInstallation getSoftware();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.NodeConstraint#getSoftware <em>Software</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Software</em>' containment reference.
   * @see #getSoftware()
   * @generated
   */
  void setSoftware(SoftwareInstallation value);

  /**
   * Returns the value of the '<em><b>Vuln ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vuln ID</em>' attribute.
   * @see #setVulnID(String)
   * @see it.csec.xtext.vsdl.VsdlPackage#getNodeConstraint_VulnID()
   * @model
   * @generated
   */
  String getVulnID();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.NodeConstraint#getVulnID <em>Vuln ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vuln ID</em>' attribute.
   * @see #getVulnID()
   * @generated
   */
  void setVulnID(String value);

} // NodeConstraint