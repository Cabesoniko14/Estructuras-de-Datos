
package cap4;

import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 4.8
 * Ejemplo de uso de arreglos paralelos en la solución de problemas.
 * Funcionalidad de la clase: a) dado el nombre de un alumno, encuentra e imprime su 
 * calificación y b) imprime los nombres de todos los alumnos que obtuvieron una 
 * calificación mayor a 9.
 */
public class EjemploArreglosParalelos {
    
    public static void main(String[] args) {
        final int MAX = 50;
        String nomAlumnos [] = new String[MAX];
        double calificaciones [] = new double[MAX];
        int i, totalAl, pos;
        String nombre;
        Scanner lee = new Scanner(System.in);
        
        do{
            System.out.println("\nIngresa total de alumnos: ");
            totalAl = lee.nextInt();
        } while (totalAl < 1 || totalAl > MAX);
 
        for (i = 0; i < totalAl; i++){
            System.out.println("\nIngresa nombre del alumno " + (i + 1) + ": ");
            nomAlumnos[i] = lee.next();
            System.out.println("\nIngresa calificación de " + nomAlumnos[i] + ": ");
            calificaciones[i] = lee.nextDouble();
        }
        
        /* Dado el nombre de un alumno, si está en el arreglo de nombres, entonces
         * se usa su posición para obtener la calificación en el arreglo de 
         * calificaciones.
         */
        System.out.println("\nDe quién quieres conocer la calificación: ");
        nombre = lee.next();
        pos = OAG.buscaSecuencialDesordenado(nomAlumnos, totalAl, nombre);
        if (pos >= 0) // Verifica que lo haya encontrado.
            System.out.println("\n" + nombre + " obtuvo: " + calificaciones[pos]);
        else
            System.out.println("\nEse alumno no está registrado.");
        
        /* Se revisa todo el arreglo de calificaciones y, cada vez que se encuentra
         * una mayor a 9, se imprime el alumno que la obtuvo: está en la misma
         * posición pero en el arreglo de nombres.
         */
        System.out.println("\nAlumnos con calificación > 9: ");
        for (i = 0; i < totalAl; i++)
            if (calificaciones[i] > 9)
                System.out.println(nomAlumnos[i]);
    }
}
