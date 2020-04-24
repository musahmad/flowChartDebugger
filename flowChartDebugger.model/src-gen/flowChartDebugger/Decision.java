/**
 */
package flowChartDebugger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowChartDebugger.Decision#getIfTrue <em>If True</em>}</li>
 *   <li>{@link flowChartDebugger.Decision#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @see flowChartDebugger.FlowChartDebuggerPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends Step {

	/**
	 * Returns the value of the '<em><b>If True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If True</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True</em>' reference.
	 * @see #setIfTrue(Step)
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getDecision_IfTrue()
	 * @model derived="true"
	 * @generated
	 */
	Step getIfTrue();

	/**
	 * Sets the value of the '{@link flowChartDebugger.Decision#getIfTrue <em>If True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True</em>' reference.
	 * @see #getIfTrue()
	 * @generated
	 */
	void setIfTrue(Step value);

	/**
	 * Returns the value of the '<em><b>If False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If False</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False</em>' reference.
	 * @see #setIfFalse(Step)
	 * @see flowChartDebugger.FlowChartDebuggerPackage#getDecision_IfFalse()
	 * @model derived="true"
	 * @generated
	 */
	Step getIfFalse();

	/**
	 * Sets the value of the '{@link flowChartDebugger.Decision#getIfFalse <em>If False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False</em>' reference.
	 * @see #getIfFalse()
	 * @generated
	 */
	void setIfFalse(Step value);
} // Decision
