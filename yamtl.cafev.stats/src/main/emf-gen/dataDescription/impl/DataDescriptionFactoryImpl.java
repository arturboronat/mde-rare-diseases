/**
 */
package dataDescription.impl;

import dataDescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDescriptionFactoryImpl extends EFactoryImpl implements DataDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataDescriptionFactory init() {
		try {
			DataDescriptionFactory theDataDescriptionFactory = (DataDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(DataDescriptionPackage.eNS_URI);
			if (theDataDescriptionFactory != null) {
				return theDataDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataDescriptionPackage.STATS_DATA_MODEL: return createStatsDataModel();
			case DataDescriptionPackage.CATEGORICAL_TYPE: return createCategoricalType();
			case DataDescriptionPackage.NUMERICAL_TYPE: return createNumericalType();
			case DataDescriptionPackage.FREQUENCY_TABLE: return createFrequencyTable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatsDataModel createStatsDataModel() {
		StatsDataModelImpl statsDataModel = new StatsDataModelImpl();
		return statsDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoricalType createCategoricalType() {
		CategoricalTypeImpl categoricalType = new CategoricalTypeImpl();
		return categoricalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalType createNumericalType() {
		NumericalTypeImpl numericalType = new NumericalTypeImpl();
		return numericalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyTable createFrequencyTable() {
		FrequencyTableImpl frequencyTable = new FrequencyTableImpl();
		return frequencyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescriptionPackage getDataDescriptionPackage() {
		return (DataDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataDescriptionPackage getPackage() {
		return DataDescriptionPackage.eINSTANCE;
	}

} //DataDescriptionFactoryImpl
