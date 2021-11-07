package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.3
 * Clase que define un arreglo genérico cuyos elementos están ordenados.
 * Se implementan las principales operaciones: búsqueda, inserción y eliminación.
 * AGO: Arreglo Genérico Ordenado
 */
public class AGO <T extends Comparable<T>> {
    private T colec[];
    private int total;
    private final int MAX = 10;

    /* Se instancia un arreglo de objetos que pueden ser comparados entre sí 
     * y se convierte explícitamente a tipo T.
     */
    public AGO() {
        colec = (T[]) new Comparable[MAX];
        total = 0;
    }

    // Se usa el parámetro para definir el tamaño máximo del arreglo
    public AGO(int máximo) {
        colec = (T[]) new Comparable[máximo];
        total = 0;
    }

    /* Recibe un arreglo ya creado y copia sus elementos al
     * atributo correspondiente. Posteriormente ordena los
     * elementos del arreglo.
     */
    public AGO(T[] arreglo, int total) { 
        colec = (T[]) new Comparable[arreglo.length];
        for (int i = 0 ; i < total; i++)
            colec[i] = arreglo[i];
        this.total = total;
        ordenaSelecciónDirecta();
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

    /* Búsqueda secuencial en un arreglo genérico ordenado.
     * aBuscar es el elemento a buscar
     * Regresa la posición en la que lo encuentra o el negativo de la posición más 1 en la 
     * que debería estar, en caso contrario.
     */
    public int buscaSecuencialOrdenado(T aBuscar){
        int i;

        i = 0; // Para buscar desde la posición 0.

        while (i < total && colec[i].compareTo(aBuscar) < 0)
            i++;  // Se avanza al siguiente elemento.
        if (i == total || colec[i].compareTo(aBuscar) > 0)
            i = -(i + 1);
        return i;
    }

    /* Inserta un dato en un arreglo ordenado, sin permitir elementos repetidos
     * aInsertar es el valor que quiere agregarse en el arreglo.
     * Regresa true si se pudo insertar (hay espacio y no se repite) y false en 
     * caso contrario.
     */
    public boolean insertaOrdenadoSinRepetidos(T aInsertar){
        boolean resp = false;
        if (total < colec.length){ // Hay espacio en el arreglo
            int pos = buscaSecuencialOrdenado(aInsertar);
            if (pos < 0){  // Si no está obtiene la posición en la que debe asignarlo.
                pos = -pos -1;
                desplazaHaciaDerecha(pos);
                colec[pos] = aInsertar;  
                total = total + 1; // El arreglo tiene un elemento más.
                resp = true;
            }
        }
        return resp;
    }

    /* Método que inserta un dato en un arreglo genérico ordenado, permitiendo 
     * elementos repetidos.
     * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio.
     * Regresa true si se puede insertar y false en caso contrario.
     */
    public boolean insertaOrdenadoConRepetidos(T aInsertar){
        boolean resp = false;
        if (total < colec.length){ // Hay espacio en el arreglo
            int pos = buscaSecuencialOrdenado(aInsertar);
            if (pos < 0)  // Si no está obtiene la posición en la que debe asignarlo.
                pos = -pos -1;
            desplazaHaciaDerecha(pos);
            colec[pos] = aInsertar;  
            total = total + 1; // El arreglo tiene un elemento más.
            resp = true;
        }
        return resp;
    }

    /* Método auxiliar que recorre todos los elementos del arreglo una posición a la
     * derecha, sin alterar el contenido de las casillas.
     */
    private  void desplazaHaciaDerecha(int pos){
        int i;
        for (i = total; i > pos; i--)
            colec[i] = colec[i-1];
    }
    
    /* Elimina un elemento de un arreglo genérico ordenado.
     * aEliminar es el dato que se quiere eliminar.
     * Regresa como resultado true si el dato pudo eliminarse y false en caso contrario.
     */
    public boolean eliminaOrdenado(T aEliminar){
        int pos;
        boolean resp = false;

        pos = buscaSecuencialOrdenado(aEliminar);
        if (pos >= 0){ // El dato está en el arreglo
            desplazaHaciaIzquierda(pos);
            colec[total-1] = null;
            total = total - 1; // Disminuye en 1 el total de elementos
            resp = true;
        }
        return resp;
    }

    /* Método auxiliar que recorre todos los elementos del arreglo una posición a la
     * izquierda, sin alterar el contenido de las casillas.
     */
    private void desplazaHaciaIzquierda(int pos){
        int i;
        for (i = pos; i < total - 1; i++)
            colec[i] = colec[i+1];
    }
    
    // Ordena aplicando el método de Selección Directa a un arreglo genérico.
    public void ordenaSelecciónDirecta(){
        int i, j, pos;
        T menor;

        for (i = 0; i < total - 1; i++){
            menor = colec[i]; // Toma al elemento de la posición i como el "menor"
            pos = i; //
            /* Al terminar el ciclo interno, la variable "menor" almacena al dato más pequeño
             * y la variable "pos" su posición.
             */
            for (j = i + 1; j < total; j++)
                if (colec[j].compareTo(menor) < 0){
                    menor = colec[j];
                    pos = j;
                }
            // Realiza el intercambio entre el menor y el dato que ocupa la posición i.
            colec[pos] = colec[i];
            colec[i] = menor;
        }
    }
    
    /* Búsqueda binaria. El arreglo debe estar ordenado.
     * aBuscar es el elemento a buscar en el arreglo.
     * Regresa la posición en la que lo encuentra o el negativo de la posición en la que
     * debería estar, más uno.
     */
    public int buscaBinaria(T aBuscar){
        int izq, der, cen;
        
        izq = 0;
        der = total - 1;
        cen = (izq + der) / 2;
        // Busca mientras haya espacio de búsqueda y mientras no lo encuentre.
        while (izq <= der && !colec[cen].equals(aBuscar)){
            if (colec[cen].compareTo(aBuscar) < 0)
                izq = cen + 1;  // Recorre el extremo izquierdo.
            else
                der = cen - 1;  // Recorre el extremo derecho.
            cen = (izq + der) / 2;
        }
        if (izq > der)  // aBuscar no está en el arreglo.
            cen = -(izq + 1);
        return cen;
    }
    
    // Regresa una cadena formada con el contenido del arreglo genérico.
    public String toString(){
        int i;
        StringBuilder cad = new StringBuilder();

        for (i = 0; i < total; i++)
            cad.append(colec[i] + " ");
        return cad.toString();
    }
}

