
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.20
 * Ejemplo del uso de objetos tipo Vector. Se prueba a través de un objeto tipo 
 * Salón, programa 5.19, el cual tiene un atributo que es tipo Vector.
 */
public class UsaVector {
    public static void main(String[] args) {
        boolean resp;
        Salón unSalón = new Salón("Bruno Bertoluzzi", "Programación II", 103);
        
        // Imprime el estado inicial del  salón.
        System.out.println(unSalón);
        
        /* Se dan de alta algunos estudiantes en el salón. Las 3 primeras son exitosas.
         * La última no.
         */
        resp = unSalón.altaEstudiante(4130, "Luis Urquiza", "Ing. en Computación", "56784083");
        if (resp)
            System.out.println("\nAlta exitosa: estudiante registrado en el salón");
        else
            System.out.println("\nAlumno repetido. No se registró.");
        resp = unSalón.altaEstudiante(5004, "Juan García", "Lic. en Informática", "84755891");
        if (resp)
            System.out.println("\nAlta exitosa: estudiante registrado en el salón");
        else
            System.out.println("\nAlumno repetido. No se registró.");
        resp = unSalón.altaEstudiante(3954, "Carla Duarte", "Ing. Industrial", "39561823");
        if (resp)
            System.out.println("\nAlta exitosa: estudiante registrado en el salón");
        else
            System.out.println("\nAlumno repetido. No se registró.");
        resp = unSalón.altaEstudiante(4130, "Luis Urquiza", "Ingeniería en Computación", "56784083");
        if (resp) 
            System.out.println("\nAlta exitosa: estudiante registrado en el salón");
        else
            System.out.println("\nAlumno repetido. No se registró.");
        
        // Se dan de alta algunas calificaciones para los estudiantes registrados en el salón
        resp = unSalón.altaCalifAlum(4130, 8.5);
        if (!resp)
            System.out.println("\nAlumno no registrado en el salón, no se pudo agregar calificación.");
        resp = unSalón.altaCalifAlum(4130, 9.3);
        if (!resp)
            System.out.println("\nAlumno no registrado en el salón, no se pudo agregar calificación.");
        resp = unSalón.altaCalifAlum(3954, 7.8);
        if (!resp)
            System.out.println("\nAlumno no registrado en el salón, no se pudo agregar calificación.");
        resp = unSalón.altaCalifAlum(3958, 10.0);
        if (!resp)  // Debe imprimir el mensaje.
            System.out.println("\nAlumno no registrado en el salón, no se pudo agregar calificación.");
        
        /* Imprime el salón luego de las altas de algunos estudiantes y de algunas
         * calificaciones.
         */        
        System.out.println(unSalón);
        
        // Obtiene e imprime el promedio de un estudiante.
        System.out.println("\nPromedio de Luis Urquiza: " + unSalón.calculaPromedio(4130));
        
        // Obtiene e imprime el teléfono de un estudiante.
        System.out.println("\nTeléfono de Carla Duarte: " + unSalón.consTeléfono(3954));
        
        // Obtiene e imprime el promedio de los estudiantes del salón.
        System.out.printf("\nPromedio del salón: %6.2f ", unSalón.calcPromedioSalón()) ;
        
        // Bajas de estudiantes. La primera con éxito, la segunda no.
        resp = unSalón.bajaEstudiante(4130);
        if (resp)
            System.out.println("\nBaja del estudiante exitosa.");
        else
            System.out.println("\nNo se pudo dar de baja: estudiante no registrado");
        resp = unSalón.bajaEstudiante(4786);
        if (resp)
            System.out.println("\nBaja del estudiante exitosa.");
        else
            System.out.println("\nNo se pudo dar de baja: estudiante no registrado");
        
        // Imprime el salón luego de las bajas.
        System.out.println(unSalón);        
    }    
}
