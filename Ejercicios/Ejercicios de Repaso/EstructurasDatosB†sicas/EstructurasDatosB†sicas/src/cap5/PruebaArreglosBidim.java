
package cap5;

import java.util.Scanner;

/**
 * @author Silvia guardati
 * En este programa se dan algunos ejemplos de declaraciones e instanciaciones de 
 * arreglos bidimensionales. Asimismo, hay ejemplos de lectura, impresión y asignación.
 */
public class PruebaArreglosBidim {
    
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
        } while (n < 0 || n > max);
        return n;
    }
    
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);        
        int i, j, numC, numR;
        
        // Declaración de constantes
        final int MAX_ALUM = 30;
        final int MAX_EXAM = 4;

        /* Declaración e instanciación de un arreglo de 30 renglones y 4 columnas.
         * Se usan las constantes previamente declaradas para dar el tamaño máximo.
         */
        int calif[][] = new int[MAX_ALUM][MAX_EXAM];

        // Declaración de un arreglo tipo double
        double [][]prodPesq;
        // Instanciación del arreglo. Se usan números para establecer el límite.
        prodPesq = new double[20][12];

        /* Declaración, instanciación e inicialización de un arreglo bidimensional
         * de tipo boolean. El tamaño queda determinado por la cantidad de valores
         * asignados. En este caso, 2 renglones y 3 columnas.
         */
         boolean mat[][] = {{true, true, true}, {false, true, false}};

         // Imprime el máximo de renglones reservados para calif (30)
         System.out.println("\nTotal de renglones - primer arreglo: " + calif.length);
         // Imprime el máximo de columnas reservadas para calif (4)
         System.out.println("\nTotal de columnas - primer arreglo: " + calif[0].length);

         // Imprime el máximo de renglones reservados para mat(2)
         System.out.println("\nTotal de renglones - tercer arreglo: " + mat.length);
         // Imprime el máximo de columnas reservadas para mat (3)
         System.out.println("\nTotal de columnas - tercer arreglo: " + mat[1].length);
         
         /* Lectura del total de elementos que almacenará el arreglo. En este caso,
          * total de alumnos -renglones- y total de exámenes -columnas-.
          */          
         System.out.println("\nIngresa el total de alumnos");
         numR = leeTamaño(MAX_ALUM);
         System.out.println("\nIngresa el total de calificaciones");
         numC = leeTamaño(MAX_EXAM);

         // Lectura de un arreglo bidimensional (por renglón)
         for (i= 0; i < numR; i++)
             for (j= 0; j < numC; j++){
                 System.out.println("Calificación: " + (j+1) + " del alumno " + (i+1));
                 calif[i][j] = lee.nextInt();
             }
         
         // Impresión de un arreglo bidimensional (por renglón)
         System.out.println("\n\nArreglo bidimensional:\n");
         for (i= 0; i < 2; i ++){
             for (j= 0; j < 3; j++)
                 System.out.print(mat[i][j] + " ");
             System.out.println("\n");
         }
         
         /* Asignación de 0 a todos los elementos de un arreglo bidimensional,
          * por columna.
          */
         for (j= 0; j < 12; j++)
             for (i= 0; i < 20; i++)
                 prodPesq[i][j] = 0;
    }   
}
