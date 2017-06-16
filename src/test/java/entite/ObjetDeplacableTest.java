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

    private final ObjetDeplacable instance;

    public ObjetDeplacableTest() {
        instance = new Aventurier("Lara", 1, 1, "S", "AGDA");
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
        instance.avancer();

    }

    /**
     * Test of droite method, of class ObjetDeplacable.
     */
    @Test
    public void testDroite() {
        System.out.println("droite");
        instance.droite();

    }

    /**
     * Test of gauche method, of class ObjetDeplacable.
     */
    @Test
    public void testGauche() {
        System.out.println("gauche");
        instance.gauche();

    }

    /**
     * Test of equals method, of class ObjetDeplacable.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Aventurier("Lara", 1, 1, "S", "AGDA");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of getX method, of class ObjetDeplacable.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);

    }

    /**
     * Test of setX method, of class ObjetDeplacable.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        instance.setX(x);

    }

    /**
     * Test of getY method, of class ObjetDeplacable.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int expResult = 1;
        int result = instance.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of setY method, of class ObjetDeplacable.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        instance.setY(y);

    }

    /**
     * Test of getOrientation method, of class ObjetDeplacable.
     */
    @Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        String expResult = "S";
        assertEquals(expResult, instance.getOrientation());

    }

    /**
     * Test of setOrientation method, of class ObjetDeplacable.
     */
    @Test
    public void testSetOrientation() {
        System.out.println("setOrientation");
        String orientation = "";
        instance.setOrientation(orientation);

    }

    /**
     * Test of getSequence method, of class ObjetDeplacable.
     */
    @Test
    public void testGetSequence() {
        System.out.println("getSequence");
        char[] expResult = {'A', 'G', 'D', 'A'};
        char[] result = instance.getSequence();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setSequence method, of class ObjetDeplacable.
     */
    @Test
    public void testSetSequence() {
        System.out.println("setSequence");
        char[] sequence = null;
        instance.setSequence(sequence);

    }

    /**
     * Test of clone method, of class ObjetDeplacable.
     */
    @Test
    public void testClone() throws Exception {
        System.out.println("clone");
        ObjetDeplacable expResult = new Aventurier("Lara", 1, 1, "S", "AGDA");
        ObjetDeplacable result = instance.clone();
        assertEquals(expResult, result);

    }

}
