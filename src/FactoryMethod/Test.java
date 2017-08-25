/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author dilan
 */
public class Test 
{
    public static void main(String[] args)
    {
        Creator c = new ConcretCreator();
        PadreProducto p = c.factoryMethod("Producto1");
        PadreProducto pro2 = c.factoryMethod("Producto2");
    }
    
}
