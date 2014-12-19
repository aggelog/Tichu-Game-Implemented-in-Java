/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public abstract class Card {
    
    /**
     * ID of a Card
     */
    protected double id;
    /**
     *Color of a Card
     */
    protected String c;
    
   /**
     * Accessors
     * Method returns the id value of a card
     * 
     * @return The id value of the card
     */
    public double getID()
    {
        return this.id;
    }
    
    /** 
     * Transformer
     * This Method sets the ID value of a card 
     * to be equal with p
     * 
     * @param p the value we want to give to the id
     */
    public void setID(double p)
    {
        this.id = p;
    }
    
    /**
     * Accessors
     * 
     * @return String the color of a card
     */
    public abstract String getColor();
    
}
