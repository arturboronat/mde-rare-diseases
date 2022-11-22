/**
 */
package cafev.vform.uiProps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorical Props</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.uiProps.CategoricalProps#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see cafev.vform.uiProps.UiPropsPackage#getCategoricalProps()
 * @model
 * @generated
 */
public interface CategoricalProps extends Props {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see cafev.vform.uiProps.UiPropsPackage#getCategoricalProps_Data()
	 * @model
	 * @generated
	 */
	EList<String> getData();

} // CategoricalProps
