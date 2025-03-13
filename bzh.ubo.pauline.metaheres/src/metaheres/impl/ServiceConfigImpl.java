/**
 */
package metaheres.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaheres.Country;
import metaheres.Language;
import metaheres.LotsConfig;
import metaheres.MetaheresPackage;
import metaheres.MetaheresTables;
import metaheres.PricingSystem;
import metaheres.ReservationsConfig;
import metaheres.ResourcesConfig;
import metaheres.ServiceConfig;
import metaheres.ServiceName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getServicename <em>Servicename</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getClosesOnPublicHolidays <em>Closes On Public Holidays</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getInventoryIsPublic <em>Inventory Is Public</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getHasChart <em>Has Chart</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getCountInBusinessDays <em>Count In Business Days</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getReservationsconfig <em>Reservationsconfig</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getResourcesconfig <em>Resourcesconfig</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getLotsconfig <em>Lotsconfig</em>}</li>
 *   <li>{@link metaheres.impl.ServiceConfigImpl#getPricingsystem <em>Pricingsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConfigImpl extends MinimalEObjectImpl.Container implements ServiceConfig {
	/**
	 * The default value of the '{@link #getClosesOnPublicHolidays() <em>Closes On Public Holidays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosesOnPublicHolidays()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLOSES_ON_PUBLIC_HOLIDAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosesOnPublicHolidays() <em>Closes On Public Holidays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosesOnPublicHolidays()
	 * @generated
	 * @ordered
	 */
	protected Boolean closesOnPublicHolidays = CLOSES_ON_PUBLIC_HOLIDAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInventoryIsPublic() <em>Inventory Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INVENTORY_IS_PUBLIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryIsPublic() <em>Inventory Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryIsPublic()
	 * @generated
	 * @ordered
	 */
	protected Boolean inventoryIsPublic = INVENTORY_IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasChart() <em>Has Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChart()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_CHART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasChart() <em>Has Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChart()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasChart = HAS_CHART_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountInBusinessDays() <em>Count In Business Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountInBusinessDays()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COUNT_IN_BUSINESS_DAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountInBusinessDays() <em>Count In Business Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountInBusinessDays()
	 * @generated
	 * @ordered
	 */
	protected Boolean countInBusinessDays = COUNT_IN_BUSINESS_DAYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> language;

	/**
	 * The cached value of the '{@link #getReservationsconfig() <em>Reservationsconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationsconfig()
	 * @generated
	 * @ordered
	 */
	protected ReservationsConfig reservationsconfig;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> country;

	/**
	 * The cached value of the '{@link #getResourcesconfig() <em>Resourcesconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcesConfig> resourcesconfig;

	/**
	 * The cached value of the '{@link #getLotsconfig() <em>Lotsconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotsconfig()
	 * @generated
	 * @ordered
	 */
	protected LotsConfig lotsconfig;

	/**
	 * The cached value of the '{@link #getPricingsystem() <em>Pricingsystem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingSystem> pricingsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.SERVICE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceName getServicename() {
		if (eContainerFeatureID() != MetaheresPackage.SERVICE_CONFIG__SERVICENAME) return null;
		return (ServiceName)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicename(ServiceName newServicename, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServicename, MetaheresPackage.SERVICE_CONFIG__SERVICENAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicename(ServiceName newServicename) {
		if (newServicename != eInternalContainer() || (eContainerFeatureID() != MetaheresPackage.SERVICE_CONFIG__SERVICENAME && newServicename != null)) {
			if (EcoreUtil.isAncestor(this, newServicename))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServicename != null)
				msgs = ((InternalEObject)newServicename).eInverseAdd(this, MetaheresPackage.SERVICE_NAME__SERVICECONFIG, ServiceName.class, msgs);
			msgs = basicSetServicename(newServicename, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__SERVICENAME, newServicename, newServicename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getClosesOnPublicHolidays() {
		return closesOnPublicHolidays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosesOnPublicHolidays(Boolean newClosesOnPublicHolidays) {
		Boolean oldClosesOnPublicHolidays = closesOnPublicHolidays;
		closesOnPublicHolidays = newClosesOnPublicHolidays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS, oldClosesOnPublicHolidays, closesOnPublicHolidays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInventoryIsPublic() {
		return inventoryIsPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryIsPublic(Boolean newInventoryIsPublic) {
		Boolean oldInventoryIsPublic = inventoryIsPublic;
		inventoryIsPublic = newInventoryIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__INVENTORY_IS_PUBLIC, oldInventoryIsPublic, inventoryIsPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasChart() {
		return hasChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasChart(Boolean newHasChart) {
		Boolean oldHasChart = hasChart;
		hasChart = newHasChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__HAS_CHART, oldHasChart, hasChart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCountInBusinessDays() {
		return countInBusinessDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountInBusinessDays(Boolean newCountInBusinessDays) {
		Boolean oldCountInBusinessDays = countInBusinessDays;
		countInBusinessDays = newCountInBusinessDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS, oldCountInBusinessDays, countInBusinessDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Language>(Language.class, this, MetaheresPackage.SERVICE_CONFIG__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsConfig getReservationsconfig() {
		return reservationsconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservationsconfig(ReservationsConfig newReservationsconfig, NotificationChain msgs) {
		ReservationsConfig oldReservationsconfig = reservationsconfig;
		reservationsconfig = newReservationsconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG, oldReservationsconfig, newReservationsconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationsconfig(ReservationsConfig newReservationsconfig) {
		if (newReservationsconfig != reservationsconfig) {
			NotificationChain msgs = null;
			if (reservationsconfig != null)
				msgs = ((InternalEObject)reservationsconfig).eInverseRemove(this, MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG, ReservationsConfig.class, msgs);
			if (newReservationsconfig != null)
				msgs = ((InternalEObject)newReservationsconfig).eInverseAdd(this, MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG, ReservationsConfig.class, msgs);
			msgs = basicSetReservationsconfig(newReservationsconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG, newReservationsconfig, newReservationsconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<Country>(Country.class, this, MetaheresPackage.SERVICE_CONFIG__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcesConfig> getResourcesconfig() {
		if (resourcesconfig == null) {
			resourcesconfig = new EObjectContainmentWithInverseEList<ResourcesConfig>(ResourcesConfig.class, this, MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG, MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG);
		}
		return resourcesconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LotsConfig getLotsconfig() {
		return lotsconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotsconfig(LotsConfig newLotsconfig, NotificationChain msgs) {
		LotsConfig oldLotsconfig = lotsconfig;
		lotsconfig = newLotsconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG, oldLotsconfig, newLotsconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotsconfig(LotsConfig newLotsconfig) {
		if (newLotsconfig != lotsconfig) {
			NotificationChain msgs = null;
			if (lotsconfig != null)
				msgs = ((InternalEObject)lotsconfig).eInverseRemove(this, MetaheresPackage.LOTS_CONFIG__SERVICECONFIG, LotsConfig.class, msgs);
			if (newLotsconfig != null)
				msgs = ((InternalEObject)newLotsconfig).eInverseAdd(this, MetaheresPackage.LOTS_CONFIG__SERVICECONFIG, LotsConfig.class, msgs);
			msgs = basicSetLotsconfig(newLotsconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG, newLotsconfig, newLotsconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingSystem> getPricingsystem() {
		if (pricingsystem == null) {
			pricingsystem = new EObjectResolvingEList<PricingSystem>(PricingSystem.class, this, MetaheresPackage.SERVICE_CONFIG__PRICINGSYSTEM);
		}
		return pricingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allServicesHaveDifferentNamesTer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ServiceConfig::allServicesHaveDifferentNamesTer";
		try {
			/**
			 *
			 * inv allServicesHaveDifferentNamesTer:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ServiceConfig.allInstances()
			 *         ->forAll(service1, service2 | service1 <> service2 implies service1.servicename.name <> service2.servicename.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.SERVICE_CONFIG___ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metaheres_c_c_ServiceConfig = idResolver.getClass(MetaheresTables.CLSSid_ServiceConfig, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, MetaheresTables.SET_CLSSid_ServiceConfig, TYP_metaheres_c_c_ServiceConfig);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * service1 <> service2 implies service1.servicename.name <> service2.servicename.name
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object service1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object service2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ ServiceConfig local_0 = (ServiceConfig)service1;
								final /*@NonInvalid*/ ServiceConfig local_1 = (ServiceConfig)service2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::ServiceConfig::servicename\'");
										}
										final /*@Thrown*/ ServiceName servicename = local_0.getServicename();
										if (servicename == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::NamedElement::name\'");
										}
										final /*@Thrown*/ String name = servicename.getName();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::ServiceConfig::servicename\'");
										}
										final /*@Thrown*/ ServiceName servicename_0 = local_1.getServicename();
										if (servicename_0 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::NamedElement::name\'");
										}
										final /*@Thrown*/ String name_0 = servicename_0.getName();
										final /*@Thrown*/ boolean ne_0 = (name != null) ? !name.equals(name_0) : (name_0 != null);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, allInstances, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MetaheresTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allLanguagesFromCountriesVariant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ServiceConfig::allLanguagesFromCountriesVariant";
		try {
			/**
			 *
			 * inv allLanguagesFromCountriesVariant:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           countriesLanguages : Set(metaheres::Language) = self.country->collect(language)
			 *           ->asSet()
			 *         in
			 *           countriesLanguages->forAll(lang |
			 *             self.language.name->includes(lang.name))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES_VARIANT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_forAll;
				try {
					final /*@NonInvalid*/ List<Country> country = this.getCountry();
					final /*@NonInvalid*/ OrderedSetValue BOXED_country = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_Country, country);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MetaheresTables.SEQ_CLSSid_Language);
					Iterator<Object> ITERATOR__1 = BOXED_country.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Country _1 = (Country)ITERATOR__1.next();
						/**
						 * language
						 */
						final /*@NonInvalid*/ Language language = _1.getLanguage();
						//
						accumulator.add(language);
					}
					final /*@NonInvalid*/ SetValue countriesLanguages = CollectionAsSetOperation.INSTANCE.evaluate(collect);
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_lang = countriesLanguages.iterator();
					/*@Thrown*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_lang.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Language lang = (Language)ITERATOR_lang.next();
						/**
						 * self.language.name->includes(lang.name)
						 */
						/*@Caught*/ Object CAUGHT_includes;
						try {
							final /*@NonInvalid*/ List<Language> language_0 = this.getLanguage();
							final /*@NonInvalid*/ OrderedSetValue BOXED_language_0 = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_Language, language_0);
							/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(MetaheresTables.SEQ_PRIMid_String);
							Iterator<Object> ITERATOR__1_0 = BOXED_language_0.iterator();
							/*@Thrown*/ SequenceValue collect_0;
							while (true) {
								if (!ITERATOR__1_0.hasNext()) {
									collect_0 = accumulator_1;
									break;
								}
								/*@NonInvalid*/ Language _1_0 = (Language)ITERATOR__1_0.next();
								/**
								 * name
								 */
								final /*@NonInvalid*/ String name = _1_0.getName();
								//
								accumulator_1.add(name);
							}
							final /*@NonInvalid*/ String name_0 = lang.getName();
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect_0, name_0).booleanValue();
							CAUGHT_includes = includes;
						}
						catch (Exception e) {
							CAUGHT_includes = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_includes;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_forAll = forAll;
				}
				catch (Exception e) {
					CAUGHT_forAll = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_forAll, MetaheresTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ifResourceChargedPricingSystemIsMandatory(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ServiceConfig::ifResourceChargedPricingSystemIsMandatory";
		try {
			/**
			 *
			 * inv ifResourceChargedPricingSystemIsMandatory:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = resourcesconfig->exists(rc | rc.isCharged) implies
			 *         pricingsystem->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.SERVICE_CONFIG___IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<ResourcesConfig> resourcesconfig = this.getResourcesconfig();
					final /*@NonInvalid*/ OrderedSetValue BOXED_resourcesconfig = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_ResourcesConfig, resourcesconfig);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_rc = BOXED_resourcesconfig.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_rc.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ ResourcesConfig rc = (ResourcesConfig)ITERATOR_rc.next();
						/**
						 * rc.isCharged
						 */
						final /*@NonInvalid*/ boolean isCharged = rc.isIsCharged();
						//
						if (isCharged) {					// Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (!isCharged) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<PricingSystem> pricingsystem = this.getPricingsystem();
						final /*@NonInvalid*/ OrderedSetValue BOXED_pricingsystem = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_PricingSystem, pricingsystem);
						final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_pricingsystem).booleanValue();
						if (notEmpty) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (exists == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MetaheresTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allLanguagesFromCountries(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ServiceConfig::allLanguagesFromCountries";
		try {
			/**
			 *
			 * inv allLanguagesFromCountries:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.country->collect(language)
			 *         ->asSet()
			 *         ->forAll(lang | self.language.name->includes(lang.name))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Country> country = this.getCountry();
					final /*@NonInvalid*/ OrderedSetValue BOXED_country = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_Country, country);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(MetaheresTables.SEQ_CLSSid_Language);
					Iterator<Object> ITERATOR__1 = BOXED_country.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Country _1 = (Country)ITERATOR__1.next();
						/**
						 * language
						 */
						final /*@NonInvalid*/ Language language = _1.getLanguage();
						//
						accumulator.add(language);
					}
					final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_lang = asSet.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_lang.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Language lang = (Language)ITERATOR_lang.next();
						/**
						 * self.language.name->includes(lang.name)
						 */
						/*@Caught*/ Object CAUGHT_includes;
						try {
							final /*@NonInvalid*/ List<Language> language_0 = this.getLanguage();
							final /*@NonInvalid*/ OrderedSetValue BOXED_language_0 = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_Language, language_0);
							/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(MetaheresTables.SEQ_PRIMid_String);
							Iterator<Object> ITERATOR__1_0 = BOXED_language_0.iterator();
							/*@Thrown*/ SequenceValue collect_0;
							while (true) {
								if (!ITERATOR__1_0.hasNext()) {
									collect_0 = accumulator_1;
									break;
								}
								/*@NonInvalid*/ Language _1_0 = (Language)ITERATOR__1_0.next();
								/**
								 * name
								 */
								final /*@NonInvalid*/ String name = _1_0.getName();
								//
								accumulator_1.add(name);
							}
							final /*@NonInvalid*/ String name_0 = lang.getName();
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect_0, name_0).booleanValue();
							CAUGHT_includes = includes;
						}
						catch (Exception e) {
							CAUGHT_includes = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_includes;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MetaheresTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServicename((ServiceName)otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				if (reservationsconfig != null)
					msgs = ((InternalEObject)reservationsconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG, null, msgs);
				return basicSetReservationsconfig((ReservationsConfig)otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourcesconfig()).basicAdd(otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				if (lotsconfig != null)
					msgs = ((InternalEObject)lotsconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG, null, msgs);
				return basicSetLotsconfig((LotsConfig)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				return basicSetServicename(null, msgs);
			case MetaheresPackage.SERVICE_CONFIG__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				return basicSetReservationsconfig(null, msgs);
			case MetaheresPackage.SERVICE_CONFIG__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				return ((InternalEList<?>)getResourcesconfig()).basicRemove(otherEnd, msgs);
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				return basicSetLotsconfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				return eInternalContainer().eInverseRemove(this, MetaheresPackage.SERVICE_NAME__SERVICECONFIG, ServiceName.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				return getServicename();
			case MetaheresPackage.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS:
				return getClosesOnPublicHolidays();
			case MetaheresPackage.SERVICE_CONFIG__INVENTORY_IS_PUBLIC:
				return getInventoryIsPublic();
			case MetaheresPackage.SERVICE_CONFIG__HAS_CHART:
				return getHasChart();
			case MetaheresPackage.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS:
				return getCountInBusinessDays();
			case MetaheresPackage.SERVICE_CONFIG__LANGUAGE:
				return getLanguage();
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				return getReservationsconfig();
			case MetaheresPackage.SERVICE_CONFIG__COUNTRY:
				return getCountry();
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				return getResourcesconfig();
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				return getLotsconfig();
			case MetaheresPackage.SERVICE_CONFIG__PRICINGSYSTEM:
				return getPricingsystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				setServicename((ServiceName)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS:
				setClosesOnPublicHolidays((Boolean)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__INVENTORY_IS_PUBLIC:
				setInventoryIsPublic((Boolean)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__HAS_CHART:
				setHasChart((Boolean)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS:
				setCountInBusinessDays((Boolean)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				setReservationsconfig((ReservationsConfig)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends Country>)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				getResourcesconfig().clear();
				getResourcesconfig().addAll((Collection<? extends ResourcesConfig>)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				setLotsconfig((LotsConfig)newValue);
				return;
			case MetaheresPackage.SERVICE_CONFIG__PRICINGSYSTEM:
				getPricingsystem().clear();
				getPricingsystem().addAll((Collection<? extends PricingSystem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				setServicename((ServiceName)null);
				return;
			case MetaheresPackage.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS:
				setClosesOnPublicHolidays(CLOSES_ON_PUBLIC_HOLIDAYS_EDEFAULT);
				return;
			case MetaheresPackage.SERVICE_CONFIG__INVENTORY_IS_PUBLIC:
				setInventoryIsPublic(INVENTORY_IS_PUBLIC_EDEFAULT);
				return;
			case MetaheresPackage.SERVICE_CONFIG__HAS_CHART:
				setHasChart(HAS_CHART_EDEFAULT);
				return;
			case MetaheresPackage.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS:
				setCountInBusinessDays(COUNT_IN_BUSINESS_DAYS_EDEFAULT);
				return;
			case MetaheresPackage.SERVICE_CONFIG__LANGUAGE:
				getLanguage().clear();
				return;
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				setReservationsconfig((ReservationsConfig)null);
				return;
			case MetaheresPackage.SERVICE_CONFIG__COUNTRY:
				getCountry().clear();
				return;
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				getResourcesconfig().clear();
				return;
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				setLotsconfig((LotsConfig)null);
				return;
			case MetaheresPackage.SERVICE_CONFIG__PRICINGSYSTEM:
				getPricingsystem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_CONFIG__SERVICENAME:
				return getServicename() != null;
			case MetaheresPackage.SERVICE_CONFIG__CLOSES_ON_PUBLIC_HOLIDAYS:
				return CLOSES_ON_PUBLIC_HOLIDAYS_EDEFAULT == null ? closesOnPublicHolidays != null : !CLOSES_ON_PUBLIC_HOLIDAYS_EDEFAULT.equals(closesOnPublicHolidays);
			case MetaheresPackage.SERVICE_CONFIG__INVENTORY_IS_PUBLIC:
				return INVENTORY_IS_PUBLIC_EDEFAULT == null ? inventoryIsPublic != null : !INVENTORY_IS_PUBLIC_EDEFAULT.equals(inventoryIsPublic);
			case MetaheresPackage.SERVICE_CONFIG__HAS_CHART:
				return HAS_CHART_EDEFAULT == null ? hasChart != null : !HAS_CHART_EDEFAULT.equals(hasChart);
			case MetaheresPackage.SERVICE_CONFIG__COUNT_IN_BUSINESS_DAYS:
				return COUNT_IN_BUSINESS_DAYS_EDEFAULT == null ? countInBusinessDays != null : !COUNT_IN_BUSINESS_DAYS_EDEFAULT.equals(countInBusinessDays);
			case MetaheresPackage.SERVICE_CONFIG__LANGUAGE:
				return language != null && !language.isEmpty();
			case MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG:
				return reservationsconfig != null;
			case MetaheresPackage.SERVICE_CONFIG__COUNTRY:
				return country != null && !country.isEmpty();
			case MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG:
				return resourcesconfig != null && !resourcesconfig.isEmpty();
			case MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG:
				return lotsconfig != null;
			case MetaheresPackage.SERVICE_CONFIG__PRICINGSYSTEM:
				return pricingsystem != null && !pricingsystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MetaheresPackage.SERVICE_CONFIG___ALL_SERVICES_HAVE_DIFFERENT_NAMES_TER__DIAGNOSTICCHAIN_MAP:
				return allServicesHaveDifferentNamesTer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MetaheresPackage.SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES_VARIANT__DIAGNOSTICCHAIN_MAP:
				return allLanguagesFromCountriesVariant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MetaheresPackage.SERVICE_CONFIG___IF_RESOURCE_CHARGED_PRICING_SYSTEM_IS_MANDATORY__DIAGNOSTICCHAIN_MAP:
				return ifResourceChargedPricingSystemIsMandatory((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MetaheresPackage.SERVICE_CONFIG___ALL_LANGUAGES_FROM_COUNTRIES__DIAGNOSTICCHAIN_MAP:
				return allLanguagesFromCountries((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (closesOnPublicHolidays: ");
		result.append(closesOnPublicHolidays);
		result.append(", inventoryIsPublic: ");
		result.append(inventoryIsPublic);
		result.append(", hasChart: ");
		result.append(hasChart);
		result.append(", countInBusinessDays: ");
		result.append(countInBusinessDays);
		result.append(')');
		return result.toString();
	}

} //ServiceConfigImpl
