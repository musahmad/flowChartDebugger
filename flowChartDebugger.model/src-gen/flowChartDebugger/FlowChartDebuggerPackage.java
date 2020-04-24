/**
 */
package flowChartDebugger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flowChartDebugger.FlowChartDebuggerFactory
 * @model kind="package"
 * @generated
 */
public interface FlowChartDebuggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flowChartDebugger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/flowChartDebugger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flowChartDebugger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowChartDebuggerPackage eINSTANCE = flowChartDebugger.impl.FlowChartDebuggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.FlowchartImpl <em>Flowchart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.FlowchartImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getFlowchart()
	 * @generated
	 */
	int FLOWCHART = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__NAME = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__STEP = 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__CURRENT = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART__START = 3;

	/**
	 * The number of structural features of the '<em>Flowchart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Flowchart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWCHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.StepImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT_STEP = 1;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PREVIOUS_STEP = 2;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__HAS_RUN = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.TerminalImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PREVIOUS_STEP = STEP__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HAS_RUN = STEP__HAS_RUN;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.ProcessImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PREVIOUS_STEP = STEP__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_RUN = STEP__HAS_RUN;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.InputOrOutputImpl <em>Input Or Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.InputOrOutputImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getInputOrOutput()
	 * @generated
	 */
	int INPUT_OR_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT__PREVIOUS_STEP = STEP__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT__HAS_RUN = STEP__HAS_RUN;

	/**
	 * The number of structural features of the '<em>Input Or Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Or Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OR_OUTPUT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.DecisionImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PREVIOUS_STEP = STEP__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAS_RUN = STEP__HAS_RUN;

	/**
	 * The feature id for the '<em><b>If True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__IF_TRUE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__IF_FALSE = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.StartImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStart()
	 * @generated
	 */
	int START = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = TERMINAL__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NEXT_STEP = TERMINAL__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PREVIOUS_STEP = TERMINAL__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__HAS_RUN = TERMINAL__HAS_RUN;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowChartDebugger.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowChartDebugger.impl.StopImpl
	 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = TERMINAL__NAME;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NEXT_STEP = TERMINAL__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Previous Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PREVIOUS_STEP = TERMINAL__PREVIOUS_STEP;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__HAS_RUN = TERMINAL__HAS_RUN;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Flowchart <em>Flowchart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flowchart</em>'.
	 * @see flowChartDebugger.Flowchart
	 * @generated
	 */
	EClass getFlowchart();

	/**
	 * Returns the meta object for the attribute '{@link flowChartDebugger.Flowchart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flowChartDebugger.Flowchart#getName()
	 * @see #getFlowchart()
	 * @generated
	 */
	EAttribute getFlowchart_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link flowChartDebugger.Flowchart#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see flowChartDebugger.Flowchart#getStep()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Step();

	/**
	 * Returns the meta object for the reference '{@link flowChartDebugger.Flowchart#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see flowChartDebugger.Flowchart#getCurrent()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Current();

	/**
	 * Returns the meta object for the reference '{@link flowChartDebugger.Flowchart#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see flowChartDebugger.Flowchart#getStart()
	 * @see #getFlowchart()
	 * @generated
	 */
	EReference getFlowchart_Start();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see flowChartDebugger.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link flowChartDebugger.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flowChartDebugger.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the reference list '{@link flowChartDebugger.Step#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Step</em>'.
	 * @see flowChartDebugger.Step#getNextStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_NextStep();

	/**
	 * Returns the meta object for the reference list '{@link flowChartDebugger.Step#getPreviousStep <em>Previous Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Step</em>'.
	 * @see flowChartDebugger.Step#getPreviousStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_PreviousStep();

	/**
	 * Returns the meta object for the attribute '{@link flowChartDebugger.Step#isHasRun <em>Has Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Run</em>'.
	 * @see flowChartDebugger.Step#isHasRun()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_HasRun();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see flowChartDebugger.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see flowChartDebugger.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.InputOrOutput <em>Input Or Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Or Output</em>'.
	 * @see flowChartDebugger.InputOrOutput
	 * @generated
	 */
	EClass getInputOrOutput();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see flowChartDebugger.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the reference '{@link flowChartDebugger.Decision#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If True</em>'.
	 * @see flowChartDebugger.Decision#getIfTrue()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_IfTrue();

	/**
	 * Returns the meta object for the reference '{@link flowChartDebugger.Decision#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If False</em>'.
	 * @see flowChartDebugger.Decision#getIfFalse()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_IfFalse();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see flowChartDebugger.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link flowChartDebugger.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see flowChartDebugger.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowChartDebuggerFactory getFlowChartDebuggerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.FlowchartImpl <em>Flowchart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.FlowchartImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getFlowchart()
		 * @generated
		 */
		EClass FLOWCHART = eINSTANCE.getFlowchart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWCHART__NAME = eINSTANCE.getFlowchart_Name();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWCHART__STEP = eINSTANCE.getFlowchart_Step();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWCHART__CURRENT = eINSTANCE.getFlowchart_Current();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWCHART__START = eINSTANCE.getFlowchart_Start();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.StepImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT_STEP = eINSTANCE.getStep_NextStep();

		/**
		 * The meta object literal for the '<em><b>Previous Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PREVIOUS_STEP = eINSTANCE.getStep_PreviousStep();

		/**
		 * The meta object literal for the '<em><b>Has Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__HAS_RUN = eINSTANCE.getStep_HasRun();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.TerminalImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.ProcessImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.InputOrOutputImpl <em>Input Or Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.InputOrOutputImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getInputOrOutput()
		 * @generated
		 */
		EClass INPUT_OR_OUTPUT = eINSTANCE.getInputOrOutput();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.DecisionImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__IF_TRUE = eINSTANCE.getDecision_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__IF_FALSE = eINSTANCE.getDecision_IfFalse();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.StartImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link flowChartDebugger.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowChartDebugger.impl.StopImpl
		 * @see flowChartDebugger.impl.FlowChartDebuggerPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

	}

} //FlowChartDebuggerPackage
