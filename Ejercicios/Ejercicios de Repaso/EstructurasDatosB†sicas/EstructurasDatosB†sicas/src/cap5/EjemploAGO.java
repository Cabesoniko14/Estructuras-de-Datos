
package cap5;

import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 5.5
 * Ejemplo de uso de un objeto tipo AGO (ArregloGenéricoOrdenado). Se utiliza la 
 * clase Cliente (programa 5.4) para darle valor a T.
 */
public class EjemploAGO {
    
    public static void main(String[] args) {
        // Se construye un objeto tipo AGO parametrizando con Cliente.
        AGO <Cliente> arre = new AGO();
        
        Cliente c1 = new Cliente("Martínez, Lucía", "Reforma 128", 0.0);
        Cliente c2 = new Cliente("Alvarez, Marcos", "Calle 10 - 432", 3728.45);
        Cliente c3 = new Cliente("De Luca, Alicia", "Av. Paz 350", 1500.0);
        Cliente c4 = new Cliente("Suárez, Dolores", "Encinos 350", 0.0);
        
        // Se insertan tres clientes en el arreglo, de manera ordenada, por nombres.
        arre.insertaOrdenadoSinRepetidos(c1);
        arre.insertaOrdenadoSinRepetidos(c2);
        arre.insertaOrdenadoSinRepetidos(c3);
        
        // Se imprime el contenido del arreglo.
        System.out.println("\nDatos de los clientes: " + arre);
      
        /* Se busca un cliente, indicando si está o no registrado. En este caso
         * sí está registrado.
         */
        if ( arre.buscaSecuencialOrdenado(c1) >= 0)
            System.out.println("\n" + c1.getNombre() + " sí está registrado ");
        else
            System.out.println("\n" + c1.getNombre() + " no está registrado.");
        
        /* Se busca un cliente, indicando si está o no registrado. En este caso
         * no está registrado.
         */
        if (arre.buscaSecuencialOrdenado(c4) >= 0)
            System.out.println("\n" + c4.getNombre() + " sí está registrado");
        else
            System.out.println("\n" + c4.getNombre() + " no está registrado.");
        
        /* Se intenta eliminar un cliente, dando sólo su nombre. Imprimiendo un 
         * mensaje de acuerdo al resultado del método. En este caso, sí se elimina.
         */
        if (arre.eliminaOrdenado(new Cliente("Martínez, Lucía")))
            System.out.println("\nCliente dado de baja.");
        else
            System.out.println("\nEse cliente no está registrado.");        
    }    
}
