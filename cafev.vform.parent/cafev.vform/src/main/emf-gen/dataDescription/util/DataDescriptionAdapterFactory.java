/**
 */
package dataDescription.util;

import dataDescription.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataDescription.DataDescriptionPackage
 * @generated
 */
public class DataDescriptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescriptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataDescriptionPackage.eINSTANCE;
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
	protected DataDescriptionSwitch<Adapter> modelSwitch =
		new DataDescriptionSwitch<Adapter>() {
			@Override
			public Adapter caseStatsDataModel(StatsDataModel object) {
				return createStatsDataModelAdapter();
			}
			@Override
			public Adapter caseStatsDataType(StatsDataType object) {
				return createStatsDataTypeAdapter();
			}
			@Override
			public Adapter caseCategoricalType(CategoricalType object) {
				return createCategoricalTypeAdapter();
			}
			@Override
			public Adapter caseNumericalType(NumericalType object) {
				return createNumericalTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyEntry(FrequencyEntry object) {
				return createFrequencyEntryAdapter();
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
	 * Creates a new adapter for an object of class '{@link dataDescription.StatsDataModel <em>Stats Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataDescription.StatsDataModel
	 * @generated
	 */
	public Adapter createStatsDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataDescription.StatsDataType <em>Stats Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataDescription.StatsDataType
	 * @generated
	 */
	public Adapter createStatsDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataDescription.CategoricalType <em>Categorical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataDescription.CategoricalType
	 * @generated
	 */
	public Adapter createCategoricalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataDescription.NumericalType <em>Numerical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataDescription.NumericalType
	 * @generated
	 */
	public Adapter createNumericalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataDescription.FrequencyEntry <em>Frequency Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataDescription.FrequencyEntry
	 * @generated
	 */
	public Adapter createFrequencyEntryAdapter() {
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

} //DataDescriptionAdapterFactory
