/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichuGui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import tichugame.*;
/**
 *
 * @author AggelogTowerStation
 */
public class GraphicTichuGame extends JFrame implements ActionListener{
    
    /**
     *
     */
    public static final int width=1024;
    /**
     *
     */
    public static final int Height=860;
    
    private boolean previous = false;
    private int TEAMpoints_1;
    private int TEAMpoints_2;
    private TichuGame TICHUGame;
    private JFrame TichuWindow;
    private GraphicPlayerInfo PlayerInfo;
    private GraphicTichuButtons TichuButtons;
    private GraphicPlayerHand PlayerHand;
    private GraphicDeck CardDeck;
    ArrayList<Card> choosenCards = new ArrayList<>();
    int winningPlayer = 0;
    String path=".\\images\\";
    
    /**
     * Constructor
     * 
     * Method which constructs the TichuGame Window      
     */
    public GraphicTichuGame()
    {
        TichuWindow = new JFrame("Tichu Game Card");
        this.TichuWindow.setIconImage(Toolkit.getDefaultToolkit().getImage("drache.png"));
        TichuWindow.setExtendedState(Frame.MAXIMIZED_BOTH);  
        this.TichuWindow.setSize(1080, 720);        
        this.TichuWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.TichuWindow.setLayout(new BorderLayout());
        
        this.PlayerInfo = new GraphicPlayerInfo(4,this);
        this.TichuButtons = new GraphicTichuButtons(this,this.getTichuGame());
        this.PlayerHand = new GraphicPlayerHand(this);
        this.CardDeck = new GraphicDeck(this);
        this.previous = false;
        this.TEAMpoints_1 = 0;
        this.TEAMpoints_2 = 0;
        
        JPanel playerNorth=new JPanel();
            JPanel newButtonPanel = new JPanel();
            playerNorth.setLayout(new GridLayout(1,2));
            ImageIcon newIcon=new ImageIcon(path+"newButton.jpg");
            JButton newButton= new JButton("New Button",newIcon);
            newButton.setHorizontalTextPosition(SwingConstants.CENTER);
            newButton.addActionListener(this);
            newButtonPanel.add(newButton);
            newButton.setPreferredSize(new Dimension(125,86));
            playerNorth.add(newButtonPanel);
            
            JPanel exitButtonPanel = new JPanel();
            ImageIcon exitIcon=new ImageIcon(path+"ExitButton1.jpg");
            JButton exitButton= new JButton("Exit Button",exitIcon);
            exitButton.setHorizontalTextPosition(SwingConstants.CENTER);
            exitButton.addActionListener(this);
            exitButton.setPreferredSize(new Dimension(125,130));
            exitButtonPanel.add(exitButton);
            playerNorth.add(exitButtonPanel);

            
            TichuWindow.add(playerNorth,BorderLayout.NORTH);
        

            /*
             * South Panel
             */
            JPanel playerSouth=new JPanel();
                    
            playerSouth.add(this.PlayerHand.getPlayerHandPanel());
            
            TichuWindow.add(playerSouth,BorderLayout.SOUTH);
        
            
            /*
             * East Panel
             */
            
            JPanel playerEast=new JPanel();
            playerEast.setLayout(new GridLayout(2,1));
            playerEast.add(this.PlayerInfo.getPlayersInfoPanel());
            TichuWindow.add(playerEast,BorderLayout.EAST);
            
            playerEast.setLayout(new GridLayout(2,1));
            playerEast.add(this.TichuButtons.getTichuButtonPanel());
            TichuWindow.add(playerEast,BorderLayout.EAST);
           

            /*
             * Center Panel
             */
                JPanel centerPanel= new JPanel();
                centerPanel.setLayout(new BorderLayout());
                
                
                /*
                 * North - Center Panel
                 */
                JPanel northPanel = new JPanel();
                northPanel.setLayout(new BoxLayout(northPanel,BoxLayout.X_AXIS));
                JButton dropCardsButton = new JButton("Drop Cards");
                dropCardsButton.addActionListener(this);
                dropCardsButton.setSize(new Dimension(200,200));
                northPanel.add(dropCardsButton);
                
                centerPanel.add(northPanel,BorderLayout.SOUTH);
                

                JPanel deckPanel = new JPanel();
                deckPanel.setBackground(Color.BLACK);
                deckPanel.add(this.CardDeck.getPlayedDeckPanel());
                centerPanel.add(deckPanel);
                
                TichuWindow.add(centerPanel,BorderLayout.CENTER);
                
        this.InitializeModel();
    
        this.AddAllButtonListeners();
    }
    
