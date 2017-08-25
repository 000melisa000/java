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
public class Concrete extends Creator
{
    public void create(String TypeDriver) {
        if(TypeDriver.compareTo("MongoDB")== 0){
            driver = new DriverDBMango();
            ((DriverDBMango)driver).AbrirConexion();
           ((DriverDBMango)driver).EstablecerPropiedades();
            ((DriverDBMango)driver).EstablecerPropiedades();
        }
    }
}
