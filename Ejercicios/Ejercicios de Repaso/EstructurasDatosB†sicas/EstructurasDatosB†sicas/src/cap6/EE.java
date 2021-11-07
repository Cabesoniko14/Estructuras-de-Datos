package cap6;

import java.util.Iterator;

/**
 * @author Silvia Guardati
 * Programa 6.3
 * Se define la clase EE (Estructura Enlazada). Tiene un único atributo que es la
 * dirección o referencia al primer nodo.
 */
public class EE <T > implements Iterable<T> {
    private Nodo <T> primero;

    // Se construye un objeto tipo EE, indicando que la estructura está vacía inicialmente.
    public EE () {
        primero = null;
    }

    // Regresa true si la estructura está vacía (no tiene ningún nodo).
    public boolean estáVacía() {
        return primero == null;
    }

    // Regresa un iterador sobre la estructura enlazada, partiendo del primer nodo.
    public Iterator<T> iterator() {
        return new IteradorEE<T> (primero);
    }

    // Agrega un dato al final de la estructura enlazada. 
    public void agregaFinal(T dato) {
        Nodo <T> nuevo = new Nodo <T> (dato);
        if (estáVacía())
            primero = nuevo;
        else{
            Nodo <T> auxiliar = primero;
            while (auxiliar.getSig() != null)
                auxiliar = auxiliar.getSig();
            auxiliar.setSig(nuevo);
        }
    }

    //Agrega un elemento al principio de la estructura enlazada.
    public void agregaPrincipio(T dato) {
        Nodo <T> nuevo = new Nodo <T> (dato);
        nuevo.setSig(primero);
        primero = nuevo;
    }
    
    /* Elimina el primer nodo de la estructura, regresando el dato que almacena.
     * Si la estructura está vacía lanza una excepción.
     */
    public T quitaPrimero() {
        if (estáVacía())
            throw new ExcepciónColecciónVacía("No hay elementos");
        else {
            T eliminado;
            Nodo <T> auxiliar = primero;
            eliminado = primero.getDato();
            primero = primero.getSig();
            auxiliar.setSig(null);
            return eliminado;
        }
    }

    /* Si el dato está en la estructura de datos, se elimina el nodo que almacena 
     * al dato y regresa true. En caso contrario, regresa false.
     * Si la estructura está vacía lanza una excepción.
     */
    public boolean quita(T dato){
        boolean resp = false;

        if (estáVacía())
            throw new ExcepciónColecciónVacía("No hay elementos");
        else
            if (dato.equals(primero.getDato()))
                quitaPrimero();
            else {
                Nodo<T> actual = primero;
                Nodo<T> anterior = primero;
                while (actual != null && !actual.getDato().equals(dato)){
                    anterior = actual;
                    actual = actual.getSig();
                }
                if (actual != null){ // El dato está en la estructura enlazada.
                    resp = true;
                    anterior.setSig(actual.getSig());
                    actual.setSig(null);
                }
            }
        return resp;
    }

    /* Elimina el último nodo de la estructura y regresa el dato que almacena.
     * Si la estructura está vacía lanza una excepción.
     */
    public T quitaUltimo(){
        if (estáVacía())
            throw new ExcepciónColecciónVacía("No hay elementos");
        else{
            Nodo <T> actual = primero;
            Nodo <T> anterior = primero;
            while (actual.getSig() != null){
                anterior = actual;
                actual = actual.getSig();
            }
            T dato = actual.getDato();
            if (primero == actual) // Hay un solo nodo 
                primero = null; // La estructura queda vacía
            else {
                anterior.setSig(null);
                actual = null;
            }
            return dato;
        }
    }
    
    /* Busca el dato en la estructura enlazada. Regresa true en caso de éxito y 
     * false si no lo encuentra.
     */
    public boolean busca(T dato){
        boolean resp = false;
        Nodo<T> auxiliar = primero;
        while (auxiliar != null && !auxiliar.getDato().equals(dato))
            auxiliar = auxiliar.getSig();
        if (auxiliar != null)
            resp = true;
        return resp;
    }
    
    /* Regresa el dato del nodo que ocupa la posición num dentro de la estructura
     * enlazada. Si la estuctura está vacía o tiene un número de nodos menor a num
     * entonces regresa null.
     */    
    public T getElemento(int num){
        Nodo <T> auxiliar = primero;
        int cont = 1;
        T elemento;
        
        while (auxiliar != null && cont < num){
            auxiliar = auxiliar.getSig();
            cont++;
        }
        if (cont < num || auxiliar == null)
            elemento = null;
        else 
            elemento = auxiliar.getDato();
        return elemento;
    }
    
    // Regresa en forma de cadena la información almacenada en los nodos.
    public String toString(){
        Iterator <T> it = iterator();
        StringBuilder cad = new StringBuilder();
        
        while (it.hasNext())
            cad.append(it.next() + " ");
        return cad.toString();
    }
}
