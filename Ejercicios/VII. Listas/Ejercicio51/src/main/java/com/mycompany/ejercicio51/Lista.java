/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio51;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public abstract class Lista <T> implements ListaADT<T>{
    
    protected NodoDoble<T> primero;
    protected NodoDoble<T> ultimo;
    
    public Lista(){
        primero = null;
        ultimo = null;
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public Iterator<T> iterator(){
        return new IteradorLista(primero);  
    }
    
    public T quitaPrimero(){
        if (this.estaVacia())
            throw new RuntimeException("Lista vacía");
        T eliminado = primero.getDato();
        primero = primero.getDer();
        if (primero == null) // Hay un solo elemento en la lista
            ultimo = null;
        else{
            primero.getIzq().setDer(null);
            primero.setIzq(null);
        
        }
        
        return eliminado;
    }
    
    public T quitaUltimo(){
        if (this.estaVacia())
            throw new RuntimeException("Lista vacía");
        T eliminado = ultimo.getDato();
        ultimo = ultimo.getIzq();
        if (ultimo == null)
            primero = null;
        else{
            ultimo.getDer().setIzq(null);
            ultimo.setDer(null);
        
        }
        return eliminado;
    }
    
    public T quita(T dato){
        if (this.estaVacia())
            throw new RuntimeException("Lista vacía");
        T eliminado =  null;
        if (primero.getDato().equals(dato)){
            eliminado = quitaPrimero();
        }
        else{
            if (ultimo.getDato().equals(dato))
                eliminado = quitaUltimo();
            else{
                NodoDoble<T> actual = primero;
                while((actual != ultimo) && (!actual.getDato().equals(dato)))
                    actual = actual.getDer();
                if (actual != ultimo){
                    actual.getIzq().setDer(actual.getDer());
                    actual.getDer().setIzq(actual.getIzq());
                    actual.setDer(null);
                    actual.setIzq(null);
                    eliminado = actual.getDato();
                }
            }
        }
        
        return eliminado;
    
    }
    
    public int calculaTamano(){
        return calculaTamano(ultimo, 0);
    }
    
    private int calculaTamano(NodoDoble<T> actual, int cont){
        if (actual == null)
            return cont;
        else
            return calculaTamano(actual.getIzq(), cont + 1);
    }
    
    public String toString(){
        return toString(primero, new StringBuilder());
    }
    
    private String toString(NodoDoble<T> actual, StringBuilder sB){
        if (actual == null)
            return sB.toString();
        else{
            sB.append(actual.getDato()).append("\n");
            return toString(actual.getDer(), sB);
        }
    }
    
    public boolean contiene(T dato){
        return contiene(dato, this.primero);
    }
    
    private boolean contiene(T dato, NodoDoble<T> apuntador){
        if(apuntador == null)
            return false;
        else{
            if(apuntador.getDato().equals(dato))
                return true;
            else
                return contiene(dato, apuntador.getDer());
        }
    }
    
    public T consultaPrimero(){
        if(this.estaVacia())
            throw new RuntimeException("No hay datos");
        else
            return primero.getDato();
    }
    
    public T consultaUltimo(){
        if(this.estaVacia())
            throw new RuntimeException("No hay datos");
        else
            return ultimo.getDato();
    
    }
    
    
    
}
