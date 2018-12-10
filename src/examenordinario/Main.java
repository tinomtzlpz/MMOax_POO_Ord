/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenordinario;

import java.io.*;
import java.util.*;
import matrix.*;

//import package matrix;

public class Main {
    public Main(){
    
    }
    int[][] MatA={};
    int[][] MatB={};
    int[][] MatC= new int[4][4];;
    
    public void Matrices(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        int i,j=0,k=0;
        
        boolean m=true;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        MatA= new int[4][4];
        MatB= new int[4][4];
        
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            if(!cadena.isEmpty() && m){
                for(i=0;i<cadena.length();i++){
                    MatA[j][i]=((int)cadena.charAt(i))-48;
                }
                j++;
            }else if(!m){
                for(i=0;i<cadena.length();i++){
                    MatB[k][i]=((int)cadena.charAt(i))-48;
                }
                k++;
            }else{
                m=!m;
            }
        }
        b.close();
        
        
        
        for(i=0;i<MatA.length;i++){
            for(j=0;j<MatA[i].length;j++){
                System.out.print(MatA[i][j]);
            }
            System.out.print("\t");
            for(j=0;j<MatB[i].length;j++){
                System.out.print(MatB[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        Menu();
    }
    
    public void Menu() throws IOException{
        int op=0;
        
        while (op!= 5){
            System.out.println("*****Menu*****");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Division");
            System.out.println("4.- Multiplicacion");
            System.out.println("5.- Salir");

            op = new Scanner(System.in).nextInt();
            
            switch(op){
                case 1:
                    //Llamada a clase  Suma
                    MatrixSuma sum = new MatrixSuma(MatA,MatB);
                    sum.sumar();
                    
                    break;
                    
                case 2:
                    //Llamada a clase Resta
                    Resta res = new Resta(MatA,MatB);
                    res.restar();
                    
                    break;
                    
                case 3:
                    //Llamada a la clase de Division
                    MatrizDiv div = new MatrizDiv(MatA,MatB,MatC,4,4);
                    div.Suma();
                    div.Imprimir();
                    
                    break;
                    
                case 4:
                    //Llamada a clase Multiplicacion
                    Multiplicacion mul = new Multiplicacion();
                    mul.MatrizMultiplicacion(MatA, MatB);
                    
                    break;
                    
                case 5:
                    System.out.println("¡¡¡ADIOS!!!");
                    break;
                default:
                    System.out.println("Trata otra vez");

            }
        }
    }
    
}
