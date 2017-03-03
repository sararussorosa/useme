/**
 */
package pt.fct.unl.novalincs.useme.model.Utility.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import pt.fct.unl.novalincs.useme.model.Utility.util.UtilityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityItemProviderAdapterFactory extends UtilityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilitySpecificationItemProvider utilitySpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.UtilitySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUtilitySpecificationAdapter() {
		if (utilitySpecificationItemProvider == null) {
			utilitySpecificationItemProvider = new UtilitySpecificationItemProvider(this);
		}

		return utilitySpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyEngineItemProvider surveyEngineItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.SurveyEngine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSurveyEngineAdapter() {
		if (surveyEngineItemProvider == null) {
			surveyEngineItemProvider = new SurveyEngineItemProvider(this);
		}

		return surveyEngineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.DSL} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSLItemProvider dslItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.DSL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSLAdapter() {
		if (dslItemProvider == null) {
			dslItemProvider = new DSLItemProvider(this);
		}

		return dslItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModelItemProvider processModelItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.ProcessModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessModelAdapter() {
		if (processModelItemProvider == null) {
			processModelItemProvider = new ProcessModelItemProvider(this);
		}

		return processModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalGoalItemProvider functionalGoalItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.FunctionalGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionalGoalAdapter() {
		if (functionalGoalItemProvider == null) {
			functionalGoalItemProvider = new FunctionalGoalItemProvider(this);
		}

		return functionalGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistingGMItemProvider existingGMItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.ExistingGM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExistingGMAdapter() {
		if (existingGMItemProvider == null) {
			existingGMItemProvider = new ExistingGMItemProvider(this);
		}

		return existingGMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEVariableItemProvider ceVariableItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.CEVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCEVariableAdapter() {
		if (ceVariableItemProvider == null) {
			ceVariableItemProvider = new CEVariableItemProvider(this);
		}

		return ceVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileTemplateItemProvider profileTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.ProfileTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfileTemplateAdapter() {
		if (profileTemplateItemProvider == null) {
			profileTemplateItemProvider = new ProfileTemplateItemProvider(this);
		}

		return profileTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalExpressionItemProvider logicalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.LogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalExpressionAdapter() {
		if (logicalExpressionItemProvider == null) {
			logicalExpressionItemProvider = new LogicalExpressionItemProvider(this);
		}

		return logicalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteSyntaxItemProvider concreteSyntaxItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.ConcreteSyntax}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcreteSyntaxAdapter() {
		if (concreteSyntaxItemProvider == null) {
			concreteSyntaxItemProvider = new ConcreteSyntaxItemProvider(this);
		}

		return concreteSyntaxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxItemProvider abstractSyntaxItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.AbstractSyntax}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractSyntaxAdapter() {
		if (abstractSyntaxItemProvider == null) {
			abstractSyntaxItemProvider = new AbstractSyntaxItemProvider(this);
		}

		return abstractSyntaxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutsideRefItemProvider outsideRefItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.OutsideRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutsideRefAdapter() {
		if (outsideRefItemProvider == null) {
			outsideRefItemProvider = new OutsideRefItemProvider(this);
		}

		return outsideRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.Utility.Requirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementItemProvider requirementItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.Utility.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementAdapter() {
		if (requirementItemProvider == null) {
			requirementItemProvider = new RequirementItemProvider(this);
		}

		return requirementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (utilitySpecificationItemProvider != null) utilitySpecificationItemProvider.dispose();
		if (surveyEngineItemProvider != null) surveyEngineItemProvider.dispose();
		if (dslItemProvider != null) dslItemProvider.dispose();
		if (processModelItemProvider != null) processModelItemProvider.dispose();
		if (functionalGoalItemProvider != null) functionalGoalItemProvider.dispose();
		if (existingGMItemProvider != null) existingGMItemProvider.dispose();
		if (ceVariableItemProvider != null) ceVariableItemProvider.dispose();
		if (profileTemplateItemProvider != null) profileTemplateItemProvider.dispose();
		if (logicalExpressionItemProvider != null) logicalExpressionItemProvider.dispose();
		if (concreteSyntaxItemProvider != null) concreteSyntaxItemProvider.dispose();
		if (abstractSyntaxItemProvider != null) abstractSyntaxItemProvider.dispose();
		if (outsideRefItemProvider != null) outsideRefItemProvider.dispose();
		if (requirementItemProvider != null) requirementItemProvider.dispose();
	}

}
