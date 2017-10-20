/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioTermino;



/**
 *
 * @author dilan
 */
public abstract class Creator 
{
    public abstract void create(String typeCracker, Dictionary dictionary, String host, String ip);
    public SuperCracker factoryMethod(String typeCracker, Dictionary dictionary, String host, String ip)
    {
        create(typeCracker, dictionary, host, ip);
        return cracker;
    }

    protected SuperCracker cracker;
    
}
