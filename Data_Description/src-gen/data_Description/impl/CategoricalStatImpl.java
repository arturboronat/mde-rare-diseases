/**
 */
package data_Description.impl;

import data_Description.CategoricalStat;
import data_Description.freqTable;
import data_Description.Data_DescriptionPackage;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorical Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data_Description.impl.CategoricalStatImpl#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link data_Description.impl.CategoricalStatImpl#getFrequencyTable <em>Frequency Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoricalStatImpl extends MinimalEObjectImpl.Container implements CategoricalStat {
	/**
	 * The default value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnId()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnId()
	 * @generated
	 * @ordered
	 */
	protected String columnId = COLUMN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrequencyTable() <em>Frequency Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyTable()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<freqTable> frequencyTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoricalStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_DescriptionPackage.Literals.CATEGORICAL_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnId() {
		return columnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnId(String newColumnId) {
		String oldColumnId = columnId;
		columnId = newColumnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID,
					oldColumnId, columnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<freqTable> getFrequencyTable() {
//		if (frequencyTable == null) {
//			frequencyTable = new EObjectResolvingEList<freqTable>(freqTable.class, this,
//					Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE);
//		}
		return frequencyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
			return getColumnId();
		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
			return getFrequencyTable();
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
		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
			setColumnId((String) newValue);
			return;
		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
			getFrequencyTable().clear();
			getFrequencyTable().addAll((Collection<? extends freqTable>) newValue);
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
		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
			setColumnId(COLUMN_ID_EDEFAULT);
			return;
		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
			getFrequencyTable().clear();
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
		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
			return COLUMN_ID_EDEFAULT == null ? columnId != null : !COLUMN_ID_EDEFAULT.equals(columnId);
		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
			return frequencyTable != null && !frequencyTable.isEmpty();
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
		result.append(" (columnId: ");
		result.append(columnId);
		result.append(')');
		return result.toString();
	}

	//EDITED
	public void setFrequencyTable(ArrayList<String> data) {

		this.frequencyTable = new ArrayList<freqTable>();

		HashMap<String, Integer> dataMap = new HashMap<String, Integer>();

		data.sort(null);
		int count = 1;
		String c = data.get(0);
		for (String i : data) {

			if (i.equals(c)) {
				count++;

			} else {

				count = 1;

			}
			c = i;
			dataMap.put(i, count);
		}

		for (String i : dataMap.keySet()) {

			if (!i.equals("")) {
				freqTable freqTable = new freqTableImpl();

				freqTable.setLabel(i);
				freqTable.setValue(dataMap.get(i));

				this.frequencyTable.add(freqTable);
			}

		}
	}

	//EDITED

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public Object eGet(float featureID, boolean resolve, boolean coreType) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			return getColumnId();
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			return getFrequencyTable();
	//		}
	//		return super.eGet(featureID, resolve, coreType);
	//	}

	//	/**
	//	 * <!-- begin-user-doc -->
	//	 * <!-- end-user-doc -->
	//	 * @generated
	//	 */
	//	@SuppressWarnings("unchecked")
	//	@Override
	//	public void eSet(float featureID, Object newValue) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			setColumnId((String) newValue);
	//			return;
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			getFrequencyTable().clear();
	//			getFrequencyTable().addAll((Collection<? extends freqTable>) newValue);
	//			return;
	//		}
	//		super.eSet(featureID, newValue);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public void eUnset(float featureID) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			setColumnId(COLUMN_ID_EDEFAULT);
	//			return;
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			getFrequencyTable().clear();
	//			return;
	//		}
	//		super.eUnset(featureID);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public boolean eIsSet(float featureID) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			return COLUMN_ID_EDEFAULT == null ? columnId != null : !COLUMN_ID_EDEFAULT.equals(columnId);
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			return frequencyTable != null && !frequencyTable.isEmpty();
	//		}
	//		return super.eIsSet(featureID);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public Object eGet(float featureID, boolean resolve, boolean coreType) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			return getColumnId();
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			return getFrequencyTable();
	//		}
	//		return super.eGet(featureID, resolve, coreType);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@SuppressWarnings("unchecked")
	//	@Override
	//	public void eSet(float featureID, Object newValue) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			setColumnId((String) newValue);
	//			return;
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			getFrequencyTable().clear();
	//			getFrequencyTable().addAll((Collection<? extends freqTable>) newValue);
	//			return;
	//		}
	//		super.eSet(featureID, newValue);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public void eUnset(float featureID) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			setColumnId(COLUMN_ID_EDEFAULT);
	//			return;
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			getFrequencyTable().clear();
	//			return;
	//		}
	//		super.eUnset(featureID);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public boolean eIsSet(float featureID) {
	//		switch (featureID) {
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__COLUMN_ID:
	//			return COLUMN_ID_EDEFAULT == null ? columnId != null : !COLUMN_ID_EDEFAULT.equals(columnId);
	//		case Data_DescriptionPackage.CATEGORICAL_STAT__FREQUENCY_TABLE:
	//			return frequencyTable != null && !frequencyTable.isEmpty();
	//		}
	//		return super.eIsSet(featureID);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//	@Override
	//	public String toString() {
	//		if (eIsProxy())
	//			return super.toString();
	//
	//		StringBuilder result = new StringBuilder(super.toString());
	//		result.append(" (columnId: ");
	//		result.append(columnId);
	//		result.append(')');
	//		return result.toString();
	//	}

} //CategoricalStatImpl
