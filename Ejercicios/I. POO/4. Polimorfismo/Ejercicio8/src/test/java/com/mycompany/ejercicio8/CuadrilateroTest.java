/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javi
 */
public class CuadrilateroTest {
    
    public CuadrilateroTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    /**
     * Test of calculaArea method, of class Cuadrilatero.
     */
    @org.junit.jupiter.api.Test
    public void testCalculaArea() {
        System.out.println("calculaArea");
        Cuadrilatero instance = new Cuadrilatero(2,2,2,2);
        double expResult = 4.0;
        double result = instance.calculaArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calculaPerimetro method, of class Cuadrilatero.
     */
    @org.junit.jupiter.api.Test
    public void testCalculaPerimetro() {
        System.out.println("calculaPerimetro");
        Cuadrilatero instance = new Cuadrilatero(2,2,2,2);
        double expResult = 8.0;
        double result = instance.calculaPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    public class CuadrilateroImpl extends Cuadrilatero {
    }
    
}
