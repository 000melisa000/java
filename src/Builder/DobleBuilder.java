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
public class DobleBuilder extends Builder
{

    
    public Hamburger BuildHamburger() 
    {
        return new DoubleHamburger();
    }

    @Override
    public void BuildBread() 
    {
        hamburger.setBread(new Bread());
    }

    @Override
    public void BuildTomatoe() 
    {
        hamburger.setTomatoe(new Tomatoe());
    }

    @Override
    public void BuildMeat() 
    {
        hamburger.setMeat(new Meat());
        
    }

    @Override
    public void BuildPineapple() 
    {
        System.out.println("no tiene piña");
        
    }
    
}
