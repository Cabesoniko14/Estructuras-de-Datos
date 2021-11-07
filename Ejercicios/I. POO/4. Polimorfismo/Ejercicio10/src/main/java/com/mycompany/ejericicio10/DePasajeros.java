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
public class DePasajeros extends Camion{
    
    private int totalPasaj;
    
    public DePasajeros(){
    }

    public DePasajeros(int totalPasaj, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.totalPasaj = totalPasaj;
        
    }

    @Override
    public String toString() {
        return  super.toString() + "\nTotal de pasajeros: " + totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
    
    
    
    
    
}
