/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccioncolas;

/**
 *
 * @author javi
 */
public class ColasTest {
    
    public static void main(String[] args) {
        ColaADT<String> colores = new ColaA();
        colores.agrega("verde");
        colores.agrega("azul");
        colores.agrega("blanco");
        colores.agrega("negro");
        System.out.println("\nCP1: luego de agregar 4 elementos: " + colores);
        System.out.println("\nCP2: elemento eliminado: " + colores.quita());
        System.out.println("\nCP3: luego de la elimiación: " + colores);
        while (!colores.estaVacia())
            System.out.println(colores.quita());
        try{
            System.out.println(colores.consultaPrimero());
        
        } catch(Exception e){
            System.out.println("\nCP3: " + e);
        
        }
    }
    
}
