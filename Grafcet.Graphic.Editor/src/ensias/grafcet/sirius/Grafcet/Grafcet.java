/**
 */
package ensias.grafcet.sirius.Grafcet;

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
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Grafcet#getElements <em>Elements</em>}</li>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Grafcet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ensias.grafcet.sirius.Grafcet.Element}.
	 * It is bidirectional and its opposite is '{@link ensias.grafcet.sirius.Grafcet.Element#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getGrafcet_Elements()
	 * @see ensias.grafcet.sirius.Grafcet.Element#getGrafcet
	 * @model opposite="grafcet" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link ensias.grafcet.sirius.Grafcet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getGrafcet_Connections()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Transition> getConnections();

} // Grafcet
