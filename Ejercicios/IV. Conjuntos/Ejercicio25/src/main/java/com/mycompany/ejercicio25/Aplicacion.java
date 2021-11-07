/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio25;

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        // Crear alumnos
        
        Alumno al1 = new Alumno("Laura", "5to", 20, 9, "Derecho", true);
        Alumno al2 = new Alumno("Javier", "5to", 21, 8, "Ciencia de Datos", true);
        Alumno al3 = new Alumno("Rabbit", "5to", 27, 10, "Negocios", false);
        Alumno al4 = new Alumno("Suribeca", "5to", 13, 9, "Mecatrónica", false, "Computación", false);
        Alumno al5 = new Alumno("El Macho", "5to", 10, 6, "Economía", true, "Derecho", true);
        Alumno al6 = new Alumno("Santi", "5to", 22, 7, "Mecatrónica", false, "Computación", false);
        Alumno al7 = new Alumno("Seb", "5to", 20, 10, "Computación", false, "Ciencia de Datos", true);
        
        // 1. Agregar alumnos (probando 3. String de todos los alumnos)
        
        Escuela esc = new Escuela("ITAM");
        
        esc.agregaAlum(al1);
        esc.agregaAlum(al2);
        esc.agregaAlum(al3);
        esc.agregaAlum(al4);
        esc.agregaAlum(al5);
        esc.agregaAlum(al6);
        esc.agregaAlum(al7);
        
        //System.out.println(esc.todosAlumnos());
        
        // 2. Quita alumnos
        
        esc.quitaAlumno("El Macho");
        System.out.println(esc.todosAlumnos());
        
        // 4. Ingeniería y licenciatura
        
        System.out.println(esc.licIng());
        
        // 5.  Ingeniería o Licenciatura, no ambas
        
        System.out.println(esc.licOIng());
        
        // 6. Calcular y regresar el promedio de todos los alumnos de Ingeniería
        
        System.out.println(esc.promedioIngeniería());
        
        // 7. Total de alumnos de 22 o más años
        
        System.out.println(esc.alum22mas());
        
        
    }
    
}
