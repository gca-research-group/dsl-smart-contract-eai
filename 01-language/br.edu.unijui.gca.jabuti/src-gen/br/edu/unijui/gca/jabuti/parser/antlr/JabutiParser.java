/*
 * generated by Xtext 2.30.0
 */
package br.edu.unijui.gca.jabuti.parser.antlr;

import br.edu.unijui.gca.jabuti.parser.antlr.internal.InternalJabutiParser;
import br.edu.unijui.gca.jabuti.services.JabutiGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JabutiParser extends AbstractAntlrParser {

	@Inject
	private JabutiGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJabutiParser createParser(XtextTokenStream stream) {
		return new InternalJabutiParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public JabutiGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JabutiGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
