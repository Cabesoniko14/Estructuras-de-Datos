package cap7;

import cap6.ExcepciónColecciónVacía;
import cap6.EE;

/*
 * @author Silvia Guardati
 * Programa 7.8
 * Implementación de la estructura Cola por medio de una estructura enlazada.
 */
public class ColaE <T> implements ColaADT <T>{
    private EE <T> cola;

    // Se construye un objeto tipo estructura enlazada (EE).
    public ColaE() {
        cola = new EE();
    }

    // Se agrega el dato al final de la cola.
    public void agrega(T dato) {
        cola.agregaFinal(dato);
    }

    // Regresa true si la cola está vacía.
    public boolean estáVacía() {
        return cola.estáVacía();
    }

    /* Regresa el dato que está en el frente de la cola.
     * Si la cola está vacía lanza una excepción.
     */
    public T primero() {
        if (estáVacía())
            throw new ExcepciónColecciónVacía("Cola vacía");
        else
            return cola.getElemento(1);
    }

    /* Elimina y regresa el dato que está en el frente de la cola.
     * Si la cola está vacía lanza una excepción.
     */
    public T quita() {
        if (estáVacía())
            throw new ExcepciónColecciónVacía("Cola vacía");
        else
            return cola.quitaPrimero();
    }
}
