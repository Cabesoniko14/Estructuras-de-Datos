/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio40;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class EE <T> implements Iterable<T> {
    
    private Nodo<T> primero;
    
    public EE() {
        primero = null; // Indica que está vacía
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public void agregaInicio(T nuevoDato){
        Nodo<T> nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.setDireccion(primero);
        primero = nuevoNodo;
        
    }
    
    public T quitaPrimero(){
        if (estaVacia())
            throw new RuntimeException("No hay elementos");
        T eliminado = primero.getDato();
        Nodo<T> auxiliar = primero;
        primero = primero.getDireccion();
        auxiliar.setDireccion(null); // Romper la dirección del primero anterior
        return eliminado;
    
    }
    
//    public String toString(){ 
//        StringBuilder sB = new StringBuilder();
//       Nodo<T> apuntador = primero;
//        
//        while(apuntador != null){
//            sB.append(apuntador.getDato()).append("\n");
//            apuntador = apuntador.getDireccion();
//        }
//        return sB.toString();
//    }
    
    public String toString(){
        return toString(primero, new StringBuilder());
    }
    
    private String toString(Nodo<T> apuntador, StringBuilder sB){
        if (apuntador == null)
            return sB.toString();
        else{
            sB.append(apuntador.getDato()).append("\n");
            return toString(apuntador.getDireccion(), sB);
        }
    }
    
    public void agregaFinal(T nuevoDato){
        Nodo<T> nuevoNodo = new Nodo(nuevoDato);
        if(estaVacia())
            primero = nuevoNodo;
        else{
            Nodo<T> apuntador = primero;
            while(apuntador.getDireccion() != null) // Se detiene sobre el último nodo
                apuntador = apuntador.getDireccion();
            apuntador.setDireccion(nuevoNodo);        
        }    
    }
    
    public T quitaUltimo(){
        if(estaVacia())
            throw new RuntimeException("No hay datos");
        T eliminado;
        if(primero.getDireccion() == null){
            eliminado = this.quitaPrimero();
            primero = null;
        }
        else{
            Nodo<T> anterior = primero;
            Nodo<T> actual = primero.getDireccion();
            while(actual.getDireccion() != null){
                anterior = anterior.getDireccion();
                actual = actual.getDireccion();
            }
            eliminado = actual.getDato();
            anterior.setDireccion(null);
        }
        return eliminado;
    
    }
    
    public boolean buscaDato(T dato){
        return buscaDato(primero, dato);
    }
    
    private boolean buscaDato(Nodo<T> actual, T dato){
        if(actual == null)
            return false;
        if(actual.getDato().equals(dato))
            return true;
        else
            return buscaDato(actual.getDireccion(), dato);
    }
    
    
    // Quita el nodo que contiene al dato
    
    public T quitaDato(T dato){
        
        T eliminado = null;
        Nodo<T> anterior, actual;
        anterior = null;
        actual = primero;
        while((actual != null) && (!actual.getDato().equals(dato))){
            anterior = actual;
            actual = actual.getDireccion();
        }
        if(actual != null){ // Dato fue encontrado
            eliminado = actual.getDato();
            if (actual == primero) // El dato está en el primero nodo
                primero = primero.getDireccion();
            else
                anterior.setDireccion(actual.getDireccion());
            actual.setDireccion(null);
        }
        
        return eliminado;
        
    }
    
    public Iterator<T> iterator(){
        return new IteradorEE(primero);    
    }
    
    public boolean eliminaSiguienteDe(T info){
        boolean band = false;
        
        if(estaVacia())
            throw new RuntimeException("No hay datos");
        
        
        Nodo<T> anterior, actual;
        anterior = primero;
        actual = primero.getDireccion();
        
        while( (actual != null) && (!(anterior.getDato().equals(info))) ){
            anterior = actual;
            actual = actual.getDireccion();
        
        }
        
        // Si es null y lo encontró (solo hay un elemento y es info, o info es el último elemento, no podemos eliminar nada). False
        // Si es null porque llegó al final y no lo encontró, false igualmente
         
        if (actual != null){
            anterior.setDireccion(actual.getDireccion());
            actual.setDireccion(null);
            band = true;
        }
        
        return band;
            
    }
    
    public boolean eliminaAnteriorA(T info){
        if (estaVacia())
            throw new RuntimeException("No hay datos");
        
        boolean band = false;
        Nodo<T> anterior, actual;
        anterior = null;
        actual = primero;
        
        // Hacer el if/else masivo
        
        if(!(primero.getDato().equals(info))){
        
            while((actual.getDireccion() != null) && (!(actual.getDireccion().getDato().equals(info)))){
                anterior = actual;
                actual = actual.getDireccion();
            }
            if (actual.getDireccion().getDato().equals(info)){
                if (anterior == null){
                    primero = actual.getDireccion();
                    actual.setDireccion(null);
                }
                else{
                    anterior.setDireccion(actual.getDireccion());
                    actual.setDireccion(null);
                }
                band = true;
            }
        }
        
        return band;
    
    }
    
    public boolean insertaAntesQue(T refer, T nuevo){
        
        if (estaVacia())
            throw new RuntimeException("No hay datos");
        
        boolean band = false;
        Nodo<T> anterior, actual;
        Nodo<T> nuevoN = new Nodo(nuevo);
        anterior = null;
        actual = primero;
        
        if(primero.getDato().equals(refer)){
            primero = nuevoN;
            primero.setDireccion(actual);
            band = true;
        
        }
        else{
            
            while((actual != null) && (!(actual.getDato().equals(refer)))){
                anterior = actual;
                actual = actual.getDireccion();
            }
            if(actual != null){
                anterior.setDireccion(nuevoN);
                nuevoN.setDireccion(actual);
                band = true;
            }
        
        }
        
        return band;
            
    
    }
    
    
    
}
