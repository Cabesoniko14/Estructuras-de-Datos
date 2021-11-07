/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio38;

/**
 *
 * @author javi
 */
public class Foto extends Archivo{
    
    private double resolucion;
    
    public Foto(Double tamaño, String nombre, String dueño, String fecha, Double resolucion){
        super(tamaño, nombre, dueño, fecha);
        this.resolucion = resolucion;
    
    }

    public double getResolucion() {
        return resolucion;
    }
    
    @Override
    public String toString() {
        return "Tipo de Archivo: foto\n" + super.toString() + "\nResolución: " + resolucion;
    }
    
}
