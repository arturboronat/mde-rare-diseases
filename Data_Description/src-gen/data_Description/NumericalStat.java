/**
 */
package data_Description;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numerical Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data_Description.NumericalStat#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link data_Description.NumericalStat#getMin <em>Min</em>}</li>
 *   <li>{@link data_Description.NumericalStat#getMax <em>Max</em>}</li>
 *   <li>{@link data_Description.NumericalStat#getMean <em>Mean</em>}</li>
 *   <li>{@link data_Description.NumericalStat#getStd <em>Std</em>}</li>
 *   <li>{@link data_Description.NumericalStat#getFreqencyTable <em>Freqency Table</em>}</li>
 * </ul>
 *
 * @see data_Description.Data_DescriptionPackage#getNumericalStat()
 * @model
 * @generated
 */
public interface NumericalStat extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Id</em>' attribute.
	 * @see #setColumnId(String)
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_ColumnId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getColumnId();

	/**
	 * Sets the value of the '{@link data_Description.NumericalStat#getColumnId <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Id</em>' attribute.
	 * @see #getColumnId()
	 * @generated
	 */
	void setColumnId(String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(float)
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_Min()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getMin();

	/**
	 * Sets the value of the '{@link data_Description.NumericalStat#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(float value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(float)
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_Max()
	 * @model required="true"
	 * @generated
	 */
	float getMax();

	/**
	 * Sets the value of the '{@link data_Description.NumericalStat#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(float value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(float)
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_Mean()
	 * @model required="true"
	 * @generated
	 */
	float getMean();

	/**
	 * Sets the value of the '{@link data_Description.NumericalStat#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(float value);

	/**
	 * Returns the value of the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std</em>' attribute.
	 * @see #setStd(float)
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_Std()
	 * @model required="true"
	 * @generated
	 */
	float getStd();

	/**
	 * Sets the value of the '{@link data_Description.NumericalStat#getStd <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std</em>' attribute.
	 * @see #getStd()
	 * @generated
	 */
	void setStd(float value);

	/**
	 * Returns the value of the '<em><b>Freqency Table</b></em>' reference list.
	 * The list contents are of type {@link data_Description.freqTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freqency Table</em>' reference list.
	 * @see data_Description.Data_DescriptionPackage#getNumericalStat_FreqencyTable()
	 * @model
	 * @generated
	 */

	ArrayList<freqTable> getFreqencyTable();
	//EDITED
	
	//EDITED
	void setMin(ArrayList<Float> data);
	//EDITED
	
	//EDITED
	void setMax(ArrayList<Float> data);
	//EDITED
	
	//EDITED
		void setMean(ArrayList<Float> data);
	//EDITED
	
	//EDITED
		void setStd(ArrayList<Float> data);
	//EDITED
	
	//EDITED
	void SetFreqencyTable(ArrayList<Float> data);
	//EDITED
		
} // NumericalStat
