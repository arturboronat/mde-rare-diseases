/*
 * generated by Xtext 2.25.0
 */
package cafeV.dsl.vforms.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VformDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("cafeV/dsl/vforms/parser/antlr/internal/InternalVformDSL.tokens");
	}
}
