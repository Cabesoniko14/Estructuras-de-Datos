/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio37;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class ColaA <T> implements ColaADT<T> {
    
    private T[] pendientes;
    private int inicio;
    private int fin;
    private final int MAX = 20;
    
    public ColaA(){
        pendientes = (T[]) new Object[MAX];
        inicio = -1;
        fin = -1;
    }
    
    public ColaA(int max){
        pendientes = (T[]) new Object[max];
        inicio = -1;
        fin = -1;
    
    }
    
    public boolean estaVacia(){
        return inicio == -1;
    }
    
    public T consultaPrimero(){
        if (estaVacia())
            throw new RuntimeException("No hay datos en la cola");
        return pendientes[inicio];
    }
    
    private boolean estaLlena(){
        return ((inicio == 0) && (fin == pendientes.length-1)) || (fin + 1 == inicio);
    }
    
    private void expande(){
        T[] masGrande = (T[]) new Object[pendientes.length*2]; 
        int n = pendientes.length;
        
        for (int i = 0; i < n; i++)
            masGrande[i] = pendientes[(inicio+i)%n];
        inicio = 0;
        fin = n -1;
        pendientes = masGrande;
    }
    
    public void agrega(T nuevo){
        if (this.estaLlena())
            expande();
        fin = (fin + 1)%pendientes.length;
        pendientes[fin] = nuevo;
        if (inicio == -1)
            inicio = 0;
    }
    
    @Override
    public T quita(){
        if (this.estaVacia())
            throw new RuntimeException("No hay datos en la cola");
        T eliminado = pendientes[inicio];
        if (inicio == fin){
            inicio = -1;
            fin = -1;
        }
        else
            inicio = (inicio +1)%pendientes.length;
        return eliminado;
    }
    
    public String toString(){
        StringBuilder sB = new StringBuilder();
        int n = pendientes.length;
        if (!estaVacia()){
            int distancia, indice;
            distancia = fin - inicio;
            if (distancia < 0)
                distancia = distancia + n;
            for (int i = 0; i <= distancia; i++){
                indice = (inicio+i)%n;
                sB.append(pendientes[indice].toString());
            }
                        
        }
        return sB.toString();   
    }
    
    public int cuentaElementos(){
        int res = 0;
        if (this.estaVacia())
            throw new RuntimeException("No hay elementos en la cola");
        else{
            res = fin - inicio;
            if (fin < inicio)
                res += this.pendientes.length;
            res++;
        }
        return res;
    }
    
    public T consultaUltimo(){
        if (estaVacia())
            throw new RuntimeException("No hay datos en la cola");
        return pendientes[fin];
    }
    
    public ArrayList<T> multiQuita(int n){
        int cont = this.cuentaElementos();
        if (cont >= n && n>0){
            ArrayList<T> arr = new ArrayList<T>();
            for (int i = 0; i < n; i++)
                arr.add(this.quita());
            return arr;
        }
        else
            throw new RuntimeException();
    }
    
    
    
}
