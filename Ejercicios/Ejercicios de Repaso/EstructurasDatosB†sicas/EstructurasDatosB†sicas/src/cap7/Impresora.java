
package cap7;

/**
 * @author Silvia guardati
 * Programa 7.10
 * Se define una impresora por medio de su marca y de una cola de impresión que debe
 * atender. Las operaciones sobre la cola de impresión son: imprimir un archivo 
 * (se quita de la cola), encolar un archivo (se agrega un nuevo archivo a la cola) y
 * eliminar todos los archivos que son de un cierto tipo.
 */
public class Impresora {
    private String marca;
    private ColaADT<Archivo> colaImpresión;

    public Impresora() {
        colaImpresión = new ColaE<>();
    }

    public Impresora(String marca) {
        this();
        this.marca = marca;
    }
    
    /* Elimina de la cola de impresión el archivo que se imprime.
     * Si no se puede quitar un elemento de la cola regresa null.
     */
    public Archivo imprime(){
        Archivo impreso;
        
        try {
            impreso = colaImpresión.quita();
        }
        catch (Exception e){
            impreso = null;
        }                
        return impreso;
    }
    
    // Agrega un nuevo archivo a la cola de impresión.
    public void encola(String nombre, String tipo, int tamaño){
        colaImpresión.agrega(new Archivo(nombre, tipo, tamaño));
    }
    
    /* Elimina de la cola de impresión todos los archivos que sean del mismo tipo que
     * el recibido como parámetro. Luego de la eliminación, los elementos que quedan en la 
     * cola conservan el orden original. Regresa el total de archivos eliminados.
     */
    public int eliminaPorTipo(String tipo){
        int cont = 0;
        ColaE<Archivo> temporal = new ColaE<>();
        Archivo archi;
        
        while (!colaImpresión.estáVacía()){
            archi = colaImpresión.quita();
            if (archi.getTipo().equalsIgnoreCase(tipo)) {
                cont++;
            }
            else {
                temporal.agrega(archi);
            }
        }
        
        while (!temporal.estáVacía()) {
            colaImpresión.agrega(temporal.quita());
        }
            
        return cont;
    }
    
}
