/**
 */
package metaheres.util;

import java.util.Map;

import metaheres.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metaheres.MetaheresPackage
 * @generated
 */
public class MetaheresValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetaheresValidator INSTANCE = new MetaheresValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metaheres";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Services Have Different Names Ter' of 'Service Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CONFIG__ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Languages From Countries Variant' of 'Service Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CONFIG__ALL_LANGUAGES_FROM_COUNTRIES_VARIANT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'If Resource Charged Pricing System Is Mandatory' of 'Service Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CONFIG__IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Languages From Countries' of 'Service Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CONFIG__ALL_LANGUAGES_FROM_COUNTRIES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Countries Have Different Names' of 'Country'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTRY__COUNTRIES_HAVE_DIFFERENT_NAMES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Language Name Min Length' of 'Country'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTRY__LANGUAGE_NAME_MIN_LENGTH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Move In Allowed For Consumables' of 'Reservations Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESERVATIONS_CONFIG__NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaheresValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MetaheresPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MetaheresPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case MetaheresPackage.SERVICE_NAME:
				return validateServiceName((ServiceName)value, diagnostics, context);
			case MetaheresPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case MetaheresPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case MetaheresPackage.STATUS_LIST:
				return validateStatusList((StatusList)value, diagnostics, context);
			case MetaheresPackage.SERVICE_CONFIG:
				return validateServiceConfig((ServiceConfig)value, diagnostics, context);
			case MetaheresPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case MetaheresPackage.RESERVABLE_ENTITY:
				return validateReservableEntity((ReservableEntity)value, diagnostics, context);
			case MetaheresPackage.RESERVATIONS_CONFIG:
				return validateReservationsConfig((ReservationsConfig)value, diagnostics, context);
			case MetaheresPackage.RESOURCES_CONFIG:
				return validateResourcesConfig((ResourcesConfig)value, diagnostics, context);
			case MetaheresPackage.LOTS_CONFIG:
				return validateLotsConfig((LotsConfig)value, diagnostics, context);
			case MetaheresPackage.PRICING_SYSTEM:
				return validatePricingSystem((PricingSystem)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceName(ServiceName serviceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(status, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusList(StatusList statusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfig(ServiceConfig serviceConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceConfig, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfig_allLanguagesFromCountries(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfig_allServicesHaveDifferentNamesTer(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfig_allLanguagesFromCountriesVariant(serviceConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfig_ifResourceChargedPricingSystemIsMandatory(serviceConfig, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allLanguagesFromCountries constraint of '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfig_allLanguagesFromCountries(ServiceConfig serviceConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceConfig.allLanguagesFromCountries(diagnostics, context);
	}

	/**
	 * Validates the allServicesHaveDifferentNamesTer constraint of '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfig_allServicesHaveDifferentNamesTer(ServiceConfig serviceConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceConfig.allServicesHaveDifferentNamesTer(diagnostics, context);
	}

	/**
	 * Validates the allLanguagesFromCountriesVariant constraint of '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfig_allLanguagesFromCountriesVariant(ServiceConfig serviceConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceConfig.allLanguagesFromCountriesVariant(diagnostics, context);
	}

	/**
	 * Validates the ifResourceChargedPricingSystemIsMandatory constraint of '<em>Service Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfig_ifResourceChargedPricingSystemIsMandatory(ServiceConfig serviceConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceConfig.ifResourceChargedPricingSystemIsMandatory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(country, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_languageNameMinLength(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_countriesHaveDifferentNames(country, diagnostics, context);
		return result;
	}

	/**
	 * Validates the languageNameMinLength constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_languageNameMinLength(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return country.languageNameMinLength(diagnostics, context);
	}

	/**
	 * Validates the countriesHaveDifferentNames constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_countriesHaveDifferentNames(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return country.countriesHaveDifferentNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservableEntity(ReservableEntity reservableEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservableEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationsConfig(ReservationsConfig reservationsConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reservationsConfig, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reservationsConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservationsConfig_noMoveInAllowedForConsumables(reservationsConfig, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noMoveInAllowedForConsumables constraint of '<em>Reservations Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationsConfig_noMoveInAllowedForConsumables(ReservationsConfig reservationsConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reservationsConfig.noMoveInAllowedForConsumables(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcesConfig(ResourcesConfig resourcesConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourcesConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLotsConfig(LotsConfig lotsConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lotsConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricingSystem(PricingSystem pricingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pricingSystem, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetaheresValidator
