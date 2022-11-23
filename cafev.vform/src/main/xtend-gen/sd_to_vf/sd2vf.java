package sd_to_vf;

import cafev.vform.vFormDsl.EnumOption;
import cafev.vform.vFormDsl.FormInputBasic;
import cafev.vform.vFormDsl.FormInputRange;
import cafev.vform.vFormDsl.FormInputSearch;
import cafev.vform.vFormDsl.FormInputSelect;
import cafev.vform.vFormDsl.FormLayout;
import cafev.vform.vFormDsl.Model;
import cafev.vform.vFormDsl.StringOptionItem;
import cafev.vform.vFormDsl.VFormDslPackage;
import dataDescription.CategoricalType;
import dataDescription.DataDescriptionPackage;
import dataDescription.FrequencyEntry;
import dataDescription.NumericalType;
import dataDescription.StatsDataModel;

/**
 * SHORTER TRANSFORMATION FOR PRESENTATION PURPOSES
 * with boilerplate code
 */
@SuppressWarnings("all")
public class sd2vf /* implements YAMTLModule  */{
  private final DataDescriptionPackage DD = DataDescriptionPackage.eINSTANCE;

  private final VFormDslPackage VF = VFormDslPackage.eINSTANCE;

  public sd2vf() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method header() is undefined"
      + "\nThe method ruleStore(List<Object>) is undefined"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field statsDataModel is undefined for the type DataDescriptionPackage"
      + "\nThe method or field model is undefined for the type VFormDslPackage"
      + "\nThe method or field formLayout is undefined for the type VFormDslPackage"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field categoricalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field frequencyTable is undefined for the type CategoricalType"
      + "\nThe method or field formInputBasic is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type CategoricalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field categoricalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field formInputBasic is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type CategoricalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field numericalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field formInputBasic is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type NumericalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field numericalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field formInputRange is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type NumericalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field categoricalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field fetch is undefined for the type String"
      + "\nThe method or field frequencyTable is undefined for the type CategoricalType"
      + "\nThe method or field formInputSearch is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type CategoricalType"
      + "\nThe method or field data is undefined for the type FormInputSearch"
      + "\nThe method or field frequencyTable is undefined for the type CategoricalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field categoricalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field fetch is undefined for the type String"
      + "\nThe method or field frequencyTable is undefined for the type CategoricalType"
      + "\nThe method or field formInputSelect is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type CategoricalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method or field enumOption is undefined for the type VFormDslPackage"
      + "\nThe method or field data is undefined for the type EnumOption"
      + "\nThe method or field frequencyTable is undefined for the type CategoricalType"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field numericalType is undefined for the type DataDescriptionPackage"
      + "\nThe method or field fetch is undefined for the type String"
      + "\nThe method or field frequencyTable is undefined for the type NumericalType"
      + "\nThe method or field formInputSelect is undefined for the type VFormDslPackage"
      + "\nThe method fetch(String) is undefined for the type StatsDataModel"
      + "\nThe method eContainer() is undefined for the type NumericalType"
      + "\nThe method or field formInput is undefined for the type Model"
      + "\nThe method or field enumOption is undefined for the type VFormDslPackage"
      + "\nThe method or field data is undefined for the type EnumOption"
      + "\nThe method or field frequencyTable is undefined for the type NumericalType"
      + "\nThe method rule(String) is undefined"
      + "\nThe method or field frequencyEntry is undefined for the type DataDescriptionPackage"
      + "\nThe method or field stringOptionItem is undefined for the type VFormDslPackage"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved"
      + "\nout cannot be resolved"
      + "\nin cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n<= cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nin cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nout cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nfetch cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nin cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n<= cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nout cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nfetch cannot be resolved"
      + "\nin cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n<= cannot be resolved"
      + "\nout cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nout cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nfetch cannot be resolved"
      + "\nuniqueLazy cannot be resolved"
      + "\nin cannot be resolved"
      + "\nout cannot be resolved");
  }

  /**
   * HELPERS: generated with runner.generateBoilerplateCode()
   */
  public StatsDataModel sd() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public Model m() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FormInputBasic fib() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FormLayout fl() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public CategoricalType ct() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public NumericalType nt() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FormInputRange rg() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FormInputSearch sch() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FormInputSelect slt() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public EnumOption opt() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public StringOptionItem soi() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }

  public FrequencyEntry fe() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fetch() is undefined for the type String");
  }
}
