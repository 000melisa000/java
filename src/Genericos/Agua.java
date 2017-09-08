/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

/**
 *
 * @author dilan
 */
public class Agua extends Bebida implements Comparable{
    
    public int mililitros;
    public void tomar()
    {
    System.out.println("tomando agua");
    
    }
    public boolean equals(Object obj)
    {
        if(obj.getClass().isInstance(new Refresco()))
        {
           return (mililitros == ((Refresco)obj).mililitros); 
        }
        return (mililitros == ((Agua)obj).mililitros);
    }
    
    public int compareTo(Object o)
    {
        Agua temp = (Agua)o;
        
       if(mililitros < temp.mililitros)
       {
         return -1;  
         
       }
       
       if(mililitros > temp.mililitros)
       {
         return 1;  
       }
       return 0;
       }
}   


