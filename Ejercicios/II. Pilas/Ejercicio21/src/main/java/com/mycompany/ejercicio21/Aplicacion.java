/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio21;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        // Ejercicio 21.1
        
        QuitadorElementos pila = new QuitadorElementos();
        
        PilaA<Integer> pila0= new PilaA(5);
        
        for(int i = 0; i < 7; i++)
            pila0.push(i);
        
        pila.quitarElementos(4, pila0);
        
        
        // Ejercici0 21.2
        
        PilaA<Integer> pila1 = new PilaA(5);
        
        for(int i = 0; i < 10; i++)
            pila1.push(i);
        
        pila1.multiPop(6);
        System.out.println(pila1.peek());
    
    }
    
}
