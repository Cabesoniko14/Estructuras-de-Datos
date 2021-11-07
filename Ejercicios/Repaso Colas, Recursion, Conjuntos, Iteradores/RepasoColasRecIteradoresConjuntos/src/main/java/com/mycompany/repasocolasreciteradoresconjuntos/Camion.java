/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasocolasreciteradoresconjuntos;

import java.util.Objects;

/**
 *
 * @author javi
 */
public abstract class Camion {
    
    private String marca;
    private String numMotor;
    private String placas;
    
    public Camion(){
        
    }
    public Camion(String numMotor){
        this.numMotor = numMotor;
    
    }

    public Camion(String marca, String numMotor, String placas) {
        this.marca = marca;
        this.numMotor = numMotor;
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

    @Override
    public String toString() {
        return "Camión de marca: " + marca + "\nNúmero de motor: " + numMotor + "\nPlacas: " + placas ;
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
    

