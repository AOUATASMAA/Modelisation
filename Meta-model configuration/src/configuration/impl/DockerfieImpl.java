/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.Dockerfie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dockerfie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.DockerfieImpl#getFROM <em>FROM</em>}</li>
 *   <li>{@link configuration.impl.DockerfieImpl#getRUN <em>RUN</em>}</li>
 *   <li>{@link configuration.impl.DockerfieImpl#getCOPY <em>COPY</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerfieImpl extends EObjectImpl implements Dockerfie {
	/**
	 * The default value of the '{@link #getFROM() <em>FROM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFROM() <em>FROM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRUN() <em>RUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUN()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRUN() <em>RUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUN()
	 * @generated
	 * @ordered
	 */
	protected String run = RUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOPY() <em>COPY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOPY()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOPY() <em>COPY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOPY()
	 * @generated
	 * @ordered
	 */
	protected String copy = COPY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerfieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DOCKERFIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFROM() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFROM(String newFROM) {
		String oldFROM = from;
		from = newFROM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DOCKERFIE__FROM, oldFROM, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRUN() {
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRUN(String newRUN) {
		String oldRUN = run;
		run = newRUN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DOCKERFIE__RUN, oldRUN, run));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCOPY() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOPY(String newCOPY) {
		String oldCOPY = copy;
		copy = newCOPY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DOCKERFIE__COPY, oldCOPY, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.DOCKERFIE__FROM:
				return getFROM();
			case ConfigurationPackage.DOCKERFIE__RUN:
				return getRUN();
			case ConfigurationPackage.DOCKERFIE__COPY:
				return getCOPY();
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
			case ConfigurationPackage.DOCKERFIE__FROM:
				setFROM((String)newValue);
				return;
			case ConfigurationPackage.DOCKERFIE__RUN:
				setRUN((String)newValue);
				return;
			case ConfigurationPackage.DOCKERFIE__COPY:
				setCOPY((String)newValue);
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
			case ConfigurationPackage.DOCKERFIE__FROM:
				setFROM(FROM_EDEFAULT);
				return;
			case ConfigurationPackage.DOCKERFIE__RUN:
				setRUN(RUN_EDEFAULT);
				return;
			case ConfigurationPackage.DOCKERFIE__COPY:
				setCOPY(COPY_EDEFAULT);
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
			case ConfigurationPackage.DOCKERFIE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case ConfigurationPackage.DOCKERFIE__RUN:
				return RUN_EDEFAULT == null ? run != null : !RUN_EDEFAULT.equals(run);
			case ConfigurationPackage.DOCKERFIE__COPY:
				return COPY_EDEFAULT == null ? copy != null : !COPY_EDEFAULT.equals(copy);
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
		result.append(" (FROM: ");
		result.append(from);
		result.append(", RUN: ");
		result.append(run);
		result.append(", COPY: ");
		result.append(copy);
		result.append(')');
		return result.toString();
	}

} //DockerfieImpl
