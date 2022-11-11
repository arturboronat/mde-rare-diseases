/**
 */
package dataDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataDescription.DataDescriptionPackage
 * @generated
 */
public interface DataDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataDescriptionFactory eINSTANCE = dataDescription.impl.DataDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stats Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stats Data Model</em>'.
	 * @generated
	 */
	StatsDataModel createStatsDataModel();

	/**
	 * Returns a new object of class '<em>Categorical Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorical Type</em>'.
	 * @generated
	 */
	CategoricalType createCategoricalType();

	/**
	 * Returns a new object of class '<em>Numerical Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Type</em>'.
	 * @generated
	 */
	NumericalType createNumericalType();

	/**
	 * Returns a new object of class '<em>Frequency Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency Table</em>'.
	 * @generated
	 */
	FrequencyTable createFrequencyTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataDescriptionPackage getDataDescriptionPackage();

} //DataDescriptionFactory
