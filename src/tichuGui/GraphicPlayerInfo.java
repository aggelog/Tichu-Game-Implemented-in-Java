/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author AggelogTowerStation
 */
public class GraphicPlayerInfo extends JFrame{
    
    private JPanel PlayerInfo;
    private JLabel[] Player;
    private JLabel[] ActiveLabel;
    
    /**
     * Constructor 
     * 
     * Method which creates the JPanel of the Players Info
     * only with the Players Info label
     * 
     * @param PlayerNumber the player's id
     * @param TICHU the Graphics of the TichuGame
     */
    public GraphicPlayerInfo(int PlayerNumber, GraphicTichuGame TICHU)
    {
        this.PlayerInfo = new JPanel();
        this.PlayerInfo.setLayout(new GridLayout(5,2));
        this.PlayerInfo.setBackground(Color.LIGHT_GRAY);
        
        JPanel DeadPanel = new JPanel();
        DeadPanel.setBackground(Color.LIGHT_GRAY);

        this.PlayerInfo.add(new JLabel("Players Info:\n"));
        this.PlayerInfo.add(DeadPanel);
        
        this.ActiveLabel = new JLabel [4];
        this.Player = new JLabel [4];
        
        for (int i=1; i<5; i++)
        {
            this.AddPlayerToInfo(i);
        }
    }
    
    /**
     * Transformer
     * 
     * Method which adds a Player with id i 
     * at the Player Info Panel
     * 
     * @param i the ID of the Player to Add 
     */
    private void AddPlayerToInfo(int i)
    {
        this.Player[i-1] = new JLabel("Player -"+i+"-");   
        this.Player[i-1].setBackground(Color.LIGHT_GRAY);
        
        this.ActiveLabel[i-1] = new JLabel("is Playing");
        this.ActiveLabel[i-1].setBackground(Color.LIGHT_GRAY);
        this.ActiveLabel[i-1].setVisible(false);
        
        this.PlayerInfo.add(this.Player[i-1]);
        this.PlayerInfo.add(this.ActiveLabel[i-1]);
    } 
    
    /**
     * Accessors
     * 
     * Method which returns the Panel of Players Info
     * 
     * @return JPanel the Panel of Players Info 
     */
    public JPanel getPlayersInfoPanel()
    {
        return this.PlayerInfo;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Label with player id i
     * 
     * @param i the player id
     * @return JLabel the Label Player ID
     */
    public JLabel getPlayerLabel(int i)
    {
        return this.Player[i-1];
    }    
    
    /**
     * Accessors
     * 
     * Method which returns the ActiveLabel i 
     * 
     * @param i the player id
     * @return JLabel the Label "is Playing"
     */
    public JLabel getActivePlayerLabel(int i)
    {
        return this.ActiveLabel[i-1];
    }
    
    /**
     * Transformer
     * 
     * Method which sets the visibility of the player label ON
     * 
     * @param i the ID of the Player
     * @param Boolean the visibility value of the active label
     */
    public void SetActivePlayerLabel(int i, boolean Boolean)
    {
        this.ActiveLabel[i-1].setVisible(Boolean);
    } 
    
    /**
     * Accessors
     * 
     * Method which gives access to a Dead Area
     * 
     * @return JPanel the "dead" Panel
     */
    private JPanel getDeadPanel()
    {
        JPanel DeadPanel = new JPanel();
        DeadPanel.setBackground(Color.LIGHT_GRAY);
        return DeadPanel;
    }
}
