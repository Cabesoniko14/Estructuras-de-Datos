package cap8;

/**
 * @author Silvia Guardati
 * Programa 8.4
 * Retoma el programa 5.3 del capítulo 5 de este libro y le agrega un nuevo método
 * de ordenación: QuickSort.
 * Además, se reescriben algunos de sus métodos recursivamente.
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

    // Recibe un arreglo ya creado y lo asigna al atributo correspondiente
    public AGO(T[] colec, int total) {
        this.colec = colec;
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

    /* Búsqueda secuencial en un arreglo genérico ordenado. Implementación recursiva.
     * aBuscar es el elemento a buscar
     * Regresa la posición en la que lo encuentra o el negativo de la posición más 1 en la 
     * que debería estar, en caso contrario.
     */
    public int buscaSecuencialOrdenado(T aBuscar){
        return buscaSecuencialOrdenado(0, aBuscar);
    }
    
    // Sobrecarga del método para la implementación recursiva.
    private int buscaSecuencialOrdenado(int i, T aBuscar){
        if (i < total){
            if (colec[i].equals(aBuscar)) // Lo encontró
                return i;
            else
                if (colec[i].compareTo(aBuscar) < 0)
                    return buscaSecuencialOrdenado(i + 1, aBuscar);
            else
                    return -(i + 1);
        }
        else
            return -(i + 1); // No lo encontró
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
     * Implementación recursiva.
     */
    private void desplazaHaciaIzquierda(int i){
        if (i < total - 1){
            colec[i] = colec[i+1];
            desplazaHaciaIzquierda(i+1);
        }
    }
    
    /* Búsqueda binaria. El arreglo debe estar ordenado. Implementación recursiva.
     * aBuscar es el elemento a buscar en el arreglo.
     * Regresa la posición en la que lo encuentra o el negativo de la posición en la que
     * debería estar, más uno.
     */
    public int buscaBinaria(T aBuscar){
        return buscaBinaria(aBuscar, 0, total-1);
    }
    
    // Sobrecarga del método.
    private int buscaBinaria(T aBuscar, int izq, int der){
        if (izq <= der){
            int cen = (izq + der) / 2;
            if (colec[cen].equals(aBuscar)) // Lo encuentra
                return cen;
            else
                if (colec[cen].compareTo(aBuscar) < 0)
                    return buscaBinaria(aBuscar, cen+1, der);
                else
                    return buscaBinaria(aBuscar, izq, cen-1);
        }
        else
            return -(izq + 1); // No está, regresa la posición en la que debería estar 
    }
    
    /* Implementación recursiva del método toString().
     * Regresa una cadena formada con el contenido del arreglo genérico.
     */
    public String toString(){
        return toString(0);
    }
    
    // Sobrecarga del método
    private String toString(int i){
        if (i == total)
            return "";
        else
            return colec[i] + " " + toString(i + 1);
    }
    
    /* Ordena un arreglo genérico aplicando el método de Selección Directa.
     * Implementación recursiva.
     */
    public void ordenaSelecciónDirecta(){
        ordenaSelecciónDirecta(0, 1, 0);
    }
    
    // Sobrecarga del método.
    private void ordenaSelecciónDirecta(int i, int j, int posMenor){
        if (i < total - 1)
            if (j < total)
                if (colec[j].compareTo(colec[posMenor]) < 0)
                    ordenaSelecciónDirecta(i, j+1, j);
                else
                    ordenaSelecciónDirecta(i, j+1, posMenor);
            else{
                intercambia(i, posMenor);
                ordenaSelecciónDirecta(i+1, i+2, i+1);
            }
    }
      
    // Ordena aplicando el método Quicksort.
    public void ordenaQuickSort(){
        ordenaQuickSort(0, total - 1);
    }
    
    // Sobrecarga del método para usar la recursión.
    private void ordenaQuickSort(int inicio, int fin){
        int izq, der, pivote;
        boolean bandera;
        
        izq = inicio;
        der = fin;
        pivote = inicio;
        bandera = true;
        while (bandera){
            bandera = false;
            while (pivote != der && colec[pivote].compareTo(colec[der]) <= 0)
                der--;
            if (pivote != der){
                intercambia(pivote, der);
                pivote = der;
                while (pivote != izq && colec[pivote].compareTo(colec[izq]) >= 0)
                    izq++;
                if (pivote != izq){
                    bandera = true;
                    intercambia(pivote, izq);
                    pivote = izq;
                }
            }
        }
        if (pivote -1 > inicio)
                ordenaQuickSort(inicio, pivote - 1);
        if (pivote + 1 < fin)
            ordenaQuickSort(pivote + 1, fin);
    }
    
    /* Método auxiliar que se utiliza para intercambiar el contenido de dos casillas
     * del arreglo.
     */
    private void intercambia(int pos1, int pos2){
        T temporal = colec[pos1];
        colec[pos1] = colec[pos2];
        colec[pos2] = temporal;
    }
    
    
    // Se prueban los métodos recursivos incluídos en la clase AGO.
    public static void main(String[] args) {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        Double precios[] = {12.6, 8.3, -4.6, 23.78, 6.45, -2.36, 89.41};
        Integer edades[] = {23, 18, 9, 56, 34, 17, 48, 12, 28, 40};
        
        AGO arreMeses = new AGO(meses, meses.length);
        AGO arrePrecios = new AGO(precios, precios.length);
        AGO arreEdades = new AGO(edades, edades.length);
        
        // Prueba el método Quicksort y el método toString (versión recursiva)
        System.out.println("\nArreglo antes de ordenar: " + arreMeses);
        arreMeses.ordenaQuickSort();
        System.out.println("\nArreglo ordenado: " + arreMeses);
        
        // Prueba el método Quicksort y el método toString (versión recursiva)
        System.out.println("\nArreglo antes de ordenar: " + arrePrecios);
        arrePrecios.ordenaQuickSort();
        System.out.println("\nArreglo ordenado: " + arrePrecios);
             
        // Prueba el método de ordenación por Selección Directa y el método toString (versión recursiva)
        System.out.println("\nArreglo antes de ordenar: " + arreEdades);
        arreEdades.ordenaSelecciónDirecta();
        System.out.println("\nArreglo ordenado: " + arreEdades);
        
        // Prueba el método de búsqueda secuencial en arreglos ordenados (versión recursiva)
        System.out.println("\nLa posición de enero es (3): " + arreMeses.buscaSecuencialOrdenado("enero"));
        System.out.println("\nLa posición del 6.45 es (2): " + arrePrecios.buscaSecuencialOrdenado(6.45));
        System.out.println("\nLa posición del 48 es (8)  : " + arreEdades.buscaSecuencialOrdenado(48));
        
        // Prueba el método de búsqueda binaria en arreglos ordenados (versión recursiva)
        System.out.println("\nLa posición de enero es (3): " + arreMeses.buscaBinaria("enero"));
        System.out.println("\nLa posición del 6.45 es (2): " + arrePrecios.buscaBinaria(6.45));
        System.out.println("\nLa posición del 48 es (8)  : " + arreEdades.buscaBinaria(48));
    }
}

