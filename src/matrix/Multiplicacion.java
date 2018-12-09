/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Oscar Dolores Ramirez
 */
public class Multiplicacion {
    
    public void MatrizMultiplicacion(int a[][],int b[][]){
     int  tam=a.length;
       int resultado[][]=new int[tam][tam];
       
       if(a.length==b.length){
          for(int i=0;i<a.length;i++){
             for(int j=0;j<b[i].length;j++){
               for(int k=0;k<b.length;k++){
                  resultado[i][j]+=a[i][k]*b[k][j];
             }
          } 
       }
       }else{
       System.out.println("Las dos matrices no tienen el mismo tamaño");
       }
       
       //Se imprime la matriz
       if(a.length==b.length){
       System.out.println("la matriz resultante es ");
       
             for(int i=0;i<resultado.length;i++){
                 for(int j=0;j<resultado[i].length;j++){
                    System.out.print(resultado[i][j]+" ");
                 }
                 System.out.println();
             }
       } 
    }
}
