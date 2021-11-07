
package cap1;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Ejemplo de uso de una selección múltiple (switch).
 * El programa calcula e imprime el precio actualizado de un automóvil, de 
 * acuerdo a la categoría del mismo.
 * Programa 1.4
 */
public class UsoSelecciónMúltiple {
    
    public static void main(String[] args) {
        
        // Declaración de variables
        double precioActual, precioFinal;
        int categoría;
        Scanner lee = new Scanner(System.in);
        
        // Lectura de datos
        System.out.print("\nPrecio actual del automóvil: ");
        precioActual = lee.nextDouble();
        System.out.print("\nCategoría del automóvil: ");
        categoría = lee.nextInt();        
                
        switch (categoría) {
            case 10:
            case 20: precioFinal = precioActual * 1.12;
                     break;
            case 30: precioFinal = precioActual * 1.10;
                     break;
            case 40: precioFinal = precioActual * 1.08;
                     break;
            default: precioFinal = precioActual * 1.05;
        }
       
        System.out.println("\nEl precio actualizado es: $" + precioFinal + "\n");
                     
    }
}
