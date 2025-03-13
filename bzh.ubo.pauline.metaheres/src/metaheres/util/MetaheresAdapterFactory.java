/**
 */
package metaheres.util;

import metaheres.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaheres.MetaheresPackage
 * @generated
 */
public class MetaheresAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaheresPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaheresAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaheresPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaheresSwitch<Adapter> modelSwitch =
		new MetaheresSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseServiceName(ServiceName object) {
				return createServiceNameAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseRightLevel(RightLevel object) {
				return createRightLevelAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseRightsLevelList(RightsLevelList object) {
				return createRightsLevelListAdapter();
			}
			@Override
			public Adapter caseStatusList(StatusList object) {
				return createStatusListAdapter();
			}
			@Override
			public Adapter caseUsersConfig(UsersConfig object) {
				return createUsersConfigAdapter();
			}
			@Override
			public Adapter caseServiceConfig(ServiceConfig object) {
				return createServiceConfigAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseReservableEntity(ReservableEntity object) {
				return createReservableEntityAdapter();
			}
			@Override
			public Adapter caseReservationsConfig(ReservationsConfig object) {
				return createReservationsConfigAdapter();
			}
			@Override
			public Adapter caseResourcesConfig(ResourcesConfig object) {
				return createResourcesConfigAdapter();
			}
			@Override
			public Adapter caseLotsConfig(LotsConfig object) {
				return createLotsConfigAdapter();
			}
			@Override
			public Adapter casePricingSystem(PricingSystem object) {
				return createPricingSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metaheres.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.ServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.ServiceName
	 * @generated
	 */
	public Adapter createServiceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.RightLevel <em>Right Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.RightLevel
	 * @generated
	 */
	public Adapter createRightLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.RightsLevelList <em>Rights Level List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.RightsLevelList
	 * @generated
	 */
	public Adapter createRightsLevelListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.StatusList <em>Status List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.StatusList
	 * @generated
	 */
	public Adapter createStatusListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.UsersConfig <em>Users Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.UsersConfig
	 * @generated
	 */
	public Adapter createUsersConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.ServiceConfig <em>Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.ServiceConfig
	 * @generated
	 */
	public Adapter createServiceConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.ReservableEntity <em>Reservable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.ReservableEntity
	 * @generated
	 */
	public Adapter createReservableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.ReservationsConfig <em>Reservations Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.ReservationsConfig
	 * @generated
	 */
	public Adapter createReservationsConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.ResourcesConfig <em>Resources Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.ResourcesConfig
	 * @generated
	 */
	public Adapter createResourcesConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.LotsConfig <em>Lots Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.LotsConfig
	 * @generated
	 */
	public Adapter createLotsConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaheres.PricingSystem <em>Pricing System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaheres.PricingSystem
	 * @generated
	 */
	public Adapter createPricingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaheresAdapterFactory
