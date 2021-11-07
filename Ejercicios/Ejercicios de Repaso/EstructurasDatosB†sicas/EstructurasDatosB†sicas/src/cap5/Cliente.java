
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.4
 * Clase que define el concepto "Cliente". Se usará para probar un arreglo genérico
 * ordenado. Por lo tanto esta clase debe implementar la interface Comparable de
 * Java, la cual obliga a implementar el método compareTo().
 */
public  class Cliente implements Comparable <Cliente>{
    String nombre;
    String domicilio;
    double saldo;

    public  Cliente(){
    }

    public  Cliente(String  nom, String dom, double sal){
        nombre = nom;
        domicilio = dom;
        saldo = sal;
    }

    /* Sólo se recibe el nombre. Es muy útil para crear objetos auxiliares para
     * realizar comparaciones, tanto con el equals() como con el compareTo().
     */
    public  Cliente(String  nom){
        nombre = nom;
    }

    public  String  toString (){
        return "\nNombre: "+ nombre + "\nDomicilio: " + domicilio + "\nSaldo: " + saldo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double sal){
        saldo = sal;
    }

    /* Sobrecarga del método para determinar si el cliente que invocó al método es
     * mayor, menor o igual que el "otro" cliente. El orden será alfabético, dado
     * por el nombre de los clientes.
     */
    public int compareTo(Cliente otro) {
        return nombre.compareTo(otro.nombre);
    }

    // Dos clientes son iguales si tienen el mismo nombre. El método se sobreescribe.
    public boolean equals(Object otro){
        boolean resp = false;
        if (otro != null && otro instanceof Cliente)
                resp = nombre.equalsIgnoreCase(((Cliente)otro).nombre);
        return resp;
    }
}

