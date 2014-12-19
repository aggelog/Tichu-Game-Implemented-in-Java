/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

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
public class GraphicDeckTest {
    
    public GraphicDeckTest() {
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
     * Test of getPlayedDeckPanel method, of class GraphicDeck.
     */
    @Test
    public void testGetPlayedDeckPanel() {
        System.out.println("getPlayedDeckPanel");
        GraphicDeck instance = null;
        JPanel expResult = null;
        JPanel result = instance.getPlayedDeckPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardsButton method, of class GraphicDeck.
     */
    @Test
    public void testGetCardsButton() {
        System.out.println("getCardsButton");
        int i = 0;
        GraphicDeck instance = null;
        JButton expResult = null;
        JButton result = instance.getCardsButton(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetPlayedCards method, of class GraphicDeck.
     */
    @Test
    public void testSetPlayedCards() {
        System.out.println("SetPlayedCards");
        GraphicTichuGame TICHU = null;
        GraphicDeck instance = null;
        instance.SetPlayedCards(TICHU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
