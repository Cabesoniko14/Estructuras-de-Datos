/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author javi
 */
public abstract class Empleado {
    
    private static int serie = 100;
    private int claveEmpleado;
    private String nombreEmpleado;
    protected double sueldoBase;
    
    protected Empleado(){   
        claveEmpleado = serie;
        serie++;
    }

    protected Empleado(String nombreEmpleado, double sueldoBase) {
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
    }

    protected Empleado(String nombreEmpleado) {
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = 0;
    }
    

    public Empleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado:" + "\nClave del empleado: " + claveEmpleado + "\nNombre del empleado: " + nombreEmpleado + "\nSueldo base: $" + sueldoBase;
    }
    
    public boolean equals(Object obj) {
        Empleado otro = (Empleado) obj;
        return this.claveEmpleado == otro.claveEmpleado;
    }
    
    public void aumentaSueldo(double porcentaje){
        sueldoBase = sueldoBase * porcentaje / 100 + sueldoBase;
    }
    
    public abstract double calculaSalario(double prestac, double deduc);
    
    public int compareTo(Empleado otro){
        return this.claveEmpleado - otro.claveEmpleado;
    }
    
  
}
