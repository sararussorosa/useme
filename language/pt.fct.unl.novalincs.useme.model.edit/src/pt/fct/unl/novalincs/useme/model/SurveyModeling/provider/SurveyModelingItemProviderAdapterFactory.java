/**
 */
package pt.fct.unl.novalincs.useme.model.SurveyModeling.provider;

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

import pt.fct.unl.novalincs.useme.model.SurveyModeling.util.SurveyModelingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyModelingItemProviderAdapterFactory extends SurveyModelingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SurveyModelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveySpecificationItemProvider surveySpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSurveySpecificationAdapter() {
		if (surveySpecificationItemProvider == null) {
			surveySpecificationItemProvider = new SurveySpecificationItemProvider(this);
		}

		return surveySpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyModelItemProvider surveyModelItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSurveyModelAdapter() {
		if (surveyModelItemProvider == null) {
			surveyModelItemProvider = new SurveyModelItemProvider(this);
		}

		return surveyModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionItemProvider questionItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionAdapter() {
		if (questionItemProvider == null) {
			questionItemProvider = new QuestionItemProvider(this);
		}

		return questionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyResultItemProvider surveyResultItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.SurveyResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSurveyResultAdapter() {
		if (surveyResultItemProvider == null) {
			surveyResultItemProvider = new SurveyResultItemProvider(this);
		}

		return surveyResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundQsItemProvider backgroundQsItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.BackgroundQs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackgroundQsAdapter() {
		if (backgroundQsItemProvider == null) {
			backgroundQsItemProvider = new BackgroundQsItemProvider(this);
		}

		return backgroundQsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackQsItemProvider feedbackQsItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.FeedbackQs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeedbackQsAdapter() {
		if (feedbackQsItemProvider == null) {
			feedbackQsItemProvider = new FeedbackQsItemProvider(this);
		}

		return feedbackQsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemProvider questionnaireItemProvider;

	/**
	 * This creates an adapter for a {@link pt.fct.unl.novalincs.useme.model.SurveyModeling.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionnaireAdapter() {
		if (questionnaireItemProvider == null) {
			questionnaireItemProvider = new QuestionnaireItemProvider(this);
		}

		return questionnaireItemProvider;
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
		if (surveySpecificationItemProvider != null) surveySpecificationItemProvider.dispose();
		if (surveyModelItemProvider != null) surveyModelItemProvider.dispose();
		if (questionItemProvider != null) questionItemProvider.dispose();
		if (surveyResultItemProvider != null) surveyResultItemProvider.dispose();
		if (backgroundQsItemProvider != null) backgroundQsItemProvider.dispose();
		if (feedbackQsItemProvider != null) feedbackQsItemProvider.dispose();
		if (questionnaireItemProvider != null) questionnaireItemProvider.dispose();
	}

}
