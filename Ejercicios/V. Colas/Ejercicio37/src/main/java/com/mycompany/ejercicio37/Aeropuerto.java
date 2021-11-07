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
public class Aeropuerto {
    
    private String nombre;

    public Aeropuerto() {
    }
    
    public Aeropuerto(String nombre){
        this.nombre = nombre;
    
    }
    
    public static void ordena(ColaADT<Persona> cola){
        if (cola == null)
            throw new RuntimeException("xd");
        else{
            ColaADT<Persona> aux = new ColaA();
            cola.agrega(null);
            ordena(cola, aux);
        }
        
    }
    
    private static void ordena(ColaADT<Persona> cola, ColaADT<Persona> aux){
        if (!cola.estaVacia()){
            if(!(cola.consultaPrimero() == null)){
                cicloNull(cola, aux);
                ordena(cola, aux);
            }
            else{
                while(!cola.estaVacia())
                    cola.quita();
                while(!aux.estaVacia())
                    cola.agrega(aux.quita());
            
            }
                
        }
    
    }
    
    private static void cicloNull(ColaADT<Persona> cola, ColaADT<Persona> aux){
        int max = 0;
        Persona mayor = null;
        while(!(cola.consultaPrimero() == null)){
            
            Persona elim = cola.quita();
            if (elim.calculaEdad() > max){
                if(!(mayor == null))
                    cola.agrega(mayor);
                mayor = elim;
                max = mayor.calculaEdad();
            }
            else
                cola.agrega(elim);
        }
        aux.agrega(mayor);
        cola.agrega(cola.quita()); // Manda el null al último. Si es el único elemento el null, lo deja igual. 
    }
    
    
    
}
