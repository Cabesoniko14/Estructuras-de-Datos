package com.mycompany.ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author javi
 */
public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        Rectangulo otro = (Rectangulo) obj;
       // duda aquí 
        return base == otro.base && altura == otro.altura;
    }

    @Override
    public String toString() {
        return "Base= " + base + ", altura= " + altura;
    }
    
    public double calculaArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 2*(base + altura);
    }
    
    
}
