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
import tichugame.TichuGame;

/**
 *
 * @author AggelogTowerStation
 */
public class GraphicTichuButtonsTest {
    
    public GraphicTichuButtonsTest() {
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
     * Test of getTichuButtonPanel method, of class GraphicTichuButtons.
     */
    @Test
    public void testGetTichuButtonPanel() {
        System.out.println("getTichuButtonPanel");
        GraphicTichuButtons instance = null;
        JPanel expResult = null;
        JPanel result = instance.getTichuButtonPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassButton method, of class GraphicTichuButtons.
     */
    @Test
    public void testGetPassButton() {
        System.out.println("getPassButton");
        GraphicTichuButtons instance = null;
        JButton expResult = null;
        JButton result = instance.getPassButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTichuButton method, of class GraphicTichuButtons.
     */
    @Test
    public void testGetTichuButton() {
        System.out.println("getTichuButton");
        GraphicTichuButtons instance = null;
        JButton expResult = null;
        JButton result = instance.getTichuButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressedTichuButton method, of class GraphicTichuButtons.
     */
    @Test
    public void testPressedTichuButton() {
        System.out.println("pressedTichuButton");
        TichuGame TICHU = null;
        GraphicTichuButtons instance = null;
        instance.pressedTichuButton(TICHU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
