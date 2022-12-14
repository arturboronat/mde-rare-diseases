/**
 */
package dataDescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dataDescription.DataDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DataDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataDescription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataDescriptionPackage eINSTANCE = dataDescription.impl.DataDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataDescription.impl.StatsDataModelImpl <em>Stats Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataDescription.impl.StatsDataModelImpl
	 * @see dataDescription.impl.DataDescriptionPackageImpl#getStatsDataModel()
	 * @generated
	 */
	int STATS_DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_MODEL__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Stats Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stats Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataDescription.impl.StatsDataTypeImpl <em>Stats Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataDescription.impl.StatsDataTypeImpl
	 * @see dataDescription.impl.DataDescriptionPackageImpl#getStatsDataType()
	 * @generated
	 */
	int STATS_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Frequency Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_TYPE__FREQUENCY_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Stats Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stats Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataDescription.impl.CategoricalTypeImpl <em>Categorical Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataDescription.impl.CategoricalTypeImpl
	 * @see dataDescription.impl.DataDescriptionPackageImpl#getCategoricalType()
	 * @generated
	 */
	int CATEGORICAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_TYPE__NAME = STATS_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Frequency Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_TYPE__FREQUENCY_TABLE = STATS_DATA_TYPE__FREQUENCY_TABLE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_TYPE__DATA_TYPE = STATS_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categorical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_TYPE_FEATURE_COUNT = STATS_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Categorical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_TYPE_OPERATION_COUNT = STATS_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataDescription.impl.NumericalTypeImpl <em>Numerical Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataDescription.impl.NumericalTypeImpl
	 * @see dataDescription.impl.DataDescriptionPackageImpl#getNumericalType()
	 * @generated
	 */
	int NUMERICAL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__NAME = STATS_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Frequency Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__FREQUENCY_TABLE = STATS_DATA_TYPE__FREQUENCY_TABLE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__MIN = STATS_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__MAX = STATS_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__MEAN = STATS_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE__STD = STATS_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Numerical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE_FEATURE_COUNT = STATS_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Numerical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_TYPE_OPERATION_COUNT = STATS_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataDescription.impl.FrequencyEntryImpl <em>Frequency Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataDescription.impl.FrequencyEntryImpl
	 * @see dataDescription.impl.DataDescriptionPackageImpl#getFrequencyEntry()
	 * @generated
	 */
	int FREQUENCY_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_ENTRY__FREQUENCY = 1;

	/**
	 * The number of structural features of the '<em>Frequency Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Frequency Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_ENTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dataDescription.StatsDataModel <em>Stats Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats Data Model</em>'.
	 * @see dataDescription.StatsDataModel
	 * @generated
	 */
	EClass getStatsDataModel();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.StatsDataModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataDescription.StatsDataModel#getName()
	 * @see #getStatsDataModel()
	 * @generated
	 */
	EAttribute getStatsDataModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dataDescription.StatsDataModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see dataDescription.StatsDataModel#getTypes()
	 * @see #getStatsDataModel()
	 * @generated
	 */
	EReference getStatsDataModel_Types();

	/**
	 * Returns the meta object for class '{@link dataDescription.StatsDataType <em>Stats Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats Data Type</em>'.
	 * @see dataDescription.StatsDataType
	 * @generated
	 */
	EClass getStatsDataType();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.StatsDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataDescription.StatsDataType#getName()
	 * @see #getStatsDataType()
	 * @generated
	 */
	EAttribute getStatsDataType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dataDescription.StatsDataType#getFrequencyTable <em>Frequency Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequency Table</em>'.
	 * @see dataDescription.StatsDataType#getFrequencyTable()
	 * @see #getStatsDataType()
	 * @generated
	 */
	EReference getStatsDataType_FrequencyTable();

	/**
	 * Returns the meta object for class '{@link dataDescription.CategoricalType <em>Categorical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorical Type</em>'.
	 * @see dataDescription.CategoricalType
	 * @generated
	 */
	EClass getCategoricalType();

	/**
	 * Returns the meta object for the reference '{@link dataDescription.CategoricalType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see dataDescription.CategoricalType#getDataType()
	 * @see #getCategoricalType()
	 * @generated
	 */
	EReference getCategoricalType_DataType();

	/**
	 * Returns the meta object for class '{@link dataDescription.NumericalType <em>Numerical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Type</em>'.
	 * @see dataDescription.NumericalType
	 * @generated
	 */
	EClass getNumericalType();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.NumericalType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see dataDescription.NumericalType#getMin()
	 * @see #getNumericalType()
	 * @generated
	 */
	EAttribute getNumericalType_Min();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.NumericalType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see dataDescription.NumericalType#getMax()
	 * @see #getNumericalType()
	 * @generated
	 */
	EAttribute getNumericalType_Max();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.NumericalType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see dataDescription.NumericalType#getMean()
	 * @see #getNumericalType()
	 * @generated
	 */
	EAttribute getNumericalType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.NumericalType#getStd <em>Std</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std</em>'.
	 * @see dataDescription.NumericalType#getStd()
	 * @see #getNumericalType()
	 * @generated
	 */
	EAttribute getNumericalType_Std();

	/**
	 * Returns the meta object for class '{@link dataDescription.FrequencyEntry <em>Frequency Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Entry</em>'.
	 * @see dataDescription.FrequencyEntry
	 * @generated
	 */
	EClass getFrequencyEntry();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.FrequencyEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataDescription.FrequencyEntry#getName()
	 * @see #getFrequencyEntry()
	 * @generated
	 */
	EAttribute getFrequencyEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataDescription.FrequencyEntry#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see dataDescription.FrequencyEntry#getFrequency()
	 * @see #getFrequencyEntry()
	 * @generated
	 */
	EAttribute getFrequencyEntry_Frequency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataDescriptionFactory getDataDescriptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dataDescription.impl.StatsDataModelImpl <em>Stats Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataDescription.impl.StatsDataModelImpl
		 * @see dataDescription.impl.DataDescriptionPackageImpl#getStatsDataModel()
		 * @generated
		 */
		EClass STATS_DATA_MODEL = eINSTANCE.getStatsDataModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS_DATA_MODEL__NAME = eINSTANCE.getStatsDataModel_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATS_DATA_MODEL__TYPES = eINSTANCE.getStatsDataModel_Types();

		/**
		 * The meta object literal for the '{@link dataDescription.impl.StatsDataTypeImpl <em>Stats Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataDescription.impl.StatsDataTypeImpl
		 * @see dataDescription.impl.DataDescriptionPackageImpl#getStatsDataType()
		 * @generated
		 */
		EClass STATS_DATA_TYPE = eINSTANCE.getStatsDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS_DATA_TYPE__NAME = eINSTANCE.getStatsDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Frequency Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATS_DATA_TYPE__FREQUENCY_TABLE = eINSTANCE.getStatsDataType_FrequencyTable();

		/**
		 * The meta object literal for the '{@link dataDescription.impl.CategoricalTypeImpl <em>Categorical Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataDescription.impl.CategoricalTypeImpl
		 * @see dataDescription.impl.DataDescriptionPackageImpl#getCategoricalType()
		 * @generated
		 */
		EClass CATEGORICAL_TYPE = eINSTANCE.getCategoricalType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORICAL_TYPE__DATA_TYPE = eINSTANCE.getCategoricalType_DataType();

		/**
		 * The meta object literal for the '{@link dataDescription.impl.NumericalTypeImpl <em>Numerical Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataDescription.impl.NumericalTypeImpl
		 * @see dataDescription.impl.DataDescriptionPackageImpl#getNumericalType()
		 * @generated
		 */
		EClass NUMERICAL_TYPE = eINSTANCE.getNumericalType();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_TYPE__MIN = eINSTANCE.getNumericalType_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_TYPE__MAX = eINSTANCE.getNumericalType_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_TYPE__MEAN = eINSTANCE.getNumericalType_Mean();

		/**
		 * The meta object literal for the '<em><b>Std</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_TYPE__STD = eINSTANCE.getNumericalType_Std();

		/**
		 * The meta object literal for the '{@link dataDescription.impl.FrequencyEntryImpl <em>Frequency Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataDescription.impl.FrequencyEntryImpl
		 * @see dataDescription.impl.DataDescriptionPackageImpl#getFrequencyEntry()
		 * @generated
		 */
		EClass FREQUENCY_ENTRY = eINSTANCE.getFrequencyEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_ENTRY__NAME = eINSTANCE.getFrequencyEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_ENTRY__FREQUENCY = eINSTANCE.getFrequencyEntry_Frequency();

	}

} //DataDescriptionPackage
