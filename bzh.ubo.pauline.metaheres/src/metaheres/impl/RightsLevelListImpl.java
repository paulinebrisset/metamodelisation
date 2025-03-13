/**
 */
package metaheres.impl;

import java.util.Collection;

import metaheres.MetaheresPackage;
import metaheres.RightLevel;
import metaheres.RightsLevelList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rights Level List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaheres.impl.RightsLevelListImpl#getRightlevel <em>Rightlevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightsLevelListImpl extends MinimalEObjectImpl.Container implements RightsLevelList {
	/**
	 * The cached value of the '{@link #getRightlevel() <em>Rightlevel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightlevel()
	 * @generated
	 * @ordered
	 */
	protected EList<RightLevel> rightlevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightsLevelListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaheresPackage.Literals.RIGHTS_LEVEL_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightLevel> getRightlevel() {
		if (rightlevel == null) {
			rightlevel = new EObjectResolvingEList<RightLevel>(RightLevel.class, this, MetaheresPackage.RIGHTS_LEVEL_LIST__RIGHTLEVEL);
		}
		return rightlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaheresPackage.RIGHTS_LEVEL_LIST__RIGHTLEVEL:
				return getRightlevel();
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
			case MetaheresPackage.RIGHTS_LEVEL_LIST__RIGHTLEVEL:
				getRightlevel().clear();
				getRightlevel().addAll((Collection<? extends RightLevel>)newValue);
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
			case MetaheresPackage.RIGHTS_LEVEL_LIST__RIGHTLEVEL:
				getRightlevel().clear();
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
			case MetaheresPackage.RIGHTS_LEVEL_LIST__RIGHTLEVEL:
				return rightlevel != null && !rightlevel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RightsLevelListImpl
