/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AggelogTowerStation
 */
public class TichuDeckTest {
    
    public TichuDeckTest() {
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
     * Test of isEmpty method, of class TichuDeck.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        TichuDeck instance = new TichuDeck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class TichuDeck.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int o = 0;
        TichuDeck instance = new TichuDeck();
        Card expResult = null;
        Card result = instance.removeCard(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
