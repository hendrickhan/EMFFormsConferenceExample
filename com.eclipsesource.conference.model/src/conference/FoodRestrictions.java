/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Food Restrictions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.FoodRestrictions#isPeanuts <em>Peanuts</em>}</li>
 *   <li>{@link conference.FoodRestrictions#isLactose <em>Lactose</em>}</li>
 *   <li>{@link conference.FoodRestrictions#getOther <em>Other</em>}</li>
 *   <li>{@link conference.FoodRestrictions#isGluten <em>Gluten</em>}</li>
 *   <li>{@link conference.FoodRestrictions#isPork <em>Pork</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getFoodRestrictions()
 * @model
 * @generated
 */
public interface FoodRestrictions extends EObject {
	/**
	 * Returns the value of the '<em><b>Peanuts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peanuts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peanuts</em>' attribute.
	 * @see #setPeanuts(boolean)
	 * @see conference.ConferencePackage#getFoodRestrictions_Peanuts()
	 * @model
	 * @generated
	 */
	boolean isPeanuts();

	/**
	 * Sets the value of the '{@link conference.FoodRestrictions#isPeanuts <em>Peanuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peanuts</em>' attribute.
	 * @see #isPeanuts()
	 * @generated
	 */
	void setPeanuts(boolean value);

	/**
	 * Returns the value of the '<em><b>Gluten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gluten</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gluten</em>' attribute.
	 * @see #setGluten(boolean)
	 * @see conference.ConferencePackage#getFoodRestrictions_Gluten()
	 * @model
	 * @generated
	 */
	boolean isGluten();

	/**
	 * Sets the value of the '{@link conference.FoodRestrictions#isGluten <em>Gluten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gluten</em>' attribute.
	 * @see #isGluten()
	 * @generated
	 */
	void setGluten(boolean value);

	/**
	 * Returns the value of the '<em><b>Pork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pork</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pork</em>' attribute.
	 * @see #setPork(boolean)
	 * @see conference.ConferencePackage#getFoodRestrictions_Pork()
	 * @model
	 * @generated
	 */
	boolean isPork();

	/**
	 * Sets the value of the '{@link conference.FoodRestrictions#isPork <em>Pork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pork</em>' attribute.
	 * @see #isPork()
	 * @generated
	 */
	void setPork(boolean value);

	/**
	 * Returns the value of the '<em><b>Lactose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lactose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lactose</em>' attribute.
	 * @see #setLactose(boolean)
	 * @see conference.ConferencePackage#getFoodRestrictions_Lactose()
	 * @model
	 * @generated
	 */
	boolean isLactose();

	/**
	 * Sets the value of the '{@link conference.FoodRestrictions#isLactose <em>Lactose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lactose</em>' attribute.
	 * @see #isLactose()
	 * @generated
	 */
	void setLactose(boolean value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(String)
	 * @see conference.ConferencePackage#getFoodRestrictions_Other()
	 * @model
	 * @generated
	 */
	String getOther();

	/**
	 * Sets the value of the '{@link conference.FoodRestrictions#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(String value);

} // FoodRestrictions
