/**
 */
package ensias.grafcet.sirius.Grafcet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ensias.grafcet.sirius.Grafcet.Element#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ensias.grafcet.sirius.Grafcet.Grafcet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafcet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(Grafcet)
	 * @see ensias.grafcet.sirius.Grafcet.GrafcetPackage#getElement_Grafcet()
	 * @see ensias.grafcet.sirius.Grafcet.Grafcet#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Grafcet getGrafcet();

	/**
	 * Sets the value of the '{@link ensias.grafcet.sirius.Grafcet.Element#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(Grafcet value);

} // Element
