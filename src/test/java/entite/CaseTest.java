/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laurentmourer
 */
public class CaseTest {
    
    public CaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getX method, of class Case.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Case instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Case.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Case instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Case.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Case instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Case.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Case instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFranchissable method, of class Case.
     */
    @Test
    public void testIsFranchissable() {
        System.out.println("isFranchissable");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.isFranchissable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFranchissable method, of class Case.
     */
    @Test
    public void testSetFranchissable() {
        System.out.println("setFranchissable");
        boolean franchissable = false;
        Case instance = null;
        instance.setFranchissable(franchissable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Case.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Case instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
