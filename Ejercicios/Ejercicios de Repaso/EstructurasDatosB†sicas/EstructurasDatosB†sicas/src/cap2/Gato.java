
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.9
 * Definición de la clase Gato que implementa la interface Mascota. 
 */

public  class Gato implements  Mascota{
    private  String  nombre;
    private  String  nombreDueño;
    private  String  raza;
    private  char sexo;
   
    public  Gato(){
    }
   
    public  Gato(String  nom, String  nomDue, String  ra, char s){
        nombre = nom;
        nombreDueño = nomDue;
        raza = ra;
   	sexo = s;
    }
   
    public  void  come(){
        System.out.println("\nLos gatos comen croquetas para gatos.");
    }
   
    public  void  duermeEn(){
        System.out.println("\nLos gatos duermen en sus camas o en un sillón.");
    }
   
    public  void  juega(){
        System.out.println("\nA los gatos les gusta jugar con ovillos de lana.");
    }
      
    public  String  toString (){
        StringBuilder  cad = new StringBuilder();

        cad.append("\n\nNombre del gato: " + nombre + " y le pertenece a: " + nombreDueño);
        cad.append("\n" + nombre + " es: ");
        if (sexo == 'f' || sexo == 'F') 
            cad.append("hembra ");
        else 
            cad.append("macho ");
        cad.append("y de la raza: " + raza);
        return cad.toString();
    }
}

