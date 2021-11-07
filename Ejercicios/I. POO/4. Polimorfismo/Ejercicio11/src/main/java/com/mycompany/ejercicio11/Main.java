/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio11;

/**
 *
 * @author javi
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Dar de alta una empresa de transporte
        
        EmpTransp rapido = new EmpTransp("El rápido");
        
        // Dar de alta los camiones escolares
        
        rapido.altaCamion("Mitsubishi", "1", "123TZZ", 20, 300000, true);
        rapido.altaCamion("Mitsubishi", "2", "456TZZ", 40, 600000, false);
        rapido.altaCamion("Mitsubishi", "11", "927NAO", 100, 2000000, false);
        rapido.altaCamion("Chevrolet", "15", "863DLW", 10, 150000, true);
        rapido.altaCamion("Chevrolet", "11", "027VPA", 10, 150000, false);
        rapido.altaCamion("Chevrolet", "9", "275KAT", 50, 800000, true);
        rapido.altaCamion("Mercedes Benz", "2", "876KRA", 8, 120000, true);
        rapido.altaCamion("Mercedes Benz", "5", "102LVY", 15, 180000, false);
        rapido.altaCamion("Mercedes Benz", "7", "026VAE", 70, 800000, true);
        rapido.altaCamion("Mercedes Benz", "7", "017VAS", 30, 400000, true);
        rapido.altaCamion("Ferrari", "2", "131DAE", 50, 700000, true);
        rapido.altaCamion("Porsche", "3", "103JVU", 10, 9000000, true);
        rapido.altaCamion("Toyota", "1", "104NSU", 20, 300000, false);
        
        // Dar de alta los camiones de turismo
        
        rapido.altaCamion("Mitsubishi", "3", "101ODO", 200, 5000000, true, true);
        rapido.altaCamion("Mitsubishi", "4", "927HFS", 50, 2000000, true, true);
        rapido.altaCamion("Mitsubishi", "3", "204IVY", 300, 10000000, true, true);
        rapido.altaCamion("Mitsubishi", "13", "101OSU", 10, 50000000, true, true);
        rapido.altaCamion("Chevrolet", "3", "919ICA", 70, 4000000, true, false);
        rapido.altaCamion("Chevrolet", "6", "101OCA", 50, 3000000, true, false);
        rapido.altaCamion("Chevrolet", "9", "886SLA", 60, 2000000, true, false);
        rapido.altaCamion("Mercedes Benz", "12", "119VIA", 100, 5000000, false, true);
        rapido.altaCamion("Mercedes Benz", "32", "848CIA", 80, 4000000, false, true);
        rapido.altaCamion("Mercedes Benz", "53", "181UAC", 40, 900000, false, true);
        rapido.altaCamion("Mercedes Benz", "12", "113OAV", 30, 600000, false, true);
        rapido.altaCamion("Porsche", "52", "773OSV", 100, 1000000, false, false);
        rapido.altaCamion("Porsche", "81", "239AOV", 30, 300000, false, false);
        rapido.altaCamion("Porsche", "21", "100DAS", 50, 900000, false, false);
        rapido.altaCamion("Porsche", "11", "282JAC", 60, 700000, false, false);
        
        // 1. Dada cantidad de pasajeros y km a recorrer, regresar las características de los camiones y sus costos de servicio
        
        System.out.println(rapido.camionesDisponibles(60, 100));
        
        // 2. Dada la cantidad de niños y los camiones requeridos, indicar si es posible satisfacer la demanda
        
        System.out.println(rapido.demanda(20, 2));
        
        // 3. Dado el número de placas de un camión indicar el tipo de unidad que es
        
        System.out.println(rapido.camionDisponible("101OSU"));
        System.out.println(rapido.camionDisponible("876KRA"));
        
        // 4. Regresar en forma de cadena los números de placas de los camiones escolares que puedan llevar mas de 20 alumnos y tengan espacio para llevar proyectos
        
        System.out.println(rapido.camionesVeinteProyectos());
        
        // 5. Regresar el número de camiones de turismo de una marca con servicio de bar y un costo inferior a un parámetro dado
        System.out.println(rapido.camionesMarca(50, "Mercedes Benz", 200.00));
        
    }
    
}
