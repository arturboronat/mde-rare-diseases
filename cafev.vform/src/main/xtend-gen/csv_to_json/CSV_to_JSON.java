package csv_to_json;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import runtimeModel.AttributeValue;
import runtimeModel.ContainmentValue;
import runtimeModel.DynamicEObject;
import runtimeModel.DynamicEObjectType;
import runtimeModel.FeatureType;
import runtimeModel.FeatureValue;
import runtimeModel.RuntimeModel;
import runtimeModel.RuntimeModelFactory;
import runtimeModel.RuntimeModelPackage;
import yamtl.core.YAMTLModule;
import yamtl.core.s;
import yamtl.dsl.OutputElementCS;
import yamtl.dsl.Rule;

@SuppressWarnings("all")
public class CSV_to_JSON extends YAMTLModule {
  private final RuntimeModelPackage CSV = RuntimeModelPackage.eINSTANCE;

  private final EcorePackage ECORE = EcorePackage.eINSTANCE;

  public CSV_to_JSON() {
    this.header().in("in", this.CSV).out("out", this.CSV);
    OutputElementCS _out = Rule.rule("root").in("inModel", this.CSV.getRuntimeModel()).out("outModel", this.CSV.getRuntimeModel());
    final Procedure0 _function = () -> {
      final DynamicEObject obj = RuntimeModelFactory.eINSTANCE.createDynamicEObject();
      Object _fetch = this.fetch(this.inOt().getOwningModel());
      obj.setOwningModel(((RuntimeModel) _fetch));
      obj.setType(this.outOt());
      DynamicEObjectType _outOt = this.outOt();
      Object _fetch_1 = this.fetch(this.inOt().getOwningModel());
      _outOt.setOwningModel(((RuntimeModel) _fetch_1));
    };
    OutputElementCS _out_1 = Rule.rule("ObjectType").in("inOt", this.CSV.getDynamicEObjectType()).out("outOt", this.CSV.getDynamicEObjectType(), _function);
    final Function0<Boolean> _function_1 = () -> {
      return Boolean.valueOf(this.isNumeric(this.inFt()));
    };
    final Procedure0 _function_2 = () -> {
      FeatureType _outFt = this.outFt();
      _outFt.setName(this.inFt().getName());
      FeatureType _outFt_1 = this.outFt();
      Object _fetch = this.fetch(this.inFt().getOwningObjectType());
      _outFt_1.setOwningObjectType(((DynamicEObjectType) _fetch));
      final AttributeValue att = RuntimeModelFactory.eINSTANCE.createAttributeValue();
      EList<FeatureValue> _featureValues = this.outFt().getFeatureValues();
      _featureValues.add(att);
      Object _fetch_1 = this.fetch(this.inFt().getOwningObjectType());
      att.setContainingDynamicEObject(((DynamicEObjectType) _fetch_1).getInstances().get(0));
      final Function1<FeatureValue, AttributeValue> _function_3 = (FeatureValue it) -> {
        return ((AttributeValue) it);
      };
      final Function1<AttributeValue, Object> _function_4 = (AttributeValue it) -> {
        return it.getValue();
      };
      final List<Object> list = ListExtensions.<AttributeValue, Object>map(ListExtensions.<FeatureValue, AttributeValue>map(this.inFt().getFeatureValues(), _function_3), _function_4);
      att.setValue(list);
    };
    OutputElementCS _out_2 = Rule.rule("FeatureType").in("inFt", this.CSV.getFeatureType()).filter(_function_1).out("outFt", this.CSV.getFeatureType(), _function_2);
    this.ruleStore(Collections.<s>unmodifiableList(CollectionLiterals.<s>newArrayList(_out, _out_1, _out_2)));
  }

  public boolean isNumeric(final FeatureType inFt) {
    return (Objects.equal(inFt.getEmfType(), this.ECORE.getEDouble()) || (Objects.equal(inFt.getEmfType(), this.ECORE.getEInt()) && 
      (IterableExtensions.<Object>toSet(ListExtensions.<FeatureValue, Object>map(inFt.getFeatureValues(), ((Function1<FeatureValue, Object>) (FeatureValue it) -> {
        return ((AttributeValue) it).getValue();
      }))).size() > 1)));
  }

  /**
   * HELPERS: generated with runner.generateBoilerplateCode()
   */
  public AttributeValue att() {
    Object _fetch = this.fetch("att");
    return ((AttributeValue) _fetch);
  }

  public DynamicEObject inObj() {
    Object _fetch = this.fetch("inObj");
    return ((DynamicEObject) _fetch);
  }

  public DynamicEObject outObj() {
    Object _fetch = this.fetch("outObj");
    return ((DynamicEObject) _fetch);
  }

  public FeatureType inFt() {
    Object _fetch = this.fetch("inFt");
    return ((FeatureType) _fetch);
  }

  public FeatureType outFt() {
    Object _fetch = this.fetch("outFt");
    return ((FeatureType) _fetch);
  }

  public DynamicEObjectType inOt() {
    Object _fetch = this.fetch("inOt");
    return ((DynamicEObjectType) _fetch);
  }

  public DynamicEObjectType outOt() {
    Object _fetch = this.fetch("outOt");
    return ((DynamicEObjectType) _fetch);
  }

  public AttributeValue inAtt() {
    Object _fetch = this.fetch("inAtt");
    return ((AttributeValue) _fetch);
  }

  public AttributeValue outAtt() {
    Object _fetch = this.fetch("outAtt");
    return ((AttributeValue) _fetch);
  }

  public ContainmentValue inCont() {
    Object _fetch = this.fetch("inCont");
    return ((ContainmentValue) _fetch);
  }

  public ContainmentValue outCont() {
    Object _fetch = this.fetch("outCont");
    return ((ContainmentValue) _fetch);
  }

  public RuntimeModel inModel() {
    Object _fetch = this.fetch("inModel");
    return ((RuntimeModel) _fetch);
  }

  public RuntimeModel outModel() {
    Object _fetch = this.fetch("outModel");
    return ((RuntimeModel) _fetch);
  }
}
