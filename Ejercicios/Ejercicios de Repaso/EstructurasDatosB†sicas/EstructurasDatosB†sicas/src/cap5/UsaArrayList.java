package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.17
 * Ejemplo del uso de la clase Fábrica que tiene, entre sus atributos, un objeto
 * tipo ArrayList.
 */
public class UsaArrayList {
    public static void main(String[] args) {
        boolean resp;
        // Construye un objeto tipo Fábrica
        Fábrica unaFábrica = new Fábrica("Muebles y Accesorios, S.A.", "Calle 13-235");

        /* Agrega 3 clientes a la fábrica. Observe que se dan los datos
         * disponibles de los clienes, NO los objetos tipo Cliente.
         */
        resp = unaFábrica.altaCliente("Juan Pérez", "Reforma 180", 5890.50);
        if (!resp)
            System.out.println("\nJuan Pérez ya está registrado como cliente.");
        resp = unaFábrica.altaCliente("Alicia Domínguez", "Alcorta 350", 12320);
        if (!resp)
            System.out.println("\nAlicia Domínguez ya está registrado como cliente.");
        resp = unaFábrica.altaCliente("José Castro", "España 987", 8970.25);
        if (!resp)
            System.out.println("\nJosé Castro ya está registrado como cliente.");
        // Dado que no se quieren clientes repetidos, deberá imprimir el mensaje.
        resp = unaFábrica.altaCliente("Juan Pérez", "Reforma 180", 5890.50);
        if (!resp)
            System.out.println("\nJuan Pérez ya está registrado como cliente.");

        // Se despliega toda la información de la fábrica.
        System.out.println("\nDatos de la fábrica: " + unaFábrica);

        // Intenta eliminar un cliente que NO existe.
        resp = unaFábrica.bajaCliente("Mario Saenz");
        if (resp)
            System.out.println("\nEl cliente Mario Saenz fue dado de baja.");
        else
            System.out.println("\nMario Saenz no está registrado como cliente.");

         // Intenta eliminar un cliente que existe.
        resp = unaFábrica.bajaCliente("Juan Pérez");
        if (resp)
            System.out.println("\nEl cliente Juan Pérez fue dado de baja.");
        else
            System.out.println("\nJuan Pérez no está registrado como cliente.");

        // Se despliega toda la información de la fábrica.
        System.out.println("\nDatos de la fábrica: " + unaFábrica);

        // Se consultan los datos de clientes, dando los nombres de los mismos.
        System.out.println("\nConsulta " + unaFábrica.consultaCliente("Juan Pérez"));
        System.out.println("\nConsulta " + unaFábrica.consultaCliente("José Castro"));

        // Se despliega el total de clientes de la fábrica.
        System.out.println("\nTotal de clientes: " + unaFábrica.totalClientes());

        // Se despliega el acumulado de los saldos de todos los clientes.
        System.out.println("\nTotal saldos: $" + unaFábrica.calcTotalSaldo());
    }
}
