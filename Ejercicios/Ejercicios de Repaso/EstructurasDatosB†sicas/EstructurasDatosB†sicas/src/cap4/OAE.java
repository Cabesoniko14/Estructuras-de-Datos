
package cap4;

/**
 * @Silvia Guardati
 * Programa 4.1
 * Definición de una clase que concentra todos los métodos estudiados para el manejo 
 * de arreglos. En este caso es para arreglos de enteros.
 * OAE: Operaciones para Arreglos de Enteros.
 */
public class OAE {

/* Método que implementa el algoritmo de búsqueda secuencial en arreglo desordenado.
  * arre[] es el arreglo en el cual se busca
  * n es el total de elementos almacenados en el arreglo
  * aBuscar es el elemento a buscar
  * Regresa la posición en la que está aBuscar o -1 si no lo encuentra.
  */
    public static int buscaSecuencialDesordenado(int arre[], int n, int aBuscar){
        int i, resp;

        i = 0; // Para buscar desde la posición 0.
        resp = -1;
        /* Se busca mientras haya elementos para comparar y mientras el elemento
         * visitado sea distinto del elemento buscado.
         */
        while (i < n && arre[i] != aBuscar)
            i++;  // Se avanza al siguiente elemento.

        /* Si esta condición es verdadera, entonces es la segunda condición del 
         * while la que no se cumple, por lo tanto el elemento que está en la 
         * posición i es igual al elemento buscado. Se guarda la posición en la 
         * variable resp.
         */
        if (i < n)
            resp = i;
        return resp;
    }

/* Método que implementa el algoritmo de búsqueda secuencial en un arreglo ordenado crecientemente.
 * arre[] es el arreglo en el cual se busca
 * n es el total de elementos almacenados en el arreglo
 * aBuscar es el elemento a buscar
 * Regresa la posición en la que lo encuentra o el negativo de la posición en la 
 * que debería estar más 1, en caso contrario.
 */
 public static int buscaSecuencialOrdenado(int arre[], int n, int aBuscar){
     int i, resp;

     i = 0; // Para buscar desde la posición 0.
     /* Se busca mientras haya elementos para comparar y mientras el elemento 
      * visitado sea menor -el arreglo está ordenado crecientemente- que el 
      * elemento buscado.
      */
     while (i < n && arre[i] < aBuscar)
         i++;  // Se avanza al siguiente elemento.

     /* Si no se llegó al límite del arreglo y se encontró el elemento buscado, 
      * se asigna su posición como resultado. En caso contrario, el resultado es 
      * la posición en la que "debería" estar, sin alterar el orden existente.
      */
    if (i < n && arre[i] == aBuscar)
        resp = i;
    else
        resp = -(i + 1);
    return resp;
 }

/* Método que inserta un dato en la primera casilla disponible de un arreglo 
 * desordenado.
 * n representa la cantidad de elementos almacenados en el arreglo.
 * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio.
 */
 public static int insertaDesordenadoConRepetidos(int arre[], int n, int aInsertar){
     if (n < arre.length){ // Hay espacio en el arreglo
         arre[n] = aInsertar;  // n es la primera posición disponible.
         n = n + 1; // El arreglo tiene un elemento más.
     }
    return n; // El resultado es el nuevo tamaño.
 }

/* Método que inserta un dato en la primera casilla disponible de un arreglo desordenado
 * n representa la cantidad de elementos almacenados en el arreglo.
 * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio y si dicho
 * valor no se encuentra en el arreglo.
 */
 public static int insertaDesordenadoSinRepetidos(int arre[], int n, int aInsertar){
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
 public static void desplazaHaciaDerecha (int arre[], int n, int pos){
     int i;
     for (i = n; i > pos; i--)
         arre[i] = arre[i-1];
 }

 /* Método que inserta un dato en un arreglo ordenado
  * n representa la cantidad de elementos almacenados en el arreglo.
  * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio.
  */
  public static int insertaOrdenadoConRepetidos(int arre[], int n, int aInsertar){
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

/* Método que inserta un dato en un arreglo ordenado
 * n representa la cantidad de elementos almacenados en el arreglo.
 * aInsertar es el valor que quiere agregarse en el arreglo, si hay espacio y si dicho
 * valor no se encuentra en el arreglo.
 */
 public static int insertaOrdenadoSinRepetidos(int arre[], int n, int aInsertar){
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

/* Método que elimina un elemento de un arreglo desordenado.
 * arre es el arreglo del cual se quitará un elemento.
 * n es el total de elementos.
 * aEliminar es el dato que se quiere eliminar.
 * Regresa como resultado el total de elementos modificado (o no).
 */
 public static int eliminaDesordenado(int arre[], int n, int aEliminar){
     int pos;

     pos = buscaSecuencialDesordenado(arre, n, aEliminar);
     if (pos >= 0){ // El dato está en el arreglo
         arre[pos] = arre[n-1]; // Se reemplaza por el contenido de la última casilla
         n = n - 1; // Disminuye en 1 el total de elementos
     }
     return n;
 }

/* Método auxiliar que desplaza todos los elementos del arreglo una posición a la
 * izquierda, sin alterar el contenido de las casillas.
 */
public static void desplazaHaciaIzquierda (int arre[], int n, int pos){
    int i;
    for (i = pos; i < n - 1; i++)
        arre[i] = arre[i+1];
}

/* Método que elimina un elemento de un arreglo ordenado.
 * arre es el arreglo del cual se quitará un elemento.
 * n es el total de elementos.
 * aEliminar es el dato que se quiere eliminar.
 * Regresa como resultado el total de elementos modificado (o no).
 */
 public static int eliminaOrdenado(int arre[], int n, int aEliminar){
     int pos;

     pos = buscaSecuencialOrdenado(arre, n, aEliminar);
     if (pos >= 0){ // El dato está en el arreglo
         desplazaHaciaIzquierda(arre, n, pos);
         n = n - 1; // Disminuye en 1 el total de elementos
     }
     return n;
 }

/* Método que regresa una cadena formada con el contenido del arreglo que recibe
 * como parámetro. Es muy útil para conocer el contenido del arreglo.
 */
 public static String imprime(int arre[], int n){
        int i;
        StringBuilder cad = new StringBuilder();

        for (i = 0; i < n; i++)
            cad.append(arre[i] + " ");
        return cad.toString();
 }
 
 // OTRAS OPERACIONES.
 
 // Método que regresa la suma de los elementos del arreglo
 public static int sumaElementos(int arre[], int n){
        int i, suma;
        suma = 0;
        
        // Por medio del for se suman cada uno de los valores almacenados en el arreglo.
        for (i = 0; i < n; i++)
            suma = suma + arre[i];
        return suma;  // Se regresa la suma
 }
 
 /* Método que regresa el promedio de los elementos del arreglo.
  * Utiliza el método que suma los elementos, regresando la suma dividida el total
  * de elementos. Convierte explícitamente a tipo "double" al resultado de la división,
  * de esta forma no se pierden los decimales.
  */
 public static double calculaPromedio(int arre[], int n){
        return (double)sumaElementos(arre,n)/n;
 }
 
 // Método que regresa la posición del elemento más grande
 public static int buscaPosMayor(int arre[], int n){
     int i, pos;
     
     pos = 0; // Inicializa la posición del mayor con la primera
     for (i = 1; i < n; i++) // Compara a partir de la segunda posición
         if (arre[i] > arre[pos])
                 pos = i; // Si encuentra un valor más grande, reasigna la posición
     return pos;  // Regresa la posición del mayor
 }
 
 // Método que regresa la posición del elemento más pequeño
 public static int buscaPosMenor(int arre[], int n){
     int i, pos;
     
     pos = 0; // Inicializa la posición del menor con la primera
     for (i = 1; i < n; i++)
         if (arre[i] < arre[pos])
                 pos = i;  // Si encuentra un valor más pequeño, reasigna la posición
     return pos;  // Regresa la posición del menor
 }
 
 /* Método que regresa el total de elementos mayores que un cierto valor dado como
  * parámetro (dato). 
  */
 public static int cuentaMayores(int arre[], int n, int dato){
     int i, cont;
     
     cont = 0;
     // Por medio del for compara el contenido de cada casilla con el valor dado
     for (i = 0; i < n; i++)
         if (arre[i] > dato) // Si es mayor se incrementa el contador
             cont = cont + 1; 
     return cont;  // Regresa el contador
 }
 
 /* Método que regresa el total de elementos menores que un cierto valor dado como
  * parámetro (dato). 
  */
 public static int cuentaMenores(int arre[], int n, int dato){
     int i, cont;
     
     cont = 0;
     // Por medio del for compara el contenido de cada casilla con el valor dado
     for (i = 0; i < n; i++)
         if (arre[i] < dato) // Si es menor se incrementa el contador 
             cont = cont + 1;
     return cont;  // Regresa el contador
 }
 
 /* Método que regresa el total de elementos iguales un cierto valor dado como
  * parámetro (dato). 
  */
 public static int cuentaIguales(int arre[], int n, int dato){
     int i, cont;
     
     cont = 0;
     // Por medio del for compara el contenido de cada casilla con el valor dado
     for (i = 0; i < n; i++)
         if (arre[i] == dato)  // Si es igual se incrementa el contador
                 cont = cont + 1;
     return cont;  // Regresa el contador
 } 
}
 

