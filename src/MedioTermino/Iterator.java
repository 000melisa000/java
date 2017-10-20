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
public class Iterator<T>
{
    protected Dictionary<T> coll;
    int cont;
    public Iterator(Dictionary <T> coll)
    {
        this.coll = coll;
            cont = 0;
    }
    public boolean hasNext()
    {
        if (cont < coll.length())
        {
            return true;
        }
        return false;
    }
    public T next()
    {
        return coll.at(cont++);
    }
}
