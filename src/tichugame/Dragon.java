/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public class Dragon extends Card{
    
    /**
     * <b>Constructor</b>: 
     * Construct a new Dragon card with value id
     * 
     * @param id The number of card ( -2 for Dragon card)
     */
    Dragon(double id)
    {
        this.id = id;
    } 
    
    /**
     * Accessors
     * 
     * @return a null String for Dragon card
     */
    @Override
    public String getColor()
    {
        return null;
    }
}
