/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.PaymentData#getCreditCardType <em>Credit Card Type</em>}</li>
 *   <li>{@link conference.PaymentData#getCardholder <em>Cardholder</em>}</li>
 *   <li>{@link conference.PaymentData#getCardnumber <em>Cardnumber</em>}</li>
 *   <li>{@link conference.PaymentData#getExpirationMonth <em>Expiration Month</em>}</li>
 *   <li>{@link conference.PaymentData#getExpirationYear <em>Expiration Year</em>}</li>
 *   <li>{@link conference.PaymentData#getCVV <em>CVV</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getPaymentData()
 * @model
 * @generated
 */
public interface PaymentData extends EObject {
	/**
	 * Returns the value of the '<em><b>Credit Card Type</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.CreditCardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Type</em>' attribute.
	 * @see conference.CreditCardType
	 * @see #setCreditCardType(CreditCardType)
	 * @see conference.ConferencePackage#getPaymentData_CreditCardType()
	 * @model required="true"
	 * @generated
	 */
	CreditCardType getCreditCardType();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getCreditCardType <em>Credit Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Type</em>' attribute.
	 * @see conference.CreditCardType
	 * @see #getCreditCardType()
	 * @generated
	 */
	void setCreditCardType(CreditCardType value);

	/**
	 * Returns the value of the '<em><b>Cardholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder</em>' attribute.
	 * @see #setCardholder(String)
	 * @see conference.ConferencePackage#getPaymentData_Cardholder()
	 * @model required="true"
	 * @generated
	 */
	String getCardholder();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getCardholder <em>Cardholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardholder</em>' attribute.
	 * @see #getCardholder()
	 * @generated
	 */
	void setCardholder(String value);

	/**
	 * Returns the value of the '<em><b>Cardnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardnumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardnumber</em>' attribute.
	 * @see #setCardnumber(int)
	 * @see conference.ConferencePackage#getPaymentData_Cardnumber()
	 * @model required="true"
	 * @generated
	 */
	int getCardnumber();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getCardnumber <em>Cardnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardnumber</em>' attribute.
	 * @see #getCardnumber()
	 * @generated
	 */
	void setCardnumber(int value);

	/**
	 * Returns the value of the '<em><b>Expiration Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Month</em>' attribute.
	 * @see #setExpirationMonth(int)
	 * @see conference.ConferencePackage#getPaymentData_ExpirationMonth()
	 * @model required="true"
	 * @generated
	 */
	int getExpirationMonth();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getExpirationMonth <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Month</em>' attribute.
	 * @see #getExpirationMonth()
	 * @generated
	 */
	void setExpirationMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiration Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Year</em>' attribute.
	 * @see #setExpirationYear(int)
	 * @see conference.ConferencePackage#getPaymentData_ExpirationYear()
	 * @model required="true"
	 * @generated
	 */
	int getExpirationYear();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getExpirationYear <em>Expiration Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Year</em>' attribute.
	 * @see #getExpirationYear()
	 * @generated
	 */
	void setExpirationYear(int value);

	/**
	 * Returns the value of the '<em><b>CVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CVV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVV</em>' attribute.
	 * @see #setCVV(int)
	 * @see conference.ConferencePackage#getPaymentData_CVV()
	 * @model required="true"
	 * @generated
	 */
	int getCVV();

	/**
	 * Sets the value of the '{@link conference.PaymentData#getCVV <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CVV</em>' attribute.
	 * @see #getCVV()
	 * @generated
	 */
	void setCVV(int value);

} // PaymentData
