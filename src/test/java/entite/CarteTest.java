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
public class CarteTest {
    
    public CarteTest() {
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
     * Test of ajouterObjet method, of class Carte.
     */
    @Test
    public void testAjouterObjet() {
        System.out.println("ajouterObjet");
        Case c = null;
        Carte instance = null;
        instance.ajouterObjet(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarte method, of class Carte.
     */
    @Test
    public void testGetCarte() {
        System.out.println("getCarte");
        Carte instance = null;
        Case[][] expResult = null;
        Case[][] result = instance.getCarte();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCase method, of class Carte.
     */
    @Test
    public void testGetCase() {
        System.out.println("getCase");
        int x = 0;
        int y = 0;
        Carte instance = null;
        Case expResult = null;
        Case result = instance.getCase(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Carte.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Carte instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Carte.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Carte instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Carte.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Carte instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Carte.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Carte instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
