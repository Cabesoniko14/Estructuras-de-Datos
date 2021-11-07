
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.27
 * Esta clase hereda el método calcImpuestoAnual() de la clase Vehículo. No lo puede 
 * sobreescribir por ser "final".
 */
public class Auto extends Vehículo{
    private String color, marca, modelo;
    private int numPuertas;

    public Auto() {
    }

    public Auto(String color, String marca, String modelo, int numPuertas, String numSerie, String numMotor, double precioFactura, int año) {
        super(numSerie, numMotor, precioFactura, año);
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor= " + color + "\nMarca= " + marca + "\nModelo= " + modelo + "\nNúmero de puertas= " + numPuertas;
    }
}
