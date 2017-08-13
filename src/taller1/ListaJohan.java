/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Carmen_Lucia3
 */
public class ListaJohan {
    public static void processTests(){
        Scanner reader=new Scanner(System.in);
        int numOfTests=reader.nextInt();
        for(int i=0;i<numOfTests;i++){
            testInverseList();
        };
    };
    public static void testInverseList(){
        Scanner reader=new Scanner(System.in);
        int sizeOfList=reader.nextInt();
        ArrayList<Integer> receivedList=new ArrayList<Integer>();
        ArrayList<Integer> inverseList=new ArrayList<Integer>();
        String inverse="inverse";
        
        for(int i=0;i<sizeOfList;i++){
            if(i==0){
                for(int i1=0;i1<sizeOfList;i1++){
                  inverseList.add(i,i);  
                };
            };
            int pos=reader.nextInt();
            receivedList.add(i,pos);
            inverseList.remove(pos-1);
            inverseList.add(pos-1,i+1);  
        };
        for(int i=0;i<inverseList.size();i++){
          if(receivedList.get(i)!=inverseList.get(i)){
              inverse="not inverse";
              i=inverseList.size();
          };
        };
        System.out.println(inverse);
    };
    public static void main(String[] args){
        processTests();
    };
};
    

