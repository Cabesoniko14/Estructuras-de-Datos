/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author javi
 */
public class Operario extends Empleado {
    
    private int horasExtras;

    public Operario() {
        super();
    }

    public Operario(int horasExtras, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtras = horasExtras;
    }
    
    public Operario (String nombreEmpleado){
        super(nombreEmpleado);
        horasExtras = 10;
    }

    public Operario(int claveEmpleado) {
        super(claveEmpleado);
    }
    
    
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append(super.toString());
        cad.append("\nHoras extra: " + horasExtras);
        return cad.toString();
    }
    
    public double calculaSalario(double prestac, double deduc, double precioHE){
        return calculaSalario(prestac, deduc) + precioHE * horasExtras;
        // Como estoy sobrecargando y no sobreescribiendo, busca en la clase superior. Si quiero lo pongo pero no lo necesito
    }
    
}
