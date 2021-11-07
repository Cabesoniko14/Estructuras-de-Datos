package cap1;
import java.util.Scanner;

/** 
 * @author Silvia Guardati
 * Ejemplo de uso de una selección doble (if/else)
 * Programa 1.3
 */
public class UsoSelecciónDoble {
    
    public static void main(String[] args) {
        
        // Declaración de variables
        double cal1, cal2, cal3, exFinal, prom;
        Scanner lee = new Scanner(System.in);
        
        // Lectura de datos
        System.out.println("Ingrese las calificaciones de los 3 parciales: ");
        cal1 = lee.nextDouble();
        cal2 = lee.nextDouble();
        cal3 = lee.nextDouble();
        
        System.out.println("Ingrese la calificación del examen final: ");
        exFinal = lee.nextDouble();
       
        // Calcula promedio
        prom = (cal1 + cal2 + cal3) / 3;
     
        /* Evalúa que tanto el promedio de parciales como el examen final hayan
         * sido aprobados. Si es así, se imprime la calificación final. En caso
         * contrario se imprime un mensaje.
         */
        if (prom >= 6 && exFinal >= 6){
            prom = (prom + exFinal) / 2;
            System.out.println("\nEl alumno aprobó con un puntaje = " + prom + "\n");
        }             
        else
            System.out.println("El alumno no aprobó la materia\n");
    }
}

