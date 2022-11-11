/**
 */
package vformDSL;

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
 * @see vformDSL.VformDSLFactory
 * @model kind="package"
 * @generated
 */
public interface VformDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vformDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dsl.cafeV/vforms/VformDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vformDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VformDSLPackage eINSTANCE = vformDSL.impl.VformDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link vformDSL.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.ModelImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getModel()
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
	 * The meta object id for the '{@link vformDSL.impl.FormLayoutImpl <em>Form Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.FormLayoutImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getFormLayout()
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
	 * The meta object id for the '{@link vformDSL.impl.FormInputImpl <em>Form Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.FormInputImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getFormInput()
	 * @generated
	 */
	int FORM_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__CHECKBOX = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Dat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__DAT = 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__RANGE = 4;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__SELECT = 5;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__SEARCH = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT__GROUP = 7;

	/**
	 * The number of structural features of the '<em>Form Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Form Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.TextImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 3;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__INPUT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.CheckboxImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 4;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__INPUT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.NumberImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__INPUT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.DatImpl <em>Dat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.DatImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getDat()
	 * @generated
	 */
	int DAT = 6;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAT__INPUT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Dat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.RangeImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 7;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__INPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = 2;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.SelectImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 8;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__INPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DATA_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Enum Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ENUM_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Number Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__NUMBER_OPTION = 3;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.SearchImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 9;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__INPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>String Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__STRING_DATA = 1;

	/**
	 * The feature id for the '<em><b>Number Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__NUMBER_DATA = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__DATA = 3;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.GroupImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 10;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Group Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.DataOptionImpl <em>Data Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.DataOptionImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getDataOption()
	 * @generated
	 */
	int DATA_OPTION = 11;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION__DATA = 0;

	/**
	 * The number of structural features of the '<em>Data Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.EnumOptionImpl <em>Enum Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.EnumOptionImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getEnumOption()
	 * @generated
	 */
	int ENUM_OPTION = 12;

	/**
	 * The feature id for the '<em><b>String Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION__STRING_DATA = 0;

	/**
	 * The feature id for the '<em><b>Number Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION__NUMBER_DATA = 1;

	/**
	 * The number of structural features of the '<em>Enum Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.NumberOptionImpl <em>Number Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.NumberOptionImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getNumberOption()
	 * @generated
	 */
	int NUMBER_OPTION = 13;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__MAX = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION__RANGE = 2;

	/**
	 * The number of structural features of the '<em>Number Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Number Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.impl.DataImpl
	 * @see vformDSL.impl.VformDSLPackageImpl#getData()
	 * @generated
	 */
	int DATA = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__STR_VAL = 1;

	/**
	 * The feature id for the '<em><b>Int Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INT_VAL = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vformDSL.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vformDSL.Layout
	 * @see vformDSL.impl.VformDSLPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 15;


	/**
	 * Returns the meta object for class '{@link vformDSL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see vformDSL.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link vformDSL.Model#getFormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form Layout</em>'.
	 * @see vformDSL.Model#getFormLayout()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_FormLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.Model#getFormInput <em>Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Input</em>'.
	 * @see vformDSL.Model#getFormInput()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_FormInput();

	/**
	 * Returns the meta object for class '{@link vformDSL.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Layout</em>'.
	 * @see vformDSL.FormLayout
	 * @generated
	 */
	EClass getFormLayout();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.FormLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see vformDSL.FormLayout#getLayout()
	 * @see #getFormLayout()
	 * @generated
	 */
	EAttribute getFormLayout_Layout();

	/**
	 * Returns the meta object for class '{@link vformDSL.FormInput <em>Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Input</em>'.
	 * @see vformDSL.FormInput
	 * @generated
	 */
	EClass getFormInput();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see vformDSL.FormInput#getText()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checkbox</em>'.
	 * @see vformDSL.FormInput#getCheckbox()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Checkbox();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number</em>'.
	 * @see vformDSL.FormInput#getNumber()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getDat <em>Dat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dat</em>'.
	 * @see vformDSL.FormInput#getDat()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Dat();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see vformDSL.FormInput#getRange()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see vformDSL.FormInput#getSelect()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Select();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Search</em>'.
	 * @see vformDSL.FormInput#getSearch()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Search();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.FormInput#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see vformDSL.FormInput#getGroup()
	 * @see #getFormInput()
	 * @generated
	 */
	EReference getFormInput_Group();

	/**
	 * Returns the meta object for class '{@link vformDSL.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see vformDSL.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Text#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Text#getInputName()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_InputName();

	/**
	 * Returns the meta object for class '{@link vformDSL.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see vformDSL.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Checkbox#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Checkbox#getInputName()
	 * @see #getCheckbox()
	 * @generated
	 */
	EAttribute getCheckbox_InputName();

	/**
	 * Returns the meta object for class '{@link vformDSL.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see vformDSL.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Number#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Number#getInputName()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_InputName();

	/**
	 * Returns the meta object for class '{@link vformDSL.Dat <em>Dat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dat</em>'.
	 * @see vformDSL.Dat
	 * @generated
	 */
	EClass getDat();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Dat#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Dat#getInputName()
	 * @see #getDat()
	 * @generated
	 */
	EAttribute getDat_InputName();

	/**
	 * Returns the meta object for class '{@link vformDSL.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see vformDSL.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Range#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Range#getInputName()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_InputName();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Range#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vformDSL.Range#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Range#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vformDSL.Range#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for class '{@link vformDSL.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see vformDSL.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Select#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Select#getInputName()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_InputName();

	/**
	 * Returns the meta object for the containment reference '{@link vformDSL.Select#getDataOption <em>Data Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Option</em>'.
	 * @see vformDSL.Select#getDataOption()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_DataOption();

	/**
	 * Returns the meta object for the containment reference '{@link vformDSL.Select#getEnumOption <em>Enum Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Option</em>'.
	 * @see vformDSL.Select#getEnumOption()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_EnumOption();

	/**
	 * Returns the meta object for the containment reference '{@link vformDSL.Select#getNumberOption <em>Number Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Option</em>'.
	 * @see vformDSL.Select#getNumberOption()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_NumberOption();

	/**
	 * Returns the meta object for class '{@link vformDSL.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see vformDSL.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Search#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Search#getInputName()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_InputName();

	/**
	 * Returns the meta object for the attribute list '{@link vformDSL.Search#getStringData <em>String Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Data</em>'.
	 * @see vformDSL.Search#getStringData()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_StringData();

	/**
	 * Returns the meta object for the attribute list '{@link vformDSL.Search#getNumberData <em>Number Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Number Data</em>'.
	 * @see vformDSL.Search#getNumberData()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_NumberData();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.Search#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see vformDSL.Search#getData()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Data();

	/**
	 * Returns the meta object for class '{@link vformDSL.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see vformDSL.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Group#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see vformDSL.Group#getInputName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_InputName();

	/**
	 * Returns the meta object for the reference list '{@link vformDSL.Group#getGroupInputs <em>Group Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group Inputs</em>'.
	 * @see vformDSL.Group#getGroupInputs()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_GroupInputs();

	/**
	 * Returns the meta object for class '{@link vformDSL.DataOption <em>Data Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Option</em>'.
	 * @see vformDSL.DataOption
	 * @generated
	 */
	EClass getDataOption();

	/**
	 * Returns the meta object for the containment reference list '{@link vformDSL.DataOption#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see vformDSL.DataOption#getData()
	 * @see #getDataOption()
	 * @generated
	 */
	EReference getDataOption_Data();

	/**
	 * Returns the meta object for class '{@link vformDSL.EnumOption <em>Enum Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Option</em>'.
	 * @see vformDSL.EnumOption
	 * @generated
	 */
	EClass getEnumOption();

	/**
	 * Returns the meta object for the attribute list '{@link vformDSL.EnumOption#getStringData <em>String Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Data</em>'.
	 * @see vformDSL.EnumOption#getStringData()
	 * @see #getEnumOption()
	 * @generated
	 */
	EAttribute getEnumOption_StringData();

	/**
	 * Returns the meta object for the attribute list '{@link vformDSL.EnumOption#getNumberData <em>Number Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Number Data</em>'.
	 * @see vformDSL.EnumOption#getNumberData()
	 * @see #getEnumOption()
	 * @generated
	 */
	EAttribute getEnumOption_NumberData();

	/**
	 * Returns the meta object for class '{@link vformDSL.NumberOption <em>Number Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Option</em>'.
	 * @see vformDSL.NumberOption
	 * @generated
	 */
	EClass getNumberOption();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.NumberOption#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vformDSL.NumberOption#getMin()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Min();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.NumberOption#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vformDSL.NumberOption#getMax()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Max();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.NumberOption#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see vformDSL.NumberOption#getRange()
	 * @see #getNumberOption()
	 * @generated
	 */
	EAttribute getNumberOption_Range();

	/**
	 * Returns the meta object for class '{@link vformDSL.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see vformDSL.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see vformDSL.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Data#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Val</em>'.
	 * @see vformDSL.Data#getStrVal()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_StrVal();

	/**
	 * Returns the meta object for the attribute '{@link vformDSL.Data#getIntVal <em>Int Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Val</em>'.
	 * @see vformDSL.Data#getIntVal()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_IntVal();

	/**
	 * Returns the meta object for enum '{@link vformDSL.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see vformDSL.Layout
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
	VformDSLFactory getVformDSLFactory();

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
		 * The meta object literal for the '{@link vformDSL.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.ModelImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getModel()
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
		 * The meta object literal for the '{@link vformDSL.impl.FormLayoutImpl <em>Form Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.FormLayoutImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getFormLayout()
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
		 * The meta object literal for the '{@link vformDSL.impl.FormInputImpl <em>Form Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.FormInputImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getFormInput()
		 * @generated
		 */
		EClass FORM_INPUT = eINSTANCE.getFormInput();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__TEXT = eINSTANCE.getFormInput_Text();

		/**
		 * The meta object literal for the '<em><b>Checkbox</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__CHECKBOX = eINSTANCE.getFormInput_Checkbox();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__NUMBER = eINSTANCE.getFormInput_Number();

		/**
		 * The meta object literal for the '<em><b>Dat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__DAT = eINSTANCE.getFormInput_Dat();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__RANGE = eINSTANCE.getFormInput_Range();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__SELECT = eINSTANCE.getFormInput_Select();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__SEARCH = eINSTANCE.getFormInput_Search();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_INPUT__GROUP = eINSTANCE.getFormInput_Group();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.TextImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__INPUT_NAME = eINSTANCE.getText_InputName();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.CheckboxImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKBOX__INPUT_NAME = eINSTANCE.getCheckbox_InputName();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.NumberImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__INPUT_NAME = eINSTANCE.getNumber_InputName();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.DatImpl <em>Dat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.DatImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getDat()
		 * @generated
		 */
		EClass DAT = eINSTANCE.getDat();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAT__INPUT_NAME = eINSTANCE.getDat_InputName();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.RangeImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__INPUT_NAME = eINSTANCE.getRange_InputName();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.SelectImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__INPUT_NAME = eINSTANCE.getSelect_InputName();

		/**
		 * The meta object literal for the '<em><b>Data Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__DATA_OPTION = eINSTANCE.getSelect_DataOption();

		/**
		 * The meta object literal for the '<em><b>Enum Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__ENUM_OPTION = eINSTANCE.getSelect_EnumOption();

		/**
		 * The meta object literal for the '<em><b>Number Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__NUMBER_OPTION = eINSTANCE.getSelect_NumberOption();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.SearchImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__INPUT_NAME = eINSTANCE.getSearch_InputName();

		/**
		 * The meta object literal for the '<em><b>String Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__STRING_DATA = eINSTANCE.getSearch_StringData();

		/**
		 * The meta object literal for the '<em><b>Number Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__NUMBER_DATA = eINSTANCE.getSearch_NumberData();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__DATA = eINSTANCE.getSearch_Data();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.GroupImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__INPUT_NAME = eINSTANCE.getGroup_InputName();

		/**
		 * The meta object literal for the '<em><b>Group Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP_INPUTS = eINSTANCE.getGroup_GroupInputs();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.DataOptionImpl <em>Data Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.DataOptionImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getDataOption()
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
		 * The meta object literal for the '{@link vformDSL.impl.EnumOptionImpl <em>Enum Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.EnumOptionImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getEnumOption()
		 * @generated
		 */
		EClass ENUM_OPTION = eINSTANCE.getEnumOption();

		/**
		 * The meta object literal for the '<em><b>String Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_OPTION__STRING_DATA = eINSTANCE.getEnumOption_StringData();

		/**
		 * The meta object literal for the '<em><b>Number Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_OPTION__NUMBER_DATA = eINSTANCE.getEnumOption_NumberData();

		/**
		 * The meta object literal for the '{@link vformDSL.impl.NumberOptionImpl <em>Number Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.NumberOptionImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getNumberOption()
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
		 * The meta object literal for the '{@link vformDSL.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.impl.DataImpl
		 * @see vformDSL.impl.VformDSLPackageImpl#getData()
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
		 * The meta object literal for the '<em><b>Str Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__STR_VAL = eINSTANCE.getData_StrVal();

		/**
		 * The meta object literal for the '<em><b>Int Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__INT_VAL = eINSTANCE.getData_IntVal();

		/**
		 * The meta object literal for the '{@link vformDSL.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vformDSL.Layout
		 * @see vformDSL.impl.VformDSLPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

	}

} //VformDSLPackage