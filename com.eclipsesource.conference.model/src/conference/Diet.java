/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diet</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getDiet()
 * @model
 * @generated
 */
public enum Diet implements Enumerator {
	/**
	 * The '<em><b>Carnivore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARNIVORE_VALUE
	 * @generated
	 * @ordered
	 */
	CARNIVORE(0, "Carnivore", "Carnivore"),

	/**
	 * The '<em><b>Vegetarian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETARIAN(1, "Vegetarian", "Vegetarian"),

	/**
	 * The '<em><b>Vegan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGAN(2, "Vegan", "Vegan"),

	/**
	 * The '<em><b>Fruitarian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUITARIAN_VALUE
	 * @generated
	 * @ordered
	 */
	FRUITARIAN(3, "Fruitarian", "Fruitarian");

	/**
	 * The '<em><b>Carnivore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carnivore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARNIVORE
	 * @model name="Carnivore"
	 * @generated
	 * @ordered
	 */
	public static final int CARNIVORE_VALUE = 0;

	/**
	 * The '<em><b>Vegetarian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vegetarian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN
	 * @model name="Vegetarian"
	 * @generated
	 * @ordered
	 */
	public static final int VEGETARIAN_VALUE = 1;

	/**
	 * The '<em><b>Vegan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vegan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGAN
	 * @model name="Vegan"
	 * @generated
	 * @ordered
	 */
	public static final int VEGAN_VALUE = 2;

	/**
	 * The '<em><b>Fruitarian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fruitarian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRUITARIAN
	 * @model name="Fruitarian"
	 * @generated
	 * @ordered
	 */
	public static final int FRUITARIAN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Diet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Diet[] VALUES_ARRAY =
		new Diet[] {
			CARNIVORE,
			VEGETARIAN,
			VEGAN,
			FRUITARIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Diet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Diet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Diet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Diet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet get(int value) {
		switch (value) {
			case CARNIVORE_VALUE: return CARNIVORE;
			case VEGETARIAN_VALUE: return VEGETARIAN;
			case VEGAN_VALUE: return VEGAN;
			case FRUITARIAN_VALUE: return FRUITARIAN;
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
	private Diet(int value, String name, String literal) {
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
	
} //Diet
