/**
 */
package vformDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vformDSL.Checkbox;
import vformDSL.Dat;
import vformDSL.Data;
import vformDSL.DataOption;
import vformDSL.EnumOption;
import vformDSL.FormInput;
import vformDSL.FormLayout;
import vformDSL.Group;
import vformDSL.Layout;
import vformDSL.Model;
import vformDSL.NumberOption;
import vformDSL.Range;
import vformDSL.Search;
import vformDSL.Select;
import vformDSL.Text;
import vformDSL.VformDSLFactory;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VformDSLFactoryImpl extends EFactoryImpl implements VformDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VformDSLFactory init() {
		try {
			VformDSLFactory theVformDSLFactory = (VformDSLFactory)EPackage.Registry.INSTANCE.getEFactory(VformDSLPackage.eNS_URI);
			if (theVformDSLFactory != null) {
				return theVformDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VformDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VformDSLFactoryImpl() {
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
			case VformDSLPackage.MODEL: return createModel();
			case VformDSLPackage.FORM_LAYOUT: return createFormLayout();
			case VformDSLPackage.FORM_INPUT: return createFormInput();
			case VformDSLPackage.TEXT: return createText();
			case VformDSLPackage.CHECKBOX: return createCheckbox();
			case VformDSLPackage.NUMBER: return createNumber();
			case VformDSLPackage.DAT: return createDat();
			case VformDSLPackage.RANGE: return createRange();
			case VformDSLPackage.SELECT: return createSelect();
			case VformDSLPackage.SEARCH: return createSearch();
			case VformDSLPackage.GROUP: return createGroup();
			case VformDSLPackage.DATA_OPTION: return createDataOption();
			case VformDSLPackage.ENUM_OPTION: return createEnumOption();
			case VformDSLPackage.NUMBER_OPTION: return createNumberOption();
			case VformDSLPackage.DATA: return createData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VformDSLPackage.LAYOUT:
				return createLayoutFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VformDSLPackage.LAYOUT:
				return convertLayoutToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLayout createFormLayout() {
		FormLayoutImpl formLayout = new FormLayoutImpl();
		return formLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormInput createFormInput() {
		FormInputImpl formInput = new FormInputImpl();
		return formInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vformDSL.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dat createDat() {
		DatImpl dat = new DatImpl();
		return dat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOption createDataOption() {
		DataOptionImpl dataOption = new DataOptionImpl();
		return dataOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOption createEnumOption() {
		EnumOptionImpl enumOption = new EnumOptionImpl();
		return enumOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOption createNumberOption() {
		NumberOptionImpl numberOption = new NumberOptionImpl();
		return numberOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayoutFromString(EDataType eDataType, String initialValue) {
		Layout result = Layout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VformDSLPackage getVformDSLPackage() {
		return (VformDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VformDSLPackage getPackage() {
		return VformDSLPackage.eINSTANCE;
	}

} //VformDSLFactoryImpl
