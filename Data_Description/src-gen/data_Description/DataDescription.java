/**
 */
package data_Description;

import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data_Description.DataDescription#getNumericalstat <em>Numericalstat</em>}</li>
 *   <li>{@link data_Description.DataDescription#getCategoricalstat <em>Categoricalstat</em>}</li>
 *   <li>{@link data_Description.DataDescription#getDataName <em>Data Name</em>}</li>
 * </ul>
 *
 * @see data_Description.Data_DescriptionPackage#getDataDescription()
 * @model
 * @generated
 */
public interface DataDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Numericalstat</b></em>' containment reference list.
	 * The list contents are of type {@link data_Description.NumericalStat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numericalstat</em>' containment reference list.
	 * @see data_Description.Data_DescriptionPackage#getDataDescription_Numericalstat()
	 * @model containment="true"
	 * @generated
	 */
	ArrayList<NumericalStat> getNumericalstat();

	//EDITED
	void setNumericalstat(HashMap<String, ArrayList<String>> data);

	//EDITED
	
	ArrayList<CategoricalStat> getCategoricalstat();

	//EDITED
	
	

	void  setCategoricalstat(HashMap<String, ArrayList<String>> data);

	//EDITED

	String getDataName();

	/**
	 * Sets the value of the '{@link data_Description.DataDescription#getDataName <em>Data Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Name</em>' attribute.
	 * @see #getDataName()
	 * @generated
	 */
	void setDataName(String value);

} // DataDescription
