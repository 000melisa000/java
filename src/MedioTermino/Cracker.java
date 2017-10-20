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
public class Cracker extends SuperCracker 
{
     public void setHost(String host)
    {
        this.host= host;
        System.out.println(""+host);
    }
    public void setIP(String ip)
    {
        this.ip= ip;
        System.out.println(ip);
    }
    public  void setDictionary(Dictionary dictionary)
    {
        this.dictionary= dictionary;
        System.out.println(dictionary);
    }
    public  String crackPwd()
    {
        return "password";
    }

    
}

    
    
    

