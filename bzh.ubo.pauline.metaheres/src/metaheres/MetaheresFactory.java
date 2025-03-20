/**
 */
package metaheres;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaheres.MetaheresPackage
 * @generated
 */
public interface MetaheresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaheresFactory eINSTANCE = metaheres.impl.MetaheresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Name</em>'.
	 * @generated
	 */
	ServiceName createServiceName();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Status List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status List</em>'.
	 * @generated
	 */
	StatusList createStatusList();

	/**
	 * Returns a new object of class '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Config</em>'.
	 * @generated
	 */
	ServiceConfig createServiceConfig();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Reservations Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservations Config</em>'.
	 * @generated
	 */
	ReservationsConfig createReservationsConfig();

	/**
	 * Returns a new object of class '<em>Resources Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Config</em>'.
	 * @generated
	 */
	ResourcesConfig createResourcesConfig();

	/**
	 * Returns a new object of class '<em>Lots Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lots Config</em>'.
	 * @generated
	 */
	LotsConfig createLotsConfig();

	/**
	 * Returns a new object of class '<em>Pricing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricing System</em>'.
	 * @generated
	 */
	PricingSystem createPricingSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaheresPackage getMetaheresPackage();

} //MetaheresFactory
