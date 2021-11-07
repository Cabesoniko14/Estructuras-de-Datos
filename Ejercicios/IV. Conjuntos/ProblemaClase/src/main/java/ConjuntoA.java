/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author javi
 */
public class ConjuntoA <T> implements ConjuntoADT<T> {
    
    private T[] elementos;
    private int cardinalidad;
    private final int MAX = 50;

    public ConjuntoA() {
        elementos = (T[]) new Object[MAX];
        cardinalidad = 0;
    }
    
    public ConjuntoA(int maximo) {
        elementos = (T[]) new Object[maximo];
        cardinalidad = 0;
    }

    @Override
    public boolean agrega(T nuevo) {
        boolean resp = false;
        
        if (!contiene(nuevo)){
            if (cardinalidad == elementos.length)
                expande();
            elementos[cardinalidad] = nuevo;
            cardinalidad++;
            resp = true;    
        }
        return resp;
    }
    
    private void expande(){ 
        T[] masGrande = (T[]) new Object[elementos.length*2];
        for (int i = 0; i < cardinalidad; i++)
            masGrande[i] = elementos[i];
        elementos = masGrande;
    }

    @Override
    public T quita(T dato) {
        int pos;
        
        pos = buscaElemento(dato, 0);
        
        if (pos >= 0){
            T eliminado = elementos[pos];
            elementos[pos] = elementos[cardinalidad -1];
            cardinalidad--;
            return eliminado;
        }
        else
            throw new RuntimeException("Dato no encontrado");
    }
    

    
    private int buscaElemento(T dato, int i){
        if(i == cardinalidad)
            return -1;
        else{
            if (dato.equals(elementos[i]))
                return i;
            else
                return buscaElemento(dato, i+1);
        }
    }

    @Override
    public boolean contiene(T dato) {
        return buscaElemento(dato, 0) >= 0;
    }
    
    

    @Override
    public int getCardinalidad() {
        return cardinalidad;
    }

    @Override
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        ConjuntoADT<T> union = new ConjuntoA();
        Iterator<T> it = otro.iterator();
        
        for (int i = 0; i < cardinalidad; i++)
            union.agrega(elementos[i]);
        while(it.hasNext())
            union.agrega(it.next());
        
        return union;
    }
    
   //public ConjuntoADT<T> unionR(ConjuntoADT<T> otro) {
     //   if (otro == null)
       //     throw new RuntimeException("xd");
        //ConjuntoADT<T> union = new ConjuntoA(); 
        //return union2(otro, union, 0);
    //}
    
    //private ConjuntoADT<T> unionR(ConjuntoADT<T> otro, ConjuntoADT<T> union, int i){
      //  Iterator<T> it = otro.iterator();
        // if (i == cardinalidad){
          //  while (it.hasNext())
           //     union.agrega(it.next());
          //  return union;          
     //   }
     
     //   else{
        //    union.agrega(elementos[i]);
       //     return union2(otro, union, i+1);
       // }
   // }
    
    //public ConjuntoADT<T> unionR2(ConjuntoADT<T> otro) {
     //   if (otro == null)
       //     throw new RuntimeException("xd");
        //ConjuntoADT<T> union = new ConjuntoA(); 
        //union2(otro.iterator(), union);
       //union2(otro.iterator(), union);
       //union2(this.iterator(), union);
    // return union;
    
    //}
    
    //private void unionR2(Iterator<T> it, ConjuntoADT<T> conj){
      //  Iterator<T> it = otro.iterator();
        // if (i == cardinalidad){
          //  while (it.hasNext())
           //     union.agrega(it.next());
          //  return union;          
     //   }
     
     //   else{
        //    union.agrega(elementos[i]);
       //     return union2(otro, union, i+1);
       // }
   // }
    
    

    @Override
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro) {
        if (otro == null)
            throw new RuntimeException("xd");
        ConjuntoADT<T> inter = new ConjuntoA();
        
        if (cardinalidad < otro.getCardinalidad())
            interseccion(this.iterator(), otro, inter);
        else
            interseccion(otro.iterator(), this, inter);
        return inter;
            
        
    }
    public void interseccion(Iterator<T> it, ConjuntoADT<T> conj, ConjuntoADT<T> inter){
        if(it.hasNext()){
            T dato = it.next();
            if (conj.contiene(dato))
                inter.agrega(dato);
            interseccion(it, conj, inter);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorArreglo(elementos, cardinalidad);
    }

    @Override
    public boolean vacio() {
        return cardinalidad == 0;
    }

    @Override
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro) {
        if (otro == null)
            throw new RuntimeException("xd");
        ConjuntoADT<T> difer = new ConjuntoA();
        diferencia(this.iterator(), otro, difer);
        return difer;
            
        
    }
    
    public void diferencia(Iterator<T> it, ConjuntoADT<T> conj, ConjuntoADT<T> difer){
        if(it.hasNext()){
            T dato = it.next();
            if (!(conj.contiene(dato)))
                difer.agrega(dato);
            diferencia(it, conj, difer);
        }
    }
    
    public String toString(){
        return toString(0, new StringBuilder());
    }
    
    private String toString(int i, StringBuilder sB){
        if (i == cardinalidad)
            return sB.toString();
        else{
            sB.append(elementos[i]).append(" ");
            return toString(i+1, sB);    
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConjuntoA<?> other = (ConjuntoA<?>) obj;
        if (this.cardinalidad != other.cardinalidad) {
            return false;
        }
        if (this.MAX != other.MAX) {
            return false;
        }
        if (!Arrays.deepEquals(this.elementos, other.elementos)) {
            return false;
        }
        return true;
    }
    
    


    
    
}
