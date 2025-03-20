/**
 */
package metaheres;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.PricingSystem#getCurrency <em>Currency</em>}</li>
 *   <li>{@link metaheres.PricingSystem#getTaxSystem <em>Tax System</em>}</li>
 *   <li>{@link metaheres.PricingSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getPricingSystem()
 * @model
 * @generated
 */
public interface PricingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see metaheres.MetaheresPackage#getPricingSystem_Currency()
	 * @model required="true"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link metaheres.PricingSystem#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Tax System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax System</em>' attribute.
	 * @see #setTaxSystem(String)
	 * @see metaheres.MetaheresPackage#getPricingSystem_TaxSystem()
	 * @model required="true"
	 * @generated
	 */
	String getTaxSystem();

	/**
	 * Sets the value of the '{@link metaheres.PricingSystem#getTaxSystem <em>Tax System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax System</em>' attribute.
	 * @see #getTaxSystem()
	 * @generated
	 */
	void setTaxSystem(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaheres.MetaheresPackage#getPricingSystem_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaheres.PricingSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PricingSystem
