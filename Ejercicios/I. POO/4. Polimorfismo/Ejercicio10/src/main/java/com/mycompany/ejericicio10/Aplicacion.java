/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejericicio10;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        // Dar de alta empresa
        
        EmpresaMinera mineros = new EmpresaMinera();
        
        // Dar de alta camiones de pasajeros
        
        mineros.altaCamion(50, "Mitsubishi", "4", "274JSN");
        mineros.altaCamion(100, "Mitsubishi", "3", "727HDB");
        mineros.altaCamion(20, "Mitsubishi", "7", "836HDI");
        mineros.altaCamion(30, "Mitsubishi", "9", "0765OWB");
        mineros.altaCamion(10, "Chevrolet", "12", "715OUY");
        mineros.altaCamion(20, "Chevrolet", "2", "184ICY");
        mineros.altaCamion(25, "Chevrolet", "4", "017UST");
        mineros.altaCamion(30, "Chevrolet", "6", "154ATK");
        mineros.altaCamion(10, "Mercedes Benz", "12", "297VIF");
        mineros.altaCamion(5, "Mercedes Benz", "4", "164MAK");
        mineros.altaCamion(100, "Mercedes Benz", "2", "123ASD");
        mineros.altaCamion(4, "Mercedes Benz", "3", "456DFG");
        mineros.altaCamion(150, "Toyota", "1", "183ICT");
        
        // Dar de alta camiones de volteo
        
        mineros.altaCamion("Mitsubishi", "Poderoso", "123LAU", 10);
        mineros.altaCamion("Chevrolet", "Débil", "294IVR", 20);
        mineros.altaCamion("Camiones chidos", "Cañón", "853WKM", 30);
        mineros.altaCamion("Porsche", "Durísimo", "836HRM", 40);
        mineros.altaCamion("Ferrari", "Por ai anda", "034GOY", 50);
        mineros.altaCamion("Volvo", "Sí que jala", "675UTE", 50);
        mineros.altaCamion("Alfa Romeo", "Poderoso", "188THH", 20);
        mineros.altaCamion("Tesla", "Meh", "860HNL", 180);
        mineros.altaCamion("Alienware", "Podría ser mejor", "888JJJ", 70);
        
        
     
        // 1. Regresar en forma de cadena todos los datos de los camiones de pasajeros
        
        System.out.println("\nReporte de los camiones de pasajeros:\n\n" + mineros.repDePasajeros());
        
        // 2. Dada la placa de un camión de volteo, actualizar su capacidad de transporte
        
        mineros.actualizaCapacidadTon("123LAU", 50);
        System.out.println("\nReporte de los camiones de volteo" + mineros.repDeVolteo());
        
        // 3. Calcular y regresar el total de camiones pasajeros de una cierta marca
        
        System.out.println(mineros.camionesMarca("Mitsubishi"));
        
        // 4. Calcular y regresar el total de toneladas de tierra que puede ser transportada simultáneamente
        
        System.out.println(mineros.capacidadCamiones());

        
    }
    
}
