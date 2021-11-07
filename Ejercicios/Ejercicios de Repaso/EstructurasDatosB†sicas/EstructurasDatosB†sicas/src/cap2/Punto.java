
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.28
 * Clase que define un punto, teniendo sus coordenadas como atributos.
 */
public class Punto {
    private double x, y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto: (" + "x= " + x + ", y= " + y + ')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
