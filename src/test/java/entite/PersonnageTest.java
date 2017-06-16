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
public class PersonnageTest {

    private Aventurier instance;

    public PersonnageTest() {
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
     * Test of getNom method, of class Personnage.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "Lara";
        String result = instance.getNom();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNom method, of class Personnage.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "Croft";
        instance.setNom(nom);
        assertEquals(nom, instance.getNom());
    }

}
