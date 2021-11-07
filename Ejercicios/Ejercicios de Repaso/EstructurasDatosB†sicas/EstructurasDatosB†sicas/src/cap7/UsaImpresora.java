
package cap7;

import java.util.*;

/**
 * @author Silvia Guardati
 * Programa 7.11
 * Ejemplo de aplicación de la estrucutra tipo cola. Se crea un objeto tipo impresora
 * y se aplican las operaciones definidas en ella. Las operaciones se aplican aleatoriamente.
 */
public class UsaImpresora {

    
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        Impresora imp = new Impresora("Ahorra tinta");
        String nom, tipo;
        Random ran = new Random();
        int tam, opción = ran.nextInt(4); // Genera un número comprendido entre 0 y 3 inclusive
        
        while ( opción != 3){ // Cuando se genere un 3 se detiene la ejecución.
            switch (opción) {
                case 0: System.out.println("\nIngrese nombre archivo, tipo y tamaño: ");
                        nom = lee.next();
                        tipo = lee.next();
                        tam = lee.nextInt();
                        imp.encola(nom, tipo, tam);
                        break;
                case 1: Archivo a = imp.imprime();
                        if (a != null)
                            System.out.println("\nArchivo impreso: " + a.getNombre());
                        else
                            System.out.println("\nNo hay archivos para imprimir");
                     
                        break;
                case 2:
                        System.out.println("\n¿De qué tipo de archivo quiere cancelar la impresión? ");
                        tipo = lee.next();
                        System.out.println("\nTotal de archivos eliminados: " + imp.eliminaPorTipo(tipo));
                    
            }
            opción = ran.nextInt(4);
        }
    }
}
