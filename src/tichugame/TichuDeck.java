/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author AggelogTowerStation
 */
public class TichuDeck extends Piles {
    
    private ArrayList<Card> cards;
    /**
     * <b>Constructor</b>: Construct an ArrayList for the Tichu Deck cards.
     * calls the method loadTichuDeck() which creates and insert all the 
     * cards into the Deck and final calls the method shuffle() to shuffle
     * the ArrayList Tichu Deck.
     */
    TichuDeck()
    {
        cards = new ArrayList<>(56);
        loadTichuDeck();
        shuffle();
    }
    
    /**
     * Transformer
     * 
     * Method which shuffle all the cards in the
     * ArrayList cards
     * 
     */
    private void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    /**This method fills up the TichuDeck pile with all cards
     * which are created here
     * 
     */
    private void loadTichuDeck()
    {
        for(int i=2; i <15; i++ )
        {
            this.cards.add(new Simple(i,"RED"));
            this.cards.add(new Simple(i,"BLUE"));
            this.cards.add(new Simple(i,"GREEN"));
            this.cards.add(new Simple(i,"BLACK"));
        }
        
        this.cards.add(new Dragon(-2));
        this.cards.add(new Hound(-3));
        this.cards.add(new Phoenix(0,"grey"));
        this.cards.add(new Mahjong(1));
        
    }
    
    /**Observer
     * 
     * Method which check if the TichuDeck ArrayList is Empty or not
     * and returns a boolean 
     * 
     * @return true if the ArrayList is empty false if not
     */
    @Override
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }
    
    /**
     * Transformer
     * 
     * Method which removes a card from the ArrayList
     * in a specific given position o
     * 
     * @param o the position of the ArrayList
     * @return the deleted Card
     */
    @Override
    public Card removeCard(int o)
    {
        return cards.remove(o);
    }
}
