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
public class TresorTest {
    
    public TresorTest() {
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
     * Test of tresorPris method, of class Tresor.
     */
    @Test
    public void testTresorPris() {
        System.out.println("tresorPris");
        Tresor instance = null;
        instance.tresorPris();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbTresor method, of class Tresor.
     */
    @Test
    public void testGetNbTresor() {
        System.out.println("getNbTresor");
        Tresor instance = null;
        int expResult = 0;
        int result = instance.getNbTresor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbTresor method, of class Tresor.
     */
    @Test
    public void testSetNbTresor() {
        System.out.println("setNbTresor");
        int nbTresor = 0;
        Tresor instance = null;
        instance.setNbTresor(nbTresor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tresor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tresor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
