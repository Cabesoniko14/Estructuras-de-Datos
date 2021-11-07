
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.18
 * Ejemplo de herencia simple. Se define la clase CuentaAhorro como una clase
 * derivada de la clase CuentaBancaria.
 */

public  class CuentaAhorro extends CuentaBancaria{
    private  double tasaInterés;
   
    public  CuentaAhorro(){
    }
    
    public  CuentaAhorro(String  nom, double sal, double inter){
        super(nom, sal);
        tasaInterés = inter;
    }
   
    public  String  toString (){
        StringBuilder  cad = new StringBuilder();
        
        cad.append(super.toString ());
        cad.append("\nInterés pagado: " + tasaInterés + "%\n");
        return cad.toString();
    }

    public double getTasaInterés() {
        return tasaInterés;
    }

    public void setTasaInterés(double tasaInterés) {
        this.tasaInterés = tasaInterés;
    }
   
    /*
    * Calcula el interés a pagar sobre el saldo de la cuenta. Como el atributo 
    * heredado es privado, debe usar el método getSaldo() para tener acceso a
    * su valor.
    */
    public  double calculaInterés(){
        return getSaldo() * tasaInterés / 100;
    }
}

