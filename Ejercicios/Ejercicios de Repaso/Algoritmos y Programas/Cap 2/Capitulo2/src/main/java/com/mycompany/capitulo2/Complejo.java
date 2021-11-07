
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.30
 * Define la clase que representa a un número complejo.
 */
public class Complejo {
    private double real;
    private double imaginario;

    public Complejo() {
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getImaginario() {
        return imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    
    @Override
    public String toString() {
        return  real + " - " + imaginario +"i";
    }
}

