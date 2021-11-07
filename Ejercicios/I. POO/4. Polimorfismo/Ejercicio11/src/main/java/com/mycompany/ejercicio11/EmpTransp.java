/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio11;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class EmpTransp {
    
    private String nombreEmpresa;
    private int totCamiones;
    private Camion[]camiones;
    final int MAX = 300;

    public EmpTransp() {
        camiones = new Camion[MAX];
        totCamiones = 0;
    }

    public EmpTransp(String nombreEmpresa) {
        this();
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, int totalPasaj, double costoCamion, boolean lugarProyecto){
        boolean resp = false;
        
        if (totCamiones < camiones.length){
            resp = true;
            camiones[totCamiones] = new Escolar(marca, numMotor, placas, totalPasaj, costoCamion, lugarProyecto);
            totCamiones++;
        }
        return resp;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, int totalPasaj, double costoCamion, boolean asientoCama, boolean serviBar){
        boolean resp = false;
        
        if (totCamiones < camiones.length){
            resp = true;
            camiones[totCamiones] = new Turismo(marca, numMotor, placas, totalPasaj, costoCamion, asientoCama, serviBar);
            totCamiones++;
        }
        
        return resp;
    }
    
    public String camionesDisponibles(int pasaj, double km){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totCamiones; i++)
            if (camiones[i] instanceof Turismo)
                if (pasaj <= ((DePasajeros)camiones[i]).getTotalPasaj()){
                    cad.append("\nInformación del camión\n" + camiones[i].toString() + "\nCosto del servicio: " + (((Turismo)camiones[i]).calculaCostoServicioT(km, pasaj)));
                }
        return cad.toString();
    }
    
    public boolean demanda(int niños, int camionesRequeridos){
        boolean resp = false;
        int cont = 0;
        
        for(int i = 0; i < totCamiones; i++)
            if(camiones[i] instanceof Escolar)
                if(niños <= ((Escolar)camiones[i]).getTotalPasaj())
                    cont++;
        
        if(cont >= camionesRequeridos)
            resp = true;
        else
            resp = false;
        return resp;
    }
    
    
    public String camionDisponible(String placa){
        String resp = "";
        

        if (totCamiones > 0){
            for (int i = 0; i < totCamiones; i++){
                if (camiones[i].getPlacas() == placa){
                    resp += camiones[i].getClass().getSimpleName().toString();
                }
            }
        }
        return resp;
    }
    
    public String camionesVeinteProyectos(){
        StringBuilder cad = new StringBuilder();
        if (totCamiones > 0){
            for (int i = 0; i<totCamiones; i++)
                if(camiones[i] instanceof Escolar){
                    if (((Escolar)camiones[i]).getTotalPasaj() >= 20 && ((Escolar)camiones[i]).isLugarProyecto())
                        cad.append(camiones[i].getPlacas() + "\n");
                }
        }
        return cad.toString();
    }
    
    public int camionesMarca(int km, String marca, double costo){
        int cont = 0;
        
        for (int i = 0; i < totCamiones; i ++)
            if (camiones[i] instanceof Turismo)
                if (((Turismo)camiones[i]).getMarca().equals(marca))
                    if (((Turismo)camiones[i]).isServiBar() && ((Turismo)camiones[i]).calculaCostoServicioT(km, ((Turismo)camiones[i]).getTotalPasaj()) < costo)
                        cont += 1;
                
        return cont;  
    }
    
    
    
    
    
    
    
    
    
}
