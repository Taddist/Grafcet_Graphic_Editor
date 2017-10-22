/**
 */
package ensias.grafcet.sirius.Grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Step#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Step#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Step#getAction <em>Action</em>}</li>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Step#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Step#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Element {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep_IsInitial()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link ensias.grafcet.sirius.Grafcet.Step#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep_IsActive()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link ensias.grafcet.sirius.Grafcet.Step#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep_Action()
	 * @model ordered="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link ensias.grafcet.sirius.Grafcet.Step#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link ensias.grafcet.sirius.Grafcet.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep_IncomingConnections()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Step> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link ensias.grafcet.sirius.Grafcet.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getStep_OutgoingConnections()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Step> getOutgoingConnections();

} // Step
