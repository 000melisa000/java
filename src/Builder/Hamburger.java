/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author dilan
 */
public abstract class Hamburger
{
    protected Bread bread;
    protected Tomatoe tomatoe;
    protected Meat meat;
    protected Pineapple pineapple;
    
    public abstract void hambType();
    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setTomatoe(Tomatoe tomatoe) {
        this.tomatoe = tomatoe;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setPineapple(Pineapple pineapple) {
        this.pineapple = pineapple;
    }
    
}
