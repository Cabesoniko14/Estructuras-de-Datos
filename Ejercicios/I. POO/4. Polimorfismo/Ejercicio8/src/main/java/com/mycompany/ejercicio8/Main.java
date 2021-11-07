/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author javi
 */
public class Main {
    
    public static void main(String[] args) {
        
        // 1. Definir un arreglo
        
        DepGeometria dep = new DepGeometria();
        
        // 2. Dar de alta figuras
        
        dep.altaFig(true, 3); // Círculo
        dep.altaFig(true, 2);
        dep.altaFig(true, 4); // Cuadrado
        dep.altaFig(false, 8);
        dep.altaFig(false, 3);
        dep.altaFig(false, 1);
        dep.altaFig(2, 4);
        dep.altaFig(4, 7);
        dep.altaFig(3, 6);
        dep.altaFig(1, 1, 1);
        dep.altaFig(2, 2, 2);
        dep.altaFig(4, 3, 5);
        dep.altaFig(5, 5, 5);
        
        // 3. Calcular e imprimir el área de todas las figuras almacenadas
        
        System.out.println("Reporte de áreas:\n" +  dep.repFiguras());
        
        
       // 4. Encontrar e imprimir los datos del círculo más grande
       
        System.out.println(dep.buscaCirculoMayor());
        
        // 5. Calcular e imprimir el total de cuadrados
        
        System.out.println("Contador de cuadrados: " + dep.contadorCuadrados());
        
        // 6. Eliminar los triángulos equiláteros
        
        dep.quitarEquilateros();
        System.out.println(dep.repFiguras());
        
    }
    
}
