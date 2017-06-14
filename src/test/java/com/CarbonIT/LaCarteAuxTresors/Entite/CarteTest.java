/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CarbonIT.LaCarteAuxTresors.Entite;

import entite.Carte;
import entite.Aventurier;
import entite.Case;
import java.util.ArrayList;
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
public class CarteTest {

    Carte instance;

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
        instance = new Carte(1, 1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterEntite method, of class Carte.
     */
    @Test
    public void testAjouterEntite() {
        System.out.println("ajouterEntite");
        Case e = null;
        instance.ajouterEntite(e);
    }

    /**
     * Test of ajouterAventurier method, of class Carte.
     */
    @Test
    public void testAjouterAventurier() {
        System.out.println("ajouterAventurier");
        Aventurier a = null;
        instance.ajouterAventurier(a);
    }

    /**
     * Test of modifierPosition method, of class Carte.
     */
    @Test
    public void testModifierPosition() {
        System.out.println("modifierPosition");
        int[] precPos = {1, 1};
        int[] newPos = {2, 1};
        instance.modifierPosition(precPos, newPos);
    }

    /**
     * Test of lectureSequence method, of class Carte.
     */
    @Test
    public void testLectureSequence() {
        System.out.println("lectureSequence");
        int i = 0;
        instance.lectureSequence(i);
    }

    /**
     * Test of getAventurier method, of class Carte.
     */
    @Test
    public void testGetAventurier() {
        System.out.println("getAventurier");
        ArrayList<Aventurier> expResult = null;
        ArrayList<Aventurier> result = instance.getListeAventurier();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAventurier method, of class Carte.
     */
    @Test
    public void testSetAventurier() {
        System.out.println("setAventurier");
        ArrayList<Aventurier> aventurier = null;
        instance.setListeAventurier(aventurier);
    }

    /**
     * Test of toString method, of class Carte.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
