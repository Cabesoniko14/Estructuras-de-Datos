
package cap1;
import java.util.Scanner;

/** 
 * @author Silvia Guardati
 * Ejemplo de un programa en Java.
 * Programa 1.1
 */
public class CalculaPromedioCalif {  
    
    public static void main(String[] args) {
        
        // Declaración de variables
        double cal1, cal2, cal3, exFinal, prom;
        Scanner lee = new Scanner(System.in);
        
        // Lectura de datos
        System.out.println("Ingrese las 3 calificaciones: ");
        cal1 = lee.nextDouble();
        cal2 = lee.nextDouble();
        cal3 = lee.nextDouble();        
        System.out.println("Ingrese la calificación del final: ");
        exFinal = lee.nextDouble();
        
        /* Proceso: se calcula el promedio y se asigna el resultado
         * a la variable prom. Uso de () para indicar que debe hacerse primero
         * la suma y luego la división.
         */
        prom = (cal1 + cal2 + cal3) / 3;
        prom = (prom + exFinal) / 2;
        
        // Salida de resultado
        System.out.println("\nPromedio de las calificaciones: " + prom + "\n");
    }    
}
