/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio49;

/**
 *
 * @author javi
 */
public class Persona implements Comparable<Persona> {
    
    private String nombre;
    private int edad;
    private int clave;

    public Persona() {
    }

    public Persona(int clave) {
        this.clave = clave;
    }
    
    

    public Persona(String nombre, int edad, int clave) {
        this.nombre = nombre;
        this.edad = edad;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public int getClave() {
        return clave;
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
        final Persona other = (Persona) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {
        return this.clave - o.clave;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nClave: " + clave;
    }
    
    
    
    
    
    
    

    
    
}
