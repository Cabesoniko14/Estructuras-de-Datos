/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class Hanoi {
    
    public static void torresHanoi(int n, String tOrigen, String tAux, String tDestino){
        if (n==1){
            System.out.println("Mover 1 disco de " + tOrigen + " a " + tDestino);
        }
        else{
            torresHanoi(n-1, tOrigen, tDestino, tAux);
            System.out.println("Mover 1 disco de " + tOrigen + " a " + tDestino);
            torresHanoi(n-1, tAux, tOrigen, tDestino);
        }
    }
    
    public static void main(String[] args) {
       torresHanoi(3, "origen", "auxiliar", "destino");
    }
    
}
