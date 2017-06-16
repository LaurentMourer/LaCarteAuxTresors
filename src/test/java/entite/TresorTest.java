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

    private final Tresor instance;

    public TresorTest() {
        instance = new Tresor(1, 1, 1);
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
        instance.tresorPris();
        assertEquals(0, instance.getNbTresor());

    }

    /**
     * Test of getNbTresor method, of class Tresor.
     */
    @Test
    public void testGetNbTresor() {
        System.out.println("getNbTresor");
        int expResult = 1;
        int result = instance.getNbTresor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNbTresor method, of class Tresor.
     */
    @Test
    public void testSetNbTresor() {
        System.out.println("setNbTresor");
        int nbTresor = 2;
        instance.setNbTresor(nbTresor);
        assertEquals(nbTresor, instance.getNbTresor());

    }

}
