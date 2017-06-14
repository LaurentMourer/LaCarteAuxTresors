/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarbonIT.LaCarteAuxTresors.Entite;

import entite.Aventurier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PBYW529
 */
public class AventurierTest {

    Aventurier instance;

    public AventurierTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        instance = new Aventurier("Test", 1, 1, "S", "AGAADA");

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Aventurier.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "Test";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Aventurier.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        instance.setNom(nom);
        assertEquals(nom, instance.getNom());

    }

    /**
     * Test of getAxeHorizontal method, of class Aventurier.
     */
    @Test
    public void testGetAxeHorizontal() {
        System.out.println("getAxeHorizontal");
        int expResult = 1;
        int result = instance.getAxeHorizontal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAxeHorizontal method, of class Aventurier.
     */
    @Test
    public void testSetAxeHorizontal() {
        System.out.println("setAxeHorizontal");
        int axeHorizontal = 0;
        instance.setAxeHorizontal(axeHorizontal);
        assertEquals(axeHorizontal, instance.getAxeHorizontal());
    }

    /**
     * Test of getAxeVertical method, of class Aventurier.
     */
    @Test
    public void testGetAxeVertical() {
        System.out.println("getAxeVertical");
        int expResult = 1;
        int result = instance.getAxeVertical();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAxeVertical method, of class Aventurier.
     */
    @Test
    public void testSetAxeVertical() {
        System.out.println("setAxeVertical");
        int axeVertical = 0;
        instance.setAxeVertical(axeVertical);
        assertEquals(axeVertical, instance.getAxeVertical());
    }

    /**
     * Test of getOrientation method, of class Aventurier.
     */
    @Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        String expResult = "S";
        String result = instance.getOrientation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrientation method, of class Aventurier.
     */
    @Test
    public void testSetOrientation() {
        System.out.println("setOrientation");
        String orientation = "";
        instance.setOrientation(orientation);
        assertEquals(orientation, instance.getOrientation());
    }

    /**
     * Test of getSequence method, of class Aventurier.
     */
    @Test
    public void testGetSequence() {
        System.out.println("getSequence");
        char[] expResult = {'A', 'G', 'A', 'A', 'D', 'A'};
        char[] result = instance.getSequence();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setSequence method, of class Aventurier.
     */
    @Test
    public void testSetSequence() {
        System.out.println("setSequence");
        char[] sequence = {'A', 'G', 'A', 'A', 'D', 'A'};
        instance.setSequence(sequence);
        assertArrayEquals(sequence, instance.getSequence());

    }

}
