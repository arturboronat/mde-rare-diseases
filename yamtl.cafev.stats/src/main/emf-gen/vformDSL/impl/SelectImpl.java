/**
 */
package vformDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vformDSL.DataOption;
import vformDSL.EnumOption;
import vformDSL.NumberOption;
import vformDSL.Select;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.SelectImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.impl.SelectImpl#getDataOption <em>Data Option</em>}</li>
 *   <li>{@link vformDSL.impl.SelectImpl#getEnumOption <em>Enum Option</em>}</li>
 *   <li>{@link vformDSL.impl.SelectImpl#getNumberOption <em>Number Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select {
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
	 * The cached value of the '{@link #getDataOption() <em>Data Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOption()
	 * @generated
	 * @ordered
	 */
	protected DataOption dataOption;

	/**
	 * The cached value of the '{@link #getEnumOption() <em>Enum Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumOption()
	 * @generated
	 * @ordered
	 */
	protected EnumOption enumOption;

	/**
	 * The cached value of the '{@link #getNumberOption() <em>Number Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOption()
	 * @generated
	 * @ordered
	 */
	protected NumberOption numberOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.SELECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__INPUT_NAME, oldInputName, inputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOption getDataOption() {
		return dataOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOption(DataOption newDataOption, NotificationChain msgs) {
		DataOption oldDataOption = dataOption;
		dataOption = newDataOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__DATA_OPTION, oldDataOption, newDataOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOption(DataOption newDataOption) {
		if (newDataOption != dataOption) {
			NotificationChain msgs = null;
			if (dataOption != null)
				msgs = ((InternalEObject)dataOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__DATA_OPTION, null, msgs);
			if (newDataOption != null)
				msgs = ((InternalEObject)newDataOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__DATA_OPTION, null, msgs);
			msgs = basicSetDataOption(newDataOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__DATA_OPTION, newDataOption, newDataOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOption getEnumOption() {
		return enumOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumOption(EnumOption newEnumOption, NotificationChain msgs) {
		EnumOption oldEnumOption = enumOption;
		enumOption = newEnumOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__ENUM_OPTION, oldEnumOption, newEnumOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumOption(EnumOption newEnumOption) {
		if (newEnumOption != enumOption) {
			NotificationChain msgs = null;
			if (enumOption != null)
				msgs = ((InternalEObject)enumOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__ENUM_OPTION, null, msgs);
			if (newEnumOption != null)
				msgs = ((InternalEObject)newEnumOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__ENUM_OPTION, null, msgs);
			msgs = basicSetEnumOption(newEnumOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__ENUM_OPTION, newEnumOption, newEnumOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOption getNumberOption() {
		return numberOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOption(NumberOption newNumberOption, NotificationChain msgs) {
		NumberOption oldNumberOption = numberOption;
		numberOption = newNumberOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__NUMBER_OPTION, oldNumberOption, newNumberOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOption(NumberOption newNumberOption) {
		if (newNumberOption != numberOption) {
			NotificationChain msgs = null;
			if (numberOption != null)
				msgs = ((InternalEObject)numberOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__NUMBER_OPTION, null, msgs);
			if (newNumberOption != null)
				msgs = ((InternalEObject)newNumberOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.SELECT__NUMBER_OPTION, null, msgs);
			msgs = basicSetNumberOption(newNumberOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.SELECT__NUMBER_OPTION, newNumberOption, newNumberOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VformDSLPackage.SELECT__DATA_OPTION:
				return basicSetDataOption(null, msgs);
			case VformDSLPackage.SELECT__ENUM_OPTION:
				return basicSetEnumOption(null, msgs);
			case VformDSLPackage.SELECT__NUMBER_OPTION:
				return basicSetNumberOption(null, msgs);
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
			case VformDSLPackage.SELECT__INPUT_NAME:
				return getInputName();
			case VformDSLPackage.SELECT__DATA_OPTION:
				return getDataOption();
			case VformDSLPackage.SELECT__ENUM_OPTION:
				return getEnumOption();
			case VformDSLPackage.SELECT__NUMBER_OPTION:
				return getNumberOption();
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
			case VformDSLPackage.SELECT__INPUT_NAME:
				setInputName((String)newValue);
				return;
			case VformDSLPackage.SELECT__DATA_OPTION:
				setDataOption((DataOption)newValue);
				return;
			case VformDSLPackage.SELECT__ENUM_OPTION:
				setEnumOption((EnumOption)newValue);
				return;
			case VformDSLPackage.SELECT__NUMBER_OPTION:
				setNumberOption((NumberOption)newValue);
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
			case VformDSLPackage.SELECT__INPUT_NAME:
				setInputName(INPUT_NAME_EDEFAULT);
				return;
			case VformDSLPackage.SELECT__DATA_OPTION:
				setDataOption((DataOption)null);
				return;
			case VformDSLPackage.SELECT__ENUM_OPTION:
				setEnumOption((EnumOption)null);
				return;
			case VformDSLPackage.SELECT__NUMBER_OPTION:
				setNumberOption((NumberOption)null);
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
			case VformDSLPackage.SELECT__INPUT_NAME:
				return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals(inputName);
			case VformDSLPackage.SELECT__DATA_OPTION:
				return dataOption != null;
			case VformDSLPackage.SELECT__ENUM_OPTION:
				return enumOption != null;
			case VformDSLPackage.SELECT__NUMBER_OPTION:
				return numberOption != null;
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
		result.append(')');
		return result.toString();
	}

} //SelectImpl
