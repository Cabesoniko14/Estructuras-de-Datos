/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio13;

/**
 *
 * @author javi
 */
public class InvierteCad {
    
    private String cadenaInicial;
    private String cadenaInvertida;
    
    public InvierteCad(String cadena) {
        this.cadenaInicial = cadena;
        this.cadenaInvertida = "";
    }    

    public String getCadenaInicial() {
        return cadenaInicial;
    }

    public String getCadenaInvertida() {
        return cadenaInvertida;
    }

    public boolean invierteCadena(){
        boolean resp = true;
        PilaA <Character> aux = new PilaA<Character>();
        
        for(int i = 0; i < this.cadenaInicial.length(); i++) // Pasar datos a pila sin alterar cadena
            aux.push(this.cadenaInicial.charAt(i));
        
        while(!aux.isEmpty()){
            try{
                this.cadenaInvertida = cadenaInvertida + aux.pop().toString();
            }catch (Exception e){
                resp = false;
            }
        }            
       
        return resp;
    }

}
