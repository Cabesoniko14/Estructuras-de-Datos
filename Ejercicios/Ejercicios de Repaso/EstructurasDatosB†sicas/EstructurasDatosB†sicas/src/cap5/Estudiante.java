
package cap5;
import java.util.Vector;

/**
 * @author Silvia Guardati
 * Programa 5.18
 * En la clase Estudiante se usa un objeto de la clase Vector para almacenar las
 * calificaciones. En los métodos se aprovechan las funcionalidades ofrecidas por
 * esta clase.
 */
public  class Estudiante{
    private  String  nombre, carrera, telef;
    private int clave;
    private  Vector<Double> calif;
    private final int MAX_CAL = 50;

   /* Se construye el objeto tipo Vector, indicando una capacidad inicial igual a
    * MAX_CAL.
    */
    public  Estudiante(){
        calif = new Vector(MAX_CAL);
    }

    // Se construye el objeto tipo Vector y se asignan valores a los demás atributos.
    public Estudiante(int clave, String nombre, String carrera, String telef) {
        this();
        this.clave = clave;
        this.nombre = nombre;
        this.carrera = carrera;
        this.telef = telef;
    }   
    
    // Se construye un objeto sólo con la clave. Auxiliar para búsquedas.
    public Estudiante(int cla){
        clave = cla;
    }
    
    //Actualiza la carrera del alumno
    public  void  setCarrera(String  carrera){
        this.carrera = carrera;
    }

    // Regresa la carrera del alumno.
    public String getCarrera() {
        return carrera;
    }

    // Regresa el nombre del alumno.
    public String getNombre() {
        return nombre;
    }
    
    // Regresa el teléfono del alumno.
    public String getTelef() {
        return telef;
    }
    
    /* Agrega una calificación al arreglo de calificaciones del alumno. 
     * Usa el método add() de la clase Vector.
     */
    public void altaCalif(double cal){
        calif.add(cal);
    }
    
    /* Regresa una cadena con los datos del alumno. Usa el método toString() de
     * la clase Vector.
     */
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("\n\nDatos del estudiante \nNombre: " + nombre);
        cad.append("\nCarrera: " + carrera + "\nCalificaciones: " + calif);
        return cad.toString();        
    }
   
    /* Calcula y regresa el promedio del alumno. Usa los métodos isEmpty(), size() 
     * y get() de la clase Vector.
     */
    public  double  calculaPromedio(){
        double  promedio;
        int i, totalCal;

        promedio = 0;
        if (!calif.isEmpty()){
            totalCal = calif.size();
            for (i = 0; i < totalCal; i++)
                promedio = promedio + calif.get(i);
            promedio = promedio / totalCal;
        }
        return promedio;
    }
    
    /* Se sobrescribe el método equals() de tal manera que pueda ser usado en clases 
     * genéricas para comparar dos objetos tipo Estudiante.
     */
    public boolean equals(Object otro){
        boolean resp = false;
        
        if (otro != null && otro instanceof Estudiante)
            resp = clave == ((Estudiante)otro).clave;
        return resp;
    }
}