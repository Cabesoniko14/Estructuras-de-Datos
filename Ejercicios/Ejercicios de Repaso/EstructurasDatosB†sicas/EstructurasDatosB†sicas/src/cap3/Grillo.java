package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.2
 * La clase Grillo, como derivada de la clase abstracta Insecto, debe implementar
 * el método come(). 
 */
public class Grillo extends Insecto{
    private String habita;

    public Grillo() {
    }
    
    /* Este constructor permite crear un objeto tipo Grillo tomando los valores
     * por omisión para los atributos heredados de Insecto.
     */
    public Grillo(String habita) {
        super();
        this.habita = habita;
    }

    public Grillo(int pAn, int pPa, int pAl, String habita) {
        super(pAn, pPa, pAl);
        this.habita = habita;
    }
    
    @Override
    public String toString() {
        return "\nEl grillo " + super.toString() + "Habita en " + habita;
    }

    @Override
    public void come() {
        System.out.println("\nLos grillos son omnívoros, comen hojas, tallos e insectos.");
    }
}
