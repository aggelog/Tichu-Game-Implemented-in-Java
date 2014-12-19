/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tichugame.Player;

/**
 *
 * @author AggelogTowerStation
 */
public class TICHUListenerTest {
    
    public TICHUListenerTest() {
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
     * Test of ResetPreviousPlayer method, of class TICHUListener.
     */
    @Test
    public void testResetPreviousPlayer() {
        System.out.println("ResetPreviousPlayer");
        GraphicTichuGame tichuWindow = null;
        Player PreviousPlayer = null;
        TICHUListener instance = new TICHUListenerImpl();
        instance.ResetPreviousPlayer(tichuWindow, PreviousPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GameStatusChanged method, of class TICHUListener.
     */
    @Test
    public void testGameStatusChanged() {
        System.out.println("GameStatusChanged");
        GraphicTichuGame TichuWindow = null;
        TICHUListener instance = new TICHUListenerImpl();
        instance.GameStatusChanged(TichuWindow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TICHUListenerImpl implements TICHUListener {

        public void ResetPreviousPlayer(GraphicTichuGame tichuWindow, Player PreviousPlayer) {
        }

        public void GameStatusChanged(GraphicTichuGame TichuWindow) {
        }
    }
}
