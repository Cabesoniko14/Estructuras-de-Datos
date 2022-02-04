/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio49;

/**
 *
 * @author javi
 */
public class NodoDoble <T>{
    
    private T dato;
    private NodoDoble<T> izq;
    private NodoDoble<T> der;
    
    public NodoDoble(){
        izq = null;
        der = null;
    }
    
    public NodoDoble(T dato){
        this();
        this.dato = dato;
    
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getIzq() {
        return izq;
    }

    public void setIzq(NodoDoble<T> izq) {
        this.izq = izq;
    }

    public NodoDoble<T> getDer() {
        return der;
    }

    public void setDer(NodoDoble<T> der) {
        this.der = der;
    }
    
    
    
    
    
}
