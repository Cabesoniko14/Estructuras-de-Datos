
package cap3;

/**
 * @author Silvia Guardati
 * Ejercicio 2 - Capítulo 3
 */
public class Triángulo extends Figura{
    private double lado1, lado2, lado3;

    public Triángulo() {
    }

    public Triángulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculaÁrea() {
        double s, área;
        
        s = 0.5 * (lado1 + lado2 + lado3);
        área = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return área;
    }

    @Override
    public double calculaPerímetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public String toString() {
        return "\nLados del triángulo: " + lado1 + " - " + lado2 + " - " + lado3;
    }
}
