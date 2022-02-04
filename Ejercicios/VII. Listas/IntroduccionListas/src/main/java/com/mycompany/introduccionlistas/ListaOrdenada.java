/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionlistas;

/**
 *
 * @author javi
 */
public class ListaOrdenada <T extends Comparable<T>> extends Lista<T> implements ListaOrdenadaADT<T>{

    public ListaOrdenada() {
    }    
    
    // Agrega ordenadamente y sin repetir
    public boolean agrega (T dato){
        
        boolean resp = false;
        
        if (this.estaVacia()){
            primero = new NodoDoble(dato);
            ultimo = primero;
            resp = true;
        }
        else{
            if(primero.getDato().compareTo(dato) > 0){
                NodoDoble<T> nuevo = new NodoDoble(dato);
                nuevo.setDer(primero);
                primero.setIzq(nuevo);
                primero = nuevo;
                resp = true;
            }
            else{
                if(ultimo.getDato().compareTo(dato) < 0){
                    NodoDoble<T> nuevo = new NodoDoble(dato);
                    nuevo.setIzq(ultimo);
                    ultimo.setDer(nuevo);
                    ultimo = nuevo;
                    resp = true;
                }
                else{
                    NodoDoble<T> posicion = this.buscaDato(primero, dato);
                    if (!posicion.getDato().equals(dato)){
                        resp = true;
                        NodoDoble<T> nuevo = new NodoDoble(dato);
                        nuevo.setIzq(posicion.getIzq());
                        posicion.getIzq().setDer(nuevo);
                        nuevo.setDer(posicion);
                        posicion.setIzq(nuevo);
                    }
                }
            }
        
        }
        return resp;
    
    }
    
    public boolean contiene(T dato){
        NodoDoble<T> posicion = this.buscaDato(primero, dato);
        return posicion != null && posicion.getDato().equals(dato);
    }
    
    private NodoDoble<T> buscaDato(NodoDoble<T> actual, T dato){
        if (actual == null)
            return null;
        else{
            if (actual.getDato().compareTo(dato) >= 0)
                return actual;
            else
                return buscaDato(actual.getDer(), dato);
        }        
    }
    
    public T quitaDato(T dato){
        T resultado = null;
        NodoDoble<T> posicion = this.buscaDato(primero, dato);
        if (posicion != null && posicion.getDato().equals(dato)){
            resultado = posicion.getDato();
            if(primero.getDato().compareTo(dato) == 0)
                this.quitaPrimero();
            else if(ultimo.getDato().compareTo(dato) == 0)
                this.quitaUltimo();
            else{
                posicion.getIzq().setDer(posicion.getDer());
                posicion.getDer().setIzq(posicion.getIzq());
                posicion.setDer(null);
                posicion.setIzq(null);
            }
        }
        
        return resultado;
    
    }
    
    public boolean equals (ListaOrdenada<T> listaParam){
        if(this == null || listaParam == null)
            throw new RuntimeException("Lista null");
        else
            return equals(this.primero, listaParam.primero);
    
    }
    
    private boolean equals(NodoDoble<T> apuntOrig, NodoDoble<T> apuntParam){
        if (apuntOrig == null || apuntParam == null)
            return apuntOrig == null && apuntParam == null;
        else{
            if(apuntOrig.getDato().equals(apuntParam.getDato()))
                return equals(apuntOrig.getDer(), apuntParam.getDer());
            else
                return false;
        }
    }
    
    
}
