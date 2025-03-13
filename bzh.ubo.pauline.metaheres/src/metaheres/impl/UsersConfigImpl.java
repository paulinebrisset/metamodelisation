/**
 */
package metaheres.impl;

import metaheres.MetaheresPackage;
import metaheres.RightsLevelList;
import metaheres.UsersConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Users Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.UsersConfigImpl#isHasAdress <em>Has Adress</em>}</li>
 *   <li>{@link metaheres.impl.UsersConfigImpl#isHasPhone <em>Has Phone</em>}</li>
 *   <li>{@link metaheres.impl.UsersConfigImpl#getRightslevellist <em>Rightslevellist</em>}</li>
 *   <li>{@link metaheres.impl.UsersConfigImpl#getBloackedAtUnfulfilledReservation <em>Bloacked At Unfulfilled Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsersConfigImpl extends MinimalEObjectImpl.Container implements UsersConfig {
	/**
	 * The default value of the '{@link #isHasAdress() <em>Has Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAdress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ADRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasAdress() <em>Has Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAdress()
	 * @generated
	 * @ordered
	 */
	protected boolean hasAdress = HAS_ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasPhone() <em>Has Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPhone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PHONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPhone() <em>Has Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPhone()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPhone = HAS_PHONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightslevellist() <em>Rightslevellist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightslevellist()
	 * @generated
	 * @ordered
	 */
	protected RightsLevelList rightslevellist;

	/**
	 * The default value of the '{@link #getBloackedAtUnfulfilledReservation() <em>Bloacked At Unfulfilled Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloackedAtUnfulfilledReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BLOACKED_AT_UNFULFILLED_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBloackedAtUnfulfilledReservation() <em>Bloacked At Unfulfilled Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloackedAtUnfulfilledReservation()
	 * @generated
	 * @ordered
	 */
	protected Boolean bloackedAtUnfulfilledReservation = BLOACKED_AT_UNFULFILLED_RESERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.USERS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasAdress() {
		return hasAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAdress(boolean newHasAdress) {
		boolean oldHasAdress = hasAdress;
		hasAdress = newHasAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.USERS_CONFIG__HAS_ADRESS, oldHasAdress, hasAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPhone() {
		return hasPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPhone(boolean newHasPhone) {
		boolean oldHasPhone = hasPhone;
		hasPhone = newHasPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.USERS_CONFIG__HAS_PHONE, oldHasPhone, hasPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightsLevelList getRightslevellist() {
		return rightslevellist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightslevellist(RightsLevelList newRightslevellist, NotificationChain msgs) {
		RightsLevelList oldRightslevellist = rightslevellist;
		rightslevellist = newRightslevellist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST, oldRightslevellist, newRightslevellist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightslevellist(RightsLevelList newRightslevellist) {
		if (newRightslevellist != rightslevellist) {
			NotificationChain msgs = null;
			if (rightslevellist != null)
				msgs = ((InternalEObject)rightslevellist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST, null, msgs);
			if (newRightslevellist != null)
				msgs = ((InternalEObject)newRightslevellist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST, null, msgs);
			msgs = basicSetRightslevellist(newRightslevellist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST, newRightslevellist, newRightslevellist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBloackedAtUnfulfilledReservation() {
		return bloackedAtUnfulfilledReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloackedAtUnfulfilledReservation(Boolean newBloackedAtUnfulfilledReservation) {
		Boolean oldBloackedAtUnfulfilledReservation = bloackedAtUnfulfilledReservation;
		bloackedAtUnfulfilledReservation = newBloackedAtUnfulfilledReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION, oldBloackedAtUnfulfilledReservation, bloackedAtUnfulfilledReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST:
				return basicSetRightslevellist(null, msgs);
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
			case MetaheresPackage.USERS_CONFIG__HAS_ADRESS:
				return isHasAdress();
			case MetaheresPackage.USERS_CONFIG__HAS_PHONE:
				return isHasPhone();
			case MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST:
				return getRightslevellist();
			case MetaheresPackage.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION:
				return getBloackedAtUnfulfilledReservation();
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
			case MetaheresPackage.USERS_CONFIG__HAS_ADRESS:
				setHasAdress((Boolean)newValue);
				return;
			case MetaheresPackage.USERS_CONFIG__HAS_PHONE:
				setHasPhone((Boolean)newValue);
				return;
			case MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST:
				setRightslevellist((RightsLevelList)newValue);
				return;
			case MetaheresPackage.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION:
				setBloackedAtUnfulfilledReservation((Boolean)newValue);
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
			case MetaheresPackage.USERS_CONFIG__HAS_ADRESS:
				setHasAdress(HAS_ADRESS_EDEFAULT);
				return;
			case MetaheresPackage.USERS_CONFIG__HAS_PHONE:
				setHasPhone(HAS_PHONE_EDEFAULT);
				return;
			case MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST:
				setRightslevellist((RightsLevelList)null);
				return;
			case MetaheresPackage.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION:
				setBloackedAtUnfulfilledReservation(BLOACKED_AT_UNFULFILLED_RESERVATION_EDEFAULT);
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
			case MetaheresPackage.USERS_CONFIG__HAS_ADRESS:
				return hasAdress != HAS_ADRESS_EDEFAULT;
			case MetaheresPackage.USERS_CONFIG__HAS_PHONE:
				return hasPhone != HAS_PHONE_EDEFAULT;
			case MetaheresPackage.USERS_CONFIG__RIGHTSLEVELLIST:
				return rightslevellist != null;
			case MetaheresPackage.USERS_CONFIG__BLOACKED_AT_UNFULFILLED_RESERVATION:
				return BLOACKED_AT_UNFULFILLED_RESERVATION_EDEFAULT == null ? bloackedAtUnfulfilledReservation != null : !BLOACKED_AT_UNFULFILLED_RESERVATION_EDEFAULT.equals(bloackedAtUnfulfilledReservation);
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
		result.append(" (hasAdress: ");
		result.append(hasAdress);
		result.append(", hasPhone: ");
		result.append(hasPhone);
		result.append(", bloackedAtUnfulfilledReservation: ");
		result.append(bloackedAtUnfulfilledReservation);
		result.append(')');
		return result.toString();
	}

} //UsersConfigImpl
