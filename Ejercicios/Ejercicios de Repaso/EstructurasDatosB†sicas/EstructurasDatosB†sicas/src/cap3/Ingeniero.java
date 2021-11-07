
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.6
 * Clase concreta que hereda de la clase Empleado.
 */
public  class Ingeniero extends Empleado{
    private  int numProyectos;

    public Ingeniero() {
    }
	
    public  Ingeniero(String  n, String  fn, String  d, int np){
        super(n, fn, d);
	numProyectos = np;
    }	
    
    /* Método heredado de Empleado y que debe implementar por ser un método 
     * abstracto. Se debe respetar la firma del método, según su declaración en
     * la clase base.
     */	
    public  double calculaPago(double monto){
        return numProyectos * monto;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }
	
    public  String  toString (){
        return "Ingeniero\n" + super.toString () + "\nNúmero de Proyectos:\t" + 
                      numProyectos  + "\n";
    }
}
