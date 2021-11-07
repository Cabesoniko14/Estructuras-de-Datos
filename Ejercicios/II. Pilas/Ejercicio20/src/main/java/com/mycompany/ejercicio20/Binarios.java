/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio20;

/**
 *
 * @author javi
 */
public class Binarios {
    
    public Binarios (){
    
    }
    
    public static int convertirBinario(int entero){
        String cad = "";
        
        PilaA <Integer> pila1 = new PilaA<Integer>();
        
        while (entero != 1){
            if ((entero/2) != 1){
                pila1.push(entero%2);   
            }
            else{
                pila1.push(entero%2);
                pila1.push(entero/2);       
            }
            entero = entero/2;   
        }
        
        while(!pila1.isEmpty()){
            cad += pila1.pop();
        }
        
        int binario = Integer.parseInt(cad);
        
        return binario;
    
    }

}