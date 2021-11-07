
package cap5;

import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 5.11
 * Clase que concentra las operaciones más frecuentes sobre un arreglo bidimensional
 * de enteros.
 * OABE: Operaciones con Arreglos Bidimensionales de Enteros.
 */
public class OABE {
    
    /* Método auxiliar utilizado para leer y validar, tanto el número de renglones
     * como el de columnas. 
     * Recibe el máximo permitido, dado por el valor con el cual se instanció al
     * arreglo.
     */    
    public static int leeTamaño(int max){
        Scanner lee = new Scanner(System.in);
        int n;
    
        do{
            System.out.println("\nDebe ser un entero positivo menor que: " + max);
            n = lee.nextInt();
        } while (n <= 0 || n > max);
        return n;
    }
    
    // Lee -por renglón- un arreglo bidimensional 
    public static void leeArre(int arre[][], int numR, int numC){
        Scanner lee = new Scanner(System.in);
        int i,j;
        
        for (i = 0; i < numR; i++)
            for (j = 0; j < numC; j++){
                System.out.print("\nIngresa dato: ");
                arre[i][j] = lee.nextInt();
            }
    }
    
    // Imprime -por renglón- un arreglo bidimensional 
    public static void imprimeArre(int arre[][], int numR, int numC){
        Scanner lee = new Scanner(System.in);
        int i,j;
        
        for (i = 0; i < numR; i++){
            for (j = 0; j < numC; j++)
                System.out.print(arre[i][j] + " ");
            System.out.println("\n");
        }
    }
    
    // Obtiene y regresa la suma del renglón dado como parámetro (ren).
    public static int sumaRenglón(int arre[][], int ren, int numC){
        int suma, c;
        
        suma = 0;
        for(c = 0; c < numC; c++)
            suma = suma + arre[ren][c];
        return suma;
    }
    
    // Calcula y regresa el promedio del renglón dado como parámetro (ren).
    public static double calculaPromRen(int arre[][], int ren, int numC){
        return (double)sumaRenglón(arre, ren, numC) / numC;
    }
    
    // Obtiene y regresa la suma de la columna dada como parámetro (col).
    public static int sumaColumna(int arre[][], int col, int numR){
        int suma, r;
        
        suma = 0;
        for(r = 0; r < numR; r++)
            suma = suma + arre[r][col];
        return suma;
    }
    
    // Calcula y regresa el promedio de la columna dada como parámetro (col).
    public static double calculaPromCol(int arre[][], int col, int numR){
        return (double)sumaColumna(arre, col, numR) / numR;
    }
    
    /* Busca y regresa la posición del elemento más grande de un renglón dado
     * como parámetro (ren). La posición es la columna en la que encuentra al mayor.
     */
    public static int buscaPosMayorRenglón(int arre[][], int ren, int numC){
        int c, col;
        
        col = 0;
        for (c = 1; c < numC; c++)
            if (arre[ren][c] > arre[ren][col])
                col = c;
        return col;
    }
   
    /* Busca y regresa la posición del elemento más grande de una columna dada
     * como parámetro (col). La posición es el renglón en el que encuentra al mayor.
     */
    public static int buscaPosMayorColumna(int arre[][], int col, int numR){
        int r, ren;
        
        ren = 0;
        for (r = 1; r < numR; r++)
            if (arre[r][col] > arre[ren][col])
                ren = r;
        return ren;
    }
    
    /* Cuenta y regresa el total de veces que el dato se encuentra en el renglón
     * dado como parámetro (ren).
     */
    public static int cuentaPorRenglón(int arre[][], int ren, int numC, int dato){
        int c, cont;
        
        cont = 0;
        for (c = 0; c < numC; c++)
            if (arre[ren][c] == dato)
                cont = cont + 1;
        return cont;
    }
    
    /* Cuenta y regresa el total de veces que el dato se encuentra en la columna
     * dada como parámetro (col).
     */
    public static int cuentaPorColumna(int arre[][], int col, int numR, int dato){
        int r, cont;
        
        cont = 0;
        for (r = 0; r < numR; r++)
            if (arre[r][col] == dato)
                cont = cont + 1;
        return cont;
    }    
}
