/**
 */
package conference.impl;

import conference.ConferenceFactory;
import conference.ConferencePackage;
import conference.CreditCardType;
import conference.Diet;
import conference.FoodRestrictions;
import conference.Gender;
import conference.NutritionInformation;
import conference.PaymentData;
import conference.PersonalData;
import conference.Registration;
import conference.Title;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferencePackageImpl extends EPackageImpl implements ConferencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodRestrictionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum creditCardTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see conference.ConferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConferencePackageImpl() {
		super(eNS_URI, ConferenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConferencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConferencePackage init() {
		if (isInited) return (ConferencePackage)EPackage.Registry.INSTANCE.getEPackage(ConferencePackage.eNS_URI);

		// Obtain or create and register package
		ConferencePackageImpl theConferencePackage = (ConferencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConferencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConferencePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConferencePackage.createPackageContents();

		// Initialize created meta-data
		theConferencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConferencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConferencePackage.eNS_URI, theConferencePackage);
		return theConferencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistration() {
		return registrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_Id() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_PersonalData() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_NutritionInformation() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistration_PaymentData() {
		return (EReference)registrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistration_RegistrationTime() {
		return (EAttribute)registrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalData() {
		return personalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalData_FirstName() {
		return (EAttribute)personalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalData_LastName() {
		return (EAttribute)personalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalData_Title() {
		return (EAttribute)personalDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalData_DateOfBirth() {
		return (EAttribute)personalDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalData_Gender() {
		return (EAttribute)personalDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionInformation() {
		return nutritionInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutritionInformation_Diet() {
		return (EAttribute)nutritionInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionInformation_FoodRestrictions() {
		return (EReference)nutritionInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoodRestrictions() {
		return foodRestrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodRestrictions_Peanuts() {
		return (EAttribute)foodRestrictionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodRestrictions_Gluten() {
		return (EAttribute)foodRestrictionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodRestrictions_Pork() {
		return (EAttribute)foodRestrictionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodRestrictions_Lactose() {
		return (EAttribute)foodRestrictionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoodRestrictions_Other() {
		return (EAttribute)foodRestrictionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentData() {
		return paymentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_CreditCardType() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_Cardholder() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_Cardnumber() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_ExpirationMonth() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_ExpirationYear() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentData_CVV() {
		return (EAttribute)paymentDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitle() {
		return titleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiet() {
		return dietEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCreditCardType() {
		return creditCardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceFactory getConferenceFactory() {
		return (ConferenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		registrationEClass = createEClass(REGISTRATION);
		createEAttribute(registrationEClass, REGISTRATION__ID);
		createEReference(registrationEClass, REGISTRATION__PERSONAL_DATA);
		createEReference(registrationEClass, REGISTRATION__NUTRITION_INFORMATION);
		createEReference(registrationEClass, REGISTRATION__PAYMENT_DATA);
		createEAttribute(registrationEClass, REGISTRATION__REGISTRATION_TIME);

		personalDataEClass = createEClass(PERSONAL_DATA);
		createEAttribute(personalDataEClass, PERSONAL_DATA__FIRST_NAME);
		createEAttribute(personalDataEClass, PERSONAL_DATA__LAST_NAME);
		createEAttribute(personalDataEClass, PERSONAL_DATA__TITLE);
		createEAttribute(personalDataEClass, PERSONAL_DATA__DATE_OF_BIRTH);
		createEAttribute(personalDataEClass, PERSONAL_DATA__GENDER);

		nutritionInformationEClass = createEClass(NUTRITION_INFORMATION);
		createEAttribute(nutritionInformationEClass, NUTRITION_INFORMATION__DIET);
		createEReference(nutritionInformationEClass, NUTRITION_INFORMATION__FOOD_RESTRICTIONS);

		foodRestrictionsEClass = createEClass(FOOD_RESTRICTIONS);
		createEAttribute(foodRestrictionsEClass, FOOD_RESTRICTIONS__PEANUTS);
		createEAttribute(foodRestrictionsEClass, FOOD_RESTRICTIONS__LACTOSE);
		createEAttribute(foodRestrictionsEClass, FOOD_RESTRICTIONS__OTHER);
		createEAttribute(foodRestrictionsEClass, FOOD_RESTRICTIONS__GLUTEN);
		createEAttribute(foodRestrictionsEClass, FOOD_RESTRICTIONS__PORK);

		paymentDataEClass = createEClass(PAYMENT_DATA);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__CREDIT_CARD_TYPE);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__CARDHOLDER);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__CARDNUMBER);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__EXPIRATION_MONTH);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__EXPIRATION_YEAR);
		createEAttribute(paymentDataEClass, PAYMENT_DATA__CVV);

		// Create enums
		titleEEnum = createEEnum(TITLE);
		genderEEnum = createEEnum(GENDER);
		dietEEnum = createEEnum(DIET);
		creditCardTypeEEnum = createEEnum(CREDIT_CARD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(registrationEClass, Registration.class, "Registration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistration_Id(), ecorePackage.getEString(), "id", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_PersonalData(), this.getPersonalData(), null, "personalData", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_NutritionInformation(), this.getNutritionInformation(), null, "nutritionInformation", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistration_PaymentData(), this.getPaymentData(), null, "paymentData", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistration_RegistrationTime(), ecorePackage.getEDate(), "registrationTime", null, 0, 1, Registration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalDataEClass, PersonalData.class, "PersonalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalData_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, PersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalData_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, PersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalData_Title(), this.getTitle(), "title", null, 1, 1, PersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalData_DateOfBirth(), ecorePackage.getEDate(), "dateOfBirth", null, 0, 1, PersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalData_Gender(), this.getGender(), "gender", null, 0, 1, PersonalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutritionInformationEClass, NutritionInformation.class, "NutritionInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutritionInformation_Diet(), this.getDiet(), "diet", null, 0, 1, NutritionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionInformation_FoodRestrictions(), this.getFoodRestrictions(), null, "foodRestrictions", null, 0, 1, NutritionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foodRestrictionsEClass, FoodRestrictions.class, "FoodRestrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoodRestrictions_Peanuts(), ecorePackage.getEBoolean(), "peanuts", null, 0, 1, FoodRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodRestrictions_Lactose(), ecorePackage.getEBoolean(), "lactose", null, 0, 1, FoodRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodRestrictions_Other(), ecorePackage.getEString(), "other", null, 0, 1, FoodRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodRestrictions_Gluten(), ecorePackage.getEBoolean(), "gluten", null, 0, 1, FoodRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoodRestrictions_Pork(), ecorePackage.getEBoolean(), "pork", null, 0, 1, FoodRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentDataEClass, PaymentData.class, "PaymentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentData_CreditCardType(), this.getCreditCardType(), "creditCardType", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentData_Cardholder(), ecorePackage.getEString(), "cardholder", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentData_Cardnumber(), ecorePackage.getEInt(), "cardnumber", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentData_ExpirationMonth(), ecorePackage.getEInt(), "expirationMonth", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentData_ExpirationYear(), ecorePackage.getEInt(), "expirationYear", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentData_CVV(), ecorePackage.getEInt(), "CVV", null, 1, 1, PaymentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(titleEEnum, Title.class, "Title");
		addEEnumLiteral(titleEEnum, Title.MRS);
		addEEnumLiteral(titleEEnum, Title.MR);
		addEEnumLiteral(titleEEnum, Title.DR);
		addEEnumLiteral(titleEEnum, Title.PROF);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.UNDEFINED);

		initEEnum(dietEEnum, Diet.class, "Diet");
		addEEnumLiteral(dietEEnum, Diet.CARNIVORE);
		addEEnumLiteral(dietEEnum, Diet.VEGETARIAN);
		addEEnumLiteral(dietEEnum, Diet.VEGAN);
		addEEnumLiteral(dietEEnum, Diet.FRUITARIAN);

		initEEnum(creditCardTypeEEnum, CreditCardType.class, "CreditCardType");
		addEEnumLiteral(creditCardTypeEEnum, CreditCardType.VISA);
		addEEnumLiteral(creditCardTypeEEnum, CreditCardType.MASTERCARD);
		addEEnumLiteral(creditCardTypeEEnum, CreditCardType.AMERICAN_EXPRESS);

		// Create resource
		createResource(eNS_URI);
	}

} //ConferencePackageImpl
