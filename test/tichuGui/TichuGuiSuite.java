/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author AggelogTowerStation
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tichuGui.GraphicTichuButtonsTest.class, tichuGui.TICHUObserverTest.class, tichuGui.TICHUListenerTest.class, tichuGui.GraphicPlayerHandTest.class, tichuGui.GraphicTichuGameTest.class, tichuGui.GraphicPlayerInfoTest.class, tichuGui.GraphicDeckTest.class})
public class TichuGuiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
