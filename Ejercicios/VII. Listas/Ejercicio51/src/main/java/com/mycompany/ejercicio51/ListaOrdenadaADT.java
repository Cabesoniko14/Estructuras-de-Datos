/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio51;

/**
 *
 * @author javi
 */
public interface ListaOrdenadaADT <T extends Comparable<T>> extends ListaADT<T>{
    
    public boolean agrega(T dato);
    
}
