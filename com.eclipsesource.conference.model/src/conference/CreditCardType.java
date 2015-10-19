/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Credit Card Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getCreditCardType()
 * @model
 * @generated
 */
public enum CreditCardType implements Enumerator {
	/**
	 * The '<em><b>Visa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISA_VALUE
	 * @generated
	 * @ordered
	 */
	VISA(0, "Visa", "Visa"),

	/**
	 * The '<em><b>Mastercard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTERCARD_VALUE
	 * @generated
	 * @ordered
	 */
	MASTERCARD(1, "Mastercard", "Mastercard"),

	/**
	 * The '<em><b>American Express</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMERICAN_EXPRESS_VALUE
	 * @generated
	 * @ordered
	 */
	AMERICAN_EXPRESS(0, "AmericanExpress", "AmericanExpress");

	/**
	 * The '<em><b>Visa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISA
	 * @model name="Visa"
	 * @generated
	 * @ordered
	 */
	public static final int VISA_VALUE = 0;

	/**
	 * The '<em><b>Mastercard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mastercard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTERCARD
	 * @model name="Mastercard"
	 * @generated
	 * @ordered
	 */
	public static final int MASTERCARD_VALUE = 1;

	/**
	 * The '<em><b>American Express</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>American Express</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMERICAN_EXPRESS
	 * @model name="AmericanExpress"
	 * @generated
	 * @ordered
	 */
	public static final int AMERICAN_EXPRESS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Credit Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CreditCardType[] VALUES_ARRAY =
		new CreditCardType[] {
			VISA,
			MASTERCARD,
			AMERICAN_EXPRESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Credit Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CreditCardType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Credit Card Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditCardType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditCardType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Card Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditCardType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditCardType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Card Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditCardType get(int value) {
		switch (value) {
			case VISA_VALUE: return VISA;
			case MASTERCARD_VALUE: return MASTERCARD;
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
	private CreditCardType(int value, String name, String literal) {
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
	
} //CreditCardType
