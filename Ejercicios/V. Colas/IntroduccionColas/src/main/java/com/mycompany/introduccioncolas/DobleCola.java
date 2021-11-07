/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccioncolas;

/**
 *
 * @author javi
 */
public class DobleCola <T> extends ColaA<T>{
    
    public DobleCola(){
        super();
    }
    
    public DobleCola(int max){
        super(max);
    }
    
    public T quitaUltimo(){
        if (estaVacia())
            throw new RuntimeException("Cola vacía");
        else{
            for (int i = 0; i < this.cuentaElementos() -1; i++)
                this.agrega(this.quita());
            return this.quita();
        }
    }
    
    public void agregaPrincipio(T dato){
        this.agrega(dato);
        for(int i = 0; i < this.cuentaElementos() -1; i++)
            this.agrega(this.quita());
    }
    
    public T quitaUltimoP(){
        if (this.estaVacia())
            throw new RuntimeException("No hay datos en la cola");
        T eliminado = pendientes[fin];
        if (inicio == fin){
            inicio = -1;
            fin = -1;
        }
        else{
            if (fin == 0)
                fin = pendientes.length -1;
            else
                fin = fin -1;
        }
        
        return eliminado;
    
    }
    
    
    
    
}
