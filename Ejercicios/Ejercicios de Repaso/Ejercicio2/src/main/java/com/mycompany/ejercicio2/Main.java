/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author javi
 */
public class Main {
    
    public static void main(String[] args) {
        Restaurante gusteaus = new Restaurante("Gusteau's");
        
        // CP1: Sin datos
        
        System.out.println("Total de manteles a comprar: " + gusteaus.calculaMantel());
        
        // CP2: Con 4 mesas nuevas
        
        gusteaus.altaMesa(4);
        gusteaus.altaMesa(7);
        gusteaus.altaMesa(8);
        gusteaus.altaMesa(12);
        gusteaus.altaMesa(20);
        
        System.out.println("Total de manteles a comprar: " + gusteaus.calculaMantel());
        System.out.println("Total de puntilla a comprar: " + gusteaus.calculaPuntilla());
        
        gusteaus.quitarMesa(3);
        
        // CP 3: Quitando una mesa
        
        System.out.println("Total de manteles a comprar: " + gusteaus.calculaMantel());
        System.out.println("Total de manteles a comprar: " + gusteaus.calculaPuntilla());
        
    }
    
}
