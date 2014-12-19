/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import tichuGui.*;
/**
 *
 * @author AggelogTowerStation
 */
public class TichuGame {

    private AllPlayers players;
    private Player PlayingPlayer;
    private int PlayersNumber;
    private TichuDeck tichuDeck;
    private PlayedDeck playedDeck;
    private Set <TICHUListener> Listeners;
    
     /**
     * <b>Constructor</b> of class TichuGame
     */
    public TichuGame()
    {
        initiateGame();
        System.out.println("initiateGame done!");
    }
    /**
     * This method called in Constructor, creates all players,
     * the played and the tichu deck,the listeners and shares
     * the first 32 cards to the players by calling the share32()
     * method
     */
    private void initiateGame()
    {
        players = new AllPlayers();
        PlayersNumber = 4;
        PlayingPlayer = null;
        tichuDeck = new TichuDeck();
        playedDeck = new PlayedDeck();
        
        Listeners = new HashSet<>();
        this.AddTichuListener(new TICHUObserver());
        
        share32();
    }
    
    /**
     * Transformer
     * 
     * Method which shares the first 32 cards to the 4 players
     * by removing one by one the cards from tichuDeck and adding
     * them into player's hand.
     */
    private void share32()
    {
        for(int i = 0;i < 8; i++)
        {
            this.players.getPlayer(1,0).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(2,0).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(1,1).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(2,1).receiveCard(this.tichuDeck.removeCard(0));
        }
    }
    
