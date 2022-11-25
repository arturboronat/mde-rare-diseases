/**
 */
package vFormDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vFormDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vFormDsl.VFormDslPackage
 * @generated
 */
public class VFormDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VFormDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VFormDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VFormDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VFormDslSwitch<Adapter> modelSwitch =
		new VFormDslSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseFormLayout(FormLayout object) {
				return createFormLayoutAdapter();
			}
			@Override
			public Adapter caseFormInput(FormInput object) {
				return createFormInputAdapter();
			}
			@Override
			public Adapter caseFormInputBasic(FormInputBasic object) {
				return createFormInputBasicAdapter();
			}
			@Override
			public Adapter caseFormInputRange(FormInputRange object) {
				return createFormInputRangeAdapter();
			}
			@Override
			public Adapter caseFormInputSelect(FormInputSelect object) {
				return createFormInputSelectAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseDataOption(DataOption object) {
				return createDataOptionAdapter();
			}
			@Override
			public Adapter caseEnumOption(EnumOption object) {
				return createEnumOptionAdapter();
			}
			@Override
			public Adapter caseNumberOption(NumberOption object) {
				return createNumberOptionAdapter();
			}
			@Override
			public Adapter caseFormInputSearch(FormInputSearch object) {
				return createFormInputSearchAdapter();
			}
			@Override
			public Adapter caseOptionItem(OptionItem object) {
				return createOptionItemAdapter();
			}
			@Override
			public Adapter caseStringOptionItem(StringOptionItem object) {
				return createStringOptionItemAdapter();
			}
			@Override
			public Adapter caseIntOptionItem(IntOptionItem object) {
				return createIntOptionItemAdapter();
			}
			@Override
			public Adapter caseDataOptionItem(DataOptionItem object) {
				return createDataOptionItemAdapter();
			}
			@Override
			public Adapter caseFormInputGroup(FormInputGroup object) {
				return createFormInputGroupAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseStringData(StringData object) {
				return createStringDataAdapter();
			}
			@Override
			public Adapter caseIntData(IntData object) {
				return createIntDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormLayout
	 * @generated
	 */
	public Adapter createFormLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInput <em>Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInput
	 * @generated
	 */
	public Adapter createFormInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInputBasic <em>Form Input Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInputBasic
	 * @generated
	 */
	public Adapter createFormInputBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInputRange <em>Form Input Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInputRange
	 * @generated
	 */
	public Adapter createFormInputRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInputSelect <em>Form Input Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInputSelect
	 * @generated
	 */
	public Adapter createFormInputSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.DataOption <em>Data Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.DataOption
	 * @generated
	 */
	public Adapter createDataOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.EnumOption <em>Enum Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.EnumOption
	 * @generated
	 */
	public Adapter createEnumOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.NumberOption <em>Number Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.NumberOption
	 * @generated
	 */
	public Adapter createNumberOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInputSearch <em>Form Input Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInputSearch
	 * @generated
	 */
	public Adapter createFormInputSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.OptionItem <em>Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.OptionItem
	 * @generated
	 */
	public Adapter createOptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.StringOptionItem <em>String Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.StringOptionItem
	 * @generated
	 */
	public Adapter createStringOptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.IntOptionItem <em>Int Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.IntOptionItem
	 * @generated
	 */
	public Adapter createIntOptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.DataOptionItem <em>Data Option Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.DataOptionItem
	 * @generated
	 */
	public Adapter createDataOptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.FormInputGroup <em>Form Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.FormInputGroup
	 * @generated
	 */
	public Adapter createFormInputGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.StringData <em>String Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.StringData
	 * @generated
	 */
	public Adapter createStringDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vFormDsl.IntData <em>Int Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vFormDsl.IntData
	 * @generated
	 */
	public Adapter createIntDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VFormDslAdapterFactory
