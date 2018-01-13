/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://configuration/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link configuration.impl.ProcfileImpl <em>Procfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ProcfileImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getProcfile()
	 * @generated
	 */
	int PROCFILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCFILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Procfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCFILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link configuration.impl.manifestImpl <em>manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.manifestImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getmanifest()
	 * @generated
	 */
	int MANIFEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__HOST = 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link configuration.impl.DockerfieImpl <em>Dockerfie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.DockerfieImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getDockerfie()
	 * @generated
	 */
	int DOCKERFIE = 2;

	/**
	 * The feature id for the '<em><b>FROM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFIE__FROM = 0;

	/**
	 * The feature id for the '<em><b>RUN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFIE__RUN = 1;

	/**
	 * The feature id for the '<em><b>COPY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFIE__COPY = 2;

	/**
	 * The number of structural features of the '<em>Dockerfie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFIE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link configuration.Procfile <em>Procfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procfile</em>'.
	 * @see configuration.Procfile
	 * @generated
	 */
	EClass getProcfile();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Procfile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuration.Procfile#getName()
	 * @see #getProcfile()
	 * @generated
	 */
	EAttribute getProcfile_Name();

	/**
	 * Returns the meta object for class '{@link configuration.manifest <em>manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>manifest</em>'.
	 * @see configuration.manifest
	 * @generated
	 */
	EClass getmanifest();

	/**
	 * Returns the meta object for the attribute '{@link configuration.manifest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuration.manifest#getName()
	 * @see #getmanifest()
	 * @generated
	 */
	EAttribute getmanifest_Name();

	/**
	 * Returns the meta object for the attribute '{@link configuration.manifest#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see configuration.manifest#getHost()
	 * @see #getmanifest()
	 * @generated
	 */
	EAttribute getmanifest_Host();

	/**
	 * Returns the meta object for the attribute '{@link configuration.manifest#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see configuration.manifest#getMemory()
	 * @see #getmanifest()
	 * @generated
	 */
	EAttribute getmanifest_Memory();

	/**
	 * Returns the meta object for the attribute '{@link configuration.manifest#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see configuration.manifest#getInstance()
	 * @see #getmanifest()
	 * @generated
	 */
	EAttribute getmanifest_Instance();

	/**
	 * Returns the meta object for class '{@link configuration.Dockerfie <em>Dockerfie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dockerfie</em>'.
	 * @see configuration.Dockerfie
	 * @generated
	 */
	EClass getDockerfie();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Dockerfie#getFROM <em>FROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FROM</em>'.
	 * @see configuration.Dockerfie#getFROM()
	 * @see #getDockerfie()
	 * @generated
	 */
	EAttribute getDockerfie_FROM();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Dockerfie#getRUN <em>RUN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RUN</em>'.
	 * @see configuration.Dockerfie#getRUN()
	 * @see #getDockerfie()
	 * @generated
	 */
	EAttribute getDockerfie_RUN();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Dockerfie#getCOPY <em>COPY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COPY</em>'.
	 * @see configuration.Dockerfie#getCOPY()
	 * @see #getDockerfie()
	 * @generated
	 */
	EAttribute getDockerfie_COPY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link configuration.impl.ProcfileImpl <em>Procfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.ProcfileImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getProcfile()
		 * @generated
		 */
		EClass PROCFILE = eINSTANCE.getProcfile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCFILE__NAME = eINSTANCE.getProcfile_Name();

		/**
		 * The meta object literal for the '{@link configuration.impl.manifestImpl <em>manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.manifestImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getmanifest()
		 * @generated
		 */
		EClass MANIFEST = eINSTANCE.getmanifest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__NAME = eINSTANCE.getmanifest_Name();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__HOST = eINSTANCE.getmanifest_Host();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__MEMORY = eINSTANCE.getmanifest_Memory();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__INSTANCE = eINSTANCE.getmanifest_Instance();

		/**
		 * The meta object literal for the '{@link configuration.impl.DockerfieImpl <em>Dockerfie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.DockerfieImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getDockerfie()
		 * @generated
		 */
		EClass DOCKERFIE = eINSTANCE.getDockerfie();

		/**
		 * The meta object literal for the '<em><b>FROM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFIE__FROM = eINSTANCE.getDockerfie_FROM();

		/**
		 * The meta object literal for the '<em><b>RUN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFIE__RUN = eINSTANCE.getDockerfie_RUN();

		/**
		 * The meta object literal for the '<em><b>COPY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFIE__COPY = eINSTANCE.getDockerfie_COPY();

	}

} //ConfigurationPackage
