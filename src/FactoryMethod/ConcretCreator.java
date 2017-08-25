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
public class ConcretCreator extends Creator
{
    @Override
    public void create(String typeProduct) 
    {
        if (typeProduct.compareTo("Producto1")== 0)
        { 
             product = new Product();
            ((Product)product).ConstruirParteUno();
            ((Product)product).ConstruirParteDos();
        }
        if (typeProduct.compareTo("Producto2")== 0)
        { 
            product = new Producto2();
            ((Producto2)product).complex1();
            ((Producto2)product).complex2();
        }
    }
    
    
}
