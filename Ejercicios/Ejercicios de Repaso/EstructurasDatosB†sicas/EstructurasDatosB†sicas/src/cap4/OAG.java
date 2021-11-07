
package cap4;

/**
 * @Silvia Guardati
 * Programa 4.3
 * Esta clase agrupa los principales métodos para arreglos genéricos.
 * OAG: Operaciones para Arreglos Genéricos.
 */
public class OAG {

 /* Método que implementa el algoritmo de búsqueda secuencial en un arreglo genérico
  * desordenado. Regresa la posición en la que está aBuscar o -1 si no lo encuentra.
  */
  public static <T> int buscaSecuencialDesordenado(T arre[], int n, T aBuscar){
        int i, resp;

        i = 0; // Para buscar desde la posición 0.
        resp = -1;
        /* Se busca mientras haya elementos para comparar y mientras el elemento 
         * visitado sea distinto del elemento buscado.
         */
        while (i < n && !arre[i].equals(aBuscar)) // Se compara con el equals()
            i++;  // Se avanza al siguiente elemento.

        /* Si esta condición es verdadera, entonces es la segunda condición del 
         * while la que no se cumple, por lo tanto el elemento que está en la 
         * posición es igual al elemento buscado. Se guarda la posición i en la 
         * variable resp.
         */
        if (i < n)
            resp = i;
        return resp;
    }

/* Método que implementa el algoritmo de búsqueda secuencial en un arreglo 
 * genérico ordenado.
 * Regresa la posición en la que lo encuentra o el negativo de la posición en la 
 * que debería estar más 1, en caso contrario.
 */
 public static <T extends Comparable<T>> int buscaSecuencialOrdenado(T arre[], int n, T aBuscar){
     int i, resp;

     i = 0; // Para buscar desde la posición 0.
     resp = -1;
     /* Se busca mientras haya elementos para comparar y mientras el elemento visitado
      * sea menor -el arreglo está ordenado crecientemente- que el elemento buscado.
      */
     while (i < n && arre[i].compareTo(aBuscar) < 0)
         i++;  // Se avanza al siguiente elemento.

     /* Si no se llegó al límite del arreglo y se encontró el elemento buscado, se 
      * asigna su posición como resultado. En caso contrario, el resultado es la 
      * posición en la que "debería" estar, sin alterar el orden existente.
      */
    if (i < n && arre[i].equals(aBuscar))
        resp = i;
    else
        resp = -(i + 1);
    return resp;
 }

/* Método que inserta un dato en la primera casilla disponible de un arreglo genérico 
 * desordenado, permitiendo repetir datos.
 */
 public static <T> int insertaDesordenadoConRepetidos(T arre[], int n, T aInsertar){
     if (n < arre.length){ // Hay espacio en el arreglo
         arre[n] = aInsertar;  // n es la primera posición disponible.
         n = n + 1; // El arreglo tiene un elemento más.
     }
    return n; // El resultado es el nuevo tamaño.
 }

/* Método que inserta un dato en la primera casilla disponible de un arreglo genérico 
 * desordenado, sin permitir repeticiones.
 */
 public static <T> int insertaDesordenadoSinRepetidos(T arre[], int n, T aInsertar){
     if (n < arre.length) // Hay espacio en el arreglo
         if (buscaSecuencialDesordenado(arre, n, aInsertar) == -1){ // No está en el arreglo
             arre[n] = aInsertar;  // n es la primera posición disponible.
             n = n + 1; // El arreglo tiene un elemento más.
         }
     return n; // El resultado es el nuevo tamaño.
 }

/* Método auxiliar que desplaza todos los elementos del arreglo una posición a la
 * derecha, sin alterar el contenido de las casillas.
 */
 public static <T> void desplazaHaciaDerecha (T arre[], int n, int pos){
     int i;
     for (i = n; i > pos; i--)
         arre[i] = arre[i-1];
 }

 /* Método que inserta un dato en un arreglo genérico ordenado, permitiendo repetir
  * datos.
  */
  public static <T extends Comparable<T>> int insertaOrdenadoConRepetidos(T arre[], int n, T aInsertar){
      if (n < arre.length){ // Hay espacio en el arreglo
          int pos = buscaSecuencialOrdenado(arre, n, aInsertar);
          if (pos < 0)  // Si no está obtiene la posición en la que debe asignarlo.
              pos = -pos -1;
          desplazaHaciaDerecha (arre, n, pos);
          arre[pos] = aInsertar;
          n = n + 1; // El arreglo tiene un elemento más.
      }
      return n; // El resultado es el nuevo tamaño.
  }

// Método que inserta un dato en un arreglo genérico ordenado, sin permitir repeticiones.
 public static <T extends Comparable<T>> int insertaOrdenadoSinRepetidos(T arre[], int n, T aInsertar){
     if (n < arre.length){ // Hay espacio en el arreglo
         int pos = buscaSecuencialOrdenado(arre, n, aInsertar);
         if (pos < 0){  // Si no está obtiene la posición en la que debe asignarlo.
             pos = -pos -1;
             desplazaHaciaDerecha (arre, n, pos);
             arre[pos] = aInsertar;
             n = n + 1; // El arreglo tiene un elemento más.
        }
     }
     return n; // El resultado es el nuevo tamaño.
    }

// Método que elimina un elemento de un arreglo genérico desordenado.
 public static <T> int eliminaDesordenado(T arre[], int n, T aEliminar){
     int pos;

     pos = buscaSecuencialDesordenado(arre, n, aEliminar);
     if (pos >= 0){ // El dato está en el arreglo
         arre[pos] = arre[n-1]; // Se reemplaza por el contenido de la última casilla
         arre[n-1] = null;
         n = n - 1; // Disminuye en 1 el total de elementos
     }
     return n;
 }

/* Método auxiliar que desplaza todos los elementos del arreglo una posición a la
 * izquierda, sin alterar el contenido de las casillas.
 */
public static <T> void desplazaHaciaIzquierda (T arre[], int n, int pos){
    int i;
    for (i = pos; i < n - 1; i++)
        arre[i] = arre[i+1];
}

// Método que elimina un elemento de un arreglo genérico ordenado.
 public static <T extends Comparable <T>> int eliminaOrdenado(T arre[], int n, T aEliminar){
     int pos;

     pos = buscaSecuencialOrdenado(arre, n, aEliminar);
     if (pos >= 0){ // El dato está en el arreglo
         desplazaHaciaIzquierda(arre, n, pos);
         arre[n-1] = null; // Se pierde la referencia al objeto de esta posición
         n = n - 1; // Disminuye en 1 el total de elementos
     }
     return n;
 }

/* Método que regresa una cadena formada con el contenido del arreglo que recibe
 * como parámetro. Requiere que los tipos con los cuales se de valor a T tengan un
 * toString(). Es muy útil para conocer el contenido del arreglo.
 */
 public static <T> String imprime(T arre[], int n){
        int i;
        StringBuilder cad = new StringBuilder();

        for (i = 0; i < n; i++)
            cad.append(arre[i] + " ");
        return cad.toString();
    }
}

