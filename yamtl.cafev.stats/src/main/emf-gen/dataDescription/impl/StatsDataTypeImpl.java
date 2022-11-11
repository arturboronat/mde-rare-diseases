/**
 */
package dataDescription.impl;

import dataDescription.DataDescriptionPackage;
import dataDescription.FrequencyTable;
import dataDescription.StatsDataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stats Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataDescription.impl.StatsDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataDescription.impl.StatsDataTypeImpl#getFrequencyTable <em>Frequency Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StatsDataTypeImpl extends MinimalEObjectImpl.Container implements StatsDataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrequencyTable() <em>Frequency Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyTable()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyTable> frequencyTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatsDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataDescriptionPackage.Literals.STATS_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionPackage.STATS_DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyTable> getFrequencyTable() {
		if (frequencyTable == null) {
			frequencyTable = new EObjectContainmentEList<FrequencyTable>(FrequencyTable.class, this, DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE);
		}
		return frequencyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE:
				return ((InternalEList<?>)getFrequencyTable()).basicRemove(otherEnd, msgs);
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
			case DataDescriptionPackage.STATS_DATA_TYPE__NAME:
				return getName();
			case DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE:
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
			case DataDescriptionPackage.STATS_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE:
				getFrequencyTable().clear();
				getFrequencyTable().addAll((Collection<? extends FrequencyTable>)newValue);
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
			case DataDescriptionPackage.STATS_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE:
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
			case DataDescriptionPackage.STATS_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataDescriptionPackage.STATS_DATA_TYPE__FREQUENCY_TABLE:
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StatsDataTypeImpl
