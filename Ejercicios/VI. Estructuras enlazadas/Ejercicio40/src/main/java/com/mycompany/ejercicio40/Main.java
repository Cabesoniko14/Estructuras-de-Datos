/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio40;

/**
 *
 * @author javi
 */
public class Main {
    public static void main(String[] args) {
        EE e1 = new EE();
        e1.agregaFinal(11);
        e1.agregaFinal(12);
        e1.agregaFinal(13);
        e1.agregaFinal(14);
        e1.agregaFinal(15);
        
        // Prueba 1: Info está en medio de la estructura enlazada
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaSiguienteDe(12));
        //System.out.println(e1.toString());
        
        // Prueba 2: Info no está en la estructura enlazada
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaSiguienteDe(16));
        //System.out.println(e1.toString());
        
        // Prueba 3: Info es el último elemento de la estructura enlazada
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaSiguienteDe(15));
        //System.out.println(e1.toString());
        
        // Prueba 4: Info es el único elemento de la estructura enlazada
        
        //EE e2 = new EE();
        //e2.agregaFinal(11);
        //System.out.println(e2.toString());
        //System.out.println(e2.eliminaSiguienteDe(11));
        //System.out.println(e2.toString());
        
        // Prueba 5: Estructura enlazada vacía
        
        //EE e3 = new EE();
        //System.out.println(e3.toString());
        //System.out.println(e3.eliminaSiguienteDe(e3));
        
        // Prueba 6: Info es el penútlimo elemento de la estructura enlazada (el último es el a eliminar)
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaSiguienteDe(14));
        //System.out.println(e1.toString());
        
        
        // EJERCICIO 41
        
        // Prueba 1: Está en medio
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaAnteriorA(13));
        //System.out.println(e1.toString());
        
        // Prueba 2: Info está al final
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaAnteriorA(15));
        //System.out.println(e1.toString());
        
        // Prueba 3: Info está en primera posición
        
        //System.out.println(e1.toString());
        //System.out.println(e1.eliminaAnteriorA(11));
        //System.out.println(e1.toString());
        
        
        
        // Ejercicio42
        
        
        // Prueba 1: refer en primera posición
        
        //System.out.println(e1.toString());
        //System.out.println(e1.insertaAntesQue(11, 19));
        //System.out.println(e1.toString());
        
        // Prueba 2: está en medio
        
        //System.out.println(e1.toString());
        //System.out.println(e1.insertaAntesQue(12, 20));
        //System.out.println(e1.toString());
        
        // Prueba 3: refer no está
        
        //System.out.println(e1.toString());
        //System.out.println(e1.insertaAntesQue(345, e1));
        
        // Prueba 4: está vacía
        
        //EE e4 = new EE();
        //System.out.println(e4.insertaAntesQue(11, 12));
        
        
    }
    
}
