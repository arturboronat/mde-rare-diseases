/**
 */
package dataDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numerical Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.NumericalType#getMin <em>Min</em>}</li>
 *   <li>{@link dataDescription.NumericalType#getMax <em>Max</em>}</li>
 *   <li>{@link dataDescription.NumericalType#getMean <em>Mean</em>}</li>
 *   <li>{@link dataDescription.NumericalType#getStd <em>Std</em>}</li>
 * </ul>
 *
 * @see dataDescription.DataDescriptionPackage#getNumericalType()
 * @model
 * @generated
 */
public interface NumericalType extends StatsDataType {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see dataDescription.DataDescriptionPackage#getNumericalType_Min()
	 * @model required="true"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link dataDescription.NumericalType#getMin <em>Min</em>}' attribute.
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
	 * @see dataDescription.DataDescriptionPackage#getNumericalType_Max()
	 * @model required="true"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link dataDescription.NumericalType#getMax <em>Max</em>}' attribute.
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
	 * @see dataDescription.DataDescriptionPackage#getNumericalType_Mean()
	 * @model required="true"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link dataDescription.NumericalType#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

	/**
	 * Returns the value of the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std</em>' attribute.
	 * @see #setStd(double)
	 * @see dataDescription.DataDescriptionPackage#getNumericalType_Std()
	 * @model required="true"
	 * @generated
	 */
	double getStd();

	/**
	 * Sets the value of the '{@link dataDescription.NumericalType#getStd <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std</em>' attribute.
	 * @see #getStd()
	 * @generated
	 */
	void setStd(double value);

} // NumericalType
