
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.11
 * Se define una clase genérica usando el tipo T para uno de los atributos de la misma. 
 * En este caso, el atributo calificación queda sin especificar su tipo. Por lo tanto, cada vez que
 * se instancie un objeto tipo Materia, se podrá indicar un tipo de dato para dicho atributo.
 */
 public  class Materia <T>{
    private  int clave;
    private  String  nombre;
    private  T calificación;
	
    public  Materia(){
    }
	
    public  Materia(int cla, String  nom, T cal){
        clave = cla;
        nombre = nom;
        calificación = cal;
    }
	
    public  String  toString (){
       return  "\nClave: " + clave + "\nNombre: " + nombre + "\nCalificación: " +
                    calificación + "\n";
    }
	
    // El método recibe un parámetro de tipo T
    public  void  setCalificación(T cal){
        calificación = cal;
    }

    // El método da un resultado de tipo T
    public  T getCalificación(){
        return calificación;
    }
    
    // Regresa el nombre de la materia
    public String getNombre() {
        return nombre;
    }
}
