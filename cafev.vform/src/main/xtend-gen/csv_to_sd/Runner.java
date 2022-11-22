package csv_to_sd;

import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class Runner {
  public static void main(final String[] args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("src/main/resources/datasets/Rett_Datacleaned.csv");
    String inputCsvPath = _builder.toString();
    final CSV_to_SD xform = new CSV_to_SD();
    xform.parseCsvTable("csv", inputCsvPath);
    xform.execute();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("src/main/java/csv_to_sd/rettData_stats.xmi");
    String outputModelPath = _builder_1.toString();
    Pair<String, String> _mappedTo = Pair.<String, String>of("dd", outputModelPath);
    xform.saveOutputModels(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo)));
    InputOutput.<String>println(xform.toStringStats());
  }
}
