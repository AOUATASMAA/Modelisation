/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.impl;

import configuration.Account;
import configuration.Application;
import configuration.ConfigurationPackage;
import configuration.Provider;
import configuration.Technology;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.ProviderImpl#getName_provider <em>Name provider</em>}</li>
 *   <li>{@link configuration.impl.ProviderImpl#getBased <em>Based</em>}</li>
 *   <li>{@link configuration.impl.ProviderImpl#getConnected <em>Connected</em>}</li>
 *   <li>{@link configuration.impl.ProviderImpl#getContained <em>Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderImpl extends EObjectImpl implements Provider {
	/**
	 * The default value of the '{@link #getName_provider() <em>Name provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_provider()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_provider() <em>Name provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_provider()
	 * @generated
	 * @ordered
	 */
	protected String name_provider = NAME_PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBased() <em>Based</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBased()
	 * @generated
	 * @ordered
	 */
	protected EList based;

	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected EList connected;

	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected Application contained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_provider() {
		return name_provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_provider(String newName_provider) {
		String oldName_provider = name_provider;
		name_provider = newName_provider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROVIDER__NAME_PROVIDER, oldName_provider, name_provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBased() {
		if (based == null) {
			based = new EObjectResolvingEList(Technology.class, this, ConfigurationPackage.PROVIDER__BASED);
		}
		return based;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnected() {
		if (connected == null) {
			connected = new EObjectResolvingEList(Account.class, this, ConfigurationPackage.PROVIDER__CONNECTED);
		}
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getContained() {
		if (contained != null && contained.eIsProxy()) {
			InternalEObject oldContained = (InternalEObject)contained;
			contained = (Application)eResolveProxy(oldContained);
			if (contained != oldContained) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationPackage.PROVIDER__CONTAINED, oldContained, contained));
			}
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetContained() {
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained(Application newContained) {
		Application oldContained = contained;
		contained = newContained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROVIDER__CONTAINED, oldContained, contained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.PROVIDER__NAME_PROVIDER:
				return getName_provider();
			case ConfigurationPackage.PROVIDER__BASED:
				return getBased();
			case ConfigurationPackage.PROVIDER__CONNECTED:
				return getConnected();
			case ConfigurationPackage.PROVIDER__CONTAINED:
				if (resolve) return getContained();
				return basicGetContained();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.PROVIDER__NAME_PROVIDER:
				setName_provider((String)newValue);
				return;
			case ConfigurationPackage.PROVIDER__BASED:
				getBased().clear();
				getBased().addAll((Collection)newValue);
				return;
			case ConfigurationPackage.PROVIDER__CONNECTED:
				getConnected().clear();
				getConnected().addAll((Collection)newValue);
				return;
			case ConfigurationPackage.PROVIDER__CONTAINED:
				setContained((Application)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PROVIDER__NAME_PROVIDER:
				setName_provider(NAME_PROVIDER_EDEFAULT);
				return;
			case ConfigurationPackage.PROVIDER__BASED:
				getBased().clear();
				return;
			case ConfigurationPackage.PROVIDER__CONNECTED:
				getConnected().clear();
				return;
			case ConfigurationPackage.PROVIDER__CONTAINED:
				setContained((Application)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PROVIDER__NAME_PROVIDER:
				return NAME_PROVIDER_EDEFAULT == null ? name_provider != null : !NAME_PROVIDER_EDEFAULT.equals(name_provider);
			case ConfigurationPackage.PROVIDER__BASED:
				return based != null && !based.isEmpty();
			case ConfigurationPackage.PROVIDER__CONNECTED:
				return connected != null && !connected.isEmpty();
			case ConfigurationPackage.PROVIDER__CONTAINED:
				return contained != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name_provider: ");
		result.append(name_provider);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
