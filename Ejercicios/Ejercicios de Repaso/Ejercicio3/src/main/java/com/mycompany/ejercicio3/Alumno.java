/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author javi
 */
public class Alumno implements Comparable<Alumno> {
    
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlum;
    private double [] calif;
    private int totalCalif;
    private final int MAX_CALIF = 50;
    
    public Alumno(){
        calif = new double[MAX_CALIF];
        totalCalif = 0;
        claveUnica = serie;
        serie++;
    }
    
    public Alumno (String nombreAlum){
        this();
        this.nombreAlum = nombreAlum;
    }
    
    public Alumno (int clave){
        this.claveUnica = clave;
    }
    
    public boolean equals(Object obj){
        Alumno otro = (Alumno) obj;
        return this.claveUnica == otro.claveUnica;
    }
    
    public String toString(){
        return "Nombre" + nombreAlum + "\nClave única: " + claveUnica;
    }
    
    public String getNombre(){
        return nombreAlum;
    }
    
    
    public boolean altaCalif(double nueva){
        boolean resp = false;
        if (totalCalif < calif.length){
            calif[totalCalif] = nueva;
            totalCalif++;
            resp = true;
        }
        return resp;    
    }
 
    public int compareTo(Alumno otro){
        return this.claveUnica - otro.claveUnica;
    }

    public int getTotalCalif() {
        return totalCalif;
    }
   
    
    
    
}
