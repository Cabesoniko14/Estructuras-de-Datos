
package segundoparcialednov2021_g1;

import java.util.Iterator;

/**
 *
 * @author Javier Nieto Merodio
 */
public class SegundoParcialEDnov2021_G1 {

    public SegundoParcialEDnov2021_G1() {
    }
    
    
    // PREGUNTA 1
    
    public static boolean analizaCola(ColaADT<Object> original, int n){
        
        if(original.estaVacia() || original == null)
            throw new RuntimeException("Cola null o vacía");
        
        int i = 0;
        boolean bandera;
        ColaADT<Object> aux = new ColaA();
        
        while(i == 0 && (!(original.estaVacia()))){
            if(((Integer)original.consultaPrimero()%n) != 0)
                i = 1;
            else
                aux.agrega(original.quita());
            
        }
        if (original.estaVacia())
            bandera = true;
        else{
            bandera = false;
            while(!original.estaVacia())
                aux.agrega(original.quita());
        }
        while(!aux.estaVacia())
            original.agrega(aux.quita());
        
        return (bandera && i==0);
        
    
    }
    
    // PREGUNTA 2. INCISO 1
    
    public static int calculaTotalNinioConDispositivo(ConjuntoADT<Ninio> cel, ConjuntoADT<Ninio> tablet, ConjuntoADT<Ninio> compu){
        if ((cel == null || tablet == null || compu == null))
            throw new RuntimeException("Conjunto null");
        ConjuntoADT<Ninio> unDisp = new ConjuntoA(); // los conjuntos no repiten elementos, entonces se meten aqui todos los niños que tienen al menos un dispositivo
        unDisp = cel.union(tablet).union(compu);
        return unDisp.getCardinalidad();
    
    }
    
    // PREGUNTA 2. INCISO 2
    
    public static boolean  hayPorLoMenos(ConjuntoADT<Ninio> cel, ConjuntoADT<Ninio> tablet, ConjuntoADT<Ninio> compu, int numNinios, int edad){
        if (cel == null || tablet == null || compu == null)
            throw new RuntimeException("Conjunto null");
        else if(numNinios <= 0)
            throw new RuntimeException("Número de niños no coherente");
        else if((cel.getCardinalidad() == 0 || compu.getCardinalidad() == 0) || tablet.getCardinalidad() == 0)
            return false;
        else{
            ConjuntoADT<Ninio> inter = new ConjuntoA();
            inter = cel.interseccion(compu).interseccion(tablet);
            Iterator<Ninio> it = inter.iterator();
            return hayPorLoMenos(it, numNinios, edad, 0);
        }
    }
    
