/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio15;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        // Creación de pilas
        
        PilaA<Integer> pila1 = new PilaA(5);
        PilaA<Integer> pila2 = new PilaA(5);
        
        // Rellenar pilas
        
        pila1.push(6);
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);
        pila2.push(1);
        pila2.push(3);
        pila2.push(2);
        
        // Crear app y llamar método
        
        Contenedor prueba = new Contenedor();
        
        System.out.println(prueba.pilaContiene(pila1, pila2));
        
        
        
        
        
        
    }
    
}
