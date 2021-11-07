
package cap2;

/**
 * @author Silvia Guardati
 * Ejemplo de métodos estáticos
 */
public  class Cuenta{
    private static int totalCuentas = 0;  // Atributo estático
    private  int  numCta;
    private  String  nomTitular;
    private  double saldo = 0.0;
   
    public  Cuenta(){
        numCta = ++totalCuentas; // Se asigna un valor al atributo a partir del miembro estático
    }
   
    public  Cuenta(String  nom, double sal){
        this();
        nomTitular = nom;
        saldo = sal;
    }
    
    public String toString(){
        return "Titular: " + nomTitular + "\nNúmero de cuenta: " + numCta;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }
    
}
