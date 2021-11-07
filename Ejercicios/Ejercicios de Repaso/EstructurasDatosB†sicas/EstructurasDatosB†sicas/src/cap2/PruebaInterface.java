
package cap2;

/** *
 * @author Silvia Guardati
 * Ejemplo del uso de interfaces y de clases concretas que las implementan, basado
 * en los programas 2.7, 2.8, 2.9 y 2.10.
 * 
 */
public class PruebaInterface {
    public static void main(String[] args) {
        Tortuga miMascota = new Tortuga("Manuelita", "Julián", "japonesa");
        System.out.println(miMascota);
        miMascota.come();
        miMascota.duermeEn();
        miMascota.juega();

        Gato tuMascota = new Gato("Minino", "Mauricio", "Persa", 'm');
        System.out.println(tuMascota);
        tuMascota.come();
        tuMascota.duermeEn();
        tuMascota.juega();

        Perro suMascota = new Perro("Charrúa", "Labrador", 4);
        System.out.println(suMascota);
        suMascota.come();
        suMascota.duermeEn();
        suMascota.juega();
    }
    
}
