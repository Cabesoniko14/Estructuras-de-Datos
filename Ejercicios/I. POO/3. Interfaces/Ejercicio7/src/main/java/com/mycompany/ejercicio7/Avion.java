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
public class Avion {
    private String modelo;
    private int maxPasajeros;
    private boolean pasajeros;
    private int claveAvion;
    private static int serie = 100;
    
    public Avion(){
        claveAvion = serie;
        serie++;
    }
    
    public Avion(String modelo, int maxPasajeros, boolean pasajeros){
        this();
        this.modelo = modelo;
        this.maxPasajeros = maxPasajeros;
        this.pasajeros = pasajeros;
    }
    
    public Avion(int claveAvion){
        this.claveAvion = claveAvion;
    }

    public boolean isPasajeros() {
        return pasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }
    
    public void despega(){
        System.out.println("Enciende los motores, avanza un poco y asciende poco a poco");
    }
    
    public void aterriza(){
        System.out.println("Prende unas lucecitas y va bajando hacia adelante");
    
    }
    
    public void seDesplaza(){
        System.out.println("Como Buzz Lightyear");
    
    }
    
    public int compareTo(Avion otro){
        return this.claveAvion - otro.claveAvion;
    }
    
    public boolean equals(Object obj) {
        Avion otro = (Avion) obj;
        return this.claveAvion == otro.claveAvion;
    }

    @Override
    public String toString() {
        return "Pájaro:\n" + "maxPasajeros=" + maxPasajeros + ", pasajeros=" + pasajeros + ", claveAvion=" + claveAvion + '}';
    }
    
    
    
}
