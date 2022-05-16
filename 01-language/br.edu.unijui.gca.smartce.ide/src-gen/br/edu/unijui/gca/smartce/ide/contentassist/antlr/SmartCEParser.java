/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.ide.contentassist.antlr;

import br.edu.unijui.gca.smartce.ide.contentassist.antlr.internal.InternalSmartCEParser;
import br.edu.unijui.gca.smartce.services.SmartCEGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SmartCEParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SmartCEGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SmartCEGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getClauseAccess().getAlternatives_0(), "rule__Clause__Alternatives_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getOperationsLimitAccess().getAlternatives_0(), "rule__OperationsLimit__Alternatives_0");
			builder.put(grammarAccess.getBusinessTimeAccess().getAlternatives_0(), "rule__BusinessTime__Alternatives_0");
			builder.put(grammarAccess.getPartyAccess().getAlternatives(), "rule__Party__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_1_1(), "rule__Expression__Alternatives_1_1");
			builder.put(grammarAccess.getNegationAccess().getAlternatives(), "rule__Negation__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1_1(), "rule__Comparison__Alternatives_1_1");
			builder.put(grammarAccess.getPlusAccess().getAlternatives_1_1(), "rule__Plus__Alternatives_1_1");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_1(), "rule__Factor__Alternatives_1_1");
			builder.put(grammarAccess.getNegativeAccess().getAlternatives(), "rule__Negative__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getLiteralValueAccess().getAlternatives(), "rule__LiteralValue__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getContractAccess().getGroup(), "rule__Contract__Group__0");
			builder.put(grammarAccess.getClauseAccess().getGroup(), "rule__Clause__Group__0");
			builder.put(grammarAccess.getTimeoutAccess().getGroup(), "rule__Timeout__Group__0");
			builder.put(grammarAccess.getOperationsLimitAccess().getGroup(), "rule__OperationsLimit__Group__0");
			builder.put(grammarAccess.getBusinessDayAccess().getGroup(), "rule__BusinessDay__Group__0");
			builder.put(grammarAccess.getBusinessTimeAccess().getGroup(), "rule__BusinessTime__Group__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup(), "rule__MessageContent__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
			builder.put(grammarAccess.getOnBreachAccess().getGroup(), "rule__OnBreach__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getNegationAccess().getGroup_1(), "rule__Negation__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusAccess().getGroup(), "rule__Plus__Group__0");
			builder.put(grammarAccess.getPlusAccess().getGroup_1(), "rule__Plus__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getNegativeAccess().getGroup_1(), "rule__Negative__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getDATEAccess().getGroup(), "rule__DATE__Group__0");
			builder.put(grammarAccess.getModelAccess().getImportsAssignment_1(), "rule__Model__ImportsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getOperationsAssignment_2(), "rule__Model__OperationsAssignment_2");
			builder.put(grammarAccess.getModelAccess().getContractsAssignment_3(), "rule__Model__ContractsAssignment_3");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getOperationAccess().getNameAssignment(), "rule__Operation__NameAssignment");
			builder.put(grammarAccess.getContractAccess().getNameAssignment_1(), "rule__Contract__NameAssignment_1");
			builder.put(grammarAccess.getContractAccess().getBeginDateAssignment_5(), "rule__Contract__BeginDateAssignment_5");
			builder.put(grammarAccess.getContractAccess().getDueDateAssignment_8(), "rule__Contract__DueDateAssignment_8");
			builder.put(grammarAccess.getContractAccess().getApplicationAssignment_11(), "rule__Contract__ApplicationAssignment_11");
			builder.put(grammarAccess.getContractAccess().getProcessAssignment_14(), "rule__Contract__ProcessAssignment_14");
			builder.put(grammarAccess.getContractAccess().getClausesAssignment_15(), "rule__Contract__ClausesAssignment_15");
			builder.put(grammarAccess.getContractAccess().getActionsAssignment_16(), "rule__Contract__ActionsAssignment_16");
			builder.put(grammarAccess.getClauseAccess().getNameAssignment_1(), "rule__Clause__NameAssignment_1");
			builder.put(grammarAccess.getClauseAccess().getDescriptionAssignment_5(), "rule__Clause__DescriptionAssignment_5");
			builder.put(grammarAccess.getClauseAccess().getRolePlayerAssignment_7(), "rule__Clause__RolePlayerAssignment_7");
			builder.put(grammarAccess.getClauseAccess().getOperationAssignment_9(), "rule__Clause__OperationAssignment_9");
			builder.put(grammarAccess.getClauseAccess().getConditionAssignment_13(), "rule__Clause__ConditionAssignment_13");
			builder.put(grammarAccess.getClauseAccess().getOnBreachAssignment_16(), "rule__Clause__OnBreachAssignment_16");
			builder.put(grammarAccess.getTimeoutAccess().getExpressionAssignment_2(), "rule__Timeout__ExpressionAssignment_2");
			builder.put(grammarAccess.getOperationsLimitAccess().getExpressionAssignment_2(), "rule__OperationsLimit__ExpressionAssignment_2");
			builder.put(grammarAccess.getBusinessDayAccess().getExpressionAssignment_2(), "rule__BusinessDay__ExpressionAssignment_2");
			builder.put(grammarAccess.getBusinessTimeAccess().getExpressionAssignment_2(), "rule__BusinessTime__ExpressionAssignment_2");
			builder.put(grammarAccess.getMessageContentAccess().getExpressionAssignment_1(), "rule__MessageContent__ExpressionAssignment_1");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_0(), "rule__Application__NameAssignment_0");
			builder.put(grammarAccess.getApplicationAccess().getDescriptionAssignment_2(), "rule__Application__DescriptionAssignment_2");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment_0(), "rule__Process__NameAssignment_0");
			builder.put(grammarAccess.getProcessAccess().getDescriptionAssignment_2(), "rule__Process__DescriptionAssignment_2");
			builder.put(grammarAccess.getOnBreachAccess().getActionAssignment_1(), "rule__OnBreach__ActionAssignment_1");
			builder.put(grammarAccess.getOnBreachAccess().getMessageAssignment_3(), "rule__OnBreach__MessageAssignment_3");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
			builder.put(grammarAccess.getActionAccess().getParametersAssignment_3(), "rule__Action__ParametersAssignment_3");
			builder.put(grammarAccess.getActionAccess().getParametersAssignment_4_1(), "rule__Action__ParametersAssignment_4_1");
			builder.put(grammarAccess.getActionAccess().getStatementsAssignment_7(), "rule__Action__StatementsAssignment_7");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
			builder.put(grammarAccess.getExpressionAccess().getSymbolAssignment_1_1_0(), "rule__Expression__SymbolAssignment_1_1_0");
			builder.put(grammarAccess.getExpressionAccess().getSymbolAssignment_1_1_1(), "rule__Expression__SymbolAssignment_1_1_1");
			builder.put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
			builder.put(grammarAccess.getNegationAccess().getSymbolAssignment_1_1(), "rule__Negation__SymbolAssignment_1_1");
			builder.put(grammarAccess.getNegationAccess().getExpressionAssignment_1_2(), "rule__Negation__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_0(), "rule__Comparison__SymbolAssignment_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_1(), "rule__Comparison__SymbolAssignment_1_1_1");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_2(), "rule__Comparison__SymbolAssignment_1_1_2");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_3(), "rule__Comparison__SymbolAssignment_1_1_3");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_4(), "rule__Comparison__SymbolAssignment_1_1_4");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_5(), "rule__Comparison__SymbolAssignment_1_1_5");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_6(), "rule__Comparison__SymbolAssignment_1_1_6");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_7(), "rule__Comparison__SymbolAssignment_1_1_7");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusAccess().getRightAssignment_1_2(), "rule__Plus__RightAssignment_1_2");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_2(), "rule__Factor__RightAssignment_1_2");
			builder.put(grammarAccess.getNegativeAccess().getExpressionAssignment_1_2(), "rule__Negative__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getNumericValueAccess().getValueAssignment(), "rule__NumericValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getVariableValueAccess().getValueAssignment(), "rule__VariableValue__ValueAssignment");
			builder.put(grammarAccess.getFunctionCallAccess().getNameAssignment_0(), "rule__FunctionCall__NameAssignment_0");
			builder.put(grammarAccess.getFunctionCallAccess().getParamsAssignment_2(), "rule__FunctionCall__ParamsAssignment_2");
			builder.put(grammarAccess.getFunctionCallAccess().getParamsAssignment_3_1(), "rule__FunctionCall__ParamsAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SmartCEGrammarAccess grammarAccess;

	@Override
	protected InternalSmartCEParser createParser() {
		InternalSmartCEParser result = new InternalSmartCEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmartCEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartCEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
