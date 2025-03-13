/**
 */
package metaheres;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.ResourcesConfig#isIsConsumable <em>Is Consumable</em>}</li>
 *   <li>{@link metaheres.ResourcesConfig#isIsLoan <em>Is Loan</em>}</li>
 *   <li>{@link metaheres.ResourcesConfig#isIsCharged <em>Is Charged</em>}</li>
 *   <li>{@link metaheres.ResourcesConfig#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getResourcesConfig()
 * @model
 * @generated
 */
public interface ResourcesConfig extends ReservableEntity {
	/**
	 * Returns the value of the '<em><b>Is Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consumable</em>' attribute.
	 * @see #setIsConsumable(boolean)
	 * @see metaheres.MetaheresPackage#getResourcesConfig_IsConsumable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsConsumable();

	/**
	 * Sets the value of the '{@link metaheres.ResourcesConfig#isIsConsumable <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consumable</em>' attribute.
	 * @see #isIsConsumable()
	 * @generated
	 */
	void setIsConsumable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Loan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Loan</em>' attribute.
	 * @see #setIsLoan(boolean)
	 * @see metaheres.MetaheresPackage#getResourcesConfig_IsLoan()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsLoan();

	/**
	 * Sets the value of the '{@link metaheres.ResourcesConfig#isIsLoan <em>Is Loan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Loan</em>' attribute.
	 * @see #isIsLoan()
	 * @generated
	 */
	void setIsLoan(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Charged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Charged</em>' attribute.
	 * @see #setIsCharged(boolean)
	 * @see metaheres.MetaheresPackage#getResourcesConfig_IsCharged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsCharged();

	/**
	 * Sets the value of the '{@link metaheres.ResourcesConfig#isIsCharged <em>Is Charged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Charged</em>' attribute.
	 * @see #isIsCharged()
	 * @generated
	 */
	void setIsCharged(boolean value);

	/**
	 * Returns the value of the '<em><b>Serviceconfig</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ServiceConfig#getResourcesconfig <em>Resourcesconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceconfig</em>' container reference.
	 * @see #setServiceconfig(ServiceConfig)
	 * @see metaheres.MetaheresPackage#getResourcesConfig_Serviceconfig()
	 * @see metaheres.ServiceConfig#getResourcesconfig
	 * @model opposite="resourcesconfig" transient="false"
	 * @generated
	 */
	ServiceConfig getServiceconfig();

	/**
	 * Sets the value of the '{@link metaheres.ResourcesConfig#getServiceconfig <em>Serviceconfig</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceconfig</em>' container reference.
	 * @see #getServiceconfig()
	 * @generated
	 */
	void setServiceconfig(ServiceConfig value);

} // ResourcesConfig
