
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.23
 * Ejemplo de herencia de múltiples niveles.
 */

public  class Frutal extends Árbol{
    private  String  tiempoCosecha;
    private  String  nombreFruto;
    private  String  color;
	
    public  Frutal(String  nom, double alt, String  rC, String  tC, String nF, String col) {
        super(nom, alt, rC);
        tiempoCosecha = tC;
        nombreFruto = nF;
        color = col;
    }	
	
    public  String  toString (){
        return super.toString () + "Datos del fruto: \nNombre: " + nombreFruto + "\nColor: " 
                                            + color + "\nSe cosecha en: " + tiempoCosecha + "\n";
    }
}

