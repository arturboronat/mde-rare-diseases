/**
 */
package vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Option Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.DataOptionItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getDataOptionItem()
 * @model
 * @generated
 */
public interface DataOptionItem extends OptionItem {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Data)
	 * @see vFormDsl.VFormDslPackage#getDataOptionItem_Value()
	 * @model containment="true"
	 * @generated
	 */
	Data getValue();

	/**
	 * Sets the value of the '{@link vFormDsl.DataOptionItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Data value);

} // DataOptionItem
