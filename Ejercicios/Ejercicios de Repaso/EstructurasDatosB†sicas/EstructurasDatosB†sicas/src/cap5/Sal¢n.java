
package cap5;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Silvia Guardati
 * Programa 5.19
 * Ejemplo de uso de la clase Vector. En esta clase se usa un objeto tipo Vector
 * para almacenar una colección de objetos tipo Estudiante (programa 5.18).
 * Analice el uso del objeto tipo Vector y de sus métodos.
 */
public class Salón {
    private String nomProf, nomMateria;
    private int numSalón;
    private Vector<Estudiante> alumnos;
    private final int MAX_ALUM = 30;
    
    /* Se construye un objeto de tipo Vector indicando una capacidad inicial por medio
     * de MAX_ALUM y una capacidad de incremento igual a 5.
     */
    public Salón(){
        alumnos = new Vector(MAX_ALUM, 5);
    }

    // Se construiye el objeto tipo Vector y se asignan valores a los demás atributos.
    public Salón(String nomProf, String nomMateria, int numSalón) {
        this();
        this.nomProf = nomProf;
        this.nomMateria = nomMateria;
        this.numSalón = numSalón;
    }
    
    /* Agrega un estudiante al salón, siempre que no se repita. Usa los métodos
     * contains() y add() de la clase Vector.
     */
    public boolean altaEstudiante(int clave, String nom, String car, String tel){
        Estudiante aInsertar = new Estudiante(clave, nom, car, tel);
        boolean resp;
        
        resp = !alumnos.contains(aInsertar);
        if (resp)     // Si el alumno no está registrado en el salón.
            resp = alumnos.add(aInsertar);
        return resp;
    }
    
    /* Agrega una nueva calificación al alumno. Recibe como parámetros la clave del
     * alumno y la nueva calificación. Si el alumno está en el salón, se agrega la
     * calificación -en el objeto tipo Vector usado para tal fin- y regresa true.
     * Usa los métodos indexOf() y get() de la clase Vector.
     */
    public boolean altaCalifAlum(int clave, double cal){
        Estudiante unEstudiante = new Estudiante(clave);
        int índice;
        boolean resp = false;
        
        índice = alumnos.indexOf(unEstudiante);
        if (índice >= 0){
            resp = true;
            alumnos.get(índice).altaCalif(cal);
        }        
        return resp;
    }
    
    /* Elimina un estudiante del salón. Regresa true si puede eliminarlo. Usa el
     * método remove() de la clase Vector.
     */
    public boolean bajaEstudiante(int clave){
        Estudiante aQuitar = new Estudiante(clave); 
        
        return alumnos.remove(aQuitar);
    }
    
    /* Obtiene y regresa el promedio de un alumno. Si el alumno no está en el 
     * salón regresa -1. Usa los métodos indexOf() y get() de la clase Vector.
     */
    public double calculaPromedio(int clave){
        Estudiante unEst = new Estudiante(clave);
        int índice;
        double promedio = -1; // Si no se encuentra al alumno, regresará -1.
        
        índice = alumnos.indexOf(unEst);
        if (índice >= 0)
            promedio = alumnos.get(índice).calculaPromedio();
        return promedio;
    }
    
    /* Regresa el teléfono del alumno cuya clave se recibe. Si no se encuentra
     * regresa un mensaje. Usa los métodos indexOf() y get() de la clase Vector.
     */
    public String consTeléfono(int clave){
        Estudiante unEst = new Estudiante(clave);
        String tel;
        int índice;
        
        índice = alumnos.indexOf(unEst);
        if (índice >= 0)
            tel = alumnos.get(índice).getTelef();
        else
            tel = "-Ese estudiante no está en este salón-\n";
        return tel;        
    }
    
    /* Genera una cadena con todos los datos del salón. Usa los métodos isEmpty()
     * y toString() de la clase Vector.
     */
    public String toString(){
        StringBuilder cad = new StringBuilder("\nDATOS DEL SALÓN\n");
        
        cad.append("Profesor: " + nomProf);
        cad.append("\nMateria: " + nomMateria);
        cad.append("\nNúmero salón: " + numSalón);
        if (alumnos.isEmpty())
            cad.append("\nNo hay estudiantes asignados a este salón.");
        else
            cad.append("\nLista de estudiantes: " + alumnos);
        return cad.toString();
    }
    
    /* Obtiene y regresa el promedio de calificaciones de todos los estudiantes.
     * Usa los métodos isEmpty(), size() e iterator()de la clase Vector, este último 
     * porque todas las colecciones de datos de Java lo tienen.
     */
    public double calcPromedioSalón(){
        Iterator <Estudiante> it = alumnos.iterator();
        double promedio = 0;
        if (!alumnos.isEmpty()){
            while (it.hasNext())
                promedio = promedio + it.next().calculaPromedio();
            promedio = promedio / alumnos.size();
        }        
        return promedio;
    }
}
