/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import tichugame.Player;

/**
 *
 * @author AggelogTowerStation
 */
public class TICHUObserver implements TICHUListener {
    
    /**
     * Transformer
     * 
     * Method which implements the method of TICHUListener Interface
     * 
     * @param tichuWindow the Graphics of the TichuGame
     * @param PreviousPlayer the previous Player 
     */
    @Override
    public void ResetPreviousPlayer(GraphicTichuGame tichuWindow, Player PreviousPlayer)
    {
        for(int i=0;i<tichuWindow.getTichuGame().getNumOfPlayers();i++)
        {
            tichuWindow.getPlayersInfo().SetActivePlayerLabel(PreviousPlayer.getID(), false);
        }
    }    
    
    /**
     * Transformer
     * 
     * Method which implements the method of TICHUListener Interface
     * 
     * @param tichuWindow the Graphics of the TichuGame
     */
    @Override
    public void GameStatusChanged(GraphicTichuGame tichuWindow)
    {    
        tichuWindow.SetNewTurnStatus();       
    }
}
