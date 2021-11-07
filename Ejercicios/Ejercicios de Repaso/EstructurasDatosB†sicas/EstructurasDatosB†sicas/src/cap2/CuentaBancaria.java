
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.16
 * Definición de una clase que representa, de manera muy simplificada, 
 * una cuenta bancaria.
 */

public  class CuentaBancaria{
    private static int serie = 1000;
    private  int  numCta;
    private  String  nomTitular;
    private  double saldo = 0.0;
   
    public  CuentaBancaria(){
        numCta = ++serie;
    }
   
    public  CuentaBancaria(String  nom, double sal){
        this();
        nomTitular = nom;
        saldo = sal;
    }
    
    /* Se define como protegido para que sólo sus clases derivadas puedan 
     * hacer uso de él.
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCta() {
        return numCta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public  String  toString () {
        StringBuilder  cad = new StringBuilder();

        cad.append("\n\nNúmero de cuenta: " + numCta + "\nNombre del titular: " + nomTitular);
        cad.append("\nSaldo: $" + saldo + "\n");
        return cad.toString();
    }       
   
    /*
    * Registra un depósito en la cuenta bancaria. Para ello valida que el monto a
    * depositar sea mayor que 0. Regresa true si la operación se efectúa con 
    * éxito y false en caso contrario. 
    */
    public  boolean depósito(double monto){
        boolean resp = false;

        if (monto > 0){
   	    saldo = saldo + monto;
   	    resp = true;
   	}
        return resp;
    }
   
    /*
     * Registra un retiro de la cuenta bancaria. Si el monto es un valor mayor
     * o igual a cero y el saldo de la cuenta es mayor o igual que el monto a 
     * retirar, actualiza el saldo y regresa true. 
     * En caso contrario no altera el saldo y regresa false.
    */
    public  boolean retiro(double monto){
        boolean resp = false;

   	 if (monto > 0 && saldo >= monto){
   	     saldo = saldo - monto;
   	     resp = true;
   	 }
        return resp;
    }
}

