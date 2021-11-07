
package cap3;

/**
 * @author Silvia Guardati
 * Ejercicio 2 - Capítulo 3
 */
public class Cuadrado extends Cuadrilátero{

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calculaÁrea() {
        return lado1 * lado2;
    }

    @Override
    public double calculaPerímetro() {
        return lado1 * 4;
    }
    
    @Override
    public String toString() {
        return "\nLado del cuadrado: " + lado1;
    }
}
