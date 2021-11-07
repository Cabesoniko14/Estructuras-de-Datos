/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class Cardinalidad <T> {

    public Cardinalidad() {
    }
    
    public static PilaADT<ConjuntoADT> invertir(PilaADT<ConjuntoADT> pila){
        
        PilaADT<ConjuntoADT> aux = new PilaA();
        
        if (!pila.isEmpty())
            return invertir(pila, aux, pila.peek());
        else
            return pila;
    }

    
    private static PilaADT<ConjuntoADT> invertir (PilaADT<ConjuntoADT> pila, PilaADT<ConjuntoADT> aux, ConjuntoADT mayor){
        while(!pila.isEmpty()){
            if (pila.peek().getCardinalidad() > mayor.getCardinalidad())
                mayor = pila.peek();
            aux.push(pila.pop());
        }
            
        while ((!aux.isEmpty()) && (aux.peek().getCardinalidad() <= mayor.getCardinalidad()) ){
                if (aux.peek().equals(mayor))
                    aux.pop();
                else
                    pila.push(aux.pop());
        }
        aux.push(mayor);
        
        if (pila.isEmpty()){
            while(!aux.isEmpty())
                pila.push(aux.pop());
            return pila;
        }
        else
            return invertir(pila, aux, pila.peek());    
    }
}
 