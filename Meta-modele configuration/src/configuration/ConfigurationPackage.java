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
import org.eclipse.emf.ecore.EReference;

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
	String eNS_URI = "www.configuration.com";

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
	 * The meta object id for the '{@link configuration.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ServiceImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name ser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME_SER = 0;

	/**
	 * The feature id for the '<em><b>Possessed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__POSSESSED = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link configuration.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ProviderImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Based</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BASED = 1;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CONNECTED = 2;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CONTAINED = 3;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link configuration.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.TechnologyImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__USED = 1;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link configuration.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.UserImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FAMILYNAME = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Numberphone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NUMBERPHONE = 2;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADRESS = 3;

	/**
	 * The feature id for the '<em><b>Integrated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INTEGRATED = 4;

	/**
	 * The feature id for the '<em><b>Have</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAVE = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link configuration.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.AccountImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link configuration.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ApplicationImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Own</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__OWN = 1;

	/**
	 * The feature id for the '<em><b>Possess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__POSSESS = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link configuration.impl.Type_serviceImpl <em>Type service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.Type_serviceImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getType_service()
	 * @generated
	 */
	int TYPE_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name typ ser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SERVICE__NAME_TYP_SER = 0;

	/**
	 * The number of structural features of the '<em>Type service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link configuration.impl.ProcfileImpl <em>Procfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ProcfileImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getProcfile()
	 * @generated
	 */
	int PROCFILE = 7;

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
	int MANIFEST = 8;

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
	 * The feature id for the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__DISK = 4;

	/**
	 * The number of structural features of the '<em>manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link configuration.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see configuration.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Service#getName_ser <em>Name ser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ser</em>'.
	 * @see configuration.Service#getName_ser()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name_ser();

	/**
	 * Returns the meta object for the reference list '{@link configuration.Service#getPossessed <em>Possessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possessed</em>'.
	 * @see configuration.Service#getPossessed()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Possessed();

	/**
	 * Returns the meta object for class '{@link configuration.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see configuration.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Provider#getName_provider <em>Name provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name provider</em>'.
	 * @see configuration.Provider#getName_provider()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name_provider();

	/**
	 * Returns the meta object for the reference list '{@link configuration.Provider#getBased <em>Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Based</em>'.
	 * @see configuration.Provider#getBased()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Based();

	/**
	 * Returns the meta object for the reference list '{@link configuration.Provider#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected</em>'.
	 * @see configuration.Provider#getConnected()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Connected();

	/**
	 * Returns the meta object for the reference '{@link configuration.Provider#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained</em>'.
	 * @see configuration.Provider#getContained()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Contained();

	/**
	 * Returns the meta object for class '{@link configuration.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see configuration.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuration.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the reference list '{@link configuration.Technology#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used</em>'.
	 * @see configuration.Technology#getUsed()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Used();

	/**
	 * Returns the meta object for class '{@link configuration.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see configuration.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link configuration.User#getFamilyname <em>Familyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Familyname</em>'.
	 * @see configuration.User#getFamilyname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Familyname();

	/**
	 * Returns the meta object for the attribute '{@link configuration.User#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see configuration.User#getFirstname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link configuration.User#getNumberphone <em>Numberphone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numberphone</em>'.
	 * @see configuration.User#getNumberphone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Numberphone();

	/**
	 * Returns the meta object for the attribute '{@link configuration.User#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see configuration.User#getAdress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Adress();

	/**
	 * Returns the meta object for the reference list '{@link configuration.User#getIntegrated <em>Integrated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integrated</em>'.
	 * @see configuration.User#getIntegrated()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Integrated();

	/**
	 * Returns the meta object for the reference list '{@link configuration.User#getHave <em>Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Have</em>'.
	 * @see configuration.User#getHave()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Have();

	/**
	 * Returns the meta object for class '{@link configuration.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see configuration.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Account#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see configuration.Account#getEmail()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see configuration.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for class '{@link configuration.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see configuration.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuration.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link configuration.Application#getOwn <em>Own</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Own</em>'.
	 * @see configuration.Application#getOwn()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Own();

	/**
	 * Returns the meta object for the containment reference list '{@link configuration.Application#getPossess <em>Possess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possess</em>'.
	 * @see configuration.Application#getPossess()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Possess();

	/**
	 * Returns the meta object for class '{@link configuration.Type_service <em>Type service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type service</em>'.
	 * @see configuration.Type_service
	 * @generated
	 */
	EClass getType_service();

	/**
	 * Returns the meta object for the attribute '{@link configuration.Type_service#getName_typ_ser <em>Name typ ser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name typ ser</em>'.
	 * @see configuration.Type_service#getName_typ_ser()
	 * @see #getType_service()
	 * @generated
	 */
	EAttribute getType_service_Name_typ_ser();

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
	 * Returns the meta object for the attribute '{@link configuration.manifest#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk</em>'.
	 * @see configuration.manifest#getDisk()
	 * @see #getmanifest()
	 * @generated
	 */
	EAttribute getmanifest_Disk();

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
		 * The meta object literal for the '{@link configuration.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.ServiceImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name ser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME_SER = eINSTANCE.getService_Name_ser();

		/**
		 * The meta object literal for the '<em><b>Possessed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__POSSESSED = eINSTANCE.getService_Possessed();

		/**
		 * The meta object literal for the '{@link configuration.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.ProviderImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Name provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME_PROVIDER = eINSTANCE.getProvider_Name_provider();

		/**
		 * The meta object literal for the '<em><b>Based</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BASED = eINSTANCE.getProvider_Based();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__CONNECTED = eINSTANCE.getProvider_Connected();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__CONTAINED = eINSTANCE.getProvider_Contained();

		/**
		 * The meta object literal for the '{@link configuration.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.TechnologyImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__USED = eINSTANCE.getTechnology_Used();

		/**
		 * The meta object literal for the '{@link configuration.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.UserImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Familyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FAMILYNAME = eINSTANCE.getUser_Familyname();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRSTNAME = eINSTANCE.getUser_Firstname();

		/**
		 * The meta object literal for the '<em><b>Numberphone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NUMBERPHONE = eINSTANCE.getUser_Numberphone();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ADRESS = eINSTANCE.getUser_Adress();

		/**
		 * The meta object literal for the '<em><b>Integrated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__INTEGRATED = eINSTANCE.getUser_Integrated();

		/**
		 * The meta object literal for the '<em><b>Have</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__HAVE = eINSTANCE.getUser_Have();

		/**
		 * The meta object literal for the '{@link configuration.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.AccountImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__EMAIL = eINSTANCE.getAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '{@link configuration.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.ApplicationImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Own</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__OWN = eINSTANCE.getApplication_Own();

		/**
		 * The meta object literal for the '<em><b>Possess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__POSSESS = eINSTANCE.getApplication_Possess();

		/**
		 * The meta object literal for the '{@link configuration.impl.Type_serviceImpl <em>Type service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.Type_serviceImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getType_service()
		 * @generated
		 */
		EClass TYPE_SERVICE = eINSTANCE.getType_service();

		/**
		 * The meta object literal for the '<em><b>Name typ ser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SERVICE__NAME_TYP_SER = eINSTANCE.getType_service_Name_typ_ser();

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
		 * The meta object literal for the '<em><b>Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__DISK = eINSTANCE.getmanifest_Disk();

	}

} //ConfigurationPackage
