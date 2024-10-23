/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.IPAddress;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPAddressImpl#getOctet1 <em>Octet1</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPAddressImpl#getOctet2 <em>Octet2</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPAddressImpl#getOctet3 <em>Octet3</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPAddressImpl#getOctet4 <em>Octet4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPAddressImpl extends MinimalEObjectImpl.Container implements IPAddress
{
  /**
   * The default value of the '{@link #getOctet1() <em>Octet1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet1()
   * @generated
   * @ordered
   */
  protected static final int OCTET1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOctet1() <em>Octet1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet1()
   * @generated
   * @ordered
   */
  protected int octet1 = OCTET1_EDEFAULT;

  /**
   * The default value of the '{@link #getOctet2() <em>Octet2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet2()
   * @generated
   * @ordered
   */
  protected static final int OCTET2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOctet2() <em>Octet2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet2()
   * @generated
   * @ordered
   */
  protected int octet2 = OCTET2_EDEFAULT;

  /**
   * The default value of the '{@link #getOctet3() <em>Octet3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet3()
   * @generated
   * @ordered
   */
  protected static final int OCTET3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOctet3() <em>Octet3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet3()
   * @generated
   * @ordered
   */
  protected int octet3 = OCTET3_EDEFAULT;

  /**
   * The default value of the '{@link #getOctet4() <em>Octet4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet4()
   * @generated
   * @ordered
   */
  protected static final int OCTET4_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOctet4() <em>Octet4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctet4()
   * @generated
   * @ordered
   */
  protected int octet4 = OCTET4_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IPAddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VsdlPackage.Literals.IP_ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOctet1()
  {
    return octet1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOctet1(int newOctet1)
  {
    int oldOctet1 = octet1;
    octet1 = newOctet1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP_ADDRESS__OCTET1, oldOctet1, octet1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOctet2()
  {
    return octet2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOctet2(int newOctet2)
  {
    int oldOctet2 = octet2;
    octet2 = newOctet2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP_ADDRESS__OCTET2, oldOctet2, octet2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOctet3()
  {
    return octet3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOctet3(int newOctet3)
  {
    int oldOctet3 = octet3;
    octet3 = newOctet3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP_ADDRESS__OCTET3, oldOctet3, octet3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOctet4()
  {
    return octet4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOctet4(int newOctet4)
  {
    int oldOctet4 = octet4;
    octet4 = newOctet4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP_ADDRESS__OCTET4, oldOctet4, octet4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VsdlPackage.IP_ADDRESS__OCTET1:
        return getOctet1();
      case VsdlPackage.IP_ADDRESS__OCTET2:
        return getOctet2();
      case VsdlPackage.IP_ADDRESS__OCTET3:
        return getOctet3();
      case VsdlPackage.IP_ADDRESS__OCTET4:
        return getOctet4();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VsdlPackage.IP_ADDRESS__OCTET1:
        setOctet1((Integer)newValue);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET2:
        setOctet2((Integer)newValue);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET3:
        setOctet3((Integer)newValue);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET4:
        setOctet4((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VsdlPackage.IP_ADDRESS__OCTET1:
        setOctet1(OCTET1_EDEFAULT);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET2:
        setOctet2(OCTET2_EDEFAULT);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET3:
        setOctet3(OCTET3_EDEFAULT);
        return;
      case VsdlPackage.IP_ADDRESS__OCTET4:
        setOctet4(OCTET4_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VsdlPackage.IP_ADDRESS__OCTET1:
        return octet1 != OCTET1_EDEFAULT;
      case VsdlPackage.IP_ADDRESS__OCTET2:
        return octet2 != OCTET2_EDEFAULT;
      case VsdlPackage.IP_ADDRESS__OCTET3:
        return octet3 != OCTET3_EDEFAULT;
      case VsdlPackage.IP_ADDRESS__OCTET4:
        return octet4 != OCTET4_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (octet1: ");
    result.append(octet1);
    result.append(", octet2: ");
    result.append(octet2);
    result.append(", octet3: ");
    result.append(octet3);
    result.append(", octet4: ");
    result.append(octet4);
    result.append(')');
    return result.toString();
  }

} //IPAddressImpl
