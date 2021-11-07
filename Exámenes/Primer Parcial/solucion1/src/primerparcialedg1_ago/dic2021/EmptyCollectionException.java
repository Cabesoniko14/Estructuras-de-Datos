package primerparcialedg1_ago.dic2021;

/**
 * Clase para manejo de excepciones. se usará en las clases que
 * implementen colecciones.
 * @author Silvia Guardati 
 */
public class EmptyCollectionException extends RuntimeException{

    public EmptyCollectionException(){
        super("Colección vacía");
    }

    public EmptyCollectionException(String mensaje){
        super(mensaje);
    }

}
