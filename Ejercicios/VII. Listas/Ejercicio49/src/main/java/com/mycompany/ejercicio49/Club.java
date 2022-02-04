/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio49;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class Club {
    
    private String nombreClub;
    private ListaOrdenada<Persona> socios;
    
    public Club(){
        socios = new ListaOrdenada();
    }
    
    public Club(String nombre){
        super();
        this.nombreClub = nombre;
    }
    
    public boolean altaSocio(String nombre, int edad, int clave){
        return socios.agrega(new Persona(nombre, edad, clave));
    }
    
    public Persona quitaSocio(int clave){
        Persona res = socios.quitaDato(new Persona(clave));
        return res;
    }
    
    public String consultaSocio(int clave){
        return consultaSocio(socios.iterator(), new Persona(clave));
    }
    
    private String consultaSocio(Iterator<Persona> it, Persona consult){
        if (!it.hasNext())
            return null;
        else{
            Persona aux = it.next();
            if (consult.equals(aux))
                return aux.toString();
            else
                return consultaSocio(it, consult);
        }
    }
    
    public double calculaPromEdad(){
        return calculaPromEdad(0, 0, socios.iterator());
    }
    
    private double calculaPromEdad(int sumEdad, int personas, Iterator<Persona> it){
        if (!it.hasNext()){
            if (personas == 0)
                return -1;
            else
                return sumEdad/personas;
        }
        else{
            Persona aux = it.next();
            return calculaPromEdad(sumEdad + it.next().getEdad(), personas +1, it);
        }
    }
    
}
