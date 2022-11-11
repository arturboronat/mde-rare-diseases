/**
 */
package vformDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.DataOption#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getDataOption()
 * @model
 * @generated
 */
public interface DataOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link vformDSL.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see vformDSL.VformDSLPackage#getDataOption_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // DataOption
