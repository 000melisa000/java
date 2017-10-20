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
public class Dictionary<T>
{
    public static Dictionary dictionary;
    String[] dic;
    int contador;
    Dictionary()
    {
        dic = new String[10];
        contador = 0;
    }
    public static Dictionary get()
    {
        if (dictionary == null)
        {
            dictionary = new Dictionary();
        }
        return dictionary;
    }
    
    public void addWord(String a)
    {
        if(contador < dic.length)
        {
            dic[contador]= a;
            contador = contador ++;
        }
    }

    Iterator getIterator()
    {
        return new Iterator<T>(this);
    }
    
    public int length()
    {
        return contador;
    }
    
    public static void main(String[] args) 
    {
        Dictionary d = Dictionary.get();
        System.out.println(d);
    }

    
}
