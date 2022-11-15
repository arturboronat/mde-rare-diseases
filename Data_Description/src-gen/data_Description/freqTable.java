/**
 */
package data_Description;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>freq Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data_Description.freqTable#getLabel <em>Label</em>}</li>
 *   <li>{@link data_Description.freqTable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see data_Description.Data_DescriptionPackage#getfreqTable()
 * @model
 * @generated
 */
public interface freqTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see data_Description.Data_DescriptionPackage#getfreqTable_Label()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link data_Description.freqTable#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see data_Description.Data_DescriptionPackage#getfreqTable_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link data_Description.freqTable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // freqTable
