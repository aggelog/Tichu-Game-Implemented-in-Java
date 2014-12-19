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
public class PlayedDeck extends Piles {
    
    private ArrayList<Card> PlayedCards;
    private int numOfCards;
    private int typeID;
    private double minOftype;
    
    /**
     * <b>Constructor</b>: Construct an ArrayList for the Played cards pile
     * sets the number of the Cards in the ArrayList the type of the playedCards
     * and the minimum value of the played cards
     * 
     */
    PlayedDeck()
    {
        PlayedCards = new ArrayList<>(56);
        this.numOfCards=0;
        this.typeID = 0;
        this.minOftype = 0.0;
    }
    
    /**Observer
     * 
     * Method which check if the PlayedDeck ArrayList is Empty or not
     * and returns a boolean 
     * 
     * @return true if the ArrayList is empty false if not
     */
    @Override
    public boolean isEmpty()
    {
        if(PlayedCards.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Accessors
     * 
     * @return the ArrayList PlayedCards
     */
    public ArrayList<Card> getPlayedCards()
    {
        return this.PlayedCards;
    }
    
    /**
     * Transformer
     * 
     * Method which removes a card from the ArrayList
     * in a specific position p ,reduces the number of the cards
     * in the ArrayList and returns this card
     * 
     * @param o the position of the ArrayList
     * @return the deleted Card
     */
    @Override
    public Card removeCard(int o)
    {
        this.numOfCards--;
        return PlayedCards.remove(o);
    }
    
    /**
     * Transformer
     * 
     * Method which inserts a Card card into the ArrayList
     * and increases the number of the cards contained in
     * the ArrayList
     * 
     * @param card the Card we want to insert
     */
    public void putOnDeck(Card card)
    {
        PlayedCards.add(card);
        this.numOfCards++;
    }
    
    /**
     * Accessors
     * 
     * Method returns the id value of the type
     * of played cards
     * 
     * @return The id value of the played cards
     */
    public int getTypeID()
    {
        return this.typeID;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the id value of the type
     * of played cards
     * 
     * @param id the id value of played cards
     */
    public void setTypeID(int id)
    {
        this.typeID = id;
    }
    
    /**
     * Accessors
     * 
     * Method returns the id value of the minimum
     * id in played cards
     * 
     * @return The minimum id value of the played cards
     */
    public double getMinOfType()
    {
        return this.minOftype;
    }
    
    /**
     * Transformer
     * 
     * Method which sets the id value of the minimum
     * id in played cards
     * 
     * @param min the minimum id value
     */
    public void setMinOfType(double min)
    {
        this.minOftype = min;
    }
    
    /**
     * Transformer
     * 
     * Method which empties the ArrayList PlayedDeck
     * resets the number of Cards in the PlayedDeck
     * and resets the id type of the PlayedDeck
     * 
     */
    public void emptyPlayedDeck()
    {
        this.numOfCards = 0;
        this.typeID = 0;
        this.PlayedCards.clear();
    }
    
    /**
     * Transformer
     * 
     * Method which removes a card from the ArrayList
     * of PlayedDeck reduces the number of Cards in it
     * and returns the deleted card
     * 
     * @param card the card we want to remove from PlayedDeck
     * @return the removed card
     */
    public Card removeFromDeck(Card card)
    {
        Card removedCard= card;
        PlayedCards.remove(card);
        this.numOfCards--;
        return removedCard;
    }
    
   /**
     * Accessors
     * 
     * Method which returns the last Card in the
     * ArrayList of PlayedDeck
     * 
     * @return The last Card of the played cards
     */
    public Card getLastCardFromDeck()
    {
        return PlayedCards.get(numOfCards-1);
    }
}
