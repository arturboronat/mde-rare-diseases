/**
 */
package cafev.vform.uiProps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cafev.vform.uiProps.UiPropsPackage
 * @generated
 */
public interface UiPropsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPropsFactory eINSTANCE = cafev.vform.uiProps.impl.UiPropsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Numerical Props</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Props</em>'.
	 * @generated
	 */
	NumericalProps createNumericalProps();

	/**
	 * Returns a new object of class '<em>Categorical Props</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorical Props</em>'.
	 * @generated
	 */
	CategoricalProps createCategoricalProps();

	/**
	 * Returns a new object of class '<em>Props Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Props Model</em>'.
	 * @generated
	 */
	PropsModel createPropsModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiPropsPackage getUiPropsPackage();

} //UiPropsFactory
