/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.IPAddress;
import it.csec.xtext.vsdl.NetworkConstraint;
import it.csec.xtext.vsdl.Node;
import it.csec.xtext.vsdl.UpdateTriggerConstraint;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.NetworkConstraintImpl#getNetworktriggerconstraint <em>Networktriggerconstraint</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.NetworkConstraintImpl#getNetworkconstraint <em>Networkconstraint</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.NetworkConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.NetworkConstraintImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.NetworkConstraintImpl#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkConstraintImpl extends MinimalEObjectImpl.Container implements NetworkConstraint
{
  /**
   * The cached value of the '{@link #getNetworktriggerconstraint() <em>Networktriggerconstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworktriggerconstraint()
   * @generated
   * @ordered
   */
  protected UpdateTriggerConstraint networktriggerconstraint;

  /**
   * The cached value of the '{@link #getNetworkconstraint() <em>Networkconstraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkconstraint()
   * @generated
   * @ordered
   */
  protected NetworkConstraint networkconstraint;

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
   * The cached value of the '{@link #getIp() <em>Ip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected IPAddress ip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetworkConstraintImpl()
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
    return VsdlPackage.Literals.NETWORK_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateTriggerConstraint getNetworktriggerconstraint()
  {
    return networktriggerconstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNetworktriggerconstraint(UpdateTriggerConstraint newNetworktriggerconstraint, NotificationChain msgs)
  {
    UpdateTriggerConstraint oldNetworktriggerconstraint = networktriggerconstraint;
    networktriggerconstraint = newNetworktriggerconstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT, oldNetworktriggerconstraint, newNetworktriggerconstraint);
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
  public void setNetworktriggerconstraint(UpdateTriggerConstraint newNetworktriggerconstraint)
  {
    if (newNetworktriggerconstraint != networktriggerconstraint)
    {
      NotificationChain msgs = null;
      if (networktriggerconstraint != null)
        msgs = ((InternalEObject)networktriggerconstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT, null, msgs);
      if (newNetworktriggerconstraint != null)
        msgs = ((InternalEObject)newNetworktriggerconstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT, null, msgs);
      msgs = basicSetNetworktriggerconstraint(newNetworktriggerconstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT, newNetworktriggerconstraint, newNetworktriggerconstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NetworkConstraint getNetworkconstraint()
  {
    return networkconstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNetworkconstraint(NetworkConstraint newNetworkconstraint, NotificationChain msgs)
  {
    NetworkConstraint oldNetworkconstraint = networkconstraint;
    networkconstraint = newNetworkconstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT, oldNetworkconstraint, newNetworkconstraint);
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
  public void setNetworkconstraint(NetworkConstraint newNetworkconstraint)
  {
    if (newNetworkconstraint != networkconstraint)
    {
      NotificationChain msgs = null;
      if (networkconstraint != null)
        msgs = ((InternalEObject)networkconstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT, null, msgs);
      if (newNetworkconstraint != null)
        msgs = ((InternalEObject)newNetworkconstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT, null, msgs);
      msgs = basicSetNetworkconstraint(newNetworkconstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT, newNetworkconstraint, newNetworkconstraint));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VsdlPackage.NETWORK_CONSTRAINT__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IPAddress getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIp(IPAddress newIp, NotificationChain msgs)
  {
    IPAddress oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__IP, oldIp, newIp);
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
  public void setIp(IPAddress newIp)
  {
    if (newIp != ip)
    {
      NotificationChain msgs = null;
      if (ip != null)
        msgs = ((InternalEObject)ip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__IP, null, msgs);
      if (newIp != null)
        msgs = ((InternalEObject)newIp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.NETWORK_CONSTRAINT__IP, null, msgs);
      msgs = basicSetIp(newIp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.NETWORK_CONSTRAINT__IP, newIp, newIp));
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
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT:
        return basicSetNetworktriggerconstraint(null, msgs);
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT:
        return basicSetNetworkconstraint(null, msgs);
      case VsdlPackage.NETWORK_CONSTRAINT__IP:
        return basicSetIp(null, msgs);
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
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT:
        return getNetworktriggerconstraint();
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT:
        return getNetworkconstraint();
      case VsdlPackage.NETWORK_CONSTRAINT__ID:
        if (resolve) return getId();
        return basicGetId();
      case VsdlPackage.NETWORK_CONSTRAINT__OP:
        return getOp();
      case VsdlPackage.NETWORK_CONSTRAINT__IP:
        return getIp();
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
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT:
        setNetworktriggerconstraint((UpdateTriggerConstraint)newValue);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT:
        setNetworkconstraint((NetworkConstraint)newValue);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__ID:
        setId((Node)newValue);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__OP:
        setOp((String)newValue);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__IP:
        setIp((IPAddress)newValue);
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
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT:
        setNetworktriggerconstraint((UpdateTriggerConstraint)null);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT:
        setNetworkconstraint((NetworkConstraint)null);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__ID:
        setId((Node)null);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__OP:
        setOp(OP_EDEFAULT);
        return;
      case VsdlPackage.NETWORK_CONSTRAINT__IP:
        setIp((IPAddress)null);
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
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKTRIGGERCONSTRAINT:
        return networktriggerconstraint != null;
      case VsdlPackage.NETWORK_CONSTRAINT__NETWORKCONSTRAINT:
        return networkconstraint != null;
      case VsdlPackage.NETWORK_CONSTRAINT__ID:
        return id != null;
      case VsdlPackage.NETWORK_CONSTRAINT__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case VsdlPackage.NETWORK_CONSTRAINT__IP:
        return ip != null;
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
    result.append(')');
    return result.toString();
  }

} //NetworkConstraintImpl