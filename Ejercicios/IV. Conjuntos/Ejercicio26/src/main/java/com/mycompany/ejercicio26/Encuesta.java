/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio26;

/**
 *
 * @author javi
 */
public class Encuesta  <T>{

    private ConjuntoADT<String> dosIdiomas;
    private ConjuntoADT<String> tresMas;
    
    
    public Encuesta(){
        this.tresMas = new ConjuntoA();
        this.dosIdiomas = new ConjuntoA();
    }
    

    public static String inglesFrances(ConjuntoADT<String> ingles, ConjuntoADT<String> frances){
        if ((ingles == null) || (frances == null))
            throw new RuntimeException("Datos incorrectos");
        return ingles.interseccion(ingles).toString();
    
    }
    
    public static int ingles(ConjuntoADT<String> ingles, ConjuntoADT<String> frances, ConjuntoADT<String> otro){
        if ((ingles == null) || (frances == null) || (otro == null))
            throw new RuntimeException("Datos incorrectos");
        return ingles.diferencia(frances.union(otro)).getCardinalidad();
    }
 
    
    // Solución sin static. Crear dos atributos como conjuntos de dos o mas idiomas que no sean ingles o frances
    
    public void agregaOtros(ConjuntoADT<String> otro, String nombre){
        
        boolean primerAg = otro.agrega(nombre);
        if (!primerAg){
            boolean segundoAg = dosIdiomas.agrega(nombre);
            if (!segundoAg)
                tresMas.agrega(nombre);
        }
    }
    
    public String tresIdiomas(ConjuntoADT<String> ingles, ConjuntoADT<String> frances, ConjuntoADT<String> otro){
        
        return ((ingles.interseccion(frances).interseccion(otro)).union(ingles.interseccion(dosIdiomas)).union(frances.interseccion(dosIdiomas)).union(tresMas)).toString();
    
    }
    
    
    public static void xd(ConjuntoADT<String> xd, String xdd){
        xd.agrega(xdd);
        
    
    }
    
    // Sin static
    
    
     public static void agregaOtrosS(ConjuntoADT<String> otro, ConjuntoADT<String> dosId, ConjuntoADT<String> tresMasId, String nombre){
        
        boolean primerAg = otro.agrega(nombre);
        if (!primerAg){
            boolean segundoAg = dosId.agrega(nombre);
            if (!segundoAg)
                tresMasId.agrega(nombre);
        }
    }
     
     public static String tresIdiomasS(ConjuntoADT<String> otro, ConjuntoADT<String> dosId, ConjuntoADT<String> tresMasId, ConjuntoADT<String> ingles, ConjuntoADT<String> frances){
         return ((ingles.interseccion(frances).interseccion(otro)).union(ingles.interseccion(dosId)).union(frances.interseccion(dosId)).union(tresMasId)).toString();
     
     }
    
    
 
    
}

