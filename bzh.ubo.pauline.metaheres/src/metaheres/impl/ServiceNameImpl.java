/**
 */
package metaheres.impl;

import metaheres.MetaheresPackage;
import metaheres.ServiceConfig;
import metaheres.ServiceName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.ServiceNameImpl#getServiceconfig <em>Serviceconfig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNameImpl extends NamedElementImpl implements ServiceName {
	/**
	 * The cached value of the '{@link #getServiceconfig() <em>Serviceconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceconfig()
	 * @generated
	 * @ordered
	 */
	protected ServiceConfig serviceconfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.SERVICE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig getServiceconfig() {
		return serviceconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceconfig(ServiceConfig newServiceconfig, NotificationChain msgs) {
		ServiceConfig oldServiceconfig = serviceconfig;
		serviceconfig = newServiceconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_NAME__SERVICECONFIG, oldServiceconfig, newServiceconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceconfig(ServiceConfig newServiceconfig) {
		if (newServiceconfig != serviceconfig) {
			NotificationChain msgs = null;
			if (serviceconfig != null)
				msgs = ((InternalEObject)serviceconfig).eInverseRemove(this, MetaheresPackage.SERVICE_CONFIG__SERVICENAME, ServiceConfig.class, msgs);
			if (newServiceconfig != null)
				msgs = ((InternalEObject)newServiceconfig).eInverseAdd(this, MetaheresPackage.SERVICE_CONFIG__SERVICENAME, ServiceConfig.class, msgs);
			msgs = basicSetServiceconfig(newServiceconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.SERVICE_NAME__SERVICECONFIG, newServiceconfig, newServiceconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
				if (serviceconfig != null)
					msgs = ((InternalEObject)serviceconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.SERVICE_NAME__SERVICECONFIG, null, msgs);
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
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
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
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
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
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
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
			case MetaheresPackage.SERVICE_NAME__SERVICECONFIG:
				return serviceconfig != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceNameImpl
