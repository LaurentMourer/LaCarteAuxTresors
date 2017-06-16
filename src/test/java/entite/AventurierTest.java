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

    private final Aventurier instance;

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
        assertEquals(0 + 1, instance.getTresorRamasse());
    }

}
