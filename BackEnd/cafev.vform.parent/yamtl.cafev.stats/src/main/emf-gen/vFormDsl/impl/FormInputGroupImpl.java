/**
 */
package vFormDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vFormDsl.FormInput;
import vFormDsl.FormInputGroup;
import vFormDsl.VFormDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Input Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vFormDsl.impl.FormInputGroupImpl#getGroupInputs <em>Group Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormInputGroupImpl extends FormInputImpl implements FormInputGroup {
	/**
	 * The cached value of the '{@link #getGroupInputs() <em>Group Inputs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupInputs()
	 * @generated
	 * @ordered
	 */
	protected FormInput groupInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormInputGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VFormDslPackage.Literals.FORM_INPUT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormInput getGroupInputs() {
		if (groupInputs != null && groupInputs.eIsProxy()) {
			InternalEObject oldGroupInputs = (InternalEObject)groupInputs;
			groupInputs = (FormInput)eResolveProxy(oldGroupInputs);
			if (groupInputs != oldGroupInputs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS, oldGroupInputs, groupInputs));
			}
		}
		return groupInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormInput basicGetGroupInputs() {
		return groupInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupInputs(FormInput newGroupInputs) {
		FormInput oldGroupInputs = groupInputs;
		groupInputs = newGroupInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS, oldGroupInputs, groupInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS:
				if (resolve) return getGroupInputs();
				return basicGetGroupInputs();
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
			case VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS:
				setGroupInputs((FormInput)newValue);
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
			case VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS:
				setGroupInputs((FormInput)null);
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
			case VFormDslPackage.FORM_INPUT_GROUP__GROUP_INPUTS:
				return groupInputs != null;
		}
		return super.eIsSet(featureID);
	}

} //FormInputGroupImpl
