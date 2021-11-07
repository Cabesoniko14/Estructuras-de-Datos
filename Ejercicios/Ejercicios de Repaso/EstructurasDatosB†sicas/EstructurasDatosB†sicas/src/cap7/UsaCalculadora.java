
package cap7;

/**
 * @author Silvia Guardati
 * Programa 7.5
 * Ejemplo del uso de la clase Calculadora.
 */
public class UsaCalculadora {
    
     public static void main(String[] args) {
         // Se construye un objeto tipo Calculadora, asignádole una expresión
         Calculadora c = new Calculadora("20 + 4");
         
         // Se evalúa la expresión
         c.calcula();
         // Se imprime el resultado
         System.out.println("\nResultado 1: " + c.getResultado());
        
         // Se asigna un nuevo valor a la expresión
        c.setEntrada("( ( 256.0 + 18.0 ) * -3 ) / ( 8.0 * 2 - 16 )");
        
        /* Se evalúa y se imprime usando un try catch para evitar un error durante
         * la ejecución del método. En este caso debe imprimir el mensaje que aparece
         * en la claúsula catch()
         */
        try{
            if (c.calcula())
                System.out.println("\nResultado 2: " + c.getResultado());
            else
                System.out.println("\nError en la expresión. Revise los paréntesis.");
        } catch (Exception e){
            System.out.println("\nDivisión entre 0");
        }
                
        // Se asigna un nuevo valor a la expresión
        c.setEntrada("( ( -256.0 + 18.0 ) * -3 ) / ( 8.0 * 104.3 ) - ( 16 * -2 )");
        
        /* Se evalúa y se imprime usando un try catch para evitar un error durante
         * la ejecución del método. En este caso debe imprimir el Resultado 3.
         */
        try{
            if (c.calcula())
                System.out.printf("\nResultado 3: %8.2f \n", c.getResultado());
            else
                System.out.println("\nError en la expresión. Revise los paréntesis.");
        } catch (Exception e){
            System.out.println("\nNo se pudo calcular la expresión");
        }
        
        // Se asigna un nuevo valor a la expresión
        c.setEntrada("( ( -256.0 + 18.0 ) * -3  / ( 8.0 * 104.3 ) - ( 16 * -2 )");
        
        /* Se evalúa y se imprime usando un try catch para evitar un error durante
         * la ejecución del método. En este caso debe imprimir el mensaje:
         * "Error en la expresión. Revise los paréntesis."
         */
        try{
            if (c.calcula())
                System.out.println("\nResultado 4: " + c.getResultado());
            else
                System.out.println("\nError en la expresión. Revise los paréntesis.");
        } catch (Exception e){
            System.out.println("\nNo se pudo calcular la expresión");
        }
    }
    
}
