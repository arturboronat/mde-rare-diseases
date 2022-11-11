/**
 */
package dataDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.StatsDataType#getName <em>Name</em>}</li>
 *   <li>{@link dataDescription.StatsDataType#getFrequencyTable <em>Frequency Table</em>}</li>
 * </ul>
 *
 * @see dataDescription.DataDescriptionPackage#getStatsDataType()
 * @model abstract="true"
 * @generated
 */
public interface StatsDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataDescription.DataDescriptionPackage#getStatsDataType_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataDescription.StatsDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Frequency Table</b></em>' containment reference list.
	 * The list contents are of type {@link dataDescription.FrequencyTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Table</em>' containment reference list.
	 * @see dataDescription.DataDescriptionPackage#getStatsDataType_FrequencyTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrequencyTable> getFrequencyTable();

} // StatsDataType
