package csv_to_props;

import cafev.vform.uiProps.CategoricalProps;
import cafev.vform.uiProps.NumericalProps;
import cafev.vform.uiProps.PropsModel;
import cafev.vform.uiProps.UiPropsPackage;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import runtimeModel.AttributeValue;
import runtimeModel.FeatureType;
import runtimeModel.FeatureValue;
import runtimeModel.RuntimeModelPackage;
import yamtl.core.YAMTLModule;
import yamtl.core.s;
import yamtl.dsl.OutputElementCS;
import yamtl.dsl.Rule;

/**
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
@SuppressWarnings("all")
public class csv2props extends YAMTLModule {
  private final EcorePackage ECORE = EcorePackage.eINSTANCE;

  private final RuntimeModelPackage CSV = RuntimeModelPackage.eINSTANCE;

  private final UiPropsPackage UP = UiPropsPackage.eINSTANCE;

  public csv2props() {
    this.header().in("csv", this.CSV).out("up", this.UP);
    OutputElementCS _out = Rule.rule("PropsModel").in("m", this.CSV.getRuntimeModel()).out("up", this.UP.getPropsModel());
    final Function0<Boolean> _function = () -> {
      return Boolean.valueOf((Objects.equal(this.ft().getEmfType(), this.ECORE.getEString()) || 
        ((Objects.equal(this.ft().getEmfType(), this.ECORE.getEDouble()) || Objects.equal(this.ft().getEmfType(), this.ECORE.getEInt())) && 
          (IterableExtensions.<Object>toSet(ListExtensions.<FeatureValue, Object>map(this.ft().getFeatureValues(), ((Function1<FeatureValue, Object>) (FeatureValue it) -> {
            return ((AttributeValue) it).getValue();
          }))).size() <= 1))));
    };
    final Procedure0 _function_1 = () -> {
      final String dnaPattern = "[A-z]+[.][0-9]+[A-z]*[>][A-z]+|[A-z]+[:][0-9]+[;]?";
      final String datePattern = "^(0?[1-9]|[12][0-9]|3[01])[//\\-](0?[1-9]|1[012])[//\\-]\\d{4}$";
      final ArrayList<String> types = new ArrayList<String>();
      final Function1<FeatureValue, String> _function_2 = (FeatureValue it) -> {
        return ((AttributeValue) it).getValue().toString();
      };
      final Set<String> data = IterableExtensions.<String>toSet(ListExtensions.<FeatureValue, String>map(this.ft().getFeatureValues(), _function_2));
      CategoricalProps _cp = this.cp();
      _cp.setName(this.ft().getName());
      CategoricalProps _cp_1 = this.cp();
      _cp_1.setGroupName(this.groupByName(this.ft().getName()));
      if (((data.size() > 2) && (data.size() <= 10))) {
        types.add("select");
        types.add("search");
      } else {
        int _size = data.size();
        boolean _lessEqualsThan = (_size <= 2);
        if (_lessEqualsThan) {
          types.add("select");
          types.add("checkbox");
        } else {
          types.add("search");
          types.add("select");
        }
      }
      final Consumer<String> _function_3 = (String it) -> {
        EList<String> _data = this.cp().getData();
        _data.add(it);
        if ((it.matches(datePattern) && (!types.contains("date")))) {
          boolean _contains = types.contains("search");
          if (_contains) {
            types.remove(String.valueOf("search"));
          }
          types.add(0, "date");
        }
        if ((it.matches(dnaPattern) && (!Objects.equal(this.cp().getGroupName(), "DNA SEQUENCE")))) {
          CategoricalProps _cp_2 = this.cp();
          _cp_2.setGroupName("DNA SEQUENCE");
        }
      };
      data.forEach(_function_3);
      this.cp().getTypes().addAll(types);
    };
    OutputElementCS _out_1 = Rule.rule("CategoricalProps").in("ft", this.CSV.getFeatureType()).filter(_function).out("cp", this.UP.getCategoricalProps(), _function_1);
    final Function0<Boolean> _function_2 = () -> {
      return Boolean.valueOf((Objects.equal(this.ft().getEmfType(), this.ECORE.getEDouble()) || (Objects.equal(this.ft().getEmfType(), this.ECORE.getEInt()) && 
        (IterableExtensions.<Object>toSet(ListExtensions.<FeatureValue, Object>map(this.ft().getFeatureValues(), ((Function1<FeatureValue, Object>) (FeatureValue it) -> {
          return ((AttributeValue) it).getValue();
        }))).size() > 1))));
    };
    final Procedure0 _function_3 = () -> {
      final DescriptiveStatistics d = new DescriptiveStatistics();
      final ArrayList<String> types = new ArrayList<String>();
      EList<FeatureValue> _featureValues = this.ft().getFeatureValues();
      for (final FeatureValue fv : _featureValues) {
        d.addValue((this.toDouble(((AttributeValue) fv).getValue())).doubleValue());
      }
      NumericalProps _np = this.np();
      _np.setMin(d.getMin());
      NumericalProps _np_1 = this.np();
      _np_1.setMax(d.getMax());
      NumericalProps _np_2 = this.np();
      _np_2.setMean(d.getMean());
      NumericalProps _np_3 = this.np();
      _np_3.setStd(d.getStandardDeviation());
      NumericalProps _np_4 = this.np();
      _np_4.setName(this.ft().getName());
      NumericalProps _np_5 = this.np();
      _np_5.setGroupName(this.groupByName(this.ft().getName()));
      double _max = d.getMax();
      double _min = d.getMin();
      double _minus = (_max - _min);
      boolean _lessThan = (_minus < 100);
      if (_lessThan) {
        types.add("range");
        types.add("select");
        types.add("number");
      } else {
        types.add("select");
        types.add("range");
        types.add("number");
      }
      final Function1<FeatureValue, Double> _function_4 = (FeatureValue it) -> {
        return this.toDouble(((AttributeValue) it).getValue());
      };
      final List<Double> data = ListExtensions.<FeatureValue, Double>map(this.ft().getFeatureValues(), _function_4);
      final Consumer<Double> _function_5 = (Double it) -> {
        EList<Double> _data = this.np().getData();
        _data.add(it);
      };
      data.forEach(_function_5);
      this.np().getTypes().addAll(types);
    };
    OutputElementCS _out_2 = Rule.rule("NumericalProps").in("ft", this.CSV.getFeatureType()).filter(_function_2).out("np", this.UP.getNumericalProps(), _function_3);
    this.ruleStore(Collections.<s>unmodifiableList(CollectionLiterals.<s>newArrayList(_out, _out_1, _out_2)));
  }

  /**
   * HELPERS: generated with runner.generateBoilerplateCode()
   */
  public AttributeValue att() {
    Object _fetch = this.fetch("att");
    return ((AttributeValue) _fetch);
  }

  public FeatureType ft() {
    Object _fetch = this.fetch("ft");
    return ((FeatureType) _fetch);
  }

  public CategoricalProps cp() {
    Object _fetch = this.fetch("cp");
    return ((CategoricalProps) _fetch);
  }

  public NumericalProps np() {
    Object _fetch = this.fetch("np");
    return ((NumericalProps) _fetch);
  }

  public PropsModel up() {
    Object _fetch = this.fetch(this.ft().getOwningObjectType().getOwningModel());
    return ((PropsModel) _fetch);
  }

  public String groupByName(final String name) {
    final Pattern pattern = Pattern.compile("sex|gender|height|weight|age|birth|subject|patient");
    boolean _find = pattern.matcher(name).find();
    if (_find) {
      return "DEMOGRAPHICS";
    } else {
      return "UNCLASSIFIED";
    }
  }

  public Double toDouble(final Object i) {
    try {
      boolean _matched = false;
      if (i instanceof Integer) {
        _matched=true;
        return Double.valueOf(((Integer) i).intValue());
      }
      if (!_matched) {
        if (i instanceof Double) {
          _matched=true;
          return ((Double)i);
        }
      }
      String _string = i.toString();
      String _plus = ("Undefined: " + _string);
      throw new Exception(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
