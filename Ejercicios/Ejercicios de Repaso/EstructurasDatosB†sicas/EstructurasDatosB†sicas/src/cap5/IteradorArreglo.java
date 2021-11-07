
package cap5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Silvia Guardati
 * Programa 5.8
 * Esta clase permite recorrer un arreglo, elemento por elemento sin necesidad de
 * conocer la estructura interna del mismo.
 */
public class IteradorArreglo <T> implements Iterator<T>{
    private T colec[];
    private int actual;
    private int totalElem;

    /* Se construye un iterador sobre la colección dada como parámetro.
     * actual toma el valor de 0, así se empieza a iterar desde el primer 
     * elemento de la colección.
     */
    public IteradorArreglo(T[] colec, int totalElem) {
        this.colec = colec;
        this.actual = 0;
        this.totalElem = totalElem;
    }

    // Regresa true si la colección tiene al menos un elemento más.
    public boolean hasNext() {
        return actual < totalElem;
    }

    // Regresa el elemento de la colección apuntado por actual y  avanza el iterador.
    public T next() {
        if (hasNext())
            return colec[actual++];
        else
           throw new  NoSuchElementException();   
    }

    /* Es una operación opcional. En caso de ser codificada debe regresar el último
     * valor dado por el iterador.
     */
    public void remove() {
        throw new UnsupportedOperationException("Operación no implementada");
    }
}
