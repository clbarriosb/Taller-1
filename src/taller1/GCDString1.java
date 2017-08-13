/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class GCDString1 {

    public static int method(int a) {
        int bin = (int) Math.pow(10, a - 1);
        return bin;
    }

    public static String createString(String n, int p) {
        for (int i = 0; i <= p; i++) {
            n = n + n;
        }
        return n;
    }

    public static void result(String h) {
        BigInteger numero = new BigInteger(h, 2);
        //System.out.println("int " + numero);
        System.out.println(numero);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int samples = scan.nextInt();
        int[] x = new int[samples];
        int[] y = new int[samples];
        for (int i = 0; i < samples; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        for (int i = 0; i < samples; i++) {
            int u = y[i];
            int o = x[i];
            if (x[i] % y[i] == 0 && x[i] >= y[i]) {
                int num = method(o);
                String binary = Integer.toString(num);
                int length = o / binary.length();
                String finalBinary = createString(binary, length);
                finalBinary = finalBinary.substring(0, o);
                result(finalBinary);
            } else {
                int num = method(u);
                String binary = Integer.toString(num);
                int length = u / binary.length();
                String finalBinary = createString(binary, length);
                finalBinary = finalBinary.substring(0, o);
                result(finalBinary);

            }
        }

    }
}
