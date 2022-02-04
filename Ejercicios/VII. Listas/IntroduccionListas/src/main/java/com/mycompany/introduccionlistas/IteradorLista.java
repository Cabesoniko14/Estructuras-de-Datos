/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionlistas;

/**
 *
 * @author javi
 */

import java.util.Iterator;
import java.util.NoSuchElementException;


public class IteradorLista <T> implements Iterator<T>{
    
    private NodoDoble<T> actual;
    
    public IteradorLista(NodoDoble<T> actual){
        this.actual = actual;
    }
    
    public boolean hasNext(){
        return actual != null;
    }
    
    public T next(){
        if (hasNext()){
            T dato = actual.getDato();
            actual = actual.getDer();
            return dato;
        }
        else
            throw new NoSuchElementException();
            
    }
    
    
    
}
    
    
   

