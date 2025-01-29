/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VCPU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.VCPU#getOp <em>Op</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.VCPU#getValue <em>Value</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.VCPU#isSameas <em>Sameas</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.VCPU#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.csec.xtext.vsdl.VsdlPackage#getVCPU()
 * @model
 * @generated
 */
public interface VCPU extends NodeConstraint
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.csec.xtext.vsdl.VsdlPackage#getVCPU_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.VCPU#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see it.csec.xtext.vsdl.VsdlPackage#getVCPU_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.VCPU#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Sameas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sameas</em>' attribute.
   * @see #setSameas(boolean)
   * @see it.csec.xtext.vsdl.VsdlPackage#getVCPU_Sameas()
   * @model
   * @generated
   */
  boolean isSameas();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.VCPU#isSameas <em>Sameas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sameas</em>' attribute.
   * @see #isSameas()
   * @generated
   */
  void setSameas(boolean value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(Node)
   * @see it.csec.xtext.vsdl.VsdlPackage#getVCPU_Id()
   * @model
   * @generated
   */
  Node getId();

  /**
   * Sets the value of the '{@link it.csec.xtext.vsdl.VCPU#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Node value);

} // VCPU
