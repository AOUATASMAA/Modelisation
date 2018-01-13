/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.Type_service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.Type_serviceImpl#getName_typ_ser <em>Name typ ser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Type_serviceImpl extends EObjectImpl implements Type_service {
	/**
	 * The default value of the '{@link #getName_typ_ser() <em>Name typ ser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_typ_ser()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TYP_SER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_typ_ser() <em>Name typ ser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_typ_ser()
	 * @generated
	 * @ordered
	 */
	protected String name_typ_ser = NAME_TYP_SER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Type_serviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.TYPE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_typ_ser() {
		return name_typ_ser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_typ_ser(String newName_typ_ser) {
		String oldName_typ_ser = name_typ_ser;
		name_typ_ser = newName_typ_ser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.TYPE_SERVICE__NAME_TYP_SER, oldName_typ_ser, name_typ_ser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.TYPE_SERVICE__NAME_TYP_SER:
				return getName_typ_ser();
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
			case ConfigurationPackage.TYPE_SERVICE__NAME_TYP_SER:
				setName_typ_ser((String)newValue);
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
			case ConfigurationPackage.TYPE_SERVICE__NAME_TYP_SER:
				setName_typ_ser(NAME_TYP_SER_EDEFAULT);
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
			case ConfigurationPackage.TYPE_SERVICE__NAME_TYP_SER:
				return NAME_TYP_SER_EDEFAULT == null ? name_typ_ser != null : !NAME_TYP_SER_EDEFAULT.equals(name_typ_ser);
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
		result.append(" (name_typ_ser: ");
		result.append(name_typ_ser);
		result.append(')');
		return result.toString();
	}

} //Type_serviceImpl
