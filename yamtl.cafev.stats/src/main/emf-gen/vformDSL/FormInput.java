/**
 */
package vformDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.FormInput#getText <em>Text</em>}</li>
 *   <li>{@link vformDSL.FormInput#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link vformDSL.FormInput#getNumber <em>Number</em>}</li>
 *   <li>{@link vformDSL.FormInput#getDat <em>Dat</em>}</li>
 *   <li>{@link vformDSL.FormInput#getRange <em>Range</em>}</li>
 *   <li>{@link vformDSL.FormInput#getSelect <em>Select</em>}</li>
 *   <li>{@link vformDSL.FormInput#getSearch <em>Search</em>}</li>
 *   <li>{@link vformDSL.FormInput#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getFormInput()
 * @model
 * @generated
 */
public interface FormInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Text()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getText();

	/**
	 * Returns the value of the '<em><b>Checkbox</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Checkbox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkbox</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Checkbox()
	 * @model containment="true"
	 * @generated
	 */
	EList<Checkbox> getCheckbox();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Number}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Number()
	 * @model containment="true"
	 * @generated
	 */
	EList<vformDSL.Number> getNumber();

	/**
	 * Returns the value of the '<em><b>Dat</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Dat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Dat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dat> getDat();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Range}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Range()
	 * @model containment="true"
	 * @generated
	 */
	EList<Range> getRange();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Select}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Select()
	 * @model containment="true"
	 * @generated
	 */
	EList<Select> getSelect();

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Search}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Search()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearch();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getFormInput_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

} // FormInput
