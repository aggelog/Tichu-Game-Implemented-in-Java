/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

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
@Suite.SuiteClasses({tichugame.TichuGameTest.class, tichugame.SimpleTest.class, tichugame.HoundTest.class, tichugame.TichuDeckTest.class, tichugame.CardTest.class, tichugame.PhoenixTest.class, tichugame.PlayerTest.class, tichugame.MahjongTest.class, tichugame.DragonTest.class, tichugame.PlayedDeckTest.class, tichugame.PilesTest.class, tichugame.AllPlayersTest.class})
public class TichugameSuite {

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
