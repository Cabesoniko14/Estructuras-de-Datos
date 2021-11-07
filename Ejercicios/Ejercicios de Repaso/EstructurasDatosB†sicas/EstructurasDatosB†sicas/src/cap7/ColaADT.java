package cap7;

/**
 * @author Silvia Guardati
 * Programa 7.6
 * Se define el comportamiento esperado en una estructura de datos tipo Cola.
 */
public interface ColaADT <T> {
    public void agrega(T dato); // Agrega un elemento al final de la cola.
    public T quita(); // Quita y regresa el elemento que está en el frente de la cola.
    public boolean estáVacía(); // Regresa true si no hay elementos
    public T primero(); // Regresa el elemento que está en el frente, sin quitarlo.
}
