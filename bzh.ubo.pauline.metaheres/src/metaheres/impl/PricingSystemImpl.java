/**
 */
package metaheres.impl;

import metaheres.MetaheresPackage;
import metaheres.PricingSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.PricingSystemImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link metaheres.impl.PricingSystemImpl#getTaxSystem <em>Tax System</em>}</li>
 *   <li>{@link metaheres.impl.PricingSystemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PricingSystemImpl extends MinimalEObjectImpl.Container implements PricingSystem {
	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxSystem() <em>Tax System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxSystem() <em>Tax System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxSystem()
	 * @generated
	 * @ordered
	 */
	protected String taxSystem = TAX_SYSTEM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.PRICING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.PRICING_SYSTEM__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxSystem() {
		return taxSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxSystem(String newTaxSystem) {
		String oldTaxSystem = taxSystem;
		taxSystem = newTaxSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.PRICING_SYSTEM__TAX_SYSTEM, oldTaxSystem, taxSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaheresPackage.PRICING_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.PRICING_SYSTEM__CURRENCY:
				return getCurrency();
			case MetaheresPackage.PRICING_SYSTEM__TAX_SYSTEM:
				return getTaxSystem();
			case MetaheresPackage.PRICING_SYSTEM__NAME:
				return getName();
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
			case MetaheresPackage.PRICING_SYSTEM__CURRENCY:
				setCurrency((String)newValue);
				return;
			case MetaheresPackage.PRICING_SYSTEM__TAX_SYSTEM:
				setTaxSystem((String)newValue);
				return;
			case MetaheresPackage.PRICING_SYSTEM__NAME:
				setName((String)newValue);
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
			case MetaheresPackage.PRICING_SYSTEM__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MetaheresPackage.PRICING_SYSTEM__TAX_SYSTEM:
				setTaxSystem(TAX_SYSTEM_EDEFAULT);
				return;
			case MetaheresPackage.PRICING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
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
			case MetaheresPackage.PRICING_SYSTEM__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case MetaheresPackage.PRICING_SYSTEM__TAX_SYSTEM:
				return TAX_SYSTEM_EDEFAULT == null ? taxSystem != null : !TAX_SYSTEM_EDEFAULT.equals(taxSystem);
			case MetaheresPackage.PRICING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (currency: ");
		result.append(currency);
		result.append(", taxSystem: ");
		result.append(taxSystem);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PricingSystemImpl
