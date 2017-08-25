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
public class Product extends PadreProducto 
{
    void ConstruirParteUno()
    {
        System.out.print("estoy construyendo la parte uno");
    }
    void ConstruirParteDos()
    {
        System.out.print("estoy construyendo la parte dos");
    }
    
}
