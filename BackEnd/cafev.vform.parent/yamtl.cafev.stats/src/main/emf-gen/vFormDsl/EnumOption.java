/**
 */
package vFormDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.EnumOption#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see vFormDsl.VFormDslPackage#getEnumOption()
 * @model
 * @generated
 */
public interface EnumOption extends Option {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link vFormDsl.OptionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see vFormDsl.VFormDslPackage#getEnumOption_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionItem> getData();

} // EnumOption
