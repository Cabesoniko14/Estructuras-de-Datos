
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.12
 * Definición de la calse Mamífero como clase derivada de la clase Animal.
 */
public class Mamífero extends Animal{
    private  int numMamas;
   
 /* Constructor por omisión. El compilador se encarga de invocar al  constructor 
  * por omisión de la súper clase. 
  */    
    public  Mamífero(){
    }
   
 /* Constructor con parámetros. La primer línea de código corresponde a la 
  * invocación del constructor con parámetros de la súper clase. 
  */
    public  Mamífero(String  nom, String  hab, int numM) {
        super(nom, hab);
        numMamas = numM;
    }
   
    public  void  setMamas(int num){
        numMamas = num;
    }
   
 /* Despliega los valores de los atributos de un mamífero, incluyendo aquellos que hereda
  * de la súper clase. Usa la palabra super para invocar un método de la clase base. 
  */
    public  String  toString (){
        StringBuilder cad = new StringBuilder();

        cad.append(super.toString ());
        cad.append("Número de mamas: " + numMamas + "\n");
        return cad.toString();
    }
}
