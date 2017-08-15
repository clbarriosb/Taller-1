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

    public static String method(int a, int b, int[] times, String bin, int i) {
//        System.out.println("i " + i);
        times[i] = a;
//        System.out.println("times[i] = " + times[i] + " i " + i);
        if (a % b == 0) {
            for (int j = 0; j < (a - 1); j++) {
                bin = bin + "0";
//                System.out.println(bin);
//                System.out.println("i " + i);
            }
        } else {
//            System.out.println("entre");
            int p = a % b;
            a = b;
            b = p;
            i = i + 1;
//            System.out.println("a " +a + " b " + b + " i " + i );
            return method(a, b, times, bin, i);
        }
//        System.out.println("hola");
        for (int q = i; q >= 0; q--) {
//            System.out.println("q " + q + " times " + times[q]);
            bin = createString(bin, times[q]);
        }

        return bin;
    }

    public static String createString(String n, int p) {
        double length = p / n.length();
//        System.out.println("p " + p + " length n " + n.length() + " length " + length);

        for (int i = 0; i < (Math.ceil(length)); i++) {
//            System.out.println("i " + i);
            n = n + n;
//            System.out.println(n);
        }
        n = n.substring(0, p);
//        System.out.println("n cut " + n);
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
        int[] times = new int[1000];
        String bin = "1";
        int m = 0;
        for (int i = 0; i < samples; i++) {
            int o = x[i];
            int u = y[i];
            if (x[i] >= y[i]) {
                String num = method(o, u, times, bin, m);
                result(num);
            }
        }

    }
}
