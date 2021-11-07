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
public class Repetidos {

    public Repetidos() {
    }
    
    
    public static <T> void repetidos(ColaADT<T> cola){
        ColaADT<T> aux = new ColaA();
        
        if (cola == null)
            throw new RuntimeException("Error");
        else
            repetidos(cola, aux);
    }
    
    private static <T> void repetidos(ColaADT<T> cola, ColaADT<T> aux){
        if (cola.estaVacia())
            copiaCola(aux, cola);
        else{
            T dato = cola.quita();
            if(!cola.estaVacia()){
                if(dato.equals(cola.consultaPrimero()))
                    cola.quita();
                aux.agrega(dato);
            }
            repetidos(cola, aux);
        }  
    }
    
    private static <T> void copiaCola(ColaADT<T> origen, ColaADT<T> destino){
        while(!origen.estaVacia())
            destino.agrega(origen.quita());
    
    }
    
    
}
