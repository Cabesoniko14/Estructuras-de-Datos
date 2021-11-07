
package cap4;

import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Ejemplo de declaración e instanciación , asignación, lectura e impresión de 
 * arreglos.
 */
public class PruebaArreglos {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int i, totalEdades;
        
        final int MAX = 10; // Se declara una constante.
        
        // Ejemplos de declaraciones e instanciaciones de arreglos
        
        // Arreglo que puede almacenar máximo 10 números enteros.
        int edades[] = new int[MAX];
        
        // Arreglo que puede almacenar máximo 10 números de doble precisión.
        double[] números = new double[MAX];
        
        // Arreglo que puede almacenar máximo 10 cadenas de caracteres.
        String[] nombres = new String[MAX];
        
        do{
            System.out.print("Ingrese total edades: ");
            totalEdades = lee.nextInt();
        }while (totalEdades < 1 || totalEdades > MAX);
        
        // Ejemplo de lectura de valores enteros y almacenamiento en un arreglo.
        for (i = 0; i < totalEdades; i++){
            System.out.print("\nIngrese edad: ");
            edades[i] = lee.nextInt();
        }
        
        // Ejemplo de impresión del contenido de un arreglo de enteros.
        System.out.print("\nEdades:  ");
        for (i = 0; i < totalEdades; i++)
            System.out.print(edades[i] + " ");
        
        
        // Se asigna una cadena sólo a la casilla de la posición 0
        nombres[0] = "Juan Martínez"; 
        
        // Se asigna la cadena vacía a todas las casillas del arreglo.
        for (i = 0; i < MAX; i++)
            nombres[i] = "";
        
        // La variable otrosNombres sólo se declara, no se instancia.
        String otrosNombres[];
        
        /* Se asigna el arreglo nombres a la variable otrosNombres. Ahora hay dos 
         * variables que hacen referencia al mismo arreglo.
         */
        otrosNombres = nombres;
        // Se imprime el contenido del arreglo, el cual almacena cadenas vacías.
        System.out.println("\n\nContenido del arreglo de cadenas de caracteres:");
        for (i = 0; i < MAX; i++)
            System.out.print(otrosNombres[i] + " - ");
        
        // Se asigna el resultado de la expresión sólo en las casillas con índice par.
        for (i = 0; i < MAX; i = i + 2)
            números[i] = Math.pow(2, i);
        
        // Se imprime el contenido del arreglo para mostrar los valores asignados.
        System.out.println("\nValores asignados en posiciones pares:");
        for (i = 0; i < MAX; i++)
            System.out.println(números[i] + " ");
        
        // Imprime el total de casillas reservadas para el arreglo edades.
        System.out.println("Total de casillas reservadas para edades: " + edades.length);
    }
}
