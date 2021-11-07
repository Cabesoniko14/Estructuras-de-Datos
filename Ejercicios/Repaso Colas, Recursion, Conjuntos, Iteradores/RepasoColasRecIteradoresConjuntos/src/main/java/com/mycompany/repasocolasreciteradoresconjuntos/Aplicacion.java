/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasocolasreciteradoresconjuntos;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        EjercicioCamiones test = new EjercicioCamiones();
        test.altaCamionDeVolteo("A", "12", "123ABC", 2);
        test.altaCamionDeVolteo("B", "13", "456ABC", 8);
        test.altaCamionDeVolteo("C", "14", "789ABC", 16);
        test.altaCamionPasaj(12, "17", "145","ABCERERE");
        test.altaCamionPasaj(542, "18", "2984","ye");
        
        
        //System.out.println(test.consultaCamion("123ABC") + "\n");
        //System.out.println(test.consultaCamion("ye") + "\n");
        //System.out.println(test.repCola());
        //System.out.println(test.repCola());
        //test.quitarDePasaj();
        //System.out.println(test.repCola());
        //test.quitarCapMen5();
        //System.out.println(test.repCola());
        
        // Ejercicio de alumnos
        
        EjercicioAlumnos prueba = new EjercicioAlumnos();
        
        prueba.altaAlumno("Laura", "5o", 20, 9.5, "Derecho", false);
        prueba.altaAlumno("Javier", "5o", 21, 9.2, "C. Datos", true);
        prueba.altaAlumno("Paco", "5o", 20, 5, "Derecho", false);
        prueba.altaAlumno("Andrea", "5o", 19, 6, "Ing. Negocios", true);
        prueba.altaAlumno("Santiago", "5o", 18, 6, "Economía", false);
        prueba.altaAlumno("Montse", "5o", 22, 10, "Computación", true);
        prueba.altaAlumno("Marco", "5o", 24, 8, "Matemáticas", false);
        prueba.altaAlumno("Pedro", "5o", 22, 2, "Relaciones Internacionales", true);
        prueba.altaAlumno("Suegra", "5o", 19, 7, "Ciencia Política", false);
        prueba.altaAlumno("Suegra", "5o", 19, 8, "Economía", true);
        prueba.altaAlumno("Paco", "5o", 19, 6, "Ciencia Política", true);
        prueba.altaAlumno("Solovino", "5o", 19, 5, "Ciencia Política", false);
        System.out.println(prueba.repColaF());
        System.out.println(prueba.repColaT());
        prueba.quitarOcurrencias();
        prueba.beca();
        System.out.println(prueba.repColaF());
        System.out.println(prueba.repColaT());
        
        
        
        
        
        
        
        
    }
    
}
