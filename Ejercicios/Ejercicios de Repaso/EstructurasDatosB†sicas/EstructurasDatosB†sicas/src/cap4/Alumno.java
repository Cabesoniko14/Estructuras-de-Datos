
package cap4;

/**
 * @author Silvia Guardati
 * Programa 4.6
 * Ejemplo de aplicación de la clase OAE para la solución de problemas en los cuales
 * se requiere el uso de arreglos de enteros.
 */
public class Alumno{
    private String nombreAlum, nombreCar;
    private int califs[]; // Almacena las calificaciones obtenidas.
    private int matCur; // Almacena el total de materias cursadas.
    private final int MAX_MAT = 60; // Máximo de materias a cursar.

    /* Se instancia el arreglo declarado como atributo y se indica que el total
     * de elementos guardados en el arreglo es 0.
     */
    public Alumno() {
        califs = new int[MAX_MAT];
        matCur = 0;
    }

    // Además de instanciar el arreglo, se asignan valores a algunos atributos
    public Alumno(String nombreAlum, String nombreCar) {
        this();
        this.nombreAlum = nombreAlum;
        this.nombreCar = nombreCar;
    }
    
    /* El alumno termina de cursar una materia. Se guarda la calificación obtenida 
     * en el arreglo -si hay espacio- y se actualiza el total.
     */
    public boolean altaCalif(int cal){
        int n;
        boolean resp;
        
        resp = false;        
        n = OAE.insertaDesordenadoConRepetidos(califs, matCur, cal);
        if (matCur < n){
            resp = true; // Asigna true si se pudo insertar
            matCur = n; // Actualiza el total de materias cursadas
        }
        return resp;
    }
    
    // Método que regresa true si el alumno obtuvo al menos un 10.
    public boolean sacóDiez(){
        return OAE.buscaSecuencialDesordenado(califs, matCur, 10) >= 0;
    }
    
    // Método que imprime los datos del alumno, incluyendo las calificaciones.
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append("Alumno: " + nombreAlum);
        cad.append("\nCursa la carrera: "+ nombreCar);
        cad.append("\nCalificaciones: " + OAE.imprime(califs, matCur));
        return cad.toString();
    }
    
    public static void main(String[] args) {
        Alumno unAlumno = new Alumno ("Joaquín Gutiérrez", "Ingeniería Industrial");
        
        // Captura las calificaciones obtenidas por el alumno.
        unAlumno.altaCalif(6);
        unAlumno.altaCalif(9);
        unAlumno.altaCalif(10);
        unAlumno.altaCalif(7);
        unAlumno.altaCalif(8);
        
        // Informa si el alumno sacó al menos un 10.
        if (unAlumno.sacóDiez())
            System.out.println("¡Sí obtuvo al menos un diez!");
        else
            System.out.println("Hasta ahora no obtuvo ningún diez.");
        
        // Imprime todos los datos del alumno.
        System.out.println(unAlumno);
    }
}
