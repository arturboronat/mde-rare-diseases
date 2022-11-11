/**
 */
package vformDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.EnumOption#getStringData <em>String Data</em>}</li>
 *   <li>{@link vformDSL.EnumOption#getNumberData <em>Number Data</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getEnumOption()
 * @model
 * @generated
 */
public interface EnumOption extends EObject {
	/**
	 * Returns the value of the '<em><b>String Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Data</em>' attribute list.
	 * @see vformDSL.VformDSLPackage#getEnumOption_StringData()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStringData();

	/**
	 * Returns the value of the '<em><b>Number Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Data</em>' attribute list.
	 * @see vformDSL.VformDSLPackage#getEnumOption_NumberData()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getNumberData();

} // EnumOption
