/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio28;

/**
 *
 * @author javi
 */
public class ImpresionArreglos {
    
    // De derecha a izquierda
    
    public static void imprimirArreglo(int arre[], int n){
        if (n!= 0){
            System.out.println(arre[n-1]);
            imprimirArreglo(arre, n-1);
        }
        
    
    }
    
    // De izquierda a derecha sol 1
    
    public static void imprimirArregloID(int arre[], int n){
        if (n>=0)
            imprimirArregloID(arre, n, 0);
   
    }
    
    private static void imprimirArregloID(int arre[], int n, int i){
        if (i < n){
            System.out.println(arre[i]);
            imprimirArregloID(arre, n, i + 1);        
        }
    }
    
    // De izquierda a derecha sol 2
    
    public static void imprimirArregloIDCool(int arre[], int n){
        if (n!= 0){
            imprimirArregloIDCool(arre, n-1);
            System.out.println(arre[n-1]);
        }
        
    
    }
    
    public static void main(String[] args) {
        int [] arre1 = {1,2,4,2};
        imprimirArreglo(arre1, 4);
        imprimirArregloIDCool(arre1, 4);
        
    }
}
