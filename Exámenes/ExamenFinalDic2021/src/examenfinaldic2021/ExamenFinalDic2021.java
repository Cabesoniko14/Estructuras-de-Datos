
package examenfinaldic2021;

/**
 *
 * @author 
 */
public class ExamenFinalDic2021 {
    
    public static int cuentaPorTipo(Nodo<Planta> nodoEnlazado, String tipo){ // Aqui ya se contempla el caso de recibir un nodo de tipo distinto a platna
        if (tipo == null || nodoEnlazado == null)
            throw new RuntimeException("String o nodo null");
        else if (nodoEnlazado.getDato().getTipo() == null || nodoEnlazado.getDato() == null) // Creó una planta pero sin dar parámetros
            return 0;
        else
            return cuentaPorTipo(nodoEnlazado, tipo, 0);
    
    }
    
    private static int cuentaPorTipo(Nodo<Planta> apunt, String tipo, int cont){
        if (apunt == null)
            return cont;
        else{
            if(apunt.getDato().getTipo().equalsIgnoreCase(tipo))
                return cuentaPorTipo(apunt.getDirec(), tipo, cont +1);
            else
                return cuentaPorTipo(apunt.getDirec(), tipo, cont);
                
        
        }
    
    }

    
    public static void main(String[] args) {
        
        // Prueba 1. Hay incidencias
        
        Nodo<Planta> n1 = new Nodo(new Planta("rosa", "espinas"));
        Nodo<Planta> n2 = new Nodo(new Planta("rosa", "lisa"));
        Nodo<Planta> n3 = new Nodo(new Planta("girasol", "espinas"));
        Nodo<Planta> n4 = new Nodo(new Planta("tulipanes", "lisa"));
        Nodo<Planta> n5 = new Nodo(new Planta("bayas", "espinas"));
        Nodo<Planta> n6 = new Nodo(new Planta());
        
        n1.setDirec(n2);
        n2.setDirec(n3);
        n3.setDirec(n4);
        n4.setDirec(n5);
        System.out.println(cuentaPorTipo(n1, "espinas"));
        
        // Prueba 2. No hay incidencias
        System.out.println(cuentaPorTipo(n1, "marina"));
        
        // Prueba 3. Busca en un nodoEnlazado con una planta sin atributos
        System.out.println(cuentaPorTipo(n6, "espinas"));
        
        // Prueba 4. Recibe un string null
        //System.out.println(cuentaPorTipo(n1, null));
        
        // Prueba 5. Recibe null en el nodoEnlazado
        // System.out.println(cuentaPorTipo(null, "espinas"));
    }
    
    
}
