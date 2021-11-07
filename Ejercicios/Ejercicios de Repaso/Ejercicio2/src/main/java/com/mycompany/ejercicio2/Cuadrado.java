/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author javi
 */
public class Cuadrado {
    
    private double lado;
    
    public Cuadrado(){
}
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public boolean equals(Object obj){
        Cuadrado otro = (Cuadrado) obj;
        return lado == otro.lado;
    }
    
    @Override
    public String toString(){
        return "Lado: " + lado;
    }
    
    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerimetro(){
        return 4*lado;
    }
}
