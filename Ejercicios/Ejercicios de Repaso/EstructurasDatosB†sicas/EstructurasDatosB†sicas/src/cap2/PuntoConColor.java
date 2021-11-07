
package cap2;

/** 
 * @author Silvia Guardati
 * Programa 2.29
 * Ejemplo de clase "final": no podrán derivarse otras clases a partir de ésta.
 */
public final class PuntoConColor extends Punto{
    private String color;

    public PuntoConColor() {
    }

    public PuntoConColor(String color, double x, double y) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "- Color= " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
