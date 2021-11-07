
package cap3;

/**
 * @author Silvia Guardati
 * Ejercicio 2 - Capítulo 3
 */
public abstract class Cuadrilátero extends Figura{
    protected double lado1, lado2, lado3, lado4;

    protected Cuadrilátero() {
    }

    protected Cuadrilátero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }    
}
