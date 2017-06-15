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
public class AventurierTest {
Aventurier instance;
    public AventurierTest() {
        instance = new Aventurier("av", 1, 2, "O", "AGDDAA");
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
     * Test of ramasseTresor method, of class Aventurier.
     */
    @Test
    public void testRamasseTresor() {
        System.out.println("ramasseTresor");
        instance.ramasseTresor();
        assertEquals(0+1, instance.getTresorRamasse());
    }

}
