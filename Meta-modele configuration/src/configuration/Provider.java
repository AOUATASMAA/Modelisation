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
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Provider#getName_provider <em>Name provider</em>}</li>
 *   <li>{@link configuration.Provider#getBased <em>Based</em>}</li>
 *   <li>{@link configuration.Provider#getConnected <em>Connected</em>}</li>
 *   <li>{@link configuration.Provider#getContained <em>Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Name provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name provider</em>' attribute.
	 * @see #setName_provider(String)
	 * @see configuration.ConfigurationPackage#getProvider_Name_provider()
	 * @model
	 * @generated
	 */
	String getName_provider();

	/**
	 * Sets the value of the '{@link configuration.Provider#getName_provider <em>Name provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name provider</em>' attribute.
	 * @see #getName_provider()
	 * @generated
	 */
	void setName_provider(String value);

	/**
	 * Returns the value of the '<em><b>Based</b></em>' reference list.
	 * The list contents are of type {@link configuration.Technology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based</em>' reference list.
	 * @see configuration.ConfigurationPackage#getProvider_Based()
	 * @model type="configuration.Technology" required="true"
	 * @generated
	 */
	EList getBased();

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference list.
	 * The list contents are of type {@link configuration.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference list.
	 * @see configuration.ConfigurationPackage#getProvider_Connected()
	 * @model type="configuration.Account" required="true"
	 * @generated
	 */
	EList getConnected();

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' reference.
	 * @see #setContained(Application)
	 * @see configuration.ConfigurationPackage#getProvider_Contained()
	 * @model
	 * @generated
	 */
	Application getContained();

	/**
	 * Sets the value of the '{@link configuration.Provider#getContained <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained</em>' reference.
	 * @see #getContained()
	 * @generated
	 */
	void setContained(Application value);

} // Provider
