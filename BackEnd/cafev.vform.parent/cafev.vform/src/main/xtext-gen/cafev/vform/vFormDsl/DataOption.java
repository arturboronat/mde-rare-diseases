/**
 * generated by Xtext 2.28.0
 */
package cafev.vform.vFormDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.vFormDsl.DataOption#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see cafev.vform.vFormDsl.VFormDslPackage#getDataOption()
 * @model
 * @generated
 */
public interface DataOption extends Option
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link cafev.vform.vFormDsl.Data}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see cafev.vform.vFormDsl.VFormDslPackage#getDataOption_Data()
   * @model containment="true"
   * @generated
   */
  EList<Data> getData();

} // DataOption
