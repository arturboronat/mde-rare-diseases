/**
 */
package vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.FormInputGroup#getGroupInputs <em>Group Inputs</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getFormInputGroup()
 * @model
 * @generated
 */
public interface FormInputGroup extends FormInput {
	/**
	 * Returns the value of the '<em><b>Group Inputs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Inputs</em>' reference.
	 * @see #setGroupInputs(FormInput)
	 * @see vFormDsl.VFormDslPackage#getFormInputGroup_GroupInputs()
	 * @model
	 * @generated
	 */
	FormInput getGroupInputs();

	/**
	 * Sets the value of the '{@link vFormDsl.FormInputGroup#getGroupInputs <em>Group Inputs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Inputs</em>' reference.
	 * @see #getGroupInputs()
	 * @generated
	 */
	void setGroupInputs(FormInput value);

} // FormInputGroup
