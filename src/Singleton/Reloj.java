/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author dilan
 */
public class Reloj{
    private static Reloj reloj;
    
    private Reloj()
    {
        
    }
    private static void getInstance()
    {
        if(reloj == null)
        {
            reloj = new Reloj();
        }
    }
    public String getHora()
    {
      java.util.Time hora = new Time();
      System.out.println (hora);
    }
    public String getFecha()
    {
       System.out.println( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
    }
     
    
}   

