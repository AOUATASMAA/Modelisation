/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.Service;
import configuration.Type_service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.ServiceImpl#getName_ser <em>Name ser</em>}</li>
 *   <li>{@link configuration.impl.ServiceImpl#getPossessed <em>Possessed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The default value of the '{@link #getName_ser() <em>Name ser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_ser()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_ser() <em>Name ser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_ser()
	 * @generated
	 * @ordered
	 */
	protected String name_ser = NAME_SER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossessed() <em>Possessed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessed()
	 * @generated
	 * @ordered
	 */
	protected EList possessed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_ser() {
		return name_ser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_ser(String newName_ser) {
		String oldName_ser = name_ser;
		name_ser = newName_ser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SERVICE__NAME_SER, oldName_ser, name_ser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPossessed() {
		if (possessed == null) {
			possessed = new EObjectResolvingEList(Type_service.class, this, ConfigurationPackage.SERVICE__POSSESSED);
		}
		return possessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.SERVICE__NAME_SER:
				return getName_ser();
			case ConfigurationPackage.SERVICE__POSSESSED:
				return getPossessed();
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
			case ConfigurationPackage.SERVICE__NAME_SER:
				setName_ser((String)newValue);
				return;
			case ConfigurationPackage.SERVICE__POSSESSED:
				getPossessed().clear();
				getPossessed().addAll((Collection)newValue);
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
			case ConfigurationPackage.SERVICE__NAME_SER:
				setName_ser(NAME_SER_EDEFAULT);
				return;
			case ConfigurationPackage.SERVICE__POSSESSED:
				getPossessed().clear();
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
			case ConfigurationPackage.SERVICE__NAME_SER:
				return NAME_SER_EDEFAULT == null ? name_ser != null : !NAME_SER_EDEFAULT.equals(name_ser);
			case ConfigurationPackage.SERVICE__POSSESSED:
				return possessed != null && !possessed.isEmpty();
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
		result.append(" (name_ser: ");
		result.append(name_ser);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
