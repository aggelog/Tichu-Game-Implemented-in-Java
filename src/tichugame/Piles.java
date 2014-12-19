/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public abstract class Piles {
    
    /**Observer
     * 
     * Method which check if a Pile is Empty or not
     * and returns a boolean 
     * 
     * @return true if the Pile is empty false if not
     */
    public abstract boolean isEmpty();
    
    /**
     * Transformer
     * 
     * Method which removes a card from the ArrayList
     * in a specific position p and returns this card
     * 
     * @param p the position of the ArrayList
     * @return the deleted Card
     */
    public abstract Card removeCard(int p);
}
