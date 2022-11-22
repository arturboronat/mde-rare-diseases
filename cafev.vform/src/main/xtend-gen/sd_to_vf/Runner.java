package sd_to_vf;

import cafev.vform.VFormDslStandaloneSetup;
import com.google.inject.Injector;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class Runner {
  public static void main(final String[] args) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("src/main/java/csv_to_sd/rettData_stats.xmi");
      String inputModelPath = _builder.toString();
      final sd2vf xform = new sd2vf();
      Pair<String, String> _mappedTo = Pair.<String, String>of("dd", inputModelPath);
      xform.loadInputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo)));
      xform.execute();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("src/main/java/sd_to_vf/rettData_vform.xmi");
      String outputModelPath = _builder_1.toString();
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("vf", outputModelPath);
      xform.saveOutputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_1)));
      InputOutput.<String>println(xform.toStringStats());
      final Injector injector = new VFormDslStandaloneSetup().createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      final Resource resource = resourceSet.createResource(URI.createURI("test.vform"));
      final Resource modelRes = xform.getOutputModel("vf");
      resource.getContents().addAll(modelRes.getContents());
      resource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
