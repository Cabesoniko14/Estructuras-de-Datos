
package cap6;

/**
 * @author Silvia Guardati
 * Programa 6.1
 * Definición de la clase Nodo, la cual tiene dos atributos. Uno de ellos para 
 * almacenar un dato y el otro para almacenar la dirección de un objeto tipo Nodo.
 */
public class Nodo <T> {
    private T dato;
    private Nodo<T> sig;

    // Al construir un objeto tipo Nodo, éste no referencia a ningún otro nodo.
    public Nodo() {
        sig = null;
    }

    // Se construye un objeto, asignándole valor al dato.
    public Nodo(T dato) {
        this.dato = dato;
        sig = null;
    }

    // Regresa el dato almacenado.
    public T getDato() {
        return dato;
    }

    // Regresa la dirección del nodo a quien referencia.
    public Nodo<T> getSig() {
        return sig;
    }

    // Asigna un nuevo valor al dato.
    public void setDato(T dato) {
        this.dato = dato;
    }

    /* Asigna la dirección de un nodo, de tal manera que ahora el nodo que invoca
     * al método referencia a otro nodo.
     */
    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    // Regresa en forma de cadena el dato almacenado.
    public String toString() {
        return "Dato: " + dato;
    }
}

