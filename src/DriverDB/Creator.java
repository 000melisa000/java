/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverDB;

/**
 *
 * @author dilan
 */
public abstract class Creator 
{
    public abstract void create(String TypeDriver);
    public  Driver  FactoryMethod(String TypeDriver){
       
        create(TypeDriver);
        return driver;
    }
    protected Driver driver;
}
