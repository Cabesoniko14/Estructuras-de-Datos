
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.24
 * Ejemplo de herencia de múltiples niveles.
 * La clase Cítrico no tiene atributos, se define para contar con un tipo más específico
 * de frutas.
 */

public  class Cítrico extends Frutal{    
	
    public  Cítrico(String  nom, double alt, String  rC, String  tC, String  nF, String  col){
        super(nom, alt, rC, tC, nF, col);        
    }	

    public String toString() {
        return super.toString() + "Pertenece a la categoría de frutas cítricas\n";
    }   
}
