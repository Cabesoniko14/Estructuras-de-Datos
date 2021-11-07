/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio25;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public interface ConjuntoADT <T> extends Iterable<T>{
    
    public boolean agrega(T nuevo);
    public T quita(T dato);
    public boolean contiene (T dato);
    public boolean vacio();
    public int getCardinalidad();
    public String toString();
    public ConjuntoADT<T> union(ConjuntoADT<T> otro);
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro);
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro);
    public Iterator<T> iterator();
    
}
