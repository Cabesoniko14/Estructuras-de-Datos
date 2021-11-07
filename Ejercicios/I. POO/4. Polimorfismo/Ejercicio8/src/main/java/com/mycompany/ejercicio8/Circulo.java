/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author javi
 */
public class Circulo implements FigGeometrica{
    private double radio;
    
    public Circulo(){
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * radio; 
    }

    @Override
    public String toString() {
        return "Radio: " + radio;
    }
    
    
    
}
