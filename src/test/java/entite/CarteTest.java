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
    
    Case montagne;
    Case tresor;
    Carte instance;
    
    public CarteTest() {
        montagne = new Montagne(1, 1);
        tresor = new Tresor(0, 0, 3);
        instance = new Carte(2, 2);
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
        instance.ajouterObjet(montagne);
        assertEquals(montagne, instance.getCase(montagne.getX(), montagne.getY()));
        
    }

    /**
     * Test of getCarte method, of class Carte.
     */
    @Test
    public void testGetCarte() {
        System.out.println("getCarte");
        Case[][] result = instance.getCarte();
        //assertArrayEquals(, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCase method, of class Carte.
     */
    @Test
    public void testGetCase() {
        System.out.println("getCase");
        int x = 0;
        int y = 0;
        Case result = instance.getCase(x, y);
    }

    /**
     * Test of getX method, of class Carte.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        int result = instance.getX();
        assertEquals(2, result);
        
    }

    /**
     * Test of setX method, of class Carte.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        instance.setX(x);
        
        assertEquals(instance.getX(), 0);
    }

    /**
     * Test of getY method, of class Carte.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setY method, of class Carte.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        instance.setY(y);
        assertEquals(instance.getY(), 0); //pour des objets ou des longs

    }
    
}
