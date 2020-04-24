/**
 */
package flowChartDebugger.impl;

import flowChartDebugger.Decision;
import flowChartDebugger.FlowChartDebuggerFactory;
import flowChartDebugger.FlowChartDebuggerPackage;
import flowChartDebugger.Flowchart;
import flowChartDebugger.InputOrOutput;
import flowChartDebugger.Start;
import flowChartDebugger.Stop;
import org.eclipse.emf.ecore.EClass;
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
public class FlowChartDebuggerFactoryImpl extends EFactoryImpl implements FlowChartDebuggerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlowChartDebuggerFactory init() {
		try {
			FlowChartDebuggerFactory theFlowChartDebuggerFactory = (FlowChartDebuggerFactory) EPackage.Registry.INSTANCE
					.getEFactory(FlowChartDebuggerPackage.eNS_URI);
			if (theFlowChartDebuggerFactory != null) {
				return theFlowChartDebuggerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlowChartDebuggerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowChartDebuggerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FlowChartDebuggerPackage.FLOWCHART:
			return createFlowchart();
		case FlowChartDebuggerPackage.PROCESS:
			return createProcess();
		case FlowChartDebuggerPackage.INPUT_OR_OUTPUT:
			return createInputOrOutput();
		case FlowChartDebuggerPackage.DECISION:
			return createDecision();
		case FlowChartDebuggerPackage.START:
			return createStart();
		case FlowChartDebuggerPackage.STOP:
			return createStop();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowchart createFlowchart() {
		FlowchartImpl flowchart = new FlowchartImpl();
		return flowchart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public flowChartDebugger.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOrOutput createInputOrOutput() {
		InputOrOutputImpl inputOrOutput = new InputOrOutputImpl();
		return inputOrOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowChartDebuggerPackage getFlowChartDebuggerPackage() {
		return (FlowChartDebuggerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlowChartDebuggerPackage getPackage() {
		return FlowChartDebuggerPackage.eINSTANCE;
	}

} //FlowChartDebuggerFactoryImpl
