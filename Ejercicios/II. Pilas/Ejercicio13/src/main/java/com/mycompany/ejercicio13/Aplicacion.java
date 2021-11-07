/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio13;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        InvierteCad cad = new InvierteCad("supercalifragilisticoespeiralidoso");
        
        // Revisar cadenas antes de la inversión
        
        System.out.println("\nCadena inicial previa a la llamada del método: " + cad.getCadenaInicial());
        System.out.println("\nCadena invertida previa a la llamada del método: " + cad.getCadenaInvertida());
        
        // Inicializar método
        
        cad.invierteCadena();
        
        // Revisar cadenas
        
        System.out.println("\nCadena inicial después de la llamada del método: " + cad.getCadenaInicial());
        System.out.println("\nCadena invertida después de la llamada del método: " + cad.getCadenaInvertida());
        
        
    }
    
}
