
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.8
 * Uno de los atributos se define de tipo Object, permitiendo que al instanciar
 * objetos de esta clase, se les pueda dar distintos tipos de datos.
 */
public  class Cliente {
    String nombre;
    Object domicilio;
	
    public  Cliente(){
    }
	
    public  Cliente(String  nom, Object dom){
        nombre = nom;
        domicilio = dom;
    }
	
    public  String  toString (){
        return "\nNombre: "+ nombre + "\nDomicilio: " + domicilio;
    }

    public Object getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Object domicilio) {
        this.domicilio = domicilio;
    }
    
    // Sobrescritura del método equals()
    public boolean equals(Object c){
        boolean resp = false;
        
        if (c != null && c instanceof Cliente)
            resp = ((Cliente)c).nombre.equalsIgnoreCase(nombre);
        return resp;
   }
}

