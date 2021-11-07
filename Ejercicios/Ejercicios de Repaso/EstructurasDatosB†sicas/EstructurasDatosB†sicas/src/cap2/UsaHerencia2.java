
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.21
 * Uso de herencia de múltiples niveles.
 * Se define un objeto de la clase Felino –programa 2.15-, se imprime y 
 * se modifica dicho objeto.
 */

public  class UsaHerencia2 {
	
    public  static void  main (String [] args) {
        Felino tigre = new Felino("Tigre de Bengala", "India", 4, "Crece hasta los 3 metros de largo y puede alcanzar hasta 280 kilos", true);
		
        /* Imprime datos del objeto tipo Felino. */
	 System.out.println ("\n\nDatos del felino\n\n" + tigre);		
               
        /* Actualiza el número de mamas mediante un método de la clase Mamífero. */
	tigre.setMamas(6);  		
		
        /* Actualiza el hábitat mediante un método de la clase Animal. */
	tigre.setHábitat("Nepal"); 

        /* Imprime datos del objeto tipo Felino. */
	System.out.println ("\n\nDatos actualizados del felino\n\n"  +  tigre);
  }
}
