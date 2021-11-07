/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class Escuela {
    
    private String nombre;
    private Alumno[] alumnos;
    private int totAlum;
    private final int MAX_ALUM = 100;
    
    public Escuela(){
        alumnos = new Alumno[MAX_ALUM];
        totAlum = 0;
    }
    
    public Escuela(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public int buscaAlumno(Alumno alum){
        int izq, der, cen;
        izq = 0;
        der = totAlum - 1;
        cen = der/2;
        while (izq <= der && !alumnos[cen].equals(alum)){
            if (alumnos[cen].compareTo(alum) > 0)
                der = cen -1;
            else
                izq = cen + 1;
            cen = (izq + der) /2;
        }
        if (izq > der ) //No lo encontró
            cen = -1 * (izq + 1);
        return cen;
    
    }
    
    public boolean altaAlumno(String nombre){
        boolean resp = false;
        
        if (totAlum < alumnos.length){
            Alumno nuevo = new Alumno (nombre);
            int pos;
            
            pos = buscaAlumno(nuevo);
            if (pos < 0){ //No se repite
                resp = true;
                pos = -1*pos -1;
                for (int i = totAlum; i > pos; i--)
                    alumnos[i] = alumnos[i-1];
                alumnos[pos] = nuevo;
                totAlum++; //Para no afectar la búsqueda del for
            }
        }
        return resp;  
    }
    
    public boolean altaCalifAlumno(int claveUnica, double calif){
        boolean resp = false;
        Alumno aBuscar = new Alumno(claveUnica);
        int pos;
        
        pos = buscaAlumno(aBuscar);
        if (pos >= 0) //Encontró al alumno
            resp = alumnos[pos].altaCalif(calif);
        return resp;
    }
    
    // Inciso 1
    
    public String consultaAlumno (int claveUnica){
        String resultado;
        Alumno aBuscar = new Alumno(claveUnica);
        int pos;
        
        pos = buscaAlumno(aBuscar);
        if (pos >= 0) //Encontró al alumno
            resultado = "\nDatos del alumno: " + alumnos[pos];
        else
            resultado = null;
        return resultado;
    }
    
    // Inciso 4
    
    public ArrayList<String> consultaNombreMasAprobadas(){
        ArrayList<String> nombres = null;
        
        if (totAlum > 0){
            nombres = new ArrayList();
            int maximo = -10;
            for (int i = 0; i < totAlum; i++)
                if (alumnos[i].getTotalCalif() == maximo)
                    nombres.add(alumnos[i].getNombre());
                else
                    if (alumnos[i].getTotalCalif() > maximo){
                        nombres.clear();
                        maximo = alumnos[i].getTotalCalif();
                        nombres.add((alumnos[i].getNombre()));
                    }
        }
        return nombres;
        
    }
    
}
