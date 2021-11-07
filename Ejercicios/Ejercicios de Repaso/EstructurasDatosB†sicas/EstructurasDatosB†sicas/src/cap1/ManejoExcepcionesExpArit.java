
package cap1;
import java.util.*;

/**
 * Ejemplo de manejo de excepciones en una expresión aritmética. Evita que una 
 * división entre 0 produzca un error durante la ejecución.
 * @author Silvia Guardati
 * Programa 1.8
 */
public class ManejoExcepcionesExpArit {
    
    public static void main(String[] args) {
        int numerador, denominador, resultado;
        Scanner lee = new Scanner(System.in);
        
        System.out.print("\nIngrese numerador: ");
	numerador = lee.nextInt();
        System.out.print("Ingrese denominador: ");
        denominador = lee.nextInt();

        /* En el bloque try se intenta dividir e imprimir el resultado. 
         * En caso de que el denominador sea 0, en el bloque catch se indica
         * qué hacer. En este caso se imprime un mensaje propio acompañado
         * del mensaje obtenido por el método getMessage(). 
         */
        try{
            resultado = numerador / denominador;
            System.out.println("\nResultado:  " + resultado);
        } catch (Exception e){
           // System.out.println("\nNo se pudo dividir. Causa: " + e.getMessage());
           // System.out.println("\nNo se pudo dividir. Causa: " + e.toString());
            e.printStackTrace();
        }
    }  
}
