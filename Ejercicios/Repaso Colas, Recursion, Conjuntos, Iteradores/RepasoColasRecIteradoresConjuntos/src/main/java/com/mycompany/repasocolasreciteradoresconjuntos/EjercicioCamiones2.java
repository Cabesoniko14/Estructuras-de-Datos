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
public class EjercicioCamiones2 {
    
    private ColaADT<Camion> colaCamion;

    public EjercicioCamiones2() {
        
        colaCamion = new ColaA();
        
    }
    
    
    
    public void altaCamion(Camion cam){
        colaCamion.agrega(cam);
    
    }
    
    public String repCola() {
        StringBuilder sB = new StringBuilder();
        ColaADT<Camion> aux = colaCamion;
        if (!aux.estaVacia()){
            while(!aux.estaVacia()){
                Camion dat = aux.consultaPrimero();
                if (dat instanceof DeVolteo)
                    sB.append(((DeVolteo)dat).toString());
                else
                    sB.append(((DePasajeros)dat).toString());
                aux.quita();
            }
        }
        return sB.toString();
            
           
    }
    
}
