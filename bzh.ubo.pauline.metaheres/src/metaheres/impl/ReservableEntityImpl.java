/**
 */
package metaheres.impl;

import metaheres.MetaheresPackage;
import metaheres.ReservableEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.ReservableEntityImpl#getHasImage <em>Has Image</em>}</li>
 *   <li>{@link metaheres.impl.ReservableEntityImpl#getHasOneStockPerSlot <em>Has One Stock Per Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReservableEntityImpl extends MinimalEObjectImpl.Container implements ReservableEntity {
	/**
	 * The default value of the '{@link #getHasImage() <em>Has Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasImage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasImage() <em>Has Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasImage()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasImage = HAS_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasOneStockPerSlot() <em>Has One Stock Per Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOneStockPerSlot()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_ONE_STOCK_PER_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasOneStockPerSlot() <em>Has One Stock Per Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOneStockPerSlot()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasOneStockPerSlot = HAS_ONE_STOCK_PER_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.RESERVABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasImage() {
		return hasImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasImage(Boolean newHasImage) {
		Boolean oldHasImage = hasImage;
		hasImage = newHasImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVABLE_ENTITY__HAS_IMAGE, oldHasImage, hasImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasOneStockPerSlot() {
		return hasOneStockPerSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOneStockPerSlot(Boolean newHasOneStockPerSlot) {
		Boolean oldHasOneStockPerSlot = hasOneStockPerSlot;
		hasOneStockPerSlot = newHasOneStockPerSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT, oldHasOneStockPerSlot, hasOneStockPerSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_IMAGE:
				return getHasImage();
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT:
				return getHasOneStockPerSlot();
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
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_IMAGE:
				setHasImage((Boolean)newValue);
				return;
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT:
				setHasOneStockPerSlot((Boolean)newValue);
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
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_IMAGE:
				setHasImage(HAS_IMAGE_EDEFAULT);
				return;
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT:
				setHasOneStockPerSlot(HAS_ONE_STOCK_PER_SLOT_EDEFAULT);
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
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_IMAGE:
				return HAS_IMAGE_EDEFAULT == null ? hasImage != null : !HAS_IMAGE_EDEFAULT.equals(hasImage);
			case MetaheresPackage.RESERVABLE_ENTITY__HAS_ONE_STOCK_PER_SLOT:
				return HAS_ONE_STOCK_PER_SLOT_EDEFAULT == null ? hasOneStockPerSlot != null : !HAS_ONE_STOCK_PER_SLOT_EDEFAULT.equals(hasOneStockPerSlot);
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
		result.append(" (hasImage: ");
		result.append(hasImage);
		result.append(", hasOneStockPerSlot: ");
		result.append(hasOneStockPerSlot);
		result.append(')');
		return result.toString();
	}

} //ReservableEntityImpl
