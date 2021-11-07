package cap6;

import java.util.*;

/**
 * @author Silvia Guardati
 * Programa 6.2
 * Se define un iterador para estructuras enlazadas (EE), por lo tanto se implementan
 * los métodos hasNext() y next() de acuerdo a esta estructura de datos.
 */

public class IteradorEE<T> implements Iterator <T> {
    private Nodo <T> actual;

    /* Al construirse un objeto tipo IteradorEE se posiciona sobre un nodo, mismo
     * que será el primero de la estructura enlazada.
     */
    public IteradorEE(Nodo <T> actual) {
        this.actual = actual;
    }
    
    // Regresa true si existe un elemento.
    public boolean hasNext() {
        return actual != null;
    }

    /* Regresa el objeto apuntado por el iterador y se desplaza una posición.
     * En caso de no existir dicho elemento, se lanza una excepción.
     */
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        else {
            T resul = actual.getDato();
            actual = actual.getSig();
            return resul;
        }
    }
    
    /* Elimina el último elemento devuelto por el iterador.
     * Es una operación opcional que no se implementa.
     */
    public void remove() {
        throw new UnsupportedOperationException("No está implementada.");
    }
}