    /**
     * Accessors
     * 
     * Method which returns the TichuWindow
     * 
     * @return JFrame the TichuWindow
     */
    public JFrame getTichuWindow()
    {
        return this.TichuWindow;
    } 
    
    /**
     * Accessors
     * 
     * Method which returns the TICHUgame
     * 
     * @return TichuGame the game
     */
    public TichuGame getTichuGame()
    {
        return this.TICHUGame;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the graphics of TichuGame
     * 
     * @return GraphicTichGame the graphics of TichuGame
     */
    public GraphicTichuGame getGraphicTichuGame()
    {
        return this;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Players info
     * 
     * @return GraphicPlayerInfo the Players Info
     */   
    public GraphicPlayerInfo getPlayersInfo()
    {
        return this.PlayerInfo;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Player Hand
     * 
     * @return GraphicPlayerHand the Player Hand
     */
    public GraphicPlayerHand getPlayerHand()
    {
        return this.PlayerHand;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Played Deck
     * 
     * @return GraphicDeck the Played Deck
     */
    public GraphicDeck getPlayedDeck()
    {
        return this.CardDeck;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the ArrayList with choosenCards
     * 
     * @return ArrayList<Card> the choosenCards
     */
    public ArrayList<Card> getChoosenCards()
    {
        return this.choosenCards;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the Players id who has
     * the upper hand in this round
     * 
     * @return the id value of the Player who's winning
     */
    public int getWinningPlayer()
    {
        return winningPlayer;
    }
    
    /**
     * Accessors
     * 
     * Method which returns the boolean value of previous
     * 
     * @return boolean value true or false
     */
    public boolean getPrevious()
    {
        return this.previous;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the previous with a boolean value
     * 
     * @param bool value true or false to set the previous
     */
    public void setPrevious(boolean bool)
    {
        this.previous = bool;
    }
    
    /**
     * Transformer
     * 
     * Method which assigns the total points 
     * gathered in a game to the Teams
     * 
     * @param f points gathered by team 1
     * @param l points gathered by team 2
     */
    public void setTEAMpoints(int f,int l)
    {
        this.TEAMpoints_1 += f;
        this.TEAMpoints_2 += l;
    }
    
    /**
     * Transformer
     * 
     * Method which resets the total points
     * of both Teams
     */
    public void resetTEAMpoints()
    {
        this.TEAMpoints_1 = 0;
        this.TEAMpoints_2 = 0;
    }
    
    /**
     * Observer 
     * 
     * Method which checks the total points of 
     * both teams and if one team has greater than 
     * 1000 points the game ends and a pop message
     * shows up asking players if they want to 
     * initiate a new game
     */
    public void checkEndGame()
    {
        if((this.TEAMpoints_1 >= 1000) && (this.TEAMpoints_2 < this.TEAMpoints_1))
        {
            if(JOptionPane.showConfirmDialog(null,"TEAM-1- WON!\n"
                    +"Do you want to initiate a new game?\n"
                    +"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n"
                    ,"TEAM-1- WON!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                     this.resetTEAMpoints();
                     this.previous = true;
            }
            else
            {
                System.exit(1);
            }
        }
        else if((this.TEAMpoints_2 >= 1000) && (this.TEAMpoints_2 > this.TEAMpoints_1))
        {
            if(JOptionPane.showConfirmDialog(null,"TEAM-2- WON!\n"
                    +"Do you want to initiate a new game?\n"
                    +"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n"
                    ,"TEAM-2- WON!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                     this.resetTEAMpoints();
                     this.previous = true;
            }
            else
            {
                System.exit(1);
            }
        }
    }
    
    /**
     * Transformer
     * 
     * Method which refreshes anything that could have
     * been changed in the passing turn.
     */
    public void SetNewTurnStatus(){
        try{
            
            this.getPlayersInfo().SetActivePlayerLabel(this.TICHUGame.getPlayingPlayer().getID(), true);
     
            this.getPlayerHand().SetHandOfPlayingPlayer(this);
            this.getPlayedDeck().SetPlayedCards(this);

            for(int i=0; i<this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand(); i++)
            {    
                this.PlayerHand.getCardButton(i).addActionListener(this);
            }
        
            this.getPlayerHand().getPlayerHandPanel().updateUI();
            this.getPlayedDeck().getPlayedDeckPanel().updateUI();

            this.getTichuWindow().setVisible(true);
        }
        catch(Exception e){}
    }
    
    /**
     * Transformer
     * 
     * Method which initializes the window and creates a
     * new TichGame and ask all players if they want to say
     * Grand 
     */
    public void InitializeModel()
    {
        this.TICHUGame = new TichuGame();
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
        this.previous = false;
        
        for (int i=1; i<5; i++){
            if (i <= this.TICHUGame.getNumOfPlayers())
            {
                this.PlayerInfo.getPlayerLabel(i).setVisible(true);
            }
            else
            {
                this.PlayerInfo.getPlayerLabel(i).setVisible(false);
            }
        }
        
        this.SetNewTurnStatus();
        
        if (JOptionPane.showConfirmDialog(null,"Do you want to say Grand ?\n","Player-1-", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.TICHUGame.getPlayingPlayer().setpressedGrand(true);
        }
        this.getPlayersInfo().SetActivePlayerLabel(this.TICHUGame.getPlayingPlayer().getID(), false);
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
        this.SetNewTurnStatus();
        
        if (JOptionPane.showConfirmDialog(null,"Do you want to say Grand ?\n","Player-2-", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.TICHUGame.getPlayingPlayer().setpressedGrand(true);
        }
        
        this.getPlayersInfo().SetActivePlayerLabel(this.TICHUGame.getPlayingPlayer().getID(), false);
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
        this.SetNewTurnStatus();
        
        if (JOptionPane.showConfirmDialog(null,"Do you want to say Grand ?\n","Player-3-", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.TICHUGame.getPlayingPlayer().setpressedGrand(true);
        }
        
        this.getPlayersInfo().SetActivePlayerLabel(this.TICHUGame.getPlayingPlayer().getID(), false);
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
        this.SetNewTurnStatus();
        
        if (JOptionPane.showConfirmDialog(null,"Do you want to say Grand ?\n","Player-4-", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.TICHUGame.getPlayingPlayer().setpressedGrand(true);
        }
        
        this.getPlayersInfo().SetActivePlayerLabel(this.TICHUGame.getPlayingPlayer().getID(), false);
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
        
        this.TICHUGame.shareRest();
        
        this.TICHUGame.setPlayingPlayer(this.TICHUGame.findMahjong());
        
        this.SetNewTurnStatus();
    }
    
    /**
     * Transformer
     * 
     * Method which adds Action Listeners to All Buttons
     */
    private void AddAllButtonListeners(){            

        for (int i=0; i<this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand(); i++)
        {
            this.PlayerHand.getCardButton(i).addActionListener(this);
        }
              
        this.TichuButtons.getTichuButton().addActionListener(this);
        this.TichuButtons.getPassButton().addActionListener(this);
    }
    
    /**
     * Transformer
     * 
     * Method which handles accordingly any click on the Game Window
     * 
     * @param e the ActionEvent to be handled
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String action = e.getActionCommand();
        switch(action)
        {
            case "Tichu":
        {
                this.TichuButtons.pressedTichuButton(this.TICHUGame);
                System.out.println(TICHUGame.getTichuGame().getPlayingPlayer().getpressedTichu());
                break;
        }
        case "Pass":
        {
            this.TICHUGame.goToNextPlayer();
            if(this.getWinningPlayer() == this.TICHUGame.getTichuGame().getPlayingPlayer().getID())
            {
                if(this.TICHUGame.getPlayedDeck().isEmpty())
                {
                    break;
                }
                if(this.TICHUGame.getTichuGame().getPlayedDeck().getLastCardFromDeck().getID() == -2 
                        && this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand() != 0)
                {
                    if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 1 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 3)
                            && (this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 1 && this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 1))
                    {
                        JFrame frame=new JFrame();
                        String [] possibilities = {"Player-2","Player-4"};
                        String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                        switch (cardTransformation) {
                            case "Player-2":
                                this.TICHUGame.getAllplayers().getPlayer(2,0).receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                                this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                this.getPlayedDeck().SetPlayedCards(this);
                                this.getPlayedDeck().getPlayedDeckPanel().updateUI();
                                this.getTichuWindow().setVisible(true);
                                break;
                            case "Player-4":
                                this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                                this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                this.getPlayedDeck().SetPlayedCards(this);
                                this.getPlayedDeck().getPlayedDeckPanel().updateUI();
                                this.getTichuWindow().setVisible(true);
                                break;
                                    
                        }
                    }
                    else if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 1 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 3)
                            && (this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 1 && this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0))
                    {
                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,0));
                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                    }
                    else if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 1 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 3)
                            && (this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0 && this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 1))
                    {
                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                    }
                    else if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 2 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 4)
                            && (this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 1 && this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 1))
                    {
                        JFrame frame=new JFrame();
                        String [] possibilities = {"Player-1","Player-3"};
                        String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                        switch (cardTransformation) {
                            case "Player-1":
                                this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                                this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                this.getPlayedDeck().SetPlayedCards(this);
                                this.getPlayedDeck().getPlayedDeckPanel().updateUI();
                                this.getTichuWindow().setVisible(true);
                                break;
                            case "Player-3":
                                this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                                this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                this.getPlayedDeck().SetPlayedCards(this);
                                this.getPlayedDeck().getPlayedDeckPanel().updateUI();
                                this.getTichuWindow().setVisible(true);
                                break;
                                    
                        }
                    }
                    else if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 2 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 4)
                            && (this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 1 && this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0))
                    {
                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                    }
                    else if((this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 2 || this.TICHUGame.getTichuGame().getPlayingPlayer().getID() == 4)
                            && (this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0 && this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 1))
                    {
                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                    }
                }
                else if(this.TICHUGame.getTichuGame().getPlayedDeck().getLastCardFromDeck().getID() == -2 
                        && this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand() == 0)
                {
                    if(this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand() == 0)
                    {
                        this.TICHUGame.getPlayingPlayer().setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(this.TICHUGame.getPlayingPlayer().getID());
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                        if(this.getWinningPlayer() == 1)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                JFrame frame=new JFrame();
                                String [] possibilities = {"Player-2","Player-4"};
                                String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                                switch (cardTransformation) {
                                    case "Player-2":
                                        this.TICHUGame.getAllplayers().getPlayer(2,0).receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    case "Player-4":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    
                                }
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                this.winningPlayer = 2;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().getPlayer(2,0).receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                    this.winningPlayer = 2;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.winningPlayer = 3;
                                }
                                    
                            }
                        }
                        else if(this.getWinningPlayer() == 2)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                JFrame frame=new JFrame();
                                String [] possibilities = {"Player-1","Player-3"};
                                String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                                switch (cardTransformation) {
                                    case "Player-1":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    case "Player-3":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                }
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                this.winningPlayer = 3;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.winningPlayer = 4;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.winningPlayer = 3;
                                }
                            }
                        }
                        else if(this.getWinningPlayer() == 3)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                JFrame frame=new JFrame();
                                String [] possibilities = {"Player-2","Player-4"};
                                String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                                switch (cardTransformation) {
                                    case "Player-2":         
                                        this.TICHUGame.getAllplayers().getPlayer(2,0).receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    case "Player-4":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    
                                }
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                this.winningPlayer = 4;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().getPlayer(2,0).receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.winningPlayer = 1;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.winningPlayer = 4;
                                }
                            }
                        }
                        else if(this.getWinningPlayer() == 4)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                JFrame frame=new JFrame();
                                String [] possibilities = {"Player-1","Player-3"};
                                String cardTransformation = (String)  JOptionPane.showInputDialog(frame, "Giving Baza :",
                                                                                    "To whom player you want to give the Baza ?",
                                                                                     JOptionPane.QUESTION_MESSAGE,null,possibilities, null);
                                switch (cardTransformation) {
                                    case "Player-1":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                    case "Player-3":
                                        this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                                        this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                        break;
                                }
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                this.winningPlayer = 1;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                    this.winningPlayer = 2;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getPlayingPlayer().giveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards(),this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.winningPlayer = 1;
                                }
                            }
                        }
                    }    
                }
                else
                {
                    this.TICHUGame.getPlayingPlayer().receiveBaza(this.TICHUGame.getPlayedDeck().getPlayedCards());
                    this.TICHUGame.getPlayedDeck().emptyPlayedDeck();
                    if(this.TICHUGame.getPlayingPlayer().getNumOfCardsInHand() == 0)
                    {
                        this.TICHUGame.getPlayingPlayer().setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(this.TICHUGame.getPlayingPlayer().getID());
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                        if(this.getWinningPlayer() == 1)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                this.winningPlayer = 2;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                    this.winningPlayer = 2;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.winningPlayer = 3;
                                }
                                    
                            }
                        }
                        else if(this.getWinningPlayer() == 2)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                this.winningPlayer = 3;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.winningPlayer = 4;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,1));
                                    this.winningPlayer = 3;
                                }
                            }
                        }
                        else if(this.getWinningPlayer() == 3)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                this.winningPlayer = 4;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.winningPlayer = 1;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,1));
                                    this.winningPlayer = 4;
                                }
                            }
                        }
                        else if(this.getWinningPlayer() == 4)
                        {
                            if(this.TICHUGame.getNumOfPlayers() == 3)
                            {
                                this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                this.winningPlayer = 1;
                            }
                            else if(this.TICHUGame.getNumOfPlayers() == 2)
                            {
                                if(this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0)
                                {
                                    this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                                    this.checkEndGame();
                                    JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                                    this.previous = true;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(2,0));
                                    this.winningPlayer = 2;
                                }
                                else if(this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0)
                                {
                                    this.TICHUGame.setPlayingPlayer(this.TICHUGame.getAllplayers().getPlayer(1,0));
                                    this.winningPlayer = 1;
                                }
                            }
                        }
                    }
                }
            }
            break;
        }
            case "Drop Cards":
                if(this.choosenCards.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"You havent choose any cards to drop!\n.");
                    break;
                }
                boolean valid;
                valid = this.TICHUGame.CheckMove(this);
                
                if(valid == true)
                {
                    if(winningPlayer == 1 && this.TICHUGame.getAllplayers().getPlayer(1,0).getHand().isEmpty())
                    {
                        this.TICHUGame.getAllplayers().getPlayer(1,0).setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(1);
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                    }
                    else if(winningPlayer == 2 && this.TICHUGame.getAllplayers().getPlayer(2,0).getHand().isEmpty())
                    {
                        this.TICHUGame.getAllplayers().getPlayer(2,0).setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(2);
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                    }
                    else if(winningPlayer == 3 && this.TICHUGame.getAllplayers().getPlayer(1,1).getHand().isEmpty())
                    {
                        this.TICHUGame.getAllplayers().getPlayer(1,1).setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(3);
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                    }
                    else if(winningPlayer == 4 && this.TICHUGame.getAllplayers().getPlayer(2,1).getHand().isEmpty())
                    {
                        this.TICHUGame.getAllplayers().getPlayer(2,1).setStatus(0);
                        this.TICHUGame.getAllplayers().setExitOrder(4);
                        this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                    }
                        
                    winningPlayer = this.TICHUGame.getPlayingPlayer().getID();
                    System.out.println();
                    System.out.println("Ola ok den trexei tpt! :D :D");
                    System.out.println("To eidos tou playedDeck einai : "+ this.TICHUGame.getPlayedDeck().getTypeID());
                    System.out.println();
                    this.fromChoosenToPlayedDeck();
                    this.CardDeck.SetPlayedCards(this);
                    this.printPlayedDeck();
                    if(this.TICHUGame.getPlayingPlayer().getHand().isEmpty() && this.TICHUGame.getNumOfPlayers() == 2)
                    {
                        if(this.TICHUGame.getPlayingPlayer().getID() == 1)
                        {
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if(this.TICHUGame.getPlayingPlayer().getID() == 2)
                        {
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if(this.TICHUGame.getPlayingPlayer().getID() == 3)
                        {
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if(this.TICHUGame.getPlayingPlayer().getID() == 4)
                        {
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                    }
                    else if(this.TICHUGame.getPlayingPlayer().getHand().isEmpty() && this.TICHUGame.getNumOfPlayers() == 3)
                    {
                        if((this.TICHUGame.getPlayingPlayer().getID() == 1) && (this.TICHUGame.getAllplayers().getPlayer(1,1).getStatus() == 0))
                        {
                            this.TICHUGame.getPlayingPlayer().setStatus(0);
                            this.TICHUGame.getAllplayers().setExitOrder(1);
                            this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if((this.TICHUGame.getPlayingPlayer().getID() == 2) && (this.TICHUGame.getAllplayers().getPlayer(2,1).getStatus() == 0))
                        {
                            this.TICHUGame.getPlayingPlayer().setStatus(0);
                            this.TICHUGame.getAllplayers().setExitOrder(2);
                            this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if((this.TICHUGame.getPlayingPlayer().getID() == 3) && (this.TICHUGame.getAllplayers().getPlayer(1,0).getStatus() == 0))
                        {
                            this.TICHUGame.getPlayingPlayer().setStatus(0);
                            this.TICHUGame.getAllplayers().setExitOrder(3);
                            this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam1());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                        else if((this.TICHUGame.getPlayingPlayer().getID() == 4) && (this.TICHUGame.getAllplayers().getPlayer(2,0).getStatus() == 0))
                        {
                            this.TICHUGame.getPlayingPlayer().setStatus(0);
                            this.TICHUGame.getAllplayers().setExitOrder(4);
                            this.TICHUGame.setNumOfPlayers(this.TICHUGame.getNumOfPlayers() - 1);
                            this.TICHUGame.getAllplayers().setPoints(this.TICHUGame.getAllplayers().getTeam2(),
                                                                             this.TICHUGame.getAllplayers().getTeam1(),
                                                                             this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.setTEAMpoints(this.TICHUGame.getAllplayers().getPointsTeam1(),this.TICHUGame.getAllplayers().getPointsTeam2());
                            this.checkEndGame();
                            JOptionPane.showMessageDialog(null,"TEAM -1- :  "+this.TEAMpoints_1+"  \n"+"TEAM -2- :  "+this.TEAMpoints_2+"  \n");
                            this.previous = true;
                        }
                    }
                    this.TICHUGame.goToNextPlayer();
                }
                else
                {
                    System.out.println();
                    JOptionPane.showMessageDialog(null,"Invalid Move !\nPlease choose again.");
                    this.choosenCards.clear();
                    System.out.println();
                }
                
                break;
            case "New Button":
               this.resetTEAMpoints();
               this.previous = true;
                break;
            case "Exit Button":
                 if(JOptionPane.showConfirmDialog(null,"Do you want to Exit ?\n","Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                 {
                     System.exit(0);
                 }
                break;
            default:
            {
                for(Iterator<Card> handIter=this.TICHUGame.getPlayingPlayer().getHand().iterator();handIter.hasNext();)
                {
                    Card tmp = handIter.next();
                    if(action.contains("_"))
                    {
                        String buttonParts[] = action.split("_");
                        String buttonID = buttonParts[0];
                        String buttonColor = buttonParts[1];
                        if((Double.toString(tmp.getID()).equals(buttonID))&&(tmp.getColor().equals(buttonColor)))
                        {
                            if(!choosenCards.contains(tmp))
                            {
                                choosenCards.add(tmp);
                            }
                        }
                    }
                    else if(Double.toString(tmp.getID()).equals(action))
                    {
                            if(Double.parseDouble(action)== 0.0)
                            {
                                if(this.TICHUGame.getPlayedDeck().getTypeID() > 1.0)
                                {
                                    JFrame frame=new JFrame();
                                    String [] possibilities = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
                                    String cardTransformation = (String)  JOptionPane.showInputDialog(frame, 
                                                                     "Tranform Card To :",
                                                                                    "Card Tranformation",
                                                                        JOptionPane.QUESTION_MESSAGE, 
                                                                                                null, 
                                                                                       possibilities, 
                                                                                       possibilities[0]);
                                    System.out.println(cardTransformation);
                                    switch (cardTransformation) {
                                        case "A":
                                            tmp.setID(14);
                                            break;
                                        case "J":
                                            tmp.setID(11);
                                            break;
                                        case "Q":
                                            tmp.setID(12);
                                            break;
                                        case "K":
                                            tmp.setID(13);
                                            break;
                                        default:
                                            for(int i = 1;i<11;i++)
                                            {
                                                if(cardTransformation.equals(possibilities[i]))
                                                {
                                                    tmp.setID(i+1);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                else
                                {
                                    if((this.TICHUGame.getPlayedDeck().getTypeID()== 0.0) && (!(this.getChoosenCards().isEmpty())))
                                    {
                                        JFrame frame=new JFrame();
                                        String [] possibilities = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
                                        String cardTransformation = (String)  JOptionPane.showInputDialog(frame, 
                                                                     "Tranform Card To :",
                                                                                    "Card Tranformation",
                                                                        JOptionPane.QUESTION_MESSAGE, 
                                                                                                null, 
                                                                                       possibilities, 
                                                                                       possibilities[0]);
                                        System.out.println(cardTransformation);
                                        switch (cardTransformation) {
                                            case "A":
                                                tmp.setID(14);
                                                break;
                                            case "J":
                                                tmp.setID(11);
                                                break;
                                            case "Q":
                                                tmp.setID(12);
                                                break;
                                            case "K":
                                                tmp.setID(13);
                                                break;
                                            default:
                                                for(int i = 1;i<11;i++)
                                                {
                                                    if(cardTransformation.equals(possibilities[i]))
                                                    {
                                                        tmp.setID(i+1);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    else if((this.TICHUGame.getPlayedDeck().getTypeID()== 0.0) && (this.getChoosenCards().isEmpty()))
                                    {
                                        tmp.setID(0.5);
                                    }
                                    else
                                    {
                                        tmp.setID(this.TICHUGame.getPlayedDeck().getLastCardFromDeck().getID()+0.5);
                                    }
                                }
                            }
                            if(!choosenCards.contains(tmp))
                            {
                                   choosenCards.add(tmp);
                            }
                    }       
                    
                }
                this.sortChoosenCards();
                this.PlayerHand.printChoosenCard(this,this.choosenCards);
            }
        }    
    }
    
    /**
     * Transformer 
     * 
     * Method which sorts the ArrayList with the choosenCards
     */
    private void sortChoosenCards()
    {
        for(int i = 0;i<this.choosenCards.size();i++)
        {
            for(int j= i+1;j<this.choosenCards.size();j++)
            {
                if(choosenCards.get(j).getID()<choosenCards.get(i).getID())
                {
                    Card tmp = choosenCards.get(i);
                    choosenCards.set(i,choosenCards.get(j));
                    choosenCards.set(j, tmp);
                    
                }
            }
        }
    }
    
    /**
     * Transformer
     * 
     * Method which removes all cards from ArrayList choosenCards
     * and inserts them to the ArrayList PlayedDeck
     */
    public void fromChoosenToPlayedDeck()
    {
        for(Iterator<Card> choiceIter=this.choosenCards.iterator();choiceIter.hasNext();)
        {
            Card tmp=choiceIter.next();
            this.TICHUGame.getPlayedDeck().putOnDeck(tmp);
            this.TICHUGame.getPlayingPlayer().removeCard(tmp);
        }
        this.choosenCards.clear();
    }
    /**
     *
     */
    public void printPlayedDeck()
    {
        for(Iterator<Card> playedIter = this.TICHUGame.getPlayedDeck().getPlayedCards().iterator();playedIter.hasNext();)
        {
            Card tmp = playedIter.next();
            System.out.print(" "+tmp.getID()+" "+tmp.getColor());
        }
    }
}
