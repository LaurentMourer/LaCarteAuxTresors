/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarbonIT.LaCarteAuxTresors.Entite;

import entite.Montagne;
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
public class MontagneTest {

    Montagne instance;

    public MontagneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Montagne(1, 1);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAxeHorizontal method, of class Montagne.
     */
    @Test
    public void testGetAxeHorizontal() {
        System.out.println("getAxeHorizontal");
        int expResult = 1;
        int result = instance.getAxeHorizontal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAxeHorizontal method, of class Montagne.
     */
    @Test
    public void testSetAxeHorizontal() {
        System.out.println("setAxeHorizontal");
        int axeHorizontal = 0;
        instance.setAxeHorizontal(axeHorizontal);
        assertEquals(axeHorizontal, instance.getAxeHorizontal());

    }

    /**
     * Test of getAxeVertical method, of class Montagne.
     */
    @Test
    public void testGetAxeVertical() {
        System.out.println("getAxeVertical");
        int expResult = 1;
        int result = instance.getAxeVertical();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAxeVertical method, of class Montagne.
     */
    @Test
    public void testSetAxeVertical() {
        System.out.println("setAxeVertical");
        int axeVertical = 0;
        instance.setAxeVertical(axeVertical);
        assertEquals(axeVertical, instance.getAxeVertical());

    }

}
