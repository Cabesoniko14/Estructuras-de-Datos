/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capitulo2;

/**
 *
 * @author javi
 */
public class Rectangulo {
    
    private double lado1;
    private double lado2;
    
    // Constructor por omisión
    
    public Rectangulo(){
        lado1 = 0.0;
        lado2 = 0.0;
    }
    
    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;    
    }
    
    public  void  setLado1(double  nuevoLado1){
        lado1 = nuevoLado1;
    }
    
    public  void  setLado2(double  nuevoLado2){
        lado2 = nuevoLado2;
    }
    
    public double getLado1(){
                return lado1;
        }
    
    public double getLado2(){
                return lado2;
        }
    
    public boolean equals(Rectangulo r){    
        boolean resp; 
        
        resp = ((r.lado1 == this.lado1 &&  r.lado2 == this.lado2) ||                 
                (r.lado1 == this.lado2 &&  r.lado2 == this.lado1));         
        return resp;
    }
    
    @Override
    public String toString() {
        return "\nLados del rectángulo: " + lado1 + " - " + lado2;
    }
    
      public double calcularArea(){
        return lado1*lado2;
    }
    
    public double calcularPerimetro(){
        return 2*(lado1 + lado2);
    }
}
    
  
