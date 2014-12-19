/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.ArrayList;
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
public class PlayedDeckTest {
    
    public PlayedDeckTest() {
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
     * Test of isEmpty method, of class PlayedDeck.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PlayedDeck instance = new PlayedDeck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayedCards method, of class PlayedDeck.
     */
    @Test
    public void testGetPlayedCards() {
        System.out.println("getPlayedCards");
        PlayedDeck instance = new PlayedDeck();
        ArrayList expResult = null;
        ArrayList result = instance.getPlayedCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class PlayedDeck.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int o = 0;
        PlayedDeck instance = new PlayedDeck();
        Card expResult = null;
        Card result = instance.removeCard(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putOnDeck method, of class PlayedDeck.
     */
    @Test
    public void testPutOnDeck() {
        System.out.println("putOnDeck");
        Card card = null;
        PlayedDeck instance = new PlayedDeck();
        instance.putOnDeck(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeID method, of class PlayedDeck.
     */
    @Test
    public void testGetTypeID() {
        System.out.println("getTypeID");
        PlayedDeck instance = new PlayedDeck();
        int expResult = 0;
        int result = instance.getTypeID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeID method, of class PlayedDeck.
     */
    @Test
    public void testSetTypeID() {
        System.out.println("setTypeID");
        int id = 0;
        PlayedDeck instance = new PlayedDeck();
        instance.setTypeID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinOfType method, of class PlayedDeck.
     */
    @Test
    public void testGetMinOfType() {
        System.out.println("getMinOfType");
        PlayedDeck instance = new PlayedDeck();
        double expResult = 0.0;
        double result = instance.getMinOfType();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinOfType method, of class PlayedDeck.
     */
    @Test
    public void testSetMinOfType() {
        System.out.println("setMinOfType");
        double min = 0.0;
        PlayedDeck instance = new PlayedDeck();
        instance.setMinOfType(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyPlayedDeck method, of class PlayedDeck.
     */
    @Test
    public void testEmptyPlayedDeck() {
        System.out.println("emptyPlayedDeck");
        PlayedDeck instance = new PlayedDeck();
        instance.emptyPlayedDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromDeck method, of class PlayedDeck.
     */
    @Test
    public void testRemoveFromDeck() {
        System.out.println("removeFromDeck");
        Card card = null;
        PlayedDeck instance = new PlayedDeck();
        Card expResult = null;
        Card result = instance.removeFromDeck(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastCardFromDeck method, of class PlayedDeck.
     */
    @Test
    public void testGetLastCardFromDeck() {
        System.out.println("getLastCardFromDeck");
        PlayedDeck instance = new PlayedDeck();
        Card expResult = null;
        Card result = instance.getLastCardFromDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
