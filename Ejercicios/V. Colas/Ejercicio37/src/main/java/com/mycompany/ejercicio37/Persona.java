/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio37;

/**
 *
 * @author javi
 */
public class Persona {
    private String nombre;
    private String fechaNac;
    
    public Persona(String nombre, String fechaNac){
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    
    }
    
    public int calculaEdad(){
        
        int edad = 0;
        
        int dia = 31;
        int mes = 12;
        int año = 2021;
        
        int diaN = Integer.parseInt(this.fechaNac.substring(0, 2));
        int mesN = Integer.parseInt(this.fechaNac.substring(3, 5));
        int añoN= Integer.parseInt(this.fechaNac.substring(6, 10));
        
        if ((mes > mesN)||(mes == mesN && dia >= diaN))
            edad = año - añoN;
        else
            edad = año - añoN - 1;
        
        return edad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + this.calculaEdad();
    }
    
    
    
}
