/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio37;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Javi", "15/07/2000");
        Persona p2 = new Persona("Pancho", "14/06/2001");
        Persona p3 = new Persona("Sancho Panza", "14/06/1910");
        Persona p4 = new Persona("Billy Bill", "23/12/1950");
        Persona p5 = new Persona("Jack", "01/01/1990");
        
        ColaADT<Persona> cola = new ColaA();
        cola.agrega(p5);
        cola.agrega(p1);
        cola.agrega(p2);
        cola.agrega(p4);
        cola.agrega(p3);
        
        System.out.println(cola.toString());
        
        Aeropuerto benny = new Aeropuerto("Benny Juarez");
        benny.ordena(cola);
        
        System.out.println(cola.toString());
    }
    
}
