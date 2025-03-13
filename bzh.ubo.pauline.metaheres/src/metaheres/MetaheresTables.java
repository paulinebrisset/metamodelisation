/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /bzh.ubo.pauline.metaheres/model/metaheres.ecore
 * using:
 *   /bzh.ubo.pauline.metaheres/model/metaheres.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package metaheres;

// import metaheres.MetaheresPackage;
// import metaheres.MetaheresTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MetaheresTables provides the dispatch tables for the metaheres for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MetaheresTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MetaheresPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres = IdManager.getNsURIPackageId("http://www.bzh.ubo.pauline.metaheres", null, MetaheresPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = MetaheresTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Country = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("Country", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Language = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("Language", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LotsConfig = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("LotsConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PricingSystem = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("PricingSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ReservationsConfig = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("ReservationsConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ResourcesConfig = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("ResourcesConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RightLevel = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("RightLevel", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RightsLevelList = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("RightsLevelList", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceConfig = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("ServiceConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceName = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("ServiceName", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Status = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("Status", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StatusList = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("StatusList", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UsersConfig = MetaheresTables.PACKid_http_c_s_s_www_bzh_ubo_pauline_metaheres.getClassId("UsersConfig", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = MetaheresTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_RightsLevelList = TypeId.BAG.getSpecializedId(MetaheresTables.CLSSid_RightsLevelList);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ServiceConfig = TypeId.BAG.getSpecializedId(MetaheresTables.CLSSid_ServiceConfig);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Country = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_Country);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Language = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_Language);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PricingSystem = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_PricingSystem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ResourcesConfig = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_ResourcesConfig);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_RightLevel = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_RightLevel);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Status = TypeId.ORDERED_SET.getSpecializedId(MetaheresTables.CLSSid_Status);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Language = TypeId.SEQUENCE.getSpecializedId(MetaheresTables.CLSSid_Language);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Country = TypeId.SET.getSpecializedId(MetaheresTables.CLSSid_Country);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Language = TypeId.SET.getSpecializedId(MetaheresTables.CLSSid_Language);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceConfig = TypeId.SET.getSpecializedId(MetaheresTables.CLSSid_ServiceConfig);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MetaheresTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Country = new EcoreExecutorType(MetaheresPackage.Literals.COUNTRY, PACKAGE, 0);
		public static final EcoreExecutorType _Language = new EcoreExecutorType(MetaheresPackage.Literals.LANGUAGE, PACKAGE, 0);
		public static final EcoreExecutorType _LotsConfig = new EcoreExecutorType(MetaheresPackage.Literals.LOTS_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(MetaheresPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PricingSystem = new EcoreExecutorType(MetaheresPackage.Literals.PRICING_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _ReservableEntity = new EcoreExecutorType(MetaheresPackage.Literals.RESERVABLE_ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ReservationsConfig = new EcoreExecutorType(MetaheresPackage.Literals.RESERVATIONS_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _ResourcesConfig = new EcoreExecutorType(MetaheresPackage.Literals.RESOURCES_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _RightLevel = new EcoreExecutorType(MetaheresPackage.Literals.RIGHT_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _RightsLevelList = new EcoreExecutorType(MetaheresPackage.Literals.RIGHTS_LEVEL_LIST, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceConfig = new EcoreExecutorType(MetaheresPackage.Literals.SERVICE_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceName = new EcoreExecutorType(MetaheresPackage.Literals.SERVICE_NAME, PACKAGE, 0);
		public static final EcoreExecutorType _Status = new EcoreExecutorType(MetaheresPackage.Literals.STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _StatusList = new EcoreExecutorType(MetaheresPackage.Literals.STATUS_LIST, PACKAGE, 0);
		public static final EcoreExecutorType _UsersConfig = new EcoreExecutorType(MetaheresPackage.Literals.USERS_CONFIG, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Country,
			_Language,
			_LotsConfig,
			_NamedElement,
			_PricingSystem,
			_ReservableEntity,
			_ReservationsConfig,
			_ResourcesConfig,
			_RightLevel,
			_RightsLevelList,
			_ServiceConfig,
			_ServiceName,
			_Status,
			_StatusList,
			_UsersConfig
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Country__Country = new ExecutorFragment(Types._Country, MetaheresTables.Types._Country);
		private static final ExecutorFragment _Country__OclAny = new ExecutorFragment(Types._Country, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Country__OclElement = new ExecutorFragment(Types._Country, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Language__Language = new ExecutorFragment(Types._Language, MetaheresTables.Types._Language);
		private static final ExecutorFragment _Language__NamedElement = new ExecutorFragment(Types._Language, MetaheresTables.Types._NamedElement);
		private static final ExecutorFragment _Language__OclAny = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Language__OclElement = new ExecutorFragment(Types._Language, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LotsConfig__LotsConfig = new ExecutorFragment(Types._LotsConfig, MetaheresTables.Types._LotsConfig);
		private static final ExecutorFragment _LotsConfig__OclAny = new ExecutorFragment(Types._LotsConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LotsConfig__OclElement = new ExecutorFragment(Types._LotsConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LotsConfig__ReservableEntity = new ExecutorFragment(Types._LotsConfig, MetaheresTables.Types._ReservableEntity);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, MetaheresTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PricingSystem__OclAny = new ExecutorFragment(Types._PricingSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PricingSystem__OclElement = new ExecutorFragment(Types._PricingSystem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PricingSystem__PricingSystem = new ExecutorFragment(Types._PricingSystem, MetaheresTables.Types._PricingSystem);

		private static final ExecutorFragment _ReservableEntity__OclAny = new ExecutorFragment(Types._ReservableEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReservableEntity__OclElement = new ExecutorFragment(Types._ReservableEntity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReservableEntity__ReservableEntity = new ExecutorFragment(Types._ReservableEntity, MetaheresTables.Types._ReservableEntity);

		private static final ExecutorFragment _ReservationsConfig__OclAny = new ExecutorFragment(Types._ReservationsConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReservationsConfig__OclElement = new ExecutorFragment(Types._ReservationsConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReservationsConfig__ReservationsConfig = new ExecutorFragment(Types._ReservationsConfig, MetaheresTables.Types._ReservationsConfig);

		private static final ExecutorFragment _ResourcesConfig__OclAny = new ExecutorFragment(Types._ResourcesConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ResourcesConfig__OclElement = new ExecutorFragment(Types._ResourcesConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ResourcesConfig__ReservableEntity = new ExecutorFragment(Types._ResourcesConfig, MetaheresTables.Types._ReservableEntity);
		private static final ExecutorFragment _ResourcesConfig__ResourcesConfig = new ExecutorFragment(Types._ResourcesConfig, MetaheresTables.Types._ResourcesConfig);

		private static final ExecutorFragment _RightLevel__NamedElement = new ExecutorFragment(Types._RightLevel, MetaheresTables.Types._NamedElement);
		private static final ExecutorFragment _RightLevel__OclAny = new ExecutorFragment(Types._RightLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RightLevel__OclElement = new ExecutorFragment(Types._RightLevel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RightLevel__RightLevel = new ExecutorFragment(Types._RightLevel, MetaheresTables.Types._RightLevel);

		private static final ExecutorFragment _RightsLevelList__OclAny = new ExecutorFragment(Types._RightsLevelList, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RightsLevelList__OclElement = new ExecutorFragment(Types._RightsLevelList, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RightsLevelList__RightsLevelList = new ExecutorFragment(Types._RightsLevelList, MetaheresTables.Types._RightsLevelList);

		private static final ExecutorFragment _ServiceConfig__OclAny = new ExecutorFragment(Types._ServiceConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceConfig__OclElement = new ExecutorFragment(Types._ServiceConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceConfig__ServiceConfig = new ExecutorFragment(Types._ServiceConfig, MetaheresTables.Types._ServiceConfig);

		private static final ExecutorFragment _ServiceName__NamedElement = new ExecutorFragment(Types._ServiceName, MetaheresTables.Types._NamedElement);
		private static final ExecutorFragment _ServiceName__OclAny = new ExecutorFragment(Types._ServiceName, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceName__OclElement = new ExecutorFragment(Types._ServiceName, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceName__ServiceName = new ExecutorFragment(Types._ServiceName, MetaheresTables.Types._ServiceName);

		private static final ExecutorFragment _Status__NamedElement = new ExecutorFragment(Types._Status, MetaheresTables.Types._NamedElement);
		private static final ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, MetaheresTables.Types._Status);

		private static final ExecutorFragment _StatusList__OclAny = new ExecutorFragment(Types._StatusList, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StatusList__OclElement = new ExecutorFragment(Types._StatusList, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StatusList__StatusList = new ExecutorFragment(Types._StatusList, MetaheresTables.Types._StatusList);

		private static final ExecutorFragment _UsersConfig__OclAny = new ExecutorFragment(Types._UsersConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UsersConfig__OclElement = new ExecutorFragment(Types._UsersConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UsersConfig__UsersConfig = new ExecutorFragment(Types._UsersConfig, MetaheresTables.Types._UsersConfig);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Country__language = new EcoreExecutorProperty(MetaheresPackage.Literals.COUNTRY__LANGUAGE, Types._Country, 0);
		public static final ExecutorProperty _Country__name = new EcoreExecutorProperty(MetaheresPackage.Literals.COUNTRY__NAME, Types._Country, 1);
		public static final ExecutorProperty _Country__pricingsystem = new EcoreExecutorProperty(MetaheresPackage.Literals.COUNTRY__PRICINGSYSTEM, Types._Country, 2);
		public static final ExecutorProperty _Country__ServiceConfig__country = new ExecutorPropertyWithImplementation("ServiceConfig", Types._Country, 3, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.SERVICE_CONFIG__COUNTRY));

		public static final ExecutorProperty _Language__Country__language = new ExecutorPropertyWithImplementation("Country", Types._Language, 0, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.COUNTRY__LANGUAGE));
		public static final ExecutorProperty _Language__ServiceConfig__language = new ExecutorPropertyWithImplementation("ServiceConfig", Types._Language, 1, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.SERVICE_CONFIG__LANGUAGE));

		public static final ExecutorProperty _LotsConfig__serviceconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.LOTS_CONFIG__SERVICECONFIG, Types._LotsConfig, 0);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(MetaheresPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _PricingSystem__currency = new EcoreExecutorProperty(MetaheresPackage.Literals.PRICING_SYSTEM__CURRENCY, Types._PricingSystem, 0);
		public static final ExecutorProperty _PricingSystem__name = new EcoreExecutorProperty(MetaheresPackage.Literals.PRICING_SYSTEM__NAME, Types._PricingSystem, 1);
		public static final ExecutorProperty _PricingSystem__taxSystem = new EcoreExecutorProperty(MetaheresPackage.Literals.PRICING_SYSTEM__TAX_SYSTEM, Types._PricingSystem, 2);
		public static final ExecutorProperty _PricingSystem__Country__pricingsystem = new ExecutorPropertyWithImplementation("Country", Types._PricingSystem, 3, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.COUNTRY__PRICINGSYSTEM));
		public static final ExecutorProperty _PricingSystem__ServiceConfig__pricingsystem = new ExecutorPropertyWithImplementation("ServiceConfig", Types._PricingSystem, 4, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.SERVICE_CONFIG__PRICINGSYSTEM));

		public static final ExecutorProperty _ReservableEntity__hasImage = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVABLE_ENTITY__HAS_IMAGE, Types._ReservableEntity, 0);
		public static final ExecutorProperty _ReservableEntity__hasOneStockPerSlot = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT, Types._ReservableEntity, 1);

		public static final ExecutorProperty _ReservationsConfig__hasMoveInCheck = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK, Types._ReservationsConfig, 0);
		public static final ExecutorProperty _ReservationsConfig__hasMoveOutCheck = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK, Types._ReservationsConfig, 1);
		public static final ExecutorProperty _ReservationsConfig__maxRequestAdvance = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE, Types._ReservationsConfig, 2);
		public static final ExecutorProperty _ReservationsConfig__minRequestAdvance = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE, Types._ReservationsConfig, 3);
		public static final ExecutorProperty _ReservationsConfig__serviceconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__SERVICECONFIG, Types._ReservationsConfig, 4);
		public static final ExecutorProperty _ReservationsConfig__statuslist = new EcoreExecutorProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__STATUSLIST, Types._ReservationsConfig, 5);

		public static final ExecutorProperty _ResourcesConfig__isCharged = new EcoreExecutorProperty(MetaheresPackage.Literals.RESOURCES_CONFIG__IS_CHARGED, Types._ResourcesConfig, 0);
		public static final ExecutorProperty _ResourcesConfig__isConsumable = new EcoreExecutorProperty(MetaheresPackage.Literals.RESOURCES_CONFIG__IS_CONSUMABLE, Types._ResourcesConfig, 1);
		public static final ExecutorProperty _ResourcesConfig__isLoan = new EcoreExecutorProperty(MetaheresPackage.Literals.RESOURCES_CONFIG__IS_LOAN, Types._ResourcesConfig, 2);
		public static final ExecutorProperty _ResourcesConfig__serviceconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.RESOURCES_CONFIG__SERVICECONFIG, Types._ResourcesConfig, 3);

		public static final ExecutorProperty _RightLevel__RightsLevelList__rightlevel = new ExecutorPropertyWithImplementation("RightsLevelList", Types._RightLevel, 0, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.RIGHTS_LEVEL_LIST__RIGHTLEVEL));

		public static final ExecutorProperty _RightsLevelList__rightlevel = new EcoreExecutorProperty(MetaheresPackage.Literals.RIGHTS_LEVEL_LIST__RIGHTLEVEL, Types._RightsLevelList, 0);
		public static final ExecutorProperty _RightsLevelList__UsersConfig__rightslevellist = new ExecutorPropertyWithImplementation("UsersConfig", Types._RightsLevelList, 1, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.USERS_CONFIG__RIGHTSLEVELLIST));

		public static final ExecutorProperty _ServiceConfig__closesOnPublicHolidays = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS, Types._ServiceConfig, 0);
		public static final ExecutorProperty _ServiceConfig__countInBusinessDays = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS, Types._ServiceConfig, 1);
		public static final ExecutorProperty _ServiceConfig__country = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__COUNTRY, Types._ServiceConfig, 2);
		public static final ExecutorProperty _ServiceConfig__hasChart = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__HAS_CHART, Types._ServiceConfig, 3);
		public static final ExecutorProperty _ServiceConfig__inventoryIsPublic = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__INVENTORY_IS_PUBLIC, Types._ServiceConfig, 4);
		public static final ExecutorProperty _ServiceConfig__language = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__LANGUAGE, Types._ServiceConfig, 5);
		public static final ExecutorProperty _ServiceConfig__lotsconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__LOTSCONFIG, Types._ServiceConfig, 6);
		public static final ExecutorProperty _ServiceConfig__pricingsystem = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__PRICINGSYSTEM, Types._ServiceConfig, 7);
		public static final ExecutorProperty _ServiceConfig__reservationsconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__RESERVATIONSCONFIG, Types._ServiceConfig, 8);
		public static final ExecutorProperty _ServiceConfig__resourcesconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__RESOURCESCONFIG, Types._ServiceConfig, 9);
		public static final ExecutorProperty _ServiceConfig__servicename = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_CONFIG__SERVICENAME, Types._ServiceConfig, 10);

		public static final ExecutorProperty _ServiceName__serviceconfig = new EcoreExecutorProperty(MetaheresPackage.Literals.SERVICE_NAME__SERVICECONFIG, Types._ServiceName, 0);

		public static final ExecutorProperty _Status__StatusList__status = new ExecutorPropertyWithImplementation("StatusList", Types._Status, 0, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.STATUS_LIST__STATUS));

		public static final ExecutorProperty _StatusList__status = new EcoreExecutorProperty(MetaheresPackage.Literals.STATUS_LIST__STATUS, Types._StatusList, 0);
		public static final ExecutorProperty _StatusList__ReservationsConfig__statuslist = new ExecutorPropertyWithImplementation("ReservationsConfig", Types._StatusList, 1, new EcoreLibraryOppositeProperty(MetaheresPackage.Literals.RESERVATIONS_CONFIG__STATUSLIST));

		public static final ExecutorProperty _UsersConfig__bloackedAtUnfulfilledReservation = new EcoreExecutorProperty(MetaheresPackage.Literals.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION, Types._UsersConfig, 0);
		public static final ExecutorProperty _UsersConfig__hasAdress = new EcoreExecutorProperty(MetaheresPackage.Literals.USERS_CONFIG__HAS_ADRESS, Types._UsersConfig, 1);
		public static final ExecutorProperty _UsersConfig__hasPhone = new EcoreExecutorProperty(MetaheresPackage.Literals.USERS_CONFIG__HAS_PHONE, Types._UsersConfig, 2);
		public static final ExecutorProperty _UsersConfig__rightslevellist = new EcoreExecutorProperty(MetaheresPackage.Literals.USERS_CONFIG__RIGHTSLEVELLIST, Types._UsersConfig, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Country =
			{
				Fragments._Country__OclAny /* 0 */,
				Fragments._Country__OclElement /* 1 */,
				Fragments._Country__Country /* 2 */
			};
		private static final int /*@NonNull*/ [] __Country = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Language =
			{
				Fragments._Language__OclAny /* 0 */,
				Fragments._Language__OclElement /* 1 */,
				Fragments._Language__NamedElement /* 2 */,
				Fragments._Language__Language /* 3 */
			};
		private static final int /*@NonNull*/ [] __Language = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LotsConfig =
			{
				Fragments._LotsConfig__OclAny /* 0 */,
				Fragments._LotsConfig__OclElement /* 1 */,
				Fragments._LotsConfig__ReservableEntity /* 2 */,
				Fragments._LotsConfig__LotsConfig /* 3 */
			};
		private static final int /*@NonNull*/ [] __LotsConfig = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PricingSystem =
			{
				Fragments._PricingSystem__OclAny /* 0 */,
				Fragments._PricingSystem__OclElement /* 1 */,
				Fragments._PricingSystem__PricingSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __PricingSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReservableEntity =
			{
				Fragments._ReservableEntity__OclAny /* 0 */,
				Fragments._ReservableEntity__OclElement /* 1 */,
				Fragments._ReservableEntity__ReservableEntity /* 2 */
			};
		private static final int /*@NonNull*/ [] __ReservableEntity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReservationsConfig =
			{
				Fragments._ReservationsConfig__OclAny /* 0 */,
				Fragments._ReservationsConfig__OclElement /* 1 */,
				Fragments._ReservationsConfig__ReservationsConfig /* 2 */
			};
		private static final int /*@NonNull*/ [] __ReservationsConfig = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ResourcesConfig =
			{
				Fragments._ResourcesConfig__OclAny /* 0 */,
				Fragments._ResourcesConfig__OclElement /* 1 */,
				Fragments._ResourcesConfig__ReservableEntity /* 2 */,
				Fragments._ResourcesConfig__ResourcesConfig /* 3 */
			};
		private static final int /*@NonNull*/ [] __ResourcesConfig = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RightLevel =
			{
				Fragments._RightLevel__OclAny /* 0 */,
				Fragments._RightLevel__OclElement /* 1 */,
				Fragments._RightLevel__NamedElement /* 2 */,
				Fragments._RightLevel__RightLevel /* 3 */
			};
		private static final int /*@NonNull*/ [] __RightLevel = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RightsLevelList =
			{
				Fragments._RightsLevelList__OclAny /* 0 */,
				Fragments._RightsLevelList__OclElement /* 1 */,
				Fragments._RightsLevelList__RightsLevelList /* 2 */
			};
		private static final int /*@NonNull*/ [] __RightsLevelList = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceConfig =
			{
				Fragments._ServiceConfig__OclAny /* 0 */,
				Fragments._ServiceConfig__OclElement /* 1 */,
				Fragments._ServiceConfig__ServiceConfig /* 2 */
			};
		private static final int /*@NonNull*/ [] __ServiceConfig = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceName =
			{
				Fragments._ServiceName__OclAny /* 0 */,
				Fragments._ServiceName__OclElement /* 1 */,
				Fragments._ServiceName__NamedElement /* 2 */,
				Fragments._ServiceName__ServiceName /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceName = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Status =
			{
				Fragments._Status__OclAny /* 0 */,
				Fragments._Status__OclElement /* 1 */,
				Fragments._Status__NamedElement /* 2 */,
				Fragments._Status__Status /* 3 */
			};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StatusList =
			{
				Fragments._StatusList__OclAny /* 0 */,
				Fragments._StatusList__OclElement /* 1 */,
				Fragments._StatusList__StatusList /* 2 */
			};
		private static final int /*@NonNull*/ [] __StatusList = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UsersConfig =
			{
				Fragments._UsersConfig__OclAny /* 0 */,
				Fragments._UsersConfig__OclElement /* 1 */,
				Fragments._UsersConfig__UsersConfig /* 2 */
			};
		private static final int /*@NonNull*/ [] __UsersConfig = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Country.initFragments(_Country, __Country);
			Types._Language.initFragments(_Language, __Language);
			Types._LotsConfig.initFragments(_LotsConfig, __LotsConfig);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._PricingSystem.initFragments(_PricingSystem, __PricingSystem);
			Types._ReservableEntity.initFragments(_ReservableEntity, __ReservableEntity);
			Types._ReservationsConfig.initFragments(_ReservationsConfig, __ReservationsConfig);
			Types._ResourcesConfig.initFragments(_ResourcesConfig, __ResourcesConfig);
			Types._RightLevel.initFragments(_RightLevel, __RightLevel);
			Types._RightsLevelList.initFragments(_RightsLevelList, __RightsLevelList);
			Types._ServiceConfig.initFragments(_ServiceConfig, __ServiceConfig);
			Types._ServiceName.initFragments(_ServiceName, __ServiceName);
			Types._Status.initFragments(_Status, __Status);
			Types._StatusList.initFragments(_StatusList, __StatusList);
			Types._UsersConfig.initFragments(_UsersConfig, __UsersConfig);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Country__Country = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Country__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Country__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Language__Language = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Language__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LotsConfig__LotsConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LotsConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LotsConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LotsConfig__ReservableEntity = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PricingSystem__PricingSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PricingSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PricingSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ReservableEntity__ReservableEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReservableEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReservableEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ReservationsConfig__ReservationsConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReservationsConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReservationsConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ResourcesConfig__ResourcesConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ResourcesConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ResourcesConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ResourcesConfig__ReservableEntity = {};

		private static final ExecutorOperation /*@NonNull*/ [] _RightLevel__RightLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RightLevel__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RightLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RightLevel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RightsLevelList__RightsLevelList = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RightsLevelList__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RightsLevelList__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConfig__ServiceConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceName__ServiceName = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceName__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceName__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceName__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StatusList__StatusList = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StatusList__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StatusList__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UsersConfig__UsersConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UsersConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UsersConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Country__Country.initOperations(_Country__Country);
			Fragments._Country__OclAny.initOperations(_Country__OclAny);
			Fragments._Country__OclElement.initOperations(_Country__OclElement);

			Fragments._Language__Language.initOperations(_Language__Language);
			Fragments._Language__NamedElement.initOperations(_Language__NamedElement);
			Fragments._Language__OclAny.initOperations(_Language__OclAny);
			Fragments._Language__OclElement.initOperations(_Language__OclElement);

			Fragments._LotsConfig__LotsConfig.initOperations(_LotsConfig__LotsConfig);
			Fragments._LotsConfig__OclAny.initOperations(_LotsConfig__OclAny);
			Fragments._LotsConfig__OclElement.initOperations(_LotsConfig__OclElement);
			Fragments._LotsConfig__ReservableEntity.initOperations(_LotsConfig__ReservableEntity);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._PricingSystem__OclAny.initOperations(_PricingSystem__OclAny);
			Fragments._PricingSystem__OclElement.initOperations(_PricingSystem__OclElement);
			Fragments._PricingSystem__PricingSystem.initOperations(_PricingSystem__PricingSystem);

			Fragments._ReservableEntity__OclAny.initOperations(_ReservableEntity__OclAny);
			Fragments._ReservableEntity__OclElement.initOperations(_ReservableEntity__OclElement);
			Fragments._ReservableEntity__ReservableEntity.initOperations(_ReservableEntity__ReservableEntity);

			Fragments._ReservationsConfig__OclAny.initOperations(_ReservationsConfig__OclAny);
			Fragments._ReservationsConfig__OclElement.initOperations(_ReservationsConfig__OclElement);
			Fragments._ReservationsConfig__ReservationsConfig.initOperations(_ReservationsConfig__ReservationsConfig);

			Fragments._ResourcesConfig__OclAny.initOperations(_ResourcesConfig__OclAny);
			Fragments._ResourcesConfig__OclElement.initOperations(_ResourcesConfig__OclElement);
			Fragments._ResourcesConfig__ReservableEntity.initOperations(_ResourcesConfig__ReservableEntity);
			Fragments._ResourcesConfig__ResourcesConfig.initOperations(_ResourcesConfig__ResourcesConfig);

			Fragments._RightLevel__NamedElement.initOperations(_RightLevel__NamedElement);
			Fragments._RightLevel__OclAny.initOperations(_RightLevel__OclAny);
			Fragments._RightLevel__OclElement.initOperations(_RightLevel__OclElement);
			Fragments._RightLevel__RightLevel.initOperations(_RightLevel__RightLevel);

			Fragments._RightsLevelList__OclAny.initOperations(_RightsLevelList__OclAny);
			Fragments._RightsLevelList__OclElement.initOperations(_RightsLevelList__OclElement);
			Fragments._RightsLevelList__RightsLevelList.initOperations(_RightsLevelList__RightsLevelList);

			Fragments._ServiceConfig__OclAny.initOperations(_ServiceConfig__OclAny);
			Fragments._ServiceConfig__OclElement.initOperations(_ServiceConfig__OclElement);
			Fragments._ServiceConfig__ServiceConfig.initOperations(_ServiceConfig__ServiceConfig);

			Fragments._ServiceName__NamedElement.initOperations(_ServiceName__NamedElement);
			Fragments._ServiceName__OclAny.initOperations(_ServiceName__OclAny);
			Fragments._ServiceName__OclElement.initOperations(_ServiceName__OclElement);
			Fragments._ServiceName__ServiceName.initOperations(_ServiceName__ServiceName);

			Fragments._Status__NamedElement.initOperations(_Status__NamedElement);
			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._StatusList__OclAny.initOperations(_StatusList__OclAny);
			Fragments._StatusList__OclElement.initOperations(_StatusList__OclElement);
			Fragments._StatusList__StatusList.initOperations(_StatusList__StatusList);

			Fragments._UsersConfig__OclAny.initOperations(_UsersConfig__OclAny);
			Fragments._UsersConfig__OclElement.initOperations(_UsersConfig__OclElement);
			Fragments._UsersConfig__UsersConfig.initOperations(_UsersConfig__UsersConfig);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Country = {
			MetaheresTables.Properties._Country__language,
			MetaheresTables.Properties._Country__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._Country__pricingsystem
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Language = {
			MetaheresTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LotsConfig = {
			MetaheresTables.Properties._ReservableEntity__hasImage,
			MetaheresTables.Properties._ReservableEntity__hasOneStockPerSlot,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._LotsConfig__serviceconfig
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			MetaheresTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PricingSystem = {
			MetaheresTables.Properties._PricingSystem__currency,
			MetaheresTables.Properties._PricingSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._PricingSystem__taxSystem
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReservableEntity = {
			MetaheresTables.Properties._ReservableEntity__hasImage,
			MetaheresTables.Properties._ReservableEntity__hasOneStockPerSlot,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReservationsConfig = {
			MetaheresTables.Properties._ReservationsConfig__hasMoveInCheck,
			MetaheresTables.Properties._ReservationsConfig__hasMoveOutCheck,
			MetaheresTables.Properties._ReservationsConfig__maxRequestAdvance,
			MetaheresTables.Properties._ReservationsConfig__minRequestAdvance,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._ReservationsConfig__serviceconfig,
			MetaheresTables.Properties._ReservationsConfig__statuslist
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ResourcesConfig = {
			MetaheresTables.Properties._ReservableEntity__hasImage,
			MetaheresTables.Properties._ReservableEntity__hasOneStockPerSlot,
			MetaheresTables.Properties._ResourcesConfig__isCharged,
			MetaheresTables.Properties._ResourcesConfig__isConsumable,
			MetaheresTables.Properties._ResourcesConfig__isLoan,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._ResourcesConfig__serviceconfig
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RightLevel = {
			MetaheresTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RightsLevelList = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._RightsLevelList__rightlevel
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceConfig = {
			MetaheresTables.Properties._ServiceConfig__closesOnPublicHolidays,
			MetaheresTables.Properties._ServiceConfig__countInBusinessDays,
			MetaheresTables.Properties._ServiceConfig__country,
			MetaheresTables.Properties._ServiceConfig__hasChart,
			MetaheresTables.Properties._ServiceConfig__inventoryIsPublic,
			MetaheresTables.Properties._ServiceConfig__language,
			MetaheresTables.Properties._ServiceConfig__lotsconfig,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._ServiceConfig__pricingsystem,
			MetaheresTables.Properties._ServiceConfig__reservationsconfig,
			MetaheresTables.Properties._ServiceConfig__resourcesconfig,
			MetaheresTables.Properties._ServiceConfig__servicename
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceName = {
			MetaheresTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._ServiceName__serviceconfig
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Status = {
			MetaheresTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StatusList = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._StatusList__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UsersConfig = {
			MetaheresTables.Properties._UsersConfig__bloackedAtUnfulfilledReservation,
			MetaheresTables.Properties._UsersConfig__hasAdress,
			MetaheresTables.Properties._UsersConfig__hasPhone,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MetaheresTables.Properties._UsersConfig__rightslevellist
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Country__Country.initProperties(_Country);
			Fragments._Language__Language.initProperties(_Language);
			Fragments._LotsConfig__LotsConfig.initProperties(_LotsConfig);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._PricingSystem__PricingSystem.initProperties(_PricingSystem);
			Fragments._ReservableEntity__ReservableEntity.initProperties(_ReservableEntity);
			Fragments._ReservationsConfig__ReservationsConfig.initProperties(_ReservationsConfig);
			Fragments._ResourcesConfig__ResourcesConfig.initProperties(_ResourcesConfig);
			Fragments._RightLevel__RightLevel.initProperties(_RightLevel);
			Fragments._RightsLevelList__RightsLevelList.initProperties(_RightsLevelList);
			Fragments._ServiceConfig__ServiceConfig.initProperties(_ServiceConfig);
			Fragments._ServiceName__ServiceName.initProperties(_ServiceName);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._StatusList__StatusList.initProperties(_StatusList);
			Fragments._UsersConfig__UsersConfig.initProperties(_UsersConfig);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MetaheresTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MetaheresTables();
	}

	private MetaheresTables() {
		super(MetaheresPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		MetaheresPackage.Literals.COUNTRY,
		MetaheresPackage.Literals.SERVICE_CONFIG
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
