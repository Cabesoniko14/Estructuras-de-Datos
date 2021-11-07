package cap1;
import java.util.Scanner;

/**
 * Ejemplo del uso de subprogramas/métodos. La solución del problema está formada 
 * por dos subprogramas y el método principal que es el que tiene el control.
 * @author Silvia Guardati
 * Programa 1.11
 */
public class EjemploSubprograma1 {
    
    /* Subprograma que lee un número entero que representa el total de
     * edades que se desea promediar. Por medio del try catch
     * se valida la entrada, evitando un error en caso de que se introduzca
     * un dato que no sea un número entero. Se retoma el código del programa 1.10
     */
    public static int leeTotalDatos(){        
        Scanner lee = new Scanner(System.in);
        int número = 0;
        boolean bandera = false;
        
        while (!bandera || número <= 0)
            try {
                System.out.print("Ingresa el total de edades (>0): ");
                número = lee.nextInt();
                bandera = true;
            } catch (Exception e){
                System.out.println("\n¡Debes ingresar un número entero!");
                lee.next();
            }   
        return número;
    }
    
    /* Subprograma que lee n edades y calcula y regresa el promedio de las
     * mismas. Recibe como parámetro el total de edades, regresa un número
     * tipo double que es el promedio de las edades.
     */
    public static double calculaPromedio(int n){
        Scanner lee = new Scanner(System.in);
        double edad, promedio;
        int i;
        
        promedio = 0;
        for (i= 1; i <= n; i++){
            System.out.println("Ingresa la edad " + i + ": ");
            edad = lee.nextDouble();
            promedio = promedio + edad;
        }
        
        promedio = promedio/n;
        return promedio;        
    }
    
    // Método principal
    public static void main(String[] args) {
        int n;
        double promedio;
        
        n = leeTotalDatos();
        promedio = calculaPromedio(n);
        System.out.println("\nEl promedio de las edades es: " + promedio);
    }   
}
