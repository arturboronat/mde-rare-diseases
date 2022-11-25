/**
 */
package vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.FormInputRange#getMin <em>Min</em>}</li>
 *   <li>{@link vFormDsl.FormInputRange#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getFormInputRange()
 * @model
 * @generated
 */
public interface FormInputRange extends FormInput {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see vFormDsl.VFormDslPackage#getFormInputRange_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link vFormDsl.FormInputRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see vFormDsl.VFormDslPackage#getFormInputRange_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link vFormDsl.FormInputRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // FormInputRange
