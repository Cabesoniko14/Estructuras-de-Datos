/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio34;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Repetidos test = new Repetidos();
        ColaADT<Integer> cola1 = new ColaA();
        cola1.agrega(1);
        cola1.agrega(1);
        cola1.agrega(2);
        cola1.agrega(3);
        cola1.agrega(5);
        cola1.agrega(6);
        cola1.agrega(6);
        cola1.agrega(7);
        cola1.agrega(7);
        
        System.out.println(cola1.toString());
        test.repetidos(cola1);
        System.out.println(cola1.toString());
        
    }
    
}
