/**
 */
package vformDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.Select#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.Select#getDataOption <em>Data Option</em>}</li>
 *   <li>{@link vformDSL.Select#getEnumOption <em>Enum Option</em>}</li>
 *   <li>{@link vformDSL.Select#getNumberOption <em>Number Option</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Name</em>' attribute.
	 * @see #setInputName(String)
	 * @see vformDSL.VformDSLPackage#getSelect_InputName()
	 * @model
	 * @generated
	 */
	String getInputName();

	/**
	 * Sets the value of the '{@link vformDSL.Select#getInputName <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Name</em>' attribute.
	 * @see #getInputName()
	 * @generated
	 */
	void setInputName(String value);

	/**
	 * Returns the value of the '<em><b>Data Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Option</em>' containment reference.
	 * @see #setDataOption(DataOption)
	 * @see vformDSL.VformDSLPackage#getSelect_DataOption()
	 * @model containment="true"
	 * @generated
	 */
	DataOption getDataOption();

	/**
	 * Sets the value of the '{@link vformDSL.Select#getDataOption <em>Data Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Option</em>' containment reference.
	 * @see #getDataOption()
	 * @generated
	 */
	void setDataOption(DataOption value);

	/**
	 * Returns the value of the '<em><b>Enum Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Option</em>' containment reference.
	 * @see #setEnumOption(EnumOption)
	 * @see vformDSL.VformDSLPackage#getSelect_EnumOption()
	 * @model containment="true"
	 * @generated
	 */
	EnumOption getEnumOption();

	/**
	 * Sets the value of the '{@link vformDSL.Select#getEnumOption <em>Enum Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Option</em>' containment reference.
	 * @see #getEnumOption()
	 * @generated
	 */
	void setEnumOption(EnumOption value);

	/**
	 * Returns the value of the '<em><b>Number Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Option</em>' containment reference.
	 * @see #setNumberOption(NumberOption)
	 * @see vformDSL.VformDSLPackage#getSelect_NumberOption()
	 * @model containment="true"
	 * @generated
	 */
	NumberOption getNumberOption();

	/**
	 * Sets the value of the '{@link vformDSL.Select#getNumberOption <em>Number Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Option</em>' containment reference.
	 * @see #getNumberOption()
	 * @generated
	 */
	void setNumberOption(NumberOption value);

} // Select