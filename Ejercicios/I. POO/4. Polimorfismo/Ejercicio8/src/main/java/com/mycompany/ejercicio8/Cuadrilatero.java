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
public class Cuadrilatero implements FigGeometrica{
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    
    public Cuadrilatero(){
    }

    public Cuadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    
    public double calculaArea(){
        return lado1 * lado2;  
    }
    
    public double calculaPerimetro(){
        return lado1 + lado2 + lado3 + lado4;
    
    }
    
    
    
}