    /**
     * Transformer
     * 
     * Method which searches the players hands,looks
     * whose have the Mahjong card and assigns / returns
     * to startingPlayer the one who has it.
     * 
     * @return startingPlayer the Player who's going to play first 
     */
    public Player findMahjong()
    {
        Player startingPlayer=null;
        for(int i=1;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(Iterator<Card> handIter=players.getPlayer(i,j).getHand().iterator();handIter.hasNext();)
                {
                    Card tmp;                   
                    tmp= handIter.next();
                    if(tmp.getID()==1)
                    {
                       startingPlayer = players.getPlayer(i,j);
                    }
                }
            }
        }
        return startingPlayer;
    }
    
    /**
     * Transformer
     * 
     * Method which shares rest of the cards which have left in tichuDeck 
     * after share32() to the 4 players by removing one by one the cards 
     * from tichuDeck and adding them into player's hand.
     */
    public void shareRest()
    {
        for(int i = 0;i < 6; i++)
        {
            this.players.getPlayer(1,0).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(2,0).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(1,1).receiveCard(this.tichuDeck.removeCard(0));
            this.players.getPlayer(2,1).receiveCard(this.tichuDeck.removeCard(0));
        }
    }
    
    /**
     * Accessors
     * 
     * Method returns all players who have been
     * created
     * 
     * @return all players
     */
    public AllPlayers getAllplayers()
    {
        return this.players;
    }
    
    /**
     * Accessors
     * 
     * Method returns the object tichuGame
     * 
     * @return object tichuGame
     */
    public TichuGame getTichuGame()
    {
        return this;
    }
    
    /**
     * Observer
     * 
     * Method which checks the state of the game
     * if the playedDeck is empty or not,how many
     * players are playing and etc.. and sets the 
     * next player who's going to play.
     * 
     */
    public void goToNextPlayer()
    {
        if(this.playedDeck.isEmpty() == false)
        {
            if(this.playedDeck.getLastCardFromDeck().getID() == -3)
            {
                this.PlayingPlayer.receiveBaza(this.getPlayedDeck().getPlayedCards());
                this.getPlayedDeck().emptyPlayedDeck();
                if(this.PlayersNumber == 4)
                {
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,1));
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(2,1));
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                    }
                    else
                    {
                        this.setPlayingPlayer(this.players.getPlayer(2,0));
                    }
                }
                else if(this.PlayersNumber == 3)
                {
                    
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        if(this.players.getPlayer(2,0).getStatus() == 0 || this.players.getPlayer(1,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        if(this.players.getPlayer(1,1).getStatus() == 0 || this.players.getPlayer(2,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        if(this.players.getPlayer(2,1).getStatus() == 0 || this.players.getPlayer(1,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                    }
                    else
                    {
                        if(this.players.getPlayer(1,0).getStatus() == 0 || this.players.getPlayer(2,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                    }
                }
                else
                {
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(2,0));
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                        this.setPlayingPlayer(this.players.getPlayer(2,0));
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                        this.setPlayingPlayer(this.players.getPlayer(1,1));
                    }
                    else
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                        this.setPlayingPlayer(this.players.getPlayer(2,1));
                    }
                }
            }
            else
            {
                if(this.PlayersNumber == 4)
                {
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(2,0));
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,1));
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        this.setPlayingPlayer(this.players.getPlayer(2,1));
                    }
                    else
                    {
                        this.setPlayingPlayer(this.players.getPlayer(1,0));
                    }
                }
                else if(this.PlayersNumber == 3)
                {
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        if(this.players.getPlayer(2,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        if(this.players.getPlayer(1,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        if(this.players.getPlayer(2,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                    }
                    else
                    {
                        if(this.players.getPlayer(1,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                    }
                }
                else
                {
                    if(this.PlayingPlayer.getID() == 1)
                    {
                        if(this.players.getPlayer(2,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 2)
                    {
                        if(this.players.getPlayer(1,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                    }
                    else if(this.PlayingPlayer.getID() == 3)
                    {
                        if(this.players.getPlayer(2,1).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,0));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(2,1));
                        }
                    }
                    else
                    {
                        if(this.players.getPlayer(1,0).getStatus() == 0)
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,1));
                        }
                        else
                        {
                            this.setPlayingPlayer(this.players.getPlayer(1,0));
                        }
                    }
                }
            }
        }
        else
        {
            if(this.PlayersNumber == 4)
            {
                JOptionPane.showMessageDialog(null,"You cant press PASS!\nYou must make a move.");
            }
        }
    }
    
    /**
     * Observer
     * 
     * Method which checks the cards in the ChoosenCards
     * ArrayList and in the PlayedDeck and notifies if
     * the move is valid or not by returning a boolean
     * value
     * 
     * @param TICHU the graphics of tichuGame
     * @return true if the move is valid else false
     */
    public boolean CheckMove(GraphicTichuGame TICHU)
    {
        int numOfchoosenCards = TICHU.getGraphicTichuGame().getChoosenCards().size();
        if(this.playedDeck.isEmpty()) //an to PlayedDeck einai adeio
        {
            if(numOfchoosenCards == 1)  // monofilia : aples h drakos h phinikas h skilos
            {
                this.playedDeck.setTypeID(1);
                this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                return true;
            }
            else if(numOfchoosenCards == 2) // zeugari apo 2
            {
                if(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                {
                    this.playedDeck.setTypeID(2);
                    this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 3) // zeugari apo 3
            {
                if((TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID())
                {
                    this.playedDeck.setTypeID(3);
                    this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 4) // Diplo_zeugari apo 2
            {
                int pass = 0;
                for(int i=0;i<2;i++)
                {
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(2*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((2*i) +1)).getID())
                    {
                        pass=1;
                    }
                    else
                    {
                        pass=0;
                    }
                }
                
                if(pass == 1)
                {
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() - TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == 1)
                    {
                        this.playedDeck.setTypeID(22);
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 5) // Full house - Kenta
            {
                if((TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID())
                {//full x-x-x/yy
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID())
                    {
                        this.playedDeck.setTypeID(32);
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else if((TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID())
                {// full yy/x-x-x
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                    {
                        this.playedDeck.setTypeID(32);
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else // kenta me 5 fylla
                {
                    double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                    int pass=0;
                    for(int i=0;i<5;i++)
                    {
                        if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                        {
                            pass++;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    if(pass == 5)
                    {
                        this.playedDeck.setTypeID(5);
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                }
            }
            else if((numOfchoosenCards % 2 == 0 && numOfchoosenCards > 5) || (numOfchoosenCards == 9)) // Diplo h Tetraplo_zeugari apo 3 - Sinexomena_zeugaria apo 2 - Kenta
            {
                double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                int pass=0;
                for(int i=0;i<TICHU.getGraphicTichuGame().getChoosenCards().size();i++)
                {
                    if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                    {
                        pass++;
                    }
                }
                if(pass == TICHU.getGraphicTichuGame().getChoosenCards().size())
                {
                    this.playedDeck.setTypeID(TICHU.getGraphicTichuGame().getChoosenCards().size());
                    this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                    return true;
                }
                else // den einai kenta...
                {
                    int pass1 = 0;
                    for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()/2);i++)
                    {
                        if(TICHU.getGraphicTichuGame().getChoosenCards().get(2*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((2*i) +1)).getID())
                        {
                            pass1=1;
                        }
                        else
                        {
                            pass1=0;
                        }
                    }
                
                    if(pass1 == 1) // an einai ola en telh zeugaria twn 2 koitaw an einai kai synexomena
                    {
                        int pass2=1;
                        for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()-2);i+=2)
                        {
                            if(TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID() == (TICHU.getGraphicTichuGame().getChoosenCards().get(i+2).getID()-1))
                            {
                                pass2++;
                            }
                        }
                        // an einai sinexomena
                        if(pass2 == (TICHU.getGraphicTichuGame().getChoosenCards().size()/2))
                        {
                            this.playedDeck.setTypeID((pass2+20));
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else // koitaw an einai zeugaria twn 3
                    {
                        int pass3 = 0;
                        for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()/3);i++)
                        {
                            if((TICHU.getGraphicTichuGame().getChoosenCards().get(3*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+1)).getID())
                                && TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+1)).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+2)).getID())
                            {
                                pass3=1;
                            }
                            else
                            {
                                pass3=0;
                            }
                        }
                        
                        if(pass3 == 1) // an einai zeugaria twn 3 elegxw an einai synexomena
                        {
                            int pass4=1;
                            for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()-3);i+=3)
                            {
                                if(TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID() == (TICHU.getGraphicTichuGame().getChoosenCards().get(i+3).getID()-1))
                                {
                                    pass4++;
                                }
                            }
                            // an einai sinexomena
                            if(pass4 == (TICHU.getGraphicTichuGame().getChoosenCards().size()/3))
                            {
                                this.playedDeck.setTypeID((pass4+40));
                                this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                                return true;
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
            else    // kenta me 7 h 11 h 13 fylla
            {
                double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                int pass=0;
                for(int i=0;i<TICHU.getGraphicTichuGame().getChoosenCards().size();i++)
                {
                    if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                    {
                        pass++;
                    }
                    else
                    {
                        return false;
                    }
                }
                if(pass == TICHU.getGraphicTichuGame().getChoosenCards().size())
                {
                    this.playedDeck.setTypeID(TICHU.getGraphicTichuGame().getChoosenCards().size());
                    this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                    return true;
                }
                else
                {
                    return false;
                }
            }
            
        }
        else                           //an to PlayedDeck DEN einai adeio
        {
            if(numOfchoosenCards == 1)  // monofilia : aples h drakos h phinikas h skilos
            {
                if(this.playedDeck.getTypeID() == 1)
                {
                    if(this.playedDeck.getMinOfType() == -2)
                    {
                        return false;
                    }
                    else if((TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType()) || (TICHU.getChoosenCards().get(0).getID() == -2))
                    {
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                    
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 2) // zeugari apo 2
            {
                if(this.playedDeck.getTypeID() == 2)
                {
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                    {
                        if(TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType())
                        {
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 3) // zeugari apo 3
            {
                if(this.playedDeck.getTypeID() == 3)
                {
                    if((TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID())
                    {
                        if(TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType())
                        {
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            else if(numOfchoosenCards == 4) // Diplo_zeugari apo 2
            {
                if(this.playedDeck.getTypeID() == 22)
                {
                    int pass = 0;
                    for(int i=0;i<2;i++)
                    {
                        if(TICHU.getGraphicTichuGame().getChoosenCards().get(2*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((2*i) +1)).getID())
                        {
                            pass=1;
                        }
                        else
                        {
                            pass=0;
                        }
                    }
                
                    if(pass == 1)
                    {
                        if(TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() - TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == 1)
                        {
                            if(TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType())
                            {
                                this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                                return true;
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(numOfchoosenCards == 5) // Full house - Kenta
            {
                if((TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID())
                {//full x-x-x/yy
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID())
                    {
                        if((this.playedDeck.getTypeID() == 32) && (TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType()))
                        {
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else if((TICHU.getGraphicTichuGame().getChoosenCards().get(2).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID())
                        && TICHU.getGraphicTichuGame().getChoosenCards().get(3).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID())
                {// full yy/x-x-x
                    if(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(1).getID())
                    {
                        if((this.playedDeck.getTypeID() == 32) && (TICHU.getChoosenCards().get(4).getID() > this.playedDeck.getMinOfType()))
                        {
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(4).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else // kenta me 5 fylla
                {
                    double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                    int pass=0;
                    for(int i=0;i<5;i++)
                    {
                        if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                        {
                            pass++;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    if(pass == 5)
                    {
                        if((this.playedDeck.getTypeID() == 5) && (TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType()))
                        {
                            this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
            else if((numOfchoosenCards % 2 == 0 && numOfchoosenCards > 5) || (numOfchoosenCards == 9)) // Diplo h Tetraplo_zeugari apo 3 - Sinexomena_zeugaria apo 2 - Kenta
            {
                double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                int pass=0;
                for(int i=0;i<TICHU.getGraphicTichuGame().getChoosenCards().size();i++)
                {
                    if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                    {
                        pass++;
                    }
                }
                if(pass == TICHU.getGraphicTichuGame().getChoosenCards().size())
                {
                    if((this.playedDeck.getTypeID() == TICHU.getGraphicTichuGame().getChoosenCards().size()) && (TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType()))
                    {    
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else // den einai kenta...
                {
                    int pass1 = 0;
                    for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()/2);i++)
                    {
                        if(TICHU.getGraphicTichuGame().getChoosenCards().get(2*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((2*i) +1)).getID())
                        {
                            pass1=1;
                        }
                        else
                        {
                            pass1=0;
                        }
                    }
                
                    if(pass1 == 1) // an einai ola en telh zeugaria twn 2 koitaw an einai kai synexomena
                    {
                        int pass2=1;
                        for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()-2);i+=2)
                        {
                            if(TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID() == (TICHU.getGraphicTichuGame().getChoosenCards().get(i+2).getID()-1))
                            {
                                pass2++;
                            }
                        }
                        // an einai sinexomena
                        if(pass2 == (TICHU.getGraphicTichuGame().getChoosenCards().size()/2))
                        {
                            if((this.playedDeck.getTypeID() == (pass2+20)) && ((TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType())))
                            {
                                this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                                return true;
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else // koitaw an einai zeugaria twn 3
                    {
                        int pass3 = 0;
                        for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()/3);i++)
                        {
                            if((TICHU.getGraphicTichuGame().getChoosenCards().get(3*i).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+1)).getID())
                                && TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+1)).getID() == TICHU.getGraphicTichuGame().getChoosenCards().get(((3*i)+2)).getID())
                            {
                                pass3=1;
                            }
                            else
                            {
                                pass3=0;
                            }
                        }
                        
                        if(pass3 == 1) // an einai zeugaria twn 3 elegxw an einai synexomena
                        {
                            int pass4=1;
                            for(int i=0;i<(TICHU.getGraphicTichuGame().getChoosenCards().size()-3);i+=3)
                            {
                                if(TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID() == (TICHU.getGraphicTichuGame().getChoosenCards().get(i+3).getID()-1))
                                {
                                    pass4++;
                                }
                            }
                            // an einai sinexomena
                            if(pass4 == (TICHU.getGraphicTichuGame().getChoosenCards().size()/3))
                            {
                                if((this.playedDeck.getTypeID() == (pass4+40)) && ((TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType())))
                                {
                                    this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                                    return true;
                                }
                                else
                                {
                                    return false;
                                }
                            }
                            else
                            {
                                return false;
                            }
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
            else    // kenta me 7 h 11 h 13 fylla
            {
                double tmp = TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID();
                int pass=0;
                for(int i=0;i<TICHU.getGraphicTichuGame().getChoosenCards().size();i++)
                {
                    if((tmp+i) == TICHU.getGraphicTichuGame().getChoosenCards().get(i).getID())
                    {
                        pass++;
                    }
                    else
                    {
                        return false;
                    }
                }
                if(pass == TICHU.getGraphicTichuGame().getChoosenCards().size())
                {
                    if((this.playedDeck.getTypeID() == TICHU.getGraphicTichuGame().getChoosenCards().size()) && (TICHU.getChoosenCards().get(0).getID() > this.playedDeck.getMinOfType()))
                    {    
                        this.playedDeck.setMinOfType(TICHU.getGraphicTichuGame().getChoosenCards().get(0).getID());
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }
    
    /**
     * Accessors
     * 
     * Method returns the PlayingPlayer of this round
     * 
     * @return Player PlayingPlayer
     */
    public Player getPlayingPlayer()
    {
        return this.PlayingPlayer;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the new PlayingPlayer with
     * the given Player newPlayer 
     * 
     * @param newPlayer the Player we want to assign to PlayingPlayer
     */
    public void setPlayingPlayer(Player newPlayer)
    {
        this.PlayingPlayer = newPlayer;
    }
    
     /**
     * Accessors
     * 
     * Method returns a value of how many
     * players are still playing
     * 
     * @return value of Playing players
     */
    public int getNumOfPlayers()
    {
        return this.PlayersNumber;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the value of PlayersNumber
     * with the given value of pi
     * 
     * @param pi the number of playing players
     */
    public void setNumOfPlayers(int pi)
    {
        this.PlayersNumber = pi;
    }
    
    /**
     * Transformer
     * 
     * Method which adds a new listener
     * 
     * @param Listener listener which is going to be added 
     */
    public void AddTichuListener(TICHUListener Listener)
    {
        Listeners.add(Listener);
    }
    
    /**
     * Accessors
     * Method which returns the the Listeners of tichuGame 
     * 
     * @return HashSet<TICHUListener> the Listeners of the TichuGame
     */
    public HashSet<TICHUListener> getTichuListeners()
    {
        return (HashSet<TICHUListener>) this.Listeners;
    }
    
     /**
     * Accessors
     * 
     * Method returns the PlayedDeck
     * 
     * @return PlayedDeck this.playedDeck
     */
    public PlayedDeck getPlayedDeck()
    {
        return this.playedDeck;
    }
    /**
     *
     */
    public void TEST()
    {
        System.out.println("\nTest is called\n");
        System.out.println("These are the players: ");
        System.out.println("\t\t\t" + this.players.getPlayer(1,0).namePlayer() + "has ");
        this.players.getPlayer(1,0).printHand();
        System.out.println("\t\t\t" + this.players.getPlayer(2,0).namePlayer() + "has ");
        this.players.getPlayer(2,0).printHand();
        System.out.println("\t\t\t" + this.players.getPlayer(1,1).namePlayer() + "has ");
        this.players.getPlayer(1,1).printHand();
        System.out.println("\t\t\t" + this.players.getPlayer(2,1).namePlayer() + "has ");
        this.players.getPlayer(2,1).printHand();
        
        
    }
}
