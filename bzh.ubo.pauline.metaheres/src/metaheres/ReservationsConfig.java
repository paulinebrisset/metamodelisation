/**
 */
package metaheres;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservations Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.ReservationsConfig#isHasMoveOutCheck <em>Has Move Out Check</em>}</li>
 *   <li>{@link metaheres.ReservationsConfig#getMinRequestAdvance <em>Min Request Advance</em>}</li>
 *   <li>{@link metaheres.ReservationsConfig#getMaxRequestAdvance <em>Max Request Advance</em>}</li>
 *   <li>{@link metaheres.ReservationsConfig#isHasMoveInCheck <em>Has Move In Check</em>}</li>
 *   <li>{@link metaheres.ReservationsConfig#getServiceconfig <em>Serviceconfig</em>}</li>
 *   <li>{@link metaheres.ReservationsConfig#getStatuslist <em>Statuslist</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getReservationsConfig()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noMoveInAllowedForConsumables'"
 * @generated
 */
public interface ReservationsConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Move Out Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Move Out Check</em>' attribute.
	 * @see #setHasMoveOutCheck(boolean)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_HasMoveOutCheck()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasMoveOutCheck();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#isHasMoveOutCheck <em>Has Move Out Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Move Out Check</em>' attribute.
	 * @see #isHasMoveOutCheck()
	 * @generated
	 */
	void setHasMoveOutCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Request Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Request Advance</em>' attribute.
	 * @see #setMinRequestAdvance(int)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_MinRequestAdvance()
	 * @model required="true"
	 * @generated
	 */
	int getMinRequestAdvance();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#getMinRequestAdvance <em>Min Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Request Advance</em>' attribute.
	 * @see #getMinRequestAdvance()
	 * @generated
	 */
	void setMinRequestAdvance(int value);

	/**
	 * Returns the value of the '<em><b>Max Request Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Request Advance</em>' attribute.
	 * @see #setMaxRequestAdvance(int)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_MaxRequestAdvance()
	 * @model required="true"
	 * @generated
	 */
	int getMaxRequestAdvance();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#getMaxRequestAdvance <em>Max Request Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Request Advance</em>' attribute.
	 * @see #getMaxRequestAdvance()
	 * @generated
	 */
	void setMaxRequestAdvance(int value);

	/**
	 * Returns the value of the '<em><b>Has Move In Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Move In Check</em>' attribute.
	 * @see #setHasMoveInCheck(boolean)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_HasMoveInCheck()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasMoveInCheck();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#isHasMoveInCheck <em>Has Move In Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Move In Check</em>' attribute.
	 * @see #isHasMoveInCheck()
	 * @generated
	 */
	void setHasMoveInCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Serviceconfig</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaheres.ServiceConfig#getReservationsconfig <em>Reservationsconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceconfig</em>' container reference.
	 * @see #setServiceconfig(ServiceConfig)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_Serviceconfig()
	 * @see metaheres.ServiceConfig#getReservationsconfig
	 * @model opposite="reservationsconfig" required="true" transient="false"
	 * @generated
	 */
	ServiceConfig getServiceconfig();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#getServiceconfig <em>Serviceconfig</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceconfig</em>' container reference.
	 * @see #getServiceconfig()
	 * @generated
	 */
	void setServiceconfig(ServiceConfig value);

	/**
	 * Returns the value of the '<em><b>Statuslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuslist</em>' containment reference.
	 * @see #setStatuslist(StatusList)
	 * @see metaheres.MetaheresPackage#getReservationsConfig_Statuslist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatusList getStatuslist();

	/**
	 * Sets the value of the '{@link metaheres.ReservationsConfig#getStatuslist <em>Statuslist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statuslist</em>' containment reference.
	 * @see #getStatuslist()
	 * @generated
	 */
	void setStatuslist(StatusList value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='hasMoveInCheck implies not serviceconfig.resourcesconfig-&gt;exists(r |\n\t\t\tr.isConsumable)'"
	 * @generated
	 */
	boolean noMoveInAllowedForConsumables(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReservationsConfig
