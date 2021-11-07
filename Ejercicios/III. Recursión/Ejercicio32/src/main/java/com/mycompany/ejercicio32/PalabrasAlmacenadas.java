/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio32;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author javi
 */
public class PalabrasAlmacenadas {
    
    public static int cuentaPalabrasArchivo(String nomArchivo){ //Me dan como cadena el nombre de un archivo
        int contador;
        
        try{
            Scanner file = new Scanner(new File(nomArchivo));
            contador = 0;
            contador = cuentaPalabrasArchivo(file, contador);
        }catch (Exception e){
            contador = -1; // Para diferenciar cuando abre un archivo vacío de cuando abre un archivo dañado o no se abre
        }
        return contador;
    
    }
    
    private static int cuentaPalabrasArchivo(Scanner f, int contador){
        if (f.hasNext()){ // Hay elementos para leer y contar
            f.next();
            contador++;
            return cuentaPalabrasArchivo(f, contador);
        }
        else
            return contador;
    
    }
    
    public static void main(String[] args) {
        System.out.println("\nArchivo datos: " +  cuentaPalabrasArchivo("datosnuevo"));
    }
    
}
