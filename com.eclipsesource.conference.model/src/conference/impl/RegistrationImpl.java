/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.NutritionInformation;
import conference.PaymentData;
import conference.PersonalData;
import conference.Registration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.RegistrationImpl#getId <em>Id</em>}</li>
 *   <li>{@link conference.impl.RegistrationImpl#getPersonalData <em>Personal Data</em>}</li>
 *   <li>{@link conference.impl.RegistrationImpl#getNutritionInformation <em>Nutrition Information</em>}</li>
 *   <li>{@link conference.impl.RegistrationImpl#getPaymentData <em>Payment Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationImpl extends MinimalEObjectImpl.Container implements Registration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonalData() <em>Personal Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalData()
	 * @generated
	 * @ordered
	 */
	protected PersonalData personalData;

	/**
	 * The cached value of the '{@link #getNutritionInformation() <em>Nutrition Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionInformation()
	 * @generated
	 * @ordered
	 */
	protected NutritionInformation nutritionInformation;

	/**
	 * The cached value of the '{@link #getPaymentData() <em>Payment Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentData()
	 * @generated
	 * @ordered
	 */
	protected PaymentData paymentData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.REGISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalData getPersonalData() {
		return personalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonalData(PersonalData newPersonalData, NotificationChain msgs) {
		PersonalData oldPersonalData = personalData;
		personalData = newPersonalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__PERSONAL_DATA, oldPersonalData, newPersonalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalData(PersonalData newPersonalData) {
		if (newPersonalData != personalData) {
			NotificationChain msgs = null;
			if (personalData != null)
				msgs = ((InternalEObject)personalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__PERSONAL_DATA, null, msgs);
			if (newPersonalData != null)
				msgs = ((InternalEObject)newPersonalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__PERSONAL_DATA, null, msgs);
			msgs = basicSetPersonalData(newPersonalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__PERSONAL_DATA, newPersonalData, newPersonalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionInformation getNutritionInformation() {
		return nutritionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionInformation(NutritionInformation newNutritionInformation, NotificationChain msgs) {
		NutritionInformation oldNutritionInformation = nutritionInformation;
		nutritionInformation = newNutritionInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__NUTRITION_INFORMATION, oldNutritionInformation, newNutritionInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionInformation(NutritionInformation newNutritionInformation) {
		if (newNutritionInformation != nutritionInformation) {
			NotificationChain msgs = null;
			if (nutritionInformation != null)
				msgs = ((InternalEObject)nutritionInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__NUTRITION_INFORMATION, null, msgs);
			if (newNutritionInformation != null)
				msgs = ((InternalEObject)newNutritionInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__NUTRITION_INFORMATION, null, msgs);
			msgs = basicSetNutritionInformation(newNutritionInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__NUTRITION_INFORMATION, newNutritionInformation, newNutritionInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentData getPaymentData() {
		return paymentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentData(PaymentData newPaymentData, NotificationChain msgs) {
		PaymentData oldPaymentData = paymentData;
		paymentData = newPaymentData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__PAYMENT_DATA, oldPaymentData, newPaymentData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentData(PaymentData newPaymentData) {
		if (newPaymentData != paymentData) {
			NotificationChain msgs = null;
			if (paymentData != null)
				msgs = ((InternalEObject)paymentData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__PAYMENT_DATA, null, msgs);
			if (newPaymentData != null)
				msgs = ((InternalEObject)newPaymentData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.REGISTRATION__PAYMENT_DATA, null, msgs);
			msgs = basicSetPaymentData(newPaymentData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.REGISTRATION__PAYMENT_DATA, newPaymentData, newPaymentData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.REGISTRATION__PERSONAL_DATA:
				return basicSetPersonalData(null, msgs);
			case ConferencePackage.REGISTRATION__NUTRITION_INFORMATION:
				return basicSetNutritionInformation(null, msgs);
			case ConferencePackage.REGISTRATION__PAYMENT_DATA:
				return basicSetPaymentData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.REGISTRATION__ID:
				return getId();
			case ConferencePackage.REGISTRATION__PERSONAL_DATA:
				return getPersonalData();
			case ConferencePackage.REGISTRATION__NUTRITION_INFORMATION:
				return getNutritionInformation();
			case ConferencePackage.REGISTRATION__PAYMENT_DATA:
				return getPaymentData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.REGISTRATION__ID:
				setId((String)newValue);
				return;
			case ConferencePackage.REGISTRATION__PERSONAL_DATA:
				setPersonalData((PersonalData)newValue);
				return;
			case ConferencePackage.REGISTRATION__NUTRITION_INFORMATION:
				setNutritionInformation((NutritionInformation)newValue);
				return;
			case ConferencePackage.REGISTRATION__PAYMENT_DATA:
				setPaymentData((PaymentData)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConferencePackage.REGISTRATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ConferencePackage.REGISTRATION__PERSONAL_DATA:
				setPersonalData((PersonalData)null);
				return;
			case ConferencePackage.REGISTRATION__NUTRITION_INFORMATION:
				setNutritionInformation((NutritionInformation)null);
				return;
			case ConferencePackage.REGISTRATION__PAYMENT_DATA:
				setPaymentData((PaymentData)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConferencePackage.REGISTRATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConferencePackage.REGISTRATION__PERSONAL_DATA:
				return personalData != null;
			case ConferencePackage.REGISTRATION__NUTRITION_INFORMATION:
				return nutritionInformation != null;
			case ConferencePackage.REGISTRATION__PAYMENT_DATA:
				return paymentData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RegistrationImpl
