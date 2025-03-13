/**
 */
package metaheres.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metaheres.MetaheresPackage;
import metaheres.MetaheresTables;
import metaheres.ReservationsConfig;
import metaheres.ResourcesConfig;
import metaheres.ServiceConfig;
import metaheres.StatusList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservations Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#isHasMoveOutCheck <em>Has Move Out Check</em>}</li>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#getMinRequestAdvance <em>Min Request Advance</em>}</li>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#getMaxRequestAdvance <em>Max Request Advance</em>}</li>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#isHasMoveInCheck <em>Has Move In Check</em>}</li>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#getServiceconfig <em>Serviceconfig</em>}</li>
 *   <li>{@link metaheres.impl.ReservationsConfigImpl#getStatuslist <em>Statuslist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationsConfigImpl extends MinimalEObjectImpl.Container implements ReservationsConfig {
	/**
	 * The default value of the '{@link #isHasMoveOutCheck() <em>Has Move Out Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoveOutCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MOVE_OUT_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMoveOutCheck() <em>Has Move Out Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoveOutCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMoveOutCheck = HAS_MOVE_OUT_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRequestAdvance() <em>Min Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequestAdvance()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_REQUEST_ADVANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRequestAdvance() <em>Min Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequestAdvance()
	 * @generated
	 * @ordered
	 */
	protected int minRequestAdvance = MIN_REQUEST_ADVANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRequestAdvance() <em>Max Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestAdvance()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REQUEST_ADVANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRequestAdvance() <em>Max Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestAdvance()
	 * @generated
	 * @ordered
	 */
	protected int maxRequestAdvance = MAX_REQUEST_ADVANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasMoveInCheck() <em>Has Move In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoveInCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MOVE_IN_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMoveInCheck() <em>Has Move In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMoveInCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMoveInCheck = HAS_MOVE_IN_CHECK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatuslist() <em>Statuslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuslist()
	 * @generated
	 * @ordered
	 */
	protected StatusList statuslist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.RESERVATIONS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMoveOutCheck() {
		return hasMoveOutCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMoveOutCheck(boolean newHasMoveOutCheck) {
		boolean oldHasMoveOutCheck = hasMoveOutCheck;
		hasMoveOutCheck = newHasMoveOutCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK, oldHasMoveOutCheck, hasMoveOutCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRequestAdvance() {
		return minRequestAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequestAdvance(int newMinRequestAdvance) {
		int oldMinRequestAdvance = minRequestAdvance;
		minRequestAdvance = newMinRequestAdvance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE, oldMinRequestAdvance, minRequestAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRequestAdvance() {
		return maxRequestAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequestAdvance(int newMaxRequestAdvance) {
		int oldMaxRequestAdvance = maxRequestAdvance;
		maxRequestAdvance = newMaxRequestAdvance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE, oldMaxRequestAdvance, maxRequestAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMoveInCheck() {
		return hasMoveInCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMoveInCheck(boolean newHasMoveInCheck) {
		boolean oldHasMoveInCheck = hasMoveInCheck;
		hasMoveInCheck = newHasMoveInCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK, oldHasMoveInCheck, hasMoveInCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig getServiceconfig() {
		if (eContainerFeatureID() != MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG) return null;
		return (ServiceConfig)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceconfig(ServiceConfig newServiceconfig, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceconfig, MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceconfig(ServiceConfig newServiceconfig) {
		if (newServiceconfig != eInternalContainer() || (eContainerFeatureID() != MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG && newServiceconfig != null)) {
			if (EcoreUtil.isAncestor(this, newServiceconfig))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceconfig != null)
				msgs = ((InternalEObject)newServiceconfig).eInverseAdd(this, MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG, ServiceConfig.class, msgs);
			msgs = basicSetServiceconfig(newServiceconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG, newServiceconfig, newServiceconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusList getStatuslist() {
		return statuslist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatuslist(StatusList newStatuslist, NotificationChain msgs) {
		StatusList oldStatuslist = statuslist;
		statuslist = newStatuslist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST, oldStatuslist, newStatuslist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatuslist(StatusList newStatuslist) {
		if (newStatuslist != statuslist) {
			NotificationChain msgs = null;
			if (statuslist != null)
				msgs = ((InternalEObject)statuslist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST, null, msgs);
			if (newStatuslist != null)
				msgs = ((InternalEObject)newStatuslist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST, null, msgs);
			msgs = basicSetStatuslist(newStatuslist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST, newStatuslist, newStatuslist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noMoveInAllowedForConsumables(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ReservationsConfig::noMoveInAllowedForConsumables";
		try {
			/**
			 *
			 * inv noMoveInAllowedForConsumables:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = hasMoveInCheck implies
			 *         not serviceconfig.resourcesconfig->exists(r | r.isConsumable)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MetaheresPackage.Literals.RESERVATIONS_CONFIG___NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MetaheresTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean hasMoveInCheck = this.isHasMoveInCheck();
					final /*@Thrown*/ Boolean result;
					if (!hasMoveInCheck) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							final /*@NonInvalid*/ ServiceConfig serviceconfig = this.getServiceconfig();
							final /*@NonInvalid*/ List<ResourcesConfig> resourcesconfig = serviceconfig.getResourcesconfig();
							final /*@NonInvalid*/ OrderedSetValue BOXED_resourcesconfig = idResolver.createOrderedSetOfAll(MetaheresTables.ORD_CLSSid_ResourcesConfig, resourcesconfig);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_r = BOXED_resourcesconfig.iterator();
							/*@NonInvalid*/ Boolean exists;
							while (true) {
								if (!ITERATOR_r.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ ResourcesConfig r = (ResourcesConfig)ITERATOR_r.next();
								/**
								 * r.isConsumable
								 */
								final /*@NonInvalid*/ boolean isConsumable = r.isIsConsumable();
								//
								if (isConsumable) {					// Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break;														// Stop immediately
								}
								else if (!isConsumable) {				// Normal unsuccessful body evaluation result
									;															// Carry on
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean not;
							if (exists == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (exists == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							CAUGHT_not = not;
						}
						catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_not;
							}
							if (CAUGHT_not == null) {
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServiceconfig((ServiceConfig)otherEnd, msgs);
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
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				return basicSetServiceconfig(null, msgs);
			case MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST:
				return basicSetStatuslist(null, msgs);
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
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				return eInternalContainer().eInverseRemove(this, MetaheresPackage.SERVICE_CONFIG__RESERVATIONSCONFIG, ServiceConfig.class, msgs);
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
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK:
				return isHasMoveOutCheck();
			case MetaheresPackage.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE:
				return getMinRequestAdvance();
			case MetaheresPackage.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE:
				return getMaxRequestAdvance();
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK:
				return isHasMoveInCheck();
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				return getServiceconfig();
			case MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST:
				return getStatuslist();
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
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK:
				setHasMoveOutCheck((Boolean)newValue);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE:
				setMinRequestAdvance((Integer)newValue);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE:
				setMaxRequestAdvance((Integer)newValue);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK:
				setHasMoveInCheck((Boolean)newValue);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				setServiceconfig((ServiceConfig)newValue);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST:
				setStatuslist((StatusList)newValue);
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
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK:
				setHasMoveOutCheck(HAS_MOVE_OUT_CHECK_EDEFAULT);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE:
				setMinRequestAdvance(MIN_REQUEST_ADVANCE_EDEFAULT);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE:
				setMaxRequestAdvance(MAX_REQUEST_ADVANCE_EDEFAULT);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK:
				setHasMoveInCheck(HAS_MOVE_IN_CHECK_EDEFAULT);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				setServiceconfig((ServiceConfig)null);
				return;
			case MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST:
				setStatuslist((StatusList)null);
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
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_OUT_CHECK:
				return hasMoveOutCheck != HAS_MOVE_OUT_CHECK_EDEFAULT;
			case MetaheresPackage.RESERVATIONS_CONFIG__MIN_REQUEST_ADVANCE:
				return minRequestAdvance != MIN_REQUEST_ADVANCE_EDEFAULT;
			case MetaheresPackage.RESERVATIONS_CONFIG__MAX_REQUEST_ADVANCE:
				return maxRequestAdvance != MAX_REQUEST_ADVANCE_EDEFAULT;
			case MetaheresPackage.RESERVATIONS_CONFIG__HAS_MOVE_IN_CHECK:
				return hasMoveInCheck != HAS_MOVE_IN_CHECK_EDEFAULT;
			case MetaheresPackage.RESERVATIONS_CONFIG__SERVICECONFIG:
				return getServiceconfig() != null;
			case MetaheresPackage.RESERVATIONS_CONFIG__STATUSLIST:
				return statuslist != null;
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
			case MetaheresPackage.RESERVATIONS_CONFIG___NO_MOVE_IN_ALLOWED_FOR_CONSUMABLES__DIAGNOSTICCHAIN_MAP:
				return noMoveInAllowedForConsumables((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (hasMoveOutCheck: ");
		result.append(hasMoveOutCheck);
		result.append(", minRequestAdvance: ");
		result.append(minRequestAdvance);
		result.append(", maxRequestAdvance: ");
		result.append(maxRequestAdvance);
		result.append(", hasMoveInCheck: ");
		result.append(hasMoveInCheck);
		result.append(')');
		return result.toString();
	}

} //ReservationsConfigImpl
