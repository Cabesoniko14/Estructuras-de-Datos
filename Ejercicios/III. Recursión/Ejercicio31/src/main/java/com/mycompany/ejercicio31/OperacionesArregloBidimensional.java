/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio31;

/**
 *
 * @author javi
 */
public class OperacionesArregloBidimensional {
    
    public static double sumaRenglon(double[][] arreB, int ren, int totCol){ // El renglón se ingresa empezando a contar desde 0
        if (ren <0 || totCol <=0)
            throw new RuntimeException("Datos incorrectos");
        return sumaRenglon(arreB, ren, totCol, 0);
    
    }
    
    // Inciso 1) Sumar por renglón
    
    private static double sumaRenglon(double[][] arreB, int ren, int totCol, double suma){
        if (totCol == 1){
            suma += arreB[ren][totCol-1];
            return suma;
        }
        else{
            suma += arreB[ren][totCol-1];
            return sumaRenglon(arreB, ren, totCol-1, suma);
        }
    }
    
    // Inciso 2) Sumar por columna
    
    public static double sumaColumna(double[][] arreB, int col, int totRen){
        if (col < 0 || totRen <= 0)
            throw new RuntimeException("Datos incorrectos");
        return sumaColumna(arreB, col, totRen, 0);
    }
    
    private static double sumaColumna(double[][] arreB, int col, int totRen, double suma){
        if (totRen == 1){
            suma += arreB[totRen-1][col];
            return suma;
        
        }
        else{
            suma += arreB[totRen-1][col];
            return sumaColumna(arreB, col, totRen-1, suma);
        }
    
    }
    
    // Inciso 3) toString
    
    public static String toString(double[][] arreB, int totFilas, int totCol){
        if (totCol <= 0 || totFilas <= 0)
            throw new RuntimeException("Datos incorrectos");
        return toString(arreB, totFilas, totCol, 0, 0, new StringBuilder());
    
    }
    
    private static String toString(double[][] arreB, int totFilas, int totCol, int f, int c, StringBuilder cad){
        
        if (f < totFilas){
            if (c < totCol){
                cad.append(arreB[f][c]).append("");
                return toString(arreB, totFilas, totCol, f, c+1, cad);
            }
            else{
                cad.append("\n"); // Para pasar al siguiente renglón en la impresión
                return toString(arreB, totFilas, totCol, f+1, 0, cad);
            
            }
        }
        else
            return cad.toString();    
    }
    
    // Inciso 4) Método para sumar la diagonal
    
    public static double sumaDiagonalPrincipal(double[][] arreB, int totFilas, int totCol){
        if ((totCol <= 0 || totFilas <= 0) || (totFilas != totCol))
            throw new RuntimeException("Datos incorrectos");
        return sumaDiagonalPrincipal(arreB, totFilas, 0, 0);
    }
    
    private static double sumaDiagonalPrincipal(double[][] arreB, int totFC, int i, double sumaDiagonal){
        if (i < totFC){
            sumaDiagonal += arreB[i][i];
            return sumaDiagonalPrincipal(arreB, totFC, i+1, sumaDiagonal);
        }
        else
            return sumaDiagonal;
    }
    
    // Inciso 5) Suma de matrices
    
    public static double[][] sumaMatrices(double[][] mat1, double[][] mat2, int totFil1, int totCol1, int totFil2, int totCol2){
        if (!((totFil1 == totFil2 && totCol1 == totCol2) && ((totCol1 > 0))&&(totFil1 > 0)))
            throw new RuntimeException ("Datos incorrectos");
        else{
            double[][] matRes = new double[totFil1][totCol1];
            return sumaMatrices(mat1, mat2, totFil1, totCol1, 0, 0, matRes);
        }
    }
    
    private static double[][] sumaMatrices(double[][] mat1, double[][] mat2, int totFil, int totCol, int f, int c, double[][] matRes){
        if (f < totFil ){
            if (c < totCol){
                matRes[f][c] = mat1[f][c] + mat2[f][c];
                return sumaMatrices(mat1, mat2, totFil, totCol, f, c+1, matRes);            
            }
            else
                return sumaMatrices(mat1, mat2, totFil, totCol, f+1, 0, matRes);
        
        }
        else
            return matRes;
    }
    
    // Inciso 6) Multiplicación de matrices
    
    public static double[][] multMatrices(double[][] mat1, double[][] mat2, int totFil1, int totCol1, int totFil2, int totCol2){
        if ((totCol1 != totFil2) || (!((totCol1 > 0))&&(totCol2 > 0)&&(totFil1 > 0)&&(totFil2 >0)))
            throw new RuntimeException("Datos incorrectos");
        else{
            double[][] matRes = new double[totFil1][totCol2];
            return multMatrices(mat1, mat2, totFil1, totCol1, totCol2, 0, 0, matRes);      
        }
    
    }
    
    private static double[][] multMatrices(double[][] mat1, double[][] mat2, int totFil1, int totCol1, int totCol2, int f1, int c2, double[][] matRes){
        if (f1 < totFil1){
            if (c2 < totCol2){
                matRes[f1][c2] = elementoMult(mat1, mat2, f1, c2, totCol1, 0, 0);
                return multMatrices(mat1, mat2, totFil1, totCol1, totCol2, f1, c2+1, matRes);
            }
            else
                return multMatrices(mat1, mat2, totFil1, totCol1, totCol2, f1+1, 0, matRes);
        }
        else
            return matRes;
    
    }
    
    private static double elementoMult(double[][] mat1, double[][] mat2,  int f1, int c2, int totCol1, int i, double suma){
        if (i<totCol1){
            suma += (mat1[f1][i]*mat2[i][c2]);
            return elementoMult(mat1, mat2, f1, c2, totCol1, i+1, suma);
        }
        else
            return suma; 
    }
     
    
    // ---------------- MAIN ---------------
    
    public static void main(String[] args) {
        double[][] mat1 = {{3.5, 4.2},{8.6, 10}}; //Cada juego de llavas interior es un renglón
        System.out.println("\nPrueba 1.1: " + OperacionesArregloBidimensional.sumaRenglon(mat1, 0, mat1[1].length));
        System.out.println("\nPrueba 2.1: " + OperacionesArregloBidimensional.sumaColumna(mat1, 0, mat1.length));   
    }
    
 
    
}
