/*
 * generated by Xtext 2.32.0
 */
package br.edu.unijui.gca.jabuti.serializer;

import br.edu.unijui.gca.jabuti.services.JabutiGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JabutiSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JabutiGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConditionalExpression_QualifiedNameParserRuleCall_3_0_0_or_STRINGTerminalRuleCall_3_0_1;
	protected AbstractElementAlias match_ConditionalExpression_QualifiedNameParserRuleCall_3_1_1_0_or_STRINGTerminalRuleCall_3_1_1_1;
	protected AbstractElementAlias match_ConditionalExpression_QualifiedNameParserRuleCall_4_2_1_0_or_STRINGTerminalRuleCall_4_2_1_1;
	protected AbstractElementAlias match_Contract___VariablesKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_3__q;
	protected AbstractElementAlias match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1;
	protected AbstractElementAlias match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_SessionInterval___PerKeyword_4_0_QualifiedNameParserRuleCall_4_1_2__q;
	protected AbstractElementAlias match_Term_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Term_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JabutiGrammarAccess) access;
		match_ConditionalExpression_QualifiedNameParserRuleCall_3_0_0_or_STRINGTerminalRuleCall_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_3_0_0()), new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_3_0_1()));
		match_ConditionalExpression_QualifiedNameParserRuleCall_3_1_1_0_or_STRINGTerminalRuleCall_3_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_3_1_1_0()), new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_3_1_1_1()));
		match_ConditionalExpression_QualifiedNameParserRuleCall_4_2_1_0_or_STRINGTerminalRuleCall_4_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getQualifiedNameParserRuleCall_4_2_1_0()), new TokenAlias(false, false, grammarAccess.getConditionalExpressionAccess().getSTRINGTerminalRuleCall_4_2_1_1()));
		match_Contract___VariablesKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContractAccess().getVariablesKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_17_1()), new TokenAlias(false, false, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_17_3()));
		match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1()));
		match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0()));
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_SessionInterval___PerKeyword_4_0_QualifiedNameParserRuleCall_4_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSessionIntervalAccess().getPerKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSessionIntervalAccess().getQualifiedNameParserRuleCall_4_1_2()));
		match_Term_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
		match_Term_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getQualifiedNameRule())
			return getQualifiedNameToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * QualifiedName:
	 * 	ID ('.' ID)*;
	 */
	protected String getQualifiedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ConditionalExpression_QualifiedNameParserRuleCall_3_0_0_or_STRINGTerminalRuleCall_3_0_1.equals(syntax))
				emit_ConditionalExpression_QualifiedNameParserRuleCall_3_0_0_or_STRINGTerminalRuleCall_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConditionalExpression_QualifiedNameParserRuleCall_3_1_1_0_or_STRINGTerminalRuleCall_3_1_1_1.equals(syntax))
				emit_ConditionalExpression_QualifiedNameParserRuleCall_3_1_1_0_or_STRINGTerminalRuleCall_3_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConditionalExpression_QualifiedNameParserRuleCall_4_2_1_0_or_STRINGTerminalRuleCall_4_2_1_1.equals(syntax))
				emit_ConditionalExpression_QualifiedNameParserRuleCall_4_2_1_0_or_STRINGTerminalRuleCall_4_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract___VariablesKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_3__q.equals(syntax))
				emit_Contract___VariablesKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1.equals(syntax))
				emit_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0.equals(syntax))
				emit_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SessionInterval___PerKeyword_4_0_QualifiedNameParserRuleCall_4_1_2__q.equals(syntax))
				emit_SessionInterval___PerKeyword_4_0_QualifiedNameParserRuleCall_4_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Term_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Term_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Term_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Term_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     QualifiedName | STRING
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'when' '(' (ambiguity) ')' 'check' '{' expressionTerm=ExpressionTerm
	 *     (rule start) 'when' '(' (ambiguity) comparisonOperator+=ComparisonOperator
	 *     (rule start) 'when' '(' (ambiguity) logicalOperator+=LogicalOperator
	 *     beforeSymbol=LogicalOperator 'when' '(' (ambiguity) ')' 'check' '{' expressionTerm=ExpressionTerm
	 *     beforeSymbol=LogicalOperator 'when' '(' (ambiguity) comparisonOperator+=ComparisonOperator
	 *     beforeSymbol=LogicalOperator 'when' '(' (ambiguity) logicalOperator+=LogicalOperator
	 
	 * </pre>
	 */
	protected void emit_ConditionalExpression_QualifiedNameParserRuleCall_3_0_0_or_STRINGTerminalRuleCall_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     QualifiedName | STRING
	 *
	 * This ambiguous syntax occurs at:
	 *     comparisonOperator+=ComparisonOperator (ambiguity) ')' 'check' '{' expressionTerm=ExpressionTerm
	 *     comparisonOperator+=ComparisonOperator (ambiguity) logicalOperator+=LogicalOperator
	 
	 * </pre>
	 */
	protected void emit_ConditionalExpression_QualifiedNameParserRuleCall_3_1_1_0_or_STRINGTerminalRuleCall_3_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     QualifiedName | STRING
	 *
	 * This ambiguous syntax occurs at:
	 *     comparisonOperator+=ComparisonOperator (ambiguity) ')' 'check' '{' expressionTerm=ExpressionTerm
	 *     comparisonOperator+=ComparisonOperator (ambiguity) logicalOperator+=LogicalOperator
	 
	 * </pre>
	 */
	protected void emit_ConditionalExpression_QualifiedNameParserRuleCall_4_2_1_0_or_STRINGTerminalRuleCall_4_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('variables' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     process=Process '}' (ambiguity) 'clauses' '{' '}' '}' (rule end)
	 *     process=Process '}' (ambiguity) 'clauses' '{' clauses+=Clause
	 
	 * </pre>
	 */
	protected void emit_Contract___VariablesKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '*' | '/'
	 *
	 * This ambiguous syntax occurs at:
	 *     {BinaryOperator.left=} (ambiguity) right=Negative
	 
	 * </pre>
	 */
	protected void emit_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '+' | '-'
	 *
	 * This ambiguous syntax occurs at:
	 *     {BinaryOperator.left=} (ambiguity) right=Factor
	 
	 * </pre>
	 */
	protected void emit_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Primary
	 *     (rule start) (ambiguity) name=QualifiedName
	 *     (rule start) (ambiguity) symbol='!'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=QualifiedName
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {BinaryOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Primary
	 *     (rule start) (ambiguity) symbol='!'
	 *     (rule start) (ambiguity) {BinaryOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('per' QualifiedName)?
	 *
	 * This ambiguous syntax occurs at:
	 *     timeUnit=TimeUnit (ambiguity) ')' (rule end)
	 
	 * </pre>
	 */
	protected void emit_SessionInterval___PerKeyword_4_0_QualifiedNameParserRuleCall_4_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'MaxNumberOfOperation' '(' operationsNumber=INT
	 *     (rule start) (ambiguity) 'MessageContent' '(' QualifiedName ')' (rule start)
	 *     (rule start) (ambiguity) 'MessageContent' '(' QualifiedName comparisonOperator=ComparisonOperator
	 *     (rule start) (ambiguity) 'MessageContent' '(' content=STRING
	 *     (rule start) (ambiguity) 'SessionInterval' '(' frequency=INT
	 *     (rule start) (ambiguity) 'TimeInterval' '(' start=STRING
	 *     (rule start) (ambiguity) 'Timeout' '(' seconds=INT
	 *     (rule start) (ambiguity) 'WeekDaysInterval' '(' start=WeekDay
	 *     (rule start) (ambiguity) symbol='NOT'
	 *     (rule start) (ambiguity) {BinaryTermOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Term_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) symbol='NOT'
	 *     (rule start) (ambiguity) {BinaryTermOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Term_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
