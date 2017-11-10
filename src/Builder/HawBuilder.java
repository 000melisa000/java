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
public class HawBuilder extends Builder 
{
    public Hamburger BuildHamburger() 
    {
        return new Hawaii() {
            @Override
            public void hambType() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }

    
    public void BuildBread() 
    {
        Bread b = new Bread();
        hamburger.setBread(b);
        
    }

 
    public void BuildTomatoe(){ 
       hamburger.setTomatoe(new Tomatoe());
    }

    
    public void BuildMeat() 

    {
        hamburger.setMeat(new Meat());
    }

    
    public void BuildPineapple() 
    {
       hamburger.setPineapple(new Pineapple());
    }

   
}
