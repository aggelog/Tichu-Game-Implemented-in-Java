/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public class Simple extends Card{
    
    /**
     * <b>Constructor</b>: Construct a new Simple card with color c
     * and number id
     * 
     * @param id The number of card ( 1 - 14 for simple card)
     * @param c  The color of card ( black , blue , green , red)
     */
    Simple(double id,String c)
    {
        this.id=id;
        this.c=c;
    }
    
    
    /**
     * Accessors
     * 
     * @return a String which is the Color of a Simple Card
     */
    @Override
    public String getColor()
    {
        return this.c;
    }
    
}
