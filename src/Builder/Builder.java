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
public abstract class Builder 
{
    protected Hamburger hamburger;
    public abstract Hamburger BuildHamburger();
    public abstract void BuildBread(); 
    public abstract void BuildTomatoe();
    public abstract void BuildMeat();
    public abstract void BuildPineapple();
    
    public Hamburger getHamburger()
    {
        return hamburger;
    }
    public void createHamburger()
    {
        hamburger = BuildHamburger();
        BuildBread();
        BuildTomatoe();
        BuildMeat();
        BuildPineapple();
        
    }
    
}
