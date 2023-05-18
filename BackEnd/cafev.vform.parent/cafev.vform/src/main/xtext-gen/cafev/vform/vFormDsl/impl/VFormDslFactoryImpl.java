/**
 * generated by Xtext 2.28.0
 */
package cafev.vform.vFormDsl.impl;

import cafev.vform.vFormDsl.*;

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
public class VFormDslFactoryImpl extends EFactoryImpl implements VFormDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VFormDslFactory init()
  {
    try
    {
      VFormDslFactory theVFormDslFactory = (VFormDslFactory)EPackage.Registry.INSTANCE.getEFactory(VFormDslPackage.eNS_URI);
      if (theVFormDslFactory != null)
      {
        return theVFormDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VFormDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VFormDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VFormDslPackage.MODEL: return createModel();
      case VFormDslPackage.FORM_LAYOUT: return createFormLayout();
      case VFormDslPackage.FORM_INPUT: return createFormInput();
      case VFormDslPackage.FORM_INPUT_BASIC: return createFormInputBasic();
      case VFormDslPackage.FORM_INPUT_RANGE: return createFormInputRange();
      case VFormDslPackage.FORM_INPUT_SELECT: return createFormInputSelect();
      case VFormDslPackage.OPTION: return createOption();
      case VFormDslPackage.DATA_OPTION: return createDataOption();
      case VFormDslPackage.ENUM_OPTION: return createEnumOption();
      case VFormDslPackage.NUMBER_OPTION: return createNumberOption();
      case VFormDslPackage.FORM_INPUT_SEARCH: return createFormInputSearch();
      case VFormDslPackage.OPTION_ITEM: return createOptionItem();
      case VFormDslPackage.STRING_OPTION_ITEM: return createStringOptionItem();
      case VFormDslPackage.INT_OPTION_ITEM: return createIntOptionItem();
      case VFormDslPackage.DATA_OPTION_ITEM: return createDataOptionItem();
      case VFormDslPackage.FORM_INPUT_GROUP: return createFormInputGroup();
      case VFormDslPackage.DATA: return createData();
      case VFormDslPackage.STRING_DATA: return createStringData();
      case VFormDslPackage.INT_DATA: return createIntData();
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
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormLayout createFormLayout()
  {
    FormLayoutImpl formLayout = new FormLayoutImpl();
    return formLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInput createFormInput()
  {
    FormInputImpl formInput = new FormInputImpl();
    return formInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInputBasic createFormInputBasic()
  {
    FormInputBasicImpl formInputBasic = new FormInputBasicImpl();
    return formInputBasic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInputRange createFormInputRange()
  {
    FormInputRangeImpl formInputRange = new FormInputRangeImpl();
    return formInputRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInputSelect createFormInputSelect()
  {
    FormInputSelectImpl formInputSelect = new FormInputSelectImpl();
    return formInputSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataOption createDataOption()
  {
    DataOptionImpl dataOption = new DataOptionImpl();
    return dataOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumOption createEnumOption()
  {
    EnumOptionImpl enumOption = new EnumOptionImpl();
    return enumOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberOption createNumberOption()
  {
    NumberOptionImpl numberOption = new NumberOptionImpl();
    return numberOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInputSearch createFormInputSearch()
  {
    FormInputSearchImpl formInputSearch = new FormInputSearchImpl();
    return formInputSearch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OptionItem createOptionItem()
  {
    OptionItemImpl optionItem = new OptionItemImpl();
    return optionItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringOptionItem createStringOptionItem()
  {
    StringOptionItemImpl stringOptionItem = new StringOptionItemImpl();
    return stringOptionItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntOptionItem createIntOptionItem()
  {
    IntOptionItemImpl intOptionItem = new IntOptionItemImpl();
    return intOptionItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataOptionItem createDataOptionItem()
  {
    DataOptionItemImpl dataOptionItem = new DataOptionItemImpl();
    return dataOptionItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormInputGroup createFormInputGroup()
  {
    FormInputGroupImpl formInputGroup = new FormInputGroupImpl();
    return formInputGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringData createStringData()
  {
    StringDataImpl stringData = new StringDataImpl();
    return stringData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntData createIntData()
  {
    IntDataImpl intData = new IntDataImpl();
    return intData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VFormDslPackage getVFormDslPackage()
  {
    return (VFormDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VFormDslPackage getPackage()
  {
    return VFormDslPackage.eINSTANCE;
  }

} //VFormDslFactoryImpl
