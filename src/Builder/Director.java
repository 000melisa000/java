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
public class Director 
{
    protected Builder builder;
    public  Builder getBuilder(String tipo)
    {
       if(tipo == "hawaiana")
       {
           return new HawBuilder();
       }
       if(tipo == "Doble")
       {
           return new DobleBuilder();
       }
      
    return new DobleBuilder();
    
    public Hamburger orderHamburger(String tipo)
    {
        builder = getBuilder (tipo);
        builder.createHamburger();
        return builder.getHamburger();
    }
}

