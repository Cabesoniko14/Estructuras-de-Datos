
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class Control {

    public Control() {
    }
    
    public static ConjuntoADT<Integer> multiplos(ConjuntoADT<Integer> enteros, int n){
        if(enteros == null)
            throw new RuntimeException("Conjunto null");
        
        else{
            ConjuntoADT<Integer> resp = new ConjuntoA();
            Iterator<Integer> it = enteros.iterator();
            return multiplos(enteros, resp, n, it);
        }
    }



    private static ConjuntoADT<Integer> multiplos(ConjuntoADT<Integer> enteros, ConjuntoADT<Integer> resp, int n, Iterator<Integer> it){
    if(it.hasNext()){
        int dato = it.next();
        if( (dato%n == 0) && dato <=999){
            resp.agrega(dato);
        }
        return multiplos(enteros, resp, n, it);
    }
    else
        return resp;
    }
    
}
