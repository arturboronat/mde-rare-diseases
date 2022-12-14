/**
 */
package dataDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.StatsDataModel#getName <em>Name</em>}</li>
 *   <li>{@link dataDescription.StatsDataModel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see dataDescription.DataDescriptionPackage#getStatsDataModel()
 * @model
 * @generated
 */
public interface StatsDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataDescription.DataDescriptionPackage#getStatsDataModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataDescription.StatsDataModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link dataDescription.StatsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see dataDescription.DataDescriptionPackage#getStatsDataModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatsDataType> getTypes();

} // StatsDataModel
