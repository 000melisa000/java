/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author dilan
 */
public class TestReloj {
     public static void main (String[]args){
      Reloj instancia1 = Reloj.getInstance();
        instancia1.getHora();
    }
    
}
