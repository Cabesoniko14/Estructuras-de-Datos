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
public class Ocurrencias {

    public Ocurrencias() {
    }
    
    public static <T> void eliminaOcurrencias(ColaADT<T> cola, T dato){
        ColaADT<T> aux = new ColaA();
        if (!cola.estaVacia()){
            eliminaOcurrencias(cola, aux, dato);
            while(!aux.estaVacia())
                cola.agrega(aux.quita());
        }
        else
            throw new RuntimeException();
        
        
    }
    
    private static <T> void eliminaOcurrencias(ColaADT<T> cola, ColaADT<T> aux, T dato){
        if (!cola.estaVacia()){
            if (cola.consultaPrimero().equals(dato))
                cola.quita();
            else
                aux.agrega(cola.quita());
            eliminaOcurrencias(cola, aux, dato);
                
        }
            
    }
       
    
    
}
