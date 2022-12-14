/**
 */
package vFormDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import vFormDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vFormDsl.VFormDslPackage
 * @generated
 */
public class VFormDslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VFormDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VFormDslSwitch() {
		if (modelPackage == null) {
			modelPackage = VFormDslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VFormDslPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_LAYOUT: {
				FormLayout formLayout = (FormLayout)theEObject;
				T result = caseFormLayout(formLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT: {
				FormInput formInput = (FormInput)theEObject;
				T result = caseFormInput(formInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT_BASIC: {
				FormInputBasic formInputBasic = (FormInputBasic)theEObject;
				T result = caseFormInputBasic(formInputBasic);
				if (result == null) result = caseFormInput(formInputBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT_RANGE: {
				FormInputRange formInputRange = (FormInputRange)theEObject;
				T result = caseFormInputRange(formInputRange);
				if (result == null) result = caseFormInput(formInputRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT_SELECT: {
				FormInputSelect formInputSelect = (FormInputSelect)theEObject;
				T result = caseFormInputSelect(formInputSelect);
				if (result == null) result = caseFormInput(formInputSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.DATA_OPTION: {
				DataOption dataOption = (DataOption)theEObject;
				T result = caseDataOption(dataOption);
				if (result == null) result = caseOption(dataOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.ENUM_OPTION: {
				EnumOption enumOption = (EnumOption)theEObject;
				T result = caseEnumOption(enumOption);
				if (result == null) result = caseOption(enumOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.NUMBER_OPTION: {
				NumberOption numberOption = (NumberOption)theEObject;
				T result = caseNumberOption(numberOption);
				if (result == null) result = caseOption(numberOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT_SEARCH: {
				FormInputSearch formInputSearch = (FormInputSearch)theEObject;
				T result = caseFormInputSearch(formInputSearch);
				if (result == null) result = caseFormInput(formInputSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.OPTION_ITEM: {
				OptionItem optionItem = (OptionItem)theEObject;
				T result = caseOptionItem(optionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.STRING_OPTION_ITEM: {
				StringOptionItem stringOptionItem = (StringOptionItem)theEObject;
				T result = caseStringOptionItem(stringOptionItem);
				if (result == null) result = caseOptionItem(stringOptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.INT_OPTION_ITEM: {
				IntOptionItem intOptionItem = (IntOptionItem)theEObject;
				T result = caseIntOptionItem(intOptionItem);
				if (result == null) result = caseOptionItem(intOptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.DATA_OPTION_ITEM: {
				DataOptionItem dataOptionItem = (DataOptionItem)theEObject;
				T result = caseDataOptionItem(dataOptionItem);
				if (result == null) result = caseOptionItem(dataOptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.FORM_INPUT_GROUP: {
				FormInputGroup formInputGroup = (FormInputGroup)theEObject;
				T result = caseFormInputGroup(formInputGroup);
				if (result == null) result = caseFormInput(formInputGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.STRING_DATA: {
				StringData stringData = (StringData)theEObject;
				T result = caseStringData(stringData);
				if (result == null) result = caseData(stringData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VFormDslPackage.INT_DATA: {
				IntData intData = (IntData)theEObject;
				T result = caseIntData(intData);
				if (result == null) result = caseData(intData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLayout(FormLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInput(FormInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInputBasic(FormInputBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInputRange(FormInputRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInputSelect(FormInputSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOption(DataOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumOption(EnumOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOption(NumberOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInputSearch(FormInputSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionItem(OptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Option Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOptionItem(StringOptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Option Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOptionItem(IntOptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Option Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Option Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOptionItem(DataOptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Input Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormInputGroup(FormInputGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringData(StringData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntData(IntData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VFormDslSwitch
