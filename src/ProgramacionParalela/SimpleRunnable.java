/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionParalela;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class SimpleRunnable implements Runnable 
{
    Thread t;
    @Override
    public void run() 
    {
        System.out.println("Nombre del hilo" + t.getName());
        System.out.println("el hilo"+ t.getName() + "tiene prioridad" + t.getPriority());
        System.out.println("el hilo" + t.getName() + "esta esperando");
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("el hilo" + t.getName()+ "termino");
        
    }
    public SimpleRunnable(String name) 
    {
        t = new Thread (this,name);
        t.start();
    }
    public static void main(String[] args)
    {
        SimpleRunnable a = new SimpleRunnable("uno");
        SimpleRunnable b = new SimpleRunnable("dos");
        SimpleRunnable c = new SimpleRunnable("tres");
        SimpleRunnable d = new SimpleRunnable("cuatro");
        SimpleRunnable e = new SimpleRunnable("cinco");
        System.out.println("hola");
    }
}

