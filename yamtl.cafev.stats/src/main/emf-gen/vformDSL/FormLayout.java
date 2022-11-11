/**
 */
package vformDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.FormLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see vformDSL.VformDSLPackage#getFormLayout()
 * @model
 * @generated
 */
public interface FormLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link vformDSL.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see vformDSL.Layout
	 * @see #setLayout(Layout)
	 * @see vformDSL.VformDSLPackage#getFormLayout_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link vformDSL.FormLayout#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see vformDSL.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // FormLayout
