/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tichuGui.GraphicTichuGame;
import tichuGui.TICHUListener;

/**
 *
 * @author AggelogTowerStation
 */
public class TichuGameTest {
    
    public TichuGameTest() {
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
     * Test of findMahjong method, of class TichuGame.
     */
    @Test
    public void testFindMahjong() {
        System.out.println("findMahjong");
        TichuGame instance = new TichuGame();
        Player expResult = null;
        Player result = instance.findMahjong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shareRest method, of class TichuGame.
     */
    @Test
    public void testShareRest() {
        System.out.println("shareRest");
        TichuGame instance = new TichuGame();
        instance.shareRest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllplayers method, of class TichuGame.
     */
    @Test
    public void testGetAllplayers() {
        System.out.println("getAllplayers");
        TichuGame instance = new TichuGame();
        AllPlayers expResult = null;
        AllPlayers result = instance.getAllplayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTichuGame method, of class TichuGame.
     */
    @Test
    public void testGetTichuGame() {
        System.out.println("getTichuGame");
        TichuGame instance = new TichuGame();
        TichuGame expResult = null;
        TichuGame result = instance.getTichuGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goToNextPlayer method, of class TichuGame.
     */
    @Test
    public void testGoToNextPlayer() {
        System.out.println("goToNextPlayer");
        TichuGame instance = new TichuGame();
        instance.goToNextPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckMove method, of class TichuGame.
     */
    @Test
    public void testCheckMove() {
        System.out.println("CheckMove");
        GraphicTichuGame TICHU = null;
        TichuGame instance = new TichuGame();
        boolean expResult = false;
        boolean result = instance.CheckMove(TICHU);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayingPlayer method, of class TichuGame.
     */
    @Test
    public void testGetPlayingPlayer() {
        System.out.println("getPlayingPlayer");
        TichuGame instance = new TichuGame();
        Player expResult = null;
        Player result = instance.getPlayingPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayingPlayer method, of class TichuGame.
     */
    @Test
    public void testSetPlayingPlayer() {
        System.out.println("setPlayingPlayer");
        Player newPlayer = null;
        TichuGame instance = new TichuGame();
        instance.setPlayingPlayer(newPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfPlayers method, of class TichuGame.
     */
    @Test
    public void testGetNumOfPlayers() {
        System.out.println("getNumOfPlayers");
        TichuGame instance = new TichuGame();
        int expResult = 0;
        int result = instance.getNumOfPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfPlayers method, of class TichuGame.
     */
    @Test
    public void testSetNumOfPlayers() {
        System.out.println("setNumOfPlayers");
        int pi = 0;
        TichuGame instance = new TichuGame();
        instance.setNumOfPlayers(pi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddTichuListener method, of class TichuGame.
     */
    @Test
    public void testAddTichuListener() {
        System.out.println("AddTichuListener");
        TICHUListener Listener = null;
        TichuGame instance = new TichuGame();
        instance.AddTichuListener(Listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTichuListeners method, of class TichuGame.
     */
    @Test
    public void testGetTichuListeners() {
        System.out.println("getTichuListeners");
        TichuGame instance = new TichuGame();
        HashSet expResult = null;
        HashSet result = instance.getTichuListeners();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayedDeck method, of class TichuGame.
     */
    @Test
    public void testGetPlayedDeck() {
        System.out.println("getPlayedDeck");
        TichuGame instance = new TichuGame();
        PlayedDeck expResult = null;
        PlayedDeck result = instance.getPlayedDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TEST method, of class TichuGame.
     */
    @Test
    public void testTEST() {
        System.out.println("TEST");
        TichuGame instance = new TichuGame();
        instance.TEST();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
