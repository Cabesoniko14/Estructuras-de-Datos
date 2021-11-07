/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio11;

/**
 *
 * @author javi
 */

public abstract class Camion {
    
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;
    
    public Camion(){
        
    }

    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }
    
    public Camion(String placas){ //Para el buscador
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }

    public double getCostoCamion() {
        return costoCamion;
    }

    @Override
    public String toString() {
        return "Camión de marca: " + marca + "\nNúmero de motor: " + numMotor + "\nPlacas: " + placas + "\nCosto del camión: " + costoCamion ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean resp = false;
        
        if (obj != null && obj.getClass().equals(this.getClass())){
            Camion otro = (Camion)obj;
            resp = this.numMotor.equalsIgnoreCase(otro.numMotor); // Investigar sobre equalsIgnoreCase()
        }
        
        return resp;
    }
    
    
    
    
    
    
    
}
