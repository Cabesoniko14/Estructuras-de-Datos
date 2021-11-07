/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio35;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Ocurrencias test = new Ocurrencias();
        ColaADT<Integer> cola = new ColaA();
        cola.agrega(1);
        cola.agrega(1);
        cola.agrega(2);
        cola.agrega(1);
        cola.agrega(3);
        cola.agrega(4);
        cola.agrega(1);
        System.out.println(cola.toString());
        test.eliminaOcurrencias(cola, 1);
        System.out.println(cola.toString());
        
        
    }
    
}
