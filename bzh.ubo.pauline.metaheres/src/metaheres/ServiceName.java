/**
 */
package metaheres;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.ServiceName#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getServiceName()
 * @model
 * @generated
 */
public interface ServiceName extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Serviceconfig</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ServiceConfig#getServicename <em>Servicename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceconfig</em>' containment reference.
	 * @see #setServiceconfig(ServiceConfig)
	 * @see metaheres.MetaheresPackage#getServiceName_Serviceconfig()
	 * @see metaheres.ServiceConfig#getServicename
	 * @model opposite="servicename" containment="true" required="true"
	 * @generated
	 */
	ServiceConfig getServiceconfig();

	/**
	 * Sets the value of the '{@link metaheres.ServiceName#getServiceconfig <em>Serviceconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceconfig</em>' containment reference.
	 * @see #getServiceconfig()
	 * @generated
	 */
	void setServiceconfig(ServiceConfig value);

} // ServiceName
