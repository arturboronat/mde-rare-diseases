/**
 */
package data_Description;

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
 * @see data_Description.Data_DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface Data_DescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data_Description";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/data_Description";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data_Description";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data_DescriptionPackage eINSTANCE = data_Description.impl.Data_DescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link data_Description.impl.CategoricalStatImpl <em>Categorical Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data_Description.impl.CategoricalStatImpl
	 * @see data_Description.impl.Data_DescriptionPackageImpl#getCategoricalStat()
	 * @generated
	 */
	int CATEGORICAL_STAT = 0;

	/**
	 * The feature id for the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_STAT__COLUMN_ID = 0;

	/**
	 * The feature id for the '<em><b>Frequency Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_STAT__FREQUENCY_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Categorical Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_STAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Categorical Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_STAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data_Description.impl.NumericalStatImpl <em>Numerical Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data_Description.impl.NumericalStatImpl
	 * @see data_Description.impl.Data_DescriptionPackageImpl#getNumericalStat()
	 * @generated
	 */
	int NUMERICAL_STAT = 1;

	/**
	 * The feature id for the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__COLUMN_ID = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__MAX = 2;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__MEAN = 3;

	/**
	 * The feature id for the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__STD = 4;

	/**
	 * The feature id for the '<em><b>Freqency Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT__FREQENCY_TABLE = 5;

	/**
	 * The number of structural features of the '<em>Numerical Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Numerical Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_STAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data_Description.impl.freqTableImpl <em>freq Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data_Description.impl.freqTableImpl
	 * @see data_Description.impl.Data_DescriptionPackageImpl#getfreqTable()
	 * @generated
	 */
	int FREQ_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQ_TABLE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQ_TABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>freq Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQ_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>freq Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQ_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link data_Description.impl.DataDescriptionImpl <em>Data Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data_Description.impl.DataDescriptionImpl
	 * @see data_Description.impl.Data_DescriptionPackageImpl#getDataDescription()
	 * @generated
	 */
	int DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Numericalstat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__NUMERICALSTAT = 0;

	/**
	 * The feature id for the '<em><b>Categoricalstat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__CATEGORICALSTAT = 1;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION__DATA_NAME = 2;

	/**
	 * The number of structural features of the '<em>Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link data_Description.CategoricalStat <em>Categorical Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorical Stat</em>'.
	 * @see data_Description.CategoricalStat
	 * @generated
	 */
	EClass getCategoricalStat();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.CategoricalStat#getColumnId <em>Column Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Id</em>'.
	 * @see data_Description.CategoricalStat#getColumnId()
	 * @see #getCategoricalStat()
	 * @generated
	 */
	EAttribute getCategoricalStat_ColumnId();

	/**
	 * Returns the meta object for the reference list '{@link data_Description.CategoricalStat#getFrequencyTable <em>Frequency Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frequency Table</em>'.
	 * @see data_Description.CategoricalStat#getFrequencyTable()
	 * @see #getCategoricalStat()
	 * @generated
	 */
	EReference getCategoricalStat_FrequencyTable();

	/**
	 * Returns the meta object for class '{@link data_Description.NumericalStat <em>Numerical Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Stat</em>'.
	 * @see data_Description.NumericalStat
	 * @generated
	 */
	EClass getNumericalStat();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.NumericalStat#getColumnId <em>Column Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Id</em>'.
	 * @see data_Description.NumericalStat#getColumnId()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EAttribute getNumericalStat_ColumnId();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.NumericalStat#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see data_Description.NumericalStat#getMin()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EAttribute getNumericalStat_Min();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.NumericalStat#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see data_Description.NumericalStat#getMax()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EAttribute getNumericalStat_Max();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.NumericalStat#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see data_Description.NumericalStat#getMean()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EAttribute getNumericalStat_Mean();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.NumericalStat#getStd <em>Std</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std</em>'.
	 * @see data_Description.NumericalStat#getStd()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EAttribute getNumericalStat_Std();

	/**
	 * Returns the meta object for the reference list '{@link data_Description.NumericalStat#getFreqencyTable <em>Freqency Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Freqency Table</em>'.
	 * @see data_Description.NumericalStat#getFreqencyTable()
	 * @see #getNumericalStat()
	 * @generated
	 */
	EReference getNumericalStat_FreqencyTable();

	/**
	 * Returns the meta object for class '{@link data_Description.freqTable <em>freq Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>freq Table</em>'.
	 * @see data_Description.freqTable
	 * @generated
	 */
	EClass getfreqTable();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.freqTable#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see data_Description.freqTable#getLabel()
	 * @see #getfreqTable()
	 * @generated
	 */
	EAttribute getfreqTable_Label();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.freqTable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see data_Description.freqTable#getValue()
	 * @see #getfreqTable()
	 * @generated
	 */
	EAttribute getfreqTable_Value();

	/**
	 * Returns the meta object for class '{@link data_Description.DataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Description</em>'.
	 * @see data_Description.DataDescription
	 * @generated
	 */
	EClass getDataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link data_Description.DataDescription#getNumericalstat <em>Numericalstat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Numericalstat</em>'.
	 * @see data_Description.DataDescription#getNumericalstat()
	 * @see #getDataDescription()
	 * @generated
	 */
	EReference getDataDescription_Numericalstat();

	/**
	 * Returns the meta object for the containment reference list '{@link data_Description.DataDescription#getCategoricalstat <em>Categoricalstat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categoricalstat</em>'.
	 * @see data_Description.DataDescription#getCategoricalstat()
	 * @see #getDataDescription()
	 * @generated
	 */
	EReference getDataDescription_Categoricalstat();

	/**
	 * Returns the meta object for the attribute '{@link data_Description.DataDescription#getDataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Name</em>'.
	 * @see data_Description.DataDescription#getDataName()
	 * @see #getDataDescription()
	 * @generated
	 */
	EAttribute getDataDescription_DataName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Data_DescriptionFactory getData_DescriptionFactory();

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
		 * The meta object literal for the '{@link data_Description.impl.CategoricalStatImpl <em>Categorical Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data_Description.impl.CategoricalStatImpl
		 * @see data_Description.impl.Data_DescriptionPackageImpl#getCategoricalStat()
		 * @generated
		 */
		EClass CATEGORICAL_STAT = eINSTANCE.getCategoricalStat();

		/**
		 * The meta object literal for the '<em><b>Column Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORICAL_STAT__COLUMN_ID = eINSTANCE.getCategoricalStat_ColumnId();

		/**
		 * The meta object literal for the '<em><b>Frequency Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORICAL_STAT__FREQUENCY_TABLE = eINSTANCE.getCategoricalStat_FrequencyTable();

		/**
		 * The meta object literal for the '{@link data_Description.impl.NumericalStatImpl <em>Numerical Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data_Description.impl.NumericalStatImpl
		 * @see data_Description.impl.Data_DescriptionPackageImpl#getNumericalStat()
		 * @generated
		 */
		EClass NUMERICAL_STAT = eINSTANCE.getNumericalStat();

		/**
		 * The meta object literal for the '<em><b>Column Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_STAT__COLUMN_ID = eINSTANCE.getNumericalStat_ColumnId();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_STAT__MIN = eINSTANCE.getNumericalStat_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_STAT__MAX = eINSTANCE.getNumericalStat_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_STAT__MEAN = eINSTANCE.getNumericalStat_Mean();

		/**
		 * The meta object literal for the '<em><b>Std</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_STAT__STD = eINSTANCE.getNumericalStat_Std();

		/**
		 * The meta object literal for the '<em><b>Freqency Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_STAT__FREQENCY_TABLE = eINSTANCE.getNumericalStat_FreqencyTable();

		/**
		 * The meta object literal for the '{@link data_Description.impl.freqTableImpl <em>freq Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data_Description.impl.freqTableImpl
		 * @see data_Description.impl.Data_DescriptionPackageImpl#getfreqTable()
		 * @generated
		 */
		EClass FREQ_TABLE = eINSTANCE.getfreqTable();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQ_TABLE__LABEL = eINSTANCE.getfreqTable_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQ_TABLE__VALUE = eINSTANCE.getfreqTable_Value();

		/**
		 * The meta object literal for the '{@link data_Description.impl.DataDescriptionImpl <em>Data Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data_Description.impl.DataDescriptionImpl
		 * @see data_Description.impl.Data_DescriptionPackageImpl#getDataDescription()
		 * @generated
		 */
		EClass DATA_DESCRIPTION = eINSTANCE.getDataDescription();

		/**
		 * The meta object literal for the '<em><b>Numericalstat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DESCRIPTION__NUMERICALSTAT = eINSTANCE.getDataDescription_Numericalstat();

		/**
		 * The meta object literal for the '<em><b>Categoricalstat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DESCRIPTION__CATEGORICALSTAT = eINSTANCE.getDataDescription_Categoricalstat();

		/**
		 * The meta object literal for the '<em><b>Data Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DESCRIPTION__DATA_NAME = eINSTANCE.getDataDescription_DataName();

	}

} //Data_DescriptionPackage
