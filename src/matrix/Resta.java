/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author ARKEONIS
 */
public class Resta {
    private int[][] b;
    private int[][] a;
    
    public Resta(int[][] a, int[][] b){
        this.a=a;
        this.b=b;
    }
    
    public int[][] restar() {
        int[][] c;
            c = new int[a.length][a[0].length];
            for (int x = 0; x < a.length; x++) {
                for (int y = 0; y < a[0].length; y++) {
                    c[x][y] = a[x][y] - b[x][y];
                }
            }
        System.out.println("Resultado:");
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[0].length; y++) {
                System.out.print(c[x][y] + "\t");
            }
            System.out.println("");
        }
        return c;
    }
}

