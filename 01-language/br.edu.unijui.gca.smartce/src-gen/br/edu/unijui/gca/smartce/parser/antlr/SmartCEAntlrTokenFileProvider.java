/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmartCEAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/edu/unijui/gca/smartce/parser/antlr/internal/InternalSmartCE.tokens");
	}
}