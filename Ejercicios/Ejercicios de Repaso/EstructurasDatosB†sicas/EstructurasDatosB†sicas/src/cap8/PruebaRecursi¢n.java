
package cap8;

/**
 * @author Silvia Guardati
 * Programa 8.1
 * En este programa se presentan varios ejemplos de problemas resueltos recursivamente.
 * Como se mencionó en el libro, muchos de ellos tienen una solución iterativa muy simple
 * y más eficiente. Sin embargo se usan con el propósito de ilustrar el concepto de 
 * recursión.
 */
public class PruebaRecursión {
    
    /* Calcula y regresa la suma de los primeros n enteros positivos, siendo n el
     * valor que se recibe como parámetro.
     */
    public static int sumaPrimerosEnteros(int n){
        if (n == 1) { // Estado base
            return n;
        }
        else {
            // Estado recursivo y acercamiento al estado base
            return n + sumaPrimerosEnteros(n - 1); 
        }
    }
    
    /* Calcula y regresa el factorial de un número entero. El resultado se declara 
     * de tipo double para tener mayor capacidad de almacenamiento.
     */
    public static double factorial(int n){
        if (n==0 || n== 1) { // Estado base
            return 1;
        }
        else {
            return n * factorial(n-1); // Estado recursivo y acercamiento al estado base
        }
    }
    
    // Calcula y regresa la suma de los elementos de un arreglo.
    public static double sumaArre(double arre[], int n) {
        if (n == 0) {  // Estado base
            return 0;
        }
        else {
            // Estado recursivo y acercamiento al estado base
            return arre[n-1] + sumaArre(arre, n-1);  
        }
     }
    
    // Calcula y regresa el fibonacci de un número entero.
    public static int fibonacci(int n) {
        if (n == 0 || n== 1) { // Estado base
            return n;
        }
        else {
            // Estado recursivo y acercamiento al estado base
            return fibonacci(n - 1) + fibonacci(n - 2);
	}
     }
    
    //Imprime recursivamente un arreglo, de derecha a izquierda.
    public static void impArreDI(double arre[], int n) {
        if (n > 0) {
            System.out.println("\n" + arre[n-1]);
            impArreDI(arre, n-1);
        }
    }

    //Imprime recursivamente un arreglo, de izquierda a derecha.
    public static void impArreID(double arre[], int n) {
        if (n > 0) {
            impArreID(arre, n-1);
            System.out.println("\n" + arre[n-1]);
        }
    }
	    
    /* Sobrecarga del método para que, usando un parámetro extra, imprima recursivamente 
     * un arreglo de izquierda a derecha, sin emplear la pila interna.
     * El parámetro indica la posición que debe imprimirse. La primera vez pos es 0.
     */
    public static void impArreIDSinPila(double arre[], int n) {
        impArreIDSinPila(arre, n, 0);
    }
    
    // Sobrecarga del método
    private static void impArreIDSinPila (double arre[], int n, int pos) {
        if (pos < n) {
            System.out.println("\n" + arre[pos]);
            impArreIDSinPila(arre, n, pos + 1);
        }
    }
    
    /* Método que determina si un número es impar. Para ello se apoya en otro método:
     * esPar(), el cual, a su vez, puede volver a llamar a éste. 
     * Estos dos métodos son un ejemplo de recursión mutua.
     */
    public static boolean esImpar (int numero){
        if (numero == 0)
            return false;
        else
            return esPar(numero-1);
    }
    
    /* Método que determina si un número es par, apoyándose en el método esImpar() y
     * usando recursión mutua.
     */
    public static boolean esPar (int numero){
        if (numero == 0)
            return true;
        else
            return esImpar(numero-1);
    }
    
    
    // OTROS EJEMPLOS DE PROBLEMAS SIMPLES RESUELTOS RECURSIVAMENTE.
	
    //Calcula la potencia de un número sin usar el método "pow".
    public static double potencia(double base, int exp) {
        if (exp == 0) {  // Estado base
            return 1;
        }
        else {
            return base * potencia(base, exp-1);
        }
    }

    // Calcula la suma de dos números sin usar el operador +
    public static double sumaXY(int x, int y) {
        if (y == 0) {
            return x;
        }
        else {
            return 1 + sumaXY(x, y-1);
        }
     }  
    
    
    /* Regresa true si la expresión recibida es palíndromo.
     * Una expresión es palíndromo si puede leerse de la misma forma de izquierda a
     * derecha que de derecha a izquierda.
     */
    private static  boolean palíndromo(String expresión) {
        expresión = expresión.replace(" ", ""); // Quita todos los espacios en blanco
        return palíndromo(expresión, 0);
    }

    // Sobrecarga del método
    private static  boolean palíndromo(String expresión, int i) {
        if (i >= expresión.length()/2){
            return true;
        }
        else {
            if (expresión.charAt(i) == expresión.charAt(expresión.length()-1-i))
                return palíndromo(expresión, i+1) ;
            else
                return false;
	}
     }

    
// Método main para probar los métodos recursivos definidos más arriba.
    public static void main(String[] args) {
        
        System.out.println("\nSuma los primeros 6 números enteros positivos: " + sumaPrimerosEnteros(6));
        System.out.println("\nFactorial de 25: " + factorial(25));
        System.out.println("\nFibonacci de 8: " + fibonacci(8));
        
        double [] precios = {2.5, 6.3, 8.4, 1.3, 9.7, 5.3};
        
        System.out.println("\nImpresión del arreglo de derecha a izquierda");
        impArreDI(precios, precios.length);
        System.out.println("\nImpresión del arreglo de izquierda a derecha");
        impArreID(precios, precios.length);
        System.out.println("\nImpresión del arreglo de izquierda a derecha (sin usar la pila interna)");
        impArreIDSinPila(precios, precios.length);
        
        // Debe imprimir el 23 es impar
        if (esImpar(23))
            System.out.println("\nEl 23 es impar");
        else
            System.out.println("\nEl 23 no es impar");
        
        // Debe imprimir el 56 no es impar
        if (esImpar(56))
            System.out.println("\nEl 56 es impar");
        else
            System.out.println("\nEl 56 no es impar");
        
        // Debe imprimir el 56 es par
        if (esPar(56))
            System.out.println("\nEl 56 es par");
        else
            System.out.println("\nEl 56 no es par");
        
        // Debe imprimir el 23 no es par
        if (esPar(23))
            System.out.println("\nEl 23 es par");
        else
            System.out.println("\nEl 23 no es par");
           
        System.out.println("\nPotencia (36.3, 2): " + potencia(36.3,2));
        System.out.println("\nSuma 7 + 5: " + sumaXY(7, 5));
        
        System.out.println("\n¿Es palíndromo: neuquen? " + palíndromo("neuquen"));
        System.out.println("\n¿Es palíndromo: 2978782? " + palíndromo("2978782"));
        System.out.println("\n¿Es palíndromo: yo dono rosas oro no doy? " + palíndromo("yo dono rosas oro no doy"));
    }
}
