/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio38;

/**
 *
 * @author javi
 */
public class Impresora {
    
    private String marca;
    private ColaADT<Archivo> pendientes;

    public Impresora() {
        pendientes = new ColaA();
    }
    
    public Impresora(String marca) {
        this();
        this.marca = marca;
    }
    
    
    // Inciso 1. Impresión de toda la cola.
    
    public String lectura(){
        ColaADT<Archivo> aux = new ColaA();
        StringBuilder sB = new StringBuilder();
        
        while(!(pendientes.estaVacia())){
            Archivo dato = pendientes.quita();
            sB.append("\n" + dato.toString() + "\n");
            aux.agrega(dato);
        }
        
        while(!aux.estaVacia())
            pendientes.agrega(aux.quita());
        
        return sB.toString();
    
    }
    
    // Inciso 2. Agregar archivo a cola
    
    public void agregarFoto(Double tamaño, String nombre, String dueño, String fecha, double resolucion){
        pendientes.agrega(new Foto(tamaño, nombre, dueño, fecha, resolucion));
    }
    
    public void agregarDoc(Double tamaño, String nombre, String dueño, String fecha, String tipoProc){
        pendientes.agrega(new Documento(tamaño, nombre, dueño, fecha, tipoProc));
    }
    
    // 3. Imprimir el primer archivo de la cola
    
    
    public String imprArch(){
        if(!(pendientes.estaVacia()))
            return pendientes.quita().toString();
        else
            throw new RuntimeException("Cola de impresión vacía");
    }
    
    // 4. Eliminar todas las fotos de la cola de impresión
    
    public String eliminaFotos(){
        
        StringBuilder sB = new StringBuilder();
        sB.append("");
        ColaADT<Archivo> aux = new ColaA();
        
        while(!pendientes.estaVacia()){
            Archivo elim = pendientes.quita();
            
            if ((elim instanceof Foto))
                sB.append(elim.toString() + "\n");
            else
                aux.agrega(elim);
        }
        
        while(!aux.estaVacia())
            pendientes.agrega(aux.quita());
            
        return sB.toString();
    }
    
    // 5. Elimina todos los documentos de tamaño mayor a 500 KB
    
    public String eliminaDocsMas500(){
        
        StringBuilder sB = new StringBuilder();
        sB.append("");
        ColaADT<Archivo> aux = new ColaA();
        
        while(!pendientes.estaVacia()){
            Archivo elim = pendientes.quita();
            
            if ((elim instanceof Documento)){
                if (elim.getTamaño() > 500)
                    sB.append(elim + "\n");
                else
                    aux.agrega(elim);
            }
            else
                aux.agrega(elim);
        }
        
        while(!aux.estaVacia())
            pendientes.agrega(aux.quita());
            
        return sB.toString();
    }
    
}
