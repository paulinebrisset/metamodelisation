/**
 */
package metaheres.impl;

import metaheres.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaheresFactoryImpl extends EFactoryImpl implements MetaheresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaheresFactory init() {
		try {
			MetaheresFactory theMetaheresFactory = (MetaheresFactory)EPackage.Registry.INSTANCE.getEFactory(MetaheresPackage.eNS_URI);
			if (theMetaheresFactory != null) {
				return theMetaheresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaheresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaheresFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaheresPackage.SERVICE_NAME: return createServiceName();
			case MetaheresPackage.STATUS: return createStatus();
			case MetaheresPackage.LANGUAGE: return createLanguage();
			case MetaheresPackage.STATUS_LIST: return createStatusList();
			case MetaheresPackage.SERVICE_CONFIG: return createServiceConfig();
			case MetaheresPackage.COUNTRY: return createCountry();
			case MetaheresPackage.RESERVATIONS_CONFIG: return createReservationsConfig();
			case MetaheresPackage.RESOURCES_CONFIG: return createResourcesConfig();
			case MetaheresPackage.LOTS_CONFIG: return createLotsConfig();
			case MetaheresPackage.PRICING_SYSTEM: return createPricingSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceName createServiceName() {
		ServiceNameImpl serviceName = new ServiceNameImpl();
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusList createStatusList() {
		StatusListImpl statusList = new StatusListImpl();
		return statusList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig createServiceConfig() {
		ServiceConfigImpl serviceConfig = new ServiceConfigImpl();
		return serviceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsConfig createReservationsConfig() {
		ReservationsConfigImpl reservationsConfig = new ReservationsConfigImpl();
		return reservationsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesConfig createResourcesConfig() {
		ResourcesConfigImpl resourcesConfig = new ResourcesConfigImpl();
		return resourcesConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LotsConfig createLotsConfig() {
		LotsConfigImpl lotsConfig = new LotsConfigImpl();
		return lotsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingSystem createPricingSystem() {
		PricingSystemImpl pricingSystem = new PricingSystemImpl();
		return pricingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaheresPackage getMetaheresPackage() {
		return (MetaheresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaheresPackage getPackage() {
		return MetaheresPackage.eINSTANCE;
	}

} //MetaheresFactoryImpl
