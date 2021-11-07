/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio33;

/**
 *
 * @author javi
 */
public class Aplicacion {
    public static void main(String[] args) {
        ColaADT<String> cola = new ColaA();
        InvertirColas test = new InvertirColas();
        
        cola.agrega("A");
        cola.agrega("B");
        cola.agrega("C");
        
        System.out.println(cola);
        System.out.println(test.invertirR(cola));
    }
    
}
