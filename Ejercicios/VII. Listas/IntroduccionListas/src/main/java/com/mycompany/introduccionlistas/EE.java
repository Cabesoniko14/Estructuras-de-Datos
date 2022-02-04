/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionlistas;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class EE <T> implements Iterable<T> {
    
    private Nodo<T> primero;
    
    public EE() {
        primero = null; // Indica que está vacía
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public void agregaInicio(T nuevoDato){
        Nodo<T> nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.setDireccion(primero);
        primero = nuevoNodo;
        
    }
    
    public T quitaPrimero(){
        if (estaVacia())
            throw new RuntimeException("No hay elementos");
        T eliminado = primero.getDato();
        Nodo<T> auxiliar = primero;
        primero = primero.getDireccion();
        auxiliar.setDireccion(null); // Romper la dirección del primero anterior
        return eliminado;
    
    }
    
//    public String toString(){ 
//        StringBuilder sB = new StringBuilder();
//       Nodo<T> apuntador = primero;
//        
//        while(apuntador != null){
//            sB.append(apuntador.getDato()).append("\n");
//            apuntador = apuntador.getDireccion();
//        }
//        return sB.toString();
//    }
    
    public String toString(){
        return toString(primero, new StringBuilder());
    }
    
    private String toString(Nodo<T> apuntador, StringBuilder sB){
        if (apuntador == null)
            return sB.toString();
        else{
            sB.append(apuntador.getDato()).append("\n");
            return toString(apuntador.getDireccion(), sB);
        }
    }
    
    public void agregaFinal(T nuevoDato){
        Nodo<T> nuevoNodo = new Nodo(nuevoDato);
        if(estaVacia())
            primero = nuevoNodo;
        else{
            Nodo<T> apuntador = primero;
            while(apuntador.getDireccion() != null) // Se detiene sobre el último nodo
                apuntador = apuntador.getDireccion();
            apuntador.setDireccion(nuevoNodo);        
        }    
    }
    
    public T quitaUltimo(){
        if(estaVacia())
            throw new RuntimeException("No hay datos");
        T eliminado;
        if(primero.getDireccion() == null){
            eliminado = this.quitaPrimero();
            primero = null;
        }
        else{
            Nodo<T> anterior = primero;
            Nodo<T> actual = primero.getDireccion();
            while(actual.getDireccion() != null){
                anterior = anterior.getDireccion();
                actual = actual.getDireccion();
            }
            eliminado = actual.getDato();
            anterior.setDireccion(null);
        }
        return eliminado;
    
    }
    
    public boolean buscaDato(T dato){
        return buscaDato(primero, dato);
    }
    
    private boolean buscaDato(Nodo<T> actual, T dato){
        if(actual == null)
            return false;
        if(actual.getDato().equals(dato))
            return true;
        else
            return buscaDato(actual.getDireccion(), dato);
    }
    
    
    // Quita el nodo que contiene al dato
    
    public T quitaDato(T dato){
        
        T eliminado = null;
        Nodo<T> anterior, actual;
        anterior = null;
        actual = primero;
        while((actual != null) && (!actual.getDato().equals(dato))){
            anterior = actual;
            actual = actual.getDireccion();
        }
        if(actual != null){ // Dato fue encontrado
            eliminado = actual.getDato();
            if (actual == primero) // El dato está en el primero nodo
                primero = primero.getDireccion();
            else
                anterior.setDireccion(actual.getDireccion());
            actual.setDireccion(null);
        }
        
        return eliminado;
        
    }
    
    public boolean eliminaSiguienteDe(T info){
        boolean band = false;
        
        if(estaVacia())
            throw new RuntimeException("No hay datos");
        
        Nodo<T> anterior, actual;
        anterior = primero;
        actual = primero.getDireccion();
        
        while( (actual != null) && (!(anterior.getDato().equals(info))) ){
            anterior = actual;
            actual = actual.getDireccion();
        
        }
        
        // Si es null y lo encontró (solo hay un elemento y es info, o info es el último elemento, no podemos eliminar nada)
        // Si es null porque llegó al final y no lo encontró, false igualmente
         
        if (actual != null){
            anterior.setDireccion(actual.getDireccion());
            actual.setDireccion(null);
            band = true;
        }
        
        return band;
            
    }
    
    public boolean eliminaAnteriorA(T info){
        if (estaVacia())
            throw new RuntimeException("No hay datos");
        
        boolean band = false;
        Nodo<T> anterior, actual;
        anterior = null;
        actual = primero;
        
        // Hacer el if/else masivo
        
        if(!(primero.getDato().equals(info))){
        
            while((actual.getDireccion() != null) && (!(actual.getDireccion().getDato().equals(info)))){
                anterior = actual;
                actual = actual.getDireccion();
            }
            if (actual.getDireccion().getDato().equals(info)){
                if (anterior == null){
                    primero = actual.getDireccion();
                    actual.setDireccion(null);
                }
                else{
                    anterior.setDireccion(actual.getDireccion());
                    actual.setDireccion(null);
                }
                band = true;
            }
        }
        
        return band;
    
    }
    
    public boolean insertaAntesQue(T refer, T nuevo){
        
        if (estaVacia())
            throw new RuntimeException("No hay datos");
        
        boolean band = false;
        Nodo<T> anterior, actual;
        Nodo<T> nuevoN = new Nodo(nuevo);
        anterior = null;
        actual = primero;
        
        if(primero.getDato().equals(refer)){
            primero = nuevoN;
            primero.setDireccion(actual);
            band = true;
        
        }
        else{
            
            while((actual != null) && (!(actual.getDato().equals(refer)))){
                anterior = actual;
                actual = actual.getDireccion();
            }
            if(actual != null){
                anterior.setDireccion(nuevoN);
                nuevoN.setDireccion(actual);
                band = true;
            }
        }
        return band;   
    }
    
    
    public int eliminaTodosRepetidosOrdenado(){
        
        if(estaVacia())
            return 0;
        
        else
            return eliminaTodosRepetidosOrdenado(primero, primero.getDireccion(), primero.getDato(), 0);  
        
    }
    
    private int eliminaTodosRepetidosOrdenado(Nodo<T> anterior, Nodo<T> actual, T ocurr, int cont){
        
        if(actual == null)
            return cont;
        
        else{
            if(actual.getDato().equals(ocurr)){
                anterior.setDireccion(actual.getDireccion());
                actual.setDireccion(null);
                return eliminaTodosRepetidosOrdenado(anterior, anterior.getDireccion(), ocurr, cont+1);
            }
                
            
            else
                return eliminaTodosRepetidosOrdenado(actual, actual.getDireccion(), actual.getDato(),cont);
        }
    
    }
    
    public int eliminaTodosRepetidosDesordenado(){
        if (estaVacia())
            return 0;
        
        else
            return eliminaTodosRepetidosDesordenado(primero, primero, primero.getDireccion(), primero.getDato(), 0);
    
    }
    
    private int eliminaTodosRepetidosDesordenado(Nodo<T> apuntador, Nodo<T> anterior, Nodo<T> actual, T ocurr, int cont){
        if(apuntador.getDireccion() == null)
            return cont;
        
        else{
            if(actual != null){
                if(actual.getDato().equals(ocurr)){
                    anterior.setDireccion(actual.getDireccion());
                    actual.setDireccion(null);
                    return eliminaTodosRepetidosDesordenado(apuntador, anterior, anterior.getDireccion(), ocurr, cont+1);
                
                }
                else
                    return eliminaTodosRepetidosDesordenado(apuntador, actual, actual.getDireccion(), ocurr, cont);  
            
            }
            else
                return eliminaTodosRepetidosDesordenado(apuntador.getDireccion(), apuntador.getDireccion(), apuntador.getDireccion().getDireccion(), apuntador.getDireccion().getDato(), cont);
        
        }
    
    }
    
    public T consultaDato(int n){
        
        if(estaVacia())
            throw new RuntimeException("Estructura vacía");
        else
            return consultaDato(0, n, primero, primero.getDato());
            
    
    }
    
    private T consultaDato(int i, int n, Nodo<T> apuntador, T dato){
        if(apuntador.getDireccion()== null && (i < n-1))
            return null;
        if (i == n-1)
            return dato;
        else{
            return consultaDato(i+1, n, apuntador.getDireccion(), apuntador.getDireccion().getDato());
        }        
    }
    
    public void mezclaEE(EE objEE){
        if(objEE == null)
            throw new RuntimeException("Estructura enlazada no compatible");
        if(!objEE.estaVacia()){
            if(estaVacia())
                primero = objEE.primero;
            else{
                mezclaEE(primero, primero.getDireccion(), objEE.primero, objEE.primero.getDireccion());
                objEE.primero = primero;
            }
                
        }
        else
            objEE.primero = primero;
    }
    private void mezclaEE(Nodo<T> anteriorOriginal, Nodo<T> actualOriginal, Nodo<T> anteriorParam, Nodo<T> actualParam){
        if(actualOriginal != null){
            if(actualParam != null){
                anteriorOriginal.setDireccion(anteriorParam);
                anteriorParam.setDireccion(actualOriginal);
                mezclaEE(actualOriginal, actualOriginal.getDireccion(), actualParam, actualParam.getDireccion());
            }
            else{
                anteriorOriginal.setDireccion(anteriorParam);
                anteriorParam.setDireccion(actualOriginal);
            }
        }
        else
            anteriorOriginal.setDireccion(anteriorParam);
    
    }
    
    
    public Iterator<T> iterator(){
        return new IteradorEE(primero);    
    }
    
    public boolean equals (EE objEE){
        return equals(primero, objEE.primero);
    }
    
    private boolean equals(Nodo<T> apuntOrig, Nodo<T> apuntParam){
        if(apuntOrig == null || apuntParam == null)
            return apuntOrig == null && apuntParam == null;
        else{
            if(apuntOrig.getDato().equals(apuntParam.getDato()))
                return equals(apuntOrig.getDireccion(), apuntParam.getDireccion());
            else
                return false;
        }
    }
    
    
    
    
            
           
    
}
