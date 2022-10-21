/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation;
import br.edu.unijui.gca.jabuti.jabuti.TimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Number Of Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MaxNumberOfOperationImpl#getOperationNumber <em>Operation Number</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MaxNumberOfOperationImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxNumberOfOperationImpl extends TermImpl implements MaxNumberOfOperation
{
	/**
	 * The default value of the '{@link #getOperationNumber() <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperationNumber() <em>Operation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationNumber()
	 * @generated
	 * @ordered
	 */
	protected int operationNumber = OPERATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxNumberOfOperationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return JabutiPackage.Literals.MAX_NUMBER_OF_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOperationNumber()
	{
		return operationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationNumber(int newOperationNumber)
	{
		int oldOperationNumber = operationNumber;
		operationNumber = newOperationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MAX_NUMBER_OF_OPERATION__OPERATION_NUMBER, oldOperationNumber, operationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeUnit getTimeUnit()
	{
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(TimeUnit newTimeUnit)
	{
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MAX_NUMBER_OF_OPERATION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__OPERATION_NUMBER:
				return getOperationNumber();
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__TIME_UNIT:
				return getTimeUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__OPERATION_NUMBER:
				setOperationNumber((Integer)newValue);
				return;
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__OPERATION_NUMBER:
				setOperationNumber(OPERATION_NUMBER_EDEFAULT);
				return;
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__OPERATION_NUMBER:
				return operationNumber != OPERATION_NUMBER_EDEFAULT;
			case JabutiPackage.MAX_NUMBER_OF_OPERATION__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operationNumber: ");
		result.append(operationNumber);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //MaxNumberOfOperationImpl
