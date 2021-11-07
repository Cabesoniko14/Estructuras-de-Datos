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
public class InvertirColas{
    
    public static <T> ColaADT invertirI (ColaADT<T> cola){
        PilaADT<T> aux = new PilaA();
        while(!cola.estaVacia())
            aux.push(cola.quita());
        while(!aux.isEmpty())
            cola.agrega(aux.pop());
        return cola;
    }
    
    public static <T> ColaADT invertirR(ColaADT<T> cola){
        if (cola.estaVacia())
            throw new RuntimeException("Cola vacía");
        return auxR(cola, colaR(cola, new PilaA()));
    
    }
    
    private static <T> PilaADT colaR(ColaADT<T> cola, PilaADT<T> aux){
        if(!cola.estaVacia()){
            aux.push(cola.quita());
            return colaR(cola, aux);
        }
        return aux;
    
    }
    
    private static <T> ColaADT auxR(ColaADT<T> cola, PilaADT<T> aux){
        if(!aux.isEmpty()){
            cola.agrega(aux.pop());
            return auxR(cola, aux);
        }
        return cola;
    
    }
    
    
}
