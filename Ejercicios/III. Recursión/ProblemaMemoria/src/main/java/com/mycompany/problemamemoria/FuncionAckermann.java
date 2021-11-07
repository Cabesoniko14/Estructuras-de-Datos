/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.problemamemoria;

/**
 *
 * @author javi
 */
public class FuncionAckermann {
    
    public static int ackermann(int m, int n){
        
        if ((m<=0 & n<=0)||(m<0||n<0))
            throw new RuntimeException("datos incorrectos");
        else if (m==0)
            return n+1;
        else if (n==0)
            return ackermann(m-1, 1);
        else
            return ackermann(m-1, ackermann(m, n-1));
    
    }
    
    public static void main(String[] args) {
        System.out.println(ackermann(1,2));
    }
    
}
