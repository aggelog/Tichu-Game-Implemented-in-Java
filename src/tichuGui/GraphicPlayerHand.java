/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import tichugame.Card;
/**
*
* @author AggelogTowerStation
*/
public class GraphicPlayerHand extends JPanel {
    
    private JPanel PlayerHand;
    private JButton[] CardsInHand;
    
    /**
    * Constructor
    * 
    * Method which constructs the hand of the 
    * player as a grid layout panel
    * 
    * @param Tichu the Graphics of the TichuGame 
    */
    public GraphicPlayerHand(GraphicTichuGame Tichu)
    {
        this.PlayerHand = new JPanel();
        this.PlayerHand.setLayout(new GridLayout(1,30));
        this.PlayerHand.setBackground(Color.LIGHT_GRAY);
    }
    
    /**
    * Accessors
    * 
    * Method which returns the Panel of Player's hand
    * 
    * @return JPanel the Panel of Player's Hand 
    */
    public JPanel getPlayerHandPanel()
    {
        return this.PlayerHand;
    }
    
    /**
    * Accessors
    * 
    * Method which returns the button of the given
    * index of the card i
    * 
    * @param i the index of the card
    * @return JButton the button of the card
    */
    public JButton getCardButton(int i)
    {
        return this.CardsInHand[i];
    }
    
    /**
     *
     * @param TICHU
     * @param choice
     */
    public void printChoosenCard(GraphicTichuGame TICHU,ArrayList choice)
    {
        for(Iterator<Card> handIter=TICHU.choosenCards.iterator();handIter.hasNext();)
        {
            Card tmp= handIter.next();
            System.out.print(" "+tmp.getID()+" "+tmp.getColor());
        }
        System.out.println();
    }
    
    /**
    * Transformer
    * 
    * Method which sets the cards of the Playing Player as a
    * JButton Array and each element of the array on a panel
    * 
    * @param TICHU the Graphics of the TichuGame
    */
    public void SetHandOfPlayingPlayer(GraphicTichuGame TICHU)
    {
        try{
            this.PlayerHand.removeAll();
            this.PlayerHand.setLayout(new GridLayout(1,TICHU.getTichuGame().getPlayingPlayer().getNumOfCardsInHand()));
            this.CardsInHand = new JButton [TICHU.getTichuGame().getPlayingPlayer().getNumOfCardsInHand()];

            for (int i=0; i<TICHU.getTichuGame().getPlayingPlayer().getNumOfCardsInHand(); i++)
            {
                if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() >= 2 && 
                        TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() <= 14)
                {
                    if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getColor().equals("grey"))
                    {
                        this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID()),new ImageIcon("phoenix.png"));
                    }
                    else
                    {
                        this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID())
                            +"_"
                            +TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getColor()
                            ,new ImageIcon(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID())
                            +"_"+
                            TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getColor()+".png"));
                    }
                }
                else if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() == 0.0)
                {
                    this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID()),new ImageIcon("phoenix.png"));
                }
                else if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() == 1.0)
                {
                    this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID()),new ImageIcon("mahjong.png"));
                }
                else if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() == -2.0)
                {
                    this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID()),new ImageIcon("drache.png"));
                }
                else if(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID() == -3.0)
                {
                    this.CardsInHand[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayingPlayer().getHand().get(i).getID()),new ImageIcon("hund.png"));
                }
                this.CardsInHand[i].setBackground(Color.LIGHT_GRAY);
                this.CardsInHand[i].setPreferredSize(new Dimension(100,140));
                this.CardsInHand[i].setHorizontalTextPosition(SwingConstants.CENTER);
                JPanel CardPanel = new JPanel();
                CardPanel.setBackground(Color.LIGHT_GRAY);
                CardPanel.add(this.CardsInHand[i]);
                this.PlayerHand.add(CardPanel);
            }
        }
        catch(Exception e){}
    }
    
}
