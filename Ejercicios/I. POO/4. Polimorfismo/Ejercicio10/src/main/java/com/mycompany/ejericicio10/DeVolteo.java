/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejericicio10;

/**
 *
 * @author javi
 */
public class DeVolteo extends Camion {
    
    private double capacidadTon;

    public DeVolteo() {
    }

    public DeVolteo(String marca, String numMotor, String placas, double capacidadTon) {
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de toneladas: " + capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }
    
    
    
    
}
