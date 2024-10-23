/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.util;

import it.csec.xtext.vsdl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.csec.xtext.vsdl.VsdlPackage
 * @generated
 */
public class VsdlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VsdlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VsdlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VsdlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.SCEN_ELEM:
      {
        ScenElem scenElem = (ScenElem)theEObject;
        T result = caseScenElem(scenElem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseScenElem(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.NODE_CONSTRAINT:
      {
        NodeConstraint nodeConstraint = (NodeConstraint)theEObject;
        T result = caseNodeConstraint(nodeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.SOFTWARE_INSTALLATION:
      {
        SoftwareInstallation softwareInstallation = (SoftwareInstallation)theEObject;
        T result = caseSoftwareInstallation(softwareInstallation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.SOFTWARE_DEPENDENCY:
      {
        SoftwareDependency softwareDependency = (SoftwareDependency)theEObject;
        T result = caseSoftwareDependency(softwareDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.CONFIG_OPTIONS:
      {
        ConfigOptions configOptions = (ConfigOptions)theEObject;
        T result = caseConfigOptions(configOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.CONFIG_PAIR:
      {
        ConfigPair configPair = (ConfigPair)theEObject;
        T result = caseConfigPair(configPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.NETWORK:
      {
        Network network = (Network)theEObject;
        T result = caseNetwork(network);
        if (result == null) result = caseScenElem(network);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.NETWORK_CONSTRAINT:
      {
        NetworkConstraint networkConstraint = (NetworkConstraint)theEObject;
        T result = caseNetworkConstraint(networkConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.UPDATE_TRIGGER_CONSTRAINT:
      {
        UpdateTriggerConstraint updateTriggerConstraint = (UpdateTriggerConstraint)theEObject;
        T result = caseUpdateTriggerConstraint(updateTriggerConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.TIME_EXPR:
      {
        TimeExpr timeExpr = (TimeExpr)theEObject;
        T result = caseTimeExpr(timeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.TIME_INTERVAL:
      {
        TimeInterval timeInterval = (TimeInterval)theEObject;
        T result = caseTimeInterval(timeInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.CPU_FREQUENCY:
      {
        CPUFrequency cpuFrequency = (CPUFrequency)theEObject;
        T result = caseCPUFrequency(cpuFrequency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.DISK_SIZE:
      {
        DiskSize diskSize = (DiskSize)theEObject;
        T result = caseDiskSize(diskSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.RAM_SIZE:
      {
        RamSize ramSize = (RamSize)theEObject;
        T result = caseRamSize(ramSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.IP_ADDRESS:
      {
        IPAddress ipAddress = (IPAddress)theEObject;
        T result = caseIPAddress(ipAddress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.IP_RANGE_A:
      {
        IPRangeA ipRangeA = (IPRangeA)theEObject;
        T result = caseIPRangeA(ipRangeA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.AND_OR:
      {
        AndOr andOr = (AndOr)theEObject;
        T result = caseAndOr(andOr);
        if (result == null) result = caseNodeConstraint(andOr);
        if (result == null) result = caseNetworkConstraint(andOr);
        if (result == null) result = caseUpdateTriggerConstraint(andOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseNodeConstraint(not);
        if (result == null) result = caseNetworkConstraint(not);
        if (result == null) result = caseUpdateTriggerConstraint(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.CPU:
      {
        CPU cpu = (CPU)theEObject;
        T result = caseCPU(cpu);
        if (result == null) result = caseNodeConstraint(cpu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.DISK:
      {
        Disk disk = (Disk)theEObject;
        T result = caseDisk(disk);
        if (result == null) result = caseNodeConstraint(disk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.RAM:
      {
        Ram ram = (Ram)theEObject;
        T result = caseRam(ram);
        if (result == null) result = caseNodeConstraint(ram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.FLAVOUR:
      {
        Flavour flavour = (Flavour)theEObject;
        T result = caseFlavour(flavour);
        if (result == null) result = caseNodeConstraint(flavour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.IP:
      {
        IP ip = (IP)theEObject;
        T result = caseIP(ip);
        if (result == null) result = caseNodeConstraint(ip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.OS:
      {
        OS os = (OS)theEObject;
        T result = caseOS(os);
        if (result == null) result = caseNodeConstraint(os);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.OS_FAMILY:
      {
        OSFamily osFamily = (OSFamily)theEObject;
        T result = caseOSFamily(osFamily);
        if (result == null) result = caseNodeConstraint(osFamily);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.IP_RANGE:
      {
        IPRange ipRange = (IPRange)theEObject;
        T result = caseIPRange(ipRange);
        if (result == null) result = caseNetworkConstraint(ipRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.GATEWAY:
      {
        Gateway gateway = (Gateway)theEObject;
        T result = caseGateway(gateway);
        if (result == null) result = caseNetworkConstraint(gateway);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.AT:
      {
        At at = (At)theEObject;
        T result = caseAt(at);
        if (result == null) result = caseUpdateTriggerConstraint(at);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.SWITCH:
      {
        it.csec.xtext.vsdl.Switch switch_ = (it.csec.xtext.vsdl.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseUpdateTriggerConstraint(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.PLUS_MINUS:
      {
        PlusMinus plusMinus = (PlusMinus)theEObject;
        T result = casePlusMinus(plusMinus);
        if (result == null) result = caseTimeExpr(plusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VsdlPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseTimeExpr(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scen Elem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scen Elem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenElem(ScenElem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeConstraint(NodeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Software Installation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Software Installation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftwareInstallation(SoftwareInstallation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Software Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Software Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftwareDependency(SoftwareDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigOptions(ConfigOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigPair(ConfigPair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Network</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetwork(Network object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Network Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Network Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetworkConstraint(NetworkConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Trigger Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Trigger Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateTriggerConstraint(UpdateTriggerConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeExpr(TimeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeInterval(TimeInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CPU Frequency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CPU Frequency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCPUFrequency(CPUFrequency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disk Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disk Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiskSize(DiskSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ram Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ram Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRamSize(RamSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIPAddress(IPAddress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP Range A</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP Range A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIPRangeA(IPRangeA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndOr(AndOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CPU</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CPU</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCPU(CPU object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisk(Disk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRam(Ram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flavour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flavour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlavour(Flavour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIP(IP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOS(OS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OS Family</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OS Family</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSFamily(OSFamily object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIPRange(IPRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGateway(Gateway object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAt(At object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(it.csec.xtext.vsdl.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusMinus(PlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VsdlSwitch
