/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class DepGeometria {
    
    private FigGeometrica[] figuras;
    private int totFiguras;
    
    public DepGeometria(){
        figuras = new FigGeometrica[20];
        totFiguras = 0;
    }
    
    public boolean altaFig(double lado1, double lado2){
        boolean resp = false;
        
        if (totFiguras < figuras.length){
            resp = true;
            figuras[totFiguras] = new Rectangulo(lado1, lado2);
            totFiguras++;
        }
        
        return resp;
    }
    
    public boolean altaFig(double lado1, double lado2, double lado3){
        boolean resp = false;
        
        if (totFiguras < figuras.length){
            resp = true;
            figuras[totFiguras] = new Triangulo(lado1, lado2, lado3);
            totFiguras++;
        }
        
        return resp;
    }
    
    public boolean altaFig(boolean tipo, double lado){
        boolean resp = false;
        
        if (totFiguras < figuras.length){
            resp = true;
            if (tipo)
                figuras[totFiguras] = new Circulo(lado);
            else
                figuras[totFiguras] = new Cuadrado(lado);
            totFiguras++;
            
        }
        
        return resp;
        
    }
    
    public String repFiguras(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totFiguras; i++)
            cad.append("Área de la figura: " + figuras[i].calculaArea() + "\n");
        return cad.toString();
    }
    
    public ArrayList<String> buscaCirculoMayor(){
        ArrayList<String> circulos = null;
        
        if (totFiguras > 0){
            circulos = new ArrayList();
            double maximo = -10;
            for (int i =0; i< totFiguras; i++)
                if(figuras[i].getClass().getSimpleName().equals("Circulo")){
                    if (figuras[i].calculaArea() == maximo)
                        circulos.add(figuras[i].toString());
                    else
                        if (figuras[i].calculaArea() > maximo){
                            circulos.clear();
                            maximo = figuras[i].calculaArea();
                            circulos.add(figuras[i].toString());
                        }               
                }
        }        
        return circulos;
    }
    
    
    /**
     * 
     * Este método cuenta 
     */
    
    public int contadorCuadrados(){
        int cont = 0;
        
        if (totFiguras > 0){
            for (int i = 0; i < totFiguras; i++){
                if (figuras[i].getClass().getSimpleName().equals("Cuadrado"))
                    cont += 1; 
            }
        }
    return cont;
    }
    
    public int eliminarEquilateros(){
        int cont, i;
        
        cont = 0;
        i = 0;
        
        while (i < totFiguras)
            try {
                if (((Triangulo)figuras[i]).esEquilatero()){
                    totFiguras--;
                    figuras[i] = figuras[totFiguras];
                    figuras[totFiguras] = null;
                    cont++;
                }
                else
                    i++;               
            }
        catch (Exception e){
            i++;
        }
        
    return cont;
    
    }
    
    public int quitarEquilateros(){
        int cont = 0;
        if (totFiguras > 0){
            for (int i = 0; i < totFiguras;){
                if (figuras[i].getClass().getSimpleName().equals("Triangulo")){
                    if(((Triangulo)figuras[i]).esEquilatero()){
                        totFiguras--;
                        figuras[i] = figuras[totFiguras];
                        figuras[totFiguras] = null;
                        cont++;
                    }
                    else
                        i++;
                }
                else
                    i++;
                
            }
        }
        return cont;       
    }
    
    // Ya sea quitarEuilateros() o eliminarEquilateros funciona !

    }
        
          