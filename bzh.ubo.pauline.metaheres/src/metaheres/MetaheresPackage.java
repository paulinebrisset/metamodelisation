/**
 */
package metaheres;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaheres.MetaheresFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MetaheresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaheres";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bzh.ubo.pauline.metaheres";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaheres";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaheresPackage eINSTANCE = metaheres.impl.MetaheresPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaheres.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.NamedElementImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.ServiceNameImpl <em>Service Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.ServiceNameImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getServiceName()
	 * @generated
	 */
	int SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NAME__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Serviceconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NAME__SERVICECONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NAME_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NAME_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.StatusImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.RightLevelImpl <em>Right Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.RightLevelImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getRightLevel()
	 * @generated
	 */
	int RIGHT_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_LEVEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Right Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_LEVEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_LEVEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.LanguageImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.RightsLevelListImpl <em>Rights Level List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.RightsLevelListImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getRightsLevelList()
	 * @generated
	 */
	int RIGHTS_LEVEL_LIST = 5;

	/**
	 * The feature id for the '<em><b>Rightlevel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_LEVEL_LIST__RIGHTLEVEL = 0;

	/**
	 * The number of structural features of the '<em>Rights Level List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_LEVEL_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rights Level List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_LEVEL_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.StatusListImpl <em>Status List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.StatusListImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getStatusList()
	 * @generated
	 */
	int STATUS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LIST__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Status List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Status List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.UsersConfigImpl <em>Users Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.UsersConfigImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getUsersConfig()
	 * @generated
	 */
	int USERS_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Has Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG__HAS_ADRESS = 0;

	/**
	 * The feature id for the '<em><b>Has Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG__HAS_PHONE = 1;

	/**
	 * The feature id for the '<em><b>Rightslevellist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG__RIGHTSLEVELLIST = 2;

	/**
	 * The feature id for the '<em><b>Bloacked At Unfulfilled Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION = 3;

	/**
	 * The number of structural features of the '<em>Users Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Users Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.ServiceConfigImpl <em>Service Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.ServiceConfigImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getServiceConfig()
	 * @generated
	 */
	int SERVICE_CONFIG = 8;

	/**
	 * The feature id for the '<em><b>Servicename</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__SERVICENAME = 0;

	/**
	 * The feature id for the '<em><b>Closes On Public Holidays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS = 1;

	/**
	 * The feature id for the '<em><b>Inventory Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__INVENTORY_IS_PUBLIC = 2;

	/**
	 * The feature id for the '<em><b>Has Chart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__HAS_CHART = 3;

	/**
	 * The feature id for the '<em><b>Count In Business Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Reservationsconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__RESERVATIONSCONFIG = 6;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Resourcesconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__RESOURCESCONFIG = 8;

	/**
	 * The feature id for the '<em><b>Lotsconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__LOTSCONFIG = 9;

	/**
	 * The feature id for the '<em><b>Pricingsystem</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG__PRICINGSYSTEM = 10;

	/**
	 * The number of structural features of the '<em>Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>All Services Have Different Names Ter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG___ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>All Languages From Countries Variant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES_VARIANT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>If Resource Charged Pricing System Is Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG___IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>All Languages From Countries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIG_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link metaheres.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.CountryImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Pricingsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PRICINGSYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Countries Have Different Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY___COUNTRIES_HAVE_DIFFERENT_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Language Name Min Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY___LANGUAGE_NAME_MIN_LENGTH__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link metaheres.impl.ReservableEntityImpl <em>Reservable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.ReservableEntityImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getReservableEntity()
	 * @generated
	 */
	int RESERVABLE_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Has Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVABLE_ENTITY__HAS_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Has One Stock Per Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT = 1;

	/**
	 * The number of structural features of the '<em>Reservable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVABLE_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reservable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.ReservationsConfigImpl <em>Reservations Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.ReservationsConfigImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getReservationsConfig()
	 * @generated
	 */
	int RESERVATIONS_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Has Move Out Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK = 0;

	/**
	 * The feature id for the '<em><b>Min Request Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE = 1;

	/**
	 * The feature id for the '<em><b>Max Request Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE = 2;

	/**
	 * The feature id for the '<em><b>Has Move In Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK = 3;

	/**
	 * The feature id for the '<em><b>Serviceconfig</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__SERVICECONFIG = 4;

	/**
	 * The feature id for the '<em><b>Statuslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG__STATUSLIST = 5;

	/**
	 * The number of structural features of the '<em>Reservations Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>No Move In Allowed For Consumables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG___NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Reservations Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_CONFIG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link metaheres.impl.ResourcesConfigImpl <em>Resources Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.ResourcesConfigImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getResourcesConfig()
	 * @generated
	 */
	int RESOURCES_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Has Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__HAS_IMAGE = RESERVABLE_ENTITY__HAS_IMAGE;

	/**
	 * The feature id for the '<em><b>Has One Stock Per Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__HAS_ONE_STOCK_PER_SLOT = RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT;

	/**
	 * The feature id for the '<em><b>Is Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__IS_CONSUMABLE = RESERVABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__IS_LOAN = RESERVABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Charged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__IS_CHARGED = RESERVABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serviceconfig</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG__SERVICECONFIG = RESERVABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resources Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG_FEATURE_COUNT = RESERVABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resources Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONFIG_OPERATION_COUNT = RESERVABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.LotsConfigImpl <em>Lots Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.LotsConfigImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getLotsConfig()
	 * @generated
	 */
	int LOTS_CONFIG = 13;

	/**
	 * The feature id for the '<em><b>Has Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTS_CONFIG__HAS_IMAGE = RESERVABLE_ENTITY__HAS_IMAGE;

	/**
	 * The feature id for the '<em><b>Has One Stock Per Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTS_CONFIG__HAS_ONE_STOCK_PER_SLOT = RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT;

	/**
	 * The feature id for the '<em><b>Serviceconfig</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTS_CONFIG__SERVICECONFIG = RESERVABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lots Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTS_CONFIG_FEATURE_COUNT = RESERVABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lots Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTS_CONFIG_OPERATION_COUNT = RESERVABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaheres.impl.PricingSystemImpl <em>Pricing System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaheres.impl.PricingSystemImpl
	 * @see metaheres.impl.MetaheresPackageImpl#getPricingSystem()
	 * @generated
	 */
	int PRICING_SYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SYSTEM__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Tax System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SYSTEM__TAX_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Pricing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pricing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metaheres.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see metaheres.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaheres.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link metaheres.ServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Name</em>'.
	 * @see metaheres.ServiceName
	 * @generated
	 */
	EClass getServiceName();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.ServiceName#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serviceconfig</em>'.
	 * @see metaheres.ServiceName#getServiceconfig()
	 * @see #getServiceName()
	 * @generated
	 */
	EReference getServiceName_Serviceconfig();

	/**
	 * Returns the meta object for class '{@link metaheres.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see metaheres.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for class '{@link metaheres.RightLevel <em>Right Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Level</em>'.
	 * @see metaheres.RightLevel
	 * @generated
	 */
	EClass getRightLevel();

	/**
	 * Returns the meta object for class '{@link metaheres.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see metaheres.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for class '{@link metaheres.RightsLevelList <em>Rights Level List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Level List</em>'.
	 * @see metaheres.RightsLevelList
	 * @generated
	 */
	EClass getRightsLevelList();

	/**
	 * Returns the meta object for the reference list '{@link metaheres.RightsLevelList#getRightlevel <em>Rightlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rightlevel</em>'.
	 * @see metaheres.RightsLevelList#getRightlevel()
	 * @see #getRightsLevelList()
	 * @generated
	 */
	EReference getRightsLevelList_Rightlevel();

	/**
	 * Returns the meta object for class '{@link metaheres.StatusList <em>Status List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status List</em>'.
	 * @see metaheres.StatusList
	 * @generated
	 */
	EClass getStatusList();

	/**
	 * Returns the meta object for the containment reference list '{@link metaheres.StatusList#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status</em>'.
	 * @see metaheres.StatusList#getStatus()
	 * @see #getStatusList()
	 * @generated
	 */
	EReference getStatusList_Status();

	/**
	 * Returns the meta object for class '{@link metaheres.UsersConfig <em>Users Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users Config</em>'.
	 * @see metaheres.UsersConfig
	 * @generated
	 */
	EClass getUsersConfig();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.UsersConfig#isHasAdress <em>Has Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Adress</em>'.
	 * @see metaheres.UsersConfig#isHasAdress()
	 * @see #getUsersConfig()
	 * @generated
	 */
	EAttribute getUsersConfig_HasAdress();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.UsersConfig#isHasPhone <em>Has Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Phone</em>'.
	 * @see metaheres.UsersConfig#isHasPhone()
	 * @see #getUsersConfig()
	 * @generated
	 */
	EAttribute getUsersConfig_HasPhone();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.UsersConfig#getRightslevellist <em>Rightslevellist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rightslevellist</em>'.
	 * @see metaheres.UsersConfig#getRightslevellist()
	 * @see #getUsersConfig()
	 * @generated
	 */
	EReference getUsersConfig_Rightslevellist();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.UsersConfig#getBloackedAtUnfulfilledReservation <em>Bloacked At Unfulfilled Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloacked At Unfulfilled Reservation</em>'.
	 * @see metaheres.UsersConfig#getBloackedAtUnfulfilledReservation()
	 * @see #getUsersConfig()
	 * @generated
	 */
	EAttribute getUsersConfig_BloackedAtUnfulfilledReservation();

	/**
	 * Returns the meta object for class '{@link metaheres.ServiceConfig <em>Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Config</em>'.
	 * @see metaheres.ServiceConfig
	 * @generated
	 */
	EClass getServiceConfig();

	/**
	 * Returns the meta object for the container reference '{@link metaheres.ServiceConfig#getServicename <em>Servicename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicename</em>'.
	 * @see metaheres.ServiceConfig#getServicename()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Servicename();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ServiceConfig#getClosesOnPublicHolidays <em>Closes On Public Holidays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closes On Public Holidays</em>'.
	 * @see metaheres.ServiceConfig#getClosesOnPublicHolidays()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EAttribute getServiceConfig_ClosesOnPublicHolidays();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ServiceConfig#getInventoryIsPublic <em>Inventory Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Is Public</em>'.
	 * @see metaheres.ServiceConfig#getInventoryIsPublic()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EAttribute getServiceConfig_InventoryIsPublic();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ServiceConfig#getHasChart <em>Has Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Chart</em>'.
	 * @see metaheres.ServiceConfig#getHasChart()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EAttribute getServiceConfig_HasChart();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ServiceConfig#getCountInBusinessDays <em>Count In Business Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count In Business Days</em>'.
	 * @see metaheres.ServiceConfig#getCountInBusinessDays()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EAttribute getServiceConfig_CountInBusinessDays();

	/**
	 * Returns the meta object for the containment reference list '{@link metaheres.ServiceConfig#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see metaheres.ServiceConfig#getLanguage()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Language();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.ServiceConfig#getReservationsconfig <em>Reservationsconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservationsconfig</em>'.
	 * @see metaheres.ServiceConfig#getReservationsconfig()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Reservationsconfig();

	/**
	 * Returns the meta object for the containment reference list '{@link metaheres.ServiceConfig#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country</em>'.
	 * @see metaheres.ServiceConfig#getCountry()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link metaheres.ServiceConfig#getResourcesconfig <em>Resourcesconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourcesconfig</em>'.
	 * @see metaheres.ServiceConfig#getResourcesconfig()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Resourcesconfig();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.ServiceConfig#getLotsconfig <em>Lotsconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lotsconfig</em>'.
	 * @see metaheres.ServiceConfig#getLotsconfig()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Lotsconfig();

	/**
	 * Returns the meta object for the reference list '{@link metaheres.ServiceConfig#getPricingsystem <em>Pricingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricingsystem</em>'.
	 * @see metaheres.ServiceConfig#getPricingsystem()
	 * @see #getServiceConfig()
	 * @generated
	 */
	EReference getServiceConfig_Pricingsystem();

	/**
	 * Returns the meta object for the '{@link metaheres.ServiceConfig#allServicesHaveDifferentNamesTer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Services Have Different Names Ter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Services Have Different Names Ter</em>' operation.
	 * @see metaheres.ServiceConfig#allServicesHaveDifferentNamesTer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceConfig__AllServicesHaveDifferentNamesTer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link metaheres.ServiceConfig#allLanguagesFromCountriesVariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Languages From Countries Variant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Languages From Countries Variant</em>' operation.
	 * @see metaheres.ServiceConfig#allLanguagesFromCountriesVariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceConfig__AllLanguagesFromCountriesVariant__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link metaheres.ServiceConfig#ifResourceChargedPricingSystemIsMandatory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>If Resource Charged Pricing System Is Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>If Resource Charged Pricing System Is Mandatory</em>' operation.
	 * @see metaheres.ServiceConfig#ifResourceChargedPricingSystemIsMandatory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceConfig__IfResourceChargedPricingSystemIsMandatory__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link metaheres.ServiceConfig#allLanguagesFromCountries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Languages From Countries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Languages From Countries</em>' operation.
	 * @see metaheres.ServiceConfig#allLanguagesFromCountries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getServiceConfig__AllLanguagesFromCountries__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaheres.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see metaheres.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaheres.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.Country#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see metaheres.Country#getLanguage()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Language();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.Country#getPricingsystem <em>Pricingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pricingsystem</em>'.
	 * @see metaheres.Country#getPricingsystem()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Pricingsystem();

	/**
	 * Returns the meta object for the '{@link metaheres.Country#countriesHaveDifferentNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Countries Have Different Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Countries Have Different Names</em>' operation.
	 * @see metaheres.Country#countriesHaveDifferentNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCountry__CountriesHaveDifferentNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link metaheres.Country#languageNameMinLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Language Name Min Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Language Name Min Length</em>' operation.
	 * @see metaheres.Country#languageNameMinLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCountry__LanguageNameMinLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaheres.ReservableEntity <em>Reservable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservable Entity</em>'.
	 * @see metaheres.ReservableEntity
	 * @generated
	 */
	EClass getReservableEntity();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservableEntity#getHasImage <em>Has Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Image</em>'.
	 * @see metaheres.ReservableEntity#getHasImage()
	 * @see #getReservableEntity()
	 * @generated
	 */
	EAttribute getReservableEntity_HasImage();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservableEntity#getHasOneStockPerSlot <em>Has One Stock Per Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has One Stock Per Slot</em>'.
	 * @see metaheres.ReservableEntity#getHasOneStockPerSlot()
	 * @see #getReservableEntity()
	 * @generated
	 */
	EAttribute getReservableEntity_HasOneStockPerSlot();

	/**
	 * Returns the meta object for class '{@link metaheres.ReservationsConfig <em>Reservations Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservations Config</em>'.
	 * @see metaheres.ReservationsConfig
	 * @generated
	 */
	EClass getReservationsConfig();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservationsConfig#isHasMoveOutCheck <em>Has Move Out Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Move Out Check</em>'.
	 * @see metaheres.ReservationsConfig#isHasMoveOutCheck()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EAttribute getReservationsConfig_HasMoveOutCheck();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservationsConfig#getMinRequestAdvance <em>Min Request Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Request Advance</em>'.
	 * @see metaheres.ReservationsConfig#getMinRequestAdvance()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EAttribute getReservationsConfig_MinRequestAdvance();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservationsConfig#getMaxRequestAdvance <em>Max Request Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Request Advance</em>'.
	 * @see metaheres.ReservationsConfig#getMaxRequestAdvance()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EAttribute getReservationsConfig_MaxRequestAdvance();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ReservationsConfig#isHasMoveInCheck <em>Has Move In Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Move In Check</em>'.
	 * @see metaheres.ReservationsConfig#isHasMoveInCheck()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EAttribute getReservationsConfig_HasMoveInCheck();

	/**
	 * Returns the meta object for the container reference '{@link metaheres.ReservationsConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Serviceconfig</em>'.
	 * @see metaheres.ReservationsConfig#getServiceconfig()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EReference getReservationsConfig_Serviceconfig();

	/**
	 * Returns the meta object for the containment reference '{@link metaheres.ReservationsConfig#getStatuslist <em>Statuslist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statuslist</em>'.
	 * @see metaheres.ReservationsConfig#getStatuslist()
	 * @see #getReservationsConfig()
	 * @generated
	 */
	EReference getReservationsConfig_Statuslist();

	/**
	 * Returns the meta object for the '{@link metaheres.ReservationsConfig#noMoveInAllowedForConsumables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Move In Allowed For Consumables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Move In Allowed For Consumables</em>' operation.
	 * @see metaheres.ReservationsConfig#noMoveInAllowedForConsumables(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReservationsConfig__NoMoveInAllowedForConsumables__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link metaheres.ResourcesConfig <em>Resources Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Config</em>'.
	 * @see metaheres.ResourcesConfig
	 * @generated
	 */
	EClass getResourcesConfig();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ResourcesConfig#isIsConsumable <em>Is Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Consumable</em>'.
	 * @see metaheres.ResourcesConfig#isIsConsumable()
	 * @see #getResourcesConfig()
	 * @generated
	 */
	EAttribute getResourcesConfig_IsConsumable();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ResourcesConfig#isIsLoan <em>Is Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loan</em>'.
	 * @see metaheres.ResourcesConfig#isIsLoan()
	 * @see #getResourcesConfig()
	 * @generated
	 */
	EAttribute getResourcesConfig_IsLoan();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.ResourcesConfig#isIsCharged <em>Is Charged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Charged</em>'.
	 * @see metaheres.ResourcesConfig#isIsCharged()
	 * @see #getResourcesConfig()
	 * @generated
	 */
	EAttribute getResourcesConfig_IsCharged();

	/**
	 * Returns the meta object for the container reference '{@link metaheres.ResourcesConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Serviceconfig</em>'.
	 * @see metaheres.ResourcesConfig#getServiceconfig()
	 * @see #getResourcesConfig()
	 * @generated
	 */
	EReference getResourcesConfig_Serviceconfig();

	/**
	 * Returns the meta object for class '{@link metaheres.LotsConfig <em>Lots Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lots Config</em>'.
	 * @see metaheres.LotsConfig
	 * @generated
	 */
	EClass getLotsConfig();

	/**
	 * Returns the meta object for the container reference '{@link metaheres.LotsConfig#getServiceconfig <em>Serviceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Serviceconfig</em>'.
	 * @see metaheres.LotsConfig#getServiceconfig()
	 * @see #getLotsConfig()
	 * @generated
	 */
	EReference getLotsConfig_Serviceconfig();

	/**
	 * Returns the meta object for class '{@link metaheres.PricingSystem <em>Pricing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing System</em>'.
	 * @see metaheres.PricingSystem
	 * @generated
	 */
	EClass getPricingSystem();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.PricingSystem#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see metaheres.PricingSystem#getCurrency()
	 * @see #getPricingSystem()
	 * @generated
	 */
	EAttribute getPricingSystem_Currency();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.PricingSystem#getTaxSystem <em>Tax System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax System</em>'.
	 * @see metaheres.PricingSystem#getTaxSystem()
	 * @see #getPricingSystem()
	 * @generated
	 */
	EAttribute getPricingSystem_TaxSystem();

	/**
	 * Returns the meta object for the attribute '{@link metaheres.PricingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaheres.PricingSystem#getName()
	 * @see #getPricingSystem()
	 * @generated
	 */
	EAttribute getPricingSystem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaheresFactory getMetaheresFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaheres.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.NamedElementImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link metaheres.impl.ServiceNameImpl <em>Service Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.ServiceNameImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getServiceName()
		 * @generated
		 */
		EClass SERVICE_NAME = eINSTANCE.getServiceName();

		/**
		 * The meta object literal for the '<em><b>Serviceconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NAME__SERVICECONFIG = eINSTANCE.getServiceName_Serviceconfig();

		/**
		 * The meta object literal for the '{@link metaheres.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.StatusImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link metaheres.impl.RightLevelImpl <em>Right Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.RightLevelImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getRightLevel()
		 * @generated
		 */
		EClass RIGHT_LEVEL = eINSTANCE.getRightLevel();

		/**
		 * The meta object literal for the '{@link metaheres.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.LanguageImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link metaheres.impl.RightsLevelListImpl <em>Rights Level List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.RightsLevelListImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getRightsLevelList()
		 * @generated
		 */
		EClass RIGHTS_LEVEL_LIST = eINSTANCE.getRightsLevelList();

		/**
		 * The meta object literal for the '<em><b>Rightlevel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_LEVEL_LIST__RIGHTLEVEL = eINSTANCE.getRightsLevelList_Rightlevel();

		/**
		 * The meta object literal for the '{@link metaheres.impl.StatusListImpl <em>Status List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.StatusListImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getStatusList()
		 * @generated
		 */
		EClass STATUS_LIST = eINSTANCE.getStatusList();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_LIST__STATUS = eINSTANCE.getStatusList_Status();

		/**
		 * The meta object literal for the '{@link metaheres.impl.UsersConfigImpl <em>Users Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.UsersConfigImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getUsersConfig()
		 * @generated
		 */
		EClass USERS_CONFIG = eINSTANCE.getUsersConfig();

		/**
		 * The meta object literal for the '<em><b>Has Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS_CONFIG__HAS_ADRESS = eINSTANCE.getUsersConfig_HasAdress();

		/**
		 * The meta object literal for the '<em><b>Has Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS_CONFIG__HAS_PHONE = eINSTANCE.getUsersConfig_HasPhone();

		/**
		 * The meta object literal for the '<em><b>Rightslevellist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS_CONFIG__RIGHTSLEVELLIST = eINSTANCE.getUsersConfig_Rightslevellist();

		/**
		 * The meta object literal for the '<em><b>Bloacked At Unfulfilled Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION = eINSTANCE.getUsersConfig_BloackedAtUnfulfilledReservation();

		/**
		 * The meta object literal for the '{@link metaheres.impl.ServiceConfigImpl <em>Service Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.ServiceConfigImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getServiceConfig()
		 * @generated
		 */
		EClass SERVICE_CONFIG = eINSTANCE.getServiceConfig();

		/**
		 * The meta object literal for the '<em><b>Servicename</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__SERVICENAME = eINSTANCE.getServiceConfig_Servicename();

		/**
		 * The meta object literal for the '<em><b>Closes On Public Holidays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS = eINSTANCE.getServiceConfig_ClosesOnPublicHolidays();

		/**
		 * The meta object literal for the '<em><b>Inventory Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIG__INVENTORY_IS_PUBLIC = eINSTANCE.getServiceConfig_InventoryIsPublic();

		/**
		 * The meta object literal for the '<em><b>Has Chart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIG__HAS_CHART = eINSTANCE.getServiceConfig_HasChart();

		/**
		 * The meta object literal for the '<em><b>Count In Business Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS = eINSTANCE.getServiceConfig_CountInBusinessDays();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__LANGUAGE = eINSTANCE.getServiceConfig_Language();

		/**
		 * The meta object literal for the '<em><b>Reservationsconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__RESERVATIONSCONFIG = eINSTANCE.getServiceConfig_Reservationsconfig();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__COUNTRY = eINSTANCE.getServiceConfig_Country();

		/**
		 * The meta object literal for the '<em><b>Resourcesconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__RESOURCESCONFIG = eINSTANCE.getServiceConfig_Resourcesconfig();

		/**
		 * The meta object literal for the '<em><b>Lotsconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__LOTSCONFIG = eINSTANCE.getServiceConfig_Lotsconfig();

		/**
		 * The meta object literal for the '<em><b>Pricingsystem</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIG__PRICINGSYSTEM = eINSTANCE.getServiceConfig_Pricingsystem();

		/**
		 * The meta object literal for the '<em><b>All Services Have Different Names Ter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_CONFIG___ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceConfig__AllServicesHaveDifferentNamesTer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Languages From Countries Variant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES_VARIANT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceConfig__AllLanguagesFromCountriesVariant__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>If Resource Charged Pricing System Is Mandatory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_CONFIG___IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceConfig__IfResourceChargedPricingSystemIsMandatory__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Languages From Countries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getServiceConfig__AllLanguagesFromCountries__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaheres.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.CountryImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__LANGUAGE = eINSTANCE.getCountry_Language();

		/**
		 * The meta object literal for the '<em><b>Pricingsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__PRICINGSYSTEM = eINSTANCE.getCountry_Pricingsystem();

		/**
		 * The meta object literal for the '<em><b>Countries Have Different Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTRY___COUNTRIES_HAVE_DIFFERENT_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCountry__CountriesHaveDifferentNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Language Name Min Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTRY___LANGUAGE_NAME_MIN_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCountry__LanguageNameMinLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaheres.impl.ReservableEntityImpl <em>Reservable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.ReservableEntityImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getReservableEntity()
		 * @generated
		 */
		EClass RESERVABLE_ENTITY = eINSTANCE.getReservableEntity();

		/**
		 * The meta object literal for the '<em><b>Has Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVABLE_ENTITY__HAS_IMAGE = eINSTANCE.getReservableEntity_HasImage();

		/**
		 * The meta object literal for the '<em><b>Has One Stock Per Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT = eINSTANCE.getReservableEntity_HasOneStockPerSlot();

		/**
		 * The meta object literal for the '{@link metaheres.impl.ReservationsConfigImpl <em>Reservations Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.ReservationsConfigImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getReservationsConfig()
		 * @generated
		 */
		EClass RESERVATIONS_CONFIG = eINSTANCE.getReservationsConfig();

		/**
		 * The meta object literal for the '<em><b>Has Move Out Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK = eINSTANCE.getReservationsConfig_HasMoveOutCheck();

		/**
		 * The meta object literal for the '<em><b>Min Request Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE = eINSTANCE.getReservationsConfig_MinRequestAdvance();

		/**
		 * The meta object literal for the '<em><b>Max Request Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE = eINSTANCE.getReservationsConfig_MaxRequestAdvance();

		/**
		 * The meta object literal for the '<em><b>Has Move In Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK = eINSTANCE.getReservationsConfig_HasMoveInCheck();

		/**
		 * The meta object literal for the '<em><b>Serviceconfig</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATIONS_CONFIG__SERVICECONFIG = eINSTANCE.getReservationsConfig_Serviceconfig();

		/**
		 * The meta object literal for the '<em><b>Statuslist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATIONS_CONFIG__STATUSLIST = eINSTANCE.getReservationsConfig_Statuslist();

		/**
		 * The meta object literal for the '<em><b>No Move In Allowed For Consumables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS_CONFIG___NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReservationsConfig__NoMoveInAllowedForConsumables__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link metaheres.impl.ResourcesConfigImpl <em>Resources Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.ResourcesConfigImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getResourcesConfig()
		 * @generated
		 */
		EClass RESOURCES_CONFIG = eINSTANCE.getResourcesConfig();

		/**
		 * The meta object literal for the '<em><b>Is Consumable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_CONFIG__IS_CONSUMABLE = eINSTANCE.getResourcesConfig_IsConsumable();

		/**
		 * The meta object literal for the '<em><b>Is Loan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_CONFIG__IS_LOAN = eINSTANCE.getResourcesConfig_IsLoan();

		/**
		 * The meta object literal for the '<em><b>Is Charged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_CONFIG__IS_CHARGED = eINSTANCE.getResourcesConfig_IsCharged();

		/**
		 * The meta object literal for the '<em><b>Serviceconfig</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_CONFIG__SERVICECONFIG = eINSTANCE.getResourcesConfig_Serviceconfig();

		/**
		 * The meta object literal for the '{@link metaheres.impl.LotsConfigImpl <em>Lots Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.LotsConfigImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getLotsConfig()
		 * @generated
		 */
		EClass LOTS_CONFIG = eINSTANCE.getLotsConfig();

		/**
		 * The meta object literal for the '<em><b>Serviceconfig</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTS_CONFIG__SERVICECONFIG = eINSTANCE.getLotsConfig_Serviceconfig();

		/**
		 * The meta object literal for the '{@link metaheres.impl.PricingSystemImpl <em>Pricing System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaheres.impl.PricingSystemImpl
		 * @see metaheres.impl.MetaheresPackageImpl#getPricingSystem()
		 * @generated
		 */
		EClass PRICING_SYSTEM = eINSTANCE.getPricingSystem();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_SYSTEM__CURRENCY = eINSTANCE.getPricingSystem_Currency();

		/**
		 * The meta object literal for the '<em><b>Tax System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_SYSTEM__TAX_SYSTEM = eINSTANCE.getPricingSystem_TaxSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_SYSTEM__NAME = eINSTANCE.getPricingSystem_Name();

	}

} //MetaheresPackage
