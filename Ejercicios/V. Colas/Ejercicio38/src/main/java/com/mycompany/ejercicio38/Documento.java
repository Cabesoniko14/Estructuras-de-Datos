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
public class Documento extends Archivo{
    
    private String tipoProcesador;

    public Documento() {
    }

    public Documento(Double tamaño, String nombre, String dueño, String fecha, String tipoProcesador) {
        super(tamaño, nombre, dueño, fecha);
        this.tipoProcesador = tipoProcesador;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    @Override
    public String toString() {
        return "Tipo de Archivo: documento\n" + super.toString() + "\nTipoProcesador: " + tipoProcesador;
    }
}
