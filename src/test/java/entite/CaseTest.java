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

    Case instance;

    public CaseTest() {
        instance = new Montagne(1, 1);
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
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);

    }

    /**
     * Test of setX method, of class Case.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 2;
        instance.setX(x);
        assertEquals(x, instance.getX());
    }

    /**
     * Test of getY method, of class Case.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int expResult = 1;
        int result = instance.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of setY method, of class Case.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        instance.setY(y);
        assertEquals(y, instance.getY());

    }

    /**
     * Test of isFranchissable method, of class Case.
     */
    @Test
    public void testIsFranchissable() {
        System.out.println("isFranchissable");
        boolean expResult = false;
        boolean result = instance.isFranchissable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFranchissable method, of class Case.
     */
    @Test
    public void testSetFranchissable() {
        System.out.println("setFranchissable");
        boolean franchissable = true;
        instance.setFranchissable(franchissable);
        assertEquals(franchissable, instance.isFranchissable());

    }

}
