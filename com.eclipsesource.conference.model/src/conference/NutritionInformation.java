/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.NutritionInformation#getDiet <em>Diet</em>}</li>
 *   <li>{@link conference.NutritionInformation#getFoodRestrictions <em>Food Restrictions</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getNutritionInformation()
 * @model
 * @generated
 */
public interface NutritionInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Diet</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Diet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diet</em>' attribute.
	 * @see conference.Diet
	 * @see #setDiet(Diet)
	 * @see conference.ConferencePackage#getNutritionInformation_Diet()
	 * @model
	 * @generated
	 */
	Diet getDiet();

	/**
	 * Sets the value of the '{@link conference.NutritionInformation#getDiet <em>Diet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diet</em>' attribute.
	 * @see conference.Diet
	 * @see #getDiet()
	 * @generated
	 */
	void setDiet(Diet value);

	/**
	 * Returns the value of the '<em><b>Food Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Restrictions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Restrictions</em>' containment reference.
	 * @see #setFoodRestrictions(FoodRestrictions)
	 * @see conference.ConferencePackage#getNutritionInformation_FoodRestrictions()
	 * @model containment="true"
	 * @generated
	 */
	FoodRestrictions getFoodRestrictions();

	/**
	 * Sets the value of the '{@link conference.NutritionInformation#getFoodRestrictions <em>Food Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Restrictions</em>' containment reference.
	 * @see #getFoodRestrictions()
	 * @generated
	 */
	void setFoodRestrictions(FoodRestrictions value);

} // NutritionInformation
