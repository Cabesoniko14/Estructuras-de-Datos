
package cap5;

import java.util.Iterator;

/**
 * @author Silvia Guardati
 * Programa 5.10
 * Ejemplo del uso de iteradores sobre arreglos. 
 */
public class EjemploAGOIter {
    
    public static void main(String[] args) {
        /* Se construye un objeto tipo arreglo genérico ordenado -con iterador-, 
         * parametrizado con la clase Cliente.
         */
        AGOIter <Cliente> arreCli = new AGOIter();
        boolean resp;
        double suma;
        
        // Se construyen 3 objetos tipo Cliente y se insertan en el arreglo.
        Cliente c1 = new Cliente("Rubalcaba, Juan", "Reforma 128", 1000);
        Cliente c2 = new Cliente("Martínez, Alicia", "García Lorca 584", 8500);
        Cliente c3 = new Cliente("Gómez, Marina", "Estrella 324", 3729.5);
        
        resp = arreCli.insertaOrdenadoSinRepetidos(c1);
        if (!resp)
            System.out.println("\nNo se pudo dar de alta el cliente: " + c1);
        resp = arreCli.insertaOrdenadoSinRepetidos(c2);
        if (!resp)
            System.out.println("\nNo se pudo dar de alta el cliente: " + c2);
        resp = arreCli.insertaOrdenadoSinRepetidos(c3);
        if (!resp)
            System.out.println("\nNo se pudo dar de alta el cliente: " + c3);
        
        /* Impresión del contenido del arreglo por medio del toString de la clase
         * AGOIter.
         */
        System.out.println("\nLista de clientes -toString:\n" + arreCli);
        
        // Impresión del contenido del arreglo por medio del ciclo for all
        System.out.println("\nLista de clientes -for all");
        for (Cliente c: arreCli)
            System.out.println(c);
        
        /* Impresión del contenido del arreglo por medio del iterador. Observe que 
         * al construir el objeto it de tipo Iterator se parametriza con el mismo
         * tipo usado en el arreglo.
         */
        System.out.println("\nLista de clientes -iterador");
        Iterator <Cliente> it = arreCli.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        
        /* Obtiene e imprime la suma de los saldos de todos los clientes. Cada uno
         * de los saldos se obtiene a partir del iterador; en este caso es fundamental
         * parametrizar con la clase Cliente, sino se debería convertir explícitamente
         * antes de obtener el saldo.
         */
        it = arreCli.iterator();
        suma = 0;
        while (it.hasNext())
            suma = suma + it.next().getSaldo();
        System.out.println("\nSaldo total: $" + suma);
    }   
}
