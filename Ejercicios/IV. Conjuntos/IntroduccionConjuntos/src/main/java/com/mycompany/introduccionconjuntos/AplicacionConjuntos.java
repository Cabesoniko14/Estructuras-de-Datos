/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionconjuntos;

/**
 *
 * @author javi
 */
public class AplicacionConjuntos {
    
    public static void main(String[] args) {
        
        ConjuntoADT<Integer> c1 = new ConjuntoA();
        ConjuntoADT<Integer> c2 = new ConjuntoA();
        ConjuntoADT<Persona> c3 = new ConjuntoA();
        ConjuntoADT<Integer> resInter;
        
        c1.agrega(4);
        c1.agrega(4);
        c1.agrega(4);
        c1.agrega(16);
        c1.agrega(5);
        c1.agrega(20);
        c1.agrega(41);
        c1.agrega(18);
        
        c2.agrega(4);
        c2.agrega(20);
        c2.agrega(78);
        c2.agrega(25);
        c2.agrega(31);
        
        System.out.println("\nC1: " +  c1);
        System.out.println("\nC2: " + c2);
        resInter = c1.interseccion(c2);
        System.out.println("\nIntersección: " +  resInter);
        System.out.println("\nDiferencia: " + c1.diferencia(c2));
     
    }
    
}
