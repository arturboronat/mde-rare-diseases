/**
 */
package data_Description.impl;

import data_Description.*;

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
public class Data_DescriptionFactoryImpl extends EFactoryImpl implements Data_DescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data_DescriptionFactory init() {
		try {
			Data_DescriptionFactory theData_DescriptionFactory = (Data_DescriptionFactory) EPackage.Registry.INSTANCE
					.getEFactory(Data_DescriptionPackage.eNS_URI);
			if (theData_DescriptionFactory != null) {
				return theData_DescriptionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data_DescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_DescriptionFactoryImpl() {
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
		case Data_DescriptionPackage.CATEGORICAL_STAT:
			return createCategoricalStat();
		case Data_DescriptionPackage.NUMERICAL_STAT:
			return createNumericalStat();
		case Data_DescriptionPackage.FREQ_TABLE:
			return createfreqTable();
		case Data_DescriptionPackage.DATA_DESCRIPTION:
			return createDataDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoricalStat createCategoricalStat() {
		CategoricalStatImpl categoricalStat = new CategoricalStatImpl();
		return categoricalStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalStat createNumericalStat() {
		NumericalStatImpl numericalStat = new NumericalStatImpl();
		return numericalStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public freqTable createfreqTable() {
		freqTableImpl freqTable = new freqTableImpl();
		return freqTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescription createDataDescription() {
		DataDescriptionImpl dataDescription = new DataDescriptionImpl();
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_DescriptionPackage getData_DescriptionPackage() {
		return (Data_DescriptionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data_DescriptionPackage getPackage() {
		return Data_DescriptionPackage.eINSTANCE;
	}

} //Data_DescriptionFactoryImpl
