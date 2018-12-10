package matrix;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class MatrizDiv {
    
    
    private int matrizA[][]; 
    private int matrizB[][];
    private int matrizC[][]; // A+B
    
    private int filas, columnas;
    private Scanner tec;
    
    //matrizA=new int [filas][columnas];
    //matrizB=new int [filas][columnas];

    public MatrizDiv(int[][] matrizA, int[][] matrizB, int[][] matrizC, int filas, int columnas) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.matrizC = matrizC;
        this.filas = filas;
        this.columnas = columnas;
    }
    
    
    public void IngresarDatos(){

        
        //ASIGNAMOS CANTIDAD DE FILAS Y COLUMNAS EN AMBAS MATRICES
        matrizA=new int [filas][columnas];
        matrizB=new int [filas][columnas];
        
        
        //DATOS MATRIZ A
        System.out.println("INGRESE LOS ELEMENTOS DE LA MATRIZ A: \n");
        for(int i=0; i<filas; i++){
            int f=i+1;
            for(int j=0; j<columnas; j++){
                int c=j+1;
                System.out.println("Igrese el elemento a"+ "["+f+","+c+"]" + "de la matriz A");
                //System.out.println("Ingrese el elemento a"+ "["+f+"]+"+"["+c+"]" +  " de la matriz A");
                matrizA[i][j]=tec.nextInt();
            }
        }
        //DATOS MATRIZ B
        System.out.println("INGRESE LOS ELEMENTOS DE LA MATRIZ B: \n");
        for(int i=0; i<filas; i++){
            int f=i+1;
            for(int j=0; j<columnas; j++){
                int c=j+1;
                System.out.println("Igrese el elemento a"+ "["+f+","+c+"]" + "de la matriz B");
                matrizB[i][j] = tec.nextInt();
            }
        }
    }
    
    public void Suma(){
        matrizC=new int[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                matrizC[i][j]=matrizA[i][j]/matrizB[i][j];
            }
        }
    }
    public void Imprimir(){
        System.out.println("SUMA DE LAS MATRICES (A+B): ");
        for(int h=0; h<filas; h++){
            System.out.println("");
            for(int g=0; g<columnas; g++){
                System.out.print(matrizC[h][g] + "  ");
            }
        }
        System.out.println("\n Elementos de la matriz C: \n");
        for(int i=0; i< filas; i++){
            int f=i+1;
                for(int j=0; j< columnas; j++){
                    int c = j+1;
                    System.out.println("Elemento c"+"["+f+","+c+"]"+ ": " + matrizC[i][j]);
                }
        }
    }
}