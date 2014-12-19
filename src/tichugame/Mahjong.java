/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;


/**
 *
 * @author AggelogTowerStation
 */
public class Mahjong extends Card{
    
    /**
     * <b>Constructor</b>: Construct a new Mahjong card with value id
     * 
     * @param id The number of card ( 1 for Mahjong card)
     */
    Mahjong(double id)
    {
        this.id = id;
    }
    
    /**
     * Accessors
     * 
     * @return a null String for Mahjong card
     */
    @Override
    public String getColor()
    {
        return null;
    }
    
}
