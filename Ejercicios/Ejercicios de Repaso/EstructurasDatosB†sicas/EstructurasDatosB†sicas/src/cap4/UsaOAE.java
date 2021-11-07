
package cap4;

/**
 * @author Silvia Guardati
 * Programa 4.2
 * Ejemplo de aplicación de los métodos de la clase OAE.
 */
public class UsaOAE {
    
    public static void main(String[] args) {
        int aOrdenado[] = new int [10];
        int aDesordenado[] = new int [10];

        aDesordenado[0] = 1;
        aDesordenado[1] = 8;
        aDesordenado[2] = 4;
        aDesordenado[3] = 2;

        aOrdenado[0] = 2;
        aOrdenado[1] = 6;
        aOrdenado[2] = 11;
        aOrdenado[3] = 23;
        
         // Imprime estado inicial del arreglo desordenado.
        System.out.println("\nArreglo desordenado:\n" + OAE.imprime(aDesordenado, 4));

        // Imprime estado inicial del arreglo ordenado.
        System.out.println("\nArreglo ordenado:\n" + OAE.imprime(aOrdenado, 4));

        // Búsqueda secuencial en arreglos desordenados.
        int índice;
        índice = OAE.buscaSecuencialDesordenado(aDesordenado, 4, 8);
        System.out.println("Debe imprimir 1: " + índice);
        índice = OAE.buscaSecuencialDesordenado(aDesordenado, 4, 1);
        System.out.println("Debe imprimir 0: " + índice);
        índice = OAE.buscaSecuencialDesordenado(aDesordenado, 4, 2);
        System.out.println("Debe imprimir 3: " + índice);
        índice = OAE.buscaSecuencialDesordenado(aDesordenado, 4, 9);
        System.out.println("Debe imprimir -1: " + índice);

        // Búsqueda secuencial en arreglos ordenados.
        índice = OAE.buscaSecuencialOrdenado(aOrdenado, 4, 2);
        System.out.println("Debe imprimir 0: " + índice);
        índice = OAE.buscaSecuencialOrdenado(aOrdenado, 4, 11);
        System.out.println("Debe imprimir 2: " + índice);
        índice = OAE.buscaSecuencialOrdenado(aOrdenado, 4, 15);
        System.out.println("Debe imprimir -4: " + índice);
        índice = OAE.buscaSecuencialOrdenado(aOrdenado, 4, 4);
        System.out.println("Debe imprimir -2: " + índice);
        índice = OAE.buscaSecuencialOrdenado(aOrdenado, 4, 0);
        System.out.println("Debe imprimir -1: " + índice);

        // Inserción en arreglos desordenados, permitiendo elementos repetidos.
        int n = OAE.insertaDesordenadoConRepetidos(aDesordenado, 4, 4);
        String resultado = OAE.imprime(aDesordenado, n);
        System.out.println("\nInserta 4 en desordenado con repetidos: " + resultado);

        // Inserción en arreglos desordenados, NO permitiendo elementos repetidos.
        n = OAE.insertaDesordenadoSinRepetidos(aDesordenado, n, 1);
        resultado = OAE.imprime(aDesordenado, n);
        System.out.println("\nInserta 1 en desordenado sin repetidos (no pudo): " + resultado);

        n = OAE.insertaDesordenadoSinRepetidos(aDesordenado, n, 5);
        resultado = OAE.imprime(aDesordenado, n);
        System.out.println("\nInserta 5 en desordenado sin repetidos: " + resultado);

        // Inserción en arreglos ordenados, permitiendo elementos repetidos.
        int m = OAE.insertaOrdenadoConRepetidos(aOrdenado, 4, 2);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nInserta 2 en ordenado con repetidos: " + resultado);

        // Inserción en arreglos ordenados, NO permitiendo elementos repetidos.
        m = OAE.insertaOrdenadoSinRepetidos(aOrdenado, m, 6);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nInserta 6 en ordenado sin repetidos -no puede: " + resultado);
        
        m = OAE.insertaOrdenadoSinRepetidos(aOrdenado, m, 8);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nInserta 8 en ordenado sin repetidos: " + resultado);
        
        m = OAE.insertaOrdenadoSinRepetidos(aOrdenado, m, 1);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nInserta 1 en ordenado sin repetidos: " + resultado);

        m = OAE.insertaOrdenadoSinRepetidos(aOrdenado, m, 30);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nInserta 30 en ordenado sin repetidos: " + resultado);

        // Eliminación en arreglos desordenados.
        n = OAE.eliminaDesordenado(aDesordenado, n, 1);
        resultado = OAE.imprime(aDesordenado, n);
        System.out.println("\nElimina 1 en desordenado: " + resultado);

        n = OAE.eliminaDesordenado(aDesordenado, n, 1);
        resultado = OAE.imprime(aDesordenado, n);
        System.out.println("\nElimina 1 -no está- en desordenado: " + resultado);

        // Eliminación en arreglos ordenados.
        m = OAE.eliminaOrdenado(aOrdenado, m, 2);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nElimina primer ocurrencia de 2 en ordenado: " + resultado);

        m = OAE.eliminaOrdenado(aOrdenado, m, 2);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nElimina segunda ocurrencia de 2 en ordenado: " + resultado);

        m = OAE.eliminaOrdenado(aOrdenado, m, 7);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nElimina 7 -no está- en ordenado: " + resultado);

        m = OAE.eliminaOrdenado(aOrdenado, m, 23);
        resultado = OAE.imprime(aOrdenado, m);
        System.out.println("\nElimina 23 en ordenado: " + resultado);
        
        // Obtiene e imprime la suma de los elementos del arreglo ordenado.
        int suma = OAE.sumaElementos(aOrdenado, m);
        System.out.println("\nSuma de los elementos del arreglo ordenado: " + suma);
        
        // Obtiene e imprime el promedio de los elementos del arreglo ordenado.
        double prom = OAE.calculaPromedio(aOrdenado, m);
        System.out.println("\nPromedio de los elementos del arreglo ordenado: " + prom);
        
        // Obtiene e imprime la posición del elementos más grande del arreglo ordenado.
        índice = OAE.buscaPosMayor(aOrdenado, m);
        System.out.println("\nPosición del mayor del arreglo ordenado: " + índice);
        
        // Obtiene e imprime la posición del elementos más pequeño del arreglo ordenado.
        índice = OAE.buscaPosMenor(aOrdenado, m);
        System.out.println("\nPosición del menor del arreglo ordenado: " + índice);
        
        // Obtiene e imprime el total de elementos mayores que 10 en el arreglo ordenado.
        int total = OAE.cuentaMayores(aOrdenado, m, 10);
        System.out.println("\nTotal de elementos mayores que 10 en el arreglo ordenado: " + total);
        
        // Obtiene e imprime el total de elementos menores que 10 en el arreglo ordenado.
        total = OAE.cuentaMenores(aOrdenado, m, 10);
        System.out.println("\nTotal de elementos menores que 10 en el arreglo ordenado: " + total);
        
        // Obtiene e imprime el total de elementos iguales a 10 en el arreglo ordenado.
        total = OAE.cuentaIguales(aOrdenado, m, 10);
        System.out.println("\nTotal de elementos iguales a 10 en el arreglo ordenado: " + total);
    }    
}
