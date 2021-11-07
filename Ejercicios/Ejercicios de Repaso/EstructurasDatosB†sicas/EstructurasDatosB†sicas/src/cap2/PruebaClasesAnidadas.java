package cap2;

// Se importa la clase ClaseEstática3 para simplificar la notación.
import cap2.ClaseEnvolvente.ClaseEstática3;

/**
 * @author Silvia Guardati
 * Programa 2.5
 * Ejemplo de uso de clases anidadas y estáticas definidas en el programa 2.4.
 */
public class PruebaClasesAnidadas {
    
    public static void main(String[] args) {
        ClaseEnvolvente objCE1, objCE2;
        objCE1 = new ClaseEnvolvente(50);

        // Se imprime el objeto recién creado
        System.out.println("\nDesde el main: " + objCE1);

        /* Al involcar el método haceAlgo() se creará un objeto de tipo ClaseInterior1
         * y se imprimirá. La clase ClaseInterior1 se declaró como privada, por lo tanto
         * no se tiene acceso a ella fuera de la clase envolvente.
         */
        System.out.println(objCE1.haceAlgo());

        /* Por medio de un objeto de la clase envolvente se crea un objeto de una de sus
         * clases anidadas. En este caso, la clase protegida ClaseInterior2.
         */
        ClaseEnvolvente.ClaseInterior2 objCI2 = objCE1.new ClaseInterior2(2);
        System.out.println("\nDesde el main: " + objCI2);

        /* Por medio de un objeto de la clase envolvente se crea un objeto de una de sus
         * clases anidadas. En este caso, la clase pública ClaseInterior3.
         */
        ClaseEnvolvente.ClaseInterior3 objCI3 = objCE1.new ClaseInterior3(3);
        System.out.println("\nDesde el main: " + objCI3);
        
        /* Como no se importó la clase ClaseEstática2, se debe seguir la notación 
         * ClaseEnvolvente.ClaseEstática2.       
         */
        ClaseEnvolvente.ClaseEstática2 objCEst2 = new ClaseEnvolvente.ClaseEstática2(20);
        System.out.println("\nDesde el main: " + objCEst2);

        /* Como se importó la clase ClaseEstática3 se puede omitir el nombre de la
         * clase envolvente, al declarar e instanciar el objeto.
         */
        ClaseEstática3 objCEst3 = new ClaseEstática3(10);
        System.out.println("\nDesde el main: " + objCEst3);

        /* La clase ClaseEstática1 no puede usarse directamente en este programa 
         * porque es privada. Se puede crear un objeto de su tipo por medio de un 
         * objeto de la clase envolvente. Se invoca el método haceOtraCosa() el 
         * cual crea un objeto y lo regresa en forma de cadena.
         */      
        System.out.println("\nDesde el main: " + objCE1.haceOtraCosa());
        
        /* Este método regresa el objeto de la clase envolvente usado para instanciar 
         * el objeto de la clase ClaseInterior2.
         */        
        objCE2 = objCI2.getClaseEnvolvente();
        System.out.println("\nDesde el main: " + objCE2);
        
        // Este método regresa el objeto de la clase ClaseInterior2.
        System.out.println("\nDesde el main: " + objCI2.getClaseInterior2());
    }
}
