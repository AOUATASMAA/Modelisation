/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.tests;

import configuration.ConfigurationFactory;
import configuration.Dockerfie;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dockerfie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfieTest extends TestCase {

	/**
	 * The fixture for this Dockerfie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dockerfie fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DockerfieTest.class);
	}

	/**
	 * Constructs a new Dockerfie test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfieTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dockerfie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dockerfie fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dockerfie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Dockerfie getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createDockerfie());
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

} //DockerfieTest
