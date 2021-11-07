
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.1
 * Clase que define un arreglo genérico cuyos elementos están desordenados.
 * Se implementan las principales operaciones: búsqueda, inserción y eliminación.
 * AGD: Arreglo Genérico Desordenado.
 */
public class AGD <T> {
    private T colec[];
    private int total;
    private final int MAX = 10;

    /* Se instancia un arreglo de objetos y se lo convierte a tipo T.
     * Se utiliza la constante para definir el tamaño máximo del arreglo.
     */
    public AGD() { 
        colec = (T[]) new Object[MAX];
        total = 0;
    }
    
    /* Se instancia un arreglo de objetos y se lo convierte a tipo T.
     * Se utiliza el parámetro para definir el tamaño máximo del arreglo.
     */
    public AGD(int máximo) {
        colec = (T[]) new Object[máximo];
        total = 0;
    }
    
    // Recibe un arreglo ya creado y copia sus elementos al atributo correspondiente.
    public AGD(T[] arreglo, int total) { 
        colec = (T[]) new Object[arreglo.length];
        for (int i = 0 ; i < total; i++)
            colec[i] = arreglo[i];
        this.total = total;
    }
    
    // Regresa el arreglo genérico
    public T[] getColec() {
        return colec;
    }

    // Regresa el total de elementos del arreglo
    public int getTotal() {
        return total;
    }
    
    /* Regresa el valor almacenado en la casilla índice. Si el índice está fuera de
     * rango, entonces lanza una excepción.
     */
    public T getElemento(int índice){
        if (índice >= 0 && índice < total)
            return colec[índice];
        else
            throw new IndexOutOfBoundsException();
    }
    
    /* Búsqueda secuencial en un arreglo genérico desordenado.
     * Regresa la posición en la que está aBuscar o -1 si no lo encuentra.
     */
    public int buscaSecuencialDesordenado(T aBuscar){
        int i;

        i = 0; // Para buscar desde la posición 0.
        while (i < total && !colec[i].equals(aBuscar))
            i++;  // Se avanza al siguiente elemento.
        if (i == total)
            i = -1;
        return i;
    }

    /* Método que inserta un dato en un arreglo desordenado. 
     * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio.
     */
    public boolean insertaDesordenadoConRepetidos(T aInsertar){
        boolean resp = false;
        if (total < colec.length){ // Hay espacio en el arreglo
            colec[total] = aInsertar;  // total es la primera posición disponible.
            total = total + 1; // El arreglo tiene un elemento más.
            resp = true;
        }
        return resp; // Se pudo o no insertar el nuevo dato.
    }

    /* Método que inserta un dato en un arreglo desordenado. 
     * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio 
     * y si dicho valor no se encuentra en el arreglo.
     */
    public boolean insertaDesordenadoSinRepetidos(T aInsertar){
        boolean resp = false;
        if (total < colec.length) // Hay espacio en el arreglo
            if (buscaSecuencialDesordenado(aInsertar) == -1){ // No está en el arreglo
                colec[total] = aInsertar;  // total es la primera posición disponible.
                total = total + 1; // El arreglo tiene un elemento más.
                resp = true;
            }
        return resp; // Se pudo o no insertar el dato.
    }

    /* Método que elimina un elemento de un arreglo genérico desordenado.
     * aEliminar es el dato que se quiere eliminar.
     * Regresa como resultado true si pudo eliminar, false en caso contrario.
     */
    public boolean eliminaDesordenado(T aEliminar){
        int pos;
        boolean resp = false;

        pos = buscaSecuencialDesordenado(aEliminar);
        if (pos >= 0){ // El dato está en el arreglo
            colec[pos] = colec[total-1]; // Se reemplaza por el contenido de la última casilla
            colec[total-1] = null;
            total = total - 1; // Disminuye en 1 el total de elementos
            resp = true;
        }
        return resp; // Se pudo o no eliminar el dato.
    }
    
    /* Regresa una cadena con el contenido del arreglo.
     * Para que la información represente el objeto que almacena, se requiere que la
     * clase usada para parametrizar tenga el método toString() sobrescrito.
     */
    public String toString(){
        int i;
        StringBuilder cad = new StringBuilder();

        for (i = 0; i < total; i++)
            cad.append(colec[i] + " ");
        return cad.toString();
    }
}
