package yamtlDataset;

import cafev.vform.VFormDslStandaloneSetup;
import com.google.inject.Injector;
import csv_to_sd.CSV_to_SD;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import sd_to_vf.sd2vf;

@SuppressWarnings("all")
public class DatasetCompiler {
  public static void main(final String[] args) {
    try {
      String DATASET = "Mock_data";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("src/main/resources/datasets/�DATASET�.csv");
      String inputCsvPath = _builder.toString();
      final CSV_to_SD csv2sdModule = new CSV_to_SD();
      csv2sdModule.parseCsvTable("csv", inputCsvPath);
      csv2sdModule.execute();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("src/main/resources/datasets/�DATASET�.xmi");
      String outputModelPath = _builder_1.toString();
      Pair<String, String> _mappedTo = Pair.<String, String>of("dd", outputModelPath);
      csv2sdModule.saveOutputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo)));
      final sd2vf sd2vfModule = new sd2vf();
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("dd", outputModelPath);
      sd2vfModule.loadInputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_1)));
      sd2vfModule.execute();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("src/main/resources/datasets/�DATASET�_vform.xmi");
      String outputVFormPath = _builder_2.toString();
      Pair<String, String> _mappedTo_2 = Pair.<String, String>of("vf", outputVFormPath);
      sd2vfModule.saveOutputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_2)));
      final Injector injector = new VFormDslStandaloneSetup().createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("src/main/resources/datasets/�DATASET�.vform");
      final Resource resource = resourceSet.createResource(URI.createURI(_builder_3.toString()));
      final Resource modelRes = sd2vfModule.getOutputModel("vf");
      resource.getContents().addAll(modelRes.getContents());
      resource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
