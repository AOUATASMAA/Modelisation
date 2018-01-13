/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.impl;

import configuration.Account;
import configuration.ConfigurationPackage;
import configuration.Service;
import configuration.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.UserImpl#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link configuration.impl.UserImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link configuration.impl.UserImpl#getNumberphone <em>Numberphone</em>}</li>
 *   <li>{@link configuration.impl.UserImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link configuration.impl.UserImpl#getIntegrated <em>Integrated</em>}</li>
 *   <li>{@link configuration.impl.UserImpl#getHave <em>Have</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends EObjectImpl implements User {
	/**
	 * The default value of the '{@link #getFamilyname() <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyname()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyname() <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyname()
	 * @generated
	 * @ordered
	 */
	protected String familyname = FAMILYNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberphone() <em>Numberphone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberphone()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBERPHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberphone() <em>Numberphone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberphone()
	 * @generated
	 * @ordered
	 */
	protected int numberphone = NUMBERPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntegrated() <em>Integrated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrated()
	 * @generated
	 * @ordered
	 */
	protected EList integrated;

	/**
	 * The cached value of the '{@link #getHave() <em>Have</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHave()
	 * @generated
	 * @ordered
	 */
	protected EList have;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyname() {
		return familyname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyname(String newFamilyname) {
		String oldFamilyname = familyname;
		familyname = newFamilyname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.USER__FAMILYNAME, oldFamilyname, familyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.USER__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberphone() {
		return numberphone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberphone(int newNumberphone) {
		int oldNumberphone = numberphone;
		numberphone = newNumberphone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.USER__NUMBERPHONE, oldNumberphone, numberphone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.USER__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIntegrated() {
		if (integrated == null) {
			integrated = new EObjectResolvingEList(Service.class, this, ConfigurationPackage.USER__INTEGRATED);
		}
		return integrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHave() {
		if (have == null) {
			have = new EObjectResolvingEList(Account.class, this, ConfigurationPackage.USER__HAVE);
		}
		return have;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.USER__FAMILYNAME:
				return getFamilyname();
			case ConfigurationPackage.USER__FIRSTNAME:
				return getFirstname();
			case ConfigurationPackage.USER__NUMBERPHONE:
				return new Integer(getNumberphone());
			case ConfigurationPackage.USER__ADRESS:
				return getAdress();
			case ConfigurationPackage.USER__INTEGRATED:
				return getIntegrated();
			case ConfigurationPackage.USER__HAVE:
				return getHave();
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
			case ConfigurationPackage.USER__FAMILYNAME:
				setFamilyname((String)newValue);
				return;
			case ConfigurationPackage.USER__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case ConfigurationPackage.USER__NUMBERPHONE:
				setNumberphone(((Integer)newValue).intValue());
				return;
			case ConfigurationPackage.USER__ADRESS:
				setAdress((String)newValue);
				return;
			case ConfigurationPackage.USER__INTEGRATED:
				getIntegrated().clear();
				getIntegrated().addAll((Collection)newValue);
				return;
			case ConfigurationPackage.USER__HAVE:
				getHave().clear();
				getHave().addAll((Collection)newValue);
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
			case ConfigurationPackage.USER__FAMILYNAME:
				setFamilyname(FAMILYNAME_EDEFAULT);
				return;
			case ConfigurationPackage.USER__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case ConfigurationPackage.USER__NUMBERPHONE:
				setNumberphone(NUMBERPHONE_EDEFAULT);
				return;
			case ConfigurationPackage.USER__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case ConfigurationPackage.USER__INTEGRATED:
				getIntegrated().clear();
				return;
			case ConfigurationPackage.USER__HAVE:
				getHave().clear();
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
			case ConfigurationPackage.USER__FAMILYNAME:
				return FAMILYNAME_EDEFAULT == null ? familyname != null : !FAMILYNAME_EDEFAULT.equals(familyname);
			case ConfigurationPackage.USER__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case ConfigurationPackage.USER__NUMBERPHONE:
				return numberphone != NUMBERPHONE_EDEFAULT;
			case ConfigurationPackage.USER__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case ConfigurationPackage.USER__INTEGRATED:
				return integrated != null && !integrated.isEmpty();
			case ConfigurationPackage.USER__HAVE:
				return have != null && !have.isEmpty();
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
		result.append(" (Familyname: ");
		result.append(familyname);
		result.append(", Firstname: ");
		result.append(firstname);
		result.append(", Numberphone: ");
		result.append(numberphone);
		result.append(", Adress: ");
		result.append(adress);
		result.append(')');
		return result.toString();
	}

} //UserImpl
