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
public class Escolar extends DePasajeros{
    
    private boolean lugarProyecto;

    public Escolar() {
    }

    public Escolar(String marca, String numMotor, String placas, int totalPasaj, double costoCamion, boolean lugarProyecto) {
        super(marca, numMotor, placas, totalPasaj, costoCamion);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
    
    public double calculaCostoServicioP(int pasaj, double km){
        return (calculaCostoServicio(km, pasaj))*(250/km);
    
    }
    
    
}
