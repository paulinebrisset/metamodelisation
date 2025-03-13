/**
 */
package metaheres;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.ReservableEntity#getHasImage <em>Has Image</em>}</li>
 *   <li>{@link metaheres.ReservableEntity#getHasOneStockPerSlot <em>Has One Stock Per Slot</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getReservableEntity()
 * @model abstract="true"
 * @generated
 */
public interface ReservableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Image</em>' attribute.
	 * @see #setHasImage(Boolean)
	 * @see metaheres.MetaheresPackage#getReservableEntity_HasImage()
	 * @model
	 * @generated
	 */
	Boolean getHasImage();

	/**
	 * Sets the value of the '{@link metaheres.ReservableEntity#getHasImage <em>Has Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Image</em>' attribute.
	 * @see #getHasImage()
	 * @generated
	 */
	void setHasImage(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has One Stock Per Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has One Stock Per Slot</em>' attribute.
	 * @see #setHasOneStockPerSlot(Boolean)
	 * @see metaheres.MetaheresPackage#getReservableEntity_HasOneStockPerSlot()
	 * @model
	 * @generated
	 */
	Boolean getHasOneStockPerSlot();

	/**
	 * Sets the value of the '{@link metaheres.ReservableEntity#getHasOneStockPerSlot <em>Has One Stock Per Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has One Stock Per Slot</em>' attribute.
	 * @see #getHasOneStockPerSlot()
	 * @generated
	 */
	void setHasOneStockPerSlot(Boolean value);

} // ReservableEntity
