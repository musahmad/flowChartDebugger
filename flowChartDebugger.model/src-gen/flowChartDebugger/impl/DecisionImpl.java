/**
 */
package flowChartDebugger.impl;

import flowChartDebugger.Decision;
import flowChartDebugger.FlowChartDebuggerPackage;

import flowChartDebugger.Step;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flowChartDebugger.impl.DecisionImpl#getIfTrue <em>If True</em>}</li>
 *   <li>{@link flowChartDebugger.impl.DecisionImpl#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends StepImpl implements Decision {
	/**
	 * The cached value of the '{@link #getIfTrue() <em>If True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrue()
	 * @generated
	 * @ordered
	 */
	protected Step ifTrue;
	/**
	 * The cached value of the '{@link #getIfFalse() <em>If False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected Step ifFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowChartDebuggerPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getIfTrue() {
		if (ifTrue != null && ifTrue.eIsProxy()) {
			InternalEObject oldIfTrue = (InternalEObject) ifTrue;
			ifTrue = (Step) eResolveProxy(oldIfTrue);
			if (ifTrue != oldIfTrue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FlowChartDebuggerPackage.DECISION__IF_TRUE, oldIfTrue, ifTrue));
			}
		}
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetIfTrue() {
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfTrue(Step newIfTrue) {
		Step oldIfTrue = ifTrue;
		ifTrue = newIfTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowChartDebuggerPackage.DECISION__IF_TRUE, oldIfTrue,
					ifTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getIfFalse() {
		if (ifFalse != null && ifFalse.eIsProxy()) {
			InternalEObject oldIfFalse = (InternalEObject) ifFalse;
			ifFalse = (Step) eResolveProxy(oldIfFalse);
			if (ifFalse != oldIfFalse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FlowChartDebuggerPackage.DECISION__IF_FALSE, oldIfFalse, ifFalse));
			}
		}
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetIfFalse() {
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFalse(Step newIfFalse) {
		Step oldIfFalse = ifFalse;
		ifFalse = newIfFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowChartDebuggerPackage.DECISION__IF_FALSE,
					oldIfFalse, ifFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FlowChartDebuggerPackage.DECISION__IF_TRUE:
			if (resolve)
				return getIfTrue();
			return basicGetIfTrue();
		case FlowChartDebuggerPackage.DECISION__IF_FALSE:
			if (resolve)
				return getIfFalse();
			return basicGetIfFalse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FlowChartDebuggerPackage.DECISION__IF_TRUE:
			setIfTrue((Step) newValue);
			return;
		case FlowChartDebuggerPackage.DECISION__IF_FALSE:
			setIfFalse((Step) newValue);
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
		case FlowChartDebuggerPackage.DECISION__IF_TRUE:
			setIfTrue((Step) null);
			return;
		case FlowChartDebuggerPackage.DECISION__IF_FALSE:
			setIfFalse((Step) null);
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
		case FlowChartDebuggerPackage.DECISION__IF_TRUE:
			return ifTrue != null;
		case FlowChartDebuggerPackage.DECISION__IF_FALSE:
			return ifFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //DecisionImpl
