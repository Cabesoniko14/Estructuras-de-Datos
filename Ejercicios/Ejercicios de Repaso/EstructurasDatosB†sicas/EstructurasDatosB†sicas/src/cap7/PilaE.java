
package cap7;

import cap6.ExcepciónColecciónVacía;
import cap6.EE;

/**
 * @author Silvia Guardati
 * Programa 7.3
 * Clase que implementa una pila genérica usando una estructura enlazada.
 */
public class PilaE <T> implements PilaADT <T>{
    private EE <T> colec;

    // Se construye una estructura enlazada genérica.
    public PilaE() {
        colec = new EE();
    }

    // Agrega el dato en el tope de la pila. 
    public void push(T dato) {
        colec.agregaPrincipio(dato);
    }
    
    /* Elimina y regresa el elemento del tope de la pila.
     * Si la pila está vacía lanza una excepción.
     */
    public T pop() {
        if (colec.estáVacía())
            throw new ExcepciónColecciónVacía("Pila vacía");
        else
            return colec.quitaPrimero();
    }

    /* Regresa el dato almacenado en el tope de la pila (primer nodo de la EE).
     * Si la pila está vacía lanza una excepción.
     */
    public T peek() {
        if (colec.estáVacía())
            throw new ExcepciónColecciónVacía("Pila vacía");
        else
            return colec.getElemento(1);
    }
    
    // Regresa true si la pila está vacía.
    public boolean isEmpty() {
        return colec.estáVacía();
    }
}

