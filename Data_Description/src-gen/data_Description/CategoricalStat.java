/**
 */
package data_Description;

import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorical Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data_Description.CategoricalStat#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link data_Description.CategoricalStat#getFrequencyTable <em>Frequency Table</em>}</li>
 * </ul>
 *
 * @see data_Description.Data_DescriptionPackage#getCategoricalStat()
 * @model
 * @generated
 */
public interface CategoricalStat extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Id</em>' attribute.
	 * @see #setColumnId(String)
	 * @see data_Description.Data_DescriptionPackage#getCategoricalStat_ColumnId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getColumnId();

	/**
	 * Sets the value of the '{@link data_Description.CategoricalStat#getColumnId <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Id</em>' attribute.
	 * @see #getColumnId()
	 * @generated
	 */
	void setColumnId(String value);

	/**
	 * Returns the value of the '<em><b>Frequency Table</b></em>' reference list.
	 * The list contents are of type {@link data_Description.freqTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Table</em>' reference list.
	 * @see data_Description.Data_DescriptionPackage#getCategoricalStat_FrequencyTable()
	 * @model
	 * @generated
	 */
	ArrayList<freqTable> getFrequencyTable();

	//EDITED
	void setFrequencyTable(ArrayList<String> data);
	//EDITED

} // CategoricalStat
