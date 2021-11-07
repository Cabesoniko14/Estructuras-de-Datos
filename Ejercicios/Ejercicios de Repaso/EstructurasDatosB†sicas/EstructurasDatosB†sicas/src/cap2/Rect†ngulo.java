
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.2
 * Se define un rectángulo por medio de su base y de su altura. Además, se incluyen
 * métodos para el cálculo del área y del perímetro.
 */

public  class Rectángulo{
    private  double base;   
    private  double altura;
   
    /**
     * @Constructor por omisión. Los atributos toman los valores dados por omisión.
     */
    public  Rectángulo(){
        base = 0.0; 
        altura = 0.0;
    }
   
    /**
    * @Constructor con parámetros. Los atributos toman los valores dados a través 
    * de los parámetros.
    */
    public  Rectángulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
   
    /**
    * Calcula el área de un rectángulo.
    */
    public  double calculaArea(){
        return base * altura;
    }
   
    /**
    * Calcula el perímetro de un rectángulo.
    */
    public  double calculaPerímetro(){
        return 2 * (base + altura);
    }
}
