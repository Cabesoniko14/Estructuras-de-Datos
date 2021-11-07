package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.13
 * Ejemplo de herencia simple.
 */

public  class  UsaHerencia1{

    public  static void  main (String [] args) {
        
        // Se crea un objeto tipo Animal y se le asignan valores a sus atributos.
	
        Animal  x = new Animal("mosca", "planeta tierra");

        /* El constructor con parámetros de la clase Mamífero recibe los valores para instanciar
         * todos los atributos: los heredados y el específico de la subclase.
         */
        Mamífero cerda = new Mamífero("Rosita", "Granja", 14);
		
        System.out.println ("\n\nDatos del animal \n" + x);
        System.out.println ("\nDatos del mamífero\n" + cerda);
		
        /* Se asocia al objeto cerda –de la clase Mamífero- un método heredado 
         * de la clase Animal. 
         */
        cerda.setHábitat("Galpones de confinamiento");
        System.out.println ("\nDatos del mamífero\n" + cerda);
		
        /* Se asocia al objeto cerda –de la clase Mamífero- un método específico
         * de su clase.
         */ 
        cerda.setMamas(16);
        System.out.println ("\nDatos del mamífero\n" + cerda);
    }
}


