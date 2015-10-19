/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.FoodRestrictions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Food Restrictions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.FoodRestrictionsImpl#isPeanuts <em>Peanuts</em>}</li>
 *   <li>{@link conference.impl.FoodRestrictionsImpl#isGluten <em>Gluten</em>}</li>
 *   <li>{@link conference.impl.FoodRestrictionsImpl#isLactose <em>Lactose</em>}</li>
 *   <li>{@link conference.impl.FoodRestrictionsImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoodRestrictionsImpl extends MinimalEObjectImpl.Container implements FoodRestrictions {
	/**
	 * The default value of the '{@link #isPeanuts() <em>Peanuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeanuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEANUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeanuts() <em>Peanuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeanuts()
	 * @generated
	 * @ordered
	 */
	protected boolean peanuts = PEANUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGluten() <em>Gluten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGluten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLUTEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGluten() <em>Gluten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGluten()
	 * @generated
	 * @ordered
	 */
	protected boolean gluten = GLUTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isLactose() <em>Lactose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLactose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LACTOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLactose() <em>Lactose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLactose()
	 * @generated
	 * @ordered
	 */
	protected boolean lactose = LACTOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected String other = OTHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodRestrictionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.FOOD_RESTRICTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeanuts() {
		return peanuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeanuts(boolean newPeanuts) {
		boolean oldPeanuts = peanuts;
		peanuts = newPeanuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.FOOD_RESTRICTIONS__PEANUTS, oldPeanuts, peanuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGluten() {
		return gluten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluten(boolean newGluten) {
		boolean oldGluten = gluten;
		gluten = newGluten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.FOOD_RESTRICTIONS__GLUTEN, oldGluten, gluten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLactose() {
		return lactose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLactose(boolean newLactose) {
		boolean oldLactose = lactose;
		lactose = newLactose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.FOOD_RESTRICTIONS__LACTOSE, oldLactose, lactose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(String newOther) {
		String oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.FOOD_RESTRICTIONS__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.FOOD_RESTRICTIONS__PEANUTS:
				return isPeanuts();
			case ConferencePackage.FOOD_RESTRICTIONS__GLUTEN:
				return isGluten();
			case ConferencePackage.FOOD_RESTRICTIONS__LACTOSE:
				return isLactose();
			case ConferencePackage.FOOD_RESTRICTIONS__OTHER:
				return getOther();
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
			case ConferencePackage.FOOD_RESTRICTIONS__PEANUTS:
				setPeanuts((Boolean)newValue);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__GLUTEN:
				setGluten((Boolean)newValue);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__LACTOSE:
				setLactose((Boolean)newValue);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__OTHER:
				setOther((String)newValue);
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
			case ConferencePackage.FOOD_RESTRICTIONS__PEANUTS:
				setPeanuts(PEANUTS_EDEFAULT);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__GLUTEN:
				setGluten(GLUTEN_EDEFAULT);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__LACTOSE:
				setLactose(LACTOSE_EDEFAULT);
				return;
			case ConferencePackage.FOOD_RESTRICTIONS__OTHER:
				setOther(OTHER_EDEFAULT);
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
			case ConferencePackage.FOOD_RESTRICTIONS__PEANUTS:
				return peanuts != PEANUTS_EDEFAULT;
			case ConferencePackage.FOOD_RESTRICTIONS__GLUTEN:
				return gluten != GLUTEN_EDEFAULT;
			case ConferencePackage.FOOD_RESTRICTIONS__LACTOSE:
				return lactose != LACTOSE_EDEFAULT;
			case ConferencePackage.FOOD_RESTRICTIONS__OTHER:
				return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
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
		result.append(" (peanuts: ");
		result.append(peanuts);
		result.append(", gluten: ");
		result.append(gluten);
		result.append(", lactose: ");
		result.append(lactose);
		result.append(", other: ");
		result.append(other);
		result.append(')');
		return result.toString();
	}

} //FoodRestrictionsImpl
