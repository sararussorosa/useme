/**
 */
package fr.tpt.rdalte.useme.architecture.model.usemearch.impl;

import fr.tpt.rdalte.useme.architecture.model.usemearch.AbstractSyntax;
import fr.tpt.rdalte.useme.architecture.model.usemearch.ConcreteSyntax;
import fr.tpt.rdalte.useme.architecture.model.usemearch.Dsl;
import fr.tpt.rdalte.useme.architecture.model.usemearch.Syntax;
import fr.tpt.rdalte.useme.architecture.model.usemearch.UsemearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl#getOwnedSyntaxes <em>Owned Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl#getConcreteSyntaxes <em>Concrete Syntaxes</em>}</li>
 *   <li>{@link fr.tpt.rdalte.useme.architecture.model.usemearch.impl.DslImpl#getAbstractsyntax <em>Abstractsyntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslImpl extends IdentifiedElementImpl implements Dsl {
	/**
	 * The cached value of the '{@link #getOwnedSyntaxes() <em>Owned Syntaxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSyntaxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Syntax> ownedSyntaxes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsemearchPackage.Literals.DSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Syntax> getOwnedSyntaxes() {
		if (ownedSyntaxes == null) {
			ownedSyntaxes = new EObjectContainmentEList<Syntax>(Syntax.class, this, UsemearchPackage.DSL__OWNED_SYNTAXES);
		}
		return ownedSyntaxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteSyntax> getConcreteSyntaxes() {
		// TODO: implement this method to return the 'Concrete Syntaxes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax getAbstractsyntax() {
		AbstractSyntax abstractsyntax = basicGetAbstractsyntax();
		return abstractsyntax != null && abstractsyntax.eIsProxy() ? (AbstractSyntax)eResolveProxy((InternalEObject)abstractsyntax) : abstractsyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax basicGetAbstractsyntax() {
		// TODO: implement this method to return the 'Abstractsyntax' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return ((InternalEList<?>)getOwnedSyntaxes()).basicRemove(otherEnd, msgs);
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
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return getOwnedSyntaxes();
			case UsemearchPackage.DSL__CONCRETE_SYNTAXES:
				return getConcreteSyntaxes();
			case UsemearchPackage.DSL__ABSTRACTSYNTAX:
				if (resolve) return getAbstractsyntax();
				return basicGetAbstractsyntax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				getOwnedSyntaxes().clear();
				getOwnedSyntaxes().addAll((Collection<? extends Syntax>)newValue);
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
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				getOwnedSyntaxes().clear();
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
			case UsemearchPackage.DSL__OWNED_SYNTAXES:
				return ownedSyntaxes != null && !ownedSyntaxes.isEmpty();
			case UsemearchPackage.DSL__CONCRETE_SYNTAXES:
				return !getConcreteSyntaxes().isEmpty();
			case UsemearchPackage.DSL__ABSTRACTSYNTAX:
				return basicGetAbstractsyntax() != null;
		}
		return super.eIsSet(featureID);
	}

} //DslImpl
