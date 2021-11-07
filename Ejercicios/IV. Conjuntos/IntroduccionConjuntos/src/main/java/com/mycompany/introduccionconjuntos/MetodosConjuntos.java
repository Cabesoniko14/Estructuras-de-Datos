/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionconjuntos;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class MetodosConjuntos {
    
    public MetodosConjuntos(){
    }
    
    public static <T> boolean equals(ConjuntoADT<T> este, ConjuntoADT<T> otro){
        
        if (otro.getCardinalidad() != este.getCardinalidad())
            return false;
        else{
            return equals(este, otro.iterator());
        }
    }
    
    private static <T> boolean equals(ConjuntoADT<T> este, Iterator<T> it){
        
        if (!(it.hasNext())){
            return true;
        
        }
        else{
            if (este.contiene(it.next()))
                return equals(este, it);
            else
                return false;
        }
    }
    
}
