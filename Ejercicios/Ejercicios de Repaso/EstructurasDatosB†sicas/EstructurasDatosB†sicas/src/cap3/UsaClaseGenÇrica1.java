
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.10
 * Ejemplo de uso de clases genéricas, basado en los programas 3.8 y 3.9.
 */
public class UsaClaseGenérica1 {
    
    public static void main(String[] args) {
        
        /* Se declara e instancia un objeto de tipo Cliente, usando una cadena para darle 
         * valor al atributo domicilio.  
         */
        Cliente cliente1 = new Cliente("Joaquín Lobos", "México, D.F. - México");
        
        /* Se declara e instancia un objeto de tipo Cliente, usando un número entero 
         * para darle valor al atributo domicilio.  
         */
        Cliente cliente2 = new Cliente("Marina Estrada", 25);
        
        /* Se declara e instancia un objeto de tipo Direccion. */
        Dirección unaDirec = new Dirección("9 de julio", 587, 3, "Santa Fe", 3000, "Argentina"); 
        
        /* Se declara e instancia un objeto de tipo Cliente, usando un objeto de tipo Dirección 
         * para darle valor al atributo domicilio. 
         */
        Cliente cliente3 = new Cliente("Pilar Gómez", unaDirec);
        
        /* Se imprimen los 3 objetos, cada uno de ellos con distintos tipos de datos
         * asignados al atributo domicilio.
         */
        System.out.println(cliente1); // Tiene una cadena
        System.out.println(cliente2); // Tiene un número entero
        System.out.println(cliente3); // Tiene un objeto tipo Dirección
        
        /* Se cambia dinámicamente -durante la ejecución- el domicilio del 
         * cliente2, asignándole un nuevo objeto de tipo Dirección.
         */
        cliente2.setDomicilio(new Dirección("Reforma", 820, 4, "México DF", 1050, "México"));
        System.out.println(cliente2);
        
        /* Como el atributo domicilio es de tipo Object, si se quiere recuperar con la forma 
         * del dato que se le asignó, se debe convertir explícitamente.
         * En este caso la conversión es al tipo String.
         */
        String direc = (String) cliente1.getDomicilio();
    }    
}
