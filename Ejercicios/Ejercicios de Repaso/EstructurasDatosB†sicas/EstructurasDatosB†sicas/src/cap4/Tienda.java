
package cap4;

/**
 * @Silvia Guardati
 * Programa 4.7
 * Clase Tienda que usa los métodos de la clase OAG para realizar las operaciones 
 * sobre el arreglo de nombres de productos.
 */
public class Tienda {
    private String nombre, dirección;
    private String nomProductos[];
    private int totalProd;
    private final int MAX_PROD = 50;

    /* Se instancia el arreglo declarado como atributo y se indica que el total
     * de elementos guardados en el arreglo es 0.
     */
    public Tienda() {
        nomProductos = new String[MAX_PROD];
        totalProd = 0;
    }

    // Además de instanciar el arreglo, se asignan valores a algunos atributos
    public Tienda(String nombre, String dirección) {
        this();
        this.nombre = nombre;
        this.dirección = dirección;
    }
    
    public boolean consultaProducto(String nombre){
        int pos;
        
        pos = OAG.buscaSecuencialOrdenado(nomProductos, totalProd, nombre);
        /* Si el valor de pos es mayor o igual a cero, quiere decir que se encontró 
         * el producto, y por lo tanto regresará true. En caso contrario, regresará 
         * false indicando que la tienda no vende ese producto.
         */
        return pos >= 0; 
    }
    
    // Agrega un nuevo producto (no debe repetirse).
    public void altaProducto(String nombre){        
        totalProd = OAG.insertaOrdenadoSinRepetidos(nomProductos, totalProd, nombre);        
    }
    
    // Elimina uno de los productos que vende la tienda.
    public void bajaProducto(String nombre){
        totalProd = OAG.eliminaOrdenado(nomProductos, totalProd, nombre);
    }
    
    // Genera una lista con los nombres de todos los productos.
    public String listaProductos(){
        return OAG.imprime(nomProductos, totalProd);
    }
    
    public static void main(String[] args) {
        // Se construye un objeto tipo Tienda
        Tienda unaTienda = new Tienda("La última opción", "Callejón 4, número 123");
        
        // Se dan de alta algunos productos.
        unaTienda.altaProducto("Harina");
        unaTienda.altaProducto("Azúcar");
        unaTienda.altaProducto("Mermelada");
        unaTienda.altaProducto("Aceite");
        unaTienda.altaProducto("Sal");
        System.out.println("\nLista de productos: " + unaTienda.listaProductos());
        
        // Se elimina uno de los productos.
        unaTienda.bajaProducto("Mermelada");
        System.out.println("\nLista de productos: " + unaTienda.listaProductos());
        
        // Se consulta si la tienda vende harina. Debe dar una respuesta afirmativa.
        if (unaTienda.consultaProducto("Harina"))
            System.out.println("\nLa tienda sí vende harina.");
        else
            System.out.println("\nLa tienda no vende harina.");
        
        // Se consulta si la tienda vende tequila. Debe dar una respuesta negativa.
        if (unaTienda.consultaProducto("Tequila"))
            System.out.println("\nLa tienda sí vende tequila.");
        else
            System.out.println("\nLa tienda no vende tequila.");
    }
}
