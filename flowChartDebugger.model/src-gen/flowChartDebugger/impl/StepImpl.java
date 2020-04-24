/**
 */
package flowChartDebugger.impl;

import flowChartDebugger.FlowChartDebuggerPackage;
import flowChartDebugger.Step;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flowChartDebugger.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link flowChartDebugger.impl.StepImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link flowChartDebugger.impl.StepImpl#getPreviousStep <em>Previous Step</em>}</li>
 *   <li>{@link flowChartDebugger.impl.StepImpl#isHasRun <em>Has Run</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> nextStep;

	/**
	 * The cached value of the '{@link #getPreviousStep() <em>Previous Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> previousStep;

	/**
	 * The default value of the '{@link #isHasRun() <em>Has Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RUN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasRun() <em>Has Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRun()
	 * @generated
	 * @ordered
	 */
	protected boolean hasRun = HAS_RUN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowChartDebuggerPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowChartDebuggerPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getNextStep() {
		if (nextStep == null) {
			nextStep = new EObjectWithInverseResolvingEList.ManyInverse<Step>(Step.class, this,
					FlowChartDebuggerPackage.STEP__NEXT_STEP, FlowChartDebuggerPackage.STEP__PREVIOUS_STEP);
		}
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getPreviousStep() {
		if (previousStep == null) {
			previousStep = new EObjectWithInverseResolvingEList.ManyInverse<Step>(Step.class, this,
					FlowChartDebuggerPackage.STEP__PREVIOUS_STEP, FlowChartDebuggerPackage.STEP__NEXT_STEP);
		}
		return previousStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRun() {
		return hasRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRun(boolean newHasRun) {
		boolean oldHasRun = hasRun;
		hasRun = newHasRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowChartDebuggerPackage.STEP__HAS_RUN, oldHasRun,
					hasRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNextStep()).basicAdd(otherEnd, msgs);
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPreviousStep()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			return ((InternalEList<?>) getNextStep()).basicRemove(otherEnd, msgs);
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			return ((InternalEList<?>) getPreviousStep()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NAME:
			return getName();
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			return getNextStep();
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			return getPreviousStep();
		case FlowChartDebuggerPackage.STEP__HAS_RUN:
			return isHasRun();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			getNextStep().clear();
			getNextStep().addAll((Collection<? extends Step>) newValue);
			return;
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			getPreviousStep().clear();
			getPreviousStep().addAll((Collection<? extends Step>) newValue);
			return;
		case FlowChartDebuggerPackage.STEP__HAS_RUN:
			setHasRun((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			getNextStep().clear();
			return;
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			getPreviousStep().clear();
			return;
		case FlowChartDebuggerPackage.STEP__HAS_RUN:
			setHasRun(HAS_RUN_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FlowChartDebuggerPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FlowChartDebuggerPackage.STEP__NEXT_STEP:
			return nextStep != null && !nextStep.isEmpty();
		case FlowChartDebuggerPackage.STEP__PREVIOUS_STEP:
			return previousStep != null && !previousStep.isEmpty();
		case FlowChartDebuggerPackage.STEP__HAS_RUN:
			return hasRun != HAS_RUN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hasRun: ");
		result.append(hasRun);
		result.append(')');
		return result.toString();
	}

} //StepImpl
