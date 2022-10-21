/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Number Of Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMaxNumberOfOperation()
 * @model
 * @generated
 */
public interface MaxNumberOfOperation extends Term
{
	/**
	 * Returns the value of the '<em><b>Operation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Number</em>' attribute.
	 * @see #setOperationNumber(int)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMaxNumberOfOperation_OperationNumber()
	 * @model
	 * @generated
	 */
	int getOperationNumber();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation#getOperationNumber <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Number</em>' attribute.
	 * @see #getOperationNumber()
	 * @generated
	 */
	void setOperationNumber(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.jabuti.jabuti.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.jabuti.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMaxNumberOfOperation_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.jabuti.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

} // MaxNumberOfOperation
