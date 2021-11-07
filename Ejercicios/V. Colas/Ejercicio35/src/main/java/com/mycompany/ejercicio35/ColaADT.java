/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio35;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public interface ColaADT<T>{
    
    public void agrega(T dato);
    public T quita();
    public boolean estaVacia();
    public T consultaPrimero();
    public T consultaUltimo();
    public ArrayList<T> multiQuita(int n);
    public int cuentaElementos();
    
}