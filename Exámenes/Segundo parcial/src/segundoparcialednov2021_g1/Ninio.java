
package segundoparcialednov2021_g1;

import java.util.Objects;

/**
 *
 * @author sguardati
 */
public class Ninio {
    private String nombre;
    private int edad;

    public Ninio() {
    }

    public Ninio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Ninio{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ninio other = (Ninio) obj;

        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}

