/**
 */
package vFormDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.Model#getFormLayout <em>Form Layout</em>}</li>
 *   <li>{@link vFormDsl.Model#getFormInput <em>Form Input</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Layout</em>' containment reference.
	 * @see #setFormLayout(FormLayout)
	 * @see vFormDsl.VFormDslPackage#getModel_FormLayout()
	 * @model containment="true"
	 * @generated
	 */
	FormLayout getFormLayout();

	/**
	 * Sets the value of the '{@link vFormDsl.Model#getFormLayout <em>Form Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Layout</em>' containment reference.
	 * @see #getFormLayout()
	 * @generated
	 */
	void setFormLayout(FormLayout value);

	/**
	 * Returns the value of the '<em><b>Form Input</b></em>' containment reference list.
	 * The list contents are of type {@link vFormDsl.FormInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Input</em>' containment reference list.
	 * @see vFormDsl.VFormDslPackage#getModel_FormInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormInput> getFormInput();

} // Model
