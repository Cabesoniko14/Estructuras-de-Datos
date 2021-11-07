/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio12;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {

        RevisorParentesis prueba = new RevisorParentesis("{4[2(3) + (4*6)]6}") ;
        
        // Ejercicio 12
        
        System.out.println(prueba.revisaParentesis());
        
        //Ejercicio 18
        
        System.out.println(prueba.revisaSintaxis());
        
        
        
        
    }
    
}
