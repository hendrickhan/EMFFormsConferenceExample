/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Registration#getId <em>Id</em>}</li>
 *   <li>{@link conference.Registration#getPersonalData <em>Personal Data</em>}</li>
 *   <li>{@link conference.Registration#getNutritionInformation <em>Nutrition Information</em>}</li>
 *   <li>{@link conference.Registration#getPaymentData <em>Payment Data</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getRegistration()
 * @model
 * @generated
 */
public interface Registration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see conference.ConferencePackage#getRegistration_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link conference.Registration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Personal Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data</em>' containment reference.
	 * @see #setPersonalData(PersonalData)
	 * @see conference.ConferencePackage#getRegistration_PersonalData()
	 * @model containment="true"
	 * @generated
	 */
	PersonalData getPersonalData();

	/**
	 * Sets the value of the '{@link conference.Registration#getPersonalData <em>Personal Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data</em>' containment reference.
	 * @see #getPersonalData()
	 * @generated
	 */
	void setPersonalData(PersonalData value);

	/**
	 * Returns the value of the '<em><b>Nutrition Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nutrition Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrition Information</em>' containment reference.
	 * @see #setNutritionInformation(NutritionInformation)
	 * @see conference.ConferencePackage#getRegistration_NutritionInformation()
	 * @model containment="true"
	 * @generated
	 */
	NutritionInformation getNutritionInformation();

	/**
	 * Sets the value of the '{@link conference.Registration#getNutritionInformation <em>Nutrition Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Information</em>' containment reference.
	 * @see #getNutritionInformation()
	 * @generated
	 */
	void setNutritionInformation(NutritionInformation value);

	/**
	 * Returns the value of the '<em><b>Payment Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Data</em>' containment reference.
	 * @see #setPaymentData(PaymentData)
	 * @see conference.ConferencePackage#getRegistration_PaymentData()
	 * @model containment="true"
	 * @generated
	 */
	PaymentData getPaymentData();

	/**
	 * Sets the value of the '{@link conference.Registration#getPaymentData <em>Payment Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Data</em>' containment reference.
	 * @see #getPaymentData()
	 * @generated
	 */
	void setPaymentData(PaymentData value);

} // Registration
