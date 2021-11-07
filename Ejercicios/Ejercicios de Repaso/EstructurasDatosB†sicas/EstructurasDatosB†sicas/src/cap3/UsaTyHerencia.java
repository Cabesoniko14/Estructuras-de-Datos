
package cap3;

import cap2.CuentaAhorro;
import cap2.CuentaCheques;

/***
 * @author Silvia Guardati
 * Programa 3.14
 * Se crean dos objetos de tipo Proveedor, dándole a T valor de CuentaCheques y
 * CuentaAhorro respectivamente.
 */
public class UsaTyHerencia {
    
    public static void main(String[] args) {
        CuentaCheques cuentaProv1 = new CuentaCheques("Juan Pérez", 5000);
        // T será sólo de tipo CuentaCheques
        Proveedor<CuentaCheques> prov1 = new Proveedor("Juan Pérez", 105, cuentaProv1);
        
        CuentaAhorro cuentaProv2 = new CuentaAhorro("Francisco López", 1000, 3.2);
        /* T será de tipo CuentaAhorro, pero al no parametrizar la declaración se
         * le podrá asignar posteriormente una cuenta de cheques.
         */
        Proveedor prov2 = new Proveedor("Darío García", 103, cuentaProv2);
        
        // Se imprimen los dos proveedores
        System.out.println(prov1);
        System.out.println(prov2);
        
        // Se accede al atributo cuentaDepósito, el cual mantiene su tipo
        prov1.getCuentaDepósito().depósito(1000);  
        
        // Se le asigna una cuenta de cheques al segundo proveedor.
        CuentaCheques otraCuenta = new CuentaCheques("Darío García", 0.0);
        prov2.setCuentaDepósito(otraCuenta);
    } 
}
