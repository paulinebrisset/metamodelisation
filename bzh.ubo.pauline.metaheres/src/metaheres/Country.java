/**
 */
package metaheres;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaheres.Country#getName <em>Name</em>}</li>
 *   <li>{@link metaheres.Country#getLanguage <em>Language</em>}</li>
 *   <li>{@link metaheres.Country#getPricingsystem <em>Pricingsystem</em>}</li>
 * </ul>
 *
 * @see metaheres.MetaheresPackage#getCountry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='languageNameMinLength'"
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaheres.MetaheresPackage#getCountry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaheres.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see metaheres.MetaheresPackage#getCountry_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link metaheres.Country#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Pricingsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricingsystem</em>' containment reference.
	 * @see #setPricingsystem(PricingSystem)
	 * @see metaheres.MetaheresPackage#getCountry_Pricingsystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PricingSystem getPricingsystem();

	/**
	 * Sets the value of the '{@link metaheres.Country#getPricingsystem <em>Pricingsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricingsystem</em>' containment reference.
	 * @see #getPricingsystem()
	 * @generated
	 */
	void setPricingsystem(PricingSystem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Country.allInstances()-&gt;forAll(country1, country2 |\n\t\t\tcountry1 &lt;&gt; country2 implies country1.name &lt;&gt; country2.name)'"
	 * @generated
	 */
	boolean countriesHaveDifferentNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.language.name.size() &gt;= 5'"
	 * @generated
	 */
	boolean languageNameMinLength(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Country
