
package cap4;

/**
 *
 * @author Silvia Guardati
 * Programa 4.4
 * Ejemplo de uso de los métodos de la clase OAG en arreglos de tipo Double y en   
 * arreglos de tipo String.
 */

public class UsaOAG {
    
    public static void main(String[] args) {        
        Double califDes[] = new Double[10];
        String díasOrd[] = new String[7];
             
        califDes[0] = 8.5;
        califDes[1] = 9.3;
        califDes[2] = 5.5;
        
        díasOrd[0] = "Jueves";
        díasOrd[1] = "Martes";
        díasOrd[2] = "Sábado";
        
        // Impresión del arreglo de datos tipo Double (está desordenado).
        System.out.println("\nArreglo de tipo Double: " + OAG.imprime(califDes, 3));
        
        // Impresión del arreglo de cadenas de caracteres (está ordenado).
        System.out.println("\nArreglo de tipo String: " + OAG.imprime(díasOrd, 3));
        
        // Búsqueda secuencial en arreglos desordenados.
        int índice = OAG.buscaSecuencialDesordenado(califDes, 3, 8.5);
        System.out.println("\nDebe imprimir 0: " + índice);
        índice = OAG.buscaSecuencialDesordenado(califDes, 3, 5.5);
        System.out.println("Debe imprimir 2: " + índice);
        índice = OAG.buscaSecuencialDesordenado(califDes, 3, 10.0);
        System.out.println("Debe imprimir -1: " + índice);
        
        // Búsqueda secuencial en arreglos ordenados.
        índice = OAG.buscaSecuencialOrdenado(díasOrd, 3, "Jueves");
        System.out.println("\nDebe imprimir 0: " + índice);
        índice = OAG.buscaSecuencialOrdenado(díasOrd, 3, "Sábado");
        System.out.println("Debe imprimir 2: " + índice);
        índice = OAG.buscaSecuencialOrdenado(díasOrd, 3, "Viernes");
        System.out.println("Debe imprimir -4: " + índice);
        índice = OAG.buscaSecuencialOrdenado(díasOrd, 3, "Lunes");
        System.out.println("Debe imprimir -2: " + índice);
        índice = OAG.buscaSecuencialOrdenado(díasOrd, 3, "Domingo");
        System.out.println("Debe imprimir -1: " + índice);
        
        // Inserción en arreglos desordenados, permitiendo elementos repetidos.
        int n = OAG.insertaDesordenadoConRepetidos(califDes, 3, 8.5);
        String res = OAG.imprime(califDes, n);
        System.out.println("\n\nInserta 8.5 en desordenado con repetidos: " + res);

        // Inserción en arreglos desordenados, NO permitiendo elementos repetidos.
        n = OAG.insertaDesordenadoSinRepetidos(califDes, n, 5.5);
        res = OAG.imprime(califDes, n);
        System.out.println("\nInserta 5.5 en desordenado sin repetidos -no puede: " + res);

        n = OAG.insertaDesordenadoSinRepetidos(califDes, n, 10.0);
        res = OAG.imprime(califDes, n);
        System.out.println("\nInserta 10.0 en desordenado sin repetidos: " + res);
        
        // Inserción en arreglos ordenados, permitiendo elementos repetidos.
        int m = OAG.insertaOrdenadoConRepetidos(díasOrd, 3, "Jueves");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\n\nInserta Jueves en ordenado con repetidos: " + res);
        
        // Inserción en arreglos ordenados, NO permitiendo elementos repetidos.
        m = OAG.insertaOrdenadoSinRepetidos(díasOrd, m, "Martes");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nInserta Martes en ordenado sin repetidos -no puede: " + res);
        
        m = OAG.insertaOrdenadoSinRepetidos(díasOrd, m, "Lunes");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nInserta Lunes en ordenado sin repetidos: " + res);
        
        m = OAG.insertaOrdenadoSinRepetidos(díasOrd, m, "Domingo");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nInserta Domingo en ordenado sin repetidos: " + res);

        m = OAG.insertaOrdenadoSinRepetidos(díasOrd, m, "Viernes");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nInserta Viernes en ordenado sin repetidos: " + res);
        
        // Eliminación en arreglos desordenados.
        n = OAG.eliminaDesordenado(califDes, n, 8.5);
        res = OAG.imprime(califDes, n);
        System.out.println("\n\nElimina la primer ocurrencia de 8.5 en desordenado: " + res);
        
        n = OAG.eliminaDesordenado(califDes, n, 5.5);
        System.out.println("\nElimina 5.5 en desordenado: " + OAG.imprime(califDes, n));      

        n = OAG.eliminaDesordenado(califDes, n, 7.8);
        res = OAG.imprime(califDes, n);
        System.out.println("\nElimina 7.8 -no está- en desordenado: " + res);
        
        // Eliminación en arreglos ordenados.
        m = OAG.eliminaOrdenado(díasOrd, m, "Jueves");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\n\nElimina primer ocurrencia de Jueves en ordenado: " + res);

        m = OAG.eliminaOrdenado(díasOrd, m, "Jueves");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nElimina segunda ocurrencia de Jueves en ordenado: " + res);

        m = OAG.eliminaOrdenado(díasOrd, m, "Miércoles");
        res = OAG.imprime(díasOrd, m);
        System.out.println("\nElimina Miércoles -no está- en ordenado: " + res);

        m = OAG.eliminaOrdenado(díasOrd, m, "Martes");
        System.out.println("\nElimina Martes en ordenado: " + OAG.imprime(díasOrd, m));        
    }    
}
