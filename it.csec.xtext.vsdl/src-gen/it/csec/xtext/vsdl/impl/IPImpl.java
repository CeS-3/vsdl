/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.impl;

import it.csec.xtext.vsdl.IP;
import it.csec.xtext.vsdl.IPAddress;
import it.csec.xtext.vsdl.IPRangeA;
import it.csec.xtext.vsdl.Node;
import it.csec.xtext.vsdl.VsdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#getIpRange <em>Ip Range</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#isSameas <em>Sameas</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.csec.xtext.vsdl.impl.IPImpl#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPImpl extends NodeConstraintImpl implements IP
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
   * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpAddress()
   * @generated
   * @ordered
   */
  protected IPAddress ipAddress;

  /**
   * The cached value of the '{@link #getIpRange() <em>Ip Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpRange()
   * @generated
   * @ordered
   */
  protected IPRangeA ipRange;

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
  protected IPImpl()
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
    return VsdlPackage.Literals.IP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IPAddress getIpAddress()
  {
    return ipAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIpAddress(IPAddress newIpAddress, NotificationChain msgs)
  {
    IPAddress oldIpAddress = ipAddress;
    ipAddress = newIpAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP_ADDRESS, oldIpAddress, newIpAddress);
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
  public void setIpAddress(IPAddress newIpAddress)
  {
    if (newIpAddress != ipAddress)
    {
      NotificationChain msgs = null;
      if (ipAddress != null)
        msgs = ((InternalEObject)ipAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP_ADDRESS, null, msgs);
      if (newIpAddress != null)
        msgs = ((InternalEObject)newIpAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP_ADDRESS, null, msgs);
      msgs = basicSetIpAddress(newIpAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP_ADDRESS, newIpAddress, newIpAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IPRangeA getIpRange()
  {
    return ipRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIpRange(IPRangeA newIpRange, NotificationChain msgs)
  {
    IPRangeA oldIpRange = ipRange;
    ipRange = newIpRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP_RANGE, oldIpRange, newIpRange);
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
  public void setIpRange(IPRangeA newIpRange)
  {
    if (newIpRange != ipRange)
    {
      NotificationChain msgs = null;
      if (ipRange != null)
        msgs = ((InternalEObject)ipRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP_RANGE, null, msgs);
      if (newIpRange != null)
        msgs = ((InternalEObject)newIpRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP_RANGE, null, msgs);
      msgs = basicSetIpRange(newIpRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP_RANGE, newIpRange, newIpRange));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__SAMEAS, oldSameas, sameas));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VsdlPackage.IP__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__ID, oldId, id));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP, oldIp, newIp);
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
        msgs = ((InternalEObject)ip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP, null, msgs);
      if (newIp != null)
        msgs = ((InternalEObject)newIp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VsdlPackage.IP__IP, null, msgs);
      msgs = basicSetIp(newIp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VsdlPackage.IP__IP, newIp, newIp));
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
      case VsdlPackage.IP__IP_ADDRESS:
        return basicSetIpAddress(null, msgs);
      case VsdlPackage.IP__IP_RANGE:
        return basicSetIpRange(null, msgs);
      case VsdlPackage.IP__IP:
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
      case VsdlPackage.IP__OP:
        return getOp();
      case VsdlPackage.IP__IP_ADDRESS:
        return getIpAddress();
      case VsdlPackage.IP__IP_RANGE:
        return getIpRange();
      case VsdlPackage.IP__SAMEAS:
        return isSameas();
      case VsdlPackage.IP__ID:
        if (resolve) return getId();
        return basicGetId();
      case VsdlPackage.IP__IP:
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
      case VsdlPackage.IP__OP:
        setOp((String)newValue);
        return;
      case VsdlPackage.IP__IP_ADDRESS:
        setIpAddress((IPAddress)newValue);
        return;
      case VsdlPackage.IP__IP_RANGE:
        setIpRange((IPRangeA)newValue);
        return;
      case VsdlPackage.IP__SAMEAS:
        setSameas((Boolean)newValue);
        return;
      case VsdlPackage.IP__ID:
        setId((Node)newValue);
        return;
      case VsdlPackage.IP__IP:
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
      case VsdlPackage.IP__OP:
        setOp(OP_EDEFAULT);
        return;
      case VsdlPackage.IP__IP_ADDRESS:
        setIpAddress((IPAddress)null);
        return;
      case VsdlPackage.IP__IP_RANGE:
        setIpRange((IPRangeA)null);
        return;
      case VsdlPackage.IP__SAMEAS:
        setSameas(SAMEAS_EDEFAULT);
        return;
      case VsdlPackage.IP__ID:
        setId((Node)null);
        return;
      case VsdlPackage.IP__IP:
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
      case VsdlPackage.IP__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case VsdlPackage.IP__IP_ADDRESS:
        return ipAddress != null;
      case VsdlPackage.IP__IP_RANGE:
        return ipRange != null;
      case VsdlPackage.IP__SAMEAS:
        return sameas != SAMEAS_EDEFAULT;
      case VsdlPackage.IP__ID:
        return id != null;
      case VsdlPackage.IP__IP:
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
    result.append(", sameas: ");
    result.append(sameas);
    result.append(')');
    return result.toString();
  }

} //IPImpl
