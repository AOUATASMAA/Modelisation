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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Application#getName <em>Name</em>}</li>
 *   <li>{@link configuration.Application#getOwn <em>Own</em>}</li>
 *   <li>{@link configuration.Application#getPossess <em>Possess</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see configuration.ConfigurationPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link configuration.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Own</b></em>' containment reference list.
	 * The list contents are of type {@link configuration.Procfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own</em>' containment reference list.
	 * @see configuration.ConfigurationPackage#getApplication_Own()
	 * @model type="configuration.Procfile" containment="true" required="true"
	 * @generated
	 */
	EList getOwn();

	/**
	 * Returns the value of the '<em><b>Possess</b></em>' containment reference list.
	 * The list contents are of type {@link configuration.manifest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possess</em>' containment reference list.
	 * @see configuration.ConfigurationPackage#getApplication_Possess()
	 * @model type="configuration.manifest" containment="true" required="true"
	 * @generated
	 */
	EList getPossess();

} // Application
