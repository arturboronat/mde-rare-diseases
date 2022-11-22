/**
 */
package cafev.vform.uiProps.util;

import cafev.vform.uiProps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cafev.vform.uiProps.UiPropsPackage
 * @generated
 */
public class UiPropsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPropsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPropsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiPropsPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiPropsSwitch<Adapter> modelSwitch = new UiPropsSwitch<Adapter>() {
		@Override
		public Adapter caseProps(Props object) {
			return createPropsAdapter();
		}

		@Override
		public Adapter caseNumericalProps(NumericalProps object) {
			return createNumericalPropsAdapter();
		}

		@Override
		public Adapter caseCategoricalProps(CategoricalProps object) {
			return createCategoricalPropsAdapter();
		}

		@Override
		public Adapter casePropsModel(PropsModel object) {
			return createPropsModelAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cafev.vform.uiProps.Props <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cafev.vform.uiProps.Props
	 * @generated
	 */
	public Adapter createPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cafev.vform.uiProps.NumericalProps <em>Numerical Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cafev.vform.uiProps.NumericalProps
	 * @generated
	 */
	public Adapter createNumericalPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cafev.vform.uiProps.CategoricalProps <em>Categorical Props</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cafev.vform.uiProps.CategoricalProps
	 * @generated
	 */
	public Adapter createCategoricalPropsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cafev.vform.uiProps.PropsModel <em>Props Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cafev.vform.uiProps.PropsModel
	 * @generated
	 */
	public Adapter createPropsModelAdapter() {
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

} //UiPropsAdapterFactory
