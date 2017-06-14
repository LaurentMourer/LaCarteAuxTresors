/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarbonIT.LaCarteAuxTresors.Entite;

import entite.Tresor;
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
public class TresorTest {

    Tresor instance;

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
        instance = new Tresor(1, 1, 1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAxeHorizontal method, of class Tresor.
     */
    @Test
    public void testGetAxeHorizontal() {
        System.out.println("getAxeHorizontal");
        int expResult = 0;
        int result = instance.getAxeHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAxeHorizontal method, of class Tresor.
     */
    @Test
    public void testSetAxeHorizontal() {
        System.out.println("setAxeHorizontal");
        int axeHorizontal = 0;
        instance.setAxeHorizontal(axeHorizontal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAxeVertical method, of class Tresor.
     */
    @Test
    public void testGetAxeVertical() {
        System.out.println("getAxeVertical");
        int expResult = 0;
        int result = instance.getAxeVertical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAxeVertical method, of class Tresor.
     */
    @Test
    public void testSetAxeVertical() {
        System.out.println("setAxeVertical");
        int axeVertical = 0;
        instance.setAxeVertical(axeVertical);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
