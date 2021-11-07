
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.1
 * Se define, de manera muy simple, a un alumno por medio de tres atributos y 
 * algunos métodos.
 */

public  class Alumno{
    private  String  nombre;
    private  String  carrera;
    private  double  promedio;
   
    /**
    * @Constructor por omisión
    */
    public  Alumno(){
    }
   
    /**
    * @Actualiza la carrera de un alumno
    * Recibe una cadena como parámetro. El parámetro tiene el mismo nombre que
    * el atributo, por lo tanto se usa la palabra this para indicar que al atributo 
    * se le asigna el valor del parámetro.
    */
    public  void  setCarrera(String  carrera){
        this.carrera = carrera;    
    }

    /**
    * @Actualiza el promedio de un alumno
    * Recibe un número como parámetro. El parámetro tiene el mismo nombre que
    * el atributo, por lo tanto se usa la palabra this para indicar que al atributo 
    * se le asigna el valor del parámetro.
    */
    public  void  setPromedio(double  promedio){
        this.promedio = promedio;    
    }
   
    /**
     * @Regresa el promedio del alumno.
     */
    public  double getPromedio(){
        return promedio;
    }
}

