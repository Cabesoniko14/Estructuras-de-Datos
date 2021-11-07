/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author javi
 */
public class Restaurante {
    
    private String nombre;
    private Cuadrado[] mesas;
    private int numMesas;
    private final int MAX = 25;
    
    public Restaurante(){
        mesas = new Cuadrado[MAX];
        numMesas = 0;
    }
    
    public Restaurante(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public boolean altaMesa(double lado){
        boolean resp = false;
        
        if (numMesas < mesas.length){
            resp = true;
            mesas[numMesas] = new Cuadrado(lado);
            numMesas++;
        }
        return resp;
    }
    
    public double calculaMantel(){
        double totalMantel = 0;
        
        for(int i = 0; i < numMesas; i++)
            totalMantel += mesas[i].calculaArea();
        return totalMantel;
    }
    
    public double calculaPuntilla(){
        double totalPuntilla = 0;
        
        for(int i = 0; i < numMesas; i++)
            totalPuntilla += mesas[i].calculaPerimetro();
        return totalPuntilla;
    }
    
    public boolean quitarMesa(int numero){
        boolean resp;
        if(numero>0 && numero <= numMesas){
            mesas[numero - 1] = mesas[numMesas - 1];
            numMesas--;
            resp = true;
        }
        else{
            resp = false;
        }
        
        return resp; 
    }
 

}
    
    
    
