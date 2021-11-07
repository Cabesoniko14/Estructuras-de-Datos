
package cap7;

/**
 * @author Silvia Guardati
 * Programa 7.12
 * Definición de la interface correspondiente a una estructura tipo Cola Doble.
 */
public interface ColaDobleADT <T>{
    public void agregaFrente(T dato); // Agrega un elemento al inicio de la cola.
    public void agregaFin(T dato); // Agrega un elemento al final de la cola.
    public T quitaFrente(); // Quita y regresa el elemento que está en el frente de la cola.
    public T quitaFin(); // Quita y regresa el elemento que está al final de la cola.
    public boolean estáVacía(); // Regresa true si no hay elementos
    public T primeroFrente(); // Regresa el elemento que está en el frente, sin quitarlo.
    public T primeroFin(); // Regresa el elemento que está al final, sin quitarlo.
}
