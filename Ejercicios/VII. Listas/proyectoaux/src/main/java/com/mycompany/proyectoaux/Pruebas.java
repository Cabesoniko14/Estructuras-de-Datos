/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoaux;

/**
 *
 * @author javi
 */
public class Pruebas {
    
    public static void main(String[] args) {
        ConjuntoADT<String> c1 = new ConjuntoEnlazado();
        ConjuntoADT<String> c2 = new ConjuntoEnlazado();
        ConjuntoADT<String> c3 = new ConjuntoEnlazado();
        c1.agrega("hola");
        c2.agrega("xd");
        c2.agrega("hola");
        System.out.println(c1.contiene("hola"));
    }
    
}
