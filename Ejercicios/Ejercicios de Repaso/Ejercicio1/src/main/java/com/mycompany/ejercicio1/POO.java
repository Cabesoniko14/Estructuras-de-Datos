/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author javi
 */
public class POO {
    
    public static void main(String[] args){
        ComplejoVacacional club = new ComplejoVacacional("El Descanso");
        
        //CP1: Sin datos
        
        System.out.println("\nTotal de lona a comprar: " + club.calculaLona());
        
        club.altaAlberca(2, 4);
        club.altaAlberca(3, 5);
        club.altaAlberca(10, 6);
        club.altaAlberca(2, 4);
        
        //CP2: Con 4 albercas
        
        System.out.println("\nTotal de lona a comprar: " + club.calculaLona());
        System.out.println("\nTotal de cerca a comprar: " + club.calculaCerca());
        
        club.clausuraAlberca(3);
        
        // Habiendo quitado alberca
        
        System.out.println("\nTotal de lona a comprar: " + club.calculaLona());
        System.out.println("\nTotal de cerca a comprar: " + club.calculaCerca());

                
    }
            
}
