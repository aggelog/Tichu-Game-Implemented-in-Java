/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
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
public class GraphicPlayerHandTest {
    
    public GraphicPlayerHandTest() {
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
     * Test of getPlayerHandPanel method, of class GraphicPlayerHand.
     */
    @Test
    public void testGetPlayerHandPanel() {
        System.out.println("getPlayerHandPanel");
        GraphicPlayerHand instance = null;
        JPanel expResult = null;
        JPanel result = instance.getPlayerHandPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardButton method, of class GraphicPlayerHand.
     */
    @Test
    public void testGetCardButton() {
        System.out.println("getCardButton");
        int i = 0;
        GraphicPlayerHand instance = null;
        JButton expResult = null;
        JButton result = instance.getCardButton(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printChoosenCard method, of class GraphicPlayerHand.
     */
    @Test
    public void testPrintChoosenCard() {
        System.out.println("printChoosenCard");
        GraphicTichuGame TICHU = null;
        ArrayList choice = null;
        GraphicPlayerHand instance = null;
        instance.printChoosenCard(TICHU, choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetHandOfPlayingPlayer method, of class GraphicPlayerHand.
     */
    @Test
    public void testSetHandOfPlayingPlayer() {
        System.out.println("SetHandOfPlayingPlayer");
        GraphicTichuGame TICHU = null;
        GraphicPlayerHand instance = null;
        instance.SetHandOfPlayingPlayer(TICHU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
