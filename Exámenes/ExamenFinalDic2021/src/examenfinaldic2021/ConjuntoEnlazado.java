/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaldic2021;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class ConjuntoEnlazado<T> implements ConjuntoADT<T> {
    
    private Nodo<T> elementos;
    private int cardinalidad;
    
    public ConjuntoEnlazado(){
        elementos = new Nodo();
        cardinalidad = 0;
    
    }

    @Override
    public boolean agrega(T nuevo) {
        boolean resp = false;
        if(cardinalidad == 0){
            elementos = new Nodo(nuevo);
            cardinalidad++;
            resp = true;
        
        }
            
        else if(!(contiene(nuevo))){
            resp = true;
            Nodo<T> porAgregar = new Nodo(nuevo);
            porAgregar.setDirec(elementos.getDirec());
            elementos.setDirec(porAgregar);
            cardinalidad++;
        }
        
        return resp;
        
    }
    
    // Para complementar métodos
    private Nodo<T> buscaElemento(T dato, Nodo<T> apuntador){
        if (apuntador == null){
            return null;
        }
        else{
            if(apuntador.getDato().equals(dato))
                return apuntador;
            else
                return buscaElemento(dato, apuntador.getDirec());
        
        }
        
    
    }
    
    @Override
    public boolean contiene(T dato) {
        if (dato == null || elementos == null)
            return false;
        else{
            Nodo<T> resp = buscaElemento(dato, elementos);
            if(resp == null)
                return false;
            else
                return true;
        }
    }
    
    

    @Override
    public int getCardinalidad() {
        return cardinalidad;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorNodos(elementos);
    }

    @Override
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        if (otro == null)
            throw new RuntimeException("Conjunto null");
        else{
            ConjuntoADT<T> resp = new ConjuntoEnlazado();
            union(resp, this.iterator());
            union(resp, otro.iterator());
            return resp;
        
        }
            
    }
    
    private ConjuntoADT<T> union(ConjuntoADT<T> resp, Iterator<T> aUnir){
        if(aUnir.hasNext()){
            resp.agrega(aUnir.next());
            return union(resp, aUnir);
        }
        else
            return resp;
    
    }

    
    // Regresar true si THIS es subconjunto de OTRO. Es decir, que el conjunto padre sea el parámetro
    
    
    @Override
    public boolean esSubconjuntoDe(ConjuntoADT<T> otro) {
        if(otro == null)
            return false;
        else
            return esSubconjuntoDe(elementos, otro.iterator());
    }
    
    private boolean esSubconjuntoDe(Nodo<T> apunt, Iterator<T> apuntOtro){
        if(apunt == null || !apuntOtro.hasNext()) // El conjunto vacío es subconjunto de cualquier conjunto
            return apunt == null; // Prevenir caso en que param es un conjunto más pequeño que this
        else{
            T dato = apuntOtro.next(); // Ya comprobamos que hay next y que apunt no es null
            while(!apunt.getDato().equals(dato) && apunt != null)
                apunt.getDirec();
            if (apunt != null)
                return esSubconjuntoDe(elementos, apuntOtro);
            else
                return false;
        }
    
    }
    
}
