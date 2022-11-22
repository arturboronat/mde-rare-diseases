package csv_to_json;

import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class Runner {
  public static void main(final String[] args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("src/main/resources/datasets/Rett_Datacleaned.csv");
    String inputCsvPath = _builder.toString();
    final CSV_to_JSON xform = new CSV_to_JSON();
    xform.parseCsvTable("in", inputCsvPath);
    xform.execute();
    Pair<String, String> _mappedTo = Pair.<String, String>of("out", "src/main/java/csv_to_json/Rett_Datacleaned.json");
    xform.saveOutputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo)));
  }
}
