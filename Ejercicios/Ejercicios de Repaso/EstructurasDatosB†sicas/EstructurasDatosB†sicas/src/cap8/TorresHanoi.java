
package cap8;

/**
 * @author Silvia Guardati
 * Programa 8.3
 * Clase que presenta la solución al problema de las Torres de Hanoi.
 * Incluye el método para simular el movimiento de los discos entre las torres.
 */
public class TorresHanoi {
    private String torreO, torreD, torreA;
    private int numDiscos;

    public TorresHanoi() {
    }

    public TorresHanoi(String torreO, String torreD, String torreA, int numDiscos) {
        this.torreO = torreO;
        this.torreD = torreD;
        this.torreA = torreA;
        this.numDiscos = numDiscos;
    }
    
    /* Método que imprime los movimientos necesarios para mover n discos 
     * de la torre Origen a la torre Destino según las reglas señaladas.
     * El método, además de imprimir los movimientos, calcula y regresa como resultado
     * el total de movimientos realizados.
     */
    public int mueveTorresDeHanoi(){
        return mueveTorresDeHanoi(numDiscos, torreO, torreD, torreA);
    }
    
    // Sobrecarga del método usado para mover los discos
    private int mueveTorresDeHanoi(int n, String tO, String tD, String tA){        
        if (n == 1){ // Estado base: hay 1 solo disco      
            System.out.println("Mueve de " + tO + " a "+ tD );
            return 1;
        }
        else {
            int resp;
            resp = mueveTorresDeHanoi(n-1, tO, tA, tD); // Estado recursivo
  
            System.out.println("Mueve de " + tO + " a "+ tD);
    
            resp = resp + 1 + mueveTorresDeHanoi(n-1, tA, tD, tO); // Estado recursivo
            return resp;
        }   
    }
    
    // Se prueba el método con 3 discos.
    public static void main(String[] args) {
        
        TorresHanoi tH = new TorresHanoi("Torre Origen", "Torre Destino", "Torre Auxiliar", 3);
        
        System.out.println("\nTotal de movimientos: " + tH.mueveTorresDeHanoi());
    }   
}
