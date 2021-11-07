
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.3
 * Programa de aplicación de la clase Rectángulo. Se representan las alfombras 
 * y el piso del salón como rectángulos, y usando el método calculaArea() se
 * calculan los datos solicitados: total de m2 del salón que quedan cubiertos 
 * por las alfombras y total de m2 que no alcanzan a cubrirse. 
 */ 

public  class Alfombras{
		  
    public static void main (String [] args){
		
        Rectángulo alfom1, alfom2, piso;       
	double areaCub, areaDescub;
		
	// Instanciación de los objetos, usando el constructor con parámetros.
	alfom1 = new Rectángulo(3.8, 4.6);
	alfom2 = new Rectángulo(4.5, 2.3);
	piso = new Rectángulo(7.0, 6.5);
		
        // Uso del método de la clase Rectángulo para calcular área. 
	areaCub = alfom1.calculaArea() + alfom2.calculaArea();  // Área cubierta
	areaDescub = piso.calculaArea() - areaCub;              // Área sin cubrir
		
	System.out.println("\nÁrea del salón cubierta con alfombras: " + areaCub + " m2");
	System.out.println("\nÁrea del salón sin cubrir con alfombras: " + areaDescub + " m2\n\n");
    }
}

