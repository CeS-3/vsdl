/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl.util;

import it.csec.xtext.vsdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csec.xtext.vsdl.VsdlPackage
 * @generated
 */
public class VsdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VsdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VsdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VsdlSwitch<Adapter> modelSwitch =
    new VsdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseScenElem(ScenElem object)
      {
        return createScenElemAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseNodeConstraint(NodeConstraint object)
      {
        return createNodeConstraintAdapter();
      }
      @Override
      public Adapter caseSoftwareInstallation(SoftwareInstallation object)
      {
        return createSoftwareInstallationAdapter();
      }
      @Override
      public Adapter caseSoftwareDependency(SoftwareDependency object)
      {
        return createSoftwareDependencyAdapter();
      }
      @Override
      public Adapter caseConfigOptions(ConfigOptions object)
      {
        return createConfigOptionsAdapter();
      }
      @Override
      public Adapter caseConfigPair(ConfigPair object)
      {
        return createConfigPairAdapter();
      }
      @Override
      public Adapter caseNetwork(Network object)
      {
        return createNetworkAdapter();
      }
      @Override
      public Adapter caseNetworkConstraint(NetworkConstraint object)
      {
        return createNetworkConstraintAdapter();
      }
      @Override
      public Adapter caseUpdateTriggerConstraint(UpdateTriggerConstraint object)
      {
        return createUpdateTriggerConstraintAdapter();
      }
      @Override
      public Adapter caseTimeExpr(TimeExpr object)
      {
        return createTimeExprAdapter();
      }
      @Override
      public Adapter caseTimeInterval(TimeInterval object)
      {
        return createTimeIntervalAdapter();
      }
      @Override
      public Adapter caseCPUFrequency(CPUFrequency object)
      {
        return createCPUFrequencyAdapter();
      }
      @Override
      public Adapter caseDiskSize(DiskSize object)
      {
        return createDiskSizeAdapter();
      }
      @Override
      public Adapter caseRamSize(RamSize object)
      {
        return createRamSizeAdapter();
      }
      @Override
      public Adapter caseIPAddress(IPAddress object)
      {
        return createIPAddressAdapter();
      }
      @Override
      public Adapter caseIPRangeA(IPRangeA object)
      {
        return createIPRangeAAdapter();
      }
      @Override
      public Adapter caseAndOr(AndOr object)
      {
        return createAndOrAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseCPU(CPU object)
      {
        return createCPUAdapter();
      }
      @Override
      public Adapter caseDisk(Disk object)
      {
        return createDiskAdapter();
      }
      @Override
      public Adapter caseRam(Ram object)
      {
        return createRamAdapter();
      }
      @Override
      public Adapter caseFlavour(Flavour object)
      {
        return createFlavourAdapter();
      }
      @Override
      public Adapter caseIP(IP object)
      {
        return createIPAdapter();
      }
      @Override
      public Adapter caseOS(OS object)
      {
        return createOSAdapter();
      }
      @Override
      public Adapter caseOSFamily(OSFamily object)
      {
        return createOSFamilyAdapter();
      }
      @Override
      public Adapter caseIPRange(IPRange object)
      {
        return createIPRangeAdapter();
      }
      @Override
      public Adapter caseGateway(Gateway object)
      {
        return createGatewayAdapter();
      }
      @Override
      public Adapter caseAt(At object)
      {
        return createAtAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter casePlusMinus(PlusMinus object)
      {
        return createPlusMinusAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.ScenElem <em>Scen Elem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.ScenElem
   * @generated
   */
  public Adapter createScenElemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.NodeConstraint <em>Node Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.NodeConstraint
   * @generated
   */
  public Adapter createNodeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.SoftwareInstallation <em>Software Installation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.SoftwareInstallation
   * @generated
   */
  public Adapter createSoftwareInstallationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.SoftwareDependency <em>Software Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.SoftwareDependency
   * @generated
   */
  public Adapter createSoftwareDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.ConfigOptions <em>Config Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.ConfigOptions
   * @generated
   */
  public Adapter createConfigOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.ConfigPair <em>Config Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.ConfigPair
   * @generated
   */
  public Adapter createConfigPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Network <em>Network</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Network
   * @generated
   */
  public Adapter createNetworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.NetworkConstraint <em>Network Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.NetworkConstraint
   * @generated
   */
  public Adapter createNetworkConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.UpdateTriggerConstraint <em>Update Trigger Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.UpdateTriggerConstraint
   * @generated
   */
  public Adapter createUpdateTriggerConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.TimeExpr <em>Time Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.TimeExpr
   * @generated
   */
  public Adapter createTimeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.TimeInterval <em>Time Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.TimeInterval
   * @generated
   */
  public Adapter createTimeIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.CPUFrequency <em>CPU Frequency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.CPUFrequency
   * @generated
   */
  public Adapter createCPUFrequencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.DiskSize <em>Disk Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.DiskSize
   * @generated
   */
  public Adapter createDiskSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.RamSize <em>Ram Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.RamSize
   * @generated
   */
  public Adapter createRamSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.IPAddress <em>IP Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.IPAddress
   * @generated
   */
  public Adapter createIPAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.IPRangeA <em>IP Range A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.IPRangeA
   * @generated
   */
  public Adapter createIPRangeAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.AndOr <em>And Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.AndOr
   * @generated
   */
  public Adapter createAndOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.CPU <em>CPU</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.CPU
   * @generated
   */
  public Adapter createCPUAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Disk <em>Disk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Disk
   * @generated
   */
  public Adapter createDiskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Ram <em>Ram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Ram
   * @generated
   */
  public Adapter createRamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Flavour <em>Flavour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Flavour
   * @generated
   */
  public Adapter createFlavourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.IP <em>IP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.IP
   * @generated
   */
  public Adapter createIPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.OS <em>OS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.OS
   * @generated
   */
  public Adapter createOSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.OSFamily <em>OS Family</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.OSFamily
   * @generated
   */
  public Adapter createOSFamilyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.IPRange <em>IP Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.IPRange
   * @generated
   */
  public Adapter createIPRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Gateway <em>Gateway</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Gateway
   * @generated
   */
  public Adapter createGatewayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.At <em>At</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.At
   * @generated
   */
  public Adapter createAtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.PlusMinus <em>Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.PlusMinus
   * @generated
   */
  public Adapter createPlusMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.csec.xtext.vsdl.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.csec.xtext.vsdl.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VsdlAdapterFactory
