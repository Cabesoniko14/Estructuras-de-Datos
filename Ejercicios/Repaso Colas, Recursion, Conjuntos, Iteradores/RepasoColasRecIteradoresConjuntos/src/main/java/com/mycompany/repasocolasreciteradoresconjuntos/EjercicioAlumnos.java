/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repasocolasreciteradoresconjuntos;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class EjercicioAlumnos {
    
    private ColaADT<Alumno> colaAlumT;
    private ColaADT<Alumno> colaAlumF;

    public EjercicioAlumnos() {
        colaAlumT = new ColaA();
        colaAlumF = new ColaA();
    }
    
    public boolean buscaAlumno(String nombre, boolean lic){
        boolean bandera = false;
        ColaADT<Alumno> aux = new ColaA();
        
        while(!colaAlumT.estaVacia() && lic){
            Alumno busq = colaAlumT.consultaPrimero();
            if (busq.getNombre().equalsIgnoreCase(nombre)){
                bandera = true;
                aux.agrega(colaAlumT.quita());
            }
            else{
                if (bandera == true){
                    while(!colaAlumT.estaVacia())
                        aux.agrega(colaAlumT.quita());
                }
                else
                    aux.agrega(colaAlumT.quita());  
            }
        }
        while(!colaAlumF.estaVacia() && !lic){
            Alumno busq = colaAlumF.consultaPrimero();
            if (busq.getNombre().equalsIgnoreCase(nombre)){
                bandera = true;
                aux.agrega(colaAlumF.quita());
            }
            else{
                if (bandera == true){
                    while(!colaAlumF.estaVacia())
                        aux.agrega(colaAlumF.quita());
                }
                else
                    aux.agrega(colaAlumF.quita());  
            }
        }
        if (lic == true){
            while(!aux.estaVacia())
                colaAlumT.agrega(aux.quita());
        }else{
            while(!aux.estaVacia())
                colaAlumF.agrega(aux.quita());
        }
    return bandera;
    }
    
    public boolean altaAlumno(String nombre, String grado, int edad, double prom, String nomCarrera1, boolean lic){
        boolean busq = buscaAlumno(nombre, lic);
        boolean bandera = false;
        if (busq == false){
            bandera = true;
            if (lic == true)
                colaAlumT.agrega(new Alumno(nombre, grado, edad, prom, nomCarrera1, lic));
            else
                colaAlumF.agrega(new Alumno(nombre, grado, edad, prom, nomCarrera1, lic));
                
        }
        return bandera;
    }
    
    public boolean quitaAlumno(String nombre, boolean lic){
        ColaADT<Alumno> aux = new ColaA();
        boolean bandera = false;
        while(!colaAlumT.estaVacia() && lic){
            Alumno cons = colaAlumT.consultaPrimero();
            if (cons.getNombre().equalsIgnoreCase(nombre)){
                colaAlumT.quita();
                bandera = true;
            }
            else{
                if (bandera == true){
                    while(!colaAlumT.estaVacia())
                        aux.agrega(colaAlumT.quita());
                }
                else
                    aux.agrega(colaAlumT.quita());
            }
        }
        while(!colaAlumF.estaVacia() && !lic){
            Alumno cons = colaAlumF.consultaPrimero();
            if (cons.getNombre().equalsIgnoreCase(nombre)){
                colaAlumF.quita();
                bandera = true;
            }
            else{
                if (bandera == true){
                    while(!colaAlumF.estaVacia())
                        aux.agrega(colaAlumF.quita());
                }
                else
                    aux.agrega(colaAlumF.quita());
            }
        }
        if (lic == true){
            while(!aux.estaVacia())
                colaAlumT.agrega(aux.quita());
        }
        else{
            while(!aux.estaVacia())
                colaAlumF.agrega(aux.quita());
        
        }
            
        
        return bandera;
    
    }
    
    public String repColaF(){
        StringBuilder sB = new StringBuilder();
        ColaADT<Alumno> aux = new ColaA();
        while(!colaAlumF.estaVacia()){
            sB.append("\n" + colaAlumF.consultaPrimero().toString());
            aux.agrega(colaAlumF.quita());
        }
        while(!aux.estaVacia())
            colaAlumF.agrega(aux.quita());
        return sB.toString();
    
    }
    
    public String repColaT(){
        StringBuilder sB = new StringBuilder();
        ColaADT<Alumno> aux = new ColaA();
        while(!colaAlumT.estaVacia()){
            sB.append("\n" + colaAlumT.consultaPrimero().toString());
            aux.agrega(colaAlumT.quita());
        }
        while(!aux.estaVacia())
            colaAlumT.agrega(aux.quita());
        return sB.toString();
    
    }
    
    public void beca(){
        ColaADT<Alumno> aux = new ColaA();
        while(!colaAlumF.estaVacia()){
            Alumno dato = colaAlumF.consultaPrimero();
            if (dato.getProm() >= 8)
                colaAlumT.agrega(colaAlumF.quita());
            else
                aux.agrega(colaAlumF.quita());
        }
        while(!aux.estaVacia())
            colaAlumF.agrega(aux.quita());
    }
    
    public void quitarOcurrencias(){
        ColaADT<Alumno> auxf = new ColaA();
        ColaADT<Alumno> auxt = new ColaA();
        ConjuntoADT<String> conjf = new ConjuntoA();
        ConjuntoADT<String> conjt = new ConjuntoA();
        ConjuntoADT<String> interseccion = new ConjuntoA();
        while(!colaAlumF.estaVacia()){
            conjf.agrega(colaAlumF.consultaPrimero().getNombre());
            auxf.agrega(colaAlumF.quita());
        }
        while(!colaAlumT.estaVacia()){
            conjt.agrega(colaAlumT.consultaPrimero().getNombre());
            auxt.agrega(colaAlumT.quita());
        }
        while(!auxf.estaVacia())
            colaAlumF.agrega(auxf.quita());
        while(!auxt.estaVacia())
            colaAlumT.agrega(auxt.quita());
        interseccion = conjf.interseccion(conjt);
        if(!interseccion.vacio()){
            Iterator<String> it = interseccion.iterator();
            while(it.hasNext()){
                String dato = it.next();
                quitaAlumno(dato, false);
            }
        }
    }
            
    
    
    
}
