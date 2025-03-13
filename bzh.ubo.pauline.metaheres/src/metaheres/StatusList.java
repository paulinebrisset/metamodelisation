/**
 */
package metaheres;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.StatusList#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getStatusList()
 * @model
 * @generated
 */
public interface StatusList extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link metaheres.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see metaheres.MetaheresPackage#getStatusList_Status()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Status> getStatus();

} // StatusList
