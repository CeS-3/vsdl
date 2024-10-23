/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.OSFamily#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getOSFamily()
 * @model
 * @generated
 */
public interface OSFamily extends NodeConstraint
{
  /**
   * Returns the value of the '<em><b>Family</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Family</em>' attribute.
   * @see #setFamily(String)
   * @see it.csec.xtext.vsdl.VsdlPackage#getOSFamily_Family()
   * @model
   * @generated
   */
  String getFamily();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.OSFamily#getFamily <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Family</em>' attribute.
   * @see #getFamily()
   * @generated
   */
  void setFamily(String value);

} // OSFamily
