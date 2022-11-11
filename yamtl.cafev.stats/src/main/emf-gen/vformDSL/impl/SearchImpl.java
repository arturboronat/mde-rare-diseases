/**
 */
package vformDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vformDSL.Data;
import vformDSL.Search;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.SearchImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.impl.SearchImpl#getStringData <em>String Data</em>}</li>
 *   <li>{@link vformDSL.impl.SearchImpl#getNumberData <em>Number Data</em>}</li>
 *   <li>{@link vformDSL.impl.SearchImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
	/**
	 * The default value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputName()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputName()
	 * @generated
	 * @ordered
	 */
	protected String inputName = INPUT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStringData() <em>String Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringData()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stringData;

	/**
	 * The cached value of the '{@link #getNumberData() <em>Number Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numberData;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputName() {
		return inputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputName(String newInputName) {
		String oldInputName = inputName;
		inputName = newInputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.SEARCH__INPUT_NAME, oldInputName, inputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringData() {
		if (stringData == null) {
			stringData = new EDataTypeEList<String>(String.class, this, VformDSLPackage.SEARCH__STRING_DATA);
		}
		return stringData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNumberData() {
		if (numberData == null) {
			numberData = new EDataTypeEList<Integer>(Integer.class, this, VformDSLPackage.SEARCH__NUMBER_DATA);
		}
		return numberData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, VformDSLPackage.SEARCH__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VformDSLPackage.SEARCH__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case VformDSLPackage.SEARCH__INPUT_NAME:
				return getInputName();
			case VformDSLPackage.SEARCH__STRING_DATA:
				return getStringData();
			case VformDSLPackage.SEARCH__NUMBER_DATA:
				return getNumberData();
			case VformDSLPackage.SEARCH__DATA:
				return getData();
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
			case VformDSLPackage.SEARCH__INPUT_NAME:
				setInputName((String)newValue);
				return;
			case VformDSLPackage.SEARCH__STRING_DATA:
				getStringData().clear();
				getStringData().addAll((Collection<? extends String>)newValue);
				return;
			case VformDSLPackage.SEARCH__NUMBER_DATA:
				getNumberData().clear();
				getNumberData().addAll((Collection<? extends Integer>)newValue);
				return;
			case VformDSLPackage.SEARCH__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case VformDSLPackage.SEARCH__INPUT_NAME:
				setInputName(INPUT_NAME_EDEFAULT);
				return;
			case VformDSLPackage.SEARCH__STRING_DATA:
				getStringData().clear();
				return;
			case VformDSLPackage.SEARCH__NUMBER_DATA:
				getNumberData().clear();
				return;
			case VformDSLPackage.SEARCH__DATA:
				getData().clear();
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
			case VformDSLPackage.SEARCH__INPUT_NAME:
				return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals(inputName);
			case VformDSLPackage.SEARCH__STRING_DATA:
				return stringData != null && !stringData.isEmpty();
			case VformDSLPackage.SEARCH__NUMBER_DATA:
				return numberData != null && !numberData.isEmpty();
			case VformDSLPackage.SEARCH__DATA:
				return data != null && !data.isEmpty();
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
		result.append(" (inputName: ");
		result.append(inputName);
		result.append(", stringData: ");
		result.append(stringData);
		result.append(", numberData: ");
		result.append(numberData);
		result.append(')');
		return result.toString();
	}

} //SearchImpl
