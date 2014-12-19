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
public class PilesTest {
    
    public PilesTest() {
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
     * Test of isEmpty method, of class Piles.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Piles instance = new PilesImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Piles.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int p = 0;
        Piles instance = new PilesImpl();
        Card expResult = null;
        Card result = instance.removeCard(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PilesImpl extends Piles {

        public boolean isEmpty() {
            return false;
        }

        public Card removeCard(int p) {
            return null;
        }
    }
}
