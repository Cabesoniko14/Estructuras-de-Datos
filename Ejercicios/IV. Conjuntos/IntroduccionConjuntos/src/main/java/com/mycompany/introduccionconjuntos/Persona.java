/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionconjuntos;

/**
 *
 * @author javi
 */
public class Persona {
    private String nom;
    private int edad;
    
    public Persona(){
    }

    public Persona(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " +  nom + "\nEdad: " + edad;
    }
    
    public boolean equals(Object obj){
        Persona p = (Persona)obj;
        return this.nom.equals(p.nom);
    }
    
    
    
    
    
}
