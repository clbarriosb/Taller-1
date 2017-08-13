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
        while (testCases < 1 && testCases > 100) {
            testCases = scan.nextInt();
        }
        int[] n = new int[testCases];
        int[][] array = new int[testCases][100000];
        for (int i = 0; i < testCases; i++) {
            n[i] = scan.nextInt();
            while (n[i] < 1 && n[i] > 100000) {
                n[i] = scan.nextInt();
            }
            for (int j = 0; j < n[i]; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        int[][] nuevo = new int[testCases][100000];
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < n[i]; j++) {
                nuevo[i][array[i][j]] = j + 1;
            }
        }
        for (int i = 0; i < testCases; i++) {
            for (int j = 1; j < (n[i] + 1); j++) {
                if (array[i][j - 1] != nuevo[i][j]) {
                    System.out.println("not inverse");
                    break;
                } else if (j == n[i]) {
                    System.out.println("inverse");
                }

            }

        }

    }

}
