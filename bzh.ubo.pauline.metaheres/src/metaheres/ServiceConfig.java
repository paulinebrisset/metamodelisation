/**
 */
package metaheres;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.ServiceConfig#getServicename <em>Servicename</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getClosesOnPublicHolidays <em>Closes On Public Holidays</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getInventoryIsPublic <em>Inventory Is Public</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getHasChart <em>Has Chart</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getCountInBusinessDays <em>Count In Business Days</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getLanguage <em>Language</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getReservationsconfig <em>Reservationsconfig</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getCountry <em>Country</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getResourcesconfig <em>Resourcesconfig</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getLotsconfig <em>Lotsconfig</em>}</li>
 *   <li>{@link metaheres.ServiceConfig#getPricingsystem <em>Pricingsystem</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getServiceConfig()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allLanguagesFromCountries'"
 * @generated
 */
public interface ServiceConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Servicename</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ServiceName#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicename</em>' container reference.
	 * @see #setServicename(ServiceName)
	 * @see metaheres.MetaheresPackage#getServiceConfig_Servicename()
	 * @see metaheres.ServiceName#getServiceconfig
	 * @model opposite="serviceconfig" transient="false"
	 * @generated
	 */
	ServiceName getServicename();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getServicename <em>Servicename</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicename</em>' container reference.
	 * @see #getServicename()
	 * @generated
	 */
	void setServicename(ServiceName value);

	/**
	 * Returns the value of the '<em><b>Closes On Public Holidays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closes On Public Holidays</em>' attribute.
	 * @see #setClosesOnPublicHolidays(Boolean)
	 * @see metaheres.MetaheresPackage#getServiceConfig_ClosesOnPublicHolidays()
	 * @model
	 * @generated
	 */
	Boolean getClosesOnPublicHolidays();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getClosesOnPublicHolidays <em>Closes On Public Holidays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closes On Public Holidays</em>' attribute.
	 * @see #getClosesOnPublicHolidays()
	 * @generated
	 */
	void setClosesOnPublicHolidays(Boolean value);

	/**
	 * Returns the value of the '<em><b>Inventory Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Is Public</em>' attribute.
	 * @see #setInventoryIsPublic(Boolean)
	 * @see metaheres.MetaheresPackage#getServiceConfig_InventoryIsPublic()
	 * @model
	 * @generated
	 */
	Boolean getInventoryIsPublic();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getInventoryIsPublic <em>Inventory Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Is Public</em>' attribute.
	 * @see #getInventoryIsPublic()
	 * @generated
	 */
	void setInventoryIsPublic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Chart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Chart</em>' attribute.
	 * @see #setHasChart(Boolean)
	 * @see metaheres.MetaheresPackage#getServiceConfig_HasChart()
	 * @model
	 * @generated
	 */
	Boolean getHasChart();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getHasChart <em>Has Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Chart</em>' attribute.
	 * @see #getHasChart()
	 * @generated
	 */
	void setHasChart(Boolean value);

	/**
	 * Returns the value of the '<em><b>Count In Business Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count In Business Days</em>' attribute.
	 * @see #setCountInBusinessDays(Boolean)
	 * @see metaheres.MetaheresPackage#getServiceConfig_CountInBusinessDays()
	 * @model
	 * @generated
	 */
	Boolean getCountInBusinessDays();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getCountInBusinessDays <em>Count In Business Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count In Business Days</em>' attribute.
	 * @see #getCountInBusinessDays()
	 * @generated
	 */
	void setCountInBusinessDays(Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link metaheres.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see metaheres.MetaheresPackage#getServiceConfig_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Reservationsconfig</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ReservationsConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservationsconfig</em>' containment reference.
	 * @see #setReservationsconfig(ReservationsConfig)
	 * @see metaheres.MetaheresPackage#getServiceConfig_Reservationsconfig()
	 * @see metaheres.ReservationsConfig#getServiceconfig
	 * @model opposite="serviceconfig" containment="true" required="true"
	 * @generated
	 */
	ReservationsConfig getReservationsconfig();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getReservationsconfig <em>Reservationsconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservationsconfig</em>' containment reference.
	 * @see #getReservationsconfig()
	 * @generated
	 */
	void setReservationsconfig(ReservationsConfig value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link metaheres.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see metaheres.MetaheresPackage#getServiceConfig_Country()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<Country> getCountry();

	/**
	 * Returns the value of the '<em><b>Resourcesconfig</b></em>' containment reference list.
	 * The list contents are of type {@link metaheres.ResourcesConfig}.
	 * It is bidirectional and its opposite is '{@link metaheres.ResourcesConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcesconfig</em>' containment reference list.
	 * @see metaheres.MetaheresPackage#getServiceConfig_Resourcesconfig()
	 * @see metaheres.ResourcesConfig#getServiceconfig
	 * @model opposite="serviceconfig" containment="true" required="true"
	 * @generated
	 */
	EList<ResourcesConfig> getResourcesconfig();

	/**
	 * Returns the value of the '<em><b>Lotsconfig</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link metaheres.LotsConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lotsconfig</em>' containment reference.
	 * @see #setLotsconfig(LotsConfig)
	 * @see metaheres.MetaheresPackage#getServiceConfig_Lotsconfig()
	 * @see metaheres.LotsConfig#getServiceconfig
	 * @model opposite="serviceconfig" containment="true"
	 * @generated
	 */
	LotsConfig getLotsconfig();

	/**
	 * Sets the value of the '{@link metaheres.ServiceConfig#getLotsconfig <em>Lotsconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lotsconfig</em>' containment reference.
	 * @see #getLotsconfig()
	 * @generated
	 */
	void setLotsconfig(LotsConfig value);

	/**
	 * Returns the value of the '<em><b>Pricingsystem</b></em>' reference list.
	 * The list contents are of type {@link metaheres.PricingSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricingsystem</em>' reference list.
	 * @see metaheres.MetaheresPackage#getServiceConfig_Pricingsystem()
	 * @model upper="3"
	 * @generated
	 */
	EList<PricingSystem> getPricingsystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ServiceConfig.allInstances()-&gt;forAll(service1, service2 |\n\t\t\t\tservice1 &lt;&gt; service2 implies service1.servicename.name &lt;&gt; service2.servicename.name)'"
	 * @generated
	 */
	boolean allServicesHaveDifferentNamesTer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let countriesLanguages = self.country-&gt;collect(language)-&gt;asSet()\n\tin countriesLanguages-&gt;forAll(lang | self.language.name-&gt;includes(lang.name))'"
	 * @generated
	 */
	boolean allLanguagesFromCountriesVariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='resourcesconfig-&gt;exists(rc |\n\t\t\trc.isCharged) implies pricingsystem-&gt;notEmpty()'"
	 * @generated
	 */
	boolean ifResourceChargedPricingSystemIsMandatory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.country-&gt;collect(language)-&gt;asSet()-&gt;forAll(lang |\n\t\t\t\tself.language.name-&gt;includes(lang.name))'"
	 * @generated
	 */
	boolean allLanguagesFromCountries(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceConfig
