
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.25
 * Ejemplo de uso de herencia de múltiples niveles, basado en los programas 2.22,2.23 y 2.24
 */
public class UsaHerencia3 {
    
    public static void main(String[] args) {
        
        Árbol unCedro = new Árbol("cedro", 11.8, "Ecuador");
        Frutal unManzano = new Frutal("manzano", 10.6, "Río Negro, Argentina", "enero-febrero", "manzana", "roja");
        Cítrico unLimonero = new Cítrico("limonero", 4.3, "México", "todo el año", "limón", "amarillo");
        
        System.out.println(unCedro);
        System.out.println(unManzano);
        System.out.println(unLimonero);
    }
}
