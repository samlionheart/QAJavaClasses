/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseloops;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class ExerciseLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //futureTuition(4);
        triangle(9);
    }

    private static void futureTuition(double years) {
        double tuition = 10000;
        double total = 10000;
        for (int i = 0; i < years; i++) {
            tuition = tuition * 1.05;
            total = total + tuition;
        }
        System.out.println("You will have to pay " + tuition + " on year " + years + ", your total tuition is " + total);
    }

    private static void triangle(double numtri) {
//        for (int i = 1; i <= numtri; i += 2) {
//            for (int k = 0; k < (4 - i / 2); k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(j+1);
//            }
//            System.out.println("");
//        }
        double numtri1 = numtri;
        for (int i = 1; i <= numtri1; i++) {
            int x;
            for (x = 0; x < numtri; x++) {
                System.out.print(" ");

            }
            numtri--;
            System.out.println(i);
        }
    }
    private static void passwordChecker(String p){
        if(
    }
}
