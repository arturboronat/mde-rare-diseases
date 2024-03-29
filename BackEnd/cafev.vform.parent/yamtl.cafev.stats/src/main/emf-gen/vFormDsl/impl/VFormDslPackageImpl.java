/**
 */
package vFormDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vFormDsl.BasicInputType;
import vFormDsl.Data;
import vFormDsl.DataOption;
import vFormDsl.DataOptionItem;
import vFormDsl.EnumOption;
import vFormDsl.FormInput;
import vFormDsl.FormInputBasic;
import vFormDsl.FormInputGroup;
import vFormDsl.FormInputRange;
import vFormDsl.FormInputSearch;
import vFormDsl.FormInputSelect;
import vFormDsl.FormLayout;
import vFormDsl.IntData;
import vFormDsl.IntOptionItem;
import vFormDsl.Layout;
import vFormDsl.Model;
import vFormDsl.NumberOption;
import vFormDsl.Option;
import vFormDsl.OptionItem;
import vFormDsl.StringData;
import vFormDsl.StringOptionItem;
import vFormDsl.VFormDslFactory;
import vFormDsl.VFormDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VFormDslPackageImpl extends EPackageImpl implements VFormDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringOptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intOptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formInputGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutEEnum = null;

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
	 * @see vFormDsl.VFormDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VFormDslPackageImpl() {
		super(eNS_URI, VFormDslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VFormDslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VFormDslPackage init() {
		if (isInited) return (VFormDslPackage)EPackage.Registry.INSTANCE.getEPackage(VFormDslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVFormDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VFormDslPackageImpl theVFormDslPackage = registeredVFormDslPackage instanceof VFormDslPackageImpl ? (VFormDslPackageImpl)registeredVFormDslPackage : new VFormDslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVFormDslPackage.createPackageContents();

		// Initialize created meta-data
		theVFormDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVFormDslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VFormDslPackage.eNS_URI, theVFormDslPackage);
		return theVFormDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_FormLayout() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_FormInput() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLayout() {
		return formLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLayout_Layout() {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInput() {
		return formInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormInput_Name() {
		return (EAttribute)formInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInputBasic() {
		return formInputBasicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormInputBasic_Type() {
		return (EAttribute)formInputBasicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInputRange() {
		return formInputRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormInputRange_Min() {
		return (EAttribute)formInputRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormInputRange_Max() {
		return (EAttribute)formInputRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInputSelect() {
		return formInputSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormInputSelect_Option() {
		return (EReference)formInputSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOption() {
		return dataOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOption_Data() {
		return (EReference)dataOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumOption() {
		return enumOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumOption_Data() {
		return (EReference)enumOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOption() {
		return numberOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberOption_Min() {
		return (EAttribute)numberOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberOption_Max() {
		return (EAttribute)numberOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberOption_Range() {
		return (EAttribute)numberOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInputSearch() {
		return formInputSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormInputSearch_Data() {
		return (EReference)formInputSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionItem() {
		return optionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringOptionItem() {
		return stringOptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOptionItem_Value() {
		return (EAttribute)stringOptionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntOptionItem() {
		return intOptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntOptionItem_Value() {
		return (EAttribute)intOptionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOptionItem() {
		return dataOptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOptionItem_Value() {
		return (EReference)dataOptionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormInputGroup() {
		return formInputGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormInputGroup_GroupInputs() {
		return (EReference)formInputGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Label() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringData() {
		return stringDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringData_Value() {
		return (EAttribute)stringDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntData() {
		return intDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntData_Value() {
		return (EAttribute)intDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicInputType() {
		return basicInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayout() {
		return layoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VFormDslFactory getVFormDslFactory() {
		return (VFormDslFactory)getEFactoryInstance();
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
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__FORM_LAYOUT);
		createEReference(modelEClass, MODEL__FORM_INPUT);

		formLayoutEClass = createEClass(FORM_LAYOUT);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__LAYOUT);

		formInputEClass = createEClass(FORM_INPUT);
		createEAttribute(formInputEClass, FORM_INPUT__NAME);

		formInputBasicEClass = createEClass(FORM_INPUT_BASIC);
		createEAttribute(formInputBasicEClass, FORM_INPUT_BASIC__TYPE);

		formInputRangeEClass = createEClass(FORM_INPUT_RANGE);
		createEAttribute(formInputRangeEClass, FORM_INPUT_RANGE__MIN);
		createEAttribute(formInputRangeEClass, FORM_INPUT_RANGE__MAX);

		formInputSelectEClass = createEClass(FORM_INPUT_SELECT);
		createEReference(formInputSelectEClass, FORM_INPUT_SELECT__OPTION);

		optionEClass = createEClass(OPTION);

		dataOptionEClass = createEClass(DATA_OPTION);
		createEReference(dataOptionEClass, DATA_OPTION__DATA);

		enumOptionEClass = createEClass(ENUM_OPTION);
		createEReference(enumOptionEClass, ENUM_OPTION__DATA);

		numberOptionEClass = createEClass(NUMBER_OPTION);
		createEAttribute(numberOptionEClass, NUMBER_OPTION__MIN);
		createEAttribute(numberOptionEClass, NUMBER_OPTION__MAX);
		createEAttribute(numberOptionEClass, NUMBER_OPTION__RANGE);

		formInputSearchEClass = createEClass(FORM_INPUT_SEARCH);
		createEReference(formInputSearchEClass, FORM_INPUT_SEARCH__DATA);

		optionItemEClass = createEClass(OPTION_ITEM);

		stringOptionItemEClass = createEClass(STRING_OPTION_ITEM);
		createEAttribute(stringOptionItemEClass, STRING_OPTION_ITEM__VALUE);

		intOptionItemEClass = createEClass(INT_OPTION_ITEM);
		createEAttribute(intOptionItemEClass, INT_OPTION_ITEM__VALUE);

		dataOptionItemEClass = createEClass(DATA_OPTION_ITEM);
		createEReference(dataOptionItemEClass, DATA_OPTION_ITEM__VALUE);

		formInputGroupEClass = createEClass(FORM_INPUT_GROUP);
		createEReference(formInputGroupEClass, FORM_INPUT_GROUP__GROUP_INPUTS);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__LABEL);

		stringDataEClass = createEClass(STRING_DATA);
		createEAttribute(stringDataEClass, STRING_DATA__VALUE);

		intDataEClass = createEClass(INT_DATA);
		createEAttribute(intDataEClass, INT_DATA__VALUE);

		// Create enums
		basicInputTypeEEnum = createEEnum(BASIC_INPUT_TYPE);
		layoutEEnum = createEEnum(LAYOUT);
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
		formInputBasicEClass.getESuperTypes().add(this.getFormInput());
		formInputRangeEClass.getESuperTypes().add(this.getFormInput());
		formInputSelectEClass.getESuperTypes().add(this.getFormInput());
		dataOptionEClass.getESuperTypes().add(this.getOption());
		enumOptionEClass.getESuperTypes().add(this.getOption());
		numberOptionEClass.getESuperTypes().add(this.getOption());
		formInputSearchEClass.getESuperTypes().add(this.getFormInput());
		stringOptionItemEClass.getESuperTypes().add(this.getOptionItem());
		intOptionItemEClass.getESuperTypes().add(this.getOptionItem());
		dataOptionItemEClass.getESuperTypes().add(this.getOptionItem());
		formInputGroupEClass.getESuperTypes().add(this.getFormInput());
		stringDataEClass.getESuperTypes().add(this.getData());
		intDataEClass.getESuperTypes().add(this.getData());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_FormLayout(), this.getFormLayout(), null, "formLayout", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_FormInput(), this.getFormInput(), null, "formInput", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLayoutEClass, FormLayout.class, "FormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormLayout_Layout(), this.getLayout(), "layout", null, 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputEClass, FormInput.class, "FormInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputBasicEClass, FormInputBasic.class, "FormInputBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormInputBasic_Type(), this.getBasicInputType(), "type", null, 0, 1, FormInputBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputRangeEClass, FormInputRange.class, "FormInputRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormInputRange_Min(), ecorePackage.getEInt(), "min", null, 0, 1, FormInputRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormInputRange_Max(), ecorePackage.getEInt(), "max", null, 0, 1, FormInputRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputSelectEClass, FormInputSelect.class, "FormInputSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormInputSelect_Option(), this.getOption(), null, "option", null, 0, 1, FormInputSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataOptionEClass, DataOption.class, "DataOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOption_Data(), this.getData(), null, "data", null, 0, -1, DataOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumOptionEClass, EnumOption.class, "EnumOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumOption_Data(), this.getOptionItem(), null, "data", null, 0, -1, EnumOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberOptionEClass, NumberOption.class, "NumberOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberOption_Min(), ecorePackage.getEInt(), "min", null, 0, 1, NumberOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberOption_Max(), ecorePackage.getEInt(), "max", null, 0, 1, NumberOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberOption_Range(), ecorePackage.getEInt(), "range", null, 0, 1, NumberOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputSearchEClass, FormInputSearch.class, "FormInputSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormInputSearch_Data(), this.getOptionItem(), null, "data", null, 0, -1, FormInputSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionItemEClass, OptionItem.class, "OptionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringOptionItemEClass, StringOptionItem.class, "StringOptionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringOptionItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringOptionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intOptionItemEClass, IntOptionItem.class, "IntOptionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntOptionItem_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntOptionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataOptionItemEClass, DataOptionItem.class, "DataOptionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOptionItem_Value(), this.getData(), null, "value", null, 0, 1, DataOptionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formInputGroupEClass, FormInputGroup.class, "FormInputGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormInputGroup_GroupInputs(), this.getFormInput(), null, "groupInputs", null, 0, 1, FormInputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Label(), ecorePackage.getEString(), "label", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringDataEClass, StringData.class, "StringData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringData_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intDataEClass, IntData.class, "IntData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntData_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(basicInputTypeEEnum, BasicInputType.class, "BasicInputType");
		addEEnumLiteral(basicInputTypeEEnum, BasicInputType.TEXT);
		addEEnumLiteral(basicInputTypeEEnum, BasicInputType.CHECKBOX);
		addEEnumLiteral(basicInputTypeEEnum, BasicInputType.NUMBER);

		initEEnum(layoutEEnum, Layout.class, "Layout");
		addEEnumLiteral(layoutEEnum, Layout.HORIZONTAL);
		addEEnumLiteral(layoutEEnum, Layout.VERTICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //VFormDslPackageImpl
