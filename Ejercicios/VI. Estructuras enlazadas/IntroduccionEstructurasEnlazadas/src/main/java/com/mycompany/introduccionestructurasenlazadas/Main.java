/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionestructurasenlazadas;

/**
 *
 * @author javi
 */
public class Main {
    public static void main(String[] args) {
        
        EE e1 = new EE();
        e1.agregaFinal("a");
        e1.agregaFinal("b");
        e1.agregaFinal("c");
        e1.agregaFinal("d");
        e1.agregaFinal("e");
        e1.agregaFinal("f");
        e1.agregaFinal("g");
        
        
        
        //EE e2 = new EE();
        
        // Prueba 1: Mezcla de cola original vacía y cola de parámetro no vacía
        
        //e2.mezclaEE(e1);
        //System.out.println(e1.toString());
        //System.out.println(e2.toString());
        
        // Prueba 2: Mezcla de cola original no vacía con cola de parámetro vacía
        //e1.mezclaEE(e2);
        //System.out.println(e1.toString());
        //System.out.println(e2.toString());
        
        // Prueba 3: Mezcla de dos colas no vacías (original más grande)
        
        EE e3 = new EE();
        e3.agregaFinal("A");
        e3.agregaFinal("B");
        e3.agregaFinal("C");
        e3.agregaFinal("D");
        e3.agregaFinal("E");
        //e1.mezclaEE(e3);
        //System.out.println(e1.toString());
        //System.out.println(e3.toString());
        
        // Prueba 4: Mezcla dos colas no vacías (original más pequeña)
        
        //e3.mezclaEE(e1);
        //System.out.println(e3.toString());
        //System.out.println(e1.toString());
        
        // Prueba 5: Colas del mismo tamaño
        //e3.agregaFinal("F");
        //e3.agregaFinal("G");
        //e3.mezclaEE(e1);
        //System.out.println(e3.toString());
        //System.out.println(e1.toString());
        



        
        
        
        
    }
    
}
