/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio38;

import java.util.Objects;

/**
 *
 * @author javi
 */
public abstract class Archivo {
    
    private double tamaño;
    private String nombre;
    private String dueño;
    private String fecha;

    public Archivo() {
    }
    
    public Archivo(double tamaño, String nombre, String dueño, String fecha) {
        this.tamaño = (Double)tamaño;
        this.nombre = nombre;
        this.dueño = dueño;
        this.fecha = fecha;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tamaño: " + tamaño + "\nNombre: " + nombre + "\nDueño: " + dueño + "\nFecha: " + fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Archivo other = (Archivo) obj;
        if (Double.doubleToLongBits(this.tamaño) != Double.doubleToLongBits(other.tamaño)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dueño, other.dueño)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }
    
     
    
}
