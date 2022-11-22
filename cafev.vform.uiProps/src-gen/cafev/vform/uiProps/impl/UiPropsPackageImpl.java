/**
 */
package cafev.vform.uiProps.impl;

import cafev.vform.uiProps.CategoricalProps;
import cafev.vform.uiProps.NumericalProps;
import cafev.vform.uiProps.Props;
import cafev.vform.uiProps.PropsModel;
import cafev.vform.uiProps.UiPropsFactory;
import cafev.vform.uiProps.UiPropsPackage;

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
public class UiPropsPackageImpl extends EPackageImpl implements UiPropsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalPropsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoricalPropsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propsModelEClass = null;

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
	 * @see cafev.vform.uiProps.UiPropsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPropsPackageImpl() {
		super(eNS_URI, UiPropsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPropsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPropsPackage init() {
		if (isInited)
			return (UiPropsPackage) EPackage.Registry.INSTANCE.getEPackage(UiPropsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUiPropsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UiPropsPackageImpl theUiPropsPackage = registeredUiPropsPackage instanceof UiPropsPackageImpl
				? (UiPropsPackageImpl) registeredUiPropsPackage
				: new UiPropsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUiPropsPackage.createPackageContents();

		// Initialize created meta-data
		theUiPropsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPropsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPropsPackage.eNS_URI, theUiPropsPackage);
		return theUiPropsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProps() {
		return propsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProps_Name() {
		return (EAttribute) propsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProps_Types() {
		return (EAttribute) propsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProps_GroupName() {
		return (EAttribute) propsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalProps() {
		return numericalPropsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalProps_Data() {
		return (EAttribute) numericalPropsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalProps_Std() {
		return (EAttribute) numericalPropsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalProps_Min() {
		return (EAttribute) numericalPropsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalProps_Max() {
		return (EAttribute) numericalPropsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalProps_Mean() {
		return (EAttribute) numericalPropsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoricalProps() {
		return categoricalPropsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoricalProps_Data() {
		return (EAttribute) categoricalPropsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropsModel() {
		return propsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropsModel_Props() {
		return (EReference) propsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPropsFactory getUiPropsFactory() {
		return (UiPropsFactory) getEFactoryInstance();
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
		propsEClass = createEClass(PROPS);
		createEAttribute(propsEClass, PROPS__NAME);
		createEAttribute(propsEClass, PROPS__TYPES);
		createEAttribute(propsEClass, PROPS__GROUP_NAME);

		numericalPropsEClass = createEClass(NUMERICAL_PROPS);
		createEAttribute(numericalPropsEClass, NUMERICAL_PROPS__DATA);
		createEAttribute(numericalPropsEClass, NUMERICAL_PROPS__STD);
		createEAttribute(numericalPropsEClass, NUMERICAL_PROPS__MIN);
		createEAttribute(numericalPropsEClass, NUMERICAL_PROPS__MAX);
		createEAttribute(numericalPropsEClass, NUMERICAL_PROPS__MEAN);

		categoricalPropsEClass = createEClass(CATEGORICAL_PROPS);
		createEAttribute(categoricalPropsEClass, CATEGORICAL_PROPS__DATA);

		propsModelEClass = createEClass(PROPS_MODEL);
		createEReference(propsModelEClass, PROPS_MODEL__PROPS);
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
		numericalPropsEClass.getESuperTypes().add(this.getProps());
		categoricalPropsEClass.getESuperTypes().add(this.getProps());

		// Initialize classes, features, and operations; add parameters
		initEClass(propsEClass, Props.class, "Props", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProps_Name(), ecorePackage.getEString(), "name", null, 1, 1, Props.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProps_Types(), ecorePackage.getEString(), "types", null, 1, -1, Props.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProps_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, Props.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalPropsEClass, NumericalProps.class, "NumericalProps", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalProps_Data(), ecorePackage.getEDouble(), "data", null, 0, -1, NumericalProps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalProps_Std(), ecorePackage.getEDouble(), "std", null, 1, 1, NumericalProps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalProps_Min(), ecorePackage.getEDouble(), "min", null, 1, 1, NumericalProps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalProps_Max(), ecorePackage.getEDouble(), "max", null, 1, 1, NumericalProps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalProps_Mean(), ecorePackage.getEDouble(), "mean", null, 1, 1, NumericalProps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoricalPropsEClass, CategoricalProps.class, "CategoricalProps", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoricalProps_Data(), ecorePackage.getEString(), "data", null, 0, -1,
				CategoricalProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(propsModelEClass, PropsModel.class, "PropsModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropsModel_Props(), this.getProps(), null, "props", null, 0, -1, PropsModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiPropsPackageImpl
