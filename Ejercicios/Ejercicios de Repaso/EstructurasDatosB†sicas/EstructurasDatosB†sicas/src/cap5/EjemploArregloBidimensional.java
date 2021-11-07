
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.15
 * Uso de la clase RecursosHumanos la cual tiene un atributo tipo ArregloBidimensional.
 */
public class EjemploArregloBidimensional {
    public static void main(String[] args) {
        
        // Se construye un objeto tipo RecursosHumanos.
        RecursosHumanos oficRH = new RecursosHumanos("Yolanda Pérez", "59762455");
        
        /* Se asigna el total de departamentos que maneja la tienda y el total de 
         * meses de los cuales se tiene registro.
         */
        if (oficRH.asignaDeptos(3) && oficRH.asignaMeses(6)) {
            /* Se asignan los nombres de los empleados que se destacaron a lo largo de
             * los últimos 6 meses en cada uno de los departamentos.
             */
            oficRH.asignaEmpleado(0, 0, "Silvia Martínez");
            oficRH.asignaEmpleado(0, 1, "Matías Uriarte");
            oficRH.asignaEmpleado(0, 2, "Alicia Noble");

            oficRH.asignaEmpleado(1, 0, "Bruno Bertolucci");
            oficRH.asignaEmpleado(1, 1, "Pedro Ramírez");
            oficRH.asignaEmpleado(1, 2, "Luis Gallici");        

            oficRH.asignaEmpleado(2, 0, "Silvia Martínez");
            oficRH.asignaEmpleado(2, 1, "María DallaCosta");
            oficRH.asignaEmpleado(2, 2, "Dolores Urreaga");
        
            oficRH.asignaEmpleado(3, 0, "Silvia Martínez"); 
            oficRH.asignaEmpleado(3, 1, "Luis Gallici");
            oficRH.asignaEmpleado(3, 2, "Martín Delgado");

            oficRH.asignaEmpleado(4, 0, "Sonia Vázquez"); 
            oficRH.asignaEmpleado(4, 1, "Inés Pérez");
            oficRH.asignaEmpleado(4, 2, "Martín Delgado");

            oficRH.asignaEmpleado(5, 0, "Irene Sánchez"); 
            oficRH.asignaEmpleado(5, 1, "Analía García");
            oficRH.asignaEmpleado(5, 2, "Juan Lamas");
               
            // Despliega el nombre de todos los empleados destacados, por mes.
            System.out.println("\n " + oficRH.generaListaEmpleados());

            // Si el empleado dado como parámetro se destacó en el mes dado, se informa.
            if (oficRH.consultaEmpleadoyMes(4, "Inés Pérez"))
                System.out.println("\nInés Pérez sí se destacó en mayo.");

            /* Obtiene e imprime el total de meses en los que se destacó la empleada
             * Silvia Martínez, del primer departamento.
             */
            int n;
            n = oficRH.consultaPorDepto(0, "Silvia Martínez");
            System.out.println("\nSilvia Martínez: " + n + " veces");
        }
        else
            System.out.println("\nDatos fuera de rango.");
    }
}
