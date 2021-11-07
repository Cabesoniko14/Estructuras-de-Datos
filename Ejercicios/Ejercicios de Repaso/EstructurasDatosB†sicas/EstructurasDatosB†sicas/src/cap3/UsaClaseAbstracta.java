
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.4
 * Ejemplo de uso de clases derivadas a partir de una clase abstracta, así como
 * del uso de una clase abstracta para referenciar objetos de clases concretas.
 * Observe que la variable "unInsecto", de tipo Insecto, almacena la referencia
 * a una clase concreta: Abeja. En ningún caso se instancian objetos tipo Insecto.
 */
public class UsaClaseAbstracta {
    
    public static void main(String[] args) {
        
        /* Se instancian objetos tipo Grillo y tipo Abeja usando las clases
         * respectivas. En ambos casos se asignan los valores por omisión a los 
         * atributos correspondientes a Insecto.
         */
        Grillo unGrillo = new Grillo("campo y casas");      
        Abeja unaAbeja = new Abeja("obrera");
        
        /* Se instancia un objeto tipo Grillo asignando valores a los
         * atributos correspondientes a Insecto. Por alguna razón, este grillo 
         * sólo tiene 2 pares de patas.
         */
        Grillo otroGrillo = new Grillo(1, 2, 2, "árboles");
        
        /* Se instancia un objeto tipo Abeja y se almacena su referencia en una
         * variable del tipo de la clase abstracta (Insecto).
         */
        Insecto unInsecto = new Abeja("reina");
        
        // Se imprimen todas las variables declaradas.
        System.out.println(unGrillo);       
        System.out.println(unaAbeja);
        System.out.println(otroGrillo);
        System.out.println(unInsecto);
     
        unGrillo.come(); // Se ejecuta el come() de la clase Grillo.
        unaAbeja.come(); // Se ejecuta el come() de la clase Abeja.
        unInsecto.come(); // Se ejecuta el come() de la clase Abeja.        
    }    
}
