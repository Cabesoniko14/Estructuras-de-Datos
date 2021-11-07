/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author javi
 */
public class ComplejoVacacional {
    
    private String nombre;
    private Rectangulo[] albercas;
    private int totalAlb;
    private final int MAX = 10;

    public ComplejoVacacional() {
        albercas = new Rectangulo[MAX];
        totalAlb = 0;
    }

    public ComplejoVacacional(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public boolean altaAlberca(double lado1, double lado2){
        boolean resp = false;
        
        if(totalAlb < albercas.length){ // totalAlb < MAX
            resp = true;
            albercas[totalAlb] = new Rectangulo (lado1, lado2);
            totalAlb++;
        } 
        return resp;
        
    }
    
    public double calculaLona(){
        double totalLona = 0;
        
        for(int i = 0; i < totalAlb; i++)
            totalLona += albercas[i].calculaArea();
        return totalLona;
    }
    
    public double calculaCerca(){
        double totalCerca = 0;
        
        for(int i = 0; i < totalAlb; i++)
            totalCerca += albercas[i].calculaPerimetro();
        return totalCerca;
    }
    
    public boolean clausuraAlberca(int numero){
        boolean resp;
        if (numero >0 && numero <= totalAlb){
            albercas[numero - 1] = albercas[totalAlb - 1];
            totalAlb--;
            resp = true;      
        }
        else
            resp = false;
        return resp;
    }
    
    
}
