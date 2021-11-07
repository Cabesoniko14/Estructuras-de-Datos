/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejericicio10;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class EmpresaMinera {
    
    private String nombreEmpresa;
    private Camion[] camiones;
    private int totCamiones;
    private final int MAX = 300;

    public EmpresaMinera() {
        camiones = new Camion[MAX];
        totCamiones = 0;
    }
    
    public boolean altaCamion(int totalPasaj, String marca, String numMotor, String placas){
        boolean resp = false;
              
        if(totCamiones < camiones.length){
            resp = true;
            camiones[totCamiones] = new DePasajeros(totalPasaj, marca, numMotor, placas);
            totCamiones++;
        }
        return resp;
    
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double capacidadTon){
        boolean resp = false;
              
        if(totCamiones < camiones.length){
            resp = true;
            camiones[totCamiones] = new DeVolteo(marca, numMotor, placas, capacidadTon);
            totCamiones++;
        }
        return resp;
    
    }
    
    public String repDePasajeros(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totCamiones; i++)
            if (camiones[i] instanceof DePasajeros){
                cad.append("Informacion del camión\n" + ((DePasajeros)camiones[i]).toString() + "\n");   
            }
        return cad.toString();
    }
    
    public String repDeVolteo(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totCamiones; i++)
            if (camiones[i] instanceof DeVolteo){
                cad.append("Información del camión\n" + camiones[i].toString() + "\n");
            
            }
        
        return cad.toString();
        
    }

    
    public void actualizaCapacidadTon(String placa, int capacidad){

        if (totCamiones > 0){
            for (int i = 0; i < totCamiones; i++){
                if (camiones[i] instanceof DeVolteo){
                    if (camiones[i].getPlacas() == placa){
                        ((DeVolteo)camiones[i]).setCapacidadTon(capacidad);                        
                    }               
                }
            }
        }
    }
    
    public int camionesMarca(String marca){
        int conta = 0;
        
        if (totCamiones > 0){
            for (int i = 0; i < totCamiones; i++)
                if(camiones[i] instanceof DePasajeros){
                    if (camiones[i].getMarca().equalsIgnoreCase(marca))
                        conta++;
                }
        }
        return conta;
    }
    
    public double capacidadCamiones(){
        double suma = 0;
        
        if (totCamiones > 0){
            for (int i = 0; i < totCamiones; i++)
                if(camiones[i] instanceof DeVolteo){
                    suma =  suma + ((DeVolteo)camiones[i]).getCapacidadTon(); 
            
            }
        }
        return suma;     
    }
    
}
    
    
    
    