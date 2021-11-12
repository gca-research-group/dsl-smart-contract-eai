/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Breach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.OnBreach#getAction <em>Action</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.OnBreach#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getOnBreach()
 * @model
 * @generated
 */
public interface OnBreach extends EObject
{
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Expression)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getOnBreach_Action()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAction();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.OnBreach#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Expression value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Expression)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getOnBreach_Message()
	 * @model containment="true"
	 * @generated
	 */
	Expression getMessage();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.OnBreach#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Expression value);

} // OnBreach
