
package cap7;

import cap6.ExcepciónColecciónVacía;

/**
 * @author Silvia Guardati
 * Programa 7.7
 * Clase que implementa una cola genérica basándose en un arreglo.
 * Para un mejor aprovechamiento del espacio, el arreglo se maneja de manera circular.
 * Es decir, la siguiente casilla después de la última es la primera.
 */
public class ColaA <T> implements ColaADT <T>{
    private T cola[];
    private int frente, fin;
    private final int MAX = 10;

    /* Se construye un arreglo de Object y se lo convierte explícitamente a tipo T.
     * Inicialmente la cola está vacía, lo cual se indica con -1 en frente y fin.
     */
    public ColaA() {
        cola = (T[]) new Object[MAX];
        frente = -1;
        fin = -1;
    }
    
    /* Se construye un arreglo de objetos y se lo convierte explícitamente a tipo T.
     * El espacio máximo reservado queda determinado por el parámetro max.
     * Inicialmente la cola está vacía, lo que se indica con -1 en frente y fin.
     */
    public ColaA(int max) {
        cola = (T[]) new Object[max];
        frente = -1;
        fin = -1;
    }

    /* Agrega un dato al final de la cola, actualizando el puntero correspondiente. 
     * Si la cola estuviera vacía, debe también actualizar el frente. Si la cola está llena,
     * primero se crea un arreglo de mayor tamaño y luego se agrega el nuevo elemento.
     */
    public void agrega(T dato) {            
        if ((fin + 1) % cola.length  == frente) // Cola llena
                aumentaCapacidad();
        else
            if (estáVacía())
                frente = 0;
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;      
    }

    /* Método auxiliar que construye un arreglo de mayor tamaño y copia en él todos
     * los elementos de la cola, asignando al arreglo cola la referencia del nuevo
     * arreglo. Además, actualiza los punteros al frente y al final de la cola.
     */
    private void aumentaCapacidad(){
        T nuevo[] = (T[]) (new Object[cola.length * 2]);
        int j;
        
        j = 0;
        while (!estáVacía()){
            nuevo[j] = quita();
            j++;
        }
        cola = nuevo;
        frente = 0;
        fin = j - 1;
    }
    
    // Regresa true si la cola no tiene elementos almacenados.
    public boolean estáVacía() {
        return frente == -1;
    }

    /* Regresa el dato que está en el frente de la cola. Si la cola está vacía
     * lanza una excepción.
     */
    public T primero() {
        if (estáVacía())
            throw new ExcepciónColecciónVacía("Cola vacía");
        else
            return cola[frente];            
    }

    /* Elimina y regresa el elemento que está en el frente de la cola.
     * Si la cola está vacía, lanza una excepción.
     */
    public T quita() {       
        if (estáVacía())
            throw new ExcepciónColecciónVacía("Cola vacía");
        else {
            T resul = cola[frente];
            if (frente == fin){  // Tiene un único elemento.
                frente = -1;
                fin = -1;
            }
            else
                frente = (frente + 1) % cola.length;
            return resul;
        }      
    }
}

