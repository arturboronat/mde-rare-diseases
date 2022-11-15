/**
 */
package vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input Basic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.FormInputBasic#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getFormInputBasic()
 * @model
 * @generated
 */
public interface FormInputBasic extends FormInput {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vFormDsl.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vFormDsl.InputType
	 * @see #setType(InputType)
	 * @see vFormDsl.VFormDslPackage#getFormInputBasic_Type()
	 * @model
	 * @generated
	 */
	InputType getType();

	/**
	 * Sets the value of the '{@link vFormDsl.FormInputBasic#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vFormDsl.InputType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputType value);

} // FormInputBasic
