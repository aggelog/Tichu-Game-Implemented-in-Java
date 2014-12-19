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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import tichugame.TichuGame;
/**
 *
 * @author AggelogTowerStation
 */
public class GraphicTichuButtons extends JFrame
{
    
    private JPanel Tichu_Buttons_Panel;
    private JButton TichuButton;
    private JButton PassButton;
    private GraphicTichuGame GraphicTICHUGame;
    private TichuGame TICHUGame;
    
    /**
     * Constructor
     * 
     * Method which constructs the Pass and Tichu Buttons
     * 
     * @param TICHUGraphics Graphics of TichuGame
     * @param TICHU the tichuGame
     */
    public GraphicTichuButtons(GraphicTichuGame TICHUGraphics,TichuGame TICHU)
    {
        this.Tichu_Buttons_Panel = new JPanel();
        this.Tichu_Buttons_Panel.setLayout(new GridLayout(2,1));
        this.Tichu_Buttons_Panel.setBackground(Color.LIGHT_GRAY);

        this.PassButton = new JButton("Pass", new ImageIcon("pass-button.jpg"));
        this.PassButton.setPreferredSize(new Dimension(100, 100));
        this.PassButton.setHorizontalTextPosition(SwingConstants.CENTER);
        
        this.TichuButton = new JButton("Tichu", new ImageIcon("tichu-button.jpg"));
        this.TichuButton.setPreferredSize(new Dimension(160, 200));
        this.TichuButton.setHorizontalTextPosition(SwingConstants.CENTER);
        
        this.TICHUGame=TICHU;
        this.GraphicTICHUGame=TICHUGraphics;
        
        JPanel Pass = new JPanel();
        Pass.setBackground(Color.LIGHT_GRAY);
        Pass.add(this.PassButton);
        JPanel Tichu = new JPanel();
        Tichu.setBackground(Color.LIGHT_GRAY);
        Tichu.add(this.TichuButton);
        
        this.Tichu_Buttons_Panel.add(Pass);
        this.Tichu_Buttons_Panel.add(Tichu); 
    }
    
    /**
     * Accessors
     * 
     * Method which returns the TichuButtons Panel
     * 
     * @return JPanel the TichuButtons Panel
     */
    public JPanel getTichuButtonPanel()
    {
        return this.Tichu_Buttons_Panel;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Pass button
     * 
     * @return JButton the PassButton
     */
    public JButton getPassButton()
    {
        return this.PassButton;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the TichuButton
     * 
     * @return JButton the TichuButton
     */
    public JButton getTichuButton()
    {
        return this.TichuButton;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the TichuButton true
     * 
     * @param TICHU TichuGame
     */
    public void pressedTichuButton(TichuGame TICHU)
    {    
       if((TICHU.getTichuGame().getPlayingPlayer().getpressedTichu()==false) && (TICHU.getTichuGame().getPlayingPlayer().getpressedGrand()==false))
        {
            if (TICHU.getTichuGame().getPlayingPlayer().getNumOfCardsInHand()== 14)
            {
                TICHU.getTichuGame().getPlayingPlayer().setpressedTichu(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You cant Press Tichu now");
            }
        }
        else if((TICHU.getTichuGame().getPlayingPlayer().getpressedTichu()==false) && (TICHU.getTichuGame().getPlayingPlayer().getpressedGrand()==true))
        {
            JOptionPane.showMessageDialog(null,"You have already pressed Grand");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Tichu Button Already Pressed");
        }
    }
}
