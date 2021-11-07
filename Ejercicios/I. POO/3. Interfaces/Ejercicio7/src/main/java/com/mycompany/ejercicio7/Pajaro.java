/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio7;

/**
 *
 * @author javi
 */
public class Pajaro implements ObjetoVolador {
    private String habitat;
    private String nombre;
    private int clavePajaro;
    private static int serie = 100;
    
    public Pajaro(){
        clavePajaro = serie;
        serie++;
    }
    
    public Pajaro(String nombre, String habitat){
        this();
        this.habitat = habitat;
        this.nombre = nombre;
    
    }
    
    public Pajaro(int clavePajaro){
        this.clavePajaro = clavePajaro;
    
    }
    
    public void despega(){
        System.out.println("Despega: Salta en dos patitas y se lanza a volar.");
    }
    
    public void aterriza(){
        System.out.println("Aterrizaje: Aletea y se impulsa hacia arriba bajando la intensidad.");
    
    }
    
    public void seDesplaza(){
        System.out.println("Desplazamiento: Va aleteando y saltando como si fuera flappy birds");
    
    }

    @Override
    public String toString() {
        return "Pajaro:\n" + "\nNombre:" + nombre + "Habitat=" + habitat;
    }    

    public String getHabitat() {
        return habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public int compareTo(Pajaro otro){
        return this.clavePajaro - otro.clavePajaro;
    }
    
    public boolean equals(Object obj) {
        Pajaro otro = (Pajaro) obj;
        return this.clavePajaro == otro.clavePajaro;
    }
    
    
}
