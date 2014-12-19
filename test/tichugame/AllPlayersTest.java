/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.ArrayList;
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
public class AllPlayersTest {
    
    public AllPlayersTest() {
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
     * Test of getExitOrder method, of class AllPlayers.
     */
    @Test
    public void testGetExitOrder() {
        System.out.println("getExitOrder");
        AllPlayers instance = new AllPlayers();
        String expResult = "";
        String result = instance.getExitOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExitOrder method, of class AllPlayers.
     */
    @Test
    public void testSetExitOrder() {
        System.out.println("setExitOrder");
        int id = 0;
        AllPlayers instance = new AllPlayers();
        instance.setExitOrder(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam1 method, of class AllPlayers.
     */
    @Test
    public void testGetTeam1() {
        System.out.println("getTeam1");
        AllPlayers instance = new AllPlayers();
        ArrayList expResult = null;
        ArrayList result = instance.getTeam1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam2 method, of class AllPlayers.
     */
    @Test
    public void testGetTeam2() {
        System.out.println("getTeam2");
        AllPlayers instance = new AllPlayers();
        ArrayList expResult = null;
        ArrayList result = instance.getTeam2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class AllPlayers.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        int Team = 0;
        int pos = 0;
        AllPlayers instance = new AllPlayers();
        Player expResult = null;
        Player result = instance.getPlayer(Team, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoints method, of class AllPlayers.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        ArrayList winnerTeam = null;
        ArrayList loserTeam = null;
        int points = 0;
        AllPlayers instance = new AllPlayers();
        instance.setPoints(winnerTeam, loserTeam, points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointsTeam1 method, of class AllPlayers.
     */
    @Test
    public void testGetPointsTeam1() {
        System.out.println("getPointsTeam1");
        AllPlayers instance = new AllPlayers();
        int expResult = 0;
        int result = instance.getPointsTeam1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointsTeam2 method, of class AllPlayers.
     */
    @Test
    public void testGetPointsTeam2() {
        System.out.println("getPointsTeam2");
        AllPlayers instance = new AllPlayers();
        int expResult = 0;
        int result = instance.getPointsTeam2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamStatus method, of class AllPlayers.
     */
    @Test
    public void testTeamStatus() {
        System.out.println("teamStatus");
        Player player1 = null;
        Player player2 = null;
        AllPlayers instance = new AllPlayers();
        int expResult = 0;
        int result = instance.teamStatus(player1, player2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
