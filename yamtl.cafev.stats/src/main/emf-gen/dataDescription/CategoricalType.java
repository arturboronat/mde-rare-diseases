/**
 */
package dataDescription;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorical Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.CategoricalType#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see dataDescription.DataDescriptionPackage#getCategoricalType()
 * @model
 * @generated
 */
public interface CategoricalType extends StatsDataType {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(EDataType)
	 * @see dataDescription.DataDescriptionPackage#getCategoricalType_DataType()
	 * @model required="true"
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Sets the value of the '{@link dataDescription.CategoricalType#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EDataType value);

} // CategoricalType
