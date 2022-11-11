/**
 */
package vformDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.Group#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.Group#getGroupInputs <em>Group Inputs</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Name</em>' attribute.
	 * @see #setInputName(String)
	 * @see vformDSL.VformDSLPackage#getGroup_InputName()
	 * @model
	 * @generated
	 */
	String getInputName();

	/**
	 * Sets the value of the '{@link vformDSL.Group#getInputName <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Name</em>' attribute.
	 * @see #getInputName()
	 * @generated
	 */
	void setInputName(String value);

	/**
	 * Returns the value of the '<em><b>Group Inputs</b></em>' reference list.
	 * The list contents are of type {@link vformDSL.FormInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Inputs</em>' reference list.
	 * @see vformDSL.VformDSLPackage#getGroup_GroupInputs()
	 * @model
	 * @generated
	 */
	EList<FormInput> getGroupInputs();

} // Group
