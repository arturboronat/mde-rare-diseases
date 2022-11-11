/**
 */
package vformDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vformDSL.FormInput;
import vformDSL.Group;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.GroupImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link vformDSL.impl.GroupImpl#getGroupInputs <em>Group Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
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
	 * The cached value of the '{@link #getGroupInputs() <em>Group Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<FormInput> groupInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.GROUP__INPUT_NAME, oldInputName, inputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormInput> getGroupInputs() {
		if (groupInputs == null) {
			groupInputs = new EObjectResolvingEList<FormInput>(FormInput.class, this, VformDSLPackage.GROUP__GROUP_INPUTS);
		}
		return groupInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VformDSLPackage.GROUP__INPUT_NAME:
				return getInputName();
			case VformDSLPackage.GROUP__GROUP_INPUTS:
				return getGroupInputs();
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
			case VformDSLPackage.GROUP__INPUT_NAME:
				setInputName((String)newValue);
				return;
			case VformDSLPackage.GROUP__GROUP_INPUTS:
				getGroupInputs().clear();
				getGroupInputs().addAll((Collection<? extends FormInput>)newValue);
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
			case VformDSLPackage.GROUP__INPUT_NAME:
				setInputName(INPUT_NAME_EDEFAULT);
				return;
			case VformDSLPackage.GROUP__GROUP_INPUTS:
				getGroupInputs().clear();
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
			case VformDSLPackage.GROUP__INPUT_NAME:
				return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals(inputName);
			case VformDSLPackage.GROUP__GROUP_INPUTS:
				return groupInputs != null && !groupInputs.isEmpty();
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

} //GroupImpl
