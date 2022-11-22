/**
 */
package cafev.vform.uiProps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cafev.vform.uiProps.UiPropsFactory
 * @model kind="package"
 * @generated
 */
public interface UiPropsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiProps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uiProps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiProps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPropsPackage eINSTANCE = cafev.vform.uiProps.impl.UiPropsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cafev.vform.uiProps.impl.PropsImpl <em>Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cafev.vform.uiProps.impl.PropsImpl
	 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getProps()
	 * @generated
	 */
	int PROPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS__GROUP_NAME = 2;

	/**
	 * The number of structural features of the '<em>Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cafev.vform.uiProps.impl.NumericalPropsImpl <em>Numerical Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cafev.vform.uiProps.impl.NumericalPropsImpl
	 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getNumericalProps()
	 * @generated
	 */
	int NUMERICAL_PROPS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__NAME = PROPS__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__TYPES = PROPS__TYPES;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__GROUP_NAME = PROPS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__DATA = PROPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Std</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__STD = PROPS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__MIN = PROPS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__MAX = PROPS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS__MEAN = PROPS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Numerical Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS_FEATURE_COUNT = PROPS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Numerical Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_PROPS_OPERATION_COUNT = PROPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cafev.vform.uiProps.impl.CategoricalPropsImpl <em>Categorical Props</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cafev.vform.uiProps.impl.CategoricalPropsImpl
	 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getCategoricalProps()
	 * @generated
	 */
	int CATEGORICAL_PROPS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS__NAME = PROPS__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS__TYPES = PROPS__TYPES;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS__GROUP_NAME = PROPS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS__DATA = PROPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categorical Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS_FEATURE_COUNT = PROPS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Categorical Props</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_PROPS_OPERATION_COUNT = PROPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cafev.vform.uiProps.impl.PropsModelImpl <em>Props Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cafev.vform.uiProps.impl.PropsModelImpl
	 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getPropsModel()
	 * @generated
	 */
	int PROPS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_MODEL__PROPS = 0;

	/**
	 * The number of structural features of the '<em>Props Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Props Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPS_MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link cafev.vform.uiProps.Props <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Props</em>'.
	 * @see cafev.vform.uiProps.Props
	 * @generated
	 */
	EClass getProps();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.Props#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cafev.vform.uiProps.Props#getName()
	 * @see #getProps()
	 * @generated
	 */
	EAttribute getProps_Name();

	/**
	 * Returns the meta object for the attribute list '{@link cafev.vform.uiProps.Props#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see cafev.vform.uiProps.Props#getTypes()
	 * @see #getProps()
	 * @generated
	 */
	EAttribute getProps_Types();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.Props#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see cafev.vform.uiProps.Props#getGroupName()
	 * @see #getProps()
	 * @generated
	 */
	EAttribute getProps_GroupName();

	/**
	 * Returns the meta object for class '{@link cafev.vform.uiProps.NumericalProps <em>Numerical Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Props</em>'.
	 * @see cafev.vform.uiProps.NumericalProps
	 * @generated
	 */
	EClass getNumericalProps();

	/**
	 * Returns the meta object for the attribute list '{@link cafev.vform.uiProps.NumericalProps#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see cafev.vform.uiProps.NumericalProps#getData()
	 * @see #getNumericalProps()
	 * @generated
	 */
	EAttribute getNumericalProps_Data();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.NumericalProps#getStd <em>Std</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std</em>'.
	 * @see cafev.vform.uiProps.NumericalProps#getStd()
	 * @see #getNumericalProps()
	 * @generated
	 */
	EAttribute getNumericalProps_Std();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.NumericalProps#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see cafev.vform.uiProps.NumericalProps#getMin()
	 * @see #getNumericalProps()
	 * @generated
	 */
	EAttribute getNumericalProps_Min();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.NumericalProps#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see cafev.vform.uiProps.NumericalProps#getMax()
	 * @see #getNumericalProps()
	 * @generated
	 */
	EAttribute getNumericalProps_Max();

	/**
	 * Returns the meta object for the attribute '{@link cafev.vform.uiProps.NumericalProps#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see cafev.vform.uiProps.NumericalProps#getMean()
	 * @see #getNumericalProps()
	 * @generated
	 */
	EAttribute getNumericalProps_Mean();

	/**
	 * Returns the meta object for class '{@link cafev.vform.uiProps.CategoricalProps <em>Categorical Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorical Props</em>'.
	 * @see cafev.vform.uiProps.CategoricalProps
	 * @generated
	 */
	EClass getCategoricalProps();

	/**
	 * Returns the meta object for the attribute list '{@link cafev.vform.uiProps.CategoricalProps#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see cafev.vform.uiProps.CategoricalProps#getData()
	 * @see #getCategoricalProps()
	 * @generated
	 */
	EAttribute getCategoricalProps_Data();

	/**
	 * Returns the meta object for class '{@link cafev.vform.uiProps.PropsModel <em>Props Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Props Model</em>'.
	 * @see cafev.vform.uiProps.PropsModel
	 * @generated
	 */
	EClass getPropsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cafev.vform.uiProps.PropsModel#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see cafev.vform.uiProps.PropsModel#getProps()
	 * @see #getPropsModel()
	 * @generated
	 */
	EReference getPropsModel_Props();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiPropsFactory getUiPropsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cafev.vform.uiProps.impl.PropsImpl <em>Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cafev.vform.uiProps.impl.PropsImpl
		 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getProps()
		 * @generated
		 */
		EClass PROPS = eINSTANCE.getProps();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS__NAME = eINSTANCE.getProps_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS__TYPES = eINSTANCE.getProps_Types();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPS__GROUP_NAME = eINSTANCE.getProps_GroupName();

		/**
		 * The meta object literal for the '{@link cafev.vform.uiProps.impl.NumericalPropsImpl <em>Numerical Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cafev.vform.uiProps.impl.NumericalPropsImpl
		 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getNumericalProps()
		 * @generated
		 */
		EClass NUMERICAL_PROPS = eINSTANCE.getNumericalProps();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PROPS__DATA = eINSTANCE.getNumericalProps_Data();

		/**
		 * The meta object literal for the '<em><b>Std</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PROPS__STD = eINSTANCE.getNumericalProps_Std();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PROPS__MIN = eINSTANCE.getNumericalProps_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PROPS__MAX = eINSTANCE.getNumericalProps_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_PROPS__MEAN = eINSTANCE.getNumericalProps_Mean();

		/**
		 * The meta object literal for the '{@link cafev.vform.uiProps.impl.CategoricalPropsImpl <em>Categorical Props</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cafev.vform.uiProps.impl.CategoricalPropsImpl
		 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getCategoricalProps()
		 * @generated
		 */
		EClass CATEGORICAL_PROPS = eINSTANCE.getCategoricalProps();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORICAL_PROPS__DATA = eINSTANCE.getCategoricalProps_Data();

		/**
		 * The meta object literal for the '{@link cafev.vform.uiProps.impl.PropsModelImpl <em>Props Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cafev.vform.uiProps.impl.PropsModelImpl
		 * @see cafev.vform.uiProps.impl.UiPropsPackageImpl#getPropsModel()
		 * @generated
		 */
		EClass PROPS_MODEL = eINSTANCE.getPropsModel();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPS_MODEL__PROPS = eINSTANCE.getPropsModel_Props();

	}

} //UiPropsPackage
