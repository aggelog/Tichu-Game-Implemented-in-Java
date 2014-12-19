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
public interface TICHUListener {
    /**
     * Transformer
     * 
     * Method which changes the player's info
     * 
     * @param tichuWindow the Graphics of the TichuGame
     * @param PreviousPlayer the previous Player
     */
    public void ResetPreviousPlayer(GraphicTichuGame tichuWindow, Player PreviousPlayer);
    /**
     * Transformer
     * 
     * Method which listens to the changes of the game
     * and refreshes the GUI
     * 
     * @param TichuWindow the Graphics of the TichuGame
     */
    public void GameStatusChanged(GraphicTichuGame TichuWindow);
}
