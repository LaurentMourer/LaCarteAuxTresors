/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entite.Carte;
import entite.Case;
import entite.ObjetDeplacable;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pbyw529
 */
public class GestionObjetsTest {
    
    public GestionObjetsTest() {
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
     * Test of getListeObjetDeplacable method, of class Creation.
     */
    @Test
    public void testGetListeObjetDeplacable() {
        System.out.println("getListeObjetDeplacable");
        GestionObjets instance = null;
        List<ObjetDeplacable> expResult = null;
        List<ObjetDeplacable> result = instance.getListeObjetDeplacable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeObjetDeplacable method, of class Creation.
     */
    @Test
    public void testSetListeObjetDeplacable() {
        System.out.println("setListeObjetDeplacable");
        List<ObjetDeplacable> listeObjetDeplacable = null;
        GestionObjets instance = null;
        instance.setListeObjetDeplacable(listeObjetDeplacable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeCase method, of class Creation.
     */
    @Test
    public void testGetListeCase() {
        System.out.println("getListeCase");
        GestionObjets instance = null;
        List<Case> expResult = null;
        List<Case> result = instance.getListeCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeCase method, of class Creation.
     */
    @Test
    public void testSetListeCase() {
        System.out.println("setListeCase");
        List<Case> listeCase = null;
        GestionObjets instance = null;
        instance.setListeCase(listeCase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarte method, of class Creation.
     */
    @Test
    public void testGetCarte() {
        System.out.println("getCarte");
        GestionObjets instance = null;
        Carte expResult = null;
        Carte result = instance.getCarte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarte method, of class Creation.
     */
    @Test
    public void testSetCarte() {
        System.out.println("setCarte");
        Carte carte = null;
        GestionObjets instance = null;
        instance.setCarte(carte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
