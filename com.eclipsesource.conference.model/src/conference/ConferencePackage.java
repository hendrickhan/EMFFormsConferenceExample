/**
 */
package conference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipsesource.com/conference/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.eclipsesource.conference.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferencePackage eINSTANCE = conference.impl.ConferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.impl.RegistrationImpl <em>Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.RegistrationImpl
	 * @see conference.impl.ConferencePackageImpl#getRegistration()
	 * @generated
	 */
	int REGISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Personal Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__PERSONAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Nutrition Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__NUTRITION_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Payment Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__PAYMENT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Registration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION__REGISTRATION_TIME = 4;

	/**
	 * The number of structural features of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.PersonalDataImpl <em>Personal Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.PersonalDataImpl
	 * @see conference.impl.ConferencePackageImpl#getPersonalData()
	 * @generated
	 */
	int PERSONAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__DATE_OF_BIRTH = 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA__GENDER = 4;

	/**
	 * The number of structural features of the '<em>Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.NutritionInformationImpl <em>Nutrition Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.NutritionInformationImpl
	 * @see conference.impl.ConferencePackageImpl#getNutritionInformation()
	 * @generated
	 */
	int NUTRITION_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Diet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITION_INFORMATION__DIET = 0;

	/**
	 * The feature id for the '<em><b>Food Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITION_INFORMATION__FOOD_RESTRICTIONS = 1;

	/**
	 * The number of structural features of the '<em>Nutrition Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITION_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nutrition Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITION_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.FoodRestrictionsImpl <em>Food Restrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.FoodRestrictionsImpl
	 * @see conference.impl.ConferencePackageImpl#getFoodRestrictions()
	 * @generated
	 */
	int FOOD_RESTRICTIONS = 3;

	/**
	 * The feature id for the '<em><b>Peanuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS__PEANUTS = 0;

	/**
	 * The feature id for the '<em><b>Lactose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS__LACTOSE = 1;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS__OTHER = 2;

	/**
	 * The feature id for the '<em><b>Gluten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS__GLUTEN = 3;

	/**
	 * The feature id for the '<em><b>Pork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS__PORK = 4;

	/**
	 * The number of structural features of the '<em>Food Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Food Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_RESTRICTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.PaymentDataImpl <em>Payment Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.PaymentDataImpl
	 * @see conference.impl.ConferencePackageImpl#getPaymentData()
	 * @generated
	 */
	int PAYMENT_DATA = 4;

	/**
	 * The feature id for the '<em><b>Credit Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CREDIT_CARD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cardholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CARDHOLDER = 1;

	/**
	 * The feature id for the '<em><b>Cardnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CARDNUMBER = 2;

	/**
	 * The feature id for the '<em><b>Expiration Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__EXPIRATION_MONTH = 3;

	/**
	 * The feature id for the '<em><b>Expiration Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__EXPIRATION_YEAR = 4;

	/**
	 * The feature id for the '<em><b>CVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA__CVV = 5;

	/**
	 * The number of structural features of the '<em>Payment Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Payment Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.Title <em>Title</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Title
	 * @see conference.impl.ConferencePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 5;

	/**
	 * The meta object id for the '{@link conference.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Gender
	 * @see conference.impl.ConferencePackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 6;

	/**
	 * The meta object id for the '{@link conference.Diet <em>Diet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Diet
	 * @see conference.impl.ConferencePackageImpl#getDiet()
	 * @generated
	 */
	int DIET = 7;

	/**
	 * The meta object id for the '{@link conference.CreditCardType <em>Credit Card Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.CreditCardType
	 * @see conference.impl.ConferencePackageImpl#getCreditCardType()
	 * @generated
	 */
	int CREDIT_CARD_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link conference.Registration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration</em>'.
	 * @see conference.Registration
	 * @generated
	 */
	EClass getRegistration();

	/**
	 * Returns the meta object for the attribute '{@link conference.Registration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see conference.Registration#getId()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Registration#getPersonalData <em>Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Data</em>'.
	 * @see conference.Registration#getPersonalData()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_PersonalData();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Registration#getNutritionInformation <em>Nutrition Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nutrition Information</em>'.
	 * @see conference.Registration#getNutritionInformation()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_NutritionInformation();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Registration#getPaymentData <em>Payment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment Data</em>'.
	 * @see conference.Registration#getPaymentData()
	 * @see #getRegistration()
	 * @generated
	 */
	EReference getRegistration_PaymentData();

	/**
	 * Returns the meta object for the attribute '{@link conference.Registration#getRegistrationTime <em>Registration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Time</em>'.
	 * @see conference.Registration#getRegistrationTime()
	 * @see #getRegistration()
	 * @generated
	 */
	EAttribute getRegistration_RegistrationTime();

	/**
	 * Returns the meta object for class '{@link conference.PersonalData <em>Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data</em>'.
	 * @see conference.PersonalData
	 * @generated
	 */
	EClass getPersonalData();

	/**
	 * Returns the meta object for the attribute '{@link conference.PersonalData#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see conference.PersonalData#getFirstName()
	 * @see #getPersonalData()
	 * @generated
	 */
	EAttribute getPersonalData_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link conference.PersonalData#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see conference.PersonalData#getLastName()
	 * @see #getPersonalData()
	 * @generated
	 */
	EAttribute getPersonalData_LastName();

	/**
	 * Returns the meta object for the attribute '{@link conference.PersonalData#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see conference.PersonalData#getTitle()
	 * @see #getPersonalData()
	 * @generated
	 */
	EAttribute getPersonalData_Title();

	/**
	 * Returns the meta object for the attribute '{@link conference.PersonalData#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see conference.PersonalData#getDateOfBirth()
	 * @see #getPersonalData()
	 * @generated
	 */
	EAttribute getPersonalData_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link conference.PersonalData#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see conference.PersonalData#getGender()
	 * @see #getPersonalData()
	 * @generated
	 */
	EAttribute getPersonalData_Gender();

	/**
	 * Returns the meta object for class '{@link conference.NutritionInformation <em>Nutrition Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutrition Information</em>'.
	 * @see conference.NutritionInformation
	 * @generated
	 */
	EClass getNutritionInformation();

	/**
	 * Returns the meta object for the attribute '{@link conference.NutritionInformation#getDiet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diet</em>'.
	 * @see conference.NutritionInformation#getDiet()
	 * @see #getNutritionInformation()
	 * @generated
	 */
	EAttribute getNutritionInformation_Diet();

	/**
	 * Returns the meta object for the containment reference '{@link conference.NutritionInformation#getFoodRestrictions <em>Food Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Food Restrictions</em>'.
	 * @see conference.NutritionInformation#getFoodRestrictions()
	 * @see #getNutritionInformation()
	 * @generated
	 */
	EReference getNutritionInformation_FoodRestrictions();

	/**
	 * Returns the meta object for class '{@link conference.FoodRestrictions <em>Food Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Restrictions</em>'.
	 * @see conference.FoodRestrictions
	 * @generated
	 */
	EClass getFoodRestrictions();

	/**
	 * Returns the meta object for the attribute '{@link conference.FoodRestrictions#isPeanuts <em>Peanuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peanuts</em>'.
	 * @see conference.FoodRestrictions#isPeanuts()
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	EAttribute getFoodRestrictions_Peanuts();

	/**
	 * Returns the meta object for the attribute '{@link conference.FoodRestrictions#isGluten <em>Gluten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gluten</em>'.
	 * @see conference.FoodRestrictions#isGluten()
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	EAttribute getFoodRestrictions_Gluten();

	/**
	 * Returns the meta object for the attribute '{@link conference.FoodRestrictions#isPork <em>Pork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pork</em>'.
	 * @see conference.FoodRestrictions#isPork()
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	EAttribute getFoodRestrictions_Pork();

	/**
	 * Returns the meta object for the attribute '{@link conference.FoodRestrictions#isLactose <em>Lactose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lactose</em>'.
	 * @see conference.FoodRestrictions#isLactose()
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	EAttribute getFoodRestrictions_Lactose();

	/**
	 * Returns the meta object for the attribute '{@link conference.FoodRestrictions#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see conference.FoodRestrictions#getOther()
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	EAttribute getFoodRestrictions_Other();

	/**
	 * Returns the meta object for class '{@link conference.PaymentData <em>Payment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Data</em>'.
	 * @see conference.PaymentData
	 * @generated
	 */
	EClass getPaymentData();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getCreditCardType <em>Credit Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Type</em>'.
	 * @see conference.PaymentData#getCreditCardType()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_CreditCardType();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getCardholder <em>Cardholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardholder</em>'.
	 * @see conference.PaymentData#getCardholder()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cardholder();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getCardnumber <em>Cardnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardnumber</em>'.
	 * @see conference.PaymentData#getCardnumber()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_Cardnumber();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getExpirationMonth <em>Expiration Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Month</em>'.
	 * @see conference.PaymentData#getExpirationMonth()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_ExpirationMonth();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getExpirationYear <em>Expiration Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Year</em>'.
	 * @see conference.PaymentData#getExpirationYear()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_ExpirationYear();

	/**
	 * Returns the meta object for the attribute '{@link conference.PaymentData#getCVV <em>CVV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CVV</em>'.
	 * @see conference.PaymentData#getCVV()
	 * @see #getPaymentData()
	 * @generated
	 */
	EAttribute getPaymentData_CVV();

	/**
	 * Returns the meta object for enum '{@link conference.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title</em>'.
	 * @see conference.Title
	 * @generated
	 */
	EEnum getTitle();

	/**
	 * Returns the meta object for enum '{@link conference.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see conference.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link conference.Diet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet</em>'.
	 * @see conference.Diet
	 * @generated
	 */
	EEnum getDiet();

	/**
	 * Returns the meta object for enum '{@link conference.CreditCardType <em>Credit Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credit Card Type</em>'.
	 * @see conference.CreditCardType
	 * @generated
	 */
	EEnum getCreditCardType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConferenceFactory getConferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conference.impl.RegistrationImpl <em>Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.RegistrationImpl
		 * @see conference.impl.ConferencePackageImpl#getRegistration()
		 * @generated
		 */
		EClass REGISTRATION = eINSTANCE.getRegistration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__ID = eINSTANCE.getRegistration_Id();

		/**
		 * The meta object literal for the '<em><b>Personal Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__PERSONAL_DATA = eINSTANCE.getRegistration_PersonalData();

		/**
		 * The meta object literal for the '<em><b>Nutrition Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__NUTRITION_INFORMATION = eINSTANCE.getRegistration_NutritionInformation();

		/**
		 * The meta object literal for the '<em><b>Payment Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION__PAYMENT_DATA = eINSTANCE.getRegistration_PaymentData();

		/**
		 * The meta object literal for the '<em><b>Registration Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION__REGISTRATION_TIME = eINSTANCE.getRegistration_RegistrationTime();

		/**
		 * The meta object literal for the '{@link conference.impl.PersonalDataImpl <em>Personal Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.PersonalDataImpl
		 * @see conference.impl.ConferencePackageImpl#getPersonalData()
		 * @generated
		 */
		EClass PERSONAL_DATA = eINSTANCE.getPersonalData();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA__FIRST_NAME = eINSTANCE.getPersonalData_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA__LAST_NAME = eINSTANCE.getPersonalData_LastName();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA__TITLE = eINSTANCE.getPersonalData_Title();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA__DATE_OF_BIRTH = eINSTANCE.getPersonalData_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA__GENDER = eINSTANCE.getPersonalData_Gender();

		/**
		 * The meta object literal for the '{@link conference.impl.NutritionInformationImpl <em>Nutrition Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.NutritionInformationImpl
		 * @see conference.impl.ConferencePackageImpl#getNutritionInformation()
		 * @generated
		 */
		EClass NUTRITION_INFORMATION = eINSTANCE.getNutritionInformation();

		/**
		 * The meta object literal for the '<em><b>Diet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITION_INFORMATION__DIET = eINSTANCE.getNutritionInformation_Diet();

		/**
		 * The meta object literal for the '<em><b>Food Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITION_INFORMATION__FOOD_RESTRICTIONS = eINSTANCE.getNutritionInformation_FoodRestrictions();

		/**
		 * The meta object literal for the '{@link conference.impl.FoodRestrictionsImpl <em>Food Restrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.FoodRestrictionsImpl
		 * @see conference.impl.ConferencePackageImpl#getFoodRestrictions()
		 * @generated
		 */
		EClass FOOD_RESTRICTIONS = eINSTANCE.getFoodRestrictions();

		/**
		 * The meta object literal for the '<em><b>Peanuts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_RESTRICTIONS__PEANUTS = eINSTANCE.getFoodRestrictions_Peanuts();

		/**
		 * The meta object literal for the '<em><b>Gluten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_RESTRICTIONS__GLUTEN = eINSTANCE.getFoodRestrictions_Gluten();

		/**
		 * The meta object literal for the '<em><b>Pork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_RESTRICTIONS__PORK = eINSTANCE.getFoodRestrictions_Pork();

		/**
		 * The meta object literal for the '<em><b>Lactose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_RESTRICTIONS__LACTOSE = eINSTANCE.getFoodRestrictions_Lactose();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_RESTRICTIONS__OTHER = eINSTANCE.getFoodRestrictions_Other();

		/**
		 * The meta object literal for the '{@link conference.impl.PaymentDataImpl <em>Payment Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.PaymentDataImpl
		 * @see conference.impl.ConferencePackageImpl#getPaymentData()
		 * @generated
		 */
		EClass PAYMENT_DATA = eINSTANCE.getPaymentData();

		/**
		 * The meta object literal for the '<em><b>Credit Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CREDIT_CARD_TYPE = eINSTANCE.getPaymentData_CreditCardType();

		/**
		 * The meta object literal for the '<em><b>Cardholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CARDHOLDER = eINSTANCE.getPaymentData_Cardholder();

		/**
		 * The meta object literal for the '<em><b>Cardnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CARDNUMBER = eINSTANCE.getPaymentData_Cardnumber();

		/**
		 * The meta object literal for the '<em><b>Expiration Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__EXPIRATION_MONTH = eINSTANCE.getPaymentData_ExpirationMonth();

		/**
		 * The meta object literal for the '<em><b>Expiration Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__EXPIRATION_YEAR = eINSTANCE.getPaymentData_ExpirationYear();

		/**
		 * The meta object literal for the '<em><b>CVV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DATA__CVV = eINSTANCE.getPaymentData_CVV();

		/**
		 * The meta object literal for the '{@link conference.Title <em>Title</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Title
		 * @see conference.impl.ConferencePackageImpl#getTitle()
		 * @generated
		 */
		EEnum TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link conference.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Gender
		 * @see conference.impl.ConferencePackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link conference.Diet <em>Diet</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Diet
		 * @see conference.impl.ConferencePackageImpl#getDiet()
		 * @generated
		 */
		EEnum DIET = eINSTANCE.getDiet();

		/**
		 * The meta object literal for the '{@link conference.CreditCardType <em>Credit Card Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.CreditCardType
		 * @see conference.impl.ConferencePackageImpl#getCreditCardType()
		 * @generated
		 */
		EEnum CREDIT_CARD_TYPE = eINSTANCE.getCreditCardType();

	}

} //ConferencePackage
