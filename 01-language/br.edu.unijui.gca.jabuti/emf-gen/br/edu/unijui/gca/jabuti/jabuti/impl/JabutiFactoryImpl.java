/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.Application;
import br.edu.unijui.gca.jabuti.jabuti.BinaryOperator;
import br.edu.unijui.gca.jabuti.jabuti.Clause;
import br.edu.unijui.gca.jabuti.jabuti.ComparisonOperator;
import br.edu.unijui.gca.jabuti.jabuti.CompositeCondition;
import br.edu.unijui.gca.jabuti.jabuti.Condition;
import br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression;
import br.edu.unijui.gca.jabuti.jabuti.Contract;
import br.edu.unijui.gca.jabuti.jabuti.EventLog;
import br.edu.unijui.gca.jabuti.jabuti.Expression;
import br.edu.unijui.gca.jabuti.jabuti.FunctionCall;
import br.edu.unijui.gca.jabuti.jabuti.Import;
import br.edu.unijui.gca.jabuti.jabuti.JabutiFactory;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.LiteralValue;
import br.edu.unijui.gca.jabuti.jabuti.LogicalOperator;
import br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation;
import br.edu.unijui.gca.jabuti.jabuti.MessageContent;
import br.edu.unijui.gca.jabuti.jabuti.Model;
import br.edu.unijui.gca.jabuti.jabuti.NumericValue;
import br.edu.unijui.gca.jabuti.jabuti.Obligation;
import br.edu.unijui.gca.jabuti.jabuti.OnBreach;
import br.edu.unijui.gca.jabuti.jabuti.OnSuccess;
import br.edu.unijui.gca.jabuti.jabuti.Operation;
import br.edu.unijui.gca.jabuti.jabuti.Party;
import br.edu.unijui.gca.jabuti.jabuti.Prohibition;
import br.edu.unijui.gca.jabuti.jabuti.Right;
import br.edu.unijui.gca.jabuti.jabuti.RolePlayer;
import br.edu.unijui.gca.jabuti.jabuti.SessionInterval;
import br.edu.unijui.gca.jabuti.jabuti.StringValue;
import br.edu.unijui.gca.jabuti.jabuti.Term;
import br.edu.unijui.gca.jabuti.jabuti.TimeInterval;
import br.edu.unijui.gca.jabuti.jabuti.TimeUnit;
import br.edu.unijui.gca.jabuti.jabuti.Timeout;
import br.edu.unijui.gca.jabuti.jabuti.UnaryOperator;
import br.edu.unijui.gca.jabuti.jabuti.Variable;
import br.edu.unijui.gca.jabuti.jabuti.VariableValue;
import br.edu.unijui.gca.jabuti.jabuti.WeekDay;
import br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JabutiFactoryImpl extends EFactoryImpl implements JabutiFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JabutiFactory init()
	{
		try
		{
			JabutiFactory theJabutiFactory = (JabutiFactory)EPackage.Registry.INSTANCE.getEFactory(JabutiPackage.eNS_URI);
			if (theJabutiFactory != null)
			{
				return theJabutiFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JabutiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabutiFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case JabutiPackage.MODEL: return createModel();
			case JabutiPackage.IMPORT: return createImport();
			case JabutiPackage.CONTRACT: return createContract();
			case JabutiPackage.CLAUSE: return createClause();
			case JabutiPackage.PARTY: return createParty();
			case JabutiPackage.APPLICATION: return createApplication();
			case JabutiPackage.PROCESS: return createProcess();
			case JabutiPackage.RIGHT: return createRight();
			case JabutiPackage.OBLIGATION: return createObligation();
			case JabutiPackage.PROHIBITION: return createProhibition();
			case JabutiPackage.EXPRESSION: return createExpression();
			case JabutiPackage.NUMERIC_VALUE: return createNumericValue();
			case JabutiPackage.UNARY_OPERATOR: return createUnaryOperator();
			case JabutiPackage.BINARY_OPERATOR: return createBinaryOperator();
			case JabutiPackage.LITERAL_VALUE: return createLiteralValue();
			case JabutiPackage.VARIABLE_VALUE: return createVariableValue();
			case JabutiPackage.STRING_VALUE: return createStringValue();
			case JabutiPackage.FUNCTION_CALL: return createFunctionCall();
			case JabutiPackage.VARIABLE: return createVariable();
			case JabutiPackage.EVENT_LOG: return createEventLog();
			case JabutiPackage.ON_BREACH: return createOnBreach();
			case JabutiPackage.ON_SUCCESS: return createOnSuccess();
			case JabutiPackage.CONDITION: return createCondition();
			case JabutiPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case JabutiPackage.TERM: return createTerm();
			case JabutiPackage.SESSION_INTERVAL: return createSessionInterval();
			case JabutiPackage.WEEK_DAYS_INTERVAL: return createWeekDaysInterval();
			case JabutiPackage.TIME_INTERVAL: return createTimeInterval();
			case JabutiPackage.TIMEOUT: return createTimeout();
			case JabutiPackage.MAX_NUMBER_OF_OPERATION: return createMaxNumberOfOperation();
			case JabutiPackage.MESSAGE_CONTENT: return createMessageContent();
			case JabutiPackage.COMPARISON_OPERATOR: return createComparisonOperator();
			case JabutiPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case JabutiPackage.LOGICAL_OPERATOR: return createLogicalOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case JabutiPackage.ROLE_PLAYER:
				return createRolePlayerFromString(eDataType, initialValue);
			case JabutiPackage.WEEK_DAY:
				return createWeekDayFromString(eDataType, initialValue);
			case JabutiPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case JabutiPackage.OPERATION:
				return createOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case JabutiPackage.ROLE_PLAYER:
				return convertRolePlayerToString(eDataType, instanceValue);
			case JabutiPackage.WEEK_DAY:
				return convertWeekDayToString(eDataType, instanceValue);
			case JabutiPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case JabutiPackage.OPERATION:
				return convertOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport()
	{
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract()
	{
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clause createClause()
	{
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty()
	{
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication()
	{
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public br.edu.unijui.gca.jabuti.jabuti.Process createProcess()
	{
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Right createRight()
	{
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Obligation createObligation()
	{
		ObligationImpl obligation = new ObligationImpl();
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prohibition createProhibition()
	{
		ProhibitionImpl prohibition = new ProhibitionImpl();
		return prohibition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericValue createNumericValue()
	{
		NumericValueImpl numericValue = new NumericValueImpl();
		return numericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperator createUnaryOperator()
	{
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperator createBinaryOperator()
	{
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralValue createLiteralValue()
	{
		LiteralValueImpl literalValue = new LiteralValueImpl();
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableValue createVariableValue()
	{
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue()
	{
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall()
	{
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable()
	{
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventLog createEventLog()
	{
		EventLogImpl eventLog = new EventLogImpl();
		return eventLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnBreach createOnBreach()
	{
		OnBreachImpl onBreach = new OnBreachImpl();
		return onBreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnSuccess createOnSuccess()
	{
		OnSuccessImpl onSuccess = new OnSuccessImpl();
		return onSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition()
	{
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCondition createCompositeCondition()
	{
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term createTerm()
	{
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SessionInterval createSessionInterval()
	{
		SessionIntervalImpl sessionInterval = new SessionIntervalImpl();
		return sessionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeekDaysInterval createWeekDaysInterval()
	{
		WeekDaysIntervalImpl weekDaysInterval = new WeekDaysIntervalImpl();
		return weekDaysInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInterval createTimeInterval()
	{
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timeout createTimeout()
	{
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxNumberOfOperation createMaxNumberOfOperation()
	{
		MaxNumberOfOperationImpl maxNumberOfOperation = new MaxNumberOfOperationImpl();
		return maxNumberOfOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageContent createMessageContent()
	{
		MessageContentImpl messageContent = new MessageContentImpl();
		return messageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator createComparisonOperator()
	{
		ComparisonOperatorImpl comparisonOperator = new ComparisonOperatorImpl();
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression createConditionalExpression()
	{
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator createLogicalOperator()
	{
		LogicalOperatorImpl logicalOperator = new LogicalOperatorImpl();
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePlayer createRolePlayerFromString(EDataType eDataType, String initialValue)
	{
		RolePlayer result = RolePlayer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRolePlayerToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDay createWeekDayFromString(EDataType eDataType, String initialValue)
	{
		WeekDay result = WeekDay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDayToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue)
	{
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperationFromString(EDataType eDataType, String initialValue)
	{
		Operation result = Operation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JabutiPackage getJabutiPackage()
	{
		return (JabutiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JabutiPackage getPackage()
	{
		return JabutiPackage.eINSTANCE;
	}

} //JabutiFactoryImpl
