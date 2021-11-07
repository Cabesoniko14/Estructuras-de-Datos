
package cap3;

import cap2.CuentaBancaria;

/**
 * @author Silvia Guardati
 * Programa 3.13
 * Uso del tipo T restringiendo el tipo a emplear para asignarle valor.
 * En este caso sólo podrá ser alguna clase derivada a partir de CuentaBancaria.
 */

public  class Proveedor <T extends CuentaBancaria>{
    String  nombre;
    int clave;
    T cuentaDepósito;
    
    public  Proveedor(){
    }
	
    public  Proveedor(String  nom, int cla, T cuenta){
        nombre = nom;
        clave = cla;
        cuentaDepósito = cuenta;
    }
    
    public  String  toString (){
        StringBuilder cad = new StringBuilder();

	cad.append("\nNombre: " + nombre + "\nClave: " + clave + "\n");
	cad.append("El pago se realiza con depósito en la cuenta: " + cuentaDepósito.getNumCta());
        return cad.toString();
    }

    public T getCuentaDepósito() {
        return cuentaDepósito;
    }

    public void setCuentaDepósito(T cuentaDepósito) {
        this.cuentaDepósito = cuentaDepósito;
    }
}
