/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasocolasreciteradoresconjuntos;

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
    private boolean lic;

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


    public boolean isLic() {
        return lic;
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
        cad = ("\nNombre: " + nombre + ", grado: " + grado + ", edad: " + edad + ", prom: " + prom + ", Carrera: " + nomCarrera1);
        return cad;
    }
    
    
    
    
    
    
    
    
    
}
