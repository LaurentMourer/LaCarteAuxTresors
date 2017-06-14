/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.List;
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
public class ManagerFichierTest {
    
    public ManagerFichierTest() {
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
     * Test of getLignes method, of class ManagerFichier.
     */
    @Test
    public void testGetLignes() {
        System.out.println("getLignes");
        ManagerFichier instance = null;
        List<String> expResult = null;
        List<String> result = instance.getLignes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLignes method, of class ManagerFichier.
     */
    @Test
    public void testSetLignes() {
        System.out.println("setLignes");
        List<String> lignes = null;
        ManagerFichier instance = null;
        instance.setLignes(lignes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
