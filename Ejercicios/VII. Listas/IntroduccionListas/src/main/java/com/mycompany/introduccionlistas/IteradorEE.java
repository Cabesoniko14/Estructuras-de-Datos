/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionlistas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author javi
 */
public class IteradorEE<T> implements Iterator<T>{
    
    private Nodo<T> actual;
    
    public IteradorEE(Nodo<T> actual){
        this.actual = actual;
    }
    
    public boolean hasNext(){
        return actual != null;
    }
    
    public T next(){
        if (hasNext()){
            T dato = actual.getDato();
            actual = actual.getDireccion();
            return dato;
        }
        else
            throw new NoSuchElementException();
            
    }
}
