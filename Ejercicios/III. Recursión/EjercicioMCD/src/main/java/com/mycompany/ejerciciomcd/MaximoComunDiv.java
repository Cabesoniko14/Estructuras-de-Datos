/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciomcd;

/**
 *
 * @author javi
 */
public class MaximoComunDiv {
    
    public MaximoComunDiv(){
    }
    
    public int maxComunDiv(int m, int n){
        if (n>0)
            return maxComunDiv(n, m%n);
        else
            return m;
    }
    
    public static void main(String[] args) {
        System.out.println("Máximo común divisor de 10 y 5");
    }
    
}
