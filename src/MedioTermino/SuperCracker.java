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
public abstract class SuperCracker 
{
    protected String host;
    protected String ip;
    protected Dictionary dictionary;
    
    public abstract void setHost(String host);
    public abstract void setIP(String ip);
    public abstract void setDictionary(Dictionary dictionary);
    public abstract String crackPwd();
    
    
}
