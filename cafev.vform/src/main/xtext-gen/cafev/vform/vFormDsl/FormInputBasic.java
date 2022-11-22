/**
 * generated by Xtext 2.28.0
 */
package cafev.vform.vFormDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Input Basic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.vFormDsl.FormInputBasic#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cafev.vform.vFormDsl.VFormDslPackage#getFormInputBasic()
 * @model
 * @generated
 */
public interface FormInputBasic extends FormInput
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link cafev.vform.vFormDsl.BasicInputType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see cafev.vform.vFormDsl.BasicInputType
   * @see #setType(BasicInputType)
   * @see cafev.vform.vFormDsl.VFormDslPackage#getFormInputBasic_Type()
   * @model
   * @generated
   */
  BasicInputType getType();

  /**
   * Sets the value of the '{@link cafev.vform.vFormDsl.FormInputBasic#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see cafev.vform.vFormDsl.BasicInputType
   * @see #getType()
   * @generated
   */
  void setType(BasicInputType value);

} // FormInputBasic
