/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

/**
 * @author javi
 */
public class Triangulo implements FigGeometrica{
    
    public double lado1;
    public double lado2;
    public double lado3;
    
    public Triangulo(){
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double calculaArea(){
        double sP = this.calculaPerimetro()/2;
        double area = Math.sqrt(sP * (sP - lado1) * (sP - lado2) * (sP - lado3));
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        return lado1 + lado2 + lado3;
    }
    

    
    public boolean esEquilatero(){
        return lado1 == lado2 && lado2 == lado3;
    
    }
    
    
}
