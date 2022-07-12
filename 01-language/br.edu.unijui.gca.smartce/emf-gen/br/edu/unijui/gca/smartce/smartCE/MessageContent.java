/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.MessageContent#getContent <em>Content</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.MessageContent#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.MessageContent#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getMessageContent()
 * @model
 * @generated
 */
public interface MessageContent extends BusinessRule
{
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getMessageContent_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.MessageContent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"SECOND"</code>.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.smartce.smartCE.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.smartce.smartCE.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getMessageContent_TimeUnit()
	 * @model default="SECOND"
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.MessageContent#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.smartce.smartCE.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.smartce.smartCE.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getMessageContent_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // MessageContent
