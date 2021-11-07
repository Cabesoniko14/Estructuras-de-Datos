package cap5;

import cap2.Rectángulo;

/**
 * @author Silvia Guardati
 * Programa 5.2
 * Ejemplo de uso de la clase AGD.
 * 
 */
public class EjemploAGD {
    public static void main(String[] args) {
        /* Se instancia un objeto de tipo AGD, parametrizando
         * con la clase Rectángulo. Es decir, cada casilla del arreglo puede almacenar
         * la referencia a un objeto tipo Rectángulo.
         */
        AGD<Rectángulo> arre = new AGD();
        Rectángulo r1 = new Rectángulo(4.5, 3.8);
        Rectángulo r2 = new Rectángulo(3.8, 4.2);
        Rectángulo r3 = new Rectángulo(5.0, 4.0);
        Rectángulo r4 = new Rectángulo(2.5, 3.1);
        
        // Se insertan 3 rectángulos en el arreglo.
        arre.insertaDesordenadoConRepetidos(r1);
        arre.insertaDesordenadoConRepetidos(r2);
        arre.insertaDesordenadoConRepetidos(r3);
        
        /* Se imprime el contenido del arreglo por medio del método toString() de la
         * clase AGD.
         */
        System.out.println("\nDatos de los rectángulos: " + arre);
        
        /* Se busca al rectángulo r2 en el arreglo, imprimiendo un mensaje según el
         * resultado. En  este caso, el rectángulo sí está en el arreglo.
         */
        if (arre.buscaSecuencialDesordenado(r2) >= 0)
            System.out.println("\nEl rectángulo: " + r2 + " está en el arreglo.");
        else
            System.out.println("\nEl rectángulo: " + r2 + " no está en el arreglo.");
        
        /* Se busca al rectángulo r4 en el arreglo, imprimiendo un mensaje según el
         * resultado. En  este caso, el rectángulo no está en el arreglo.
         */
        if (arre.buscaSecuencialDesordenado(r4) >= 0)
            System.out.println("\nEl rectángulo: " + r4 + " está en el arreglo.");
        else
            System.out.println("\nEl rectángulo; " + r4 + " no está en el arreglo.");
        
        /* Se intenta eliminar el rectángulo r1, imprimiendo un mensaje de acuerdo
         * al resultado del método. En este caso, sí se elimina.
         */
        if (arre.eliminaDesordenado(r1))
            System.out.println("\nEl rectángulo: " + r1 + " se eliminó del arreglo.");
        else
            System.out.println("\nEl rectángulo: " + r1 + " no se eliminó del arreglo.");
        
        // Se imprime el contenido del arreglo, luego de la eliminación de r1.
        System.out.println("\nRectángulos luego de eliminar a r1: " + arre);
    }
}
