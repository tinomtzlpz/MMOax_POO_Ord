/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* AUTOR : P3RZIV4L */

package matrix;

//Se declaran las variables de mi matriz
public class MatrixSuma {
    private int[][] matrizA;
    private int[][] matrizB;
    
    //Este es el contructor de la clase
    public MatrixSuma(int[][] MatrizA, int[][] MatrizB){
        this.matrizA=MatrizA;
        this.matrizB=MatrizB;
    }
    
    // Inicializa la Matriz
    public void setMatrizA(int[][] MatrizA){
        this.matrizA=MatrizA;
    }
    
    
    public void setMatrizB(int[][] MatrizB){
        this.matrizA=MatrizB;
    }
    
    //Devuelve las matrices
    public int[][] getMatrizA(){
        return matrizA;
    }
    
    public int[][] getMatrizB(){
        return matrizB;
    }
    
    //Metodo Suma obtiene la longitud de la matriz
    public int[][] sumar() {
        int[][] matrizResultado;
        int filasA =matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB =matrizB.length;
        int columnasB = matrizB[0].length;

        // Imprime la Primera Matriz
        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        //Imprime la Segunda Matriz
        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        // Comprueba que sea una matrix cuadrada
        if (filasA==filasB && columnasB==columnasA) {

            matrizResultado = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
        }
        
        //Imprime el resultado
        System.out.println("Matriz resultado:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizResultado[i][j] + "   ");
            }
            System.out.println("");
        }
        return matrizResultado;
    }
}