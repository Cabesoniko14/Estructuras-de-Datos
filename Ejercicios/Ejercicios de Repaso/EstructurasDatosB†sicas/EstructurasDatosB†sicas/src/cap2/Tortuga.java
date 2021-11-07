
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.8
 * Definición de la clase Tortuga que implementa la interface Mascota. 
 */

public  class Tortuga implements  Mascota{
    private  String  nombre;
    private  String  nombreDueño;
    private  String  especie;
   
   public  Tortuga(){
   }
   
   public  Tortuga(String  nom, String  nomD, String  esp){
       nombre = nom;
       nombreDueño = nomD;
       especie = esp;
   }
   
   /**
   @Se implementa el método de la interface.
   */
   public  void  come(){
       System.out.println("\nLas tortugas comen hojas de lechuga y pequeños peces.");                               
   }
   
   /**
   @Se implementa el método de la interface.
   */
   public  void  duermeEn(){
       System.out.println("\nLas tortugas duermen en peceras.");
   }
   
   /**
   @Se implementa el método de la interface.
   */
   public  void  juega(){
       System.out.println("\nLas tortugas no juegan con sus dueños.");
   }
   
   public  void  setNombreDueño(String  nuevoNom){
       nombreDueño = nuevoNom;
   }
   
   public  String  toString (){
       StringBuilder  cad = new StringBuilder();

       cad.append("\nNombre de la tortuga: " + nombre + " y le pertenece a: " + nombreDueño);
       cad.append("\n" + nombre + " es de la especie: " + especie);
       return cad.toString();
   }
   
    public static void main(String[] args) {
        Tortuga miMascota = new Tortuga("Manuelita", "Facundo", "japonesa");
        System.out.println(miMascota);

        miMascota.come();
        miMascota.duermeEn();
        miMascota.juega();
    }
}
