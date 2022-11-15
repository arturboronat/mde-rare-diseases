/**
 * generated by Xtext 2.25.0
 */
package cafeV.dsl.vforms.vformDSL.util;

import cafeV.dsl.vforms.vformDSL.Checkbox;
import cafeV.dsl.vforms.vformDSL.Dat;
import cafeV.dsl.vforms.vformDSL.Data;
import cafeV.dsl.vforms.vformDSL.DataOption;
import cafeV.dsl.vforms.vformDSL.EnumOption;
import cafeV.dsl.vforms.vformDSL.FormInput;
import cafeV.dsl.vforms.vformDSL.FormLayout;
import cafeV.dsl.vforms.vformDSL.Group;
import cafeV.dsl.vforms.vformDSL.Model;
import cafeV.dsl.vforms.vformDSL.NumberOption;
import cafeV.dsl.vforms.vformDSL.Range;
import cafeV.dsl.vforms.vformDSL.Search;
import cafeV.dsl.vforms.vformDSL.Select;
import cafeV.dsl.vforms.vformDSL.Text;
import cafeV.dsl.vforms.vformDSL.VformDSLPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cafeV.dsl.vforms.vformDSL.VformDSLPackage
 * @generated
 */
public class VformDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VformDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VformDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VformDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VformDSLSwitch<Adapter> modelSwitch =
    new VformDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFormLayout(FormLayout object)
      {
        return createFormLayoutAdapter();
      }
      @Override
      public Adapter caseFormInput(FormInput object)
      {
        return createFormInputAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseCheckbox(Checkbox object)
      {
        return createCheckboxAdapter();
      }
      @Override
      public Adapter caseNumber(cafeV.dsl.vforms.vformDSL.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseDat(Dat object)
      {
        return createDatAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseSearch(Search object)
      {
        return createSearchAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseDataOption(DataOption object)
      {
        return createDataOptionAdapter();
      }
      @Override
      public Adapter caseEnumOption(EnumOption object)
      {
        return createEnumOptionAdapter();
      }
      @Override
      public Adapter caseNumberOption(NumberOption object)
      {
        return createNumberOptionAdapter();
      }
      @Override
      public Adapter caseData(Data object)
      {
        return createDataAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.FormLayout <em>Form Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.FormLayout
   * @generated
   */
  public Adapter createFormLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.FormInput <em>Form Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.FormInput
   * @generated
   */
  public Adapter createFormInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Checkbox <em>Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Checkbox
   * @generated
   */
  public Adapter createCheckboxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Dat <em>Dat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Dat
   * @generated
   */
  public Adapter createDatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Search <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Search
   * @generated
   */
  public Adapter createSearchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.DataOption <em>Data Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.DataOption
   * @generated
   */
  public Adapter createDataOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.EnumOption <em>Enum Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.EnumOption
   * @generated
   */
  public Adapter createEnumOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.NumberOption <em>Number Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.NumberOption
   * @generated
   */
  public Adapter createNumberOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cafeV.dsl.vforms.vformDSL.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cafeV.dsl.vforms.vformDSL.Data
   * @generated
   */
  public Adapter createDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VformDSLAdapterFactory