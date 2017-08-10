/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class ListaInversa {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int [] n = new int [testCases];
        int [][] array = new int[testCases][100000];
        for (int i=0; i<testCases; i++){
            n[i]=scan.nextInt();
            for (int j=0; j<n[i]; j++){
                array[i][j] = scan.nextInt();
            }
        }
        int[][] nuevo= new int [testCases][100000];
        for (int i=0; i<testCases; i++){
            System.out.println("i" + i);
            for (int j=0; j< n[i]; j++){
                System.out.println("j" + j);
                nuevo[i][array[i][j]]=j+1;
                System.out.println(array[i][j]);
                System.out.println(nuevo[i][array[i][j]]);
            }
        }
        
        
        for (int i=0; i<testCases; i++){
            int p=0;
            for (int j=1; j<(n[i] +1); j++){
                if (array[j][i]==nuevo[i][j]){
                    p=p+1;
                }
            }
            if (p==)
        }
        
        
    }
    
}
