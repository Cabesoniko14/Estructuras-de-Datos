
package cap1;
import java.util.Scanner;

/**
 * Ejemplo de manejo de excepciones en la entrada de datos. Evita que el ingreso
 * de un valor que no sea un número entero produzca un error durante la ejecución.
 * @author Silvia Guardati
 * Programa 1.10
 */
public class ManejoExcepcionesEntradaDatos {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int número = 0;
        boolean bandera = false;
                
        /* En el bloque try se intenta leer un número entero. Si esto sucede se
         * altera la bandera para salir del ciclo e interrumpir la entrada de datos.
         * En el bloque catch se imprime un mensaje indicando el tipo de dato esperado
         * y se hace una lectura para prepararse para el siguiente intento.
         */
        while (!bandera)
            try {
                System.out.print("Ingresa un número entero: ");
                número = lee.nextInt();
                bandera = true;
            } catch (Exception e){
                System.out.println("\n¡Debes ingresar un número entero!");
                lee.next();
            }   
        System.out.println("El valor leído es: " + número);
    }
}
