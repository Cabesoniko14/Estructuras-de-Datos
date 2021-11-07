/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio16;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class Invertir {
    
    public static <T> void InvertirPilaPilas(PilaADT<T> p1){
        PilaADT<T> p1aux = new PilaA();
        PilaADT<T> p2aux = new PilaA();
        
        while(!p1.isEmpty())
            p1aux.push(p1.pop());
        
        while(!p1aux.isEmpty())
            p2aux.push(p1aux.pop());
        
        while(!p2aux.isEmpty())
            p1.push(p2aux.pop());
    
    }
    
    public static <T> void InvertirPilaAL(PilaADT<T> p1){
        ArrayList <T> aux = new ArrayList();
        
        while(!p1.isEmpty())
            aux.add(p1.pop());
        
        for (int i = 0; i < aux.size(); i++)
            p1.push(aux.get(i));
    
    }
        
}
