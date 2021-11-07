/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio29;

/**
 *
 * @author javi
 */
public class ArregloGenerico <T extends Comparable<T>> {
    
    private T[] datos;
    private final int MAX = 10;
    private int totDatos;

    public ArregloGenerico() {
        datos = (T[])new Object[MAX];
        totDatos = 0;    
    }
    
    // Inciso 1)

    public int busqSecuencial(T dato){
        
        return busqSecuencial(dato, 0); 
        
    }
    
    private int busqSecuencial(T dato, int i){
        
        if (totDatos == i)
            return -1;
        else{
            if(dato.equals(datos[i]))
                return i;
            else
                return busqSecuencial(dato, i+1);
        }
    }
    
    // Inciso 2
    
    public int busqBinaria(T aBuscar){
        return busqBinaria(aBuscar, 0, totDatos -1);
    
    }
    
    private int busqBinaria(T aBuscar, int izq, int der){
        if (der < izq)
            return (izq+1)*-1;
        else{
            int cen = (izq+der)/2;
            if(aBuscar.equals(datos[cen]))
                return cen;
            else{
                if (aBuscar.compareTo(datos[cen])>0)
                    izq = cen +1;
                else
                    der = cen -1;
                return busqBinaria(aBuscar, izq, der);
            
            }
        
        }
    
    }
    
    // Agregar un método de alta
    
    public boolean altaElemento(T nuevo){ // Es boolean porque puede que no se agregue (si está ya agregado)
        boolean resp = false;
        if (totDatos < datos.length){
            int pos;
            pos = busqBinaria(nuevo);
            if(pos<0){
                resp = true;
                pos= -1*pos-1;
                recorreDerecha(totDatos);
                datos[pos] = nuevo;
                totDatos++;
            }
            
        }
        return resp;
    }
    
    
    // Necesito un método recorre derecha para insertar el nuevo dato y hacerle espacio (Sol 1)
    
    public void recorreDerecha(int pos){
        recorreDerecha(pos, totDatos);
 
    }
    
    private void recorreDerecha(int pos, int i){
        if (i>pos){
            datos[i] = datos[i-1];
            recorreDerecha(pos, i - 1);
        }
    
    }
    
    // Inciso 3
    
    public String toString(){
        
        return toString(0, "");
    
    }
    
    private String toString(int i, String cad){
        
        if (totDatos == i)
            return cad;
        else{
            cad += datos[i].toString();
            return toString(i+1, cad);   
        }
        
    }
    
    // Inciso 4
    
    public int posMayor(){
        if (totDatos == 0)
            throw new RuntimeException(":(");
        return posMayor(0,1);
    
    }
    
    private int posMayor(int posMax, int i){
        if (i == totDatos)
            return posMax;
        
        else{
            if(datos[posMax].compareTo(datos[i]) < 0)
                posMax = i;
            return posMayor(posMax, i + 1);       
        }
    }
    
    // Inciso 5
    
    
    // Hacer un método recorrer a la izquierda para no alterar el orden del arreglo al llamar a elimina objeto
    

    private void recorreIzquierda(int pos){
        if (totDatos - 1 > pos){ // Como es recorrer a la izq, debemos eliminar el último elemento
            datos [pos] = datos[pos+1];
            recorreIzquierda(pos+1);
        }
        else
            datos[totDatos-1] = null;
    }
    
    public int eliminaObjeto (T aEliminar){
        return eliminaObjeto(aEliminar, 0, 0);
    
    }
    
    private int eliminaObjeto(T aEliminar, int i, int cont){
        
        
        if (i==totDatos)
            return cont;
            
        else{
            if (datos[i].equals(aEliminar)){
                recorreIzquierda(i);
                cont++;
                totDatos--;
                return eliminaObjeto(aEliminar, i, cont); // No incrementar la i para analizar el objeto que fue movido a esta posición
            }
            else
                return eliminaObjeto(aEliminar, i+1, cont);
        
        }

    }
    
    // Inciso 6
    
    // Incorporar un método buscaMenor (hace la seleccion ordenada moviendo el elemento menor al inicio)
    
    public int posMenor(){
        if (totDatos == 0)
            throw new RuntimeException("vacío");
        return posMayor(0,1);
    
    }
    
    private int posMenor(int posMen, int i){
        if (i == totDatos)
            return posMen;
        
        else{
            if(datos[posMen].compareTo(datos[i]) > 0)
                posMen = i;
            return posMayor(posMen, i + 1);       
        }
    }
    
    public void ordenacionSelDir(){
        if (totDatos == 0)
            throw new RuntimeException("no hay nada D:");
        ordenacionSelDir(0, 1);
    
    }
    
    private void ordenacionSelDir(int posMen, int i){
        
        if (totDatos>posMen){
            int menor = posMenor(posMen, i);
            T aux = datos[posMen];
            datos[posMen] = datos[menor];
            datos[menor] = aux;
            ordenacionSelDir(posMen+1, i+1); // Aumentar en 1 el intervalo para sacar el siguiente más chico
        }
    
    }
    
    
}
