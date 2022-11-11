/**
 */
package vformDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.Dat#getInputName <em>Input Name</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getDat()
 * @model
 * @generated
 */
public interface Dat extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Name</em>' attribute.
	 * @see #setInputName(String)
	 * @see vformDSL.VformDSLPackage#getDat_InputName()
	 * @model
	 * @generated
	 */
	String getInputName();

	/**
	 * Sets the value of the '{@link vformDSL.Dat#getInputName <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Name</em>' attribute.
	 * @see #getInputName()
	 * @generated
	 */
	void setInputName(String value);

} // Dat
