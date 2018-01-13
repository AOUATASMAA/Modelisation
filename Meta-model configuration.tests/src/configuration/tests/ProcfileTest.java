/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package configuration.tests;

import configuration.ConfigurationFactory;
import configuration.Procfile;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Procfile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcfileTest extends TestCase {

	/**
	 * The fixture for this Procfile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Procfile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcfileTest.class);
	}

	/**
	 * Constructs a new Procfile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcfileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Procfile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Procfile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Procfile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Procfile getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createProcfile());
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

} //ProcfileTest
