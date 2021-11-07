/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio25;

import java.util.Iterator;

/**
 *
 * @author javi
 */
public class Escuela {
    
    private String nombre;
    private ConjuntoADT<Alumno> alumLic;
    private ConjuntoADT<Alumno> alumIng;

    public Escuela() {
    }

    public Escuela(String nombre) {
        this.nombre = nombre;
        alumLic = new ConjuntoA();
        alumIng = new ConjuntoA();
    }
    
    
    // 1. Agregar alumnos a cualquiera de los conjuntos
    
    public void agregaAlum(Alumno alum){
        if (alum.isLic() == true)
            alumLic.agrega(alum);
        else
            alumIng.agrega(alum);
        if (alum.getNomCarrera2() != null){
            if (alum.isLic2() == true)
                alumLic.agrega(alum);
            else
                alumIng.agrega(alum);
        }
    }
    
    // 2. Quitar alumnos
    
    public boolean quitaAlumno(String nombre){
        Alumno aux = new Alumno(nombre);
        boolean bandera1 = false;
        boolean bandera2 = false;
        Iterator<Alumno> licIt = alumLic.iterator();
        Iterator<Alumno> ingIt = alumIng.iterator();
        
        while(licIt.hasNext() && !bandera1){
            Alumno alumAuxLic = licIt.next();
            if (alumAuxLic.equals(aux)){
                alumLic.quita(alumAuxLic);
                bandera1 = true;
            }
        }
        while(ingIt.hasNext() && !bandera2){
            Alumno alumAuxIng = ingIt.next();
            if (alumAuxIng.equals(aux)){
                alumLic.quita(alumAuxIng);
                bandera2 = true;
            }
        }
            
            
        return (bandera1)||(bandera2);   
        
    }
    
    // 3. Conjunto de todos los alumnos
    
    public String todosAlumnos (){
        StringBuilder sB = new StringBuilder();
        ConjuntoADT<Alumno> todos = new ConjuntoA();
        todos = alumLic.union(alumIng);
        Iterator<Alumno> it = todos.iterator();
        while (it.hasNext())
            sB.append(it.next().toString());
        return sB.toString();
    }
    
    // 4. Conjunto de todos licenciatura e ingeniería
    
    public String licIng (){
        StringBuilder sB = new StringBuilder();
        ConjuntoADT<Alumno> licInge = new ConjuntoA();
        licInge = alumLic.interseccion(alumIng);
        Iterator<Alumno> it = licInge.iterator();
        while (it.hasNext())
            sB.append(it.next().toString());
        return sB.toString();
    }
    
    // 5. Ingenieria o Licenciatura, no ambas
    
    public String licOIng(){
        StringBuilder sB = new StringBuilder();
        ConjuntoADT<Alumno> licOInge = new ConjuntoA();
        licOInge = (alumLic.diferencia(alumIng)).union(alumIng.diferencia(alumLic));
        Iterator<Alumno> it = licOInge.iterator();
        while (it.hasNext())
            sB.append(it.next().toString());
        return sB.toString();
        
    
    
    }
    
    // 6. Promedio de todos los alumnos de Ingeniería
    
    public double promedioIngeniería(){
        Iterator<Alumno> it = alumIng.iterator();
        int i = 0;
        double promedio = 0;
        while (it.hasNext()){
            promedio = promedio + it.next().getProm();
            i++;
        }
        return promedio/i; 
    }
    
    public int alum22mas(){
        int i = 0;
        ConjuntoADT<Alumno> union = new ConjuntoA();
        union = alumIng.union(alumLic);
        Iterator<Alumno> it = union.iterator();
        while(it.hasNext()){
            Alumno al = it.next();
            if (al.getEdad() >= 22)
                i++;
        }
        return i;
    
    }
    
    
}
