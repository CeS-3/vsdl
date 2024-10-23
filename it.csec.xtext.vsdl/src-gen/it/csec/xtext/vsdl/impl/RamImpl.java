/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.Node;
import it.csec.xtext.vsdl.Ram;
import it.csec.xtext.vsdl.RamSize;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.RamImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.RamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.RamImpl#isSameas <em>Sameas</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.RamImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RamImpl extends NodeConstraintImpl implements Ram
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected RamSize value;

  /**
   * The default value of the '{@link #isSameas() <em>Sameas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameas()
   * @generated
   * @ordered
   */
  protected static final boolean SAMEAS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSameas() <em>Sameas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSameas()
   * @generated
   * @ordered
   */
  protected boolean sameas = SAMEAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Node id;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RamImpl()
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
    return VsdlPackage.Literals.RAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.RAM__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RamSize getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(RamSize newValue, NotificationChain msgs)
  {
    RamSize oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.RAM__VALUE, oldValue, newValue);
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
  public void setValue(RamSize newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.RAM__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.RAM__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.RAM__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSameas()
  {
    return sameas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSameas(boolean newSameas)
  {
    boolean oldSameas = sameas;
    sameas = newSameas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.RAM__SAMEAS, oldSameas, sameas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node getId()
  {
    if (id != null && id.eIsProxy())
    {
      InternalEObject oldId = (InternalEObject)id;
      id = (Node)eResolveProxy(oldId);
      if (id != oldId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VsdlPackage.RAM__ID, oldId, id));
      }
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(Node newId)
  {
    Node oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.RAM__ID, oldId, id));
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
      case VsdlPackage.RAM__VALUE:
        return basicSetValue(null, msgs);
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
      case VsdlPackage.RAM__OP:
        return getOp();
      case VsdlPackage.RAM__VALUE:
        return getValue();
      case VsdlPackage.RAM__SAMEAS:
        return isSameas();
      case VsdlPackage.RAM__ID:
        if (resolve) return getId();
        return basicGetId();
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
      case VsdlPackage.RAM__OP:
        setOp((String)newValue);
        return;
      case VsdlPackage.RAM__VALUE:
        setValue((RamSize)newValue);
        return;
      case VsdlPackage.RAM__SAMEAS:
        setSameas((Boolean)newValue);
        return;
      case VsdlPackage.RAM__ID:
        setId((Node)newValue);
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
      case VsdlPackage.RAM__OP:
        setOp(OP_EDEFAULT);
        return;
      case VsdlPackage.RAM__VALUE:
        setValue((RamSize)null);
        return;
      case VsdlPackage.RAM__SAMEAS:
        setSameas(SAMEAS_EDEFAULT);
        return;
      case VsdlPackage.RAM__ID:
        setId((Node)null);
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
      case VsdlPackage.RAM__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case VsdlPackage.RAM__VALUE:
        return value != null;
      case VsdlPackage.RAM__SAMEAS:
        return sameas != SAMEAS_EDEFAULT;
      case VsdlPackage.RAM__ID:
        return id != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(", sameas: ");
    result.append(sameas);
    result.append(')');
    return result.toString();
  }

} //RamImpl
