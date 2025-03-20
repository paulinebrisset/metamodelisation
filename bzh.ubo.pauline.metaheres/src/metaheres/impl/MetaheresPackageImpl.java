/**
 */
package metaheres.impl;

import metaheres.Country;
import metaheres.Language;
import metaheres.LotsConfig;
import metaheres.MetaheresFactory;
import metaheres.MetaheresPackage;
import metaheres.NamedElement;
import metaheres.PricingSystem;
import metaheres.ReservableEntity;
import metaheres.ReservationsConfig;
import metaheres.ResourcesConfig;
import metaheres.RightLevel;
import metaheres.RightsLevelList;
import metaheres.ServiceConfig;
import metaheres.ServiceName;
import metaheres.Status;
import metaheres.StatusList;
import metaheres.UsersConfig;

import metaheres.util.MetaheresValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaheresPackageImpl extends EPackageImpl implements MetaheresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightsLevelListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lotsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricingSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metaheres.MetaheresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaheresPackageImpl() {
		super(eNS_URI, MetaheresFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetaheresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaheresPackage init() {
		if (isInited) return (MetaheresPackage)EPackage.Registry.INSTANCE.getEPackage(MetaheresPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetaheresPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetaheresPackageImpl theMetaheresPackage = registeredMetaheresPackage instanceof MetaheresPackageImpl ? (MetaheresPackageImpl)registeredMetaheresPackage : new MetaheresPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetaheresPackage.createPackageContents();

		// Initialize created meta-data
		theMetaheresPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMetaheresPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MetaheresValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMetaheresPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaheresPackage.eNS_URI, theMetaheresPackage);
		return theMetaheresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceName() {
		return serviceNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceName_Serviceconfig() {
		return (EReference)serviceNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightLevel() {
		return rightLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightsLevelList() {
		return rightsLevelListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightsLevelList_Rightlevel() {
		return (EReference)rightsLevelListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusList() {
		return statusListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusList_Status() {
		return (EReference)statusListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsersConfig() {
		return usersConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsersConfig_HasAdress() {
		return (EAttribute)usersConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsersConfig_HasPhone() {
		return (EAttribute)usersConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsersConfig_Rightslevellist() {
		return (EReference)usersConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsersConfig_BloackedAtUnfulfilledReservation() {
		return (EAttribute)usersConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConfig() {
		return serviceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Servicename() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfig_ClosesOnPublicHolidays() {
		return (EAttribute)serviceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfig_InventoryIsPublic() {
		return (EAttribute)serviceConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfig_HasChart() {
		return (EAttribute)serviceConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfig_CountInBusinessDays() {
		return (EAttribute)serviceConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Language() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Reservationsconfig() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Country() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Resourcesconfig() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Lotsconfig() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfig_Pricingsystem() {
		return (EReference)serviceConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceConfig__AllServicesHaveDifferentNamesTer__DiagnosticChain_Map() {
		return serviceConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceConfig__AllLanguagesFromCountriesVariant__DiagnosticChain_Map() {
		return serviceConfigEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceConfig__IfResourceChargedPricingSystemIsMandatory__DiagnosticChain_Map() {
		return serviceConfigEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceConfig__AllLanguagesFromCountries__DiagnosticChain_Map() {
		return serviceConfigEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountry_Language() {
		return (EReference)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountry_Pricingsystem() {
		return (EReference)countryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountry__CountriesHaveDifferentNames__DiagnosticChain_Map() {
		return countryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountry__LanguageNameMinLength__DiagnosticChain_Map() {
		return countryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservableEntity() {
		return reservableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservableEntity_HasImage() {
		return (EAttribute)reservableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservableEntity_HasOneStockPerSlot() {
		return (EAttribute)reservableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationsConfig() {
		return reservationsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationsConfig_HasMoveOutCheck() {
		return (EAttribute)reservationsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationsConfig_MinRequestAdvance() {
		return (EAttribute)reservationsConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationsConfig_MaxRequestAdvance() {
		return (EAttribute)reservationsConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationsConfig_HasMoveInCheck() {
		return (EAttribute)reservationsConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationsConfig_Serviceconfig() {
		return (EReference)reservationsConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationsConfig_Statuslist() {
		return (EReference)reservationsConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationsConfig__NoMoveInAllowedForConsumables__DiagnosticChain_Map() {
		return reservationsConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesConfig() {
		return resourcesConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesConfig_IsConsumable() {
		return (EAttribute)resourcesConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesConfig_IsLoan() {
		return (EAttribute)resourcesConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesConfig_IsCharged() {
		return (EAttribute)resourcesConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesConfig_Serviceconfig() {
		return (EReference)resourcesConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLotsConfig() {
		return lotsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLotsConfig_Serviceconfig() {
		return (EReference)lotsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricingSystem() {
		return pricingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingSystem_Currency() {
		return (EAttribute)pricingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingSystem_TaxSystem() {
		return (EAttribute)pricingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingSystem_Name() {
		return (EAttribute)pricingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaheresFactory getMetaheresFactory() {
		return (MetaheresFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		serviceNameEClass = createEClass(SERVICE_NAME);
		createEReference(serviceNameEClass, SERVICE_NAME__SERVICECONFIG);

		statusEClass = createEClass(STATUS);

		rightLevelEClass = createEClass(RIGHT_LEVEL);

		languageEClass = createEClass(LANGUAGE);

		rightsLevelListEClass = createEClass(RIGHTS_LEVEL_LIST);
		createEReference(rightsLevelListEClass, RIGHTS_LEVEL_LIST__RIGHTLEVEL);

		statusListEClass = createEClass(STATUS_LIST);
		createEReference(statusListEClass, STATUS_LIST__STATUS);

		usersConfigEClass = createEClass(USERS_CONFIG);
		createEAttribute(usersConfigEClass, USERS_CONFIG__HAS_ADRESS);
		createEAttribute(usersConfigEClass, USERS_CONFIG__HAS_PHONE);
		createEReference(usersConfigEClass, USERS_CONFIG__RIGHTSLEVELLIST);
		createEAttribute(usersConfigEClass, USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION);

		serviceConfigEClass = createEClass(SERVICE_CONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__SERVICENAME);
		createEAttribute(serviceConfigEClass, SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS);
		createEAttribute(serviceConfigEClass, SERVICE_CONFIG__INVENTORY_IS_PUBLIC);
		createEAttribute(serviceConfigEClass, SERVICE_CONFIG__HAS_CHART);
		createEAttribute(serviceConfigEClass, SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__LANGUAGE);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__RESERVATIONSCONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__COUNTRY);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__RESOURCESCONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__LOTSCONFIG);
		createEReference(serviceConfigEClass, SERVICE_CONFIG__PRICINGSYSTEM);
		createEOperation(serviceConfigEClass, SERVICE_CONFIG___ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceConfigEClass, SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES_VARIANT__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceConfigEClass, SERVICE_CONFIG___IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceConfigEClass, SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES__DIAGNOSTICCHAIN_MAP);

		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__NAME);
		createEReference(countryEClass, COUNTRY__LANGUAGE);
		createEReference(countryEClass, COUNTRY__PRICINGSYSTEM);
		createEOperation(countryEClass, COUNTRY___COUNTRIES_HAVE_DIFFERENT_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(countryEClass, COUNTRY___LANGUAGE_NAME_MIN_LENGTH__DIAGNOSTICCHAIN_MAP);

		reservableEntityEClass = createEClass(RESERVABLE_ENTITY);
		createEAttribute(reservableEntityEClass, RESERVABLE_ENTITY__HAS_IMAGE);
		createEAttribute(reservableEntityEClass, RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT);

		reservationsConfigEClass = createEClass(RESERVATIONS_CONFIG);
		createEAttribute(reservationsConfigEClass, RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK);
		createEAttribute(reservationsConfigEClass, RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE);
		createEAttribute(reservationsConfigEClass, RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE);
		createEAttribute(reservationsConfigEClass, RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK);
		createEReference(reservationsConfigEClass, RESERVATIONS_CONFIG__SERVICECONFIG);
		createEReference(reservationsConfigEClass, RESERVATIONS_CONFIG__STATUSLIST);
		createEOperation(reservationsConfigEClass, RESERVATIONS_CONFIG___NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES__DIAGNOSTICCHAIN_MAP);

		resourcesConfigEClass = createEClass(RESOURCES_CONFIG);
		createEAttribute(resourcesConfigEClass, RESOURCES_CONFIG__IS_CONSUMABLE);
		createEAttribute(resourcesConfigEClass, RESOURCES_CONFIG__IS_LOAN);
		createEAttribute(resourcesConfigEClass, RESOURCES_CONFIG__IS_CHARGED);
		createEReference(resourcesConfigEClass, RESOURCES_CONFIG__SERVICECONFIG);

		lotsConfigEClass = createEClass(LOTS_CONFIG);
		createEReference(lotsConfigEClass, LOTS_CONFIG__SERVICECONFIG);

		pricingSystemEClass = createEClass(PRICING_SYSTEM);
		createEAttribute(pricingSystemEClass, PRICING_SYSTEM__CURRENCY);
		createEAttribute(pricingSystemEClass, PRICING_SYSTEM__TAX_SYSTEM);
		createEAttribute(pricingSystemEClass, PRICING_SYSTEM__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceNameEClass.getESuperTypes().add(this.getNamedElement());
		statusEClass.getESuperTypes().add(this.getNamedElement());
		rightLevelEClass.getESuperTypes().add(this.getNamedElement());
		languageEClass.getESuperTypes().add(this.getNamedElement());
		resourcesConfigEClass.getESuperTypes().add(this.getReservableEntity());
		lotsConfigEClass.getESuperTypes().add(this.getReservableEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNameEClass, ServiceName.class, "ServiceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceName_Serviceconfig(), this.getServiceConfig(), this.getServiceConfig_Servicename(), "serviceconfig", null, 1, 1, ServiceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightLevelEClass, RightLevel.class, "RightLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightsLevelListEClass, RightsLevelList.class, "RightsLevelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightsLevelList_Rightlevel(), this.getRightLevel(), null, "rightlevel", null, 1, -1, RightsLevelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusListEClass, StatusList.class, "StatusList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatusList_Status(), this.getStatus(), null, "status", null, 2, -1, StatusList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usersConfigEClass, UsersConfig.class, "UsersConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsersConfig_HasAdress(), ecorePackage.getEBoolean(), "hasAdress", null, 1, 1, UsersConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsersConfig_HasPhone(), ecorePackage.getEBoolean(), "hasPhone", null, 1, 1, UsersConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsersConfig_Rightslevellist(), this.getRightsLevelList(), null, "rightslevellist", null, 1, 1, UsersConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsersConfig_BloackedAtUnfulfilledReservation(), ecorePackage.getEBooleanObject(), "bloackedAtUnfulfilledReservation", null, 0, 1, UsersConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigEClass, ServiceConfig.class, "ServiceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConfig_Servicename(), this.getServiceName(), this.getServiceName_Serviceconfig(), "servicename", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfig_ClosesOnPublicHolidays(), ecorePackage.getEBooleanObject(), "closesOnPublicHolidays", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfig_InventoryIsPublic(), ecorePackage.getEBooleanObject(), "inventoryIsPublic", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfig_HasChart(), ecorePackage.getEBooleanObject(), "hasChart", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfig_CountInBusinessDays(), ecorePackage.getEBooleanObject(), "countInBusinessDays", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Language(), this.getLanguage(), null, "language", null, 1, -1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Reservationsconfig(), this.getReservationsConfig(), this.getReservationsConfig_Serviceconfig(), "reservationsconfig", null, 1, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Country(), this.getCountry(), null, "country", null, 1, 3, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Resourcesconfig(), this.getResourcesConfig(), this.getResourcesConfig_Serviceconfig(), "resourcesconfig", null, 1, -1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Lotsconfig(), this.getLotsConfig(), this.getLotsConfig_Serviceconfig(), "lotsconfig", null, 0, 1, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfig_Pricingsystem(), this.getPricingSystem(), null, "pricingsystem", null, 0, 3, ServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getServiceConfig__AllServicesHaveDifferentNamesTer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allServicesHaveDifferentNamesTer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceConfig__AllLanguagesFromCountriesVariant__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allLanguagesFromCountriesVariant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceConfig__IfResourceChargedPricingSystemIsMandatory__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ifResourceChargedPricingSystemIsMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServiceConfig__AllLanguagesFromCountries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allLanguagesFromCountries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Name(), ecorePackage.getEString(), "name", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_Language(), this.getLanguage(), null, "language", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_Pricingsystem(), this.getPricingSystem(), null, "pricingsystem", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCountry__CountriesHaveDifferentNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "countriesHaveDifferentNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCountry__LanguageNameMinLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "languageNameMinLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reservableEntityEClass, ReservableEntity.class, "ReservableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservableEntity_HasImage(), ecorePackage.getEBooleanObject(), "hasImage", null, 0, 1, ReservableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservableEntity_HasOneStockPerSlot(), ecorePackage.getEBooleanObject(), "hasOneStockPerSlot", null, 0, 1, ReservableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationsConfigEClass, ReservationsConfig.class, "ReservationsConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationsConfig_HasMoveOutCheck(), ecorePackage.getEBoolean(), "hasMoveOutCheck", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationsConfig_MinRequestAdvance(), ecorePackage.getEInt(), "minRequestAdvance", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationsConfig_MaxRequestAdvance(), ecorePackage.getEInt(), "maxRequestAdvance", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservationsConfig_HasMoveInCheck(), ecorePackage.getEBoolean(), "hasMoveInCheck", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationsConfig_Serviceconfig(), this.getServiceConfig(), this.getServiceConfig_Reservationsconfig(), "serviceconfig", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservationsConfig_Statuslist(), this.getStatusList(), null, "statuslist", null, 1, 1, ReservationsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getReservationsConfig__NoMoveInAllowedForConsumables__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noMoveInAllowedForConsumables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourcesConfigEClass, ResourcesConfig.class, "ResourcesConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcesConfig_IsConsumable(), ecorePackage.getEBoolean(), "isConsumable", null, 1, 1, ResourcesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcesConfig_IsLoan(), ecorePackage.getEBoolean(), "isLoan", null, 1, 1, ResourcesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcesConfig_IsCharged(), ecorePackage.getEBoolean(), "isCharged", null, 1, 1, ResourcesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcesConfig_Serviceconfig(), this.getServiceConfig(), this.getServiceConfig_Resourcesconfig(), "serviceconfig", null, 0, 1, ResourcesConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lotsConfigEClass, LotsConfig.class, "LotsConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLotsConfig_Serviceconfig(), this.getServiceConfig(), this.getServiceConfig_Lotsconfig(), "serviceconfig", null, 0, 1, LotsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pricingSystemEClass, PricingSystem.class, "PricingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPricingSystem_Currency(), ecorePackage.getEString(), "currency", null, 1, 1, PricingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingSystem_TaxSystem(), ecorePackage.getEString(), "taxSystem", null, 1, 1, PricingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, PricingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (serviceConfigEClass,
		   source,
		   new String[] {
			   "constraints", "allLanguagesFromCountries"
		   });
		addAnnotation
		  (countryEClass,
		   source,
		   new String[] {
			   "constraints", "languageNameMinLength"
		   });
		addAnnotation
		  (reservationsConfigEClass,
		   source,
		   new String[] {
			   "constraints", "noMoveInAllowedForConsumables"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getServiceConfig__AllServicesHaveDifferentNamesTer__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "ServiceConfig.allInstances()->forAll(service1, service2 |\n\t\t\t\tservice1 <> service2 implies service1.servicename.name <> service2.servicename.name)"
		   });
		addAnnotation
		  (getServiceConfig__AllLanguagesFromCountriesVariant__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\tlet countriesLanguages = self.country->collect(language)->asSet()\n\t\tin countriesLanguages->forAll(lang | self.language.name->includes(lang.name))"
		   });
		addAnnotation
		  (getServiceConfig__IfResourceChargedPricingSystemIsMandatory__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "resourcesconfig->exists(rc |\n\t\t\trc.isCharged) implies pricingsystem->notEmpty()"
		   });
		addAnnotation
		  (getServiceConfig__AllLanguagesFromCountries__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.country->collect(language)->asSet()->forAll(lang |\n\t\t\t\tself.language.name->includes(lang.name))"
		   });
		addAnnotation
		  (getCountry__CountriesHaveDifferentNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Country.allInstances()->forAll(country1, country2 |\n\t\t\tcountry1 <> country2 implies country1.name <> country2.name)"
		   });
		addAnnotation
		  (getCountry__LanguageNameMinLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.language.name.size() >= 5"
		   });
		addAnnotation
		  (getReservationsConfig__NoMoveInAllowedForConsumables__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "hasMoveInCheck implies not serviceconfig.resourcesconfig->exists(r |\n\t\t\tr.isConsumable)"
		   });
	}

} //MetaheresPackageImpl
