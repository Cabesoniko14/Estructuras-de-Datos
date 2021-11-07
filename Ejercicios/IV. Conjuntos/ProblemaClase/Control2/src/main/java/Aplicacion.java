/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Control test = new Control();
        ConjuntoADT<Integer> conj = new ConjuntoA();
        conj.agrega(1);
        conj.agrega(3);
        conj.agrega(6);
        conj.agrega(9);
        conj.agrega(10);
        System.out.println(test.multiplos(conj,3));
    }
    
}
