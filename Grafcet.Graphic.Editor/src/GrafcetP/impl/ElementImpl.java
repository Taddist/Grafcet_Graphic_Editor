/**
 */
package GrafcetP.impl;

import GrafcetP.Element;
import GrafcetP.Grafcet;
import GrafcetP.GrafcetPPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GrafcetP.impl.ElementImpl#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends NamedElementImpl implements Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafcet getGrafcet() {
		if (eContainerFeatureID() != GrafcetPPackage.ELEMENT__GRAFCET) return null;
		return (Grafcet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcet(Grafcet newGrafcet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGrafcet, GrafcetPPackage.ELEMENT__GRAFCET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrafcet(Grafcet newGrafcet) {
		if (newGrafcet != eInternalContainer() || (eContainerFeatureID() != GrafcetPPackage.ELEMENT__GRAFCET && newGrafcet != null)) {
			if (EcoreUtil.isAncestor(this, newGrafcet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGrafcet != null)
				msgs = ((InternalEObject)newGrafcet).eInverseAdd(this, GrafcetPPackage.GRAFCET__ELEMENTS, Grafcet.class, msgs);
			msgs = basicSetGrafcet(newGrafcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPPackage.ELEMENT__GRAFCET, newGrafcet, newGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafcetPPackage.ELEMENT__GRAFCET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGrafcet((Grafcet)otherEnd, msgs);
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
			case GrafcetPPackage.ELEMENT__GRAFCET:
				return basicSetGrafcet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GrafcetPPackage.ELEMENT__GRAFCET:
				return eInternalContainer().eInverseRemove(this, GrafcetPPackage.GRAFCET__ELEMENTS, Grafcet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPPackage.ELEMENT__GRAFCET:
				return getGrafcet();
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
			case GrafcetPPackage.ELEMENT__GRAFCET:
				setGrafcet((Grafcet)newValue);
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
			case GrafcetPPackage.ELEMENT__GRAFCET:
				setGrafcet((Grafcet)null);
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
			case GrafcetPPackage.ELEMENT__GRAFCET:
				return getGrafcet() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
