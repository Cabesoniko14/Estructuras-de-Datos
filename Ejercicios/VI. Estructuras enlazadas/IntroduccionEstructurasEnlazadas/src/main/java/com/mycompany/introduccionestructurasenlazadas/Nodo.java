/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionestructurasenlazadas;

/**
 *
 * @author javi
 */
public class Nodo <T> {
    
    private T dato;
    private Nodo<T> direccion;

    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
        this.direccion = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getDireccion() {
        return direccion;
    }

    public void setDireccion(Nodo direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\n" + dato;
    }
    
}
