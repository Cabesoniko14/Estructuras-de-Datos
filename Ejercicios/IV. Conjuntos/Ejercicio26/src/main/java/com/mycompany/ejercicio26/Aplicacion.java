/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio26;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        ConjuntoADT<String> ingles = new ConjuntoA();
        ConjuntoADT<String> frances = new ConjuntoA();
        ConjuntoADT<String> otro = new ConjuntoA();
        ConjuntoADT<String> dosId = new ConjuntoA();
        ConjuntoADT<String> tresMas = new ConjuntoA();
        
        // Agregar elementos a inglés
        
        ingles.agrega("Juan");
        ingles.agrega("Juan");
        ingles.agrega("Juan");
        ingles.agrega("Javi");
        ingles.agrega("Laura");
        // Agregar elementos a francés
        
        frances.agrega("Juan");
        frances.agrega("Laura");
        frances.agrega("Paco");
        
        
        // Agregar elementos a otros
        
        Encuesta itam = new Encuesta();
        itam.agregaOtrosS(otro, dosId, tresMas, "Juan");
        itam.agregaOtrosS(otro, dosId, tresMas, "Juan");
        itam.agregaOtrosS(otro, dosId, tresMas, "Bob");
        itam.agregaOtrosS(otro, dosId, tresMas, "Bob");
        itam.agregaOtrosS(otro, dosId, tresMas, "Bob");
        itam.agregaOtrosS(otro, dosId, tresMas, "Timmy");
        itam.agregaOtrosS(otro, dosId, tresMas, "Timmy");
        itam.agregaOtrosS(otro, dosId, tresMas, "Laura");
        itam.agregaOtrosS(otro, dosId, tresMas, "Filiberto");
        
        
        System.out.println(itam.tresIdiomasS(otro, dosId, tresMas, ingles, frances));
        
        
        
    }

}
    
    
    
    
        

        


