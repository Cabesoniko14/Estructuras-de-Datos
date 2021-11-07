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
public class Turismo extends DePasajeros {
    
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
    }

    public Turismo(String marca, String numMotor, String placas, int totalPasaj, double costoCamion, boolean asientoCama, boolean serviBar) {
        super(marca, numMotor, placas, totalPasaj, costoCamion);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    public boolean isServiBar() {
        return serviBar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTiene asiento cama: " + asientoCama + "\nTiene serviBar: " + serviBar;
        
    }
    
    public double calculaCostoServicioT(double km, int pasaj){     
        double base =  calculaCostoServicio(km, pasaj);
        
        if (asientoCama == true)
            base += base * 0.05;
        
        if (serviBar == true)
            base += base * 0.05;
        
        return base;
    }
    
}
