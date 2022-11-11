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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vformDSL.FormInput;
import vformDSL.FormLayout;
import vformDSL.Model;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.ModelImpl#getFormLayout <em>Form Layout</em>}</li>
 *   <li>{@link vformDSL.impl.ModelImpl#getFormInput <em>Form Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getFormLayout() <em>Form Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormLayout()
	 * @generated
	 * @ordered
	 */
	protected FormLayout formLayout;

	/**
	 * The cached value of the '{@link #getFormInput() <em>Form Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormInput()
	 * @generated
	 * @ordered
	 */
	protected EList<FormInput> formInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLayout getFormLayout() {
		return formLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormLayout(FormLayout newFormLayout, NotificationChain msgs) {
		FormLayout oldFormLayout = formLayout;
		formLayout = newFormLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VformDSLPackage.MODEL__FORM_LAYOUT, oldFormLayout, newFormLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormLayout(FormLayout newFormLayout) {
		if (newFormLayout != formLayout) {
			NotificationChain msgs = null;
			if (formLayout != null)
				msgs = ((InternalEObject)formLayout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.MODEL__FORM_LAYOUT, null, msgs);
			if (newFormLayout != null)
				msgs = ((InternalEObject)newFormLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VformDSLPackage.MODEL__FORM_LAYOUT, null, msgs);
			msgs = basicSetFormLayout(newFormLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VformDSLPackage.MODEL__FORM_LAYOUT, newFormLayout, newFormLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormInput> getFormInput() {
		if (formInput == null) {
			formInput = new EObjectContainmentEList<FormInput>(FormInput.class, this, VformDSLPackage.MODEL__FORM_INPUT);
		}
		return formInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VformDSLPackage.MODEL__FORM_LAYOUT:
				return basicSetFormLayout(null, msgs);
			case VformDSLPackage.MODEL__FORM_INPUT:
				return ((InternalEList<?>)getFormInput()).basicRemove(otherEnd, msgs);
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
			case VformDSLPackage.MODEL__FORM_LAYOUT:
				return getFormLayout();
			case VformDSLPackage.MODEL__FORM_INPUT:
				return getFormInput();
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
			case VformDSLPackage.MODEL__FORM_LAYOUT:
				setFormLayout((FormLayout)newValue);
				return;
			case VformDSLPackage.MODEL__FORM_INPUT:
				getFormInput().clear();
				getFormInput().addAll((Collection<? extends FormInput>)newValue);
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
			case VformDSLPackage.MODEL__FORM_LAYOUT:
				setFormLayout((FormLayout)null);
				return;
			case VformDSLPackage.MODEL__FORM_INPUT:
				getFormInput().clear();
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
			case VformDSLPackage.MODEL__FORM_LAYOUT:
				return formLayout != null;
			case VformDSLPackage.MODEL__FORM_INPUT:
				return formInput != null && !formInput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
