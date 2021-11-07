
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.9
 * Se define la clase Dirección.
 */
public  class Dirección {
    String  calle;
    int numExt, numInt;
    String  ciudad;
    int CP;
    String  país;
	
    public  Dirección(){
    }
	
    public  Dirección(String  ca, int nE, int nI, String  ciu, int cp, String  pa){
         calle = ca;
         numExt = nE;
	 numInt = nI;
	 ciudad = ciu;
	 CP = cp;
	 país = pa; 
    }
	
    public  String  toString (){
        StringBuilder cad = new StringBuilder();

        cad.append("\nCalle: " + calle + " " + numExt + " - " + numInt);
	cad.append("\nCP: " + CP + " - " + ciudad + "\n" + país);
	return cad.toString();
    }
}

