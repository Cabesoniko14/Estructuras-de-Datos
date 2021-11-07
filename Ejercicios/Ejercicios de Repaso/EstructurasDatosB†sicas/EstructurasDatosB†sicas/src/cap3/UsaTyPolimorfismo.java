
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.15
 * Ejemplo del uso del tipo T para generar variables polimórficas.
 */
public class UsaTyPolimorfismo {
    
    public static void main(String[] args) {
        
        /* Se declaran e instancian objetos de tipo Materia sin indicar un tipo para
         * T, por lo tanto las variables podrán funcionar como polimórficas.
         */
        Materia mat1 = new Materia(20002, "Álgebra II", 8);
        Materia mat2 = new Materia(5001, "Introducción a la Física", "Aprobada");
        Materia mat3 = new Materia(3010, "Programación I", 9.4);
        
        // Se imprimen las 3 materias.
        System.out.println("\n" + mat1 + mat2 + mat3);
        
        /* Se obtiene la calificación de la primer materia. Observe que se debe convertir
         * explícitamente el dato a tipo int, antes de asignarlo a la variable.
         */
        int calif1 = (int) mat1.getCalificación();
        System.out.println("\nLa calificación obtenida en " + mat1.getNombre() + " es: " + calif1);
        
        /* Se le asigna una nueva calificación a la primer materia, usando una 
         * constante tipo cadena de caracteres (antes un entero).
         */
        mat1.setCalificación("Aprobada");
        
        /* Se obtiene la calificación de la primer materia. Observe que se debe convertir
         * explícitamente el dato a tipo String, antes de asignarlo a la variable.
         */
        String calif2 = (String)mat1.getCalificación();
        System.out.println("\nLa calificación obtenida en " + mat1.getNombre() + " es: " + calif2);
    }    
}
