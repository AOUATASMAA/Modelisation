/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dockerfie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Dockerfie#getFROM <em>FROM</em>}</li>
 *   <li>{@link configuration.Dockerfie#getRUN <em>RUN</em>}</li>
 *   <li>{@link configuration.Dockerfie#getCOPY <em>COPY</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getDockerfie()
 * @model
 * @generated
 */
public interface Dockerfie extends EObject {
	/**
	 * Returns the value of the '<em><b>FROM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FROM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FROM</em>' attribute.
	 * @see #setFROM(String)
	 * @see configuration.ConfigurationPackage#getDockerfie_FROM()
	 * @model
	 * @generated
	 */
	String getFROM();

	/**
	 * Sets the value of the '{@link configuration.Dockerfie#getFROM <em>FROM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FROM</em>' attribute.
	 * @see #getFROM()
	 * @generated
	 */
	void setFROM(String value);

	/**
	 * Returns the value of the '<em><b>RUN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RUN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RUN</em>' attribute.
	 * @see #setRUN(String)
	 * @see configuration.ConfigurationPackage#getDockerfie_RUN()
	 * @model
	 * @generated
	 */
	String getRUN();

	/**
	 * Sets the value of the '{@link configuration.Dockerfie#getRUN <em>RUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RUN</em>' attribute.
	 * @see #getRUN()
	 * @generated
	 */
	void setRUN(String value);

	/**
	 * Returns the value of the '<em><b>COPY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COPY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COPY</em>' attribute.
	 * @see #setCOPY(String)
	 * @see configuration.ConfigurationPackage#getDockerfie_COPY()
	 * @model
	 * @generated
	 */
	String getCOPY();

	/**
	 * Sets the value of the '{@link configuration.Dockerfie#getCOPY <em>COPY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COPY</em>' attribute.
	 * @see #getCOPY()
	 * @generated
	 */
	void setCOPY(String value);

} // Dockerfie
