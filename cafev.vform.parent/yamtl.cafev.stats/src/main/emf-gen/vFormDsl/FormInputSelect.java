/**
 */
package vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.FormInputSelect#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getFormInputSelect()
 * @model
 * @generated
 */
public interface FormInputSelect extends FormInput {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(Option)
	 * @see vFormDsl.VFormDslPackage#getFormInputSelect_Option()
	 * @model containment="true"
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link vFormDsl.FormInputSelect#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

} // FormInputSelect
