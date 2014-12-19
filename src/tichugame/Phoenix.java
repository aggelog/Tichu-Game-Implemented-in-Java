/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

/**
 *
 * @author AggelogTowerStation
 */
public class Phoenix extends Card {
    
    /**
     * <b>Constructor</b>: Construct a new Phoenix card with value id
     * and color 
     * 
     * @param id The number of card ( 0 for Phoenix card)
     * @param gr The color of card ( grey for Phoenix card)
     */ 
    Phoenix(double id,String gr)
    {
        this.id = id;
        this.c = gr;
    }
    
    /**
     * Accessors
     * 
     * @return the Color of Phoenix Card
     */
    @Override
    public String getColor()
    {
        return this.c;
    }
    
}
