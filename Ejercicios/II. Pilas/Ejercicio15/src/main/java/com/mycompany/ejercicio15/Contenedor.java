/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio15;

/**
 *
 * @author javi
 */
public class Contenedor {
    
    public Contenedor() {
    }
    
    public <T> boolean pilaContiene(PilaADT<T> p1, PilaADT<T> p2){
        boolean resp = true;
        PilaADT<T> p1aux = new PilaA();
        PilaADT<T> p2aux = new PilaA();
        
        while (!p2.isEmpty() && resp){
            int cont = 0;

            while(!p1.isEmpty() && resp && !p2.isEmpty()){
                if (p1.peek().equals(p2.peek())){ // mejor equals
                        cont++;
                        p1aux.push(p1.pop()); 
                        p2aux.push(p2.pop());
                    }
                    else
                        p1aux.push(p1.pop());
                    
               
            }
            
            if (cont != 0){
                
                while(!p1aux.isEmpty()){
                    p1.push(p1aux.pop());
                }
                
                }
            else
                resp = false;
        }
            while (!p2aux.isEmpty())
                p2.push(p2aux.pop());
            
            if (!p1aux.isEmpty()){
                while(!p1aux.isEmpty()){
                    p1.push(p1aux.pop());
                }
            }
            
            return resp;
        }
        
        
    
    }
