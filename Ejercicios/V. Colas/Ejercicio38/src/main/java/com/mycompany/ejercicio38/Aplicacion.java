/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio38;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        Impresora impr = new Impresora("HP Deskjet");
        impr.agregarDoc(400.0, "CV.docx", "Javi", "31/01/1976", "Malon");
        impr.agregarFoto(300.0, "Viaje.jpeg", "Javi", "02/01/1984", 600);
        impr.agregarDoc(800.0, "Reporte.pdf", "Javi", "31/01/1976", "Equis");
        impr.agregarFoto(600.0, "Paisaje.jpeg", "Javi", "29/01/1990", 1700);
        impr.agregarDoc(200.0, "Examen2.docx", "Javi", "31/01/2012", "Malon");
        impr.agregarFoto(800.0, "Laubbi.jpeg", "Javi", "02/01/1984", 1300);
        impr.agregarDoc(900.0, "Tesisfinalfinal.pdf", "Javi", "31/01/1976", "Super");
        impr.agregarFoto(300.0, "Perrito.jpeg", "Javi", "02/01/1984", 600);
        
        // 1. Impresión de toda la cola y // 2. Agregar docuemntos y fotos
        
        //System.out.println(impr.lectura());
        
        // 3. Imprimir el primer archivo de la cola
        
        //System.out.println(impr.imprArch());
        //System.out.println(impr.lectura());
        
        // 4. Eliminar todas las fotos de la cola de impresion
        
        impr.eliminaFotos();
        
        // 5. Eliminar docs de mas de 500KB
        
        System.out.println(impr.eliminaDocsMas500());
        System.out.println(impr.lectura());
    }
    
}
