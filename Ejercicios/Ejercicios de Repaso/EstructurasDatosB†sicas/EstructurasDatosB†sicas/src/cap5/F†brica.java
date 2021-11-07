
package cap5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Silvia Guardati
 * Programa 5.16
 * Ejemplo de aplicación de la clase ArrayList para almacenar una colección
 * de objetos tipo Cliente.
 */
public class Fábrica {
    private String nombre, domicilio;
    private ArrayList <Cliente> lisClientes;

    // Se construye un objeto tipo ArrayList.
    public Fábrica() {
        lisClientes = new ArrayList();
    }

    // Se construye un objeto tipo ArrayList y se asignan valores a algunos atributos.
    public Fábrica(String nombre, String domicilio) {
        this();
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    /* Regresa una cadena con todos los datos de la fábrica. Usa el método toString()
     * de la clase ArrayList.
     */   
    public String toString() {
        StringBuilder cad = new StringBuilder();

        cad.append("\nNombre: " + nombre + "\nDomicilio: " + domicilio);
        cad.append("\nLista de clientes:" + lisClientes);
        return cad.toString();
    }

    /* Agrega un nuevo cliente a la lista de clientes, asegurándose que no se
     * repita. Regresa true si lo inserta y false en caso contrario. Usa los métodos
     * contains() y add() de la clase ArrayList.
     */
    public boolean altaCliente(String nombre, String domic, double saldo){
        boolean resp = false;
        Cliente aInsertar = new Cliente(nombre, domic, saldo);

        if (!lisClientes.contains(aInsertar)){
            resp = true;
            lisClientes.add(aInsertar);
        }
        return resp;
    }

    /* Elimina un objeto tipo Cliente si está en la lista y regresa true.
     * En caso contrario, regresa false. Usa el método remove () de la clase ArrayList.
     */
    public boolean bajaCliente(String nombre){
         boolean resp;
        Cliente aQuitar = new Cliente(nombre);
        resp = lisClientes.remove(aQuitar);
        return resp;
    }

    /* Regresa una cadena con los datos de un cliente o un mensaje adecuado si
     * no está en la lista. La búsqueda se hace por nombre (revise el método equals() de la 
     * clase Cliente). Usa los métodos indexOf() y get() de la clase ArrayList.
     */
    public  String consultaCliente(String nombre){
        String res= "\n" + nombre + " no está registrado";
        int índice;
        Cliente aConsultar = new Cliente(nombre);

        índice = lisClientes.indexOf(aConsultar);
        if (índice >= 0)
            res = lisClientes.get(índice).toString();
        return res;
    }

    /* Regresa el número actual de clientes de la fábrica. Usa el método size() de la clase 
     * ArrayList.
     */
    public int totalClientes(){
        return lisClientes.size();
    }

    /* Regresa la suma de los saldos de todos los clientes. Usa el método iterator()
     * de la clase ArrayList, ya que todas las colecciones de datos de Java lo tienen.
     */
    public double calcTotalSaldo(){
        Iterator <Cliente> it = lisClientes.iterator();
        double totalSaldo = 0;

        while (it.hasNext())
            totalSaldo = totalSaldo + it.next().getSaldo();
        return totalSaldo;
    }
}
