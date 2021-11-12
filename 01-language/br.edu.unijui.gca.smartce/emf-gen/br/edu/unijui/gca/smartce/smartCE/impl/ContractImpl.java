/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE.impl;

import br.edu.unijui.gca.smartce.smartCE.Application;
import br.edu.unijui.gca.smartce.smartCE.Clause;
import br.edu.unijui.gca.smartce.smartCE.Contract;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getExcecutionsNumber <em>Excecutions Number</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ContractImpl#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDate()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDate()
	 * @generated
	 * @ordered
	 */
	protected String beginDate = BEGIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcecutionsNumber() <em>Excecutions Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcecutionsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EXCECUTIONS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExcecutionsNumber() <em>Excecutions Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcecutionsNumber()
	 * @generated
	 * @ordered
	 */
	protected int excecutionsNumber = EXCECUTIONS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected br.edu.unijui.gca.smartce.smartCE.Process process;

	/**
	 * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl()
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
		return SmartCEPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeginDate()
	{
		return beginDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginDate(String newBeginDate)
	{
		String oldBeginDate = beginDate;
		beginDate = newBeginDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__BEGIN_DATE, oldBeginDate, beginDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate()
	{
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate)
	{
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExcecutionsNumber()
	{
		return excecutionsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcecutionsNumber(int newExcecutionsNumber)
	{
		int oldExcecutionsNumber = excecutionsNumber;
		excecutionsNumber = newExcecutionsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__EXCECUTIONS_NUMBER, oldExcecutionsNumber, excecutionsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication()
	{
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs)
	{
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication)
	{
		if (newApplication != application)
		{
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartCEPackage.CONTRACT__APPLICATION, null, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartCEPackage.CONTRACT__APPLICATION, null, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public br.edu.unijui.gca.smartce.smartCE.Process getProcess()
	{
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(br.edu.unijui.gca.smartce.smartCE.Process newProcess, NotificationChain msgs)
	{
		br.edu.unijui.gca.smartce.smartCE.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(br.edu.unijui.gca.smartce.smartCE.Process newProcess)
	{
		if (newProcess != process)
		{
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartCEPackage.CONTRACT__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartCEPackage.CONTRACT__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.CONTRACT__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clause> getClauses()
	{
		if (clauses == null)
		{
			clauses = new EObjectContainmentEList<Clause>(Clause.class, this, SmartCEPackage.CONTRACT__CLAUSES);
		}
		return clauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SmartCEPackage.CONTRACT__APPLICATION:
				return basicSetApplication(null, msgs);
			case SmartCEPackage.CONTRACT__PROCESS:
				return basicSetProcess(null, msgs);
			case SmartCEPackage.CONTRACT__CLAUSES:
				return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SmartCEPackage.CONTRACT__NAME:
				return getName();
			case SmartCEPackage.CONTRACT__BEGIN_DATE:
				return getBeginDate();
			case SmartCEPackage.CONTRACT__DUE_DATE:
				return getDueDate();
			case SmartCEPackage.CONTRACT__EXCECUTIONS_NUMBER:
				return getExcecutionsNumber();
			case SmartCEPackage.CONTRACT__DESCRIPTION:
				return getDescription();
			case SmartCEPackage.CONTRACT__APPLICATION:
				return getApplication();
			case SmartCEPackage.CONTRACT__PROCESS:
				return getProcess();
			case SmartCEPackage.CONTRACT__CLAUSES:
				return getClauses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SmartCEPackage.CONTRACT__NAME:
				setName((String)newValue);
				return;
			case SmartCEPackage.CONTRACT__BEGIN_DATE:
				setBeginDate((String)newValue);
				return;
			case SmartCEPackage.CONTRACT__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case SmartCEPackage.CONTRACT__EXCECUTIONS_NUMBER:
				setExcecutionsNumber((Integer)newValue);
				return;
			case SmartCEPackage.CONTRACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SmartCEPackage.CONTRACT__APPLICATION:
				setApplication((Application)newValue);
				return;
			case SmartCEPackage.CONTRACT__PROCESS:
				setProcess((br.edu.unijui.gca.smartce.smartCE.Process)newValue);
				return;
			case SmartCEPackage.CONTRACT__CLAUSES:
				getClauses().clear();
				getClauses().addAll((Collection<? extends Clause>)newValue);
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
			case SmartCEPackage.CONTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartCEPackage.CONTRACT__BEGIN_DATE:
				setBeginDate(BEGIN_DATE_EDEFAULT);
				return;
			case SmartCEPackage.CONTRACT__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case SmartCEPackage.CONTRACT__EXCECUTIONS_NUMBER:
				setExcecutionsNumber(EXCECUTIONS_NUMBER_EDEFAULT);
				return;
			case SmartCEPackage.CONTRACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SmartCEPackage.CONTRACT__APPLICATION:
				setApplication((Application)null);
				return;
			case SmartCEPackage.CONTRACT__PROCESS:
				setProcess((br.edu.unijui.gca.smartce.smartCE.Process)null);
				return;
			case SmartCEPackage.CONTRACT__CLAUSES:
				getClauses().clear();
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
			case SmartCEPackage.CONTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartCEPackage.CONTRACT__BEGIN_DATE:
				return BEGIN_DATE_EDEFAULT == null ? beginDate != null : !BEGIN_DATE_EDEFAULT.equals(beginDate);
			case SmartCEPackage.CONTRACT__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case SmartCEPackage.CONTRACT__EXCECUTIONS_NUMBER:
				return excecutionsNumber != EXCECUTIONS_NUMBER_EDEFAULT;
			case SmartCEPackage.CONTRACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SmartCEPackage.CONTRACT__APPLICATION:
				return application != null;
			case SmartCEPackage.CONTRACT__PROCESS:
				return process != null;
			case SmartCEPackage.CONTRACT__CLAUSES:
				return clauses != null && !clauses.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", beginDate: ");
		result.append(beginDate);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", excecutionsNumber: ");
		result.append(excecutionsNumber);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ContractImpl
