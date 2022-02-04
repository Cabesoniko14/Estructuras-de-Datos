
package com.mycompany.ejercicio51;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public interface ListaADT <T> extends Iterable<T>{
    
    public Iterator<T> iterator();
    public boolean estaVacia();
    public T quitaPrimero();
    public T quitaUltimo();
    public String toString();
    public int calculaTamano();
    public T consultaPrimero();
    public T consultaUltimo();
    public boolean contiene(T dato);
    
    
    
}
