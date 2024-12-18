/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Range A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.IPRangeA#getAddress <em>Address</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.IPRangeA#getBitmask <em>Bitmask</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getIPRangeA()
 * @model
 * @generated
 */
public interface IPRangeA extends EObject
{
  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(IPAddress)
   * @see it.csec.xtext.vsdl.VsdlPackage#getIPRangeA_Address()
   * @model containment="true"
   * @generated
   */
  IPAddress getAddress();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.IPRangeA#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(IPAddress value);

  /**
   * Returns the value of the '<em><b>Bitmask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitmask</em>' attribute.
   * @see #setBitmask(int)
   * @see it.csec.xtext.vsdl.VsdlPackage#getIPRangeA_Bitmask()
   * @model
   * @generated
   */
  int getBitmask();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.IPRangeA#getBitmask <em>Bitmask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bitmask</em>' attribute.
   * @see #getBitmask()
   * @generated
   */
  void setBitmask(int value);

} // IPRangeA
