/**
 */
package vformDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import vformDSL.EnumOption;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.EnumOptionImpl#getStringData <em>String Data</em>}</li>
 *   <li>{@link vformDSL.impl.EnumOptionImpl#getNumberData <em>Number Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumOptionImpl extends MinimalEObjectImpl.Container implements EnumOption {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.ENUM_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringData() {
		if (stringData == null) {
			stringData = new EDataTypeEList<String>(String.class, this, VformDSLPackage.ENUM_OPTION__STRING_DATA);
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
			numberData = new EDataTypeEList<Integer>(Integer.class, this, VformDSLPackage.ENUM_OPTION__NUMBER_DATA);
		}
		return numberData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VformDSLPackage.ENUM_OPTION__STRING_DATA:
				return getStringData();
			case VformDSLPackage.ENUM_OPTION__NUMBER_DATA:
				return getNumberData();
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
			case VformDSLPackage.ENUM_OPTION__STRING_DATA:
				getStringData().clear();
				getStringData().addAll((Collection<? extends String>)newValue);
				return;
			case VformDSLPackage.ENUM_OPTION__NUMBER_DATA:
				getNumberData().clear();
				getNumberData().addAll((Collection<? extends Integer>)newValue);
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
			case VformDSLPackage.ENUM_OPTION__STRING_DATA:
				getStringData().clear();
				return;
			case VformDSLPackage.ENUM_OPTION__NUMBER_DATA:
				getNumberData().clear();
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
			case VformDSLPackage.ENUM_OPTION__STRING_DATA:
				return stringData != null && !stringData.isEmpty();
			case VformDSLPackage.ENUM_OPTION__NUMBER_DATA:
				return numberData != null && !numberData.isEmpty();
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
		result.append(" (stringData: ");
		result.append(stringData);
		result.append(", numberData: ");
		result.append(numberData);
		result.append(')');
		return result.toString();
	}

} //EnumOptionImpl
