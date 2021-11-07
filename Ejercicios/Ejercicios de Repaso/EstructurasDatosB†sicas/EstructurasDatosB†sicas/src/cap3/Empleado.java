
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.5
 * Ejemplo de clase abstracta. 
 */
public abstract class Empleado{
    private  String  nombre; 
    private  String  fechaNacimiento;                                     
    private  String  domicilio;

    public Empleado() {
    }
     
    protected  Empleado(String  nom, String  fNac, String  dom){
         nombre = nom;
	 fechaNacimiento = fNac;
	 domicilio = dom;
    }	
	
    public  String  toString (){
        return "Nombre:\t" + nombre + "\nFecha Nacimiento: " + fechaNacimiento + 
                    "\nDomicilio: " + domicilio;
    }
	
    public  void  setDomicilio(String  dom){
        domicilio = dom;
    }
	
    public  String  getNombre(){
        return nombre;	
    }
	
    public  String  getFechaNacimiento(){
        return fechaNacimiento;	
    }
	
    public  String  getDomicilio(){
        return domicilio;	
    }
    
    /* Método abstracto, se indica sólo la firma. Se deberá implementar en las clases concretas 
     * definidas a partir de ésta.
     */ 
    public  abstract double calculaPago(double monto);
}
