/**
 */
package dataDescription.impl;

import dataDescription.DataDescriptionPackage;
import dataDescription.NumericalType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerical Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.impl.NumericalTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link dataDescription.impl.NumericalTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link dataDescription.impl.NumericalTypeImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link dataDescription.impl.NumericalTypeImpl#getStd <em>Std</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericalTypeImpl extends StatsDataTypeImpl implements NumericalType {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected float min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected float max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final float MEAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected float mean = MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected static final float STD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected float std = STD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataDescriptionPackage.Literals.NUMERICAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(float newMin) {
		float oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionPackage.NUMERICAL_TYPE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(float newMax) {
		float oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionPackage.NUMERICAL_TYPE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(float newMean) {
		float oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionPackage.NUMERICAL_TYPE__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStd() {
		return std;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd(float newStd) {
		float oldStd = std;
		std = newStd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionPackage.NUMERICAL_TYPE__STD, oldStd, std));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataDescriptionPackage.NUMERICAL_TYPE__MIN:
				return getMin();
			case DataDescriptionPackage.NUMERICAL_TYPE__MAX:
				return getMax();
			case DataDescriptionPackage.NUMERICAL_TYPE__MEAN:
				return getMean();
			case DataDescriptionPackage.NUMERICAL_TYPE__STD:
				return getStd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataDescriptionPackage.NUMERICAL_TYPE__MIN:
				setMin((Float)newValue);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__MAX:
				setMax((Float)newValue);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__MEAN:
				setMean((Float)newValue);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__STD:
				setStd((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataDescriptionPackage.NUMERICAL_TYPE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__MEAN:
				setMean(MEAN_EDEFAULT);
				return;
			case DataDescriptionPackage.NUMERICAL_TYPE__STD:
				setStd(STD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataDescriptionPackage.NUMERICAL_TYPE__MIN:
				return min != MIN_EDEFAULT;
			case DataDescriptionPackage.NUMERICAL_TYPE__MAX:
				return max != MAX_EDEFAULT;
			case DataDescriptionPackage.NUMERICAL_TYPE__MEAN:
				return mean != MEAN_EDEFAULT;
			case DataDescriptionPackage.NUMERICAL_TYPE__STD:
				return std != STD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", mean: ");
		result.append(mean);
		result.append(", std: ");
		result.append(std);
		result.append(')');
		return result.toString();
	}

} //NumericalTypeImpl
