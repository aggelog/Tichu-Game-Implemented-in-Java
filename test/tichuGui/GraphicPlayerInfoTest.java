/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import javax.swing.JLabel;
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
public class GraphicPlayerInfoTest {
    
    public GraphicPlayerInfoTest() {
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
     * Test of getPlayersInfoPanel method, of class GraphicPlayerInfo.
     */
    @Test
    public void testGetPlayersInfoPanel() {
        System.out.println("getPlayersInfoPanel");
        GraphicPlayerInfo instance = null;
        JPanel expResult = null;
        JPanel result = instance.getPlayersInfoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerLabel method, of class GraphicPlayerInfo.
     */
    @Test
    public void testGetPlayerLabel() {
        System.out.println("getPlayerLabel");
        int i = 0;
        GraphicPlayerInfo instance = null;
        JLabel expResult = null;
        JLabel result = instance.getPlayerLabel(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivePlayerLabel method, of class GraphicPlayerInfo.
     */
    @Test
    public void testGetActivePlayerLabel() {
        System.out.println("getActivePlayerLabel");
        int i = 0;
        GraphicPlayerInfo instance = null;
        JLabel expResult = null;
        JLabel result = instance.getActivePlayerLabel(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetActivePlayerLabel method, of class GraphicPlayerInfo.
     */
    @Test
    public void testSetActivePlayerLabel() {
        System.out.println("SetActivePlayerLabel");
        int i = 0;
        boolean Boolean = false;
        GraphicPlayerInfo instance = null;
        instance.SetActivePlayerLabel(i, Boolean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
