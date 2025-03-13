/**
 */
package metaheres;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rights Level List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.RightsLevelList#getRightlevel <em>Rightlevel</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getRightsLevelList()
 * @model
 * @generated
 */
public interface RightsLevelList extends EObject {
	/**
	 * Returns the value of the '<em><b>Rightlevel</b></em>' reference list.
	 * The list contents are of type {@link metaheres.RightLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightlevel</em>' reference list.
	 * @see metaheres.MetaheresPackage#getRightsLevelList_Rightlevel()
	 * @model required="true"
	 * @generated
	 */
	EList<RightLevel> getRightlevel();

} // RightsLevelList
