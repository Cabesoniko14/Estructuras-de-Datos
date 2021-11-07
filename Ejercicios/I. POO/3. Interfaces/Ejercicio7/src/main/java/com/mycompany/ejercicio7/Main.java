/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio7;

/**
 *
 * @author javi
 */
public class Main {
    
    public static void main(String[] args) {
        // Creación de la aplciación
    
        Aplicacion app = new Aplicacion();
    
        // Llenar los arreglos de nuevos pájaros y aviones
        
        app.altaAvion("Avionzote", 300, true);
        app.altaAvion("Jet militar", 0, false);
        app.altaAvion("Carga", 0, false);
        app.altaAvion("Jet", 10, true);
        
        app.altaPajaro("Blu", "Río de Janeiro");
        app.altaPajaro("Paloma", "Parques");
        app.altaPajaro("Águila", "El que quiera");
        
        // Reporte de pájaros
        
        System.out.println("\nReporte de pájaro\n" + app.repPajaros(100));
        System.out.println("\nReporte de pájaro\n" + app.repPajaros(104));
        app.repPajaros2(100);
        
        // Reporte de aviones de pasajeros
        
        System.out.println("\nReporte de avión de pasajeros\n" + app.repAvionPasajero(100));
        System.out.println("\nReporte de avión de pasajeros\n" + app.repAvionPasajero(101));
        System.out.println("\nReporte de avión de pasajeros\n" + app.repAvionPasajero(104));
        // Actualizar habitat de un pájaro
        
        app.cambioHabitat(103, "Desierto");

    }
    
}
