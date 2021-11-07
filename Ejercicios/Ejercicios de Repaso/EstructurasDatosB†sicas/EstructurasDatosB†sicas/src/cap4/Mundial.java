
package cap4;

import java.io.File;
import java.util.Scanner;

/**
 * @author Silvia Guardati
 * Programa 4.5
 * Ejemplo de aplicación de arreglos para la solución de problemas.
 * Programa que calcula: a) el promedio de goles anotados por todos los equipos durante 
 * el último mundial de futbol, b) cuántos equipos anotaron menos goles que el promedio,
 * y c) total de equipos que anotaron 0 goles durante el mundial. 
 */
public class Mundial {
    
    private String sede;
    private int año;
    private final int TOTAL_PAÍSES = 32;
    private int goles[];

    // Se instancia el arreglo declarado como atributo
    public Mundial() {
        goles = new int[TOTAL_PAÍSES];
    }

    // Además de instanciar el arreglo, se le asignan valores a sede y año
    public Mundial(String sede, int año) {
        this();
        this.sede = sede;
        this.año = año;
    }    
    
    /* Se leen de un archivo los goles anotados por cada uno de los 32 equipos 
     * participantes. Si el archivo no puede abrirse, regresa false y al atributo
     * goles se le asigna null. 
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
    
    /* Se utiliza el método correspondiente de la clase OAE para calcular el 
     * promedio de goles anotados por los 32 equipos.
     */ 
    public double promedioDeGoles(){
        return OAE.calculaPromedio(goles, TOTAL_PAÍSES);
    }
    
    /* Se utiliza el método de OAE para obtener el total de equipos que anotaron menos
     * goles que el promedio.
     */
    public int cuentaMenosPromedio(double promGoles){
        return OAE.cuentaMenores(goles, TOTAL_PAÍSES, (int)promGoles);
    }
    
    // Se utiliza el método de OAE para contar cuántos equipos anotaron 0 goles.
    public int cuentaCeros(){
        return OAE.cuentaIguales(goles, TOTAL_PAÍSES, 0);
    }
        
    // Se prueban los métodos de la clase Mundial
    public static void main(String[] args) {
        Mundial último = new Mundial("Brasil", 2014);
        double promGoles;
        int totalEq;
        
        /* El archivo "Goles" se encuentra en el proyecto EstructurasDatosBásicas.
         * Si no se pudo leer el archivo sólo se imprime un mensaje adecuado.
         */
        if (último.leeGoles("Goles")) {
            promGoles = último.promedioDeGoles();
            System.out.println("\nPromedio de goles anotados en el último mundial: " + promGoles);
            
            totalEq = último.cuentaMenosPromedio(promGoles);
            System.out.println("Total de equipos que anotaron menos goles que el promedio: " + totalEq); 
        
            totalEq = último.cuentaCeros();
            System.out.println("Total de equipos que anotaron 0 goles: " + totalEq);
        }
        else
            System.out.println("\nError al leer el archivo.");
    }        
}
