/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio21;

/**
 *
 * @author javi
 */
public class QuitadorElementos {
    
    public QuitadorElementos(){
    }
    
    public static <T> boolean quitarElementos(int n, PilaADT<T> p1){
        
        boolean resp = true;
        if (resp){
            try{
                p1.multiPop(n);
            }catch(Exception e){
            resp = false;
            }
        }
        return resp;  
    }
    
}
