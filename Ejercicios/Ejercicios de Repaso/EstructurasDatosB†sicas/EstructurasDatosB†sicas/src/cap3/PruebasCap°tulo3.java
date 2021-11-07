
package cap3;

import cap2.CuentaAhorro;
import cap2.CuentaBancaria;

/**
 * @author Silvia Guardati
 * Esta clase contiene dos métodos desarrollados para probar temas del tercer capítulo. 
 * Para una mayor claridad se agruparon en subprogramas
 * cuyos nombres hacen referencia al tema que están complementando.
 */
public class PruebasCapítulo3 {
    
    // Uso del try-catch para manejo de variables polimórficas.
    public static void pruebaTryCatchPolimorfismo(){        
        CuentaBancaria otraCuenta = new CuentaAhorro("Juan Pérez", 1500, 3.4);
        
        try{
            double interés = ((CuentaAhorro)otraCuenta).calculaInterés();
            System.out.println("\nInterés ganado: " + interés);                    
	}catch (Exception e){
	      	System.out.println("\nNO es una cuenta de ahorros\n");
	}       
    }
    
    // Uso de los métodos getClass() y getSimpleName() para manejo de variables polimórficas.
    public static void pruebagetClassgetSimpleNamePolimorfismo(){        
        CuentaBancaria unaCuenta = new CuentaAhorro("Julián Garduño", 3800, 4.5);
        
        if (unaCuenta.getClass().getSimpleName().equals("CuentaAhorro")){
            double interés = ((CuentaAhorro)unaCuenta).calculaInterés();
            System.out.println("\nInterés ganado: " + interés);
        }
        else
            System.out.println("\nNO es una cuenta de ahorro");       
    }
    
    public static void main(String[] args) {             
        pruebaTryCatchPolimorfismo();
        pruebagetClassgetSimpleNamePolimorfismo();
    }
}
