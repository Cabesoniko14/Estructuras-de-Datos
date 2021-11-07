
package cap7;

/**
 * @author Silvia Guardati
 * Programa 7.9
 * Se representa de manera simple un archivo por medio de su nombre, tipo y tamaño.
 */
public class Archivo {
    private String nombre, tipo;
    private int tamaño;

    public Archivo() {
    }

    public Archivo(String nombre, String tipo, int tamaño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    
    public String toString(){
        return "\n" + nombre + " - " + tipo + " " + tamaño;
    }
    
    /* Compara si dos archivos son iguales, considernado todos sus atributos.
     * Si el objeto dado no es un archivo regresa false.
     */
    public boolean equals(Object otro){
        boolean resp;
        try {
            Archivo archi = (Archivo) otro;
            resp = nombre.equalsIgnoreCase(archi.nombre) && tipo.equalsIgnoreCase(archi.tipo) && tamaño == archi.tamaño;
        }
        catch (Exception e){
            resp = false;
        }        
        return resp;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getTamaño() {
        return tamaño;
    }
}
