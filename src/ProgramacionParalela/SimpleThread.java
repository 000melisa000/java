/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionParalela;

/**
 *
 * @author dilan
 */
public class SimpleThread extends Thread 
{
    public void run()
    {
        System.out.println("soy un hilo");
    }
    public static void main(String[] args)
    {
        SimpleThread s = new SimpleThread();
        //s.setDaemon(true);
        s.start();
    }
          
    
}
