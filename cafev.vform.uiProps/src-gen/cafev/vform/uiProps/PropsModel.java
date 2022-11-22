/**
 */
package cafev.vform.uiProps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Props Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.uiProps.PropsModel#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see cafev.vform.uiProps.UiPropsPackage#getPropsModel()
 * @model
 * @generated
 */
public interface PropsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link cafev.vform.uiProps.Props}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see cafev.vform.uiProps.UiPropsPackage#getPropsModel_Props()
	 * @model containment="true"
	 * @generated
	 */
	EList<Props> getProps();

} // PropsModel
