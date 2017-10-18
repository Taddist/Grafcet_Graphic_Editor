/**
 */
package GrafcetP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GrafcetP.Grafcet#getElements <em>Elements</em>}</li>
 *   <li>{@link GrafcetP.Grafcet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see GrafcetP.GrafcetPPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link GrafcetP.Element}.
	 * It is bidirectional and its opposite is '{@link GrafcetP.Element#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see GrafcetP.GrafcetPPackage#getGrafcet_Elements()
	 * @see GrafcetP.Element#getGrafcet
	 * @model opposite="grafcet" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link GrafcetP.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see GrafcetP.GrafcetPPackage#getGrafcet_Connections()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Transition> getConnections();

} // Grafcet
