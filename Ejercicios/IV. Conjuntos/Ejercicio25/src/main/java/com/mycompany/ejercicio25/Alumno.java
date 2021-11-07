/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio25;

import java.util.Objects;

/**
 *
 * @author javi
 */
public class Alumno {
    private String nombre;
    private String grado;
    private int edad;
    private double prom;
    private String nomCarrera1;
    private String nomCarrera2;
    private boolean lic;
    private boolean lic2;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public Alumno(String nombre, String grado, int edad, double prom, String nomCarrera1, boolean lic) {
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
        this.prom = prom;
        this.nomCarrera1 = nomCarrera1;
        this.lic = lic;
    }
    
    
    public Alumno(String nombre, String grado, int edad, double prom, String nomCarrera1, boolean lic, String nomCarrera2, boolean lic2) {
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
        this.prom = prom;
        this.nomCarrera1 = nomCarrera1;
        this.nomCarrera2 = nomCarrera2;
        this.lic = lic;
        this.lic2 = lic2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrado() {
        return grado;
    }

    public int getEdad() {
        return edad;
    }

    public double getProm() {
        return prom;
    }

    public String getNomCarrera1() {
        return nomCarrera1;
    }

    public String getNomCarrera2() {
        return nomCarrera2;
    }

    public boolean isLic() {
        return lic;
    }

    public boolean isLic2() {
        return lic2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        String cad;
        if (nomCarrera2 == null)
            cad = ("\nNombre: " + nombre + ", grado: " + grado + ", edad: " + edad + ", prom: " + prom + ", Carrera: " + nomCarrera1);
        else
            cad = ("\nNombre: " + nombre + ", grado: " + grado + ", edad: " + edad + ", prom: " + prom + ", Primera carrera : " + nomCarrera1 + ", Segunda carrera: " + nomCarrera2);
        return cad;
    }
    
    
    
    
    
    
    
    
    
}
