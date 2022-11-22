package csv_to_sd;

import com.google.common.base.Objects;
import dataDescription.CategoricalType;
import dataDescription.DataDescriptionFactory;
import dataDescription.DataDescriptionPackage;
import dataDescription.FrequencyEntry;
import dataDescription.NumericalType;
import dataDescription.StatsDataModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
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

@SuppressWarnings("all")
public class CSV_to_SD extends YAMTLModule {
  private final EcorePackage ECORE = EcorePackage.eINSTANCE;

  private final RuntimeModelPackage CSV = RuntimeModelPackage.eINSTANCE;

  private final DataDescriptionPackage DD = DataDescriptionPackage.eINSTANCE;

  public CSV_to_SD() {
    this.header().in("csv", this.CSV).out("dd", this.DD);
    OutputElementCS _out = Rule.rule("StatsDataModel").in("m", this.CSV.getRuntimeModel()).out("dm", this.DD.getStatsDataModel());
    final Function0<Boolean> _function = () -> {
      return Boolean.valueOf((Objects.equal(this.ft().getEmfType(), this.ECORE.getEString()) || 
        ((Objects.equal(this.ft().getEmfType(), this.ECORE.getEDouble()) || Objects.equal(this.ft().getEmfType(), this.ECORE.getEInt())) && 
          (IterableExtensions.<Object>toSet(ListExtensions.<FeatureValue, Object>map(this.ft().getFeatureValues(), ((Function1<FeatureValue, Object>) (FeatureValue it) -> {
            return ((AttributeValue) it).getValue();
          }))).size() <= 1))));
    };
    final Procedure0 _function_1 = () -> {
      this.m().getTypes().add(this.ct());
      CategoricalType _ct = this.ct();
      _ct.setName(this.ft().getName());
      CategoricalType _ct_1 = this.ct();
      _ct_1.setDataType(this.ECORE.getEString());
      final Function1<FeatureValue, AttributeValue> _function_2 = (FeatureValue it) -> {
        return ((AttributeValue) it);
      };
      final Function1<AttributeValue, Object> _function_3 = (AttributeValue it) -> {
        return it.getValue();
      };
      final Map<Object, List<AttributeValue>> group = IterableExtensions.<Object, AttributeValue>groupBy(ListExtensions.<FeatureValue, AttributeValue>map(this.ft().getFeatureValues(), _function_2), _function_3);
      final Consumer<Map.Entry<Object, List<AttributeValue>>> _function_4 = (Map.Entry<Object, List<AttributeValue>> it) -> {
        final FrequencyEntry entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry();
        entry.setName(it.getKey().toString());
        entry.setFrequency(it.getValue().size());
        EList<FrequencyEntry> _frequencyTable = this.ct().getFrequencyTable();
        _frequencyTable.add(entry);
      };
      group.entrySet().forEach(_function_4);
    };
    OutputElementCS _out_1 = Rule.rule("CategoricalType").in("ft", this.CSV.getFeatureType()).filter(_function).out("ct", this.DD.getCategoricalType(), _function_1);
    final Function0<Boolean> _function_2 = () -> {
      return Boolean.valueOf((Objects.equal(this.ft().getEmfType(), this.ECORE.getEDouble()) || (Objects.equal(this.ft().getEmfType(), this.ECORE.getEInt()) && 
        (IterableExtensions.<Object>toSet(ListExtensions.<FeatureValue, Object>map(this.ft().getFeatureValues(), ((Function1<FeatureValue, Object>) (FeatureValue it) -> {
          return ((AttributeValue) it).getValue();
        }))).size() > 1))));
    };
    final Procedure0 _function_3 = () -> {
      this.m().getTypes().add(this.nt());
      NumericalType _nt = this.nt();
      _nt.setName(this.ft().getName());
      final DescriptiveStatistics d = new DescriptiveStatistics();
      EList<FeatureValue> _featureValues = this.ft().getFeatureValues();
      for (final FeatureValue fv : _featureValues) {
        d.addValue((this.toDouble(((AttributeValue) fv).getValue())).doubleValue());
      }
      NumericalType _nt_1 = this.nt();
      _nt_1.setMin(d.getMin());
      NumericalType _nt_2 = this.nt();
      _nt_2.setMax(d.getMax());
      NumericalType _nt_3 = this.nt();
      _nt_3.setMean(d.getMean());
      NumericalType _nt_4 = this.nt();
      _nt_4.setStd(d.getStandardDeviation());
      double lowerBound_ = d.getMean();
      double _mean = d.getMean();
      double _standardDeviation = d.getStandardDeviation();
      double upperBound_ = (_mean + _standardDeviation);
      while ((lowerBound_ < d.getMax())) {
        {
          double _lowerBound_ = lowerBound_;
          double _standardDeviation_1 = d.getStandardDeviation();
          lowerBound_ = (_lowerBound_ + _standardDeviation_1);
          double _upperBound_ = upperBound_;
          double _standardDeviation_2 = d.getStandardDeviation();
          upperBound_ = (_upperBound_ + _standardDeviation_2);
          final double lowerBound = lowerBound_;
          final double upperBound = upperBound_;
          final FrequencyEntry entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("]�lowerBound�, �upperBound�]");
          entry.setName(_builder.toString());
          final Function1<FeatureValue, AttributeValue> _function_4 = (FeatureValue it) -> {
            return ((AttributeValue) it);
          };
          final Function1<AttributeValue, Boolean> _function_5 = (AttributeValue it) -> {
            return Boolean.valueOf((((this.toDouble(it.getValue())).doubleValue() >= lowerBound) || ((this.toDouble(it.getValue())).doubleValue() < upperBound)));
          };
          entry.setFrequency(IterableExtensions.size(IterableExtensions.<AttributeValue>filter(ListExtensions.<FeatureValue, AttributeValue>map(this.ft().getFeatureValues(), _function_4), _function_5)));
          EList<FrequencyEntry> _frequencyTable = this.nt().getFrequencyTable();
          _frequencyTable.add(entry);
        }
      }
      double _mean_1 = d.getMean();
      double _standardDeviation_1 = d.getStandardDeviation();
      double _minus = (_mean_1 - _standardDeviation_1);
      lowerBound_ = _minus;
      upperBound_ = d.getMean();
      while ((upperBound_ > d.getMin())) {
        {
          double _lowerBound_ = lowerBound_;
          double _standardDeviation_2 = d.getStandardDeviation();
          lowerBound_ = (_lowerBound_ - _standardDeviation_2);
          double _upperBound_ = upperBound_;
          double _standardDeviation_3 = d.getStandardDeviation();
          upperBound_ = (_upperBound_ - _standardDeviation_3);
          final double lowerBound = lowerBound_;
          final double upperBound = upperBound_;
          final FrequencyEntry entry = DataDescriptionFactory.eINSTANCE.createFrequencyEntry();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("]�lowerBound�, �upperBound�]");
          entry.setName(_builder.toString());
          final Function1<FeatureValue, AttributeValue> _function_4 = (FeatureValue it) -> {
            return ((AttributeValue) it);
          };
          final Function1<AttributeValue, Boolean> _function_5 = (AttributeValue it) -> {
            return Boolean.valueOf((((this.toDouble(it.getValue())).doubleValue() >= lowerBound) || ((this.toDouble(it.getValue())).doubleValue() < upperBound)));
          };
          entry.setFrequency(IterableExtensions.size(IterableExtensions.<AttributeValue>filter(ListExtensions.<FeatureValue, AttributeValue>map(this.ft().getFeatureValues(), _function_4), _function_5)));
          EList<FrequencyEntry> _frequencyTable = this.nt().getFrequencyTable();
          _frequencyTable.add(entry);
        }
      }
    };
    OutputElementCS _out_2 = Rule.rule("NumericalType").in("ft", this.CSV.getFeatureType()).filter(_function_2).out("nt", this.DD.getNumericalType(), _function_3);
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

  public CategoricalType ct() {
    Object _fetch = this.fetch("ct");
    return ((CategoricalType) _fetch);
  }

  public NumericalType nt() {
    Object _fetch = this.fetch("nt");
    return ((NumericalType) _fetch);
  }

  public StatsDataModel m() {
    Object _fetch = this.fetch(this.ft().getOwningObjectType().getOwningModel());
    return ((StatsDataModel) _fetch);
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
