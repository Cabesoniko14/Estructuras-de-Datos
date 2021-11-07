
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.6
 * Ejemplo de clases anidadas. Se declara la clase Polígono con una clase interna, 
 * Triángulo, la cual se usará como auxiliar para el cálculo del área.
 */
public class PolígonoRegular {
    /* Un polígono regular es un polígono que tiene todos sus lados iguales.
     * En esta representación, un polígono queda definido por el total de lados,
     * el tamaño de sus lados y por el apotema (segmento que une el centro y la
     * mitad de cada lado del polígono).
     */    
    private int totalLados;
    private double lado, apotema;

    public PolígonoRegular() {
    }

    public PolígonoRegular(int totalLados, double lado, double apotema) {
        this.totalLados = totalLados;
        this.lado = lado;
        this.apotema = apotema;
    }
    
    /* El área de un polígono regular se puede calcular a partir del área de los
     * n triángulos que lo forman, siendo n el total de lados del polígono.
     */
    public double calculaÁrea(){
        double área;
        Triángulo triangInterno = new Triángulo(lado, apotema);
        
        área = totalLados * triangInterno.calculaÁrea();        
        return área;
    }
    
    /* Clase interna a la clase Polígono. En este caso se encapsula dentro de la
     * clase exterior y, al ser privada, no podrá ser usada fuera de ella.
     */
    private class Triángulo {
        private double base, altura;

        private Triángulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

       private double calculaÁrea(){
           return base * altura / 2.0;
       }         
    }   
}
