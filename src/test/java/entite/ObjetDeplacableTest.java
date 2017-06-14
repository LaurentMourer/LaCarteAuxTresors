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
public class ObjetDeplacableTest {
    
    public ObjetDeplacableTest() {
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
     * Test of avancer method, of class ObjetDeplacable.
     */
    @Test
    public void testAvancer() {
        System.out.println("avancer");
        ObjetDeplacable instance = null;
        instance.avancer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of droite method, of class ObjetDeplacable.
     */
    @Test
    public void testDroite() {
        System.out.println("droite");
        ObjetDeplacable instance = null;
        instance.droite();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gauche method, of class ObjetDeplacable.
     */
    @Test
    public void testGauche() {
        System.out.println("gauche");
        ObjetDeplacable instance = null;
        instance.gauche();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ObjetDeplacable.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ObjetDeplacable instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ObjetDeplacable.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ObjetDeplacable instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class ObjetDeplacable.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        ObjetDeplacable instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class ObjetDeplacable.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        ObjetDeplacable instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class ObjetDeplacable.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        ObjetDeplacable instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class ObjetDeplacable.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        ObjetDeplacable instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrientation method, of class ObjetDeplacable.
     */
    @Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        ObjetDeplacable instance = null;
        String expResult = "";
        String result = instance.getOrientation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrientation method, of class ObjetDeplacable.
     */
    @Test
    public void testSetOrientation() {
        System.out.println("setOrientation");
        String orientation = "";
        ObjetDeplacable instance = null;
        instance.setOrientation(orientation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSequence method, of class ObjetDeplacable.
     */
    @Test
    public void testGetSequence() {
        System.out.println("getSequence");
        ObjetDeplacable instance = null;
        char[] expResult = null;
        char[] result = instance.getSequence();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSequence method, of class ObjetDeplacable.
     */
    @Test
    public void testSetSequence() {
        System.out.println("setSequence");
        char[] sequence = null;
        ObjetDeplacable instance = null;
        instance.setSequence(sequence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class ObjetDeplacable.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        ObjetDeplacable instance = null;
        ObjetDeplacable expResult = null;
        ObjetDeplacable result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
