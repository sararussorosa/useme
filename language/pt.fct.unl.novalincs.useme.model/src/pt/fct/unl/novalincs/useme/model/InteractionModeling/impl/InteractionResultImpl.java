/**
 */
package pt.fct.unl.novalincs.useme.model.InteractionModeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModel;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionModelingPackage;
import pt.fct.unl.novalincs.useme.model.InteractionModeling.InteractionResult;

import pt.fct.unl.novalincs.useme.model.ReportModeling.impl.EvaluationResultImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.fct.unl.novalincs.useme.model.InteractionModeling.impl.InteractionResultImpl#getInteractionModel <em>Interaction Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionResultImpl extends EvaluationResultImpl implements InteractionResult {
	/**
	 * The cached value of the '{@link #getInteractionModel() <em>Interaction Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionModel()
	 * @generated
	 * @ordered
	 */
	protected InteractionModel interactionModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionModelingPackage.Literals.INTERACTION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModel getInteractionModel() {
		if (interactionModel != null && interactionModel.eIsProxy()) {
			InternalEObject oldInteractionModel = (InternalEObject)interactionModel;
			interactionModel = (InteractionModel)eResolveProxy(oldInteractionModel);
			if (interactionModel != oldInteractionModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL, oldInteractionModel, interactionModel));
			}
		}
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionModel basicGetInteractionModel() {
		return interactionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionModel(InteractionModel newInteractionModel, NotificationChain msgs) {
		InteractionModel oldInteractionModel = interactionModel;
		interactionModel = newInteractionModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL, oldInteractionModel, newInteractionModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionModel(InteractionModel newInteractionModel) {
		if (newInteractionModel != interactionModel) {
			NotificationChain msgs = null;
			if (interactionModel != null)
				msgs = ((InternalEObject)interactionModel).eInverseRemove(this, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT, InteractionModel.class, msgs);
			if (newInteractionModel != null)
				msgs = ((InternalEObject)newInteractionModel).eInverseAdd(this, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT, InteractionModel.class, msgs);
			msgs = basicSetInteractionModel(newInteractionModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL, newInteractionModel, newInteractionModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				if (interactionModel != null)
					msgs = ((InternalEObject)interactionModel).eInverseRemove(this, InteractionModelingPackage.INTERACTION_MODEL__INTERACTION_RESULT, InteractionModel.class, msgs);
				return basicSetInteractionModel((InteractionModel)otherEnd, msgs);
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
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				return basicSetInteractionModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				if (resolve) return getInteractionModel();
				return basicGetInteractionModel();
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
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				setInteractionModel((InteractionModel)newValue);
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
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				setInteractionModel((InteractionModel)null);
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
			case InteractionModelingPackage.INTERACTION_RESULT__INTERACTION_MODEL:
				return interactionModel != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionResultImpl
