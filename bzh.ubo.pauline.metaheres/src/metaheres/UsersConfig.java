/**
 */
package metaheres;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Users Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.UsersConfig#isHasAdress <em>Has Adress</em>}</li>
 *   <li>{@link metaheres.UsersConfig#isHasPhone <em>Has Phone</em>}</li>
 *   <li>{@link metaheres.UsersConfig#getRightslevellist <em>Rightslevellist</em>}</li>
 *   <li>{@link metaheres.UsersConfig#getBloackedAtUnfulfilledReservation <em>Bloacked At Unfulfilled Reservation</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getUsersConfig()
 * @model
 * @generated
 */
public interface UsersConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Adress</em>' attribute.
	 * @see #setHasAdress(boolean)
	 * @see metaheres.MetaheresPackage#getUsersConfig_HasAdress()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasAdress();

	/**
	 * Sets the value of the '{@link metaheres.UsersConfig#isHasAdress <em>Has Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Adress</em>' attribute.
	 * @see #isHasAdress()
	 * @generated
	 */
	void setHasAdress(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Phone</em>' attribute.
	 * @see #setHasPhone(boolean)
	 * @see metaheres.MetaheresPackage#getUsersConfig_HasPhone()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasPhone();

	/**
	 * Sets the value of the '{@link metaheres.UsersConfig#isHasPhone <em>Has Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Phone</em>' attribute.
	 * @see #isHasPhone()
	 * @generated
	 */
	void setHasPhone(boolean value);

	/**
	 * Returns the value of the '<em><b>Rightslevellist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightslevellist</em>' containment reference.
	 * @see #setRightslevellist(RightsLevelList)
	 * @see metaheres.MetaheresPackage#getUsersConfig_Rightslevellist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightsLevelList getRightslevellist();

	/**
	 * Sets the value of the '{@link metaheres.UsersConfig#getRightslevellist <em>Rightslevellist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightslevellist</em>' containment reference.
	 * @see #getRightslevellist()
	 * @generated
	 */
	void setRightslevellist(RightsLevelList value);

	/**
	 * Returns the value of the '<em><b>Bloacked At Unfulfilled Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloacked At Unfulfilled Reservation</em>' attribute.
	 * @see #setBloackedAtUnfulfilledReservation(Boolean)
	 * @see metaheres.MetaheresPackage#getUsersConfig_BloackedAtUnfulfilledReservation()
	 * @model
	 * @generated
	 */
	Boolean getBloackedAtUnfulfilledReservation();

	/**
	 * Sets the value of the '{@link metaheres.UsersConfig#getBloackedAtUnfulfilledReservation <em>Bloacked At Unfulfilled Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloacked At Unfulfilled Reservation</em>' attribute.
	 * @see #getBloackedAtUnfulfilledReservation()
	 * @generated
	 */
	void setBloackedAtUnfulfilledReservation(Boolean value);

} // UsersConfig
