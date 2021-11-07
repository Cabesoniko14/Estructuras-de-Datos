
package cap2;
import java.util.Calendar; // Importa la clase Calendar de Java

/**
 * @author Silvia Guardati
 * Programa 2.26
 * Ejemplo de método "final".
 */
public class Vehículo {
    private String numSerie, numMotor;
    private double precioFactura;
    private int año;

    public Vehículo() {
    }

    public Vehículo(String numSerie, String numMotor, double precioFactura, int año) {
        this.numSerie = numSerie;
        this.numMotor = numMotor;
        this.precioFactura = precioFactura;
        this.año = año;
    }

    @Override
    public String toString() {
        return "NumSerie= " + numSerie + "\nNumMotor= " + numMotor + "\nAñoo= " + año;
    }
    
    /* El método calcula el impuesto anual a pagar por un vehículo. Éste se determina
     * por el precio de compra (factura) y, de acuerdo a su antigüedad se aplica un
     * descuento.
     * El método es "final", por lo tanto ninguna subclase podrá sobrescribirlo.
     */
    public final int calcImpuestoAnual(){
        double impuesto;
        // La clase Calendar se usa como auxiliar para indentificar el año actual.
        Calendar fecha = Calendar.getInstance();
        int añoActual, totalAños;
        
        añoActual = fecha.get(fecha.YEAR); // Se obtiene el año actual.
        totalAños = añoActual - año;
        impuesto = precioFactura * 0.035;
        if (totalAños >= 5 && totalAños < 10)
            impuesto = impuesto * 0.97;
        else
            if (totalAños >= 10 && totalAños <= 15)
                impuesto = impuesto * 0.94;
            else
                if (totalAños > 15)
                    impuesto = impuesto * 0.90;
        return (int) impuesto;
    } 
}
