/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1solucionguardati;

/**
 *
 * @author javi
 */
public class PrimeraPregunta {
    
    
    // Primera solución
    public static <T> double sumaNumeros(PilaADT<T> pila){
        double suma;
        boolean bandera = false;
        PilaADT<T> aux = new PilaA();
        T dato;
        
        suma = 0;
        while(!pila.isEmpty()){
            dato = pila.pop();
            if (dato instanceof Integer){
                suma += (Integer)dato;
                bandera = true;
            
            }
            else{
                if (dato instanceof Double){
                    suma+= (Double)dato;
                    bandera = true;
            }
            }
            aux.push(dato);
            
        
        }
        
        copiaPila(aux,pila);
        if (!bandera)
            throw new RuntimeException("No hay valores numéricos");
        return suma;
    
    }
    
    // Solución 2
    
    public static <T> double sumaNumerosFB(PilaADT<T> pila){
        
        double suma;
        boolean bandera = false;
        PilaADT<T> aux = new PilaA();
        T dato;
        
        suma = 0;
        while(!pila.isEmpty()){
            dato = pila.pop();
            try{
                suma += Double.parseDouble(dato.toString());
                bandera = true;
            }
            catch (NumberFormatException e){
            }
            aux.push(dato);
        
        }
        copiaPila(aux,pila);
        if (!bandera)
            throw new RuntimeException("No hay valores numéricos");
        return suma;
    
    }
    
    private static <T> void copiaPila(PilaADT<T> origen, PilaADT<T> destino){
        while(!origen.isEmpty())
            destino.push(origen.pop());
    }
    
    
    
}
