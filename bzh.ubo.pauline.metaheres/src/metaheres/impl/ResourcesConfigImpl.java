/**
 */
package metaheres.impl;

import metaheres.MetaheresPackage;
import metaheres.ResourcesConfig;
import metaheres.ServiceConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.ResourcesConfigImpl#isIsConsumable <em>Is Consumable</em>}</li>
 *   <li>{@link metaheres.impl.ResourcesConfigImpl#isIsLoan <em>Is Loan</em>}</li>
 *   <li>{@link metaheres.impl.ResourcesConfigImpl#isIsCharged <em>Is Charged</em>}</li>
 *   <li>{@link metaheres.impl.ResourcesConfigImpl#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcesConfigImpl extends ReservableEntityImpl implements ResourcesConfig {
	/**
	 * The default value of the '{@link #isIsConsumable() <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSUMABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConsumable() <em>Is Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConsumable()
	 * @generated
	 * @ordered
	 */
	protected boolean isConsumable = IS_CONSUMABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLoan() <em>Is Loan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoan()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLoan() <em>Is Loan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoan()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoan = IS_LOAN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCharged() <em>Is Charged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCharged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHARGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCharged() <em>Is Charged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCharged()
	 * @generated
	 * @ordered
	 */
	protected boolean isCharged = IS_CHARGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.RESOURCES_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConsumable() {
		return isConsumable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConsumable(boolean newIsConsumable) {
		boolean oldIsConsumable = isConsumable;
		isConsumable = newIsConsumable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESOURCES_CONFIG__IS_CONSUMABLE, oldIsConsumable, isConsumable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLoan() {
		return isLoan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLoan(boolean newIsLoan) {
		boolean oldIsLoan = isLoan;
		isLoan = newIsLoan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESOURCES_CONFIG__IS_LOAN, oldIsLoan, isLoan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCharged() {
		return isCharged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCharged(boolean newIsCharged) {
		boolean oldIsCharged = isCharged;
		isCharged = newIsCharged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESOURCES_CONFIG__IS_CHARGED, oldIsCharged, isCharged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig getServiceconfig() {
		if (eContainerFeatureID() != MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG) return null;
		return (ServiceConfig)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceconfig(ServiceConfig newServiceconfig, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceconfig, MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceconfig(ServiceConfig newServiceconfig) {
		if (newServiceconfig != eInternalContainer() || (eContainerFeatureID() != MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG && newServiceconfig != null)) {
			if (EcoreUtil.isAncestor(this, newServiceconfig))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceconfig != null)
				msgs = ((InternalEObject)newServiceconfig).eInverseAdd(this, MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG, ServiceConfig.class, msgs);
			msgs = basicSetServiceconfig(newServiceconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG, newServiceconfig, newServiceconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				return basicSetServiceconfig(null, msgs);
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
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				return eInternalContainer().eInverseRemove(this, MetaheresPackage.SERVICE_CONFIG__RESOURCESCONFIG, ServiceConfig.class, msgs);
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
			case MetaheresPackage.RESOURCES_CONFIG__IS_CONSUMABLE:
				return isIsConsumable();
			case MetaheresPackage.RESOURCES_CONFIG__IS_LOAN:
				return isIsLoan();
			case MetaheresPackage.RESOURCES_CONFIG__IS_CHARGED:
				return isIsCharged();
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				return getServiceconfig();
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
			case MetaheresPackage.RESOURCES_CONFIG__IS_CONSUMABLE:
				setIsConsumable((Boolean)newValue);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__IS_LOAN:
				setIsLoan((Boolean)newValue);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__IS_CHARGED:
				setIsCharged((Boolean)newValue);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				setServiceconfig((ServiceConfig)newValue);
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
			case MetaheresPackage.RESOURCES_CONFIG__IS_CONSUMABLE:
				setIsConsumable(IS_CONSUMABLE_EDEFAULT);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__IS_LOAN:
				setIsLoan(IS_LOAN_EDEFAULT);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__IS_CHARGED:
				setIsCharged(IS_CHARGED_EDEFAULT);
				return;
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				setServiceconfig((ServiceConfig)null);
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
			case MetaheresPackage.RESOURCES_CONFIG__IS_CONSUMABLE:
				return isConsumable != IS_CONSUMABLE_EDEFAULT;
			case MetaheresPackage.RESOURCES_CONFIG__IS_LOAN:
				return isLoan != IS_LOAN_EDEFAULT;
			case MetaheresPackage.RESOURCES_CONFIG__IS_CHARGED:
				return isCharged != IS_CHARGED_EDEFAULT;
			case MetaheresPackage.RESOURCES_CONFIG__SERVICECONFIG:
				return getServiceconfig() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isConsumable: ");
		result.append(isConsumable);
		result.append(", isLoan: ");
		result.append(isLoan);
		result.append(", isCharged: ");
		result.append(isCharged);
		result.append(')');
		return result.toString();
	}

} //ResourcesConfigImpl
