/**
 */
package metaheres.impl;

import metaheres.LotsConfig;
import metaheres.MetaheresPackage;
import metaheres.ServiceConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lots Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.LotsConfigImpl#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LotsConfigImpl extends ReservableEntityImpl implements LotsConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LotsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.LOTS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig getServiceconfig() {
		if (eContainerFeatureID() != MetaheresPackage.LOTS_CONFIG__SERVICECONFIG) return null;
		return (ServiceConfig)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceconfig(ServiceConfig newServiceconfig, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceconfig, MetaheresPackage.LOTS_CONFIG__SERVICECONFIG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceconfig(ServiceConfig newServiceconfig) {
		if (newServiceconfig != eInternalContainer() || (eContainerFeatureID() != MetaheresPackage.LOTS_CONFIG__SERVICECONFIG && newServiceconfig != null)) {
			if (EcoreUtil.isAncestor(this, newServiceconfig))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceconfig != null)
				msgs = ((InternalEObject)newServiceconfig).eInverseAdd(this, MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG, ServiceConfig.class, msgs);
			msgs = basicSetServiceconfig(newServiceconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.LOTS_CONFIG__SERVICECONFIG, newServiceconfig, newServiceconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
				return eInternalContainer().eInverseRemove(this, MetaheresPackage.SERVICE_CONFIG__LOTSCONFIG, ServiceConfig.class, msgs);
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
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
			case MetaheresPackage.LOTS_CONFIG__SERVICECONFIG:
				return getServiceconfig() != null;
		}
		return super.eIsSet(featureID);
	}

} //LotsConfigImpl
