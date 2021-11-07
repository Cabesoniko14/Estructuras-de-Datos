
package cap1;

/**
 * @author Silvia Guardati
 * Este programa contiene varios subprogramas desarrollados para probar diversos
 * temas del primer capítulo. Para una mayor claridad se agruparon en subprogramas
 * cuyos nombres hacen referencia al tema que están complementando.
 */

public class PruebasCapítulo1 {
    
    // Ejemplo de expresiones aritméticas y del uso de algunos métodos de la clase Math.
    public static void ejemplosExpresionesAritméticas(){
        int entero;
        double real;
        
        entero = -2147483648;
        real = -1.8 * Math.pow(10,307);     
        System.out.println("Número entero: " + entero);
        System.out.println("Número con parte decimal: " + real);        
           
        real = Math.pow(3,3) * (5%2);
        System.out.println("Número con parte decimal: " + real);
        
        System.out.println("Número con parte decimal: " + Math.sqrt(36));
        System.out.println("Número con parte decimal**: " + Math.abs(-22.8) );
        
        real= Math.abs(4);
        System.out.println("Número con parte decimal: " + real);
        
        System.out.println("Número entero: " + (2 * (3 + 5) / 10  ));
        
        entero = Math.abs(-16);
        System.out.println("Número entero: " + entero);
        
        System.out.println(-5.0+3.5);
       
        System.out.println(Math.pow(3.25, 2) * 18 / 5);        
    }
    
    // Ejemplos de uso de los métodos de la clase String
    public static void ejemplosString(){
        String nombreAlumno = "Diego Ricalde";
        String cadena;
        int n, res, pos;
        char car;
        boolean resp;
        
        System.out.println("\nDesde ejemplosString:");
        n = nombreAlumno.length();  // A n se le asigna el valor 13        
        System.out.println("n: " + n);
        
        car = nombreAlumno.charAt(0); // A car se le asigna la letra D        
        System.out.println("car: " + car);
        
        resp = nombreAlumno.equals("Diego Martínez"); // A resp se le asigna false        
        System.out.println("resp: " + resp);
        
        res = nombreAlumno.compareTo("Diego Martín"); //A res se le asigna un valor positivo        
        System.out.println("res: " + res);
        
        pos = nombreAlumno.indexOf("Ricalde"); // A pos se le asigna el valor 6        
        System.out.println("pos: " + pos);
        
        System.out.println(nombreAlumno.toUpperCase()); // Imprime DIEGO RICALDE        
        System.out.println(nombreAlumno.toLowerCase()); // Imprime diego ricalde
        
        nombreAlumno = nombreAlumno.concat(" Gutiérrez");
        System.out.println(nombreAlumno);  // Imprime Diego Ricalde Gutiérrez
        
        cadena = "Hola " + nombreAlumno + "\n";
        // Imprime Hola Diego Ricalde Gutiérrez (y salta a la siguiente línea)
        System.out.println(cadena);          
    }
    
    // Uso de operadores especiales    
    public static void ejemplosOperadoresEspeciales(){
        int n, resultado;
        
        n = 2;
        System.out.println("n: " + n); // Imprime 2, el valor asignado
        
        resultado = n++; // Asigna el valor de n (2) a resultado y luego incrementa n (3)
        System.out.println("n: " + n + " - resultado: " + resultado); 
        // Imprime 3 (la n incrementada) y 2 (el valor asignado a resultado)
        
        resultado = ++n; // Incrementa n (4) y luego la asigna a resultado (4)
        System.out.println("n: " + n + " - resultado: " + resultado);
        // Imprime 4 (la n incrementada) y 4 (el valor asignado a resultado)
        
        resultado = n--; // Asigna el valor de n (4) y luego decrementa n (3)
        System.out.println("n: " + n + " - resultado: " + resultado);
        // Imprime 3 (la n decrementada) y 4 (el valor asignado a resultado)
      
        resultado = --n; // Decrementa n (2) y luego la asigna a resultado (2)
        System.out.println("n: " + n + " - resultado: " + resultado);
        // Imprime 2 (la n decrementada) y 2 (el valor asignado a resultado)
    }
    
    // Ejemplos de asignaciones especiales.
    public static void ejemplosAsignacionesEspeciales(){
        int n1, n2;
        
        n1 = 3;
        n2 = 2;
        System.out.println("n1: " + n1 + " - n2: " + n2);
        // Imprime 3 y 2 que son los valores asignados a las variables
        
        n1 += n2; // Equivale a n1= n1 + n2
        System.out.println("n1: " + n1 + " - n2: " + n2); // Imprime 5 y 2        
        
        n1 -= n2; // Equivale a n1= n1 - n2
        System.out.println("n1: " + n1 + " - n2: " + n2); // Imprime 3 y 2
        
        n1 *= n2; // Equivale a n1= n1 * n2
        System.out.println("n1: " + n1 + " - n2: " + n2); // Imprime 6 y 2
        
        n1 /= n2; // Equivale a n1= n1 / n2
        System.out.println("n1: " + n1 + " - n2: " + n2); // Imprime 3 y 2
        
        n1 %= n2; // Equivale a n1= n1 % n2
        System.out.println("n1: " + n1 + " - n2: " + n2); // Imprime 1 y 2  
    }
    
    // Ejemplos de impresiones con formato usando el .printf
    public static void ejemplosImpresiónConFormato(){        
        // Impresión con formato de números tipo float y double
        double real = Math.sqrt(17.5);
        /* Imprime ocupando 6 espacios en total, con 3 dígitos de precisión.
         * El punto ocupa un espacio. Justifica a derecha.
         */
        System.out.printf("%6.3f ", real);

        
        // Impresión con formato de números tipo int, short, long y byte
        int entero = 16305;
        // Imprime ocupando 8 espacios. Justifica hacia la derecha.
        System.out.printf("\n%8d ", entero);

        // Imprime ocupando 8 espacios. Justifica hacia la izquierda.
        System.out.printf("\n%-8d ", entero);

        // Imprime ocupando 8 espacios. Agrega signo + o - al número.
        System.out.printf("\n%+8d ", entero);
        
         // Imprime ocupando 8 espacios. Completa con 0 los espacios faltantes.
        System.out.printf("\n%08d ", entero);

        // Impresión con formato de cadenas de caracteres.
        String cadena ="Esta es una prueba";

        // Con la S todas las letras de la cadena se imprimen mayúsculas.
        System.out.printf("\n%S ", cadena);

        // Con la s se imprimen los caracteres como están.
        System.out.printf("\n%s ", cadena);
        
        // Imprime, ocupando 10 espacios, los primeros 6 caracteres de la cadena.       
        System.out.printf("\n%10.6s ", cadena);


        // Impresión con formato de un caracter.
        char letra = 'a';
        
        // Con la C se imprime la letra mayúscula. En este caso la letra A.        
        System.out.printf("\n%C ", letra);

        // Con la c se imprime la letra como está. En este caso la leta a.
        System.out.printf("\n%c ", letra);
    }
    
    
    public static void main(String[] args) {        
        ejemplosExpresionesAritméticas();        
        ejemplosString();        
        ejemplosOperadoresEspeciales();
        ejemplosAsignacionesEspeciales();
        ejemplosImpresiónConFormato();
    }
}
