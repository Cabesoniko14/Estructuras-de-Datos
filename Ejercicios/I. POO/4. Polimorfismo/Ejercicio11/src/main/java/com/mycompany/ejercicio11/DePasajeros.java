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

public abstract class DePasajeros extends Camion{
    
    private int totalPasaj;
    
    public DePasajeros(){
    }

    public DePasajeros(String marca, String numMotor, String placas, int totalPasaj, double costoCamion) {
        super(marca, numMotor, placas, costoCamion);
        this.totalPasaj = totalPasaj;  
    }

    @Override
    public String toString() {
        return  super.toString() + "\nTotal de pasajeros: " + totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
    
    public double calculaCostoServicio(double km, int pasaj){
       
        
        return ((0.0001 * this.getCostoCamion() * (km)))/pasaj;
        
    }
      
}
