
package cap5;
import cap2.CuentaBancaria;
import cap2.CuentaAhorro;
import cap2.CuentaCheques;

/**
 * @author Silvia Guardati
 * Programa 5.7
 * Ejemplo de un arreglo polimórfico. Se usan las clases CuentaBancaria, CuentaAhorro
 * y CuentaCheques del capítulo 2.
 */
public class EjemploArrePolimHerencia {
    
    public static void main(String[] args) {
        
        final int MAX = 10;
        // Se construye un arreglo de CuentaBancaria
        CuentaBancaria cuentas[] = new CuentaBancaria[MAX];
        
        // Se asignan objetos usando las dos subclases de CuentaBancaria
        cuentas[0] = new CuentaAhorro("Juan del Campo", 5000, 5);
        cuentas[1] = new CuentaAhorro("Adriana García", 18000, 5.5);
        cuentas[2] = new CuentaCheques("Martín Soto", 5000);
        cuentas[3] = new CuentaAhorro("Martina Suculini", 9500, 4.8);
        cuentas[4] = new CuentaCheques("Gabriel Márquez", 17000);
        cuentas[5] = new CuentaCheques("Sofía Lorca", 6900);
        
        // Se imprime la información de todas las cuentas
        for (int i= 0; i < 6; i++)
            System.out.println(cuentas[i]);
        
        /* Se realiza un depósito en una de las cuentas. No se requiere conocer
         * de qué tipo de cuenta se trata, ya que el método depósito() es de la 
         * súper clase y, en el caso de la CuentaCheque está sobrescrito.
         */
        if (cuentas[1].depósito(1000))
            System.out.println("\nNuevo saldo: " + cuentas[1].getSaldo());
        else
            System.out.println("\nNo se pudo hacer el depósito");
        
        /* Se obtiene el interés generado por una de las cuentas de ahorro. Para 
         * ello se debe verificar primero si la cuenta es una cuenta de ahorro. En
         * caso afirmativo, convirtiendo explícitamente a CuentaAhorro, se invoca
         * al método calculaInterés().
         */
        if (cuentas[3] instanceof CuentaAhorro){
            double interés = ((CuentaAhorro)cuentas[3]).calculaInterés();
            System.out.println("\nInterés obtenido: " + interés);
        }            
        else
            System.out.println("\nEsa cuenta no es de ahorro");
    }
}
