package cap1;
import java.io.File;
import java.util.*;

/**
 * Ejemplo de manejo de excepciones en la lectura de archivo. Evita que si falla
 * la apertura del archivo se produzca un error durante la ejecución.
 * @author Silvia Guardati
 * Programa 1.9
 */
public class ManejoExcepcionesArchivo {
    
    public static void main(String[] args) {
        
        /* En el bloque try se intenta abrir un archivo de nombre “Datos”. Si es posible, 
         * mientras haya valores que leer, estos se leen y se suman. Si la apertura 
         * del archivo falla, pasa al bloque catch donde se toma la excepción y, 
         * en este caso, se imprime el mensaje que arroja el método getMessage(). 
         * Por último, en el bloque finally se despliega un mensaje se haya o no 
         * leído del archivo.
         * */
        
        try {
            File archivo = new File("Datos.txt");
            Scanner lee = new Scanner(archivo);
            double suma = 0;
            while (lee.hasNextDouble())
                suma = suma + lee.nextDouble();
            System.out.println("Suma de los valores leídos: " + suma);
            lee.close();       
        } catch(Exception e){
            System.out.println("Archivo: " + e.getMessage());
        } finally {
            System.out.println("Lectura de un archivo con manejo de excepciones ");    
        }
    }
}
