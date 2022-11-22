/**
 */
package cafev.vform.uiProps.impl;

import cafev.vform.uiProps.NumericalProps;
import cafev.vform.uiProps.UiPropsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerical Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cafev.vform.uiProps.impl.NumericalPropsImpl#getData <em>Data</em>}</li>
 *   <li>{@link cafev.vform.uiProps.impl.NumericalPropsImpl#getStd <em>Std</em>}</li>
 *   <li>{@link cafev.vform.uiProps.impl.NumericalPropsImpl#getMin <em>Min</em>}</li>
 *   <li>{@link cafev.vform.uiProps.impl.NumericalPropsImpl#getMax <em>Max</em>}</li>
 *   <li>{@link cafev.vform.uiProps.impl.NumericalPropsImpl#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericalPropsImpl extends PropsImpl implements NumericalProps {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> data;

	/**
	 * The default value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected static final double STD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected double std = STD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected double mean = MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalPropsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPropsPackage.Literals.NUMERICAL_PROPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getData() {
		if (data == null) {
			data = new EDataTypeUniqueEList<Double>(Double.class, this, UiPropsPackage.NUMERICAL_PROPS__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStd() {
		return std;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd(double newStd) {
		double oldStd = std;
		std = newStd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPropsPackage.NUMERICAL_PROPS__STD, oldStd, std));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPropsPackage.NUMERICAL_PROPS__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPropsPackage.NUMERICAL_PROPS__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(double newMean) {
		double oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPropsPackage.NUMERICAL_PROPS__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UiPropsPackage.NUMERICAL_PROPS__DATA:
			return getData();
		case UiPropsPackage.NUMERICAL_PROPS__STD:
			return getStd();
		case UiPropsPackage.NUMERICAL_PROPS__MIN:
			return getMin();
		case UiPropsPackage.NUMERICAL_PROPS__MAX:
			return getMax();
		case UiPropsPackage.NUMERICAL_PROPS__MEAN:
			return getMean();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UiPropsPackage.NUMERICAL_PROPS__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Double>) newValue);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__STD:
			setStd((Double) newValue);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MIN:
			setMin((Double) newValue);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MAX:
			setMax((Double) newValue);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MEAN:
			setMean((Double) newValue);
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
		case UiPropsPackage.NUMERICAL_PROPS__DATA:
			getData().clear();
			return;
		case UiPropsPackage.NUMERICAL_PROPS__STD:
			setStd(STD_EDEFAULT);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case UiPropsPackage.NUMERICAL_PROPS__MEAN:
			setMean(MEAN_EDEFAULT);
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
		case UiPropsPackage.NUMERICAL_PROPS__DATA:
			return data != null && !data.isEmpty();
		case UiPropsPackage.NUMERICAL_PROPS__STD:
			return std != STD_EDEFAULT;
		case UiPropsPackage.NUMERICAL_PROPS__MIN:
			return min != MIN_EDEFAULT;
		case UiPropsPackage.NUMERICAL_PROPS__MAX:
			return max != MAX_EDEFAULT;
		case UiPropsPackage.NUMERICAL_PROPS__MEAN:
			return mean != MEAN_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (data: ");
		result.append(data);
		result.append(", std: ");
		result.append(std);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", mean: ");
		result.append(mean);
		result.append(')');
		return result.toString();
	}

} //NumericalPropsImpl
