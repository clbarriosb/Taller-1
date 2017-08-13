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
public class ListaiInversa2 {

    public static void cadenas() {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases < 1 && testCases > 100) {
            testCases = scan.nextInt();
        }
        for (int i = 0; i < testCases; i++) {
            inverse();
        }
    }

    public static void inverse() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n < 1 && n > 100000) {
            n = scan.nextInt();
        }
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = scan.nextInt();
        }

        int[] nuevo = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("j" + j);
            System.out.println(array[j]);
            System.out.println(nuevo[array[j]]=j);
            nuevo[array[j]] = j + 1;
            
            
        }
        for (int j = 1; j < n + 1; j++) {
            System.out.print(nuevo[j]);
        }
        for (int j = 1; j < (n + 1); j++) {
                System.out.println("j " + j );
                System.out.print("array " + array[j - 1]);
               System.out.println(" nuevo " + nuevo[j]);
            if (array[j - 1] != nuevo[j]) {
                System.out.println("not inverse");
                break;
            } else {
                if ( j == n) {
                        System.out.println("inverse");
                    }
            }
        }
    }

    public static void main(String[] args) {
        cadenas();
    }
}
