
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.17
 * Ejemplo de herencia simple. Se define la clase CuentaCheques como una clase
 * derivada de la clase CuentaBancaria.
 */

public  class CuentaCheques extends CuentaBancaria{
    private  double canSobreGiro = 0.0; 
   
    public  CuentaCheques(){
        super();
        canSobreGiro = getSaldo() * 0.1;
    }
   
    public  CuentaCheques(String  nom, double sal){
        super(nom, sal);
        canSobreGiro = getSaldo() * 0.1;
    }
   
    public  String  toString (){
        StringBuilder  cad = new StringBuilder();
        
        cad.append(super.toString ());
        cad.append("\nCantidad sobre giro: " + canSobreGiro + "\n");
        return cad.toString();
    }
   
    /*
    * Registra la operación de retiro. Para ello debe sobrescribir el método retiro de 
    * la súper clase, ya que en el caso de una cuenta de cheques esta operación varía.
    * Un retiro se autoriza si el monto es menor o igual que el saldo o bien, si el saldo más 
    * la "cantidad autorizada para sobre giro" es mayor que el monto.
    */
    public  boolean retiro(double monto){
        boolean resp = false;

        if (super.retiro(monto)){
            canSobreGiro = getSaldo() * 0.1;
            resp = true;
        } else  
            if ((getSaldo() + canSobreGiro) >= monto){
                setSaldo(0);
                canSobreGiro = 0;
                resp = true;
            }
        return resp;
    }
   
    /*
     * Registra la operación de depósito. Para ello debe sobrescribir el método depósito
    * de la súper clase, ya que en el caso de una cuenta de cheques esta operación varía.
    * Un depósito implica no sólo la actualización del saldo sino también la de la cantidad
    * autorizada para sobre giros.
    */
    public  boolean depósito(double monto){
        boolean resp = false;

   	 if (super.depósito(monto)){
   	     canSobreGiro = getSaldo() * 0.1;
   	     resp = true;
   	 }
        return resp;
    }
}

