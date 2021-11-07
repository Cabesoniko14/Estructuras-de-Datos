
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.11
 * Definición de la clase Animal para ejemplificar la herencia simple.
 */

public class Animal {
    private  String  nombre;
    private  String  hábitat;
   
    public  Animal(){
    }
   
    public  Animal(String  nom, String  hab){
        nombre = nom;
   	hábitat = hab;
    }

    public  void  setHábitat(String  nuevo){
        hábitat = nuevo;
    }
   
   public  String  toString (){
        return "Nombre: " + nombre + "\nHabita en: " + hábitat + "\n";
    }
}
