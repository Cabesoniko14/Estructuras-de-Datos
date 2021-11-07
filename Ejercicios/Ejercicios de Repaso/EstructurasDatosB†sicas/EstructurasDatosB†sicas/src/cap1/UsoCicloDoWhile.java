
package cap1;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 1.7
 */
public class UsoCicloDoWhile {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double cal, suma, prom;
        int totCal, i;
        
        /* Al menos se debe leer una vez. Si se da 1 o más calificaciones, se sale del
         * do-while. Si el usuario ingresa 0 o menos, entonces se vuelve a pedir el dato.
         */
        do {
            System.out.print("\nIngresa total de calificaciones: ");
            totCal = lee.nextInt();
        } while (totCal <= 0);
        
        suma = 0;
        for (i = 1; i <= totCal; i++){
            System.out.print("\nCalificación " + i + ": ");
            cal = lee.nextDouble();
            suma = suma + cal;
        }
        
        prom = suma / totCal;
        System.out.println("\nEl promedio de las calificaciones es: " + prom + "\n");
    }        
}
