
package cap1;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Ejemplo de uso del ciclo for
 * Programa 1.5
 */
public class UsoCicloFor {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double cal, suma, prom;
        int totCal, i;
        
        System.out.print("\nIngresa total de calificaciones: ");
        totCal = lee.nextInt();
        
        /* La variable suma debe iniciarse en 0 ya que se usará para acumular
         * las calificaciones y necesita tener un valor asignado cuando se 
         * ejecute (por primera vez): suma + cal.
         */
        suma = 0;
        for (i = 1; i <= totCal; i++){
            System.out.print("\nCalificación " + i + ": ");
            cal = lee.nextDouble();
            suma = suma + cal;
        }
        
        if (totCal > 0){
            prom = suma / totCal;
            System.out.println("\nEl promedio de las calificaciones es: " + prom + "\n");
        }
        else
            System.out.println("\nNo se puede calcular el promedio. \n");
    }    
}
