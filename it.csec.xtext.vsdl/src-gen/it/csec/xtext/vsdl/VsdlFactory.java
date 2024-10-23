/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csec.xtext.vsdl.VsdlPackage
 * @generated
 */
public interface VsdlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VsdlFactory eINSTANCE = it.csec.xtext.vsdl.impl.VsdlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Scen Elem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scen Elem</em>'.
   * @generated
   */
  ScenElem createScenElem();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Node Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Constraint</em>'.
   * @generated
   */
  NodeConstraint createNodeConstraint();

  /**
   * Returns a new object of class '<em>Software Installation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Software Installation</em>'.
   * @generated
   */
  SoftwareInstallation createSoftwareInstallation();

  /**
   * Returns a new object of class '<em>Software Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Software Dependency</em>'.
   * @generated
   */
  SoftwareDependency createSoftwareDependency();

  /**
   * Returns a new object of class '<em>Config Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Options</em>'.
   * @generated
   */
  ConfigOptions createConfigOptions();

  /**
   * Returns a new object of class '<em>Config Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Pair</em>'.
   * @generated
   */
  ConfigPair createConfigPair();

  /**
   * Returns a new object of class '<em>Network</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network</em>'.
   * @generated
   */
  Network createNetwork();

  /**
   * Returns a new object of class '<em>Network Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Constraint</em>'.
   * @generated
   */
  NetworkConstraint createNetworkConstraint();

  /**
   * Returns a new object of class '<em>Update Trigger Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Trigger Constraint</em>'.
   * @generated
   */
  UpdateTriggerConstraint createUpdateTriggerConstraint();

  /**
   * Returns a new object of class '<em>Time Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Expr</em>'.
   * @generated
   */
  TimeExpr createTimeExpr();

  /**
   * Returns a new object of class '<em>Time Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Interval</em>'.
   * @generated
   */
  TimeInterval createTimeInterval();

  /**
   * Returns a new object of class '<em>CPU Frequency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CPU Frequency</em>'.
   * @generated
   */
  CPUFrequency createCPUFrequency();

  /**
   * Returns a new object of class '<em>Disk Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disk Size</em>'.
   * @generated
   */
  DiskSize createDiskSize();

  /**
   * Returns a new object of class '<em>Ram Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ram Size</em>'.
   * @generated
   */
  RamSize createRamSize();

  /**
   * Returns a new object of class '<em>IP Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP Address</em>'.
   * @generated
   */
  IPAddress createIPAddress();

  /**
   * Returns a new object of class '<em>IP Range A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP Range A</em>'.
   * @generated
   */
  IPRangeA createIPRangeA();

  /**
   * Returns a new object of class '<em>And Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Or</em>'.
   * @generated
   */
  AndOr createAndOr();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>CPU</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CPU</em>'.
   * @generated
   */
  CPU createCPU();

  /**
   * Returns a new object of class '<em>Disk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disk</em>'.
   * @generated
   */
  Disk createDisk();

  /**
   * Returns a new object of class '<em>Ram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ram</em>'.
   * @generated
   */
  Ram createRam();

  /**
   * Returns a new object of class '<em>Flavour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flavour</em>'.
   * @generated
   */
  Flavour createFlavour();

  /**
   * Returns a new object of class '<em>IP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP</em>'.
   * @generated
   */
  IP createIP();

  /**
   * Returns a new object of class '<em>OS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OS</em>'.
   * @generated
   */
  OS createOS();

  /**
   * Returns a new object of class '<em>OS Family</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OS Family</em>'.
   * @generated
   */
  OSFamily createOSFamily();

  /**
   * Returns a new object of class '<em>IP Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP Range</em>'.
   * @generated
   */
  IPRange createIPRange();

  /**
   * Returns a new object of class '<em>Gateway</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gateway</em>'.
   * @generated
   */
  Gateway createGateway();

  /**
   * Returns a new object of class '<em>At</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At</em>'.
   * @generated
   */
  At createAt();

  /**
   * Returns a new object of class '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch</em>'.
   * @generated
   */
  Switch createSwitch();

  /**
   * Returns a new object of class '<em>Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Minus</em>'.
   * @generated
   */
  PlusMinus createPlusMinus();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VsdlPackage getVsdlPackage();

} //VsdlFactory
