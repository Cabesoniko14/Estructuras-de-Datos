
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.1
 * Clase abstracta con un método abstracto -come().
 */
public abstract class Insecto {
    private int parDeAntenas = 1;
    private int parDePatas = 3;
    private int parDeAlas = 2;

    public Insecto() {
    }

    public Insecto(int pAn, int pPa, int pAl) {
        parDeAntenas = pAn;
        parDePatas = pPa;
        parDeAlas = pAl;
    }    
    
    // Método abstracto: se debe implementar en las clases derivadas.
    public abstract void come();

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append("tiene " + parDeAntenas + " par de antenas, ");
        cad.append(parDePatas + " pares de patas y " + parDeAlas + " pares de alas\n");
        return cad.toString();
    }
}
