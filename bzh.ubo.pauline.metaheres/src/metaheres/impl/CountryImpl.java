/**
 */
package metaheres.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import metaheres.Country;
import metaheres.Language;
import metaheres.MetaheresPackage;
import metaheres.MetaheresTables;
import metaheres.PricingSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaheres.impl.CountryImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link metaheres.impl.CountryImpl#getPricingsystem <em>Pricingsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The cached value of the '{@link #getPricingsystem() <em>Pricingsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingsystem()
	 * @generated
	 * @ordered
	 */
	protected PricingSystem pricingsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Language newLanguage, NotificationChain msgs) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.COUNTRY__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.COUNTRY__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.COUNTRY__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.COUNTRY__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingSystem getPricingsystem() {
		return pricingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingsystem(PricingSystem newPricingsystem, NotificationChain msgs) {
		PricingSystem oldPricingsystem = pricingsystem;
		pricingsystem = newPricingsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.COUNTRY__PRICINGSYSTEM, oldPricingsystem, newPricingsystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricingsystem(PricingSystem newPricingsystem) {
		if (newPricingsystem != pricingsystem) {
			NotificationChain msgs = null;
			if (pricingsystem != null)
				msgs = ((InternalEObject)pricingsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.COUNTRY__PRICINGSYSTEM, null, msgs);
			if (newPricingsystem != null)
				msgs = ((InternalEObject)newPricingsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.COUNTRY__PRICINGSYSTEM, null, msgs);
			msgs = basicSetPricingsystem(newPricingsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.COUNTRY__PRICINGSYSTEM, newPricingsystem, newPricingsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean countriesHaveDifferentNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Country::countriesHaveDifferentNames";
		try {
			/**
			 *
			 * inv countriesHaveDifferentNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Country.allInstances()
			 *         ->forAll(country1, country2 | country1 <> country2 implies country1.name <> country2.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.COUNTRY___COUNTRIES_HAVE_DIFFERENT_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_metaheres_c_c_Country = idResolver.getClass(MetaheresTables.CLSSid_Country, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, MetaheresTables.SET_CLSSid_Country, TYP_metaheres_c_c_Country);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * country1 <> country2 implies country1.name <> country2.name
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object country1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object country2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Country local_0 = (Country)country1;
								final /*@NonInvalid*/ Country local_1 = (Country)country2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::Country::name\'");
										}
										final /*@Thrown*/ String name = local_0.getName();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.bzh.ubo.pauline.metaheres\'::Country::name\'");
										}
										final /*@Thrown*/ String name_0 = local_1.getName();
										final /*@Thrown*/ boolean ne_0 = !name.equals(name_0);
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
	public boolean languageNameMinLength(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Country::languageNameMinLength";
		try {
			/**
			 *
			 * inv languageNameMinLength:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.language.name.size() >= 5
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.COUNTRY___LANGUAGE_NAME_MIN_LENGTH__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Language language = this.getLanguage();
					final /*@NonInvalid*/ String name = language.getName();
					if (name == null) {
						throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(name);
					final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MetaheresTables.INT_5).booleanValue();
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.COUNTRY__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case MetaheresPackage.COUNTRY__PRICINGSYSTEM:
				return basicSetPricingsystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.COUNTRY__NAME:
				return getName();
			case MetaheresPackage.COUNTRY__LANGUAGE:
				return getLanguage();
			case MetaheresPackage.COUNTRY__PRICINGSYSTEM:
				return getPricingsystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaheresPackage.COUNTRY__NAME:
				setName((String)newValue);
				return;
			case MetaheresPackage.COUNTRY__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case MetaheresPackage.COUNTRY__PRICINGSYSTEM:
				setPricingsystem((PricingSystem)newValue);
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
			case MetaheresPackage.COUNTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetaheresPackage.COUNTRY__LANGUAGE:
				setLanguage((Language)null);
				return;
			case MetaheresPackage.COUNTRY__PRICINGSYSTEM:
				setPricingsystem((PricingSystem)null);
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
			case MetaheresPackage.COUNTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetaheresPackage.COUNTRY__LANGUAGE:
				return language != null;
			case MetaheresPackage.COUNTRY__PRICINGSYSTEM:
				return pricingsystem != null;
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
			case MetaheresPackage.COUNTRY___COUNTRIES_HAVE_DIFFERENT_NAMES__DIAGNOSTICCHAIN_MAP:
				return countriesHaveDifferentNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MetaheresPackage.COUNTRY___LANGUAGE_NAME_MIN_LENGTH__DIAGNOSTICCHAIN_MAP:
				return languageNameMinLength((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CountryImpl
