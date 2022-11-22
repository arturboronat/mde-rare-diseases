/**
 */
package cafev.vform.uiProps;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numerical Props</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.uiProps.NumericalProps#getData <em>Data</em>}</li>
 *   <li>{@link cafev.vform.uiProps.NumericalProps#getStd <em>Std</em>}</li>
 *   <li>{@link cafev.vform.uiProps.NumericalProps#getMin <em>Min</em>}</li>
 *   <li>{@link cafev.vform.uiProps.NumericalProps#getMax <em>Max</em>}</li>
 *   <li>{@link cafev.vform.uiProps.NumericalProps#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps()
 * @model
 * @generated
 */
public interface NumericalProps extends Props {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps_Data()
	 * @model
	 * @generated
	 */
	EList<Double> getData();

	/**
	 * Returns the value of the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std</em>' attribute.
	 * @see #setStd(double)
	 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps_Std()
	 * @model required="true"
	 * @generated
	 */
	double getStd();

	/**
	 * Sets the value of the '{@link cafev.vform.uiProps.NumericalProps#getStd <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std</em>' attribute.
	 * @see #getStd()
	 * @generated
	 */
	void setStd(double value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps_Min()
	 * @model required="true"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link cafev.vform.uiProps.NumericalProps#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps_Max()
	 * @model required="true"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link cafev.vform.uiProps.NumericalProps#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(double)
	 * @see cafev.vform.uiProps.UiPropsPackage#getNumericalProps_Mean()
	 * @model required="true"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link cafev.vform.uiProps.NumericalProps#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

} // NumericalProps
