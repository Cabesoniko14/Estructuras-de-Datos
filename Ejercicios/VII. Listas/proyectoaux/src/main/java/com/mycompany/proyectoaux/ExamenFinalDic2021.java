
package com.mycompany.proyectoaux;

/**
 *
 * @author 
 */
public class ExamenFinalDic2021 {
    
    public static int cuentaPorTipo(Nodo<Planta> nodoEnlazado, String tipo){ // Aqui ya se contempla el caso de recibir un nodo de tipo distinto a platna
        if (tipo == null)
            throw new RuntimeException("Dato null");
        else
            return cuentaPorTipo(nodoEnlazado, tipo, 0);
    
    }
    
    private static int cuentaPorTipo(Nodo<Planta> apunt, String tipo, int cont){
        if (apunt == null) // Aquí se contempla el caso en el que el nodo es null, o sea no hay incidencias con el tipo
            return cont;
        else{
            if(apunt.getDato().getTipo().equalsIgnoreCase(tipo))
                return cuentaPorTipo(apunt, tipo, cont +1);
            else
                return cuentaPorTipo(apunt, tipo, cont);
                
        
        }
    
    }

    
    public static void main(String[] args) {
        
        // Prueba 1. Hay elementos del tipo buscado en los nodos enlazados
        
        Nodo<Planta> n1 = new Nodo(new Planta("rosa", "espinas"));
        Nodo<Planta> n2 = new Nodo(new Planta("rosa", "lisa"));
        Nodo<Planta> n3 = new Nodo(new Planta("girasol", "espinas"));
        Nodo<Planta> n4 = new Nodo(new Planta("tulipanes", "lisa"));
        Nodo<Planta> n5 = new Nodo(new Planta("bayas", "espinas"));
        
        n1.setDirec(n2);
        n2.setDirec(n3);
        n3.setDirec(n4);
        n4.setDirec(n5);
        System.out.println(cuentaPorTipo(n1, "espinas"));
    }
    
}
