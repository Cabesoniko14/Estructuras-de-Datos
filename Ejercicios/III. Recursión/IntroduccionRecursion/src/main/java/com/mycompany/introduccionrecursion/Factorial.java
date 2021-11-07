/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionrecursion;

/**
 *
 * @author javi
 */
public class Factorial {
    
    public static double calculaFactorial(int n){
        
        if (n == 0 || n == 1) // Estado base
            return 1;
        else
            return n*calculaFactorial(n-1); // Estado recursivo e instrucc que lleva al estado base (n-1)
    
    }
    
    // Opción 1: usando la pila interna
    
    public static double sumaArr(double[] arre, int n){
        if (n==0) // Estado base
            return 0;
        else
            return arre[n-1] + sumaArr(arre, n-1); // Estado recursivo e instrucc que lleva al estado base (n-1)
        
    }
    
    // Opción 2: usando MENOS la pila interna, una variable extra y sobrecarga
    
    public static double sumaArrCool(double[] arre, int n){
        if (n>=0) // Estado base
            return sumaArrCool(arre, n, 0);
        throw new RuntimeException("Dato incorrecto");
        
        
    }
    
    private static double sumaArrCool(double[] arre, int n, double suma){
        if (n==0)
            return suma;
        else{
            suma += arre[n-1];
            return sumaArrCool(arre, n-1, suma);
        }

    }
    
    // Opción 3: Opción 2 pero sumando de izquierda a derecha
    
    public static double sumaArrCoolIzq(double[] arre, int n){
        if (n>=0) // Estado base
            return sumaArrCoolIzq(arre, n, 0, 0);
        throw new RuntimeException("Dato incorrecto");
        
        
    }
    
    private static double sumaArrCoolIzq(double[] arre, int n, double suma, int indice){
        if (indice == n)
            return suma;
        else{
            suma += arre[indice];
            return sumaArrCoolIzq(arre, n, suma, indice + 1); // Poner explícitamente índice + 1
        }

    }
    
    
    public static void main(String[] args) {
        System.out.println("\nCP1: entrada = 1 " + calculaFactorial(1) );
        System.out.println("\nCP2: entrada = 0 " + calculaFactorial(0) );
        System.out.println("\nCP3: entrada = 4 " + calculaFactorial(4) );
        System.out.println("\nCP4: entrada = 8 " + calculaFactorial(8) );
        // System.out.println("CP1: entrada = negativo " + calculaFactorial(1) ); se queda ahi para siempre
        
        double [] arre1 = {};
        double [] arre2 = {25};
        double [] arre3 = {2.5, 6.3, 4.5, 12, 9.8, 7.3};
        
        //Probando sumaArr
        
        System.out.println("\nCP1.1: arreglo con 0 elementos " +  sumaArr(arre1, arre1.length));
        System.out.println("\nCP2.1: arreglo con 1 elementos " +  sumaArr(arre2, arre2.length));
        System.out.println("\nCP3.1: arreglo con 6 elementos " +  sumaArr(arre3, arre3.length));
        
        // Probando sumaArrCool
        
        System.out.println("\nCP1.2: arreglo con 0 elementos " +  sumaArrCool(arre1, arre1.length));
        System.out.println("\nCP2.2: arreglo con 1 elementos " +  sumaArrCool(arre2, arre2.length));
        System.out.println("\nCP3.2: arreglo con 6 elementos " +  sumaArrCool(arre3, arre3.length));
        
        // Probando sumaArrCoolIzq
        
        System.out.println("\nCP1: arreglo con 0 elementos " +  sumaArrCoolIzq(arre1, arre1.length));
        System.out.println("\nCP2: arreglo con 1 elementos " +  sumaArrCoolIzq(arre2, arre2.length));
        System.out.println("\nCP3: arreglo con 6 elementos " +  sumaArrCoolIzq(arre3, arre3.length));
        
        
        
    }
    
    
    
    
}
