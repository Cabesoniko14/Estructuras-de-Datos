/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.control2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author javi
 */
public class IteradorArreglo <T> implements Iterator<T>{
    private T[] datos;
    private int actual;
    private int total;
    
    public IteradorArreglo(T[] coleccion, int totCol){
        datos = coleccion;
        total = totCol;
        actual = 0;
    }
    
    public boolean hasNext(){
        return actual < total;
    }
    
    public T next(){
        if (hasNext())
            return datos[actual++]; // Regresa actual y luego lo acutaliza
        else
            throw new NoSuchElementException();
        
        
            
        
    
    }
    
}
