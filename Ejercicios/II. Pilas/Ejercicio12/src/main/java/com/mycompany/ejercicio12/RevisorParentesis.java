/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio12;

/**
 *
 * @author javi
 */


public class RevisorParentesis {
    private String cadena;
    
    public RevisorParentesis(){
    }
    
    public RevisorParentesis(String cadena){ 
        this.cadena=cadena;
    }
    
    
    public boolean revisaParentesis() {
        boolean resp=true;
        PilaA <Character> pila1 = new PilaA();
        
        int cont=0;
        
        if(cadena!=null){
           int i=0;
           while(i< cadena.length() && resp){
                if(cadena.charAt(i)=='(')
                    pila1.push(cadena.charAt(i));
                else if(cadena.charAt(i)==')')
                        try{
                            pila1.pop();
                        }catch (Exception e){
                            resp=false;
                        }
                i++;
           }
        }
        
        return resp && pila1.isEmpty(); 
        
    }
    
    public boolean revisaSintaxis() {
        boolean resp=true;
        PilaA <Character> pila1 = new PilaA<Character> ();
        
        int cont=0;
        
        if(cadena!=null){
           int i=0;
           while(i< cadena.length() && resp){
                if(cadena.charAt(i)=='(')
                    pila1.push(cadena.charAt(i));
                else if(cadena.charAt(i)==')' && pila1.peek() == '(')
                        try{
                            pila1.pop();
                        }catch (Exception e){
                            resp=false;
                        }
                else if(cadena.charAt(i)=='[')
                    pila1.push(cadena.charAt(i));
                else if(cadena.charAt(i) == ']' && pila1.peek() == '[' ){
                    try{
                            pila1.pop();
                        }catch (Exception e){
                            resp=false;
                        }
                }
                else if(cadena.charAt(i)=='{')
                    pila1.push(cadena.charAt(i));
                else if(cadena.charAt(i) == '}' && pila1.peek() == '{'){
                    try{
                            pila1.pop();
                        }catch (Exception e){
                            resp=false;
                        }
                }
                
                i++;
           }
           
        }
        
        
        
        return resp && pila1.isEmpty(); 
        
    }
    
    }
    

   
    