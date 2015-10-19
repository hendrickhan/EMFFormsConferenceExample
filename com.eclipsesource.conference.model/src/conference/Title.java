/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Title</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getTitle()
 * @model
 * @generated
 */
public enum Title implements Enumerator {
	/**
	 * The '<em><b>Mrs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MRS_VALUE
	 * @generated
	 * @ordered
	 */
	MRS(0, "Mrs", "Mrs"),

	/**
	 * The '<em><b>Mr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(1, "Mr", "Mr"),

	/**
	 * The '<em><b>Dr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DR_VALUE
	 * @generated
	 * @ordered
	 */
	DR(2, "Dr", "Dr."),

	/**
	 * The '<em><b>Prof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROF_VALUE
	 * @generated
	 * @ordered
	 */
	PROF(3, "Prof", "Prof");

	/**
	 * The '<em><b>Mrs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mrs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MRS
	 * @model name="Mrs"
	 * @generated
	 * @ordered
	 */
	public static final int MRS_VALUE = 0;

	/**
	 * The '<em><b>Mr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @model name="Mr"
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 1;

	/**
	 * The '<em><b>Dr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DR
	 * @model name="Dr" literal="Dr."
	 * @generated
	 * @ordered
	 */
	public static final int DR_VALUE = 2;

	/**
	 * The '<em><b>Prof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prof</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROF
	 * @model name="Prof"
	 * @generated
	 * @ordered
	 */
	public static final int PROF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Title[] VALUES_ARRAY =
		new Title[] {
			MRS,
			MR,
			DR,
			PROF,
		};

	/**
	 * A public read-only list of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Title> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(int value) {
		switch (value) {
			case MRS_VALUE: return MRS;
			case MR_VALUE: return MR;
			case DR_VALUE: return DR;
			case PROF_VALUE: return PROF;
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
	private Title(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Title
