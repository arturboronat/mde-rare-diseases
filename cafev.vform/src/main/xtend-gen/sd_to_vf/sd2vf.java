package sd_to_vf;

import cafev.vform.vFormDsl.BasicInputType;
import cafev.vform.vFormDsl.EnumOption;
import cafev.vform.vFormDsl.FormInputBasic;
import cafev.vform.vFormDsl.FormInputRange;
import cafev.vform.vFormDsl.FormInputSearch;
import cafev.vform.vFormDsl.FormInputSelect;
import cafev.vform.vFormDsl.FormLayout;
import cafev.vform.vFormDsl.Layout;
import cafev.vform.vFormDsl.Model;
import cafev.vform.vFormDsl.OptionItem;
import cafev.vform.vFormDsl.StringOptionItem;
import cafev.vform.vFormDsl.VFormDslPackage;
import com.google.common.collect.Iterables;
import dataDescription.CategoricalType;
import dataDescription.DataDescriptionPackage;
import dataDescription.FrequencyEntry;
import dataDescription.NumericalType;
import dataDescription.StatsDataModel;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import yamtl.core.YAMTLModule;
import yamtl.core.s;
import yamtl.dsl.OutputElementCS;
import yamtl.dsl.Rule;

/**
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
@SuppressWarnings("all")
public class sd2vf extends YAMTLModule {
  private final DataDescriptionPackage DD = DataDescriptionPackage.eINSTANCE;

  private final VFormDslPackage VF = VFormDslPackage.eINSTANCE;

  public sd2vf() {
    this.header().in("dd", this.DD).out("vf", this.VF);
    final Procedure0 _function = () -> {
      Model _m = this.m();
      _m.setFormLayout(this.fl());
    };
    final Procedure0 _function_1 = () -> {
      FormLayout _fl = this.fl();
      _fl.setLayout(Layout.HORIZONTAL);
    };
    OutputElementCS _out = Rule.rule("Init").in("sd", this.DD.getStatsDataModel()).out("m", this.VF.getModel(), _function).out("fl", this.VF.getFormLayout(), _function_1);
    final Function0<Boolean> _function_2 = () -> {
      int _size = this.ct().getFrequencyTable().size();
      return Boolean.valueOf((_size <= 2));
    };
    final Procedure0 _function_3 = () -> {
      EObject _eContainer = this.ct().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputBasic _fib = this.fib();
      _fib.setName(this.ct().getName());
      FormInputBasic _fib_1 = this.fib();
      _fib_1.setType(BasicInputType.CHECKBOX);
      m.getFormInput().add(this.fib());
    };
    OutputElementCS _out_1 = Rule.rule("Checkbox").in("ct", this.DD.getCategoricalType()).filter(_function_2).out("fib", this.VF.getFormInputBasic(), _function_3);
    final Procedure0 _function_4 = () -> {
      EObject _eContainer = this.ct().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputBasic _fib = this.fib();
      _fib.setName(this.ct().getName());
      FormInputBasic _fib_1 = this.fib();
      _fib_1.setType(BasicInputType.TEXT);
      m.getFormInput().add(this.fib());
    };
    OutputElementCS _out_2 = Rule.rule("Text").in("ct", this.DD.getCategoricalType()).out("fib", this.VF.getFormInputBasic(), _function_4);
    final Procedure0 _function_5 = () -> {
      EObject _eContainer = this.nt().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputBasic _fib = this.fib();
      _fib.setName(this.nt().getName());
      FormInputBasic _fib_1 = this.fib();
      _fib_1.setType(BasicInputType.NUMBER);
      m.getFormInput().add(this.fib());
    };
    OutputElementCS _out_3 = Rule.rule("Number").in("nt", this.DD.getNumericalType()).out("fib", this.VF.getFormInputBasic(), _function_5);
    final Procedure0 _function_6 = () -> {
      EObject _eContainer = this.nt().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputRange _rg = this.rg();
      _rg.setName(this.nt().getName());
      FormInputRange _rg_1 = this.rg();
      _rg_1.setMin(Math.toIntExact(Math.round(this.nt().getMin())));
      FormInputRange _rg_2 = this.rg();
      _rg_2.setMax(Math.toIntExact(Math.round(this.nt().getMax())));
      m.getFormInput().add(this.rg());
    };
    OutputElementCS _out_4 = Rule.rule("Range").in("nt", this.DD.getNumericalType()).out("rg", this.VF.getFormInputRange(), _function_6);
    final Function0<Boolean> _function_7 = () -> {
      boolean _xblockexpression = false;
      {
        Object _fetch = this.fetch("ct");
        final CategoricalType ct = ((CategoricalType) _fetch);
        int _size = ct.getFrequencyTable().size();
        _xblockexpression = (_size > 10);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    final Procedure0 _function_8 = () -> {
      EObject _eContainer = this.ct().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputSearch _sch = this.sch();
      _sch.setName(this.ct().getName());
      EList<OptionItem> _data = this.sch().getData();
      Object _fetch_1 = this.fetch(this.ct().getFrequencyTable(), "stringOptionItem");
      Iterables.<OptionItem>addAll(_data, ((List<StringOptionItem>) _fetch_1));
      m.getFormInput().add(this.sch());
    };
    OutputElementCS _out_5 = Rule.rule("Search").in("ct", this.DD.getCategoricalType()).filter(_function_7).out("sch", this.VF.getFormInputSearch(), _function_8);
    final Function0<Boolean> _function_9 = () -> {
      boolean _xblockexpression = false;
      {
        Object _fetch = this.fetch("ct");
        final CategoricalType ct = ((CategoricalType) _fetch);
        int _size = ct.getFrequencyTable().size();
        _xblockexpression = (_size <= 10);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    final Procedure0 _function_10 = () -> {
      EObject _eContainer = this.ct().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputSelect _slt = this.slt();
      _slt.setName(this.ct().getName());
      FormInputSelect _slt_1 = this.slt();
      _slt_1.setOption(this.opt());
      m.getFormInput().add(this.slt());
    };
    final Procedure0 _function_11 = () -> {
      EList<OptionItem> _data = this.opt().getData();
      Object _fetch = this.fetch(this.ct().getFrequencyTable(), "stringOptionItem");
      Iterables.<OptionItem>addAll(_data, ((List<StringOptionItem>) _fetch));
    };
    OutputElementCS _out_6 = Rule.rule("Categorical Select").in("ct", this.DD.getCategoricalType()).filter(_function_9).out("slt", this.VF.getFormInputSelect(), _function_10).out("opt", this.VF.getEnumOption(), _function_11);
    final Function0<Boolean> _function_12 = () -> {
      boolean _xblockexpression = false;
      {
        Object _fetch = this.fetch("nt");
        final NumericalType nt = ((NumericalType) _fetch);
        int _size = nt.getFrequencyTable().size();
        _xblockexpression = (_size <= 10);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    final Procedure0 _function_13 = () -> {
      EObject _eContainer = this.nt().eContainer();
      Object _fetch = this.fetch(((StatsDataModel) _eContainer), "m");
      final Model m = ((Model) _fetch);
      FormInputSelect _slt = this.slt();
      _slt.setName(this.nt().getName());
      FormInputSelect _slt_1 = this.slt();
      _slt_1.setOption(this.opt());
      m.getFormInput().add(this.slt());
    };
    final Procedure0 _function_14 = () -> {
      EList<OptionItem> _data = this.opt().getData();
      Object _fetch = this.fetch(this.nt().getFrequencyTable(), "stringOptionItem");
      Iterables.<OptionItem>addAll(_data, ((List<StringOptionItem>) _fetch));
    };
    OutputElementCS _out_7 = Rule.rule("Numerical Select").in("nt", this.DD.getNumericalType()).filter(_function_12).out("slt", this.VF.getFormInputSelect(), _function_13).out("opt", this.VF.getEnumOption(), _function_14);
    final Procedure0 _function_15 = () -> {
      StringOptionItem _soi = this.soi();
      _soi.setValue(this.fe().getName());
    };
    OutputElementCS _out_8 = Rule.rule("stringOptionItem").isUniqueLazy().in("fe", this.DD.getFrequencyEntry()).out("soi", this.VF.getStringOptionItem(), _function_15);
    this.ruleStore(Collections.<s>unmodifiableList(CollectionLiterals.<s>newArrayList(_out, _out_1, _out_2, _out_3, _out_4, _out_5, _out_6, _out_7, _out_8)));
  }

  /**
   * HELPERS: generated with runner.generateBoilerplateCode()
   */
  public StatsDataModel sd() {
    Object _fetch = this.fetch("sd");
    return ((StatsDataModel) _fetch);
  }

  public Model m() {
    Object _fetch = this.fetch("m");
    return ((Model) _fetch);
  }

  public FormInputBasic fib() {
    Object _fetch = this.fetch("fib");
    return ((FormInputBasic) _fetch);
  }

  public FormLayout fl() {
    Object _fetch = this.fetch("fl");
    return ((FormLayout) _fetch);
  }

  public CategoricalType ct() {
    Object _fetch = this.fetch("ct");
    return ((CategoricalType) _fetch);
  }

  public NumericalType nt() {
    Object _fetch = this.fetch("nt");
    return ((NumericalType) _fetch);
  }

  public FormInputRange rg() {
    Object _fetch = this.fetch("rg");
    return ((FormInputRange) _fetch);
  }

  public FormInputSearch sch() {
    Object _fetch = this.fetch("sch");
    return ((FormInputSearch) _fetch);
  }

  public FormInputSelect slt() {
    Object _fetch = this.fetch("slt");
    return ((FormInputSelect) _fetch);
  }

  public EnumOption opt() {
    Object _fetch = this.fetch("opt");
    return ((EnumOption) _fetch);
  }

  public StringOptionItem soi() {
    Object _fetch = this.fetch("soi");
    return ((StringOptionItem) _fetch);
  }

  public FrequencyEntry fe() {
    Object _fetch = this.fetch("fe");
    return ((FrequencyEntry) _fetch);
  }
}
