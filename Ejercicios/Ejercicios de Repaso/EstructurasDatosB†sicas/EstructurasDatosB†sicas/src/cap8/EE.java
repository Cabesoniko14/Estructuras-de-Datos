package cap8;

import java.util.Iterator;
import cap6.*;


/**
 * @author Silvia Guardati
 * Programa 8.2
 * Se retoma la clase EE, programa 6.3 y se escriben algunos de sus métodos recursivamente,
 * aprovechando la naturaleza recursiva de esta estructura de datos.
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

    // Agrega un dato al final de la estructura enlazada. Implementación recursiva.
    public void agregaFinal(T dato) {
        Nodo <T> nuevo = new Nodo <T> (dato);
        if (estáVacía())
            primero = nuevo;
        else{
            agregaFinal(primero, nuevo);
        }
    }
    
    /* Método sobrecargado. Recorre la estructura hasta el último nodo y, cuando llega 
     * a él, establece la liga con el nuevo nodo.
     */
    private void agregaFinal(Nodo<T> ap, Nodo<T> nuevo){
        if (ap.getSig() == null)
            ap.setSig(nuevo);
        else
            agregaFinal(ap.getSig(), nuevo);
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
            T eliminado = null;
            Nodo <T> auxiliar = primero;
            eliminado = primero.getDato();
            primero = primero.getSig();
            auxiliar.setSig(null);
            return eliminado;
        }
    }

    /* Se elimina el nodo que almacena el dato dado como parámetro y regresa true. 
     * Si el dato no está en la estructura regresa false. Si la estructura está vacía 
     * lanza una excepción. Implementación recursiva.
     */
    public boolean quita(T dato){
        if (estáVacía())
            throw new ExcepciónColecciónVacía("No hay elementos");
        else
            if (dato.equals(primero.getDato())){
                quitaPrimero();
                return true;
            }
            else return quita(primero, primero.getSig(), dato);
    }

    // Sobrecarga del método.
    private boolean quita(Nodo<T> anterior, Nodo<T> actual, T dato){
        if (actual != null)
            if (actual.getDato().equals(dato)){
                anterior.setSig(actual.getSig());
                actual.setSig(null);
                return true;
            }
            else
                return quita(actual, actual.getSig(), dato);
        else
            return false;                
    }
    
    /* Elimina el último nodo de la estructura y regresa el dato que almacena.
     * Si la estructura está vacía lanza una excepción.
     * Implementación recursiva.
     */
    public T quitaUltimo(){
        if (estáVacía())
            throw new ExcepciónColecciónVacía("No hay elementos");
        else
            return quitaUltimo(primero, primero);
    }
    
    // Sobrecarga del método.
    private T quitaUltimo(Nodo<T> anterior, Nodo<T> actual){
        if (actual.getSig() != null)
            return quitaUltimo(actual, actual.getSig());
        else{
            T dato = actual.getDato();
            if (primero == actual)
                primero = null;
            else 
                anterior.setSig(null);
            return dato;
            }            
    }
    
    // Busca el dato en la estructura enlazada. Implementación recursiva.
    public boolean busca(T dato){
        return busca(iterator(), dato);
    }
    
    // Sobrecarga del método. Regresa true si lo encuentra y false en caso contrario.
    private boolean busca(Iterator<T> it, T dato){
        if (!it.hasNext())
            return false;
        else{
            T elemento = it.next();
            if (elemento.equals(dato))              
                return true;
            else
                return busca(it, dato);            
        }            
    }
        
    /* Regresa el dato del nodo que ocupa la posición num dentro de la estructura
     * enlazada. Si la estructura está vacía o tiene un número de nodos menor a num
     * entonces regresa null. Implementación recursiva.
     */    
    public T getElemento(int num){
        return getElemento(iterator(), num, 1);
    }
    
    // Sobrecarga del método.
    private T getElemento(Iterator <T> it, int num, int cont){
        if (!it.hasNext())
            return null;
        else{
            T valor = it.next();
            if (num == cont)
                return valor;
            else
                return getElemento(it, num, cont + 1);
        }
    }
    
    /* Regresa en forma de cadena la información almacenada en los nodos.
     * Implementación recursiva.
     */
    public String toString(){
        Iterator <T> it = iterator();
        return toString(it);
    }
    
    // Sobrecarga del método. Utiliza un iterador para recorrer toda la estructura.
    private String toString(Iterator <T> it){
        if (it.hasNext())
            return it.next() + " " + toString(it);
        else
            return "";
    }
    
    public static void main(String[] args) {
        EE<String> meses = new EE(); // Se construye un objeto tipo EE de cadenas
        
        meses.agregaPrincipio("enero");
        meses.agregaFinal("febrero");
        meses.agregaFinal("marzo");
        meses.agregaFinal("abril");
        meses.agregaFinal("mayo");
        meses.agregaFinal("junio");
        
        // Se imprime el contenido de la estructura enlazada.
        System.out.println("\nPrimeros meses del año: " + meses);
        
        // Obtiene e imprime el cuarto mes.
        System.out.println("\nCuarto mes: " + meses.getElemento(4));
        
        // Busca el mes de febrero. En este caso debe imprimir que sí está.
        if (meses.busca("febrero"))
            System.out.println("\nEstá en la estructura");
        else
            System.out.println("\nNo está en la estructura");
        
        // Quita el mes de marzo. En este caso debe imprimir que sí se eliminó.
        if (meses.quita("marzo"))
            System.out.println("\nSí se eliminó marzo");
        else
            System.out.println("\nMarzo no está en la estructura");
        
        // Se imprime el contenido de la estructura enlazada luego de la eliminación.
        System.out.println("\nPrimeros meses del año sin marzo: " + meses);
        
        // Imprime el mes eliminado que es el que ocupaba el último nodo.
        System.out.println("\nMes eliminado -era el último de la estructura- " + meses.quitaUltimo());
        
        // Se imprime el contenido de la estructura enlazada luego de la eliminación.
        System.out.println("\nPrimeros meses del año sin junio: " + meses);
    }
}
