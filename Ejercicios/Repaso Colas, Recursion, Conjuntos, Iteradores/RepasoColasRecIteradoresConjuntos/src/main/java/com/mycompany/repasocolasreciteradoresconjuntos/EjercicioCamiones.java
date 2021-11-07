/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasocolasreciteradoresconjuntos;

/**
 *
 * @author javi
 */
public class EjercicioCamiones {
    
    private ColaADT<Camion> colaCamion;

    public EjercicioCamiones() {
        colaCamion = new ColaA();
    }
    
    public boolean buscaCamion(String placas){
        ColaADT<Camion> aux = new ColaA();
        boolean bandera = false;
        while(!colaCamion.estaVacia()){
            Camion cam = colaCamion.consultaPrimero();
            if (cam.getPlacas().equalsIgnoreCase(placas))
                bandera = true;
            aux.agrega(cam);
            colaCamion.quita();
        }
        while(!aux.estaVacia())
            colaCamion.agrega(aux.quita());
        return bandera;
    
    }
    
    public String consultaCamion(String placas){
        ColaADT<Camion> aux = new ColaA();
        String consulta = "";
        while(!colaCamion.estaVacia()){
            Camion cam = colaCamion.consultaPrimero();
            if (cam.getPlacas().equalsIgnoreCase(placas))
                consulta = cam.toString();
            aux.agrega(cam);
            colaCamion.quita();
        }
        while(!aux.estaVacia())
            colaCamion.agrega(aux.quita());
        return consulta;
    
    }
    
    public boolean altaCamionDeVolteo(String marca, String numMotor, String placas, double capacidadTon){
        boolean busq = buscaCamion(placas);
        boolean bandera = false;
        if (busq == false){ // no está en la cola
            colaCamion.agrega(new DeVolteo(marca, numMotor, placas, capacidadTon));
            bandera = true;
        } 
        return bandera;
    }
    
    public boolean altaCamionPasaj(int totalPasaj, String marca, String numMotor, String placas){
        boolean busq = buscaCamion(placas);
        boolean bandera = false;
        if (busq == false){ // no está en la cola
            colaCamion.agrega(new DePasajeros(totalPasaj, marca, numMotor, placas));
            bandera = true;
        } 
        return bandera;
    }
    

    public String repCola() {
        StringBuilder sB = new StringBuilder();
        ColaADT<Camion> aux = new ColaA();
            while(!colaCamion.estaVacia()){
                Camion dat = colaCamion.consultaPrimero();
                sB.append(dat.toString() + "\n\n" );
                colaCamion.quita();
                aux.agrega(dat);
            }
        
        while(!aux.estaVacia())
            colaCamion.agrega(aux.quita());
        return sB.toString();
            
           
    }
    
    
    public void quitarDePasaj(){
        ColaADT<Camion> aux = new ColaA();
        while (!colaCamion.estaVacia()){
            Camion cam = colaCamion.consultaPrimero();
            if (cam instanceof DePasajeros)
                colaCamion.quita();
            else
                aux.agrega(colaCamion.quita());
        }
        while (!aux.estaVacia())
            colaCamion.agrega(aux.quita());
    
    }
    
    public void quitarCapMen5(){
        ColaADT<Camion> aux = new ColaA();
        while (!colaCamion.estaVacia()){
            Camion cam = colaCamion.consultaPrimero();
            if (cam instanceof DeVolteo){
                if(((DeVolteo)cam).getCapacidadTon() < 5)
                    colaCamion.quita();
                else
                    aux.agrega(colaCamion.quita());
            }
            else
                aux.agrega(colaCamion.quita());
        }
        while (!aux.estaVacia())
            colaCamion.agrega(aux.quita());
    
    }
    

    
    
}
