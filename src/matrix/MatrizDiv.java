

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
    
     Scanner dato = new Scanner (System.in);
    private int MatrizA[][];
    private int MatrizB[][];
    private int MatrizResul[][];
    
    
    
    //CONSTRUCTOR
    public void MatrizDiv(int MatrizA[][], int MatrizB[][]){
        this.MatrizA=MatrizA;
        this.MatrizB=MatrizB;
    }
    
    
    public void LlenarMatrices(){
        int filaA =MatrizA.length;
        int columnaA = MatrizA[0].length;
        int filaB =MatrizB.length;
        int columnaB = MatrizB[0].length;
        System.out.println("Datos de la MATRIZ A: ");
        for (int i=0; i<filaA; i++) {
            for(int j=0; j<columnaA; j++){
                System.out.println("Escribir valor " + i + " , " + j + " : ");
                MatrizA [i][j]=dato.nextInt();
            }
        }
        
        System.out.println("DATOS DE LA MATRIZ B: " );
        for(int i=0; i<filaB; i++){
            for(int j=0; j<columnaB; j++){
                System.out.println("Escribir valor " + i + " , " + j + " : ");
                MatrizB [i][j]=dato.nextInt();
            }
        }
    }
    
    public void DivisionMatrices(){
        for (int i=0; i<=2; i++){
             for (int j=0; j<=2; j++){
                 MatrizResul [i][j]= MatrizA[i][j]/MatrizB[i][j];
                }
            }
    }
    
    public void imprimir(){
        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++) {
                System.out.print(MatrizResul[i][j] + " ");
            }
            System.out.println("");
            
        }
    }   
}