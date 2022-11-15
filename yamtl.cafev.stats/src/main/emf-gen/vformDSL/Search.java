/**
 */
package vformDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.Search#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.Search#getStringData <em>String Data</em>}</li>
 *   <li>{@link vformDSL.Search#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Name</em>' attribute.
	 * @see #setInputName(String)
	 * @see vformDSL.VformDSLPackage#getSearch_InputName()
	 * @model
	 * @generated
	 */
	String getInputName();

	/**
	 * Sets the value of the '{@link vformDSL.Search#getInputName <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Name</em>' attribute.
	 * @see #getInputName()
	 * @generated
	 */
	void setInputName(String value);

	/**
	 * Returns the value of the '<em><b>String Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Data</em>' attribute list.
	 * @see vformDSL.VformDSLPackage#getSearch_StringData()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStringData();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getSearch_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // Search
