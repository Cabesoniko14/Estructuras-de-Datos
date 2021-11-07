/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio17;

/**
 *
 * @author javi
 */
public class Repetidos {
    
    public static <T> void quitaRepetidos(PilaADT<T> pila){
        if (!pila.isEmpty()){
            PilaADT<T> pilaAux = new PilaA();
            pilaAux.push(pila.pop());
            while (!pila.isEmpty()){
                if (pila.peek().equals(pilaAux.peek()))
                    pila.pop();
                else
                    pilaAux.push(pila.pop());
            }
            while (!pilaAux.isEmpty())
                pila.push(pilaAux.pop());
        }     
    }  
}
