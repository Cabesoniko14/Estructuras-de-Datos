
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.12
 * Ejemplo de uso de clase genéricas, en este caso la clase Materia que tiene un
 * atributo tipo T.
 */
public class UsaClaseGenérica2 {
    
    public static void main(String[] args) {
                
        /* Se declara e instancia un objeto de tipo Materia con el tipo número entero para 
         * asignarse al tipo T. Observe que se usa la clase Integer de Java porque se espera 
         * una clase, no un dato simple.
         */
        Materia<Integer> mat1 = new Materia(20002, "Álgebra II", 8);
        
        /* Se declara e instancia un objeto de tipo Materia con el tipo String para asignarse 
         * al tipo T. 
         */
        Materia<String> mat2 = new Materia(5001, "Introducción a la Física", "Aprobada");
        
        /* Se declara e instancia un objeto de tipo Materia con el tipo número de doble precisión
         * para asignarse al tipo T. Observe que se usa la clase Double de Java porque se espera 
         * una clase, no un dato simple.
         */
        Materia<Double> mat3 = new Materia(3010, "Programación I", 9.4);
        
        // Se imprimen las 3 materias.
        System.out.println("\n" + mat1 + mat2 + mat3);
        
        /* Se obtiene la calificación de la primer materia. Observe que se asigna directamente 
         * a una variable numérica entera, sin necesidad de convertir explícitamente el dato.
         */
        int calif1 = mat1.getCalificación();
        System.out.println("\nLa calificación obtenida es: " + calif1);
        
        
        /* Se le asigna una nueva calificación a la segunda materia, usando una constante tipo 
         * cadena de caracteres.
         */
        mat2.setCalificación("Reprobada");
        
        /* Se obtiene la calificación de la segunda materia. Observe que se asigna directamente 
         * a una variable cadena, sin necesidad de convertir explícitamente el dato.
         */
        String calif2 = mat2.getCalificación();
        System.out.println("\nLa calificación obtenida es: " + calif2);
    }
}
