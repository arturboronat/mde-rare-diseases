/**
 */
package data_Description.impl;

import data_Description.CategoricalStat;
import data_Description.DataDescription;
import data_Description.Data_DescriptionPackage;
import data_Description.NumericalStat;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data_Description.impl.DataDescriptionImpl#getNumericalstat <em>Numericalstat</em>}</li>
 *   <li>{@link data_Description.impl.DataDescriptionImpl#getCategoricalstat <em>Categoricalstat</em>}</li>
 *   <li>{@link data_Description.impl.DataDescriptionImpl#getDataName <em>Data Name</em>}</li>
 *    <li>{@link data_Description.impl.DataDescriptionImpl#setNumericalstat <em>Numericalstat</em>}</li>
 *    <li>{@link data_Description.impl.DataDescriptionImpl#setCategoricalstat <em>Categoricalstat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDescriptionImpl extends MinimalEObjectImpl.Container implements DataDescription {
	/**
	 * The cached value of the '{@link #getNumericalstat() <em>Numericalstat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericalstat()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<NumericalStat> numericalstat;

	/**
	 * The cached value of the '{@link #getCategoricalstat() <em>Categoricalstat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoricalstat()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<CategoricalStat> categoricalstat;

	/**
	 * The default value of the '{@link #getDataName() <em>Data Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataName() <em>Data Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataName()
	 * @generated
	 * @ordered
	 */
	protected String dataName = DATA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_DescriptionPackage.Literals.DATA_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<NumericalStat> getNumericalstat() {
//		if (numericalstat == null) {
//			numericalstat = new EObjectContainmentEList<NumericalStat>(NumericalStat.class, this,
//					Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT);
//		}
		return numericalstat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<CategoricalStat> getCategoricalstat() {
//		if (categoricalstat == null) {
//			categoricalstat = new EObjectContainmentEList<CategoricalStat>(CategoricalStat.class, this,
//					Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT);
//		}
		return categoricalstat;
	}

	//EDITED
	public void setCategoricalstat(HashMap<String, ArrayList<String>> data) {
		this.categoricalstat = new ArrayList<CategoricalStat>();

		for (String i : data.keySet()) {
			CategoricalStat catStat = new CategoricalStatImpl();
			boolean isCat = true;

			Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
			for (String j : data.get(i)) {
				if (!j.equals(null) && pattern.matcher(j).matches()) {
					isCat = false;
				}

			}

			if (isCat == true) {
				catStat.setColumnId(i);
				catStat.setFrequencyTable(data.get(i));
				this.categoricalstat.add(catStat);
			}

		}

	}
	//EDITED

	//EDITED
	public void setNumericalstat(HashMap<String, ArrayList<String>> data) {
		this.numericalstat = new ArrayList<NumericalStat>();
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		for (String i : data.keySet()) {
			NumericalStat numStat = new NumericalStatImpl();
			boolean isNum = false;
			ArrayList<Float> numData = new ArrayList<Float>();
			for (String j : data.get(i)) {
				if (!j.equals(null) && pattern.matcher(j).matches()) {
					isNum = true;
					numData.add(Float.parseFloat(j));
				}

			}

			if (isNum == true) {
				numStat.setColumnId(i);
				numStat.setMin(numData);
				numStat.setMax(numData);
				numStat.setMean(numData);
				numStat.setStd(numData);
				numStat.SetFreqencyTable(numData);
				this.numericalstat.add(numStat);

				
				
			}

		}

	}
	//EDITED

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataName() {
		return dataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataName(String newDataName) {
		String oldDataName = dataName;
		dataName = newDataName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.DATA_DESCRIPTION__DATA_NAME,
					oldDataName, dataName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT:
			return ((InternalEList<?>) getNumericalstat()).basicRemove(otherEnd, msgs);
		case Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT:
			return ((InternalEList<?>) getCategoricalstat()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT:
			return getNumericalstat();
		case Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT:
			return getCategoricalstat();
		case Data_DescriptionPackage.DATA_DESCRIPTION__DATA_NAME:
			return getDataName();
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
		case Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT:
			getNumericalstat().clear();
			getNumericalstat().addAll((Collection<? extends NumericalStat>) newValue);
			return;
		case Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT:
			getCategoricalstat().clear();
			getCategoricalstat().addAll((Collection<? extends CategoricalStat>) newValue);
			return;
		case Data_DescriptionPackage.DATA_DESCRIPTION__DATA_NAME:
			setDataName((String) newValue);
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
		case Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT:
			getNumericalstat().clear();
			return;
		case Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT:
			getCategoricalstat().clear();
			return;
		case Data_DescriptionPackage.DATA_DESCRIPTION__DATA_NAME:
			setDataName(DATA_NAME_EDEFAULT);
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
		case Data_DescriptionPackage.DATA_DESCRIPTION__NUMERICALSTAT:
			return numericalstat != null && !numericalstat.isEmpty();
		case Data_DescriptionPackage.DATA_DESCRIPTION__CATEGORICALSTAT:
			return categoricalstat != null && !categoricalstat.isEmpty();
		case Data_DescriptionPackage.DATA_DESCRIPTION__DATA_NAME:
			return DATA_NAME_EDEFAULT == null ? dataName != null : !DATA_NAME_EDEFAULT.equals(dataName);
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
		result.append(" (dataName: ");
		result.append(dataName);
		result.append(')');
		return result.toString();
	}

} //DataDescriptionImpl
