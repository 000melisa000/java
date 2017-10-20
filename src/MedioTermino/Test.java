/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;

/**
 *
 * @author dilan
 */
public class Test 
{
    public static void main(String[] args) 
     {
        Creator c = new ConcretCreator();
        SuperCracker s = c.factoryMethod("Cracker", new Dictionary(),"localhost", "255.255.255.255");
        System.out.println(s);
    }
    
    
}
