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
public class ConcretCreator extends Creator 
{
    public void create(String typeCracker, Dictionary dictionary, String host, String ip)
    {
        cracker = new Cracker();
        cracker.setHost(host);
        cracker.setIP(ip);
        cracker.setDictionary(dictionary);
        
    }
   
}
