/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author AggelogTowerStation
 */
public class GraphicDeck {
   
    private JPanel PlayedDeck;
    private JButton[] CardsInDeck;
    
    /**
     * Constructor
     * 
     * Method which constructs the played Deck
     * as a grid layout panel
     * 
     * @param Tichu the Graphics of the TichuGame 
     */
    public GraphicDeck(GraphicTichuGame Tichu)
    {
        this.PlayedDeck = new JPanel();
        this.PlayedDeck.setLayout(new GridLayout(1,30));
        this.PlayedDeck.setBackground(Color.BLACK);
    } 
    
    /**
     * Accessors
     * 
     * Method which returns the Panel of Played Deck
     * 
     * @return JPanel the Panel of Played Deck 
     */
    public JPanel getPlayedDeckPanel()
    {
        return this.PlayedDeck;
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
    public JButton getCardsButton(int i)
    {   
        return this.CardsInDeck[i];
    }
    
    /**
    * Transformer
    * 
    * Method which sets the cards of the Played Deck as a
    * JButton Array and each element of the array on a panel
    * 
    * @param TICHU the Graphics of the TichuGame
    */
    public void SetPlayedCards(GraphicTichuGame TICHU)
    {
        try{
            this.PlayedDeck.removeAll();
            this.PlayedDeck.setLayout(new GridLayout(1,TICHU.getTichuGame().getPlayedDeck().getPlayedCards().size()));
            this.CardsInDeck = new JButton [TICHU.getTichuGame().getPlayedDeck().getPlayedCards().size()];
            
            for (int i=0; i<TICHU.getTichuGame().getPlayedDeck().getPlayedCards().size(); i++)
            {
                if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() >= 2 && 
                        TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() <= 14)
                {
                    if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getColor().equals("grey"))
                    {
                        this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("phoenix.png"));
                    }
                    else
                    {
                        this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID())
                            +"_"
                            +TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getColor()
                            ,new ImageIcon(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID())
                            +"_"+
                            TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getColor()+".png"));
                    }
                }
                else if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == 0)
                {
                    this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("phoenix.png"));
                }
                else if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == 1)
                {
                    this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("mahjong.png"));
                }
                else if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == -2)
                {
                    this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("drache.png"));
                }
                else if(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == -3)
                {
                    this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("hund.png"));
                }
                
                if((TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == 0.5)
                        || (TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == 14.5)
                        || (TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID() == 1.5))
                {
                    this.CardsInDeck[i] = new JButton(Double.toString(TICHU.getTichuGame().getPlayedDeck().getPlayedCards().get(i).getID()),new ImageIcon("phoenix.png"));
                }
                this.CardsInDeck[i].setBackground(Color.BLACK);
                this.CardsInDeck[i].setPreferredSize(new Dimension(100,140));
                this.CardsInDeck[i].setHorizontalTextPosition(SwingConstants.CENTER);
                JPanel CardPanel = new JPanel();
                CardPanel.setBackground(Color.BLACK);
                CardPanel.add(this.CardsInDeck[i]);
                this.PlayedDeck.add(CardPanel);
            }
        }
        catch(Exception e){}
    }
}
