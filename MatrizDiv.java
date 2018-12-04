
import javax.swing.JOptionPane;

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
    
    
    //int matriza[][]=new int[4][4];

    private int filas;
    private int columnas;
    private int matrizA[][]=new int[filas][columnas];
    private int matrizB[][]=new int[filas][columnas];
    private int matrizRes[][]=new int[filas][columnas];
    
    
    public void Div(){
        System.out.println("Division de las dos matrices:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matrizRes[i][j]=matrizA[i][j]/matrizB[i][j];                            
                System.out.print(matrizRes[i][j]+" ");
                }
            System.out.println();
        }
    }
    
}