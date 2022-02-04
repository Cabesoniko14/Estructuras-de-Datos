/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio51;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author javi
 */
public class Ejercicio51 {
    
    
    public static void lectura(String nomArch, ListaOrdenada<String> lista){
        
        try{
            Scanner file = new Scanner(new File(nomArch));
            while(file.hasNext()){
                lista.agrega(file.next());
            }
        }
        catch(Exception e){
            throw new RuntimeException("xdxdxdxd");
        }
    }
   
    public static void mezcla(ListaOrdenada<String> l1, ListaOrdenada<String> l2, ListaOrdenada<String> l3, EE<String> res){
        Iterator<String> it1 = l1.iterator();
        Iterator<String> it2 = l2.iterator();
        Iterator<String> it3 = l3.iterator();
        
        mezcla(it1, it2, it3, it1.next(), it2.next(), it3.next(), res);
        
    
    }
    
    private static void mezcla(Iterator<String> it1, Iterator<String> it2, Iterator<String> it3, String cad1, String cad2, String cad3, EE<String> res){
        
        if ((cad1.compareTo(cad3) < 0) && (cad1.compareTo(cad2) < 0)){
            res.agregaFinal(cad1);
            if (it1.hasNext())
                mezcla(it1, it2, it3, it1.next(), cad2, cad3, res);
            else{
                mezcla2(it2, it3, cad2, cad3, res);
            }
        
        }
        else if ((cad2.compareTo(cad3) < 0) && (cad2.compareTo(cad1) < 0)){
            res.agregaFinal(cad2);
            if(it2.hasNext())
                mezcla(it1, it2, it3, cad1, it2.next(), cad3, res);
            else
                mezcla2(it1, it3, cad1, cad3, res);
        }
        else{
            res.agregaFinal(cad3);
            if(it3.hasNext())
                mezcla(it1, it2, it3, cad1, cad2, it3.next(), res);
            else
                mezcla2(it1, it2, cad1, cad2, res);
        
        }
    
    }
    
    private static void mezcla2(Iterator<String> it1, Iterator<String> it2, String cad1, String cad2, EE<String> res){
        
        if (cad1.compareTo(cad2) < 0){
            res.agregaFinal(cad1);
            if (it1.hasNext())
                mezcla2(it1, it2, it1.next(), cad2, res);
            else{
                res.agregaFinal(cad2);
                while(it2.hasNext())
                    res.agregaFinal(it2.next());
            }
        
        }
        else{
            res.agregaFinal(cad2);
            if (it2.hasNext())
                mezcla2(it1, it2, cad1, it2.next(), res);
            else{
                res.agregaFinal(cad1);
                while(it1.hasNext())
                    res.agregaFinal(it1.next());
            }
        
        }
    
    }
    
    public static void main(String[] args) {
        
        ListaOrdenada<String> l1 = new ListaOrdenada();
        ListaOrdenada<String> l2 = new ListaOrdenada();
        ListaOrdenada<String> l3 = new ListaOrdenada();
        
        lectura("/Users/javi/Desktop/norteamerica.txt", l1);
        System.out.println(l1.toString());
        lectura("/Users/javi/Desktop/centroamerica.txt", l2);
        System.out.println(l2.toString());
        lectura("/Users/javi/Desktop/sudamerica.txt", l3);
        System.out.println(l3.toString());
        
        EE<String> res = new EE();
        mezcla(l1,l2,l3,res);
        
        System.out.println(res.toString());
    }
}
