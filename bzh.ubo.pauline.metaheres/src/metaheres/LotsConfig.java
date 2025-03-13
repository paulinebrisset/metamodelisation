/**
 */
package metaheres;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lots Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.LotsConfig#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getLotsConfig()
 * @model
 * @generated
 */
public interface LotsConfig extends ReservableEntity {
	/**
	 * Returns the value of the '<em><b>Serviceconfig</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ServiceConfig#getLotsconfig <em>Lotsconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceconfig</em>' container reference.
	 * @see #setServiceconfig(ServiceConfig)
	 * @see metaheres.MetaheresPackage#getLotsConfig_Serviceconfig()
	 * @see metaheres.ServiceConfig#getLotsconfig
	 * @model opposite="lotsconfig" transient="false"
	 * @generated
	 */
	ServiceConfig getServiceconfig();

	/**
	 * Sets the value of the '{@link metaheres.LotsConfig#getServiceconfig <em>Serviceconfig</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceconfig</em>' container reference.
	 * @see #getServiceconfig()
	 * @generated
	 */
	void setServiceconfig(ServiceConfig value);

} // LotsConfig
