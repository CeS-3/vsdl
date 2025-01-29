/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.IP#getId <em>Id</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.IP#getOp <em>Op</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.IP#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getIP()
 * @model
 * @generated
 */
public interface IP extends NetworkConstraint
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(ScenElem)
   * @see it.csec.xtext.vsdl.VsdlPackage#getIP_Id()
   * @model
   * @generated
   */
  ScenElem getId();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.IP#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(ScenElem value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.csec.xtext.vsdl.VsdlPackage#getIP_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.IP#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(IPAddress)
   * @see it.csec.xtext.vsdl.VsdlPackage#getIP_Address()
   * @model containment="true"
   * @generated
   */
  IPAddress getAddress();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.IP#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(IPAddress value);

} // IP
