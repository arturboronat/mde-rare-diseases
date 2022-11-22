/**
 */
package cafev.vform.uiProps.impl;

import cafev.vform.uiProps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiPropsFactoryImpl extends EFactoryImpl implements UiPropsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiPropsFactory init() {
		try {
			UiPropsFactory theUiPropsFactory = (UiPropsFactory) EPackage.Registry.INSTANCE
					.getEFactory(UiPropsPackage.eNS_URI);
			if (theUiPropsFactory != null) {
				return theUiPropsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiPropsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPropsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UiPropsPackage.NUMERICAL_PROPS:
			return createNumericalProps();
		case UiPropsPackage.CATEGORICAL_PROPS:
			return createCategoricalProps();
		case UiPropsPackage.PROPS_MODEL:
			return createPropsModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalProps createNumericalProps() {
		NumericalPropsImpl numericalProps = new NumericalPropsImpl();
		return numericalProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoricalProps createCategoricalProps() {
		CategoricalPropsImpl categoricalProps = new CategoricalPropsImpl();
		return categoricalProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropsModel createPropsModel() {
		PropsModelImpl propsModel = new PropsModelImpl();
		return propsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPropsPackage getUiPropsPackage() {
		return (UiPropsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiPropsPackage getPackage() {
		return UiPropsPackage.eINSTANCE;
	}

} //UiPropsFactoryImpl
