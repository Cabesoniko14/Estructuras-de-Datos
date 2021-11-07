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
public class Aplicacion {
    
    private Pajaro[] pajaros;
    private Avion[] aviones;
    private int totAviones;
    private int totPajaros;
    private int MAX_AVIONES = 100;
    private int MAX_PAJAROS = 100;
    
    public Aplicacion(){
        pajaros = new Pajaro[MAX_PAJAROS];
        aviones = new Avion [MAX_AVIONES];
        totAviones = 0;
        totPajaros = 0;

    }
    
    public int buscaPajaro(Pajaro pajarito){
        int izq, der, cen;
        izq = 0;
        der = totPajaros -1;
        cen = der/1;
        while (izq <= der && !pajaros[cen].equals(pajarito)){
            if (pajaros[cen].compareTo(pajarito) > 0)
                der = cen -1;
            else
                izq = cen + 1;
            cen = (izq + der)/2;
        }
        if (izq > der)
            cen = -1 * (izq + 1);
        return cen;
    }
    
    public boolean altaPajaro(String nombre, String habitat){
        boolean resp = false;
        
        if (totPajaros < pajaros.length){
            Pajaro nuevo = new Pajaro (nombre, habitat);
            int pos;
            
            pos = buscaPajaro(nuevo);
            if (pos < 0){ //No se repite
                resp = true;
                pos = -1*pos -1;
                for (int i = totPajaros; i > pos; i--)
                    pajaros[i] = pajaros[i-1];
                pajaros[pos] = nuevo;
                totPajaros++; //Para no afectar la búsqueda del for
            }
        }
        return resp;  
    }
    
    public int buscaAvion(Avion avioncito){
        int izq, der, cen;
        izq = 0;
        der = totAviones -1;
        cen = der/1;
        while (izq <= der && !aviones[cen].equals(avioncito)){
            if (aviones[cen].compareTo(avioncito) > 0)
                der = cen -1;
            else
                izq = cen + 1;
            cen = (izq + der)/2;
        }
        if (izq > der)
            cen = -1 * (izq + 1);
        return cen;
    }
    
    public boolean altaAvion(String modelo, int maxPas, boolean pasaj){
        boolean resp = false;
        
        if (totAviones < aviones.length){
            Avion nuevo = new Avion (modelo, maxPas, pasaj);
            int pos;
            
            pos = buscaAvion(nuevo);
            if (pos < 0){ //No se repite
                resp = true;
                pos = -1*pos -1;
                for (int i = totAviones; i > pos; i--)
                    aviones[i] = aviones[i-1];
                aviones[pos] = nuevo;
                totAviones++; //Para no afectar la búsqueda del for
            }
        }
        return resp;  
    }
    
    public String repPajaros(int clavePajaro){
        Pajaro aBuscar = new Pajaro(clavePajaro);
        int pos;
        StringBuilder cad = new StringBuilder();
        
        pos = buscaPajaro(aBuscar);
        if(pos >= 0){
            cad.append("Hábitat: " + pajaros[pos].getHabitat() + "");
            pajaros[pos].despega();
            pajaros[pos].seDesplaza();
            pajaros[pos].aterriza();
        }
        else
            cad.append("No se encontró su pajarito.");
        
    return cad.toString();
    }
    
    public void repPajaros2(int clave){
        Pajaro aBuscar = new Pajaro(clave);
        int pos;
        
        pos = buscaPajaro(aBuscar);
        if (pos >= 0){
            System.out.println("\nReporte de pájaro");
            System.out.println("Hábitat: " + pajaros[pos].getHabitat());
            System.out.println("Nombre: " + pajaros[pos].getNombre());
            pajaros[pos].despega();
            pajaros[pos].seDesplaza();
            pajaros[pos].aterriza(); 
        }
        
        else
            System.out.println("No existe este pajarito.");
        
    }
    
    public String repAvionPasajero(int claveAvion){
        Avion aBuscar = new Avion(claveAvion);
        int pos;
        StringBuilder cad = new StringBuilder();
        
        pos = buscaAvion(aBuscar);
        
        
        if (pos>= 0){
            if (aviones[pos].isPasajeros() == true)
                cad.append("Capacidad de " + aviones[pos].getMaxPasajeros() + " pasajeros.");
            else
                cad.append("El avión no es de pasajeros.");
        }
        else
            cad.append("La clave del avión no fue encontrada.");
        
        return cad.toString();   
    }
    
    
    public void cambioHabitat(int clave, String habitat){
        Pajaro aBuscar = new Pajaro(clave);
        int pos;
        
        pos = buscaPajaro(aBuscar);
        if(pos >= 0)
            pajaros[pos].setHabitat(habitat);
    }
    
}
