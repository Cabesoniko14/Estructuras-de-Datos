/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio14;

/**
 *
 * @author javi
 */
public class Pilas {
    
    public static <T> int cuentaElementos(PilaADT<T> pila){ //Me va a servir para que me mande pilas de cualquier tipo y generar métodos 
        PilaADT<T> aux = new Pila();
        int cont = 0;
        
        while(!pila.isEmpty()){ 
            aux.push(pila.pop());
            cont++;
        }
        copiaPila(aux,pila);
        return cont;
    }
    
    private static <T> void copiaPila(PilaADT<T> origen, PilaADT<T> destino){
        while(!origen.isEmpty())
            destino.push(origen.pop());
    }
    
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila(5);
        for(int i = 0; i < 10; i++)
            pila1.push(i);
        
        System.out.println("\nÚltimo elemento guardado: " + pila1.peek());   
    }
    
}
