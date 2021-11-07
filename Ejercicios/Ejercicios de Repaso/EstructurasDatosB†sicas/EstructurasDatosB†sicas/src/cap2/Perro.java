
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.10
 * Definición de la clase Perro que implementa la interface Mascota. 
 */

public  class Perro implements  Mascota{
    private  String  nombre;
    private  String  raza;
    private int edad;
   
    public  Perro(){
    }
   
    public  Perro(String  nom, String  ra, int e){
        nombre = nom;
        raza = ra;
        edad = e;
    }
   
    public  void  come(){
        System.out.println("\nLos perros comen croquetas para perros.");
    }
   
    public  void  duermeEn(){
        System.out.println("\nLos perros duermen en sus camas o sobre la cama de su dueño.");
    }
   
    public  void  juega(){
        System.out.println("\nA los perros les gusta jugar con pelotas y correr detrás de los niños.");
    }

    public  String  toString (){
        StringBuilder  cad = new StringBuilder();

        cad.append("\n\nNombre del perro: " + nombre);
   	cad.append("\nEs de la raza: " + raza + " y tiene: " + edad + " años.");
        return cad.toString();
    }
}
