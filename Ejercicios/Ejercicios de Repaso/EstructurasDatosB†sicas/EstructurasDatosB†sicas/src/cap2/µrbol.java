
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.22
 * Ejemplo de herencia de múltiples niveles.
 */

public  class Árbol{
    private  String  nombre;
    private  double altura;
    private  String  regiónClima;

    public  Árbol(){
    }	

    public  Árbol(String  nom, double alt, String  rC){
        nombre = nom;
        altura = alt;
        regiónClima = rC;
    }	
	
    public  String  toString (){
        return "Datos del Árbol: \n" + "Nombre:\t" + nombre + "\nAltura:\t" + altura + "\nRegión-Clima: " + 
                   regiónClima + "\n";
    }
}

