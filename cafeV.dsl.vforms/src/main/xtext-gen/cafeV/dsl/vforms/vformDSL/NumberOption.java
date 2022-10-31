/**
 * generated by Xtext 2.25.0
 */
package cafeV.dsl.vforms.vformDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafeV.dsl.vforms.vformDSL.NumberOption#getMin <em>Min</em>}</li>
 *   <li>{@link cafeV.dsl.vforms.vformDSL.NumberOption#getMax <em>Max</em>}</li>
 *   <li>{@link cafeV.dsl.vforms.vformDSL.NumberOption#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see cafeV.dsl.vforms.vformDSL.VformDSLPackage#getNumberOption()
 * @model
 * @generated
 */
public interface NumberOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see cafeV.dsl.vforms.vformDSL.VformDSLPackage#getNumberOption_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link cafeV.dsl.vforms.vformDSL.NumberOption#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see cafeV.dsl.vforms.vformDSL.VformDSLPackage#getNumberOption_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link cafeV.dsl.vforms.vformDSL.NumberOption#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(int)
   * @see cafeV.dsl.vforms.vformDSL.VformDSLPackage#getNumberOption_Range()
   * @model
   * @generated
   */
  int getRange();

  /**
   * Sets the value of the '{@link cafeV.dsl.vforms.vformDSL.NumberOption#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #getRange()
   * @generated
   */
  void setRange(int value);

} // NumberOption
