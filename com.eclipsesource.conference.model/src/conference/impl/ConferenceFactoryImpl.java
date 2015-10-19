/**
 */
package conference.impl;

import conference.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceFactoryImpl extends EFactoryImpl implements ConferenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConferenceFactory init() {
		try {
			ConferenceFactory theConferenceFactory = (ConferenceFactory)EPackage.Registry.INSTANCE.getEFactory(ConferencePackage.eNS_URI);
			if (theConferenceFactory != null) {
				return theConferenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConferenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConferencePackage.REGISTRATION: return createRegistration();
			case ConferencePackage.PERSONAL_DATA: return createPersonalData();
			case ConferencePackage.NUTRITION_INFORMATION: return createNutritionInformation();
			case ConferencePackage.FOOD_RESTRICTIONS: return createFoodRestrictions();
			case ConferencePackage.PAYMENT_DATA: return createPaymentData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConferencePackage.TITLE:
				return createTitleFromString(eDataType, initialValue);
			case ConferencePackage.GENDER:
				return createGenderFromString(eDataType, initialValue);
			case ConferencePackage.DIET:
				return createDietFromString(eDataType, initialValue);
			case ConferencePackage.CREDIT_CARD_TYPE:
				return createCreditCardTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConferencePackage.TITLE:
				return convertTitleToString(eDataType, instanceValue);
			case ConferencePackage.GENDER:
				return convertGenderToString(eDataType, instanceValue);
			case ConferencePackage.DIET:
				return convertDietToString(eDataType, instanceValue);
			case ConferencePackage.CREDIT_CARD_TYPE:
				return convertCreditCardTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registration createRegistration() {
		RegistrationImpl registration = new RegistrationImpl();
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalData createPersonalData() {
		PersonalDataImpl personalData = new PersonalDataImpl();
		return personalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionInformation createNutritionInformation() {
		NutritionInformationImpl nutritionInformation = new NutritionInformationImpl();
		return nutritionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodRestrictions createFoodRestrictions() {
		FoodRestrictionsImpl foodRestrictions = new FoodRestrictionsImpl();
		return foodRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentData createPaymentData() {
		PaymentDataImpl paymentData = new PaymentDataImpl();
		return paymentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitleFromString(EDataType eDataType, String initialValue) {
		Title result = Title.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet createDietFromString(EDataType eDataType, String initialValue) {
		Diet result = Diet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardType createCreditCardTypeFromString(EDataType eDataType, String initialValue) {
		CreditCardType result = CreditCardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreditCardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferencePackage getConferencePackage() {
		return (ConferencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConferencePackage getPackage() {
		return ConferencePackage.eINSTANCE;
	}

} //ConferenceFactoryImpl
