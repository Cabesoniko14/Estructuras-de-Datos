
package cap5;

import cap3.Figura;
import cap3.Rectangulo;
import cap3.Triángulo;
import cap3.Cuadrado;

/**
 * @author Silvia Guardati
 * Programa 5.6
 * Ejemplo de arreglo polimórfico usando interfaces. Se retoma la interface Figura
 * del capítulo 3, así como las clases: Triángulo, Rectangulo y Cuadrado.
 */
public class EjemploArrePolimInterface {
          
    public static void main(String[] args) {        
        final int MAX = 10;
        /* Se construye un arreglo de tipo Figura, por lo tanto podrá almacenar objetos
         * de cualquiera de las clases que implementa a la interface.
         */
        Figura figurasGeom[] = new Figura[MAX];
        
        // Se almacenan algunos triángulos, cuadrados y rectángulos.
        figurasGeom[0] = new Triángulo(3.5, 3.5, 3.5);
        figurasGeom[1] = new Triángulo(4.2, 3.5, 3.2);
        figurasGeom[2] = new Triángulo(5.5, 5.5, 4.5);
        figurasGeom[3] = new Triángulo(6.3, 6.3, 6.3);
        figurasGeom[4] = new Cuadrado(8.5);
        figurasGeom[5] = new Cuadrado(6.2);
        figurasGeom[6] = new Cuadrado(7.0);
        figurasGeom[7] = new Rectangulo(6.0, 8.5);
        figurasGeom[8] = new Rectangulo(9.6, 12.0);
        figurasGeom[9] = new Rectangulo(3.3, 2.5);
        
        // Obtiene e imprime el total de cuadrados.
        System.out.println("\nTotal de cuadrados: " + cuentaCuadrados(figurasGeom, 10));
        
        // Imprime el área de todos los rectángulos.
        imprimeAreaDe(figurasGeom, 10, "Rectangulo");
        
        // Imprime el área de todos los triángulos.
        imprimeAreaDe(figurasGeom, 10, "Triángulo");        
    }   
    
    /* Método que imprime el área de la figura geométrica indicada por el
     * parámetro "clase".
     */
    public static void imprimeAreaDe(Figura arre[], int n, String clase){
        int i;
        
        System.out.println("\n\nImpresión de las áreas de las figuras tipo: " + clase);
        for (i = 0; i < n; i++)
            if (arre[i].getClass().getSimpleName().equals(clase))
                System.out.printf("%6.2f ", arre[i].calculaÁrea());
    }
    
    // Método que cuenta el total de cuadrados almacenados en el arreglo.
    public static int cuentaCuadrados(Figura arre[], int n){
        int i, cont;
        
        cont = 0;
        for (i = 0; i < n; i++)
            if (arre[i] instanceof Cuadrado)
                cont++;
        return cont;    
    }
}
