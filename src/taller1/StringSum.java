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
public class StringSum {

    public static void main(String[] args) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] cadena = input.toCharArray();
        int n = input.length();

        int suma = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 26; j++) {

                if (cadena[i] == alfabeto[j]) {
                    suma = j + 1 + suma;

                }
            }
        }
        System.out.println(suma);
    }

}
