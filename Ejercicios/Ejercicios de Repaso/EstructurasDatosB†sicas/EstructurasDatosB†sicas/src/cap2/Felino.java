
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.20
 * Ejemplo de herencia de múltiples niveles.
 * Se define la clase Felino como derivada de la clase Mamífero, siendo ésta una
 * clase derivada de la clase Animal.
 */

public  class Felino extends Mamífero{
    private  String  caracCuerpo;
    private  boolean retraeGarras;
    
    // Constructor por omisión.
    public  Felino(){
    }
   
    // Constructor con parámetros.
    public  Felino(String  nom, String  hab, int nuM, String  carCue, boolean reGa){
       super(nom, hab, nuM);
       caracCuerpo = carCue;
       retraeGarras = reGa;
   }
   
   public  String  toString (){
       	StringBuilder cadena = new StringBuilder();

   	cadena.append(super.toString());
   	cadena.append("Características del cuerpo:  " + caracCuerpo + "\n");
   	if (retraeGarras)
           cadena.append("Este felino sí retrae las garras.  \n");
        else 
           cadena.append("Este felino no retrae las garras.  \n");
        return cadena.toString();
   }
}
