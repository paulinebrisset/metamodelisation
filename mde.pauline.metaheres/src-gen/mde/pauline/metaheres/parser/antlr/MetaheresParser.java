/*
 * generated by Xtext 2.27.0
 */
package mde.pauline.metaheres.parser.antlr;

import com.google.inject.Inject;
import mde.pauline.metaheres.parser.antlr.internal.InternalMetaheresParser;
import mde.pauline.metaheres.services.MetaheresGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MetaheresParser extends AbstractAntlrParser {

	@Inject
	private MetaheresGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMetaheresParser createParser(XtextTokenStream stream) {
		return new InternalMetaheresParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ServiceName";
	}

	public MetaheresGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MetaheresGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
