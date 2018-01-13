/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Procfile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procfile</em>'.
	 * @generated
	 */
	Procfile createProcfile();

	/**
	 * Returns a new object of class '<em>manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>manifest</em>'.
	 * @generated
	 */
	manifest createmanifest();

	/**
	 * Returns a new object of class '<em>Dockerfie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dockerfie</em>'.
	 * @generated
	 */
	Dockerfie createDockerfie();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
