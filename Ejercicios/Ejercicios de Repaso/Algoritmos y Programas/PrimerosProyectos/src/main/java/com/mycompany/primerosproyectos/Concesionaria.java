/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerosproyectos;
import java.util.Scanner;

/**
 *
 * @author javi
 */
public class Concesionaria {
    
    public static int leeTotalVentas(){
        Scanner lee = new Scanner(System.in);
        int numero = 0;
        boolean bandera = false;
        
        
        while (!bandera || numero <= 0)
            try {
                System.out.println("Ingresa el número total de ventas (0>): ");
                numero = lee.nextInt();
                bandera = true;
            } catch(Exception e) {
                System.out.println("\nDebes ingresar un número entero positivo!");
                lee.next();
            
            }
        
        return numero;       
     
    }
    
    public static int comisionesVentas(int n){
        Scanner lee = new Scanner(System.in);
        int precio, total;
        int i;
        total = 0; 
        
       for (i=1; i<=n; i++){
       System.out.println("Ingresa el precio de venta del automóvil " + i + ": ");
       precio = lee.nextInt();
       total = total + precio;
       
       
       
       
       } 
       return total;
       
    }
    
    // contador de las ventas que se han registrado para hacer un while con if y else
    // imprimir por linea de precio la cantidad que se paga de comisión 
    // Imprimir suma de comisiones
    
    public static void main(String[] args) {
    int n;
    int total;
    
    n = leeTotalVentas();
    total = comisionesVentas(n);
    System.out.println("\nEl total de ventas es: " + total);
    }
}
