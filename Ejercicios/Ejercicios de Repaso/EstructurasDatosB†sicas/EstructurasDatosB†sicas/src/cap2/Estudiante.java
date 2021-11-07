
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.15
 * Se define, de manera muy simple, el concepto Estudiante como una subclase de
 * la clase Persona. Un estudiante tiene atributos propios, además de todos los 
 * heredados de la super clase.
 */
public  class Estudiante extends Persona{
    private static int serie = 1000;   // Atributo estático
    private  int  clave;
    private  String  carrera;

    public Estudiante() {
        super();
        serie++;
        clave = serie; // Asigna una clave numérica única a cada estudiante.
    }
    
    public  Estudiante(String  n, String  fn, String  d, char s){
        super(n, fn, d, s);
        serie++;
        clave = serie; // Asigna una clave numérica única a cada estudiante.
    }
	
    public  Estudiante(String  n, String  fn, String  d, char s, String  c){
        this(n, fn, d, s);
        carrera = c;
    }	
	
    public  String  toString (){
        return super.toString () + "Clave:\t" + clave + "\nCarrera:\t" + carrera + "\n";
    }
	
    public  int  getClave(){
        return clave;
    }
	
    public  String  getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

