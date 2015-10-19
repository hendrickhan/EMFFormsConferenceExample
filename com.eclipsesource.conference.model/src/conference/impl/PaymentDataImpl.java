/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.CreditCardType;
import conference.PaymentData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.PaymentDataImpl#getCreditCardType <em>Credit Card Type</em>}</li>
 *   <li>{@link conference.impl.PaymentDataImpl#getCardholder <em>Cardholder</em>}</li>
 *   <li>{@link conference.impl.PaymentDataImpl#getCardnumber <em>Cardnumber</em>}</li>
 *   <li>{@link conference.impl.PaymentDataImpl#getExpirationMonth <em>Expiration Month</em>}</li>
 *   <li>{@link conference.impl.PaymentDataImpl#getExpirationYear <em>Expiration Year</em>}</li>
 *   <li>{@link conference.impl.PaymentDataImpl#getCVV <em>CVV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentDataImpl extends MinimalEObjectImpl.Container implements PaymentData {
	/**
	 * The default value of the '{@link #getCreditCardType() <em>Credit Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardType()
	 * @generated
	 * @ordered
	 */
	protected static final CreditCardType CREDIT_CARD_TYPE_EDEFAULT = CreditCardType.VISA;

	/**
	 * The cached value of the '{@link #getCreditCardType() <em>Credit Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardType()
	 * @generated
	 * @ordered
	 */
	protected CreditCardType creditCardType = CREDIT_CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardholder() <em>Cardholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholder()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardholder() <em>Cardholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholder()
	 * @generated
	 * @ordered
	 */
	protected String cardholder = CARDHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardnumber() <em>Cardnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardnumber() <em>Cardnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardnumber()
	 * @generated
	 * @ordered
	 */
	protected String cardnumber = CARDNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationMonth() <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpirationMonth() <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationMonth()
	 * @generated
	 * @ordered
	 */
	protected int expirationMonth = EXPIRATION_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationYear() <em>Expiration Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationYear()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpirationYear() <em>Expiration Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationYear()
	 * @generated
	 * @ordered
	 */
	protected int expirationYear = EXPIRATION_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVV() <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVV()
	 * @generated
	 * @ordered
	 */
	protected static final int CVV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCVV() <em>CVV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVV()
	 * @generated
	 * @ordered
	 */
	protected int cvv = CVV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.PAYMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardType getCreditCardType() {
		return creditCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardType(CreditCardType newCreditCardType) {
		CreditCardType oldCreditCardType = creditCardType;
		creditCardType = newCreditCardType == null ? CREDIT_CARD_TYPE_EDEFAULT : newCreditCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__CREDIT_CARD_TYPE, oldCreditCardType, creditCardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardholder() {
		return cardholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardholder(String newCardholder) {
		String oldCardholder = cardholder;
		cardholder = newCardholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__CARDHOLDER, oldCardholder, cardholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardnumber() {
		return cardnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardnumber(String newCardnumber) {
		String oldCardnumber = cardnumber;
		cardnumber = newCardnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__CARDNUMBER, oldCardnumber, cardnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationMonth(int newExpirationMonth) {
		int oldExpirationMonth = expirationMonth;
		expirationMonth = newExpirationMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__EXPIRATION_MONTH, oldExpirationMonth, expirationMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpirationYear() {
		return expirationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationYear(int newExpirationYear) {
		int oldExpirationYear = expirationYear;
		expirationYear = newExpirationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__EXPIRATION_YEAR, oldExpirationYear, expirationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCVV() {
		return cvv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVV(int newCVV) {
		int oldCVV = cvv;
		cvv = newCVV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PAYMENT_DATA__CVV, oldCVV, cvv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.PAYMENT_DATA__CREDIT_CARD_TYPE:
				return getCreditCardType();
			case ConferencePackage.PAYMENT_DATA__CARDHOLDER:
				return getCardholder();
			case ConferencePackage.PAYMENT_DATA__CARDNUMBER:
				return getCardnumber();
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_MONTH:
				return getExpirationMonth();
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_YEAR:
				return getExpirationYear();
			case ConferencePackage.PAYMENT_DATA__CVV:
				return getCVV();
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
			case ConferencePackage.PAYMENT_DATA__CREDIT_CARD_TYPE:
				setCreditCardType((CreditCardType)newValue);
				return;
			case ConferencePackage.PAYMENT_DATA__CARDHOLDER:
				setCardholder((String)newValue);
				return;
			case ConferencePackage.PAYMENT_DATA__CARDNUMBER:
				setCardnumber((String)newValue);
				return;
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_MONTH:
				setExpirationMonth((Integer)newValue);
				return;
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_YEAR:
				setExpirationYear((Integer)newValue);
				return;
			case ConferencePackage.PAYMENT_DATA__CVV:
				setCVV((Integer)newValue);
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
			case ConferencePackage.PAYMENT_DATA__CREDIT_CARD_TYPE:
				setCreditCardType(CREDIT_CARD_TYPE_EDEFAULT);
				return;
			case ConferencePackage.PAYMENT_DATA__CARDHOLDER:
				setCardholder(CARDHOLDER_EDEFAULT);
				return;
			case ConferencePackage.PAYMENT_DATA__CARDNUMBER:
				setCardnumber(CARDNUMBER_EDEFAULT);
				return;
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_MONTH:
				setExpirationMonth(EXPIRATION_MONTH_EDEFAULT);
				return;
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_YEAR:
				setExpirationYear(EXPIRATION_YEAR_EDEFAULT);
				return;
			case ConferencePackage.PAYMENT_DATA__CVV:
				setCVV(CVV_EDEFAULT);
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
			case ConferencePackage.PAYMENT_DATA__CREDIT_CARD_TYPE:
				return creditCardType != CREDIT_CARD_TYPE_EDEFAULT;
			case ConferencePackage.PAYMENT_DATA__CARDHOLDER:
				return CARDHOLDER_EDEFAULT == null ? cardholder != null : !CARDHOLDER_EDEFAULT.equals(cardholder);
			case ConferencePackage.PAYMENT_DATA__CARDNUMBER:
				return CARDNUMBER_EDEFAULT == null ? cardnumber != null : !CARDNUMBER_EDEFAULT.equals(cardnumber);
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_MONTH:
				return expirationMonth != EXPIRATION_MONTH_EDEFAULT;
			case ConferencePackage.PAYMENT_DATA__EXPIRATION_YEAR:
				return expirationYear != EXPIRATION_YEAR_EDEFAULT;
			case ConferencePackage.PAYMENT_DATA__CVV:
				return cvv != CVV_EDEFAULT;
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
		result.append(" (creditCardType: ");
		result.append(creditCardType);
		result.append(", cardholder: ");
		result.append(cardholder);
		result.append(", cardnumber: ");
		result.append(cardnumber);
		result.append(", expirationMonth: ");
		result.append(expirationMonth);
		result.append(", expirationYear: ");
		result.append(expirationYear);
		result.append(", CVV: ");
		result.append(cvv);
		result.append(')');
		return result.toString();
	}

} //PaymentDataImpl
