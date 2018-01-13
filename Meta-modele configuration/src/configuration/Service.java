/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Service#getName_ser <em>Name ser</em>}</li>
 *   <li>{@link configuration.Service#getPossessed <em>Possessed</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name ser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name ser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ser</em>' attribute.
	 * @see #setName_ser(String)
	 * @see configuration.ConfigurationPackage#getService_Name_ser()
	 * @model
	 * @generated
	 */
	String getName_ser();

	/**
	 * Sets the value of the '{@link configuration.Service#getName_ser <em>Name ser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ser</em>' attribute.
	 * @see #getName_ser()
	 * @generated
	 */
	void setName_ser(String value);

	/**
	 * Returns the value of the '<em><b>Possessed</b></em>' reference list.
	 * The list contents are of type {@link configuration.Type_service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possessed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possessed</em>' reference list.
	 * @see configuration.ConfigurationPackage#getService_Possessed()
	 * @model type="configuration.Type_service" required="true"
	 * @generated
	 */
	EList getPossessed();

} // Service
