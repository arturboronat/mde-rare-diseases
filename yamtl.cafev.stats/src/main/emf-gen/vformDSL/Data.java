/**
 */
package vformDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.Data#getLabel <em>Label</em>}</li>
 *   <li>{@link vformDSL.Data#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link vformDSL.Data#getIntVal <em>Int Val</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see vformDSL.VformDSLPackage#getData_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link vformDSL.Data#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Val</em>' attribute.
	 * @see #setStrVal(String)
	 * @see vformDSL.VformDSLPackage#getData_StrVal()
	 * @model
	 * @generated
	 */
	String getStrVal();

	/**
	 * Sets the value of the '{@link vformDSL.Data#getStrVal <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' attribute.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(String value);

	/**
	 * Returns the value of the '<em><b>Int Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Val</em>' attribute.
	 * @see #setIntVal(int)
	 * @see vformDSL.VformDSLPackage#getData_IntVal()
	 * @model
	 * @generated
	 */
	int getIntVal();

	/**
	 * Sets the value of the '{@link vformDSL.Data#getIntVal <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Val</em>' attribute.
	 * @see #getIntVal()
	 * @generated
	 */
	void setIntVal(int value);

} // Data
