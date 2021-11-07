/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionpilas;

/**
 *
 * @author javi
 */
public class Pilas {
    
    public static void main(String[] args) {
        PilaA<Integer> pila1 = new PilaA(5);
        
        for(int i = 0; i < 10; i++)
            pila1.push(i);
        
        System.out.println("\nÚltimo elemento guardado: " + pila1.peek());
        
    }
    
}
