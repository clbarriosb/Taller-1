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
public class GCDString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int samples = scan.nextInt();
        //System.out.println("sample " + samples);
        int[] x = new int[samples];
        int[] y = new int[samples];
        for (int i = 0; i < samples; i++) {
                x[i] = scan.nextInt();
                y[i] = scan.nextInt();
            //System.out.println("x " + x[i] + " y " + y[i] );
        }
        
        int binario;

        for (int i = 0; i < samples; i++) {
            if (x[i] % y[i] == 0) {
                binario = (int) Math.pow(10,(x[i] - 1));
                //System.out.println("binario " + binario);
            } 
            else {
                int nuevo = x[i] % y[i];
                //System.out.println("xi " + x[i] + "nuevo " + nuevo + " binario " + binario);
                if (nuevo %2 ==0){
                    binario = (int) Math.pow(10,(x[i] - 1));
                    //System.out.println("binario 1 " + binario);
                    for (int j = 1; j < (x[i] / 2); j++) {
                        binario = (int) (Math.pow(10,(x[i] - 2*j -1)) + binario);
                        //System.out.println("binario for " + binario);
                    } 
                    //System.out.println("binario " + binario);
                }
                else{
                    binario = (int) Math.pow(10,(x[i] - 1));
                    for (int j = 1; j < ((int)(x[i] / 2)); j++) {
                         binario = (int) (Math.pow(10,(x[i] - 2*j -1)) + binario);
                    }
                    binario = binario + 1;
                }
            }
            String bin = Integer.toString(binario);
            //System.out.println("string " + bin);
            int numero =Integer.parseInt(bin, 2);
            //System.out.println("int " + numero);
            System.out.println(numero);
        }
    }
}
