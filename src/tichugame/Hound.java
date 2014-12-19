/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public class Hound extends Card {
    
    /**
     * <b>Constructor</b>: Construct a new Hound card with value id
     * 
     * @param id The number of card ( -3 for Hound card)
     */
    Hound(int id)
    {
        this.id = id;
    }
    
    /**
     * Accessors
     * 
     * @return a null String for Hound card
     */
    @Override
    public String getColor()
    {
        return null;
    }
}
