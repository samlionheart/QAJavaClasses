/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1tutorialpart2;

import java.util.*;

/**
 *
 * @author Administrator
 */

public class Day1TutorialPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Scanner userInput = new Scanner(System.in);
         *
         * int k = 0;
         *
         * while (k < 10) {
         * System.out.println("Enter a number greater than or equal to 10");
         * k = userInput.nextInt();
         * if (k >= 10) { break; } }*
         */
        //promptWithFor();
        //
        //promptWithFor2();
        //timesTable(10, 7);
        //timesTable2(5,10);

        randomLotteryNumber();

    }

    private static void randomLotteryNumber() {
        int[] items = new int[6];
        for (int i = 0; i < items.length; i++) {
            int x = randomLotteryNumber(50);
            while (x == 0) {//no zeros
                x = randomLotteryNumber(50);
            }
            //avoid duplicates
            if (!hasDuplicates(items, x)) {
                items[i] = x;
            }
            System.out.println(x);
        }
    }

    private static boolean hasDuplicates(int[] items, int x) {
        //return Arrays.asList(items).contains(x);
        boolean isDuplicate = false;
        for (int i : items) {
            if ((i == x)) {
              isDuplicate = true;
            }
        }
        return isDuplicate;
    }

    private static void timesTable(int end, int start) {
        for (int n = 0; n <= end; n++) {
            System.out.println(n + " x " + start + " = " + (n * start));
        }
    }

    private static void timesTable2(int start, int end) {
        for (int i = 1; i <= start; i++) {
            for (int j = 1; j <= end; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }

        }
    }

    private static int randomLotteryNumber(int max) {
        return (int) (Math.random() * max);
    }

    private static void promptWithFor() {
        int k;
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Enter a number greater than or equal to 10");
            k = userInput.nextInt();
        } while (k < 10);
    }

    private static void checkDuplicates(int[] items, int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
