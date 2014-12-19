/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tichuGui.GraphicTichuGame;
import tichugame.Player;

/**
 *
 * @author AggelogTowerStation
 */
public class PLAYTest {
    
    public PLAYTest() {
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
     * Test of NotifyStart method, of class PLAY.
     */
    @Test
    public void testNotifyStart() {
        System.out.println("NotifyStart");
        GraphicTichuGame tichuWindow = null;
        PLAY.NotifyStart(tichuWindow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NotifyEnd method, of class PLAY.
     */
    @Test
    public void testNotifyEnd() {
        System.out.println("NotifyEnd");
        GraphicTichuGame tichuWindow = null;
        Player PreviousPlayer = null;
        PLAY.NotifyEnd(tichuWindow, PreviousPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PLAY.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PLAY.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
