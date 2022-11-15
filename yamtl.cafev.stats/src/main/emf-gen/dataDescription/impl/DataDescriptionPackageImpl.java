/**
 */
package dataDescription.impl;

import dataDescription.CategoricalType;
import dataDescription.DataDescriptionFactory;
import dataDescription.DataDescriptionPackage;
import dataDescription.FrequencyEntry;
import dataDescription.NumericalType;
import dataDescription.StatsDataModel;
import dataDescription.StatsDataType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDescriptionPackageImpl extends EPackageImpl implements DataDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statsDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statsDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoricalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyEntryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dataDescription.DataDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataDescriptionPackageImpl() {
		super(eNS_URI, DataDescriptionFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataDescriptionPackage init() {
		if (isInited) return (DataDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DataDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataDescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataDescriptionPackageImpl theDataDescriptionPackage = registeredDataDescriptionPackage instanceof DataDescriptionPackageImpl ? (DataDescriptionPackageImpl)registeredDataDescriptionPackage : new DataDescriptionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theDataDescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataDescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataDescriptionPackage.eNS_URI, theDataDescriptionPackage);
		return theDataDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatsDataModel() {
		return statsDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatsDataModel_Name() {
		return (EAttribute)statsDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatsDataModel_Types() {
		return (EReference)statsDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatsDataType() {
		return statsDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatsDataType_Name() {
		return (EAttribute)statsDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatsDataType_FrequencyTable() {
		return (EReference)statsDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoricalType() {
		return categoricalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoricalType_DataType() {
		return (EReference)categoricalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalType() {
		return numericalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalType_Min() {
		return (EAttribute)numericalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalType_Max() {
		return (EAttribute)numericalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalType_Mean() {
		return (EAttribute)numericalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalType_Std() {
		return (EAttribute)numericalTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyEntry() {
		return frequencyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyEntry_Name() {
		return (EAttribute)frequencyEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyEntry_Frequency() {
		return (EAttribute)frequencyEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescriptionFactory getDataDescriptionFactory() {
		return (DataDescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		statsDataModelEClass = createEClass(STATS_DATA_MODEL);
		createEAttribute(statsDataModelEClass, STATS_DATA_MODEL__NAME);
		createEReference(statsDataModelEClass, STATS_DATA_MODEL__TYPES);

		statsDataTypeEClass = createEClass(STATS_DATA_TYPE);
		createEAttribute(statsDataTypeEClass, STATS_DATA_TYPE__NAME);
		createEReference(statsDataTypeEClass, STATS_DATA_TYPE__FREQUENCY_TABLE);

		categoricalTypeEClass = createEClass(CATEGORICAL_TYPE);
		createEReference(categoricalTypeEClass, CATEGORICAL_TYPE__DATA_TYPE);

		numericalTypeEClass = createEClass(NUMERICAL_TYPE);
		createEAttribute(numericalTypeEClass, NUMERICAL_TYPE__MIN);
		createEAttribute(numericalTypeEClass, NUMERICAL_TYPE__MAX);
		createEAttribute(numericalTypeEClass, NUMERICAL_TYPE__MEAN);
		createEAttribute(numericalTypeEClass, NUMERICAL_TYPE__STD);

		frequencyEntryEClass = createEClass(FREQUENCY_ENTRY);
		createEAttribute(frequencyEntryEClass, FREQUENCY_ENTRY__NAME);
		createEAttribute(frequencyEntryEClass, FREQUENCY_ENTRY__FREQUENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		categoricalTypeEClass.getESuperTypes().add(this.getStatsDataType());
		numericalTypeEClass.getESuperTypes().add(this.getStatsDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(statsDataModelEClass, StatsDataModel.class, "StatsDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatsDataModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, StatsDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatsDataModel_Types(), this.getStatsDataType(), null, "types", null, 0, -1, StatsDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statsDataTypeEClass, StatsDataType.class, "StatsDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatsDataType_Name(), ecorePackage.getEString(), "name", null, 1, 1, StatsDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatsDataType_FrequencyTable(), this.getFrequencyEntry(), null, "frequencyTable", null, 0, -1, StatsDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoricalTypeEClass, CategoricalType.class, "CategoricalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoricalType_DataType(), ecorePackage.getEDataType(), null, "dataType", null, 1, 1, CategoricalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalTypeEClass, NumericalType.class, "NumericalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalType_Min(), ecorePackage.getEDouble(), "min", null, 1, 1, NumericalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalType_Max(), ecorePackage.getEDouble(), "max", null, 1, 1, NumericalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalType_Mean(), ecorePackage.getEDouble(), "mean", null, 1, 1, NumericalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalType_Std(), ecorePackage.getEDouble(), "std", null, 1, 1, NumericalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyEntryEClass, FrequencyEntry.class, "FrequencyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, FrequencyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyEntry_Frequency(), ecorePackage.getEInt(), "frequency", null, 1, 1, FrequencyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataDescriptionPackageImpl
