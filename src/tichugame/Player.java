/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.ArrayList;

/**
 *
 * @author AggelogTowerStation
 */
public class Player{
    
    private String name;
    private int status;
    private int id;
    private boolean pressedTichu;
    private boolean pressedGrand;
    private ArrayList<Card> hand;
    private ArrayList<Card> baza;
    private int NumOfcards;
    
    /**
     * <b>Constructor</b>: Construct a new Player with name name
     * status state,ID id the number of Cards which player got in hand,
     * the hand and the baza of the Player.
     * 
     * @param name The name of the Player
     * @param state  The status of the player ( 1 if he is on table or 0 if not)
     * @param ID the id of the player ( 1 , 2 , 3 or 4)
     */
    Player(String name, int state, int ID)
    {
        this.name = name;
        this.status = state;
        this.id = ID;
        this.pressedGrand = false;
        this.pressedTichu = false;
        this.NumOfcards = 0;
        handCard();
        baza();
    }
    /**This method creates the structure of the hand 
     * of a player
     * 
     */
    private void handCard()
    {
        this.hand = new ArrayList<>(14);
    }
    /**This method creates a structure to save
     * the winning decks of a player
     */
    private void baza()
    {
        this.baza = new ArrayList<>(14);
    }
    
    /**
     * Accessors
     * 
     * Method returns the id value of the player
     * 
     * @return The id value of the player
     */
    public int getID()
    {
        return this.id;
    }
    
    /**
     * Accessors
     * 
     * Method returns the status value of the player
     * 
     * @return The status value of the player( 0 or 1 )
     */
    public int getStatus()
    {
        return this.status;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the status of a player
     * with the op ( 0 or 1 )
     * 
     * @param op the value we want to assign to status ( 0 or 1 )
     */
    public void setStatus(int op)
    {
        this.status = op;
    }
    
    /**
     * Accessors
     * 
     * Method returns the number of the cards which
     * player has in his hand
     * 
     * @return The number of the cards in players hand
     */
    public int getNumOfCardsInHand()
    {
        return this.NumOfcards;
    }
    
    /**
     * Accessors
     * 
     * Method returns the name of the player
     * 
     * @return The name of the player
     */
    public String namePlayer()
    {
        return this.name;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the pressedTichu with a boolean
     * value BOOL which indicates if the player has pressed the Tichu
     * button or not
     * 
     * @param BOOL the boolean value we want to 
     *  assign to pressedTichu (true or false)
     */
    public void setpressedTichu(boolean BOOL)
    {
        this.pressedTichu = BOOL;
    }
    
    /**
     * Accessors
     * 
     * Method returns a boolean value if a player has pressed
     * the Tichu button or not
     * 
     * @return true if player has pressed the Tichu button false if not
     */
    public boolean getpressedTichu()
    {
        return this.pressedTichu;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the pressedGrand with a boolean
     * value BOOL which indicates if the player has pressed the Grand
     * button or not
     * 
     * @param BOOL the boolean value we want to 
     *  assign to pressedGrand (true or false)
     */
    public void setpressedGrand(boolean BOOL)
    {
        this.pressedGrand = BOOL;
    }
    
    /**
     * Accessors
     * 
     * Method returns a boolean value if a player has pressed
     * Yes or No in the Grand question
     * 
     * @return true if player has pressed Yes in Grand question false if not
     */
    public boolean getpressedGrand()
    {
        return this.pressedGrand;
    }
    
    /**
     * Transformer
     * 
     * Method which removes a card from the ArrayList hand
     * and reduces the number of the cards
     * in the hand ArrayList
     * 
     * @param card the card we want to remove form the Hand
     */
    public void removeCard(Card card)
    {
        this.getHand().remove(card);
        this.NumOfcards--;
    }
    
    /**
     * Accessors
     * 
     * Method returns the ArrayList hand of the player
     * 
     * @return the ArrayList hand of the player
     */
    public ArrayList<Card> getHand()
    {
        return this.hand;
    }
    
    /**
     * Transformer
     * 
     * Method which inserts a Card card into the ArrayList
     * hand and increases the number of the cards contained in
     * hand ArrayList
     * 
     * @param e the Card we want to insert
     */
    public void receiveCard(Card e)
    {
        this.hand.add(e);
        this.NumOfcards++;
    }
    
    /**
     * Accessors
     * 
     * Method returns the ArrayList Baza of the player
     * 
     * @return the ArrayList Baza of the player
     */
    public ArrayList getBaza()
    {
        return this.baza;
    }
    
    /**
     * Transformer
     * 
     * Method which removes all cards from the ArrayList
     * of PlayedDeck and sends/inserts them to baza ArrayList
     * of the given Player by calling the method receiveBaza()
     * 
     * @param playedDeck ArrayList with the played cards
     * @param bazaReceiver the Player we want to give the cards from playedDeck
     */
    public void giveBaza(ArrayList playedDeck,Player bazaReceiver)
    {
        bazaReceiver.receiveBaza(playedDeck);
    }
    
    /**
     * Transformer
     * 
     * Method which removes all cards from the ArrayList
     * of PlayedDeck and sends/inserts them to baza ArrayList
     * 
     * @param playedDeck ArrayList with the played cards
     */
    public void receiveBaza(ArrayList playedDeck)
    {
        this.baza.addAll(playedDeck);
    }
    
    /**
      * Observer
      * 
      * Method which checks the status of a player and returns a boolean
      * value 
      * 
      * @return true if Players status in 1 or false if its 0
      */
    public boolean PlayerStatus()
    {   
        if(this.status == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     *
     */
    public void printHand()
    {
        int i = 0;
        System.out.println("Hand "+this.namePlayer());
        while(i < this.hand.size())
        {
            System.out.println("\t\t\t\t\t" + this.hand.get(i).getID());
            i++;
        }
    }
    
    /**
     *
     * @param Baza
     */
    public void printBaza(ArrayList Baza)
    {
        int i = 0;
        System.out.println("Baza "+this.namePlayer());
        while(i < this.baza.size())
        {
            System.out.println("\t\t\t\t\t" + this.baza.get(i).getID());
            i++;
        }
        System.out.println();
    }
}
