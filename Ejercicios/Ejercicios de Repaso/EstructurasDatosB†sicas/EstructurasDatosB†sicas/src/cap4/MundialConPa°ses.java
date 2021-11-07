package cap4;

import java.io.File;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 4.9
 * Ejemplo de aplicación de arreglos paralelos para la solución de problemas.
 * Esta clase es una ampliación de la clase Mundial (programa 4.5).
 * Funcionalidad de la clase: a) calcula el promedio de goles anotados por todos 
 * los equipos durante el último mundial de futbol, b) obtiene cuántos equipos 
 * anotaron menos goles que el promedio, c) proporciona los nombres de los equipos 
 * que anotaron 0 goles durante el mundial y d) da el nombre del equipo que anotó 
 * más goles. En algunos métodos se hace uso de la clase OAE.
 */
public class MundialConPaíses {
    
    private String sede;
    private int año;
    private final int TOTAL_PAÍSES = 32;
    private int goles[];
    private String nomPaíses[];

    // Se instancian los arreglos declarados en la sección de atributos
    public MundialConPaíses() {
        goles = new int[TOTAL_PAÍSES];
        nomPaíses = new String[TOTAL_PAÍSES];
    }

    public MundialConPaíses(String sede, int año) {
        this();
        this.sede = sede;
        this.año = año;
    }    
    
    /* Se leen de un archivo los goles anotados por cada uno de los 32 equipos 
     * participantes. Si el archivo no puede abrirse, regresa false.
     */
    public boolean leeGoles(String nomArch){ 
        int i;
        boolean resp = true;
        
        try{
            Scanner lee = new Scanner(new File(nomArch));
            i = 0;
            while (i < TOTAL_PAÍSES && lee.hasNext()){
                goles[i] = lee.nextInt();
                i = i + 1;
            }
            if (i < TOTAL_PAÍSES)
                resp = false;
            lee.close();
        }catch (Exception e){
            goles = null;
            resp = false;
        }
        return resp;
    }
    
    /* Se leen de un archivo los nombres de los 32 países participantes. 
     * Si el archivo no puede abrirse, regresa false.
     */
    public boolean leeNomPaíses(String nomArch){ 
        int i;
        boolean resp = true;
        
        try{
            Scanner lee = new Scanner(new File(nomArch));
            i = 0;
            while (i < TOTAL_PAÍSES && lee.hasNextLine()){
                nomPaíses[i] = lee.nextLine();
                i = i + 1;
            }
            if (i < TOTAL_PAÍSES)
                resp = false;
            lee.close();
        }catch (Exception e){
            nomPaíses = null;
            resp = false;
        }
        return resp;
    }
    
    // Se utiliza la clase OAE para obtener el promedio.
    public double promedioDeGoles(){
        return OAE.calculaPromedio(goles,TOTAL_PAÍSES);
    }
    
    /* Se utiliza la clase OAE para determinar cuántos equipos anotaron menos 
     * goles que el promedio.
     */
    public int cuentaMenosPromedio(double promGoles){
        return OAE.cuentaMenores(goles, TOTAL_PAÍSES, (int) promGoles);
    }
    
    // Obtiene los nombres de los países cuyos equipos no anotaron goles.
    public String obtieneEqConCeros(){
        int i;
        StringBuilder cad = new StringBuilder("\nNo anotaron goles los equipos de los países: ");
        
        for (i = 0; i < TOTAL_PAÍSES; i++)
            if (goles[i] == 0)
                cad.append(nomPaíses[i] + " - ");
        
        return cad.toString();
    }
    
    // Obtiene nombre del equipo que anotó más goles.
    public String obtieneNomMásGoles(){
        int pos;
        
        pos = OAE.buscaPosMayor(goles, TOTAL_PAÍSES);       
        return nomPaíses[pos];
    }
        
    // Se prueban los métodos de la clase MundialConPaíses.
    public static void main(String[] args) {
        MundialConPaíses último = new MundialConPaíses("Brasil", 2014);
        double promGoles;
        int totalEq;
        String nomPaíses, paísMásGoles;
        
        // Los archivos "Países" y "Goles" se encuentran en el proyecto EstructurasDatosBásicas.
        if (último.leeNomPaíses("Países") && último.leeGoles("Goles")) {
            // Calcula e imprime el promedio de goles.
            promGoles = último.promedioDeGoles();
            System.out.println("\nPromedio de goles anotados en el mundial: " + promGoles);

            // Obtiene e imprime el total de equipos que anotaron menos goles que el promedio.
            totalEq = último.cuentaMenosPromedio(promGoles);
            System.out.println("\nTotal de equipos que anotaron menos goles que el promedio: " + totalEq); 

            // Obtiene e imprime los nombres de los países que no anotaron goles.
            nomPaíses = último.obtieneEqConCeros();
            System.out.println(nomPaíses);

            // Obtiene e imprime el nombre del país que más goles anotó.
            paísMásGoles = último.obtieneNomMásGoles();
            System.out.println("\nPaís que más goles anotó: " + paísMásGoles);            
        }
        else
            System.out.println("\nError en la lectura de los archivos.\n");
    }        
}

