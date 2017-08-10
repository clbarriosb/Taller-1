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
public class Taller1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int test = scan.nextInt();
        int[] arrayTest = new int[n];
        for (int j = 0; j < test; j++) {
            arrayTest[j] = scan.nextInt();
        }

        for (int j = 0; j < test; j++) {
            int app = 0;
            for (int i = 0; i < n; i++) {
                if (arrayTest[j] == array[i]) {
                    app = app + 1;
                }
            }
            if (app == 0) {
                System.out.println("NOT PRESENT");
            } else {
                System.out.println(app);
            }
        }
    }

}
