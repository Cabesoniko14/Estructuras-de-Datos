
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.3
 * La clase Abeja, como derivada de la clase abstracta Insecto, debe implementar
 * el método come().
 */
public class Abeja extends Insecto {
    private String tipo;

    public Abeja() {
    }
    
    /* Este constructor permite crear un objeto tipo Abeja tomando los valores
     * por omisión para los atributos heredados de Insecto.
     */
    public Abeja(String tipo) {
        super();
        this.tipo = tipo;
    }

    public Abeja(int pAn, int pPa, int pAl, String tipo) {
        super(pAn, pPa, pAl);
        this.tipo = tipo;
    }    

    @Override
    public String toString() {
        return "\nLa abeja " + super.toString() + "Esta abeja es de tipo: " + tipo;
    }

    @Override
    public void come() {
        System.out.println("\nLas abejas comen polen y néctar.");
    }
}
