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
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.User#getFamilyname <em>Familyname</em>}</li>
 *   <li>{@link configuration.User#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link configuration.User#getNumberphone <em>Numberphone</em>}</li>
 *   <li>{@link configuration.User#getAdress <em>Adress</em>}</li>
 *   <li>{@link configuration.User#getIntegrated <em>Integrated</em>}</li>
 *   <li>{@link configuration.User#getHave <em>Have</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Familyname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Familyname</em>' attribute.
	 * @see #setFamilyname(String)
	 * @see configuration.ConfigurationPackage#getUser_Familyname()
	 * @model
	 * @generated
	 */
	String getFamilyname();

	/**
	 * Sets the value of the '{@link configuration.User#getFamilyname <em>Familyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familyname</em>' attribute.
	 * @see #getFamilyname()
	 * @generated
	 */
	void setFamilyname(String value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see configuration.ConfigurationPackage#getUser_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link configuration.User#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Numberphone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numberphone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numberphone</em>' attribute.
	 * @see #setNumberphone(int)
	 * @see configuration.ConfigurationPackage#getUser_Numberphone()
	 * @model
	 * @generated
	 */
	int getNumberphone();

	/**
	 * Sets the value of the '{@link configuration.User#getNumberphone <em>Numberphone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberphone</em>' attribute.
	 * @see #getNumberphone()
	 * @generated
	 */
	void setNumberphone(int value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see configuration.ConfigurationPackage#getUser_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link configuration.User#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Integrated</b></em>' reference list.
	 * The list contents are of type {@link configuration.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrated</em>' reference list.
	 * @see configuration.ConfigurationPackage#getUser_Integrated()
	 * @model type="configuration.Service" required="true"
	 * @generated
	 */
	EList getIntegrated();

	/**
	 * Returns the value of the '<em><b>Have</b></em>' reference list.
	 * The list contents are of type {@link configuration.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Have</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have</em>' reference list.
	 * @see configuration.ConfigurationPackage#getUser_Have()
	 * @model type="configuration.Account" required="true"
	 * @generated
	 */
	EList getHave();

} // User
