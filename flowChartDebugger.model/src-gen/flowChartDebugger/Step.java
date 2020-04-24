/**
 */
package flowChartDebugger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowChartDebugger.Step#getName <em>Name</em>}</li>
 *   <li>{@link flowChartDebugger.Step#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link flowChartDebugger.Step#getPreviousStep <em>Previous Step</em>}</li>
 *   <li>{@link flowChartDebugger.Step#isHasRun <em>Has Run</em>}</li>
 * </ul>
 *
 * @see flowChartDebugger.FlowChartDebuggerPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link flowChartDebugger.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' reference list.
	 * The list contents are of type {@link flowChartDebugger.Step}.
	 * It is bidirectional and its opposite is '{@link flowChartDebugger.Step#getPreviousStep <em>Previous Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' reference list.
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getStep_NextStep()
	 * @see flowChartDebugger.Step#getPreviousStep
	 * @model opposite="previousStep"
	 * @generated
	 */
	EList<Step> getNextStep();

	/**
	 * Returns the value of the '<em><b>Previous Step</b></em>' reference list.
	 * The list contents are of type {@link flowChartDebugger.Step}.
	 * It is bidirectional and its opposite is '{@link flowChartDebugger.Step#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Step</em>' reference list.
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getStep_PreviousStep()
	 * @see flowChartDebugger.Step#getNextStep
	 * @model opposite="nextStep"
	 * @generated
	 */
	EList<Step> getPreviousStep();

	/**
	 * Returns the value of the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Run</em>' attribute.
	 * @see #setHasRun(boolean)
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getStep_HasRun()
	 * @model
	 * @generated
	 */
	boolean isHasRun();

	/**
	 * Sets the value of the '{@link flowChartDebugger.Step#isHasRun <em>Has Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Run</em>' attribute.
	 * @see #isHasRun()
	 * @generated
	 */
	void setHasRun(boolean value);

} // Step
