/**
 * generated by Xtext 2.35.0
 */
package it.csec.xtext.vsdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardware Profile</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csec.xtext.vsdl.VsdlPackage#getHardwareProfile()
 * @model
 * @generated
 */
public enum HardwareProfile implements Enumerator
{
  /**
   * The '<em><b>Tiny</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINY_VALUE
   * @generated
   * @ordered
   */
  TINY(0, "tiny", "tiny"),

  /**
   * The '<em><b>Medium</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM_VALUE
   * @generated
   * @ordered
   */
  MEDIUM(1, "medium", "medium"),

  /**
   * The '<em><b>Large</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LARGE_VALUE
   * @generated
   * @ordered
   */
  LARGE(2, "large", "large"),

  /**
   * The '<em><b>Mobile</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOBILE_VALUE
   * @generated
   * @ordered
   */
  MOBILE(3, "mobile", "mobile"),

  /**
   * The '<em><b>Wearable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEARABLE_VALUE
   * @generated
   * @ordered
   */
  WEARABLE(4, "wearable", "wearable"),

  /**
   * The '<em><b>Sensor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_VALUE
   * @generated
   * @ordered
   */
  SENSOR(5, "sensor", "sensor"),

  /**
   * The '<em><b>Server</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERVER_VALUE
   * @generated
   * @ordered
   */
  SERVER(6, "server", "server");

  /**
   * The '<em><b>Tiny</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINY
   * @model name="tiny"
   * @generated
   * @ordered
   */
  public static final int TINY_VALUE = 0;

  /**
   * The '<em><b>Medium</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM
   * @model name="medium"
   * @generated
   * @ordered
   */
  public static final int MEDIUM_VALUE = 1;

  /**
   * The '<em><b>Large</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LARGE
   * @model name="large"
   * @generated
   * @ordered
   */
  public static final int LARGE_VALUE = 2;

  /**
   * The '<em><b>Mobile</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOBILE
   * @model name="mobile"
   * @generated
   * @ordered
   */
  public static final int MOBILE_VALUE = 3;

  /**
   * The '<em><b>Wearable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEARABLE
   * @model name="wearable"
   * @generated
   * @ordered
   */
  public static final int WEARABLE_VALUE = 4;

  /**
   * The '<em><b>Sensor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR
   * @model name="sensor"
   * @generated
   * @ordered
   */
  public static final int SENSOR_VALUE = 5;

  /**
   * The '<em><b>Server</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERVER
   * @model name="server"
   * @generated
   * @ordered
   */
  public static final int SERVER_VALUE = 6;

  /**
   * An array of all the '<em><b>Hardware Profile</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final HardwareProfile[] VALUES_ARRAY =
    new HardwareProfile[]
    {
      TINY,
      MEDIUM,
      LARGE,
      MOBILE,
      WEARABLE,
      SENSOR,
      SERVER,
    };

  /**
   * A public read-only list of all the '<em><b>Hardware Profile</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<HardwareProfile> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Hardware Profile</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static HardwareProfile get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HardwareProfile result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Hardware Profile</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static HardwareProfile getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HardwareProfile result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Hardware Profile</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static HardwareProfile get(int value)
  {
    switch (value)
    {
      case TINY_VALUE: return TINY;
      case MEDIUM_VALUE: return MEDIUM;
      case LARGE_VALUE: return LARGE;
      case MOBILE_VALUE: return MOBILE;
      case WEARABLE_VALUE: return WEARABLE;
      case SENSOR_VALUE: return SENSOR;
      case SERVER_VALUE: return SERVER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private HardwareProfile(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //HardwareProfile
