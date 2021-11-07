
package cap1;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Ejemplo de uso del ciclo while - Serie de Ullman
 * Programa 1.6
 */
public class UsoCicloWhile {
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int número;
        
        System.out.print("Ingresa un número entero > 0: ");
        número = lee.nextInt();
        
        System.out.print("\n\nSerie de Ullman: " + número);
        while (número > 1){
            if (número % 2 == 0)
                número = número / 2;
            else
                número = número * 3 + 1;
            System.out.print("-" + número);
        }  
        System.out.println("\n\n");
    }    
}
