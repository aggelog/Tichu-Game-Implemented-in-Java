/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tichugame.TichuGame;

/**
 *
 * @author AggelogTowerStation
 */
public class GraphicTichuGameTest {
    
    public GraphicTichuGameTest() {
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
     * Test of getTichuWindow method, of class GraphicTichuGame.
     */
    @Test
    public void testGetTichuWindow() {
        System.out.println("getTichuWindow");
        GraphicTichuGame instance = new GraphicTichuGame();
        JFrame expResult = null;
        JFrame result = instance.getTichuWindow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTichuGame method, of class GraphicTichuGame.
     */
    @Test
    public void testGetTichuGame() {
        System.out.println("getTichuGame");
        GraphicTichuGame instance = new GraphicTichuGame();
        TichuGame expResult = null;
        TichuGame result = instance.getTichuGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraphicTichuGame method, of class GraphicTichuGame.
     */
    @Test
    public void testGetGraphicTichuGame() {
        System.out.println("getGraphicTichuGame");
        GraphicTichuGame instance = new GraphicTichuGame();
        GraphicTichuGame expResult = null;
        GraphicTichuGame result = instance.getGraphicTichuGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayersInfo method, of class GraphicTichuGame.
     */
    @Test
    public void testGetPlayersInfo() {
        System.out.println("getPlayersInfo");
        GraphicTichuGame instance = new GraphicTichuGame();
        GraphicPlayerInfo expResult = null;
        GraphicPlayerInfo result = instance.getPlayersInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerHand method, of class GraphicTichuGame.
     */
    @Test
    public void testGetPlayerHand() {
        System.out.println("getPlayerHand");
        GraphicTichuGame instance = new GraphicTichuGame();
        GraphicPlayerHand expResult = null;
        GraphicPlayerHand result = instance.getPlayerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayedDeck method, of class GraphicTichuGame.
     */
    @Test
    public void testGetPlayedDeck() {
        System.out.println("getPlayedDeck");
        GraphicTichuGame instance = new GraphicTichuGame();
        GraphicDeck expResult = null;
        GraphicDeck result = instance.getPlayedDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChoosenCards method, of class GraphicTichuGame.
     */
    @Test
    public void testGetChoosenCards() {
        System.out.println("getChoosenCards");
        GraphicTichuGame instance = new GraphicTichuGame();
        ArrayList expResult = null;
        ArrayList result = instance.getChoosenCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinningPlayer method, of class GraphicTichuGame.
     */
    @Test
    public void testGetWinningPlayer() {
        System.out.println("getWinningPlayer");
        GraphicTichuGame instance = new GraphicTichuGame();
        int expResult = 0;
        int result = instance.getWinningPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrevious method, of class GraphicTichuGame.
     */
    @Test
    public void testGetPrevious() {
        System.out.println("getPrevious");
        GraphicTichuGame instance = new GraphicTichuGame();
        boolean expResult = false;
        boolean result = instance.getPrevious();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrevious method, of class GraphicTichuGame.
     */
    @Test
    public void testSetPrevious() {
        System.out.println("setPrevious");
        boolean bool = false;
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.setPrevious(bool);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTEAMpoints method, of class GraphicTichuGame.
     */
    @Test
    public void testSetTEAMpoints() {
        System.out.println("setTEAMpoints");
        int f = 0;
        int l = 0;
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.setTEAMpoints(f, l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTEAMpoints method, of class GraphicTichuGame.
     */
    @Test
    public void testResetTEAMpoints() {
        System.out.println("resetTEAMpoints");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.resetTEAMpoints();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkEndGame method, of class GraphicTichuGame.
     */
    @Test
    public void testCheckEndGame() {
        System.out.println("checkEndGame");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.checkEndGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetNewTurnStatus method, of class GraphicTichuGame.
     */
    @Test
    public void testSetNewTurnStatus() {
        System.out.println("SetNewTurnStatus");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.SetNewTurnStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitializeModel method, of class GraphicTichuGame.
     */
    @Test
    public void testInitializeModel() {
        System.out.println("InitializeModel");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.InitializeModel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class GraphicTichuGame.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromChoosenToPlayedDeck method, of class GraphicTichuGame.
     */
    @Test
    public void testFromChoosenToPlayedDeck() {
        System.out.println("fromChoosenToPlayedDeck");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.fromChoosenToPlayedDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPlayedDeck method, of class GraphicTichuGame.
     */
    @Test
    public void testPrintPlayedDeck() {
        System.out.println("printPlayedDeck");
        GraphicTichuGame instance = new GraphicTichuGame();
        instance.printPlayedDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