    private static boolean hayPorLoMenos(Iterator<Ninio> it, int numNinios, int edad, int cont){
        if(!(it.hasNext()) || (cont == numNinios))
            return cont >= numNinios;
        else {
            if(it.next().getEdad() < edad)
                return hayPorLoMenos(it, numNinios, edad, cont + 1);
            else
                return hayPorLoMenos(it, numNinios, edad, cont);
        }
    }

    
    public static void main(String[] args) {
        
        // PREGUNTA 1. Prueba 1: cola con los múltiplos
        
        ColaADT<Object> colita = new ColaA();
        colita.agrega(2);
        colita.agrega(4);
        colita.agrega(6);
        colita.agrega(8);
        colita.agrega(10);
        colita.agrega(120);
        //System.out.println(colita.toString());
        
        //System.out.println(analizaCola(colita, 2));
        
        //System.out.println(colita.toString());
        
        // PREGUNTA 1. Prueba 2: cola en la que no todos son múltiplos
        
        ColaADT<Object> colita2 = new ColaA();
        colita2.agrega(2);
        colita2.agrega(4);
        colita2.agrega(6);
        colita2.agrega(3);
        colita2.agrega(10);
        colita2.agrega(120);
        //System.out.println(colita2.toString());
        
        //System.out.println(analizaCola(colita2, 2));
        
        //System.out.println(colita2.toString());
        
        // PREGUNTA 1. Prueba 3: cola en la que el último no es múltiplo 
        
        ColaADT<Object> colita3 = new ColaA();
        colita3.agrega(2);
        colita3.agrega(4);
        colita3.agrega(6);
        colita3.agrega(8);
        colita3.agrega(10);
        colita3.agrega(121);
        //System.out.println(colita3.toString());
        
        //System.out.println(analizaCola(colita3, 2));
        
        //System.out.println(colita3.toString());
        
        // PREGUNTA 1. Prueba 4: cola en la que el primer elemento no es múltiplo 
        
        ColaADT<Object> colita4 = new ColaA();
        colita4.agrega(3);
        colita4.agrega(4);
        colita4.agrega(6);
        colita4.agrega(8);
        colita4.agrega(10);
        colita4.agrega(120);
        //System.out.println(colita4.toString());
        
        //System.out.println(analizaCola(colita4, 2));
        
        //System.out.println(colita4.toString());
        
        // PREGUNTA 1. Prueba 5: cola null
        
        //ColaADT<Object> colita5 = null;
        //System.out.println(analizaCola(colita5, 2));
        
        // PREGUNTA 1. Prueba 6: cola vacía
        
        //ColaADT<Object> colita6 = new ColaA();
        
        //System.out.println(multiplos(colita6, 2));
        
        // PREGUNTA 1. Prueba 7: cola con  un elemento no int
        
        ColaADT<Object> colita7 = new ColaA();
        colita4.agrega(3);
        colita4.agrega(4);
        colita4.agrega(6);
        colita4.agrega("perro");
        colita4.agrega(10);
        colita4.agrega(120);
        
        //System.out.println(colita4.toString());
        
        //System.out.println(analizaCola(colita4, 2));
        
        //System.out.println(colita4.toString());
        
        // PREGUNTA 2.
        
        ConjuntoADT<Ninio> compu = new ConjuntoA();
        ConjuntoADT<Ninio> cel = new ConjuntoA();
        ConjuntoADT<Ninio> tablet = new ConjuntoA();
        
        compu.agrega(new Ninio("Javi", 15));
        compu.agrega(new Ninio("Laura", 10));
        compu.agrega(new Ninio("Pedro", 9));
        compu.agrega(new Ninio("Montse", 15));
        compu.agrega(new Ninio("Santi", 20));
        compu.agrega(new Ninio("Clau", 8));
        compu.agrega(new Ninio("Fer", 7));
        
        cel.agrega(new Ninio("Javi", 15));
        cel.agrega(new Ninio("Laura", 10));
        cel.agrega(new Ninio("Pedro", 9));
        cel.agrega(new Ninio("Ximena", 12));
        cel.agrega(new Ninio("Alvarito", 6));
        cel.agrega(new Ninio("Lara", 17));
        cel.agrega(new Ninio("Checo", 18));
        
        tablet.agrega(new Ninio("Javi", 15));
        tablet.agrega(new Ninio("Laura", 10));
        tablet.agrega(new Ninio("Pedro", 9));
        tablet.agrega(new Ninio("Checo", 18));
        tablet.agrega(new Ninio("Alvarito", 6));
        tablet.agrega(new Ninio("Juanmi", 18));
        tablet.agrega(new Ninio("Daniela", 19));
        tablet.agrega(new Ninio("Cami", 12));
        
        // PREGUNTA 2. INCISO 1. Prueba 1: resultado válido
        
        //System.out.println(calculaTotalNinioConDispositivo(cel, tablet, compu));
        
        // PREGUNTA 2. INCISO 1. Prueba 2: un conjunto null
         
        ConjuntoADT<Ninio> conjNull = null;
         
        //System.out.println(calculaTotalNinioConDispositivo(cel, tablet, conjNull));
        
        // PREGUNTA 2. INCISO 1. Prueba 3: un conjunto vacio
        
        ConjuntoADT<Ninio> conjVacio = new ConjuntoA();
        
        //System.out.println(calculaTotalNinioConDispositivo(cel, tablet, conjVacio));
        
        // PREGUNTA 2. INCISO 1. Prueba 4: un conjunto no de ninios
        
        ConjuntoADT<Integer> conjNum = new ConjuntoA();
        conjNum.agrega(1);
        
        // System.out.println(calculaTotalNinioConDispositivo(cel, tablet, conjNum));
        
        
        // PREGUNTA 2. INCISO 2. Prueba 1: resultado true. 
        
        System.out.println(hayPorLoMenos(cel, tablet, compu, 3, 16)); // Javi, Laura y Pedro
        
        // PREGUNTA 2. INCISO 2. Prueba 2: resultado false. 
        
        System.out.println(hayPorLoMenos(cel, tablet, compu, 3, 15)); // Hay dos menores a 15 pero no 3
        
        // PREGUNTA 2. INCISO 2. Prueba 3: numNinios no mayor a 0.
        
        //System.out.println(hayPorLoMenos(cel, tablet, compu, 0, 15));
        //System.out.println(hayPorLoMenos(cel, tablet, compu, -2, 15));
        
        // PREGUNTA 2. INCISO 2. Prueba 4: recibe un conjunto null.
        
        //System.out.println(hayPorLoMenos(cel, tablet, conjNull, 3, 15));
        
        // PREGUNTA 2. INCISO 2. Prueba 4: recibe un conjunto vacio.
        
        System.out.println(hayPorLoMenos(cel, tablet, conjVacio, 3, 15));
        
        
      
    }
    
}
