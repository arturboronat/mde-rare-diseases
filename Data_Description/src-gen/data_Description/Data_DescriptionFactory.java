/**
 */
package data_Description;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see data_Description.Data_DescriptionPackage
 * @generated
 */
public interface Data_DescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data_DescriptionFactory eINSTANCE = data_Description.impl.Data_DescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Categorical Stat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorical Stat</em>'.
	 * @generated
	 */
	CategoricalStat createCategoricalStat();

	/**
	 * Returns a new object of class '<em>Numerical Stat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Stat</em>'.
	 * @generated
	 */
	NumericalStat createNumericalStat();

	/**
	 * Returns a new object of class '<em>freq Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>freq Table</em>'.
	 * @generated
	 */
	freqTable createfreqTable();

	/**
	 * Returns a new object of class '<em>Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Description</em>'.
	 * @generated
	 */
	DataDescription createDataDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Data_DescriptionPackage getData_DescriptionPackage();

} //Data_DescriptionFactory
