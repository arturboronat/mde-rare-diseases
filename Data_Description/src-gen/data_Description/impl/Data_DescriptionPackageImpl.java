/**
 */
package data_Description.impl;

import data_Description.CategoricalStat;
import data_Description.DataDescription;
import data_Description.Data_DescriptionFactory;
import data_Description.Data_DescriptionPackage;
import data_Description.NumericalStat;

import data_Description.freqTable;
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
public class Data_DescriptionPackageImpl extends EPackageImpl implements Data_DescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoricalStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freqTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDescriptionEClass = null;

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
	 * @see data_Description.Data_DescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Data_DescriptionPackageImpl() {
		super(eNS_URI, Data_DescriptionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Data_DescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Data_DescriptionPackage init() {
		if (isInited)
			return (Data_DescriptionPackage) EPackage.Registry.INSTANCE.getEPackage(Data_DescriptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredData_DescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Data_DescriptionPackageImpl theData_DescriptionPackage = registeredData_DescriptionPackage instanceof Data_DescriptionPackageImpl
				? (Data_DescriptionPackageImpl) registeredData_DescriptionPackage
				: new Data_DescriptionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theData_DescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theData_DescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theData_DescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Data_DescriptionPackage.eNS_URI, theData_DescriptionPackage);
		return theData_DescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoricalStat() {
		return categoricalStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoricalStat_ColumnId() {
		return (EAttribute) categoricalStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoricalStat_FrequencyTable() {
		return (EReference) categoricalStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalStat() {
		return numericalStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalStat_ColumnId() {
		return (EAttribute) numericalStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalStat_Min() {
		return (EAttribute) numericalStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalStat_Max() {
		return (EAttribute) numericalStatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalStat_Mean() {
		return (EAttribute) numericalStatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalStat_Std() {
		return (EAttribute) numericalStatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericalStat_FreqencyTable() {
		return (EReference) numericalStatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfreqTable() {
		return freqTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfreqTable_Label() {
		return (EAttribute) freqTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfreqTable_Value() {
		return (EAttribute) freqTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDescription() {
		return dataDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDescription_Numericalstat() {
		return (EReference) dataDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDescription_Categoricalstat() {
		return (EReference) dataDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDescription_DataName() {
		return (EAttribute) dataDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_DescriptionFactory getData_DescriptionFactory() {
		return (Data_DescriptionFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		categoricalStatEClass = createEClass(CATEGORICAL_STAT);
		createEAttribute(categoricalStatEClass, CATEGORICAL_STAT__COLUMN_ID);
		createEReference(categoricalStatEClass, CATEGORICAL_STAT__FREQUENCY_TABLE);

		numericalStatEClass = createEClass(NUMERICAL_STAT);
		createEAttribute(numericalStatEClass, NUMERICAL_STAT__COLUMN_ID);
		createEAttribute(numericalStatEClass, NUMERICAL_STAT__MIN);
		createEAttribute(numericalStatEClass, NUMERICAL_STAT__MAX);
		createEAttribute(numericalStatEClass, NUMERICAL_STAT__MEAN);
		createEAttribute(numericalStatEClass, NUMERICAL_STAT__STD);
		createEReference(numericalStatEClass, NUMERICAL_STAT__FREQENCY_TABLE);

		freqTableEClass = createEClass(FREQ_TABLE);
		createEAttribute(freqTableEClass, FREQ_TABLE__LABEL);
		createEAttribute(freqTableEClass, FREQ_TABLE__VALUE);

		dataDescriptionEClass = createEClass(DATA_DESCRIPTION);
		createEReference(dataDescriptionEClass, DATA_DESCRIPTION__NUMERICALSTAT);
		createEReference(dataDescriptionEClass, DATA_DESCRIPTION__CATEGORICALSTAT);
		createEAttribute(dataDescriptionEClass, DATA_DESCRIPTION__DATA_NAME);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(categoricalStatEClass, CategoricalStat.class, "CategoricalStat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoricalStat_ColumnId(), ecorePackage.getEString(), "columnId", null, 1, 1,
				CategoricalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCategoricalStat_FrequencyTable(), this.getfreqTable(), null, "frequencyTable", null, 0, -1,
				CategoricalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalStatEClass, NumericalStat.class, "NumericalStat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalStat_ColumnId(), ecorePackage.getEString(), "columnId", null, 1, 1,
				NumericalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalStat_Min(), ecorePackage.getEFloat(), "min", null, 1, 1, NumericalStat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getNumericalStat_Max(), ecorePackage.getEFloat(), "max", null, 1, 1, NumericalStat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalStat_Mean(), ecorePackage.getEFloat(), "mean", null, 1, 1, NumericalStat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalStat_Std(), ecorePackage.getEFloat(), "std", null, 1, 1, NumericalStat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericalStat_FreqencyTable(), this.getfreqTable(), null, "FreqencyTable", null, 0, -1,
				NumericalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freqTableEClass, freqTable.class, "freqTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getfreqTable_Label(), ecorePackage.getEString(), "label", null, 1, 1, freqTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getfreqTable_Value(), ecorePackage.getEInt(), "value", null, 1, 1, freqTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(dataDescriptionEClass, DataDescription.class, "DataDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDescription_Numericalstat(), this.getNumericalStat(), null, "numericalstat", null, 0, -1,
				DataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDescription_Categoricalstat(), this.getCategoricalStat(), null, "categoricalstat", null,
				0, -1, DataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataDescription_DataName(), ecorePackage.getEString(), "dataName", null, 1, 1,
				DataDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Data_DescriptionPackageImpl
