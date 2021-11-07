package cap1;
import java.util.Scanner;

/**
 * Ejemplo del uso de subprogramas/métodos. La solución del problema está formada 
 * por dos subprogramas y el método principal que es el que tiene el control.
 * @author Silvia Guardati
 * Programa 1.12
 */
public class EjemploSubprograma2 {
    
    /* Subprograma que lee y regresa un número entero, mayor que cero. 
     * Recibe un parámetro para indicar los datos que se quieren leer.
     * Por medio del try catch se valida la entrada, evitando un error en caso 
     * de que se introduzca un dato que no sea un número entero. 
     * Se retoma el código del programa 1.11
     */
    public static int leeTotalDatos(String mensaje){        
        Scanner lee = new Scanner(System.in);
        int número = 0;
        boolean bandera = false;
        
        while (!bandera || número <= 0)
            try {
                System.out.print("\nIngresa el total de " + mensaje + " (>0): ");
                número = lee.nextInt();
                bandera = true;
            } catch (Exception e){
                System.out.println("\n¡Debes ingresar un número entero!");
                lee.next();
            }   
        return número;
    }
    
    /* Subprograma que lee n datos y calcula y regresa el promedio de los
     * mismos. Recibe como parámetro el total de datos y una cadena que indica 
     * qué representan los datos (edades, precios, calificaciones, etc.). 
     * Regresa un número tipo double que es el promedio de los datos.
     */
    public static double calculaPromedio(int n, String mensaje){
        Scanner lee = new Scanner(System.in);
        double dato, promedio;
        int i;
        
        promedio = 0;
        for (i= 1; i <= n; i++){
            System.out.println("Ingresa " + mensaje + " " + i +": ");
            dato = lee.nextDouble();
            promedio = promedio + dato;
        }
        
        promedio = promedio/n;
        return promedio;        
    }
    
    // Método principal
    public static void main(String[] args) {
        int n;
        double promedio;
        
        /* Se utilizan los subprogramas para leer el total de edades, cada una
         * de ellas y calcular el promedio.
         */
        n = leeTotalDatos("Edades");
        promedio = calculaPromedio(n, "edad");
        System.out.println("\nEl promedio de las edades es: " + promedio);
        
        
        /* Se utilizan los subprogramas para leer el total de calificaciones, 
         * cada una de ellas y calcular el promedio.
         */
        n = leeTotalDatos("Calificaciones");
        promedio = calculaPromedio(n, "calificación");
        System.out.println("\nEl promedio de las calificaciones es: " + promedio);
    }   
}
