/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.tests;

import configuration.ConfigurationFactory;
import configuration.manifest;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>manifest</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class manifestTest extends TestCase {

	/**
	 * The fixture for this manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected manifest fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(manifestTest.class);
	}

	/**
	 * Constructs a new manifest test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public manifestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(manifest fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this manifest test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private manifest getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createmanifest());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //manifestTest
