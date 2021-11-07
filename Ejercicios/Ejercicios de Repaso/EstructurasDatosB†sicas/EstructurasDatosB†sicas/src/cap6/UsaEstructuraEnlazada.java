package cap6;

import cap2.Persona;
/**
 * @author Silvia Guardati
 * Programa 6.5
 * Ejemplo de aplicación de la clase EE (EstructuraEnlazada) para almacenar varios
 * objetos tipo Persona (progama 2.14, paquete cap2). Se hace uso de los métodos de la 
 * clase EE para procesar los datos guardados.
 */
public class UsaEstructuraEnlazada {
    
    public static void main(String[] args) {
        // Se construye un objeto tipo EE, parametrizando con la clase Persona.
        EE<Persona> invitados = new EE();
        
        // Se construyen 4 objetos tipo Persona.
        Persona p1 = new Persona("Jazmín García", "11/12/2001", "España 123", 'f');
        Persona p2 = new Persona("Mabel Osorio", "18/06/2000", "Junín 425", 'f');
        Persona p3 = new Persona("Matías Ulloa", "23/05/2002", "Santa Fe 890", 'm');
        Persona p4 = new Persona("Fernando Farrel", "02/04/2001", "Juárez 367", 'm');
        
        // Se agregan los objetos al final de la estructura enlazada.
        invitados.agregaFinal(p1);
        invitados.agregaFinal(p2);
        invitados.agregaFinal(p3);
        invitados.agregaFinal(p4);
        
        // Se imprime el contenido de la estructura enlazada.
        System.out.println("\nDatos de los invitados\n" + invitados);
                
        /* Se busca una persona en la estructura enlazada, indicando si está o no 
         * dentro de los invitados.
         */
        if (invitados.busca(p3))
            System.out.println("\n" + p3.getNombre() + " sí está invitado.");
        else
            System.out.println("\n" + p3.getNombre() + " no está invitado.");
        
        // Se elimina la primera persona almacenada en la estructura enlazada.
        System.out.println("\nSe quita al primer invitado: " + invitados.quitaPrimero());
        
         // Se imprime el contenido de la estructura enlazada, luego de la eliminación.
        System.out.println("\nDatos de los invitados\n" + invitados);
    }    
}
