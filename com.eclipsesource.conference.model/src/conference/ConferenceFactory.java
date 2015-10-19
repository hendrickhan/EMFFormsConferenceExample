/**
 */
package conference;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage
 * @generated
 */
public interface ConferenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferenceFactory eINSTANCE = conference.impl.ConferenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration</em>'.
	 * @generated
	 */
	Registration createRegistration();

	/**
	 * Returns a new object of class '<em>Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Data</em>'.
	 * @generated
	 */
	PersonalData createPersonalData();

	/**
	 * Returns a new object of class '<em>Nutrition Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Information</em>'.
	 * @generated
	 */
	NutritionInformation createNutritionInformation();

	/**
	 * Returns a new object of class '<em>Food Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Food Restrictions</em>'.
	 * @generated
	 */
	FoodRestrictions createFoodRestrictions();

	/**
	 * Returns a new object of class '<em>Payment Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Data</em>'.
	 * @generated
	 */
	PaymentData createPaymentData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConferencePackage getConferencePackage();

} //ConferenceFactory
