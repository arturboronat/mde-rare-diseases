/**
 */
package vFormDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see vFormDsl.VFormDslFactory
 * @model kind="package"
 * @generated
 */
public interface VFormDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vFormDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.vform.cafev/VFormDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vFormDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VFormDslPackage eINSTANCE = vFormDsl.impl.VFormDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link vFormDsl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.ModelImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Form Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FORM_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Form Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FORM_INPUT = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormLayoutImpl <em>Form Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormLayoutImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormLayout()
	 * @generated
	 */
	int FORM_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputImpl <em>Form Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInput()
	 * @generated
	 */
	int FORM_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Form Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputBasicImpl <em>Form Input Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputBasicImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputBasic()
	 * @generated
	 */
	int FORM_INPUT_BASIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_BASIC__NAME = FORM_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_BASIC__TYPE = FORM_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Input Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_BASIC_FEATURE_COUNT = FORM_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Input Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_BASIC_OPERATION_COUNT = FORM_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputRangeImpl <em>Form Input Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputRangeImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputRange()
	 * @generated
	 */
	int FORM_INPUT_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_RANGE__NAME = FORM_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_RANGE__MIN = FORM_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_RANGE__MAX = FORM_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form Input Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_RANGE_FEATURE_COUNT = FORM_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Form Input Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_RANGE_OPERATION_COUNT = FORM_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputSelectImpl <em>Form Input Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputSelectImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputSelect()
	 * @generated
	 */
	int FORM_INPUT_SELECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SELECT__NAME = FORM_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SELECT__OPTION = FORM_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Input Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SELECT_FEATURE_COUNT = FORM_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Input Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SELECT_OPERATION_COUNT = FORM_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.OptionImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.DataOptionImpl <em>Data Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.DataOptionImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getDataOption()
	 * @generated
	 */
	int DATA_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION__DATA = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.EnumOptionImpl <em>Enum Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.EnumOptionImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getEnumOption()
	 * @generated
	 */
	int ENUM_OPTION = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION__DATA = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.NumberOptionImpl <em>Number Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.NumberOptionImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getNumberOption()
	 * @generated
	 */
	int NUMBER_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__MIN = OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__MAX = OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__RANGE = OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Number Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputSearchImpl <em>Form Input Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputSearchImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputSearch()
	 * @generated
	 */
	int FORM_INPUT_SEARCH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SEARCH__NAME = FORM_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SEARCH__DATA = FORM_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Input Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SEARCH_FEATURE_COUNT = FORM_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Input Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_SEARCH_OPERATION_COUNT = FORM_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.OptionItemImpl <em>Option Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.OptionItemImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getOptionItem()
	 * @generated
	 */
	int OPTION_ITEM = 11;

	/**
	 * The number of structural features of the '<em>Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.StringOptionItemImpl <em>String Option Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.StringOptionItemImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getStringOptionItem()
	 * @generated
	 */
	int STRING_OPTION_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_ITEM__VALUE = OPTION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_ITEM_FEATURE_COUNT = OPTION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_ITEM_OPERATION_COUNT = OPTION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.IntOptionItemImpl <em>Int Option Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.IntOptionItemImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getIntOptionItem()
	 * @generated
	 */
	int INT_OPTION_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION_ITEM__VALUE = OPTION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION_ITEM_FEATURE_COUNT = OPTION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION_ITEM_OPERATION_COUNT = OPTION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.DataOptionItemImpl <em>Data Option Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.DataOptionItemImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getDataOptionItem()
	 * @generated
	 */
	int DATA_OPTION_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_ITEM__VALUE = OPTION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_ITEM_FEATURE_COUNT = OPTION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Option Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_ITEM_OPERATION_COUNT = OPTION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.FormInputGroupImpl <em>Form Input Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.FormInputGroupImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputGroup()
	 * @generated
	 */
	int FORM_INPUT_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_GROUP__NAME = FORM_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Group Inputs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_GROUP__GROUP_INPUTS = FORM_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_GROUP_FEATURE_COUNT = FORM_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_GROUP_OPERATION_COUNT = FORM_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.DataImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getData()
	 * @generated
	 */
	int DATA = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.StringDataImpl <em>String Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.StringDataImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getStringData()
	 * @generated
	 */
	int STRING_DATA = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA__LABEL = DATA__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.impl.IntDataImpl <em>Int Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.impl.IntDataImpl
	 * @see vFormDsl.impl.VFormDslPackageImpl#getIntData()
	 * @generated
	 */
	int INT_DATA = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA__LABEL = DATA__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vFormDsl.BasicInputType <em>Basic Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.BasicInputType
	 * @see vFormDsl.impl.VFormDslPackageImpl#getBasicInputType()
	 * @generated
	 */
	int BASIC_INPUT_TYPE = 19;

	/**
	 * The meta object id for the '{@link vFormDsl.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vFormDsl.Layout
	 * @see vFormDsl.impl.VFormDslPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 20;


	/**
	 * Returns the meta object for class '{@link vFormDsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see vFormDsl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link vFormDsl.Model#getFormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Layout</em>'.
	 * @see vFormDsl.Model#getFormLayout()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_FormLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link vFormDsl.Model#getFormInput <em>Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Input</em>'.
	 * @see vFormDsl.Model#getFormInput()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_FormInput();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Layout</em>'.
	 * @see vFormDsl.FormLayout
	 * @generated
	 */
	EClass getFormLayout();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.FormLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see vFormDsl.FormLayout#getLayout()
	 * @see #getFormLayout()
	 * @generated
	 */
	EAttribute getFormLayout_Layout();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInput <em>Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input</em>'.
	 * @see vFormDsl.FormInput
	 * @generated
	 */
	EClass getFormInput();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.FormInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vFormDsl.FormInput#getName()
	 * @see #getFormInput()
	 * @generated
	 */
	EAttribute getFormInput_Name();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInputBasic <em>Form Input Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input Basic</em>'.
	 * @see vFormDsl.FormInputBasic
	 * @generated
	 */
	EClass getFormInputBasic();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.FormInputBasic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vFormDsl.FormInputBasic#getType()
	 * @see #getFormInputBasic()
	 * @generated
	 */
	EAttribute getFormInputBasic_Type();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInputRange <em>Form Input Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input Range</em>'.
	 * @see vFormDsl.FormInputRange
	 * @generated
	 */
	EClass getFormInputRange();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.FormInputRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vFormDsl.FormInputRange#getMin()
	 * @see #getFormInputRange()
	 * @generated
	 */
	EAttribute getFormInputRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.FormInputRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vFormDsl.FormInputRange#getMax()
	 * @see #getFormInputRange()
	 * @generated
	 */
	EAttribute getFormInputRange_Max();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInputSelect <em>Form Input Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input Select</em>'.
	 * @see vFormDsl.FormInputSelect
	 * @generated
	 */
	EClass getFormInputSelect();

	/**
	 * Returns the meta object for the containment reference '{@link vFormDsl.FormInputSelect#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see vFormDsl.FormInputSelect#getOption()
	 * @see #getFormInputSelect()
	 * @generated
	 */
	EReference getFormInputSelect_Option();

	/**
	 * Returns the meta object for class '{@link vFormDsl.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see vFormDsl.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link vFormDsl.DataOption <em>Data Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Option</em>'.
	 * @see vFormDsl.DataOption
	 * @generated
	 */
	EClass getDataOption();

	/**
	 * Returns the meta object for the containment reference list '{@link vFormDsl.DataOption#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see vFormDsl.DataOption#getData()
	 * @see #getDataOption()
	 * @generated
	 */
	EReference getDataOption_Data();

	/**
	 * Returns the meta object for class '{@link vFormDsl.EnumOption <em>Enum Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Option</em>'.
	 * @see vFormDsl.EnumOption
	 * @generated
	 */
	EClass getEnumOption();

	/**
	 * Returns the meta object for the containment reference list '{@link vFormDsl.EnumOption#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see vFormDsl.EnumOption#getData()
	 * @see #getEnumOption()
	 * @generated
	 */
	EReference getEnumOption_Data();

	/**
	 * Returns the meta object for class '{@link vFormDsl.NumberOption <em>Number Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Option</em>'.
	 * @see vFormDsl.NumberOption
	 * @generated
	 */
	EClass getNumberOption();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.NumberOption#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vFormDsl.NumberOption#getMin()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Min();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.NumberOption#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vFormDsl.NumberOption#getMax()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Max();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.NumberOption#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see vFormDsl.NumberOption#getRange()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Range();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInputSearch <em>Form Input Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input Search</em>'.
	 * @see vFormDsl.FormInputSearch
	 * @generated
	 */
	EClass getFormInputSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link vFormDsl.FormInputSearch#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see vFormDsl.FormInputSearch#getData()
	 * @see #getFormInputSearch()
	 * @generated
	 */
	EReference getFormInputSearch_Data();

	/**
	 * Returns the meta object for class '{@link vFormDsl.OptionItem <em>Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Item</em>'.
	 * @see vFormDsl.OptionItem
	 * @generated
	 */
	EClass getOptionItem();

	/**
	 * Returns the meta object for class '{@link vFormDsl.StringOptionItem <em>String Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Option Item</em>'.
	 * @see vFormDsl.StringOptionItem
	 * @generated
	 */
	EClass getStringOptionItem();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.StringOptionItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vFormDsl.StringOptionItem#getValue()
	 * @see #getStringOptionItem()
	 * @generated
	 */
	EAttribute getStringOptionItem_Value();

	/**
	 * Returns the meta object for class '{@link vFormDsl.IntOptionItem <em>Int Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Option Item</em>'.
	 * @see vFormDsl.IntOptionItem
	 * @generated
	 */
	EClass getIntOptionItem();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.IntOptionItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vFormDsl.IntOptionItem#getValue()
	 * @see #getIntOptionItem()
	 * @generated
	 */
	EAttribute getIntOptionItem_Value();

	/**
	 * Returns the meta object for class '{@link vFormDsl.DataOptionItem <em>Data Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Option Item</em>'.
	 * @see vFormDsl.DataOptionItem
	 * @generated
	 */
	EClass getDataOptionItem();

	/**
	 * Returns the meta object for the containment reference '{@link vFormDsl.DataOptionItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see vFormDsl.DataOptionItem#getValue()
	 * @see #getDataOptionItem()
	 * @generated
	 */
	EReference getDataOptionItem_Value();

	/**
	 * Returns the meta object for class '{@link vFormDsl.FormInputGroup <em>Form Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input Group</em>'.
	 * @see vFormDsl.FormInputGroup
	 * @generated
	 */
	EClass getFormInputGroup();

	/**
	 * Returns the meta object for the reference '{@link vFormDsl.FormInputGroup#getGroupInputs <em>Group Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Inputs</em>'.
	 * @see vFormDsl.FormInputGroup#getGroupInputs()
	 * @see #getFormInputGroup()
	 * @generated
	 */
	EReference getFormInputGroup_GroupInputs();

	/**
	 * Returns the meta object for class '{@link vFormDsl.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see vFormDsl.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see vFormDsl.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for class '{@link vFormDsl.StringData <em>String Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Data</em>'.
	 * @see vFormDsl.StringData
	 * @generated
	 */
	EClass getStringData();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.StringData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vFormDsl.StringData#getValue()
	 * @see #getStringData()
	 * @generated
	 */
	EAttribute getStringData_Value();

	/**
	 * Returns the meta object for class '{@link vFormDsl.IntData <em>Int Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Data</em>'.
	 * @see vFormDsl.IntData
	 * @generated
	 */
	EClass getIntData();

	/**
	 * Returns the meta object for the attribute '{@link vFormDsl.IntData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vFormDsl.IntData#getValue()
	 * @see #getIntData()
	 * @generated
	 */
	EAttribute getIntData_Value();

	/**
	 * Returns the meta object for enum '{@link vFormDsl.BasicInputType <em>Basic Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Input Type</em>'.
	 * @see vFormDsl.BasicInputType
	 * @generated
	 */
	EEnum getBasicInputType();

	/**
	 * Returns the meta object for enum '{@link vFormDsl.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see vFormDsl.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VFormDslFactory getVFormDslFactory();

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
		 * The meta object literal for the '{@link vFormDsl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.ModelImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Form Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FORM_LAYOUT = eINSTANCE.getModel_FormLayout();

		/**
		 * The meta object literal for the '<em><b>Form Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FORM_INPUT = eINSTANCE.getModel_FormInput();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormLayoutImpl <em>Form Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormLayoutImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormLayout()
		 * @generated
		 */
		EClass FORM_LAYOUT = eINSTANCE.getFormLayout();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LAYOUT__LAYOUT = eINSTANCE.getFormLayout_Layout();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputImpl <em>Form Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInput()
		 * @generated
		 */
		EClass FORM_INPUT = eINSTANCE.getFormInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_INPUT__NAME = eINSTANCE.getFormInput_Name();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputBasicImpl <em>Form Input Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputBasicImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputBasic()
		 * @generated
		 */
		EClass FORM_INPUT_BASIC = eINSTANCE.getFormInputBasic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_INPUT_BASIC__TYPE = eINSTANCE.getFormInputBasic_Type();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputRangeImpl <em>Form Input Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputRangeImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputRange()
		 * @generated
		 */
		EClass FORM_INPUT_RANGE = eINSTANCE.getFormInputRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_INPUT_RANGE__MIN = eINSTANCE.getFormInputRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_INPUT_RANGE__MAX = eINSTANCE.getFormInputRange_Max();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputSelectImpl <em>Form Input Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputSelectImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputSelect()
		 * @generated
		 */
		EClass FORM_INPUT_SELECT = eINSTANCE.getFormInputSelect();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT_SELECT__OPTION = eINSTANCE.getFormInputSelect_Option();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.OptionImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.DataOptionImpl <em>Data Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.DataOptionImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getDataOption()
		 * @generated
		 */
		EClass DATA_OPTION = eINSTANCE.getDataOption();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPTION__DATA = eINSTANCE.getDataOption_Data();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.EnumOptionImpl <em>Enum Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.EnumOptionImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getEnumOption()
		 * @generated
		 */
		EClass ENUM_OPTION = eINSTANCE.getEnumOption();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_OPTION__DATA = eINSTANCE.getEnumOption_Data();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.NumberOptionImpl <em>Number Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.NumberOptionImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getNumberOption()
		 * @generated
		 */
		EClass NUMBER_OPTION = eINSTANCE.getNumberOption();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_OPTION__MIN = eINSTANCE.getNumberOption_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_OPTION__MAX = eINSTANCE.getNumberOption_Max();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_OPTION__RANGE = eINSTANCE.getNumberOption_Range();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputSearchImpl <em>Form Input Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputSearchImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputSearch()
		 * @generated
		 */
		EClass FORM_INPUT_SEARCH = eINSTANCE.getFormInputSearch();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT_SEARCH__DATA = eINSTANCE.getFormInputSearch_Data();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.OptionItemImpl <em>Option Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.OptionItemImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getOptionItem()
		 * @generated
		 */
		EClass OPTION_ITEM = eINSTANCE.getOptionItem();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.StringOptionItemImpl <em>String Option Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.StringOptionItemImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getStringOptionItem()
		 * @generated
		 */
		EClass STRING_OPTION_ITEM = eINSTANCE.getStringOptionItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_OPTION_ITEM__VALUE = eINSTANCE.getStringOptionItem_Value();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.IntOptionItemImpl <em>Int Option Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.IntOptionItemImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getIntOptionItem()
		 * @generated
		 */
		EClass INT_OPTION_ITEM = eINSTANCE.getIntOptionItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_OPTION_ITEM__VALUE = eINSTANCE.getIntOptionItem_Value();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.DataOptionItemImpl <em>Data Option Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.DataOptionItemImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getDataOptionItem()
		 * @generated
		 */
		EClass DATA_OPTION_ITEM = eINSTANCE.getDataOptionItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPTION_ITEM__VALUE = eINSTANCE.getDataOptionItem_Value();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.FormInputGroupImpl <em>Form Input Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.FormInputGroupImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getFormInputGroup()
		 * @generated
		 */
		EClass FORM_INPUT_GROUP = eINSTANCE.getFormInputGroup();

		/**
		 * The meta object literal for the '<em><b>Group Inputs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT_GROUP__GROUP_INPUTS = eINSTANCE.getFormInputGroup_GroupInputs();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.DataImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LABEL = eINSTANCE.getData_Label();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.StringDataImpl <em>String Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.StringDataImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getStringData()
		 * @generated
		 */
		EClass STRING_DATA = eINSTANCE.getStringData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_DATA__VALUE = eINSTANCE.getStringData_Value();

		/**
		 * The meta object literal for the '{@link vFormDsl.impl.IntDataImpl <em>Int Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.impl.IntDataImpl
		 * @see vFormDsl.impl.VFormDslPackageImpl#getIntData()
		 * @generated
		 */
		EClass INT_DATA = eINSTANCE.getIntData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_DATA__VALUE = eINSTANCE.getIntData_Value();

		/**
		 * The meta object literal for the '{@link vFormDsl.BasicInputType <em>Basic Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.BasicInputType
		 * @see vFormDsl.impl.VFormDslPackageImpl#getBasicInputType()
		 * @generated
		 */
		EEnum BASIC_INPUT_TYPE = eINSTANCE.getBasicInputType();

		/**
		 * The meta object literal for the '{@link vFormDsl.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vFormDsl.Layout
		 * @see vFormDsl.impl.VFormDslPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //VFormDslPackage
