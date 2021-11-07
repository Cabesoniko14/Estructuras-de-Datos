
package cap5;

import cap5.OABE;

/**  
 * @author Silvia Guardati
 * Programa 5.12
 * Ejemplo del uso de la clase OABE para procesar las calificaciones de un grupo
 * de alumnos. Las calificaciones se almacenan en un arreglo bidimensional y mediante
 * los métodos de OABE se obtiene la información requerida.
 */
public class UsaOABE {
    public static void main(String[] args) {
        int numAl, numEx, al, ex, res;
        double prom;
        // Declaración de constantes
        final int MAX_ALUM = 30;
        final int MAX_EXAM = 4;

        /* Declaración e instanciación de un arreglo de 30 renglones y 4 columnas.
         * Se usan las constantes previamente declaradas para dar el tamaño máximo.
         */
        int calif[][] = new int[MAX_ALUM][MAX_EXAM];
        
        System.out.println("\nIngresa el total de alumnos");
        numAl = OABE.leeTamaño(MAX_ALUM);
        System.out.println("\nIngresa el total de exámenes");
        numEx = OABE.leeTamaño(MAX_EXAM);
        
        // Lectura del arreglo de calificaciones
        System.out.println("\nIngresa las calificaciones, por alumno.");
        OABE.leeArre(calif, numAl, numEx);
        
        // Imprime el promedio obtenido por cada alumno
        for (al = 0; al < numAl; al++){
            prom = OABE.calculaPromRen(calif, al, numEx);
            System.out.println("\nEl promedio del alumno: " + (al+1) + " es: " + prom);
        }
            
                
        // Imprime el promedio de calificaciones por examen
        for (ex = 0; ex < numEx; ex++){
            prom = OABE.calculaPromCol(calif, ex, numAl);
            System.out.println("\nEl promedio del examen: " + (ex+1) + " es: " + prom);
        }
            
        
        // Imprime el alumno que obtuvo la calificación más alta por examen
        for (ex = 0; ex < numEx; ex++){
            res = OABE.buscaPosMayorColumna(calif, ex, numAl)+1; 
            System.out.println("\nEl alumno que obtuvo la mayor calificación en el examen: " + (ex+1) + " es: " + res);
        }
            
        
        // Para cada alumno, imprime el examen en el que obtuvo la calificación más alta 
        for (al = 0; al < numAl; al++){
            res = OABE.buscaPosMayorRenglón(calif, al, numEx)+1;
            System.out.println("\nEl alumno: " + (al+1) + " obtuvo la mayor calificación en el examen: " + res);
        }
            
        // Cuenta, por examen, cuántos alumnos sacaron 10
        for (ex = 0; ex < numEx; ex++){
            res = OABE.cuentaPorColumna(calif, ex, numAl, 10);
            if (res != 0)
                System.out.println("\n" + res + " alumnos sacaron 10 en el examen: " + (ex+1));
        }  
        
        // Cuenta, por alumno, en cuántos exámenes sacó 6
        for (al = 0; al < numAl; al++){
            res = OABE.cuentaPorRenglón(calif, al, numEx, 6);
            if (res != 0)
                System.out.println("\nEl alumno: " + (al+1) + " sacó 6 en " + res + " exámenes");
        }
    }
}
