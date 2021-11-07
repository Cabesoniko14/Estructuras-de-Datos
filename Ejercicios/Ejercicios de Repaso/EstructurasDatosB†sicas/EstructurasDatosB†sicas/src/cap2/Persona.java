package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.14
 * Se define, de manera muy simple, el concepto Persona.
 */
public  class Persona{
    private  String  nombre = ""; 
    private  String  fechaNacimiento = "";     //día-mes-año
    private  String  domicilio = "";
    private  char sexo;
    
    public Persona(){
        
    }
	  
    public  Persona(String  n, String  fn, String  d, char s){
        nombre = n;
        fechaNacimiento = fn;
        domicilio = d;
        sexo = s;
    }	
	
    public  String  toString (){
        return "Nombre:\t" + nombre + "\nFecha Nacimiento:\t" + fechaNacimiento + 
                  "\nDomicilio:\t" + domicilio + "\nSexo:\t" + sexo + "\n";
    }
	
    public  void  setDomicilio(String  d){
        domicilio = d;
    }
	
    public  String  getNombre(){
        return nombre;	
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
	
    public  String  getDomicilio(){
        return domicilio;	
    }
	
    public  char getSexo(){
        return sexo;	
    }
}
