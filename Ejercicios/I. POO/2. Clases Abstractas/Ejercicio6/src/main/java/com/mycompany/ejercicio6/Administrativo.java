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
public class Administrativo extends Empleado {
    
    private String departamento;
    private String telefono;
    
    public Administrativo(){
        super();
    }

    public Administrativo(String departamento, String telefono, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }
    
    public Administrativo(String nombreEmpleado){
        super(nombreEmpleado);
        departamento = "";
        telefono = "55 5555 5555";
    }
    
    public Administrativo(int claveEmpleado){
        super(claveEmpleado);    
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append(super.toString());
        cad.append("\nDepartamento: " + departamento + "\nTeléfono: " + telefono);
        return cad.toString();
    }    
    
    @Override
    public double calculaSalario(double prestac, double deduc){
        return sueldoBase + prestac - deduc;
    }
}
