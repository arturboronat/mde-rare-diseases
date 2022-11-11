/**
 */
package vformDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vformDSL.Checkbox;
import vformDSL.Dat;
import vformDSL.FormInput;
import vformDSL.Group;
import vformDSL.Range;
import vformDSL.Search;
import vformDSL.Select;
import vformDSL.Text;
import vformDSL.VformDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vformDSL.impl.FormInputImpl#getText <em>Text</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getDat <em>Dat</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getRange <em>Range</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link vformDSL.impl.FormInputImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormInputImpl extends MinimalEObjectImpl.Container implements FormInput {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> text;

	/**
	 * The cached value of the '{@link #getCheckbox() <em>Checkbox</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckbox()
	 * @generated
	 * @ordered
	 */
	protected EList<Checkbox> checkbox;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<vformDSL.Number> number;

	/**
	 * The cached value of the '{@link #getDat() <em>Dat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDat()
	 * @generated
	 * @ordered
	 */
	protected EList<Dat> dat;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> range;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<Select> select;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> search;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VformDSLPackage.Literals.FORM_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<Text>(Text.class, this, VformDSLPackage.FORM_INPUT__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Checkbox> getCheckbox() {
		if (checkbox == null) {
			checkbox = new EObjectContainmentEList<Checkbox>(Checkbox.class, this, VformDSLPackage.FORM_INPUT__CHECKBOX);
		}
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<vformDSL.Number> getNumber() {
		if (number == null) {
			number = new EObjectContainmentEList<vformDSL.Number>(vformDSL.Number.class, this, VformDSLPackage.FORM_INPUT__NUMBER);
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dat> getDat() {
		if (dat == null) {
			dat = new EObjectContainmentEList<Dat>(Dat.class, this, VformDSLPackage.FORM_INPUT__DAT);
		}
		return dat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Range> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<Range>(Range.class, this, VformDSLPackage.FORM_INPUT__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Select> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<Select>(Select.class, this, VformDSLPackage.FORM_INPUT__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Search> getSearch() {
		if (search == null) {
			search = new EObjectContainmentEList<Search>(Search.class, this, VformDSLPackage.FORM_INPUT__SEARCH);
		}
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, VformDSLPackage.FORM_INPUT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VformDSLPackage.FORM_INPUT__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__CHECKBOX:
				return ((InternalEList<?>)getCheckbox()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__NUMBER:
				return ((InternalEList<?>)getNumber()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__DAT:
				return ((InternalEList<?>)getDat()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__SEARCH:
				return ((InternalEList<?>)getSearch()).basicRemove(otherEnd, msgs);
			case VformDSLPackage.FORM_INPUT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case VformDSLPackage.FORM_INPUT__TEXT:
				return getText();
			case VformDSLPackage.FORM_INPUT__CHECKBOX:
				return getCheckbox();
			case VformDSLPackage.FORM_INPUT__NUMBER:
				return getNumber();
			case VformDSLPackage.FORM_INPUT__DAT:
				return getDat();
			case VformDSLPackage.FORM_INPUT__RANGE:
				return getRange();
			case VformDSLPackage.FORM_INPUT__SELECT:
				return getSelect();
			case VformDSLPackage.FORM_INPUT__SEARCH:
				return getSearch();
			case VformDSLPackage.FORM_INPUT__GROUP:
				return getGroup();
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
			case VformDSLPackage.FORM_INPUT__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__CHECKBOX:
				getCheckbox().clear();
				getCheckbox().addAll((Collection<? extends Checkbox>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__NUMBER:
				getNumber().clear();
				getNumber().addAll((Collection<? extends vformDSL.Number>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__DAT:
				getDat().clear();
				getDat().addAll((Collection<? extends Dat>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Range>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends Select>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__SEARCH:
				getSearch().clear();
				getSearch().addAll((Collection<? extends Search>)newValue);
				return;
			case VformDSLPackage.FORM_INPUT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
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
			case VformDSLPackage.FORM_INPUT__TEXT:
				getText().clear();
				return;
			case VformDSLPackage.FORM_INPUT__CHECKBOX:
				getCheckbox().clear();
				return;
			case VformDSLPackage.FORM_INPUT__NUMBER:
				getNumber().clear();
				return;
			case VformDSLPackage.FORM_INPUT__DAT:
				getDat().clear();
				return;
			case VformDSLPackage.FORM_INPUT__RANGE:
				getRange().clear();
				return;
			case VformDSLPackage.FORM_INPUT__SELECT:
				getSelect().clear();
				return;
			case VformDSLPackage.FORM_INPUT__SEARCH:
				getSearch().clear();
				return;
			case VformDSLPackage.FORM_INPUT__GROUP:
				getGroup().clear();
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
			case VformDSLPackage.FORM_INPUT__TEXT:
				return text != null && !text.isEmpty();
			case VformDSLPackage.FORM_INPUT__CHECKBOX:
				return checkbox != null && !checkbox.isEmpty();
			case VformDSLPackage.FORM_INPUT__NUMBER:
				return number != null && !number.isEmpty();
			case VformDSLPackage.FORM_INPUT__DAT:
				return dat != null && !dat.isEmpty();
			case VformDSLPackage.FORM_INPUT__RANGE:
				return range != null && !range.isEmpty();
			case VformDSLPackage.FORM_INPUT__SELECT:
				return select != null && !select.isEmpty();
			case VformDSLPackage.FORM_INPUT__SEARCH:
				return search != null && !search.isEmpty();
			case VformDSLPackage.FORM_INPUT__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormInputImpl
