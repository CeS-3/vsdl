/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.Switch;
import it.csec.xtext.vsdl.TimeExpr;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.SwitchImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.SwitchImpl#getTexp <em>Texp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends UpdateTriggerConstraintImpl implements Switch
{
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTexp() <em>Texp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexp()
   * @generated
   * @ordered
   */
  protected TimeExpr texp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return VsdlPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.SWITCH__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeExpr getTexp()
  {
    return texp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTexp(TimeExpr newTexp, NotificationChain msgs)
  {
    TimeExpr oldTexp = texp;
    texp = newTexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.SWITCH__TEXP, oldTexp, newTexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexp(TimeExpr newTexp)
  {
    if (newTexp != texp)
    {
      NotificationChain msgs = null;
      if (texp != null)
        msgs = ((InternalEObject)texp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.SWITCH__TEXP, null, msgs);
      if (newTexp != null)
        msgs = ((InternalEObject)newTexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.SWITCH__TEXP, null, msgs);
      msgs = basicSetTexp(newTexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.SWITCH__TEXP, newTexp, newTexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VsdlPackage.SWITCH__TEXP:
        return basicSetTexp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VsdlPackage.SWITCH__VARIABLE:
        return getVariable();
      case VsdlPackage.SWITCH__TEXP:
        return getTexp();
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
      case VsdlPackage.SWITCH__VARIABLE:
        setVariable((String)newValue);
        return;
      case VsdlPackage.SWITCH__TEXP:
        setTexp((TimeExpr)newValue);
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
      case VsdlPackage.SWITCH__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case VsdlPackage.SWITCH__TEXP:
        setTexp((TimeExpr)null);
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
      case VsdlPackage.SWITCH__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case VsdlPackage.SWITCH__TEXP:
        return texp != null;
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(')');
    return result.toString();
  }

} //SwitchImpl
