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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getID method, of class Player.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Player instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Player.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Player instance = null;
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Player.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int op = 0;
        Player instance = null;
        instance.setStatus(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfCardsInHand method, of class Player.
     */
    @Test
    public void testGetNumOfCardsInHand() {
        System.out.println("getNumOfCardsInHand");
        Player instance = null;
        int expResult = 0;
        int result = instance.getNumOfCardsInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of namePlayer method, of class Player.
     */
    @Test
    public void testNamePlayer() {
        System.out.println("namePlayer");
        Player instance = null;
        String expResult = "";
        String result = instance.namePlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpressedTichu method, of class Player.
     */
    @Test
    public void testSetpressedTichu() {
        System.out.println("setpressedTichu");
        boolean BOOL = false;
        Player instance = null;
        instance.setpressedTichu(BOOL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpressedTichu method, of class Player.
     */
    @Test
    public void testGetpressedTichu() {
        System.out.println("getpressedTichu");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.getpressedTichu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpressedGrand method, of class Player.
     */
    @Test
    public void testSetpressedGrand() {
        System.out.println("setpressedGrand");
        boolean BOOL = false;
        Player instance = null;
        instance.setpressedGrand(BOOL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpressedGrand method, of class Player.
     */
    @Test
    public void testGetpressedGrand() {
        System.out.println("getpressedGrand");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.getpressedGrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Player.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card card = null;
        Player instance = null;
        instance.removeCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveCard method, of class Player.
     */
    @Test
    public void testReceiveCard() {
        System.out.println("receiveCard");
        Card e = null;
        Player instance = null;
        instance.receiveCard(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaza method, of class Player.
     */
    @Test
    public void testGetBaza() {
        System.out.println("getBaza");
        Player instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getBaza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveBaza method, of class Player.
     */
    @Test
    public void testGiveBaza() {
        System.out.println("giveBaza");
        ArrayList playedDeck = null;
        Player bazaReceiver = null;
        Player instance = null;
        instance.giveBaza(playedDeck, bazaReceiver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveBaza method, of class Player.
     */
    @Test
    public void testReceiveBaza() {
        System.out.println("receiveBaza");
        ArrayList playedDeck = null;
        Player instance = null;
        instance.receiveBaza(playedDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlayerStatus method, of class Player.
     */
    @Test
    public void testPlayerStatus() {
        System.out.println("PlayerStatus");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.PlayerStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHand method, of class Player.
     */
    @Test
    public void testPrintHand() {
        System.out.println("printHand");
        Player instance = null;
        instance.printHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBaza method, of class Player.
     */
    @Test
    public void testPrintBaza() {
        System.out.println("printBaza");
        ArrayList Baza = null;
        Player instance = null;
        instance.printBaza(Baza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
