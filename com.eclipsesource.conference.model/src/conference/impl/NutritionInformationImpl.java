/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.Diet;
import conference.FoodRestrictions;
import conference.NutritionInformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.NutritionInformationImpl#getDiet <em>Diet</em>}</li>
 *   <li>{@link conference.impl.NutritionInformationImpl#isKosher <em>Kosher</em>}</li>
 *   <li>{@link conference.impl.NutritionInformationImpl#isHalal <em>Halal</em>}</li>
 *   <li>{@link conference.impl.NutritionInformationImpl#getFoodRestrictions <em>Food Restrictions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionInformationImpl extends MinimalEObjectImpl.Container implements NutritionInformation {
	/**
	 * The default value of the '{@link #getDiet() <em>Diet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiet()
	 * @generated
	 * @ordered
	 */
	protected static final Diet DIET_EDEFAULT = Diet.CARNIVORE;

	/**
	 * The cached value of the '{@link #getDiet() <em>Diet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiet()
	 * @generated
	 * @ordered
	 */
	protected Diet diet = DIET_EDEFAULT;

	/**
	 * The default value of the '{@link #isKosher() <em>Kosher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKosher()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KOSHER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKosher() <em>Kosher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKosher()
	 * @generated
	 * @ordered
	 */
	protected boolean kosher = KOSHER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHalal() <em>Halal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHalal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HALAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHalal() <em>Halal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHalal()
	 * @generated
	 * @ordered
	 */
	protected boolean halal = HALAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFoodRestrictions() <em>Food Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodRestrictions()
	 * @generated
	 * @ordered
	 */
	protected FoodRestrictions foodRestrictions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.NUTRITION_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet getDiet() {
		return diet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiet(Diet newDiet) {
		Diet oldDiet = diet;
		diet = newDiet == null ? DIET_EDEFAULT : newDiet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.NUTRITION_INFORMATION__DIET, oldDiet, diet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKosher() {
		return kosher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKosher(boolean newKosher) {
		boolean oldKosher = kosher;
		kosher = newKosher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.NUTRITION_INFORMATION__KOSHER, oldKosher, kosher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHalal() {
		return halal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHalal(boolean newHalal) {
		boolean oldHalal = halal;
		halal = newHalal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.NUTRITION_INFORMATION__HALAL, oldHalal, halal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodRestrictions getFoodRestrictions() {
		return foodRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoodRestrictions(FoodRestrictions newFoodRestrictions, NotificationChain msgs) {
		FoodRestrictions oldFoodRestrictions = foodRestrictions;
		foodRestrictions = newFoodRestrictions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS, oldFoodRestrictions, newFoodRestrictions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodRestrictions(FoodRestrictions newFoodRestrictions) {
		if (newFoodRestrictions != foodRestrictions) {
			NotificationChain msgs = null;
			if (foodRestrictions != null)
				msgs = ((InternalEObject)foodRestrictions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS, null, msgs);
			if (newFoodRestrictions != null)
				msgs = ((InternalEObject)newFoodRestrictions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS, null, msgs);
			msgs = basicSetFoodRestrictions(newFoodRestrictions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS, newFoodRestrictions, newFoodRestrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS:
				return basicSetFoodRestrictions(null, msgs);
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
			case ConferencePackage.NUTRITION_INFORMATION__DIET:
				return getDiet();
			case ConferencePackage.NUTRITION_INFORMATION__KOSHER:
				return isKosher();
			case ConferencePackage.NUTRITION_INFORMATION__HALAL:
				return isHalal();
			case ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS:
				return getFoodRestrictions();
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
			case ConferencePackage.NUTRITION_INFORMATION__DIET:
				setDiet((Diet)newValue);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__KOSHER:
				setKosher((Boolean)newValue);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__HALAL:
				setHalal((Boolean)newValue);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS:
				setFoodRestrictions((FoodRestrictions)newValue);
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
			case ConferencePackage.NUTRITION_INFORMATION__DIET:
				setDiet(DIET_EDEFAULT);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__KOSHER:
				setKosher(KOSHER_EDEFAULT);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__HALAL:
				setHalal(HALAL_EDEFAULT);
				return;
			case ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS:
				setFoodRestrictions((FoodRestrictions)null);
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
			case ConferencePackage.NUTRITION_INFORMATION__DIET:
				return diet != DIET_EDEFAULT;
			case ConferencePackage.NUTRITION_INFORMATION__KOSHER:
				return kosher != KOSHER_EDEFAULT;
			case ConferencePackage.NUTRITION_INFORMATION__HALAL:
				return halal != HALAL_EDEFAULT;
			case ConferencePackage.NUTRITION_INFORMATION__FOOD_RESTRICTIONS:
				return foodRestrictions != null;
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
		result.append(" (diet: ");
		result.append(diet);
		result.append(", kosher: ");
		result.append(kosher);
		result.append(", halal: ");
		result.append(halal);
		result.append(')');
		return result.toString();
	}

} //NutritionInformationImpl
