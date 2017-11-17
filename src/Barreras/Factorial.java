/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barreras;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class Factorial extends Thread 
{
    int num;
    CyclicBarrier barrera;
    int resultado;
    public int getResultado() 
    {
        return resultado;
    }
    public Factorial (int num, CyclicBarrier barrera)
    {
        this.num = num;
        this.barrera = barrera;
    }
    @Override
    public void run() 
    {
        try 
        {
            System.out.println("calculando el factorial de" + num);
            resultado = factorial(num);
            barrera.await();
            System.out.println("termine la operacion");
        } catch (InterruptedException ex) {
            
        } catch (BrokenBarrierException ex) {
           
        }
    }
    int factorial (int n)
    {
        int accum = 1;
        for (int i = n; i > 0; i--)
        {
            accum *= i;
        }return accum;
    }
}
