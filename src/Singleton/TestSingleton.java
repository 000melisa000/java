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
public class TestSingleton {
    public static void main(String[]args)
    {
        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();
        Singleton instancia3 = Singleton.getInstance();
        System.out.println("dir inst1:" + instancia1);
        System.out.println("dir inst2:" + instancia2);
        System.out.println("dir inst3:" + instancia3);
    }
    
}
