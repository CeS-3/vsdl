/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.OSFamily;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.OSFamilyImpl#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSFamilyImpl extends NodeConstraintImpl implements OSFamily
{
  /**
   * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected static final String FAMILY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected String family = FAMILY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OSFamilyImpl()
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
    return VsdlPackage.Literals.OS_FAMILY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFamily()
  {
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFamily(String newFamily)
  {
    String oldFamily = family;
    family = newFamily;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.OS_FAMILY__FAMILY, oldFamily, family));
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
      case VsdlPackage.OS_FAMILY__FAMILY:
        return getFamily();
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
      case VsdlPackage.OS_FAMILY__FAMILY:
        setFamily((String)newValue);
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
      case VsdlPackage.OS_FAMILY__FAMILY:
        setFamily(FAMILY_EDEFAULT);
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
      case VsdlPackage.OS_FAMILY__FAMILY:
        return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
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
    result.append(" (family: ");
    result.append(family);
    result.append(')');
    return result.toString();
  }

} //OSFamilyImpl
